/**
* $HeadURL$
* $LastChangedRevision$
* $LastChangedDate$
* $Author$
* Created on 05.02.2018, 18:50:08
* ===========================================================================
* Copyright (c) 2006-2018 OrgaCard Siemantel & Alt GmbH. All rights reserved.
*/

package de.haruko.mobiledevice.entity.mapper;

import de.haruko.mobiledevice.entity.Centralcleaningdevice;
import de.haruko.mobiledevice.entity.Decentralcleaningdevice;
import de.haruko.mobiledevice.entity.Preparationdevice;
import de.haruko.mobiledevice.entity.Transportdevice;
import de.haruko.mobiledevice.entity.Warddistributiondevice;
import org.eclipse.persistence.descriptors.ClassExtractor;
import org.eclipse.persistence.sessions.Record;
import org.eclipse.persistence.sessions.Session;

public class MobiledeviceExtractor extends ClassExtractor {
    @Override
    public Class extractClassFromRow(Record row, Session session) {
        if (row.get("MDEV_ISBEDCENTER").equals((short)1)
                && row.get("MDEV_ISPREPARATIONDEVICE").equals((short)0)) {
            return Centralcleaningdevice.class;
        } else if (row.get("MDEV_ISCLEANINGDEVICE").equals((short)1)
                && row.get("MDEV_ISBEDCENTER").equals((short)0)) {
            return Decentralcleaningdevice.class;
        } else if (row.get("MDEV_ISPREPARATIONDEVICE").equals((short)1)
                && row.get("MDEV_ISBEDCENTER").equals((short)1)) {
            return Preparationdevice.class;
        } else if (row.get("MDEV_ISTRANSPORTDEVICE").equals((short)1)
                && row.get("MDEV_ISBEDCENTER").equals((short)0)) {
            return Transportdevice.class;
        } else if (row.get("MDEV_ISTRANSPORTDEVICE").equals((short)0)
                && row.get("MDEV_ISCLEANINGDEVICE").equals((short)0)
                && row.get("MDEV_ISBEDCENTER").equals((short)0)) {
            return Warddistributiondevice.class;
        }
        return Centralcleaningdevice.class;
    }
}
