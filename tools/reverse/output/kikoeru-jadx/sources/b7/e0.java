package b7;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1749b;

    public /* synthetic */ e0(int i10, Object obj) {
        this.f1748a = i10;
        this.f1749b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1748a) {
            case 0:
                p4.c0.R(((f0) this.f1749b).f1769h, runnable);
                break;
            case 1:
                p4.c0.R(((c2) this.f1749b).f1685l, runnable);
                break;
            default:
                ((Choreographer) this.f1749b).postFrameCallback(new k7.e(runnable));
                break;
        }
    }
}
