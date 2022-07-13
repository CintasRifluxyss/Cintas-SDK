package com.cintas.sdk;

import android.content.Context;

import androidx.room.Room;

public class RoomDatabaseClient {

    private RoomDatabaseClient mInstance;

    private final Context mContext;

    private EnterpriseLoggingDatabase mEnterpriseLoggingDatabase;

    public RoomDatabaseClient(Context context) {
        this.mContext = context;
    }

    public synchronized RoomDatabaseClient getInstance(Context mCtx) {
        if (mInstance == null) {
            mInstance = new RoomDatabaseClient(mCtx);
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
