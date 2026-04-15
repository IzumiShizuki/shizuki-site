package j2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o2.d f9930a;

    public o0(o2.d dVar) {
        this.f9930a = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        o2.d dVar = this.f9930a;
        synchronized (dVar) {
            dVar.f16147a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        o2.d dVar = this.f9930a;
        synchronized (dVar) {
            dVar.f16147a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        o2.d dVar = this.f9930a;
        synchronized (dVar) {
            dVar.f16147a.c();
        }
    }
}
