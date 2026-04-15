package j2;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf.k f10015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.k f10016b;

    public u0(hf.k kVar, v0 v0Var, ic.k kVar2) {
        this.f10015a = kVar;
        this.f10016b = kVar2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        Object objB;
        try {
            objB = this.f10016b.a(Long.valueOf(j10));
        } catch (Throwable th2) {
            objB = ub.a.b(th2);
        }
        this.f10015a.h(objB);
    }
}
