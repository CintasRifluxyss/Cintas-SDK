package com.cintas.sdk;

import androidx.annotation.WorkerThread;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;

@Dao
public interface EnterPriceLoggingTable {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    @WorkerThread
    void insertEnterPriceValue(EnterPriceLoggingData enterPriceLoggingData);


}
