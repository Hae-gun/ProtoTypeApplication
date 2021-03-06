package org.techtown.prototypeapplication.VO;

import java.sql.Date;

public class SensorData {
    private int dataID;
    private String sensorID;
    private Date time;
    private String states;
    private String stateDetail;


    // constructor
    private SensorData() {
        this.dataID = this.hashCode();
        this.time = new Date(System.currentTimeMillis());
    }

    public SensorData(String sensorID, String states) {
        this();
        this.sensorID = sensorID;
        this.states = states;
    }

    public SensorData(String sensorID, String states, String stateDetail) {
        this(sensorID, states);
        this.stateDetail = stateDetail;
    }


    // get, set
    public int getDataID() {
        return dataID;
    }

    public void setDataID(int dataID) {
        this.dataID = dataID;
    }

    public String getSensorID() {
        return sensorID;
    }

    public void setSensorID(String sensorID) {
        this.sensorID = sensorID;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public String getStateDetail() {
        return stateDetail;
    }

    public void setStateDetail(String stateDetail) {
        this.stateDetail = stateDetail;
    }

    @Override
    public String toString() {
        return "SensorData{" +
                "dataID=" + dataID +
                ", sensorID='" + sensorID + '\'' +
                ", time=" + time +
                ", states='" + states + '\'' +
                ", stateDetail='" + stateDetail + '\'' +
                '}';
    }
}
