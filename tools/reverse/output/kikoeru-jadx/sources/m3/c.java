package m3;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.q;
import c7.e1;
import com.cnl.kikoeru.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14034a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f14038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f14039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f14040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IconCompat f14041h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q f14044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14047n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f14048o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Bundle f14049p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f14051r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f14053t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Notification f14054u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f14055v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14035b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14036c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f14037d = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14042i = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14050q = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14052s = 0;

    public c(Context context, String str) {
        Notification notification = new Notification();
        this.f14054u = notification;
        this.f14034a = context;
        this.f14051r = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f14055v = new ArrayList();
        this.f14053t = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification notificationBuild;
        e1 e1Var = new e1(this);
        c cVar = (c) e1Var.f3619c;
        q qVar = cVar.f14044k;
        if (qVar != null) {
            qVar.X0(e1Var);
        }
        Notification.Builder builder = (Notification.Builder) e1Var.f3618b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26 && i10 < 24) {
            builder.setExtras((Bundle) e1Var.f3620d);
            notificationBuild = builder.build();
        } else {
            notificationBuild = builder.build();
        }
        if (qVar != null) {
            cVar.f14044k.getClass();
        }
        if (qVar != null && notificationBuild.extras != null) {
            qVar.getClass();
        }
        return notificationBuild;
    }

    public final void c(int i10, boolean z10) {
        Notification notification = this.f14054u;
        if (z10) {
            notification.flags = i10 | notification.flags;
        } else {
            notification.flags = (~i10) & notification.flags;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f14034a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f739k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f741b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f14041h = iconCompat;
    }

    public final void e(q qVar) {
        if (this.f14044k != qVar) {
            this.f14044k = qVar;
            if (qVar == null || ((c) qVar.f801a) == this) {
                return;
            }
            qVar.f801a = this;
            e(qVar);
        }
    }
}
