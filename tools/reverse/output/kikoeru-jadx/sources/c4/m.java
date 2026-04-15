package c4;

import b0.w1;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends android.support.v4.media.session.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.session.b f3386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f3387f;

    public m(android.support.v4.media.session.b bVar, ThreadPoolExecutor threadPoolExecutor) {
        super(5);
        this.f3386e = bVar;
        this.f3387f = threadPoolExecutor;
    }

    @Override // android.support.v4.media.session.b
    public final void N(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f3387f;
        try {
            this.f3386e.N(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void O(w1 w1Var) {
        ThreadPoolExecutor threadPoolExecutor = this.f3387f;
        try {
            this.f3386e.O(w1Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
