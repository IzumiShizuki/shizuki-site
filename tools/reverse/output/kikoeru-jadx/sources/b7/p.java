package b7;

import android.app.NotificationChannel;
import android.app.NotificationManager;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static void a(NotificationManager notificationManager, String str, String str2) {
        NotificationChannel notificationChannelA = p4.q.a(str, str2);
        if (p4.c0.f16548a <= 27) {
            notificationChannelA.setShowBadge(false);
        }
        notificationManager.createNotificationChannel(notificationChannelA);
    }
}
