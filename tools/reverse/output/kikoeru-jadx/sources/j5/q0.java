package j5;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements n5.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f10394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4.d0 f10395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c7.e1 f10396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t0 f10397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p4.f f10398e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f10400g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f10402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s4.m f10403j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r5.h0 f10404k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10405l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t0 f10406m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0.a f10399f = new b0.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10401h = true;

    public q0(t0 t0Var, Uri uri, s4.h hVar, c7.e1 e1Var, t0 t0Var2, p4.f fVar) {
        this.f10406m = t0Var;
        this.f10394a = uri;
        this.f10395b = new s4.d0(hVar);
        this.f10396c = e1Var;
        this.f10397d = t0Var2;
        this.f10398e = fVar;
        u.f10444b.getAndIncrement();
        this.f10403j = a(0L);
    }

    public final s4.m a(long j10) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f10406m.f10426i;
        Map map2 = t0.Q;
        Uri uri = this.f10394a;
        p4.c.k(uri, "The uri must be set.");
        return new s4.m(uri, 0L, 1, null, map2, j10, -1L, str, 6);
    }

    @Override // n5.l
    public final void i() {
        s4.h tVar;
        r5.n nVar;
        int i10;
        int iG = 0;
        while (iG == 0 && !this.f10400g) {
            try {
                long j10 = this.f10399f.f1169a;
                s4.m mVarA = a(j10);
                this.f10403j = mVarA;
                long jF = this.f10395b.f(mVarA);
                if (this.f10400g) {
                    if (iG != 1 && this.f10396c.A() != -1) {
                        this.f10399f.f1169a = this.f10396c.A();
                    }
                    nh.a.h(this.f10395b);
                    return;
                }
                if (jF != -1) {
                    jF += j10;
                    t0 t0Var = this.f10406m;
                    t0Var.f10435r.post(new o0(t0Var, 0));
                }
                long j11 = jF;
                this.f10406m.f10437t = e6.b.d(this.f10395b.f19397a.p());
                s4.d0 d0Var = this.f10395b;
                e6.b bVar = this.f10406m.f10437t;
                if (bVar == null || (i10 = bVar.f6294f) == -1) {
                    tVar = d0Var;
                } else {
                    tVar = new t(d0Var, i10, this);
                    r5.h0 h0VarD = this.f10406m.D(new s0(0, true));
                    this.f10404k = h0VarD;
                    h0VarD.b(t0.R);
                }
                this.f10396c.I(tVar, this.f10394a, this.f10395b.f19397a.p(), j10, j11, this.f10397d);
                if (this.f10406m.f10437t != null && (nVar = (r5.n) this.f10396c.f3619c) != null) {
                    r5.n nVarC = nVar.c();
                    if (nVarC instanceof k6.d) {
                        ((k6.d) nVarC).f11142r = true;
                    }
                }
                if (this.f10401h) {
                    c7.e1 e1Var = this.f10396c;
                    long j12 = this.f10402i;
                    r5.n nVar2 = (r5.n) e1Var.f3619c;
                    nVar2.getClass();
                    nVar2.i(j10, j12);
                    this.f10401h = false;
                }
                while (iG == 0 && !this.f10400g) {
                    try {
                        this.f10398e.c();
                        c7.e1 e1Var2 = this.f10396c;
                        b0.a aVar = this.f10399f;
                        r5.n nVar3 = (r5.n) e1Var2.f3619c;
                        nVar3.getClass();
                        r5.k kVar = (r5.k) e1Var2.f3620d;
                        kVar.getClass();
                        iG = nVar3.g(kVar, aVar);
                        long jA = this.f10396c.A();
                        if (jA > this.f10406m.f10427j + j10) {
                            p4.f fVar = this.f10398e;
                            synchronized (fVar) {
                                fVar.f16572a = false;
                            }
                            t0 t0Var2 = this.f10406m;
                            t0Var2.f10435r.post(t0Var2.f10434q);
                            j10 = jA;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iG == 1) {
                    iG = 0;
                } else if (this.f10396c.A() != -1) {
                    this.f10399f.f1169a = this.f10396c.A();
                }
                nh.a.h(this.f10395b);
            } catch (Throwable th2) {
                if (iG != 1 && this.f10396c.A() != -1) {
                    this.f10399f.f1169a = this.f10396c.A();
                }
                nh.a.h(this.f10395b);
                throw th2;
            }
        }
    }

    @Override // n5.l
    public final void l() {
        this.f10400g = true;
    }
}
