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


public class TaskQueryDecentralcleaningImpl implements TaskQuery {

    @Override
    public String getTaskCriteria() {
        String crit = " and t.TASK_ABBREV = 'R'  ";
        crit += " and m.MDEV_ISBEDCENTER = 0 ";
        crit += " and m.MDEV_ISCLEANINGDEVICE = 1 ";
        crit += " and ((l.CLLOC_CENTRAL = m.MDEV_ISBEDCENTER AND s.STATE_GUID IN ('0','3') AND c.CLREQ_TARGETDEVICE_GUID IS NULL) OR (c.CLREQ_TARGETDEVICE_GUID = m.MDEV_GUID)) ";
        return crit;
    }

}
