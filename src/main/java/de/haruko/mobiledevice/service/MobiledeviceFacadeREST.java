/**
* $HeadURL$
* $LastChangedRevision$
* $LastChangedDate$
* $Author$
* Created on 05.02.2018, 19:05:20
* ===========================================================================
* Copyright (c) 2006-2018 OrgaCard Siemantel & Alt GmbH. All rights reserved.
*/

package de.haruko.mobiledevice.service;

import de.haruko.mobiledevice.entity.Cleanrequest;
import de.haruko.mobiledevice.entity.IMobiledevice;
import de.haruko.mobiledevice.entity.Mobiledevice;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Stateless
@Path("de.haruko.mobiledevice.mobiledevice")
public class MobiledeviceFacadeREST extends AbstractFacade<Mobiledevice> {

    @PersistenceContext(unitName = "de.haruko_mobiledevice_war_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    private CleanrequestFacadeREST cleanrequest;

    public MobiledeviceFacadeREST() {
        super(Mobiledevice.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Mobiledevice entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") String id, Mobiledevice entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Cleanrequest> find(@PathParam("id") String id) {
        IMobiledevice mobileDevice = super.find(id);
        cleanrequest = new CleanrequestFacadeREST();
        return cleanrequest.findByDeviceVariant(mobileDevice, em);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Mobiledevice> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Mobiledevice> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
