package com.cintas.cintassdk;

import android.content.Context;

import androidx.annotation.NonNull;

public class RoomDatabaseWrapper {

    public EnterPriceLoggingData createLogs(@NonNull String eventTime, @NonNull String hostId, @NonNull String appID, @NonNull String userId, long locationNbr, int routeNbr, int day, @NonNull String logger, @NonNull String eventNbr, @NonNull String addtDesc, int addtNbr ) {
        return new EnterPriceLoggingData(eventTime,hostId,appID,userId,locationNbr,routeNbr,day,logger,eventNbr,addtDesc,addtNbr);
    }
}
