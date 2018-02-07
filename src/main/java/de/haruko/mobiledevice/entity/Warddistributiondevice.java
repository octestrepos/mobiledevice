/**
* $HeadURL$
* $LastChangedRevision$
* $LastChangedDate$
* $Author$
* Created on 05.02.2018, 18:45:08
* ===========================================================================
* Copyright (c) 2006-2018 OrgaCard Siemantel & Alt GmbH. All rights reserved.
*/

package de.haruko.mobiledevice.entity;

import de.haruko.mobiledevice.entity.mapper.WarddistributionCustomizer;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import org.eclipse.persistence.annotations.Customizer;

@Entity
@Customizer(WarddistributionCustomizer.class)
public class Warddistributiondevice extends Mobiledevice implements Serializable, IMobiledevice {
    
    @OneToMany(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "WD2MD_MDEV_GUID", referencedColumnName = "MDEV_GUID", table = "WARD2MOBDEV")
    private List<WardToMobDev> assignedWards;
        
    public List<WardToMobDev> getAssignedWards() {
        return assignedWards;
    }

    public void setAssignedWards(List<WardToMobDev> assignedWards) {
        this.assignedWards = assignedWards;
    }       
}
