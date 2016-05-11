package com.example.kdotz.myschedule;

/**
 * Created by kdotz on 5/10/2016.
 */
public class ScheduleDetail {

    private String scheduleDate;
    private String scheduleDescrip;
    private String scheduleTitle;

    public ScheduleDetail(String scheduleTitle,String scheduleDescrip, String scheduleDate ) {
        this.scheduleTitle = scheduleTitle;
        this.scheduleDate = scheduleDate;
        this.scheduleDescrip = scheduleDescrip;

    }

    public String getscheduleDate() {
        return scheduleDate;
    }

    public void setscheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public String getscheduleTitle() {
        return scheduleTitle;
    }

    public void setscheduleTitle(String scheduleTitle) {
        this.scheduleTitle = scheduleTitle;
    }

    public String getScheduleDescrip() {
        return scheduleDescrip;
    }

    public void setScheduleDescrip(String scheduleDescrip) {
        this.scheduleDescrip = scheduleDescrip;
    }
}

