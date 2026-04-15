package k9;

import android.app.NotificationManager;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import b7.c3;
import b7.n;
import com.cnl.kikoeru.MainService;
import com.cnl.kikoeru.R;
import lf.f;
import yb.h;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f11233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f11236e;

    public c() {
        this.f11232a = 3;
        this.f11235d = new Object();
        this.f11233b = null;
        this.f11236e = null;
        this.f11234c = 0;
    }

    public Looper a() {
        Looper looper;
        synchronized (this.f11235d) {
            try {
                if (((Looper) this.f11233b) == null) {
                    p4.c.i(this.f11234c == 0 && ((HandlerThread) this.f11236e) == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f11236e = handlerThread;
                    handlerThread.start();
                    this.f11233b = ((HandlerThread) this.f11236e).getLooper();
                }
                this.f11234c++;
                looper = (Looper) this.f11233b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void b() {
        HandlerThread handlerThread;
        synchronized (this.f11235d) {
            try {
                p4.c.i(this.f11234c > 0);
                int i10 = this.f11234c - 1;
                this.f11234c = i10;
                if (i10 == 0 && (handlerThread = (HandlerThread) this.f11236e) != null) {
                    handlerThread.quit();
                    this.f11236e = null;
                    this.f11233b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public c(n nVar) {
        this.f11232a = 1;
        Context context = (Context) nVar.f1985c;
        this.f11235d = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        p4.c.j(notificationManager);
        this.f11233b = notificationManager;
        this.f11234c = R.drawable.media3_notification_small_icon;
    }

    public c(int i10, kf.a aVar, f fVar, h hVar) {
        this.f11232a = 2;
        this.f11235d = fVar;
        this.f11234c = i10;
        this.f11233b = aVar;
        this.f11236e = hVar;
    }

    public c(MainService mainService, c3 c3Var) {
        this.f11232a = 0;
        this.f11235d = mainService;
        NotificationManager notificationManager = (NotificationManager) mainService.getSystemService("notification");
        p4.c.j(notificationManager);
        this.f11233b = notificationManager;
        this.f11234c = R.drawable.media3_notification_small_icon;
    }
}
