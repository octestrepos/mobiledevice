/**
* $HeadURL$
* $LastChangedRevision$
* $LastChangedDate$
* $Author$
* Created on 07.02.2018, 06:32:03
* ===========================================================================
* Copyright (c) 2006-2018 OrgaCard Siemantel & Alt GmbH. All rights reserved.
*/

package de.haruko.mobiledevice.orderadapter;


public abstract class AbstractWardQuery implements DeviceQuery {

    @Override
    public abstract String getTaskCriteria();

    @Override
    public String getMainQuery() {
        String mainQuery = " select c.* ";
        mainQuery += " from MOBILEDEVICES m, CLEANREQUESTS c inner join TASKS t on (c.CLREQ_TASK_GUID = t.TASK_GUID) ";
        mainQuery += "      inner join STATE s on (c.CLREQ_STATE_GUID = s.STATE_GUID) ";
        mainQuery += "      inner join WARDS w on (c.CLREQ_WARD_GUID = w.WARD_GUID) ";
        mainQuery += "      left outer join CLEANLOCATIONS l on (c.CLREQ_CLEANLOCATION_GUID = l.CLLOC_GUID) ";
        mainQuery += " where s.STATE_GUID IN ('0','1','2','3','4','5','6') ";
        mainQuery += " and m.MDEV_GUID = ?1 ";          
        return mainQuery;
    }        
}
