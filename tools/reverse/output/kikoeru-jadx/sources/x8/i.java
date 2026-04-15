package x8;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import c7.e1;
import java.lang.ref.WeakReference;
import r5.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f24853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f24854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r8.e f24855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24857e = true;

    public i(h8.h hVar) {
        this.f24853a = new WeakReference(hVar);
    }

    public final synchronized void a() {
        r8.e pVar;
        try {
            h8.h hVar = (h8.h) this.f24853a.get();
            if (hVar == null) {
                b();
            } else if (this.f24855c == null) {
                if (hVar.f8228d.f24847b) {
                    Context context = hVar.f8225a;
                    ConnectivityManager connectivityManager = (ConnectivityManager) android.support.v4.media.session.b.I(context, ConnectivityManager.class);
                    if (connectivityManager == null || android.support.v4.media.session.b.z(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                        pVar = new p(2);
                    } else {
                        try {
                            pVar = new e1(connectivityManager, this);
                        } catch (Exception unused) {
                            pVar = new p(2);
                        }
                    }
                } else {
                    pVar = new p(2);
                }
                this.f24855c = pVar;
                this.f24857e = pVar.g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f24856d) {
                return;
            }
            this.f24856d = true;
            Context context = this.f24854b;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            r8.e eVar = this.f24855c;
            if (eVar != null) {
                eVar.shutdown();
            }
            this.f24853a.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((h8.h) this.f24853a.get()) == null) {
            b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i10) {
        h8.h hVar = (h8.h) this.f24853a.get();
        if (hVar != null) {
            q8.d dVar = (q8.d) hVar.f8227c.getValue();
            if (dVar != null) {
                dVar.f17918a.b(i10);
                dVar.f17919b.b(i10);
            }
        } else {
            b();
        }
    }
}
