package p5;

import android.os.Handler;
import m4.u1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f16767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v4.s f16768c;

    public /* synthetic */ y(Handler handler, v4.s sVar, int i10) {
        this.f16766a = i10;
        this.f16767b = handler;
        this.f16768c = sVar;
    }

    private final void b(v4.f fVar) {
        synchronized (fVar) {
        }
        Handler handler = this.f16767b;
        if (handler != null) {
            handler.post(new b5.h(23, this, fVar));
        }
    }

    public final void a(v4.f fVar) {
        switch (this.f16766a) {
            case 0:
                b(fVar);
                break;
            default:
                synchronized (fVar) {
                }
                Handler handler = this.f16767b;
                if (handler != null) {
                    handler.post(new b5.h(27, this, fVar));
                }
                break;
        }
    }

    public void c(u1 u1Var) {
        Handler handler = this.f16767b;
        if (handler != null) {
            handler.post(new b5.h(22, this, u1Var));
        }
    }
}
