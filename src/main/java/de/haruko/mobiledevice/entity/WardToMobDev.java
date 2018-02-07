/**
 * $Header: /sourcen/cvs/repository/bedmgmt/bedmgmt-ejb/src/java/de/orgacard/bedmgmt/ejb/entity/WardToMobDev.java,v 1.2 2009-12-10 11:39:50 b.chetty Exp $
 * $Revision: 29249 $
 * $Date: 2018-01-24 15:17:18 +0100 (Mi, 24 Jan 2018) $
 * Created on Nov 17, 2009, 9:57:25 AM
 * ====================================================================
 * OrgaCard Siemantel & Alt GmbH
 * Copyright (c) 2006-2009 OrgaCard Siemantel & Alt GmbH.
 * All rights reserved.
 *
 */
package de.haruko.mobiledevice.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This 'Java' entity class maps to 'WARD2MOBDEV' table in the database.
 *
 * @author Babji, Chetty
 * @version 1.0
 */
@Entity
@Table(name = "WARD2MOBDEV")
public class WardToMobDev implements Serializable {
    private String id;
    private String mobileDeviceId;
    private String wardGuid;
    private boolean weekendFlag;
    private Long periodFrom1;
    private Long periodTo1;
    private Long periodFrom2;
    private Long periodTo2;
    private Long periodFrom3;
    private Long periodTo3;

    public WardToMobDev() {}

    @Id
    @Column(name = "WD2MD_GUID")
    public String getId() {
        return id;
    }

    public void setId(String wd2mdGuid) {
        this.id = wd2mdGuid;
    }

    @Column(name = "WD2MD_MDEV_GUID")
    public String getMobileDeviceId() {
        return mobileDeviceId;
    }

    public void setMobileDeviceId(String mobileDeviceId) {
        this.mobileDeviceId = mobileDeviceId;
    }

    @Column(name = "WD2MD_WARD_GUID")
    public String getWardId() {
        return wardGuid;
    }

    public void setWardId(String wardGuid) {
        this.wardGuid = wardGuid;
    }

    @Column(name = "WD2MD_WEEKEND")
    public boolean getWeekendFlag() {
        return weekendFlag;
    }

    public void setWeekendFlag(boolean weekendFlag) {
        this.weekendFlag = weekendFlag;
    }

    @Column(name = "WD2MD_PERIOD1_FROM")
    public Long getPeriodFrom1() {
        return periodFrom1;
    }

    public void setPeriodFrom1(Long periodFrom1) {
        this.periodFrom1 = periodFrom1;
    }

    @Column(name = "WD2MD_PERIOD1_TO")
    public Long getPeriodTo1() {
        return periodTo1;
    }

    public void setPeriodTo1(Long periodTo1) {
        this.periodTo1 = periodTo1;
    }

    @Column(name = "WD2MD_PERIOD2_FROM")
    public Long getPeriodFrom2() {
        return periodFrom2;
    }

    public void setPeriodFrom2(Long periodFrom2) {
        this.periodFrom2 = periodFrom2;
    }

    @Column(name = "WD2MD_PERIOD2_TO")
    public Long getPeriodTo2() {
        return periodTo2;
    }

    public void setPeriodTo2(Long periodTo2) {
        this.periodTo2 = periodTo2;
    }

    @Column(name = "WD2MD_PERIOD3_FROM")
    public Long getPeriodFrom3() {
        return periodFrom3;
    }
    
    public void setPeriodFrom3(Long periodFrom3) {
        this.periodFrom3 = periodFrom3;
    }

    @Column(name = "WD2MD_PERIOD3_TO")
    public Long getPeriodTo3() {
        return periodTo3;
    }

    public void setPeriodTo3(Long periodTo3) {
        this.periodTo3 = periodTo3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        return true;
    }

    @Override
    public String toString() {
        return "com.orgacard.entity.bed.Ward2mobdev[wd2mdGuid=" + id + "]";
    }
}