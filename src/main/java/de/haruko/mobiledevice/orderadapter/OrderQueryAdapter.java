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
    private DeviceQuery taskQueryAddon;   
    
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
        return taskQueryAddon.getMainQuery() + taskQueryAddon.getTaskCriteria();
    }

   
}
