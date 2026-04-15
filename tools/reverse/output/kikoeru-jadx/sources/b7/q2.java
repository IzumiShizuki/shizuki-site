package b7;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q2 extends c7.f0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c7.l1 f2041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c2 f2042k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b0.w1 f2043l;

    public q2(c2 c2Var) {
        this.f2041j = c7.l1.a(c2Var.f1679f);
        this.f2042k = c2Var;
        this.f2043l = new b0.w1(c2Var);
    }

    @Override // c7.f0
    public final c7.q a(Bundle bundle) {
        b0.w1 w1Var = this.f3622a;
        w1Var.getClass();
        c7.k1 k1VarN = w1Var.N();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        Bundle bundle2 = bundle;
        boolean zB = this.f2041j.b(k1VarN);
        ya.m0 m0Var = x.f2171a;
        Math.max(0, bundle2.getInt("androidx.media.utils.MediaBrowserCompat.extras.CUSTOM_BROWSER_ACTION_LIMIT", 0));
        t1 t1Var = new t1(k1VarN, 0, 0, zB, null, bundle2);
        AtomicReference atomicReference = new AtomicReference();
        p4.f fVar = new p4.f();
        p4.c0.R(this.f2042k.f1685l, new f(this, atomicReference, t1Var, fVar, 3));
        try {
            fVar.c();
            r1 r1Var = (r1) atomicReference.get();
            r1Var.getClass();
            this.f2043l.x(k1VarN, t1Var, r1Var.f2053a, r1Var.f2054b);
            return s3.f2068a;
        } catch (InterruptedException e10) {
            p4.c.o("MSSLegacyStub", "Couldn't get a result from onConnect", e10);
            return null;
        }
    }

    public final void b(c7.d1 d1Var) {
        attachBaseContext(this.f2042k.f1679f);
        onCreate();
        if (d1Var == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.f3629h != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.f3629h = d1Var;
        b0.w1 w1Var = this.f3622a;
        w1Var.getClass();
        ((c7.f0) w1Var.f1394b).f3628g.b(new cb.t(1, w1Var, d1Var, false));
    }
}
