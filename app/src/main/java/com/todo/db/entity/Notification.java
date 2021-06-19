package com.todo.db.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.todo.util.MapTypeConverter;

import java.util.Map;

@Entity
public class Notification {

    @PrimaryKey(autoGenerate = true)
    public int id;
    @TypeConverters(MapTypeConverter.class)
    public Map<String, String> data;
    public long createdAt;
}
