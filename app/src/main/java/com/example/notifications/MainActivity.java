package com.example.notifications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.TaskStackBuilder;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final int NOTIFICATION_ID = 1;
    private static final String CHANNEL_ID = "Colocol";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        NotificationCompat.Builder mBuilder =
                 new  NotificationCompat.Builder(this,CHANNEL_ID)
                        .setSmallIcon(R.drawable.free_icon_bell_8262175)
                        .setContentTitle("Колокольчик")
                        .setContentText("Колокольчик звенит, колокольчик зовет");

        Intent resultIntent = new Intent(this, MainActivity.class);

        NotificationManager notificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(NOTIFICATION_ID, mBuilder.build());
    }
}