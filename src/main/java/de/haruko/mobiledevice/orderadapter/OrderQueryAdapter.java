/**
* $HeadURL$
* $LastChangedRevision$
* $LastChangedDate$
* $Author$
* Created on 05.02.2018, 20:40:33
* ===========================================================================
* Copyright (c) 2006-2018 OrgaCard Siemantel & Alt GmbH. All rights reserved.
*/

package de.haruko.mobiledevice.orderadapter;

import de.haruko.mobiledevice.entity.Centralcleaningdevice;
import de.haruko.mobiledevice.entity.Decentralcleaningdevice;
import de.haruko.mobiledevice.entity.IMobiledevice;
import de.haruko.mobiledevice.entity.Preparationdevice;
import de.haruko.mobiledevice.entity.Transportdevice;


public class OrderQueryAdapter implements OrderQuery {

    private final IMobiledevice mobiledevice;
    private TaskQuery taskQueryAddon;   
    
    public OrderQueryAdapter(IMobiledevice mobiledeviceVariant) {
        mobiledevice = mobiledeviceVariant;
        buildTaskQueryByVariant();
    }
    
    private void buildTaskQueryByVariant() {
        if (mobiledevice instanceof Decentralcleaningdevice)
            taskQueryAddon = new TaskQueryDecentralcleaningImpl();
        else if (mobiledevice instanceof Centralcleaningdevice)
            taskQueryAddon = new TaskQueryCentralcleaningImpl();
        else if (mobiledevice instanceof Preparationdevice)
            taskQueryAddon = new TaskQueryPreparationImpl();        
        else if (mobiledevice instanceof Transportdevice)
            taskQueryAddon = new TaskQueryTransportationImpl();        
    }    
                
    @Override
    public String getTaskListStatement() {
        return buildMainQuery() + taskQueryAddon.getTaskCriteria();
    }

    
    private String buildMainQuery() {
        String mainQuery = " select c.* ";
        mainQuery += " from MOBILEDEVICES m, CLEANREQUESTS c inner join TASKS t on (c.CLREQ_TASK_GUID = t.TASK_GUID) ";
        mainQuery += "      inner join STATE s on (c.CLREQ_STATE_GUID = s.STATE_GUID) ";
        mainQuery += "      inner join WARDS w on (c.CLREQ_WARD_GUID = w.WARD_GUID) ";
        mainQuery += "      left outer join CLEANLOCATIONS l on (c.CLREQ_CLEANLOCATION_GUID = l.CLLOC_GUID) ";
        mainQuery += " where s.STATE_GUID IN ('0','1','2','3','4','5','6') ";
        mainQuery += " and m.MDEV_GUID = ? ";          
        return mainQuery;
    }
   
}
