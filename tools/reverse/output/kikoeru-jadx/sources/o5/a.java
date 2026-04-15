package o5;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import m4.d1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Executor f16236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f16237b;

    public a(ExecutorService executorService, d1 d1Var) {
        this.f16236a = executorService;
        this.f16237b = d1Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f16236a.execute(runnable);
    }
}
