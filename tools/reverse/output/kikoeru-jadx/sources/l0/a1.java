package l0;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements y0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final androidx.media3.exoplayer.offline.u f11409l = new androidx.media3.exoplayer.offline.u(16, z0.f11667b, n0.f11576e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11411b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o.c0 f11412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f11413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z f11414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k1.o f11415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q0 f11416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f11417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z f11418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z f11419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x0.e1 f11420k;

    public a1(long j10) {
        o.c0 c0Var = o.q.f16031a;
        this.f11412c = new o.c0();
        this.f11413d = new AtomicLong(j10);
        o.c0 c0Var2 = o.q.f16031a;
        jc.l.c(c0Var2, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.f11420k = x0.v.v(c0Var2);
    }

    public final o.c0 a() {
        return (o.c0) this.f11420k.getValue();
    }

    public final boolean b(g2.c0 c0Var, long j10, long j11, s sVar, boolean z10) {
        q0 q0Var = this.f11416g;
        if (q0Var == null) {
            return true;
        }
        s0 s0Var = q0Var.f11599b;
        long jA = s0.a(s0Var, c0Var, j10);
        long jA2 = s0.a(s0Var, c0Var, j11);
        s0Var.l(z10);
        return s0Var.o(jA, jA2, false, sVar);
    }

    public final ArrayList c(g2.c0 c0Var) {
        boolean z10 = this.f11410a;
        ArrayList arrayList = this.f11411b;
        if (!z10) {
            vb.p.M(arrayList, new g5.s(1, new cg.d(14, c0Var)));
            this.f11410a = true;
        }
        return arrayList;
    }

    public final void d(n nVar) {
        long j10 = nVar.f11568a;
        o.c0 c0Var = this.f11412c;
        if (c0Var.b(j10)) {
            this.f11411b.remove(nVar);
            long j11 = nVar.f11568a;
            c0Var.g(j11);
            z zVar = this.f11419j;
            if (zVar != null) {
                zVar.a(Long.valueOf(j11));
            }
        }
    }
}
