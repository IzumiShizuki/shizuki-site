package cb;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f3842d = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f3843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f3844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f3845c;

    public d(Runnable runnable, Executor executor) {
        this.f3843a = runnable;
        this.f3844b = executor;
    }

    public d() {
        this.f3843a = null;
        this.f3844b = null;
    }
}
