package b7;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k1 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f1915b;

    public /* synthetic */ k1(Handler handler, int i10) {
        this.f1914a = i10;
        this.f1915b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1914a) {
            case 0:
                p4.c0.R(this.f1915b, runnable);
                break;
            default:
                this.f1915b.post(runnable);
                break;
        }
    }
}
