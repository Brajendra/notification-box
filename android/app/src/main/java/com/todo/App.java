package com.todo;

import android.app.Application;

import androidx.room.Room;

import com.todo.db.AppDatabase;

public class App extends Application {
    private AppDatabase db;

    @Override
    public void onCreate() {
        super.onCreate();
        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "todo_db").allowMainThreadQueries().build();
    }

    public AppDatabase getDatabase() {
        return db;
    }
}
