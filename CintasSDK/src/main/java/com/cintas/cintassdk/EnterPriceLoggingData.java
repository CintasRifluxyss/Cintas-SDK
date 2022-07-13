package com.cintas.cintassdk;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(tableName = "PRICE_DETAIL",primaryKeys = {"Id"})
public class EnterPriceLoggingData {

    @ColumnInfo(name = "Id")
    public int Id;

    @ColumnInfo(name = "EventTime")
    @NonNull
    public String eventTime = new StringUtils().EMPTY;

    @ColumnInfo(name = "HostId")
    @NonNull
    public String hostId  = new StringUtils().EMPTY;

    @ColumnInfo(name = "AppID")
    @NonNull
    public String appID  = new StringUtils().EMPTY;

    @ColumnInfo(name = "UserId")
    @NonNull
    public String userId  = new StringUtils().EMPTY;

    @ColumnInfo(name = "LocationNbr")
    public long locationNbr;

    @ColumnInfo(name = "RouteNbr")
    public int routeNbr;

    @ColumnInfo(name = "Day")
    public int day;

    @ColumnInfo(name = "Logger")
    @NonNull
    public String logger  = new StringUtils().EMPTY;

    @ColumnInfo(name = "EventNbr")
    @NonNull
    public String eventNbr = new StringUtils().EMPTY;

    @ColumnInfo(name = "AddtDesc")
    @NonNull
    public String addtDesc = new StringUtils().EMPTY;

    @ColumnInfo(name = "AddtNbr")
    public int addtNbr;

    public EnterPriceLoggingData(@NonNull String eventTime, @NonNull String hostId, @NonNull String appID, @NonNull String userId, long locationNbr, int routeNbr, int day, @NonNull String logger, @NonNull String eventNbr, @NonNull String addtDesc, int addtNbr) {
        this.eventTime = eventTime;
        this.hostId = hostId;
        this.appID = appID;
        this.userId = userId;
        this.locationNbr = locationNbr;
        this.routeNbr = routeNbr;
        this.day = day;
        this.logger = logger;
        this.eventNbr = eventNbr;
        this.addtDesc = addtDesc;
        this.addtNbr = addtNbr;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @NonNull
    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(@NonNull String eventTime) {
        this.eventTime = eventTime;
    }

    @NonNull
    public String getHostId() {
        return hostId;
    }

    public void setHostId(@NonNull String hostId) {
        this.hostId = hostId;
    }

    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }

    @NonNull
    public String getUserId() {
        return userId;
    }

    public void setUserId(@NonNull String userId) {
        this.userId = userId;
    }

    public long getLocationNbr() {
        return locationNbr;
    }

    public void setLocationNbr(long locationNbr) {
        this.locationNbr = locationNbr;
    }

    public int getRouteNbr() {
        return routeNbr;
    }

    public void setRouteNbr(int routeNbr) {
        this.routeNbr = routeNbr;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @NonNull
    public String getLogger() {
        return logger;
    }

    public void setLogger(@NonNull String logger) {
        this.logger = logger;
    }

    @NonNull
    public String getEventNbr() {
        return eventNbr;
    }

    public void setEventNbr(@NonNull String eventNbr) {
        this.eventNbr = eventNbr;
    }

    @NonNull
    public String getAddtDesc() {
        return addtDesc;
    }

    public void setAddtDesc(@NonNull String addtDesc) {
        this.addtDesc = addtDesc;
    }

    public int getAddtNbr() {
        return addtNbr;
    }

    public void setAddtNbr(int addtNbr) {
        this.addtNbr = addtNbr;
    }

}
