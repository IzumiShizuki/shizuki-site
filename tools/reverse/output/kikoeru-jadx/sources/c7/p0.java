package c7;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.ViewStructure;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {
    public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    public static Bundle b(ViewStructure viewStructure) {
        return viewStructure.getExtras();
    }

    public static int c(Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    public static Uri d(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static Object e(Context context, Class cls) {
        return context.getSystemService(cls);
    }

    public static String f(Context context, Class cls) {
        return context.getSystemServiceName(cls);
    }

    public static boolean g(TextPaint textPaint, String str) {
        return textPaint.hasGlyph(str);
    }

    public static void h(Activity activity, String[] strArr, int i10) {
        activity.requestPermissions(strArr, i10);
    }

    public static void i(ViewStructure viewStructure, String str) {
        viewStructure.setClassName(str);
    }

    public static void j(ViewStructure viewStructure, String str) {
        viewStructure.setContentDescription(str);
    }

    public static void k(ViewStructure viewStructure, int i10, int i11, int i12, int i13) {
        viewStructure.setDimens(i10, i11, 0, 0, i12, i13);
    }

    public static void l(ViewStructure viewStructure, int i10, String str) {
        viewStructure.setId(i10, null, null, str);
    }

    public static void m(Notification.Builder builder, Icon icon) {
        builder.setLargeIcon(icon);
    }

    public static boolean n(Drawable drawable, int i10) {
        return drawable.setLayoutDirection(i10);
    }

    public static void o(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }

    public static void p(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }

    public static void q(ViewStructure viewStructure, float f10) {
        viewStructure.setTextStyle(f10, 0, 0, 0);
    }

    public static boolean r(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static boolean s(Activity activity, String str) {
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public static boolean t(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.drawable.Icon u(androidx.core.graphics.drawable.IconCompat r7, android.content.Context r8) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.p0.u(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
    }
}
