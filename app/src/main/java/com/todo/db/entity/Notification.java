package com.todo.db.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Notification {

    @PrimaryKey(autoGenerate = true)
    public int id;
    public String title;
    public String message;
    public long createdAt;
}
