package hf;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8544b;

    public /* synthetic */ h(int i10, Object obj) {
        this.f8543a = i10;
        this.f8544b = obj;
    }

    @Override // hf.i
    public final void b(Throwable th2) {
        switch (this.f8543a) {
            case 0:
                ((ScheduledFuture) this.f8544b).cancel(false);
                break;
            case 1:
                ((ic.k) this.f8544b).a(th2);
                break;
            default:
                ((n0) this.f8544b).a();
                break;
        }
    }

    public final String toString() {
        switch (this.f8543a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f8544b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((ic.k) this.f8544b).getClass().getSimpleName() + '@' + a0.q(this) + ']';
            default:
                return "DisposeOnCancel[" + ((n0) this.f8544b) + ']';
        }
    }
}
