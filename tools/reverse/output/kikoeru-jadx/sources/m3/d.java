package m3;

import android.app.Notification;
import android.app.NotificationManager;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static void b(Notification.Action.Builder builder, boolean z10) {
        builder.setAllowGeneratedReplies(z10);
    }

    public static void c(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }
}
