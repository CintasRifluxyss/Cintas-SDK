package com.cintas.cintassdk;

import android.os.Build;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.UUID;

@Entity(tableName = "PRICE_DETAIL")
public class EnterPriceLoggingData {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "Id")
    public int Id;

    @ColumnInfo(name = "EventTime")
    @NonNull
    public String eventTime;

    @ColumnInfo(name = "HostId")
    @NonNull
    public String hostId;

    @ColumnInfo(name = "AppID")
    @NonNull
    public String appID;

    @ColumnInfo(name = "UserId")
    @NonNull
    public String userId;

    @ColumnInfo(name = "LocationNbr")
    public String locationNbr;

    @ColumnInfo(name = "RouteNbr")
    public int routeNbr;

    @ColumnInfo(name = "Day")
    public int day;

    @ColumnInfo(name = "Logger")
    @NonNull
    public String logger;

    @ColumnInfo(name = "EventNbr")
    @NonNull
    public int eventNbr;

    @ColumnInfo(name = "AddtDesc")
    @NonNull
    public String addtDesc;

    @ColumnInfo(name = "AddtNbr")
    public String addtNbr;

    public EnterPriceLoggingData(@NonNull String hostId,@NonNull String appID, @NonNull String userId, String locationNbr, int routeNbr, int day, @NonNull String logger, @NonNull int eventNbr, @NonNull String addtDesc, String addtNbr) {
        this.eventTime = new RoomDatabaseWrapper().getDeviceCurrentTime();
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

    @NonNull
    public String getEventTime() {
        return eventTime;
    }

    @NonNull
    public String getHostId() {
        return hostId;
    }

    public String getAppID() {
        return appID;
    }

    @NonNull
    public String getUserId() {
        return userId;
    }

    public String getLocationNbr() {
        return locationNbr;
    }

    public int getRouteNbr() {
        return routeNbr;
    }

    public int getDay() {
        return day;
    }

    @NonNull
    public String getLogger() {
        return logger;
    }

    @NonNull
    public int getEventNbr() {
        return eventNbr;
    }

    @NonNull
    public String getAddtDesc() {
        return addtDesc;
    }

    public String getAddtNbr() {
        return addtNbr;
    }


}
