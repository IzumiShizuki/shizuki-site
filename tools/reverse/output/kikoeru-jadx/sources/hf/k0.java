package hf;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f8562a;

    public k0(u uVar) {
        this.f8562a = uVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws h0 {
        u uVar = this.f8562a;
        yb.i iVar = yb.i.f26088a;
        if (nf.b.j(uVar, iVar)) {
            nf.b.i(uVar, iVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f8562a.toString();
    }
}
