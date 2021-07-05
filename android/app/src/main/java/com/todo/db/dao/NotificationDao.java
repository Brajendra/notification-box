package com.todo.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.todo.db.entity.*;

import java.util.List;

@Dao
public interface NotificationDao {

    @Query("SELECT * FROM notification ORDER BY createdAt DESC")
    List<Notification> getAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Notification notification);

}
