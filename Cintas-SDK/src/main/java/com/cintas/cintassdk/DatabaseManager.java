package com.cintas.cintassdk;

import android.content.Context;

public class DatabaseManager {

    private static DatabaseManager databaseManager;

    private Lazy<EnterpriseLoggingDatabase> helperDatabaseLazy;

    public static DatabaseManager instance() {
        if (databaseManager == null) {
            databaseManager = new DatabaseManager();
        }
        return databaseManager;
    }

    public void initialize(Context context) {
        helperDatabaseLazy = Lazy.create(() ->  RoomDatabaseClient.build(context));
    }

    public EnterpriseLoggingDatabase enterpriseLoggingDatabase() {
        return instance().helperDatabaseLazy.get();
    }
}
