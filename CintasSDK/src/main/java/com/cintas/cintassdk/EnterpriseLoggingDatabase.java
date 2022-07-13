package com.cintas.sdk;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = { EnterPriceLoggingData.class }, version = 1, exportSchema = false)
public abstract class EnterpriseLoggingDatabase extends RoomDatabase {

    public abstract EnterPriceLoggingTable getEnterPriceLoggingTable();
}
