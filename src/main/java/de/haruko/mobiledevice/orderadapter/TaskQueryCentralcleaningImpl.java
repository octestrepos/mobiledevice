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


public class TaskQueryCentralcleaningImpl extends AbstractTaskQuery implements DeviceQuery {

    @Override
    public String getTaskCriteria() {
        String crit = " and t.TASK_ABBREV = 'R'  ";
        crit += " and m.MDEV_ISBEDCENTER = 1 ";
        crit += " and m.MDEV_ISPREPARATIONDEVICE = 0 ";
        crit += " and ((l.CLLOC_CENTRAL = m.MDEV_ISBEDCENTER AND s.STATE_GUID IN ('0','3') AND c.CLREQ_TARGETDEVICE_GUID IS NULL AND w.WARD_ASSIGNED_BEDCENTER_GUID = isNull(m.MDEV_BEDCENTER_GUID,w.WARD_ASSIGNED_BEDCENTER_GUID)) OR (s.STATE_GUID = '6' AND m.MDEV_ISBEDCENTER = 1 AND c.CLREQ_TARGETDEVICE_GUID IS NULL AND w.WARD_ASSIGNED_BEDCENTER_GUID = isNull(m.MDEV_BEDCENTER_GUID,w.WARD_ASSIGNED_BEDCENTER_GUID)) OR (c.CLREQ_TARGETDEVICE_GUID = m.MDEV_GUID)) ";
        return crit;
    }

}
