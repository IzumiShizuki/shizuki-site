package k7;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11166a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f11166a) {
            case 0:
                runnable.run();
                break;
            case 1:
                m.a.W().f12629b.f12632c.execute(runnable);
                break;
        }
    }

    private final void a(Runnable runnable) {
    }
}
