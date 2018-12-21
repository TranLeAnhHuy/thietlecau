package com.example.huy.design;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = savedata.class, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract SaveDataDao getDao();
}
