package com.cintas.cintassdk;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Room;

public class RoomDatabaseClient  {

    private RoomDatabaseClient mInstance;

    private final Context mContext;

    private EnterpriseLoggingDatabase mEnterpriseLoggingDatabase;

    public RoomDatabaseClient(Context context) {
        this.mContext = context;
    }

    public synchronized RoomDatabaseClient getInstance() {
        if (mInstance == null) {
            mInstance = new RoomDatabaseClient(mContext);
        }
        return mInstance;
    }

    public EnterpriseLoggingDatabase getAppDatabase() {
        if (mContext != null) {
            mEnterpriseLoggingDatabase = Room.databaseBuilder(mContext, EnterpriseLoggingDatabase.class, "cintasDatabase").fallbackToDestructiveMigration().allowMainThreadQueries().build();
        }
        return mEnterpriseLoggingDatabase;
    }

}
