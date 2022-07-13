package com.cintas.cintassdk;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Room;

public abstract class RoomDatabaseClient extends EnterpriseLoggingDatabase{

    private static EnterpriseLoggingDatabase mEnterpriseLoggingDatabase;

    public static EnterpriseLoggingDatabase build(Context mContext) {
        if (mContext != null) {
            mEnterpriseLoggingDatabase = Room.databaseBuilder(mContext, EnterpriseLoggingDatabase.class, "cintasDatabase").fallbackToDestructiveMigration().allowMainThreadQueries().build();
        }
        return mEnterpriseLoggingDatabase;
    }

}
