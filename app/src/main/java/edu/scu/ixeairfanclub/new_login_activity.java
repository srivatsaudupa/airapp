package edu.scu.ixeairfanclub;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Srivatsa on 05-05-2017.
 */

public class new_login_activity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        Button button = (Button)findViewById(R.id.email_sign_in_button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent nInt = new Intent();
                PendingIntent pI = PendingIntent.getActivity(new_login_activity.this,0,nInt,0);
                Notification notif = new Notification.Builder(new_login_activity.this)
                        .setTicker("Not Take")
                        .setContentTitle("Notification")
                        .setContentText("Notified")
                        .setSmallIcon(R.drawable.icon)
                        .setContentIntent(pI).getNotification();
                notif.flags = Notification.FLAG_AUTO_CANCEL;
                NotificationManager notMan = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                notMan.notify(0,notif);

            }
        });
    }
}
