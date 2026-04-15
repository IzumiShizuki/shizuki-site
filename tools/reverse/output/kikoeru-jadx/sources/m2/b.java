package m2;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Icon b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static AutofillId c(View view) {
        return view.getAutofillId();
    }

    public static float d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float e(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static void f(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void g(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void h(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void i(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void j(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void k(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
