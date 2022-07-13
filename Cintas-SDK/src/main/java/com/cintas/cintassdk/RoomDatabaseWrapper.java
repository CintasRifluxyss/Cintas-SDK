package com.cintas.cintassdk;

import androidx.annotation.NonNull;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class RoomDatabaseWrapper {

    private EnterpriseLoggingDatabase db = new DatabaseManager().enterpriseLoggingDatabase();

    public EnterPriceLoggingData createLogs(@NonNull String appID, @NonNull String userId, long locationNbr, int routeNbr, int day, @NonNull String logger, @NonNull String eventNbr, @NonNull String addtDesc, int addtNbr ) {
        return new EnterPriceLoggingData(appID,userId,locationNbr,routeNbr,day,logger,eventNbr,addtDesc,addtNbr);
    }

    protected String getDeviceCurrentTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss aa", Locale.getDefault());
        return sdf.format(new Date());
    }

    public void insertLoggingIntoDb(EnterPriceLoggingData enterPriceLoggingData) {
        db.getEnterPriceLoggingTable().insertEnterPriceValue(enterPriceLoggingData);
    }

}
