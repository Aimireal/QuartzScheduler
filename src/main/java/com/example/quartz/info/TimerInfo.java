package com.example.quartz.info;

import java.io.Serializable;

public class TimerInfo implements Serializable {
    private int totalFireCount;
    private int remainingFirecount;
    private boolean runForever;
    private long repeatIntervalMS;
    private long initialOffsetMS;
    private String callbackData;

    public int getTotalFireCount() {
        return totalFireCount;
    }

    public void setTotalFireCount(int totalFireCount) {
        this.totalFireCount = totalFireCount;
    }

    public int getRemainingFirecount(){
        return remainingFirecount;
    }

    public void setRemainingFirecount(int remainingFirecount){
        this.remainingFirecount = remainingFirecount;
    }

    public boolean isRunForever() {
        return runForever;
    }

    public void setRunForever(boolean runForever) {
        this.runForever = runForever;
    }

    public long getRepeatIntervalMS() {
        return repeatIntervalMS;
    }

    public void setRepeatIntervalMS(long repeatIntervalMS) {
        this.repeatIntervalMS = repeatIntervalMS;
    }

    public long getInitialOffsetMS() {
        return initialOffsetMS;
    }

    public void setInitialOffsetMS(long initialOffsetMS) {
        this.initialOffsetMS = initialOffsetMS;
    }

    public String getCallbackData() {
        return callbackData;
    }

    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }
}
