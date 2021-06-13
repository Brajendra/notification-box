package com.todo.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.todo.db.dao.NotificationDao;
import com.todo.db.entity.Notification;

@Database(entities = {Notification.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract NotificationDao notificationDao();
}
