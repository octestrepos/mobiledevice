/**
* $HeadURL$
* $LastChangedRevision$
* $LastChangedDate$
* $Author$
* Created on 05.02.2018, 22:49:44
* ===========================================================================
* Copyright (c) 2006-2018 OrgaCard Siemantel & Alt GmbH. All rights reserved.
*/

package de.haruko.mobiledevice.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "CLEANREQUESTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cleanrequest.findAll", query = "SELECT c FROM Cleanrequest c")
    , @NamedQuery(name = "Cleanrequest.findByClreqGuid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqGuid = :clreqGuid")
    , @NamedQuery(name = "Cleanrequest.findByClreqOrdertime", query = "SELECT c FROM Cleanrequest c WHERE c.clreqOrdertime = :clreqOrdertime")
    , @NamedQuery(name = "Cleanrequest.findByClreqImmediate", query = "SELECT c FROM Cleanrequest c WHERE c.clreqImmediate = :clreqImmediate")
    , @NamedQuery(name = "Cleanrequest.findByClreqCleantimesched", query = "SELECT c FROM Cleanrequest c WHERE c.clreqCleantimesched = :clreqCleantimesched")
    , @NamedQuery(name = "Cleanrequest.findByClreqOrderer", query = "SELECT c FROM Cleanrequest c WHERE c.clreqOrderer = :clreqOrderer")
    , @NamedQuery(name = "Cleanrequest.findByClreqCleantimereal", query = "SELECT c FROM Cleanrequest c WHERE c.clreqCleantimereal = :clreqCleantimereal")
    , @NamedQuery(name = "Cleanrequest.findByClreqOcnew", query = "SELECT c FROM Cleanrequest c WHERE c.clreqOcnew = :clreqOcnew")
    , @NamedQuery(name = "Cleanrequest.findByClreqUsernew", query = "SELECT c FROM Cleanrequest c WHERE c.clreqUsernew = :clreqUsernew")
    , @NamedQuery(name = "Cleanrequest.findByClreqOcmod", query = "SELECT c FROM Cleanrequest c WHERE c.clreqOcmod = :clreqOcmod")
    , @NamedQuery(name = "Cleanrequest.findByClreqUsermod", query = "SELECT c FROM Cleanrequest c WHERE c.clreqUsermod = :clreqUsermod")
    , @NamedQuery(name = "Cleanrequest.findByClreqPaid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqPaid = :clreqPaid")
    , @NamedQuery(name = "Cleanrequest.findByClreqCasenumber", query = "SELECT c FROM Cleanrequest c WHERE c.clreqCasenumber = :clreqCasenumber")
    , @NamedQuery(name = "Cleanrequest.findByClreqHandoverTime", query = "SELECT c FROM Cleanrequest c WHERE c.clreqHandoverTime = :clreqHandoverTime")
    , @NamedQuery(name = "Cleanrequest.findByClreqHandoverFlag", query = "SELECT c FROM Cleanrequest c WHERE c.clreqHandoverFlag = :clreqHandoverFlag")
    , @NamedQuery(name = "Cleanrequest.findByClreqForeignTransportid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqForeignTransportid = :clreqForeignTransportid")
    , @NamedQuery(name = "Cleanrequest.findByClreqLut", query = "SELECT c FROM Cleanrequest c WHERE c.clreqLut = :clreqLut")
    , @NamedQuery(name = "Cleanrequest.findByClreqSmssend", query = "SELECT c FROM Cleanrequest c WHERE c.clreqSmssend = :clreqSmssend")
    , @NamedQuery(name = "Cleanrequest.findByClreqSpeech", query = "SELECT c FROM Cleanrequest c WHERE c.clreqSpeech = :clreqSpeech")
    , @NamedQuery(name = "Cleanrequest.findByClreqAudioPath", query = "SELECT c FROM Cleanrequest c WHERE c.clreqAudioPath = :clreqAudioPath")
    , @NamedQuery(name = "Cleanrequest.findByClreqAudioFile", query = "SELECT c FROM Cleanrequest c WHERE c.clreqAudioFile = :clreqAudioFile")
    , @NamedQuery(name = "Cleanrequest.findByClreqNocleaning", query = "SELECT c FROM Cleanrequest c WHERE c.clreqNocleaning = :clreqNocleaning")
    , @NamedQuery(name = "Cleanrequest.findByClreqPremium", query = "SELECT c FROM Cleanrequest c WHERE c.clreqPremium = :clreqPremium")
    , @NamedQuery(name = "Cleanrequest.findByClreqLinkedrequestGuid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqLinkedrequestGuid = :clreqLinkedrequestGuid")
    , @NamedQuery(name = "Cleanrequest.findByClreqPatientName", query = "SELECT c FROM Cleanrequest c WHERE c.clreqPatientName = :clreqPatientName")
    , @NamedQuery(name = "Cleanrequest.findByClreqBedmodelGuid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqBedmodelGuid = :clreqBedmodelGuid")
    , @NamedQuery(name = "Cleanrequest.findByClreqBedGuid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqBedGuid = :clreqBedGuid")
    , @NamedQuery(name = "Cleanrequest.findByClreqCleanlocationGuid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqCleanlocationGuid = :clreqCleanlocationGuid")
    , @NamedQuery(name = "Cleanrequest.findByClreqTaskGuid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqTaskGuid = :clreqTaskGuid")
    , @NamedQuery(name = "Cleanrequest.findByClreqCleanreasonGuid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqCleanreasonGuid = :clreqCleanreasonGuid")
    , @NamedQuery(name = "Cleanrequest.findByClreqCostcenterGuid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqCostcenterGuid = :clreqCostcenterGuid")
    , @NamedQuery(name = "Cleanrequest.findByClreqTargetdeviceGuid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqTargetdeviceGuid = :clreqTargetdeviceGuid")
    , @NamedQuery(name = "Cleanrequest.findByClreqPickuplocationGuid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqPickuplocationGuid = :clreqPickuplocationGuid")
    , @NamedQuery(name = "Cleanrequest.findByClreqWardGuid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqWardGuid = :clreqWardGuid")
    , @NamedQuery(name = "Cleanrequest.findByClreqPriorityGuid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqPriorityGuid = :clreqPriorityGuid")
    , @NamedQuery(name = "Cleanrequest.findByClreqTargetWardGuid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqTargetWardGuid = :clreqTargetWardGuid")
    , @NamedQuery(name = "Cleanrequest.findByClreqRequestcancelreasonGuid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqRequestcancelreasonGuid = :clreqRequestcancelreasonGuid")
    , @NamedQuery(name = "Cleanrequest.findByClreqSoilGuid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqSoilGuid = :clreqSoilGuid")
    , @NamedQuery(name = "Cleanrequest.findByClreqRoomGuid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqRoomGuid = :clreqRoomGuid")
    , @NamedQuery(name = "Cleanrequest.findByClreqStateGuid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqStateGuid = :clreqStateGuid")
    , @NamedQuery(name = "Cleanrequest.findByClreqTargetRoomGuid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqTargetRoomGuid = :clreqTargetRoomGuid")
    , @NamedQuery(name = "Cleanrequest.findByClreqPickuproomGuid", query = "SELECT c FROM Cleanrequest c WHERE c.clreqPickuproomGuid = :clreqPickuproomGuid")})
public class Cleanrequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CLREQ_GUID")
    private String clreqGuid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLREQ_ORDERTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clreqOrdertime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLREQ_IMMEDIATE")
    private short clreqImmediate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLREQ_CLEANTIMESCHED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clreqCleantimesched;
    @Size(max = 50)
    @Column(name = "CLREQ_ORDERER")
    private String clreqOrderer;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLREQ_CLEANTIMEREAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clreqCleantimereal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLREQ_OCNEW")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clreqOcnew;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CLREQ_USERNEW")
    private String clreqUsernew;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLREQ_OCMOD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clreqOcmod;
    @Size(max = 50)
    @Column(name = "CLREQ_USERMOD")
    private String clreqUsermod;
    @Column(name = "CLREQ_PAID")
    private Integer clreqPaid;
    @Size(max = 50)
    @Column(name = "CLREQ_CASENUMBER")
    private String clreqCasenumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLREQ_HANDOVER_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clreqHandoverTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLREQ_HANDOVER_FLAG")
    private short clreqHandoverFlag;
    @Size(max = 50)
    @Column(name = "CLREQ_FOREIGN_TRANSPORTID")
    private String clreqForeignTransportid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLREQ_LUT")
    private short clreqLut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLREQ_SMSSEND")
    private short clreqSmssend;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLREQ_SPEECH")
    private short clreqSpeech;
    @Size(max = 200)
    @Column(name = "CLREQ_AUDIO_PATH")
    private String clreqAudioPath;
    @Size(max = 50)
    @Column(name = "CLREQ_AUDIO_FILE")
    private String clreqAudioFile;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLREQ_NOCLEANING")
    private short clreqNocleaning;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLREQ_PREMIUM")
    private short clreqPremium;
    @Size(max = 50)
    @Column(name = "CLREQ_LINKEDREQUEST_GUID")
    private String clreqLinkedrequestGuid;
    @Size(max = 100)
    @Column(name = "CLREQ_PATIENT_NAME")
    private String clreqPatientName;
    @Size(max = 50)
    @Column(name = "CLREQ_BEDMODEL_GUID")
    private String clreqBedmodelGuid;
    @Size(max = 50)
    @Column(name = "CLREQ_BED_GUID")
    private String clreqBedGuid;
    @Size(max = 50)
    @Column(name = "CLREQ_CLEANLOCATION_GUID")
    private String clreqCleanlocationGuid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CLREQ_TASK_GUID")
    private String clreqTaskGuid;
    @Size(max = 50)
    @Column(name = "CLREQ_CLEANREASON_GUID")
    private String clreqCleanreasonGuid;
    @Size(max = 50)
    @Column(name = "CLREQ_COSTCENTER_GUID")
    private String clreqCostcenterGuid;
    @Size(max = 50)
    @Column(name = "CLREQ_TARGETDEVICE_GUID")
    private String clreqTargetdeviceGuid;
    @Size(max = 50)
    @Column(name = "CLREQ_PICKUPLOCATION_GUID")
    private String clreqPickuplocationGuid;
    @Size(max = 50)
    @Column(name = "CLREQ_WARD_GUID")
    private String clreqWardGuid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CLREQ_PRIORITY_GUID")
    private String clreqPriorityGuid;
    @Size(max = 50)
    @Column(name = "CLREQ_TARGET_WARD_GUID")
    private String clreqTargetWardGuid;
    @Size(max = 50)
    @Column(name = "CLREQ_REQUESTCANCELREASON_GUID")
    private String clreqRequestcancelreasonGuid;
    @Size(max = 50)
    @Column(name = "CLREQ_SOIL_GUID")
    private String clreqSoilGuid;
    @Size(max = 50)
    @Column(name = "CLREQ_ROOM_GUID")
    private String clreqRoomGuid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CLREQ_STATE_GUID")
    private String clreqStateGuid;
    @Size(max = 50)
    @Column(name = "CLREQ_TARGET_ROOM_GUID")
    private String clreqTargetRoomGuid;
    @Size(max = 50)
    @Column(name = "CLREQ_PICKUPROOM_GUID")
    private String clreqPickuproomGuid;

    public Cleanrequest() {
    }

    public Cleanrequest(String clreqGuid) {
        this.clreqGuid = clreqGuid;
    }

    public Cleanrequest(String clreqGuid, Date clreqOrdertime, short clreqImmediate, Date clreqCleantimesched, Date clreqCleantimereal, Date clreqOcnew, String clreqUsernew, Date clreqOcmod, Date clreqHandoverTime, short clreqHandoverFlag, short clreqLut, short clreqSmssend, short clreqSpeech, short clreqNocleaning, short clreqPremium, String clreqTaskGuid, String clreqPriorityGuid, String clreqStateGuid) {
        this.clreqGuid = clreqGuid;
        this.clreqOrdertime = clreqOrdertime;
        this.clreqImmediate = clreqImmediate;
        this.clreqCleantimesched = clreqCleantimesched;
        this.clreqCleantimereal = clreqCleantimereal;
        this.clreqOcnew = clreqOcnew;
        this.clreqUsernew = clreqUsernew;
        this.clreqOcmod = clreqOcmod;
        this.clreqHandoverTime = clreqHandoverTime;
        this.clreqHandoverFlag = clreqHandoverFlag;
        this.clreqLut = clreqLut;
        this.clreqSmssend = clreqSmssend;
        this.clreqSpeech = clreqSpeech;
        this.clreqNocleaning = clreqNocleaning;
        this.clreqPremium = clreqPremium;
        this.clreqTaskGuid = clreqTaskGuid;
        this.clreqPriorityGuid = clreqPriorityGuid;
        this.clreqStateGuid = clreqStateGuid;
    }

    public String getClreqGuid() {
        return clreqGuid;
    }

    public void setClreqGuid(String clreqGuid) {
        this.clreqGuid = clreqGuid;
    }

    public Date getClreqOrdertime() {
        return clreqOrdertime;
    }

    public void setClreqOrdertime(Date clreqOrdertime) {
        this.clreqOrdertime = clreqOrdertime;
    }

    public short getClreqImmediate() {
        return clreqImmediate;
    }

    public void setClreqImmediate(short clreqImmediate) {
        this.clreqImmediate = clreqImmediate;
    }

    public Date getClreqCleantimesched() {
        return clreqCleantimesched;
    }

    public void setClreqCleantimesched(Date clreqCleantimesched) {
        this.clreqCleantimesched = clreqCleantimesched;
    }

    public String getClreqOrderer() {
        return clreqOrderer;
    }

    public void setClreqOrderer(String clreqOrderer) {
        this.clreqOrderer = clreqOrderer;
    }

    public Date getClreqCleantimereal() {
        return clreqCleantimereal;
    }

    public void setClreqCleantimereal(Date clreqCleantimereal) {
        this.clreqCleantimereal = clreqCleantimereal;
    }

    public Date getClreqOcnew() {
        return clreqOcnew;
    }

    public void setClreqOcnew(Date clreqOcnew) {
        this.clreqOcnew = clreqOcnew;
    }

    public String getClreqUsernew() {
        return clreqUsernew;
    }

    public void setClreqUsernew(String clreqUsernew) {
        this.clreqUsernew = clreqUsernew;
    }

    public Date getClreqOcmod() {
        return clreqOcmod;
    }

    public void setClreqOcmod(Date clreqOcmod) {
        this.clreqOcmod = clreqOcmod;
    }

    public String getClreqUsermod() {
        return clreqUsermod;
    }

    public void setClreqUsermod(String clreqUsermod) {
        this.clreqUsermod = clreqUsermod;
    }

    public Integer getClreqPaid() {
        return clreqPaid;
    }

    public void setClreqPaid(Integer clreqPaid) {
        this.clreqPaid = clreqPaid;
    }

    public String getClreqCasenumber() {
        return clreqCasenumber;
    }

    public void setClreqCasenumber(String clreqCasenumber) {
        this.clreqCasenumber = clreqCasenumber;
    }

    public Date getClreqHandoverTime() {
        return clreqHandoverTime;
    }

    public void setClreqHandoverTime(Date clreqHandoverTime) {
        this.clreqHandoverTime = clreqHandoverTime;
    }

    public short getClreqHandoverFlag() {
        return clreqHandoverFlag;
    }

    public void setClreqHandoverFlag(short clreqHandoverFlag) {
        this.clreqHandoverFlag = clreqHandoverFlag;
    }

    public String getClreqForeignTransportid() {
        return clreqForeignTransportid;
    }

    public void setClreqForeignTransportid(String clreqForeignTransportid) {
        this.clreqForeignTransportid = clreqForeignTransportid;
    }

    public short getClreqLut() {
        return clreqLut;
    }

    public void setClreqLut(short clreqLut) {
        this.clreqLut = clreqLut;
    }

    public short getClreqSmssend() {
        return clreqSmssend;
    }

    public void setClreqSmssend(short clreqSmssend) {
        this.clreqSmssend = clreqSmssend;
    }

    public short getClreqSpeech() {
        return clreqSpeech;
    }

    public void setClreqSpeech(short clreqSpeech) {
        this.clreqSpeech = clreqSpeech;
    }

    public String getClreqAudioPath() {
        return clreqAudioPath;
    }

    public void setClreqAudioPath(String clreqAudioPath) {
        this.clreqAudioPath = clreqAudioPath;
    }

    public String getClreqAudioFile() {
        return clreqAudioFile;
    }

    public void setClreqAudioFile(String clreqAudioFile) {
        this.clreqAudioFile = clreqAudioFile;
    }

    public short getClreqNocleaning() {
        return clreqNocleaning;
    }

    public void setClreqNocleaning(short clreqNocleaning) {
        this.clreqNocleaning = clreqNocleaning;
    }

    public short getClreqPremium() {
        return clreqPremium;
    }

    public void setClreqPremium(short clreqPremium) {
        this.clreqPremium = clreqPremium;
    }

    public String getClreqLinkedrequestGuid() {
        return clreqLinkedrequestGuid;
    }

    public void setClreqLinkedrequestGuid(String clreqLinkedrequestGuid) {
        this.clreqLinkedrequestGuid = clreqLinkedrequestGuid;
    }

    public String getClreqPatientName() {
        return clreqPatientName;
    }

    public void setClreqPatientName(String clreqPatientName) {
        this.clreqPatientName = clreqPatientName;
    }

    public String getClreqBedmodelGuid() {
        return clreqBedmodelGuid;
    }

    public void setClreqBedmodelGuid(String clreqBedmodelGuid) {
        this.clreqBedmodelGuid = clreqBedmodelGuid;
    }

    public String getClreqBedGuid() {
        return clreqBedGuid;
    }

    public void setClreqBedGuid(String clreqBedGuid) {
        this.clreqBedGuid = clreqBedGuid;
    }

    public String getClreqCleanlocationGuid() {
        return clreqCleanlocationGuid;
    }

    public void setClreqCleanlocationGuid(String clreqCleanlocationGuid) {
        this.clreqCleanlocationGuid = clreqCleanlocationGuid;
    }

    public String getClreqTaskGuid() {
        return clreqTaskGuid;
    }

    public void setClreqTaskGuid(String clreqTaskGuid) {
        this.clreqTaskGuid = clreqTaskGuid;
    }

    public String getClreqCleanreasonGuid() {
        return clreqCleanreasonGuid;
    }

    public void setClreqCleanreasonGuid(String clreqCleanreasonGuid) {
        this.clreqCleanreasonGuid = clreqCleanreasonGuid;
    }

    public String getClreqCostcenterGuid() {
        return clreqCostcenterGuid;
    }

    public void setClreqCostcenterGuid(String clreqCostcenterGuid) {
        this.clreqCostcenterGuid = clreqCostcenterGuid;
    }

    public String getClreqTargetdeviceGuid() {
        return clreqTargetdeviceGuid;
    }

    public void setClreqTargetdeviceGuid(String clreqTargetdeviceGuid) {
        this.clreqTargetdeviceGuid = clreqTargetdeviceGuid;
    }

    public String getClreqPickuplocationGuid() {
        return clreqPickuplocationGuid;
    }

    public void setClreqPickuplocationGuid(String clreqPickuplocationGuid) {
        this.clreqPickuplocationGuid = clreqPickuplocationGuid;
    }

    public String getClreqWardGuid() {
        return clreqWardGuid;
    }

    public void setClreqWardGuid(String clreqWardGuid) {
        this.clreqWardGuid = clreqWardGuid;
    }

    public String getClreqPriorityGuid() {
        return clreqPriorityGuid;
    }

    public void setClreqPriorityGuid(String clreqPriorityGuid) {
        this.clreqPriorityGuid = clreqPriorityGuid;
    }

    public String getClreqTargetWardGuid() {
        return clreqTargetWardGuid;
    }

    public void setClreqTargetWardGuid(String clreqTargetWardGuid) {
        this.clreqTargetWardGuid = clreqTargetWardGuid;
    }

    public String getClreqRequestcancelreasonGuid() {
        return clreqRequestcancelreasonGuid;
    }

    public void setClreqRequestcancelreasonGuid(String clreqRequestcancelreasonGuid) {
        this.clreqRequestcancelreasonGuid = clreqRequestcancelreasonGuid;
    }

    public String getClreqSoilGuid() {
        return clreqSoilGuid;
    }

    public void setClreqSoilGuid(String clreqSoilGuid) {
        this.clreqSoilGuid = clreqSoilGuid;
    }

    public String getClreqRoomGuid() {
        return clreqRoomGuid;
    }

    public void setClreqRoomGuid(String clreqRoomGuid) {
        this.clreqRoomGuid = clreqRoomGuid;
    }

    public String getClreqStateGuid() {
        return clreqStateGuid;
    }

    public void setClreqStateGuid(String clreqStateGuid) {
        this.clreqStateGuid = clreqStateGuid;
    }

    public String getClreqTargetRoomGuid() {
        return clreqTargetRoomGuid;
    }

    public void setClreqTargetRoomGuid(String clreqTargetRoomGuid) {
        this.clreqTargetRoomGuid = clreqTargetRoomGuid;
    }

    public String getClreqPickuproomGuid() {
        return clreqPickuproomGuid;
    }

    public void setClreqPickuproomGuid(String clreqPickuproomGuid) {
        this.clreqPickuproomGuid = clreqPickuproomGuid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clreqGuid != null ? clreqGuid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cleanrequest)) {
            return false;
        }
        Cleanrequest other = (Cleanrequest) object;
        if ((this.clreqGuid == null && other.clreqGuid != null) || (this.clreqGuid != null && !this.clreqGuid.equals(other.clreqGuid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.haruko.mobiledevice.Cleanrequest[ clreqGuid=" + clreqGuid + " ]";
    }

}
