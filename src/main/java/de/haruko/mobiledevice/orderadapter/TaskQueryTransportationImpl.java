/**
* $HeadURL$
* $LastChangedRevision$
* $LastChangedDate$
* $Author$
* Created on 05.02.2018, 06:20:56
* ===========================================================================
* Copyright (c) 2006-2018 OrgaCard Siemantel & Alt GmbH. All rights reserved.
*/

package de.haruko.mobiledevice.orderadapter;


public class TaskQueryTransportationImpl extends AbstractTaskQuery implements DeviceQuery {

    @Override
    public String getTaskCriteria() {
        String crit = " and t.TASK_ABBREV IN ('N','T','Z')  ";
        crit += " and m.MDEV_ISBEDCENTER = 0 ";
        crit += " and m.MDEV_ISTRANSPORTDEVICE = 1 ";
        crit += " and ((t.TASK_ABBREV IN ('N','Z') AND s.STATE_GUID IN ('2','3') AND c.CLREQ_TARGETDEVICE_GUID IS NULL) OR (t.TASK_ABBREV = 'T' AND s.STATE_GUID IN ('0','3') AND c.CLREQ_TARGETDEVICE_GUID IS NULL) OR (c.CLREQ_TARGETDEVICE_GUID = m.MDEV_GUID)) ";
        return crit;
    }

}
