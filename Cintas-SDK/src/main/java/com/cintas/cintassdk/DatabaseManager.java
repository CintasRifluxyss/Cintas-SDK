package com.cintas.cintassdk;

import android.content.Context;

public class DatabaseManager {

    private static DatabaseManager databaseManager;

    private Lazy<EnterpriseLoggingDatabase> loggingDatabaseLazy;

    public static DatabaseManager instance() {
        if (databaseManager == null) {
            databaseManager = new DatabaseManager();
        }
        return databaseManager;
    }

    public void initialize(Context context) {
        loggingDatabaseLazy = Lazy.create(() -> new RoomDatabaseClient(context).getInstance().getAppDatabase());
    }

    public EnterpriseLoggingDatabase enterpriseLoggingDatabase() {
        return instance().loggingDatabaseLazy.get();
    }
}
