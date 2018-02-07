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


public class WardQueryImpl extends AbstractWardQuery implements DeviceQuery {

    @Override
    public String getTaskCriteria() {
        String crit = " and m.MDEV_ISBEDCENTER = 0 ";
        crit += " and m.MDEV_ISTRANSPORTDEVICE = 0 ";
        crit += " and m.MDEV_ISCLEANINGDEVICE = 0 ";
        crit += " and m.MDEV_ISPREPARATIONDEVICE = 0 ";
        crit += " and m.MDEV_ISTRANSPORTDEVICE = 0 ";
        crit += " and exists (select 1 from WARD2MOBDEV wm where wm.WD2MD_WARD_GUID = w.WARD_GUID and wm.WD2MD_MDEV_GUID = m.MDEV_GUID and ((?2 between wm.WD2MD_PERIOD1_FROM and wm.WD2MD_PERIOD1_TO) or (?2 between wm.WD2MD_PERIOD2_FROM and wm.WD2MD_PERIOD2_TO) or (?2 between wm.WD2MD_PERIOD3_FROM and wm.WD2MD_PERIOD3_TO) or (c.CLREQ_TARGETDEVICE_GUID = m.MDEV_GUID))) ";
        crit += " and ( ";
        crit += "     ((t.TASK_ABBREV = 'R' AND s.STATE_GUID IN ('0','3') AND c.CLREQ_TARGETDEVICE_GUID IS NULL AND l.CLLOC_CENTRAL = 0) OR (t.TASK_ABBREV = 'R' AND s.STATE_GUID IN ('4','5') AND c.CLREQ_TARGETDEVICE_GUID = m.MDEV_GUID)) ";
        crit += "    or ((t.TASK_ABBREV = 'T' AND s.STATE_GUID IN ('0','3') AND c.CLREQ_TARGETDEVICE_GUID IS NULL) OR (t.TASK_ABBREV = 'T' AND s.STATE_GUID IN ('4','5') AND c.CLREQ_TARGETDEVICE_GUID = m.MDEV_GUID)) ";
        crit += "    or ((t.TASK_ABBREV = 'N' AND s.STATE_GUID IN ('2') AND c.CLREQ_TARGETDEVICE_GUID IS NULL) OR (t.TASK_ABBREV = 'N' AND s.STATE_GUID IN ('4','5') AND c.CLREQ_TARGETDEVICE_GUID = m.MDEV_GUID)) ";
        crit += "    or ((t.TASK_ABBREV = 'Z' AND s.STATE_GUID IN ('2') AND c.CLREQ_TARGETDEVICE_GUID IS NULL) OR (t.TASK_ABBREV = 'N' AND s.STATE_GUID IN ('4','5') AND c.CLREQ_TARGETDEVICE_GUID = m.MDEV_GUID)) ";
        crit += " )";
        return crit;
    }


}
