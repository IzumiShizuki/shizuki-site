package c7;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import b0.w1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 extends Service {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f3621i = Log.isLoggable("MBServiceCompat", 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w1 f3622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0.c1 f3623b = new b0.c1(13, this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f3624c = new s(this, "android.media.session.MediaController", -1, -1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f3625d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o.e f3626e = new o.e(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f3627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b5.d f3628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d1 f3629h;

    public f0() {
        b5.d dVar = new b5.d();
        dVar.f1519b = this;
        this.f3628g = dVar;
    }

    public abstract q a(Bundle bundle);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        w1 w1Var = this.f3622a;
        w1Var.getClass();
        t tVar = (t) w1Var.f1396d;
        tVar.getClass();
        return tVar.onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f3622a = new y(this);
        } else if (i10 >= 26) {
            this.f3622a = new x(this);
        } else if (i10 >= 23) {
            this.f3622a = new v(this);
        } else {
            this.f3622a = new w1(this);
        }
        this.f3622a.Y();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f3628g.f1519b = null;
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
