/**
* $HeadURL$
* $LastChangedRevision$
* $LastChangedDate$
* $Author$
* Created on 05.02.2018, 18:43:10
* ===========================================================================
* Copyright (c) 2006-2018 OrgaCard Siemantel & Alt GmbH. All rights reserved.
*/

package de.haruko.mobiledevice.entity;

import de.haruko.mobiledevice.entity.mapper.MobiledeviceExtractor;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.persistence.annotations.ClassExtractor;


@Entity
@Table(name = "MOBILEDEVICES")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@ClassExtractor(MobiledeviceExtractor.class)
@XmlRootElement
public abstract class Mobiledevice implements Serializable, IMobiledevice {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "MDEV_GUID")
    private String mdevGuid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "MDEV_NAME")
    private String mdevName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_ISBEDCENTER")
    private short mdevIsbedcenter;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_VALIDFROM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdevValidfrom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_VALIDTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdevValidto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_OCNEW")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdevOcnew;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "MDEV_USERNEW")
    private String mdevUsernew;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_OCMOD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdevOcmod;
    @Size(max = 50)
    @Column(name = "MDEV_USERMOD")
    private String mdevUsermod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_SORTNO")
    private int mdevSortno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_LOCKED")
    private short mdevLocked;
    @Size(max = 50)
    @Column(name = "MDEV_PUSH_FOREIGN_DEVICEID")
    private String mdevPushForeignDeviceid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_PUSH_ISREADY")
    private short mdevPushIsready;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_PUSH_MASTERDATASTATE")
    private int mdevPushMasterdatastate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_PUSH_SEQUENCENUMBER")
    private long mdevPushSequencenumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_STATEMOD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdevStatemod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "MDEV_STATEMODUSER")
    private String mdevStatemoduser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_PUSH_ISACTIVE")
    private short mdevPushIsactive;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_CLEANORUNCLEANONLY")
    private short mdevCleanoruncleanonly;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_ISPREPARATIONDEVICE")
    private short mdevIspreparationdevice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_ISORDERDEVICE")
    private short mdevIsorderdevice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_ISCLEANINGDEVICE")
    private short mdevIscleaningdevice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_ISTRANSPORTDEVICE")
    private short mdevIstransportdevice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_SEND_LOGFILES")
    private short mdevSendLogfiles;
    @Column(name = "MDEV_CURRENT_DEVREADY_MESSAGEID")
    private BigInteger mdevCurrentDevreadyMessageid;
    @Size(max = 200)
    @Column(name = "MDEV_DEVICE_UUID")
    private String mdevDeviceUuid;

    public Mobiledevice() {
    }

    public Mobiledevice(String mdevGuid) {
        this.mdevGuid = mdevGuid;
    }

    public Mobiledevice(String mdevGuid, String mdevName, short mdevIsbedcenter, Date mdevValidfrom, Date mdevValidto, Date mdevOcnew, String mdevUsernew, Date mdevOcmod, int mdevSortno, short mdevLocked, short mdevPushIsready, int mdevPushMasterdatastate, long mdevPushSequencenumber, Date mdevStatemod, String mdevStatemoduser, short mdevPushIsactive, short mdevCleanoruncleanonly, short mdevIspreparationdevice, short mdevIsorderdevice, short mdevIscleaningdevice, short mdevIstransportdevice, short mdevSendLogfiles) {
        this.mdevGuid = mdevGuid;
        this.mdevName = mdevName;
        this.mdevIsbedcenter = mdevIsbedcenter;
        this.mdevValidfrom = mdevValidfrom;
        this.mdevValidto = mdevValidto;
        this.mdevOcnew = mdevOcnew;
        this.mdevUsernew = mdevUsernew;
        this.mdevOcmod = mdevOcmod;
        this.mdevSortno = mdevSortno;
        this.mdevLocked = mdevLocked;
        this.mdevPushIsready = mdevPushIsready;
        this.mdevPushMasterdatastate = mdevPushMasterdatastate;
        this.mdevPushSequencenumber = mdevPushSequencenumber;
        this.mdevStatemod = mdevStatemod;
        this.mdevStatemoduser = mdevStatemoduser;
        this.mdevPushIsactive = mdevPushIsactive;
        this.mdevCleanoruncleanonly = mdevCleanoruncleanonly;
        this.mdevIspreparationdevice = mdevIspreparationdevice;
        this.mdevIsorderdevice = mdevIsorderdevice;
        this.mdevIscleaningdevice = mdevIscleaningdevice;
        this.mdevIstransportdevice = mdevIstransportdevice;
        this.mdevSendLogfiles = mdevSendLogfiles;
    }

    @Override
    public String getId() {
        return mdevGuid;
    }

    public void setId(String mdevGuid) {
        this.mdevGuid = mdevGuid;
    }

    public String getMdevName() {
        return mdevName;
    }

    public void setMdevName(String mdevName) {
        this.mdevName = mdevName;
    }

    public short getMdevIsbedcenter() {
        return mdevIsbedcenter;
    }

    public void setMdevIsbedcenter(short mdevIsbedcenter) {
        this.mdevIsbedcenter = mdevIsbedcenter;
    }

    public Date getMdevValidfrom() {
        return mdevValidfrom;
    }

    public void setMdevValidfrom(Date mdevValidfrom) {
        this.mdevValidfrom = mdevValidfrom;
    }

    public Date getMdevValidto() {
        return mdevValidto;
    }

    public void setMdevValidto(Date mdevValidto) {
        this.mdevValidto = mdevValidto;
    }

    public Date getMdevOcnew() {
        return mdevOcnew;
    }

    public void setMdevOcnew(Date mdevOcnew) {
        this.mdevOcnew = mdevOcnew;
    }

    public String getMdevUsernew() {
        return mdevUsernew;
    }

    public void setMdevUsernew(String mdevUsernew) {
        this.mdevUsernew = mdevUsernew;
    }

    public Date getMdevOcmod() {
        return mdevOcmod;
    }

    public void setMdevOcmod(Date mdevOcmod) {
        this.mdevOcmod = mdevOcmod;
    }

    public String getMdevUsermod() {
        return mdevUsermod;
    }

    public void setMdevUsermod(String mdevUsermod) {
        this.mdevUsermod = mdevUsermod;
    }

    public int getMdevSortno() {
        return mdevSortno;
    }

    public void setMdevSortno(int mdevSortno) {
        this.mdevSortno = mdevSortno;
    }

    public short getMdevLocked() {
        return mdevLocked;
    }

    public void setMdevLocked(short mdevLocked) {
        this.mdevLocked = mdevLocked;
    }

    public String getMdevPushForeignDeviceid() {
        return mdevPushForeignDeviceid;
    }

    public void setMdevPushForeignDeviceid(String mdevPushForeignDeviceid) {
        this.mdevPushForeignDeviceid = mdevPushForeignDeviceid;
    }

    public short getMdevPushIsready() {
        return mdevPushIsready;
    }

    public void setMdevPushIsready(short mdevPushIsready) {
        this.mdevPushIsready = mdevPushIsready;
    }

    public int getMdevPushMasterdatastate() {
        return mdevPushMasterdatastate;
    }

    public void setMdevPushMasterdatastate(int mdevPushMasterdatastate) {
        this.mdevPushMasterdatastate = mdevPushMasterdatastate;
    }

    public long getMdevPushSequencenumber() {
        return mdevPushSequencenumber;
    }

    public void setMdevPushSequencenumber(long mdevPushSequencenumber) {
        this.mdevPushSequencenumber = mdevPushSequencenumber;
    }

    public Date getMdevStatemod() {
        return mdevStatemod;
    }

    public void setMdevStatemod(Date mdevStatemod) {
        this.mdevStatemod = mdevStatemod;
    }

    public String getMdevStatemoduser() {
        return mdevStatemoduser;
    }

    public void setMdevStatemoduser(String mdevStatemoduser) {
        this.mdevStatemoduser = mdevStatemoduser;
    }

    public short getMdevPushIsactive() {
        return mdevPushIsactive;
    }

    public void setMdevPushIsactive(short mdevPushIsactive) {
        this.mdevPushIsactive = mdevPushIsactive;
    }

    public short getMdevCleanoruncleanonly() {
        return mdevCleanoruncleanonly;
    }

    public void setMdevCleanoruncleanonly(short mdevCleanoruncleanonly) {
        this.mdevCleanoruncleanonly = mdevCleanoruncleanonly;
    }

    public short getMdevIspreparationdevice() {
        return mdevIspreparationdevice;
    }

    public void setMdevIspreparationdevice(short mdevIspreparationdevice) {
        this.mdevIspreparationdevice = mdevIspreparationdevice;
    }

    public short getMdevIsorderdevice() {
        return mdevIsorderdevice;
    }

    public void setMdevIsorderdevice(short mdevIsorderdevice) {
        this.mdevIsorderdevice = mdevIsorderdevice;
    }

    public short getMdevIscleaningdevice() {
        return mdevIscleaningdevice;
    }

    public void setMdevIscleaningdevice(short mdevIscleaningdevice) {
        this.mdevIscleaningdevice = mdevIscleaningdevice;
    }

    public short getMdevIstransportdevice() {
        return mdevIstransportdevice;
    }

    public void setMdevIstransportdevice(short mdevIstransportdevice) {
        this.mdevIstransportdevice = mdevIstransportdevice;
    }

    public short getMdevSendLogfiles() {
        return mdevSendLogfiles;
    }

    public void setMdevSendLogfiles(short mdevSendLogfiles) {
        this.mdevSendLogfiles = mdevSendLogfiles;
    }

    public BigInteger getMdevCurrentDevreadyMessageid() {
        return mdevCurrentDevreadyMessageid;
    }

    public void setMdevCurrentDevreadyMessageid(BigInteger mdevCurrentDevreadyMessageid) {
        this.mdevCurrentDevreadyMessageid = mdevCurrentDevreadyMessageid;
    }

    public String getMdevDeviceUuid() {
        return mdevDeviceUuid;
    }

    public void setMdevDeviceUuid(String mdevDeviceUuid) {
        this.mdevDeviceUuid = mdevDeviceUuid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mdevGuid != null ? mdevGuid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mobiledevice)) {
            return false;
        }
        Mobiledevice other = (Mobiledevice) object;
        if ((this.mdevGuid == null && other.mdevGuid != null) || (this.mdevGuid != null && !this.mdevGuid.equals(other.mdevGuid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.haruko.mobiledevice.Mobiledevice[ mdevGuid=" + mdevGuid + " ]";
    }

}
