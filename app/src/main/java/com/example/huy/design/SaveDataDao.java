package com.example.huy.design;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface SaveDataDao {
    @Query("select * from savedata")
    List<savedata> getAllData();

    @Query("select * from savedata where edtTenDuAn = :name")
    savedata getDataByName(String name);

    @Insert(onConflict = REPLACE)
    void insertData(savedata data);
}
