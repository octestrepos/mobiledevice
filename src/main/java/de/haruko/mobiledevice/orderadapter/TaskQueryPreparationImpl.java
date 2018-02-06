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


public class TaskQueryPreparationImpl implements TaskQuery {

    @Override
    public String getTaskCriteria() {
        String crit = " and t.TASK_ABBREV IN ('N','Z')  ";
        crit += " and m.MDEV_ISBEDCENTER = 0 ";
        crit += " and m.MDEV_ISPREPARATIONDEVICE = 1 ";
        crit += " and ((s.STATE_GUID IN ('0','1') AND c.CLREQ_TARGETDEVICE_GUID IS NULL AND w.WARD_ASSIGNED_BEDCENTER_GUID = isNull(m.MDEV_BEDCENTER_GUID,w.WARD_ASSIGNED_BEDCENTER_GUID)) OR (c.CLREQ_TARGETDEVICE_GUID = m.MDEV_GUID)) ";
        return crit;
    }

}
