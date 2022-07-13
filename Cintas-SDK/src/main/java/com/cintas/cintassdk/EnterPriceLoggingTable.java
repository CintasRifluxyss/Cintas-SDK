package com.cintas.cintassdk;

import androidx.annotation.WorkerThread;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;


@Dao
public interface EnterPriceLoggingTable {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertEnterPriceValue(EnterPriceLoggingData enterPriceLoggingData);

    @Query("SELECT * FROM PRICE_DETAIL")
    List<EnterPriceLoggingData> getLoggingAllValue();

    @Query("UPDATE PRICE_DETAIL SET EventTime = :eventTime, EventNbr = :eventNbr WHERE UserId = :userID")
    void updateAMcTicketStatusData(String eventTime,String eventNbr, String userID);

    @Delete
    void delete(List<EnterPriceLoggingData> amcTicketDetailsData);

}
