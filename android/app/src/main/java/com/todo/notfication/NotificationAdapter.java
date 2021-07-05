package com.todo.notfication;

import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.todo.R;
import com.todo.db.entity.*;

import java.util.ArrayList;
import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder> {

    private List<Notification> notifications = new ArrayList<>();


    public void setItems(List<Notification> notifications) {
        this.notifications = notifications;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NotificationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_notifcation_main, parent, false);

        return new NotificationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationViewHolder holder, int position) {
        holder.bind(notifications.get(position));
    }

    @Override
    public int getItemCount() {
        return notifications.size();
    }

    public static class NotificationViewHolder extends RecyclerView.ViewHolder {
        private final LinearLayout linearLayout;
        private final TextView createdAt;

        public NotificationViewHolder(View view) {
            super(view);
            linearLayout = view.findViewById(R.id.item_main);
            createdAt = view.findViewById(R.id.createdAt);
        }

        public void bind(Notification notification) {
            linearLayout.removeAllViews();
            for (String key : notification.data.keySet()) {
                View view = LayoutInflater.from(itemView.getContext()).inflate(R.layout.item_notifcation, null, false);
                TextView title = view.findViewById(R.id.title);
                TextView message = view.findViewById(R.id.message);

                title.setText(key);
                message.setText(notification.data.get(key));
                linearLayout.addView(view);
            }
            String time =  DateUtils.formatDateTime(itemView.getContext(), notification.createdAt, DateUtils.FORMAT_SHOW_TIME);
            String date =  DateUtils.formatDateTime(itemView.getContext(), notification.createdAt, DateUtils.FORMAT_SHOW_DATE);
            createdAt.setText(date+" "+time);
        }
    }
}



