package com.cintas.cintassdk;

import android.content.Context;

public class DatabaseManager {

    private DatabaseManager databaseManager;

    private Lazy<EnterpriseLoggingDatabase> helperDatabaseLazy;

    public DatabaseManager instance() {
        if (databaseManager == null) {
            databaseManager = new DatabaseManager();
        }
        return databaseManager;
    }

    public void initialize(Context context) {
        helperDatabaseLazy = Lazy.create(() -> new RoomDatabaseClient(context).getAppDatabase());
    }

    public EnterpriseLoggingDatabase enterpriseLoggingDatabase()
    {
        return instance().helperDatabaseLazy.get();
    }
}
