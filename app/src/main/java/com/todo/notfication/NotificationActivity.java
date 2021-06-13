package com.todo.notfication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.todo.App;
import com.todo.R;
import com.todo.db.entity.*;

import java.util.List;

public class NotificationActivity extends AppCompatActivity {

    private NotificationAdapter notificationAdapter;
    private SwipeRefreshLayout swipeRefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifcation);


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        swipeRefresh = findViewById(R.id.swipeRefresh);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        notificationAdapter = new NotificationAdapter();
        recyclerView.setAdapter(notificationAdapter);


        swipeRefresh.setOnRefreshListener(() -> {
            loadData();
            swipeRefresh.setRefreshing(false);
        });
        loadData();
    }

    void loadData() {
        App app = (App) getApplicationContext();
        List<Notification> notifications = app.getDatabase().notificationDao().getAll();
        notificationAdapter.setItems(notifications);
        clearNotification();
    }

    void clearNotification() {
        try {
            NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.cancelAll();
        } catch (Throwable th) {

        }
    }
}