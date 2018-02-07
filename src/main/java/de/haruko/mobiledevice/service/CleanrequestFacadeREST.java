
package de.haruko.mobiledevice.service;

import de.haruko.mobiledevice.entity.Cleanrequest;
import de.haruko.mobiledevice.entity.IMobiledevice;
import de.haruko.mobiledevice.orderadapter.OrderQuery;
import de.haruko.mobiledevice.orderadapter.OrderQueryAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


public class CleanrequestFacadeREST  {


    @Path("byDeviceVariant")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cleanrequest> findByDeviceVariant(IMobiledevice device, EntityManager em) {
        OrderQuery query = new OrderQueryAdapter(device);
        Query q = em.createNativeQuery(query.getTaskListStatement(), Cleanrequest.class);
        SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
        Integer timeAsNum = Integer.parseInt(sdf.format(new Date()));
        
        q.setParameter(1, device.getId());
        q.setParameter(2, timeAsNum);
        return q.getResultList();
    }    
}
