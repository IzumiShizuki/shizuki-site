package m3;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f14027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f14028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f14032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PendingIntent f14033g;

    public b(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        int i10;
        Bundle bundle = new Bundle();
        this.f14030d = true;
        this.f14028b = iconCompat;
        int iIntValue = iconCompat.f740a;
        if (iIntValue == -1 && (i10 = Build.VERSION.SDK_INT) >= 23) {
            Object obj = iconCompat.f741b;
            if (i10 >= 28) {
                iIntValue = e.i(obj);
            } else {
                try {
                    iIntValue = ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                } catch (IllegalAccessException e10) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                    iIntValue = -1;
                } catch (NoSuchMethodException e11) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                    iIntValue = -1;
                } catch (InvocationTargetException e12) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                    iIntValue = -1;
                }
            }
        }
        if (iIntValue == 2) {
            this.f14031e = iconCompat.d();
        }
        this.f14032f = c.b(charSequence);
        this.f14033g = pendingIntent;
        this.f14027a = bundle;
        this.f14029c = true;
        this.f14030d = true;
    }
}
