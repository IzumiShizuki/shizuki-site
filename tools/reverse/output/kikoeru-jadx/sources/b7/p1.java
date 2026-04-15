package b7;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.cnl.kikoeru.MainService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainService f2022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k9.c f2023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f2024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3.k f2025d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Intent f2027f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m f2030i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1 f2026e = new k1(new Handler(Looper.getMainLooper()), 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f2028g = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2031j = false;

    public p1(MainService mainService, k9.c cVar, m mVar) {
        this.f2022a = mainService;
        this.f2023b = cVar;
        this.f2024c = mVar;
        this.f2025d = new m3.k(mainService);
        this.f2027f = new Intent(mainService, mainService.getClass());
    }

    public final d0 a(v1 v1Var) {
        cb.y yVar = (cb.y) this.f2028g.get(v1Var);
        if (yVar == null || !yVar.isDone()) {
            return null;
        }
        try {
            return (d0) g8.a.B(yVar);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public final void b(boolean z10) {
        ArrayList arrayList;
        m mVar;
        MainService mainService = this.f2022a;
        synchronized (mainService.f4299a) {
            arrayList = new ArrayList(mainService.f4301c.values());
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (c((v1) arrayList.get(i10), false)) {
                return;
            }
        }
        MainService mainService2 = this.f2022a;
        if (p4.c0.f16548a >= 24) {
            mainService2.stopForeground(z10 ? 1 : 2);
        } else {
            mainService2.stopForeground(z10);
        }
        this.f2031j = false;
        if (!z10 || (mVar = this.f2030i) == null) {
            return;
        }
        this.f2025d.f14076b.cancel(null, mVar.f1958b);
        this.f2029h++;
        this.f2030i = null;
    }

    public final boolean c(v1 v1Var, boolean z10) {
        d0 d0VarA = a(v1Var);
        if (d0VarA == null) {
            return false;
        }
        if (d0VarA.r() || z10) {
            return d0VarA.i() == 3 || d0VarA.i() == 2;
        }
        return false;
    }

    public final void d(v1 v1Var, m mVar, boolean z10) {
        MediaSession.Token token = (MediaSession.Token) ((c7.w0) v1Var.f2118a.f1681h.f2012k.f3618b).f3741c.f3607b;
        Notification notification = (Notification) mVar.f1959c;
        int i10 = mVar.f1958b;
        notification.extras.putParcelable("android.mediaSession", token);
        this.f2030i = mVar;
        if (z10) {
            MainService mainService = this.f2022a;
            Intent intent = this.f2027f;
            if (Build.VERSION.SDK_INT >= 26) {
                m2.b.k(mainService, intent);
            } else {
                mainService.startService(intent);
            }
            p4.c0.X(mainService, i10, notification, 2, "mediaPlayback");
            this.f2031j = true;
            return;
        }
        m3.k kVar = this.f2025d;
        NotificationManager notificationManager = kVar.f14076b;
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i10, notification);
        } else {
            m3.g gVar = new m3.g(kVar.f14075a.getPackageName(), i10, notification);
            synchronized (m3.k.f14073f) {
                try {
                    if (m3.k.f14074g == null) {
                        m3.k.f14074g = new m3.j(kVar.f14075a.getApplicationContext());
                    }
                    m3.k.f14074g.f14067b.obtainMessage(0, gVar).sendToTarget();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            notificationManager.cancel(null, i10);
        }
        b(false);
    }
}
