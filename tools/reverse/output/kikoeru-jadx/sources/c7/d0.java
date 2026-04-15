package c7;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3601a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f3602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.d f3604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.c1 f3605e;

    public d0(b0.c1 c1Var, n nVar, String str, c.d dVar) {
        this.f3605e = c1Var;
        this.f3602b = nVar;
        this.f3603c = str;
        this.f3604d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3601a) {
            case 0:
                IBinder binder = this.f3602b.f3672a.getBinder();
                b0.c1 c1Var = this.f3605e;
                s sVar = (s) ((f0) c1Var.f1208b).f3626e.get(binder);
                if (sVar != null) {
                    f0 f0Var = (f0) c1Var.f1208b;
                    f0Var.f3627f = sVar;
                    int i10 = 2 & 2;
                    c.d dVar = this.f3604d;
                    if (i10 != 0) {
                        dVar.b(-1, null);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("media_item", null);
                        dVar.b(0, bundle);
                    }
                    f0Var.f3627f = null;
                } else {
                    Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.f3603c);
                }
                break;
            default:
                IBinder binder2 = this.f3602b.f3672a.getBinder();
                b0.c1 c1Var2 = this.f3605e;
                s sVar2 = (s) ((f0) c1Var2.f1208b).f3626e.get(binder2);
                if (sVar2 != null) {
                    f0 f0Var2 = (f0) c1Var2.f1208b;
                    f0Var2.f3627f = sVar2;
                    this.f3604d.b(-1, null);
                    f0Var2.f3627f = null;
                } else {
                    Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.f3603c);
                }
                break;
        }
    }

    public d0(b0.c1 c1Var, n nVar, String str, Bundle bundle, c.d dVar) {
        this.f3605e = c1Var;
        this.f3602b = nVar;
        this.f3603c = str;
        this.f3604d = dVar;
    }
}
