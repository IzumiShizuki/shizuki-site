package c7;

import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f3582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0.c1 f3583c;

    public /* synthetic */ a0(b0.c1 c1Var, n nVar, int i10) {
        this.f3581a = i10;
        this.f3583c = c1Var;
        this.f3582b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3581a) {
            case 0:
                s sVar = (s) ((f0) this.f3583c.f1208b).f3626e.remove(this.f3582b.f3672a.getBinder());
                if (sVar != null) {
                    n nVar = sVar.f3723e;
                    nVar.getClass();
                    nVar.f3672a.getBinder().unlinkToDeath(sVar, 0);
                }
                break;
            default:
                IBinder binder = this.f3582b.f3672a.getBinder();
                s sVar2 = (s) ((f0) this.f3583c.f1208b).f3626e.remove(binder);
                if (sVar2 != null) {
                    binder.unlinkToDeath(sVar2, 0);
                }
                break;
        }
    }
}
