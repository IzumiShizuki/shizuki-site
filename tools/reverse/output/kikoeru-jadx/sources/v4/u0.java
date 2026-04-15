package v4;

import android.os.SystemClock;
import j5.o1;
import java.util.List;
import m4.e1;
import m4.i1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final j5.d0 f22651u = new j5.d0(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f22652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j5.d0 f22653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f22657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f22658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o1 f22659h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m5.u f22660i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f22661j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j5.d0 f22662k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f22663l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f22664m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f22665n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m4.s0 f22666o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f22667p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f22668q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f22669r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f22670s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile long f22671t;

    public u0(i1 i1Var, j5.d0 d0Var, long j10, long j11, int i10, m mVar, boolean z10, o1 o1Var, m5.u uVar, List list, j5.d0 d0Var2, boolean z11, int i11, int i12, m4.s0 s0Var, long j12, long j13, long j14, long j15, boolean z12) {
        this.f22652a = i1Var;
        this.f22653b = d0Var;
        this.f22654c = j10;
        this.f22655d = j11;
        this.f22656e = i10;
        this.f22657f = mVar;
        this.f22658g = z10;
        this.f22659h = o1Var;
        this.f22660i = uVar;
        this.f22661j = list;
        this.f22662k = d0Var2;
        this.f22663l = z11;
        this.f22664m = i11;
        this.f22665n = i12;
        this.f22666o = s0Var;
        this.f22668q = j12;
        this.f22669r = j13;
        this.f22670s = j14;
        this.f22671t = j15;
        this.f22667p = z12;
    }

    public static u0 h(m5.u uVar) {
        e1 e1Var = i1.f14291a;
        o1 o1Var = o1.f10377d;
        ya.a1 a1Var = ya.a1.f25946e;
        m4.s0 s0Var = m4.s0.f14578d;
        j5.d0 d0Var = f22651u;
        return new u0(e1Var, d0Var, -9223372036854775807L, 0L, 1, null, false, o1Var, uVar, a1Var, d0Var, false, 1, 0, s0Var, 0L, 0L, 0L, 0L, false);
    }

    public final u0 a(j5.d0 d0Var) {
        return new u0(this.f22652a, this.f22653b, this.f22654c, this.f22655d, this.f22656e, this.f22657f, this.f22658g, this.f22659h, this.f22660i, this.f22661j, d0Var, this.f22663l, this.f22664m, this.f22665n, this.f22666o, this.f22668q, this.f22669r, this.f22670s, this.f22671t, this.f22667p);
    }

    public final u0 b(j5.d0 d0Var, long j10, long j11, long j12, long j13, o1 o1Var, m5.u uVar, List list) {
        return new u0(this.f22652a, d0Var, j11, j12, this.f22656e, this.f22657f, this.f22658g, o1Var, uVar, list, this.f22662k, this.f22663l, this.f22664m, this.f22665n, this.f22666o, this.f22668q, j13, j10, SystemClock.elapsedRealtime(), this.f22667p);
    }

    public final u0 c(int i10, int i11, boolean z10) {
        return new u0(this.f22652a, this.f22653b, this.f22654c, this.f22655d, this.f22656e, this.f22657f, this.f22658g, this.f22659h, this.f22660i, this.f22661j, this.f22662k, z10, i10, i11, this.f22666o, this.f22668q, this.f22669r, this.f22670s, this.f22671t, this.f22667p);
    }

    public final u0 d(m mVar) {
        return new u0(this.f22652a, this.f22653b, this.f22654c, this.f22655d, this.f22656e, mVar, this.f22658g, this.f22659h, this.f22660i, this.f22661j, this.f22662k, this.f22663l, this.f22664m, this.f22665n, this.f22666o, this.f22668q, this.f22669r, this.f22670s, this.f22671t, this.f22667p);
    }

    public final u0 e(m4.s0 s0Var) {
        return new u0(this.f22652a, this.f22653b, this.f22654c, this.f22655d, this.f22656e, this.f22657f, this.f22658g, this.f22659h, this.f22660i, this.f22661j, this.f22662k, this.f22663l, this.f22664m, this.f22665n, s0Var, this.f22668q, this.f22669r, this.f22670s, this.f22671t, this.f22667p);
    }

    public final u0 f(int i10) {
        return new u0(this.f22652a, this.f22653b, this.f22654c, this.f22655d, i10, this.f22657f, this.f22658g, this.f22659h, this.f22660i, this.f22661j, this.f22662k, this.f22663l, this.f22664m, this.f22665n, this.f22666o, this.f22668q, this.f22669r, this.f22670s, this.f22671t, this.f22667p);
    }

    public final u0 g(i1 i1Var) {
        return new u0(i1Var, this.f22653b, this.f22654c, this.f22655d, this.f22656e, this.f22657f, this.f22658g, this.f22659h, this.f22660i, this.f22661j, this.f22662k, this.f22663l, this.f22664m, this.f22665n, this.f22666o, this.f22668q, this.f22669r, this.f22670s, this.f22671t, this.f22667p);
    }

    public final long i() {
        long j10;
        long j11;
        if (!j()) {
            return this.f22670s;
        }
        do {
            j10 = this.f22671t;
            j11 = this.f22670s;
        } while (j10 != this.f22671t);
        return p4.c0.N(p4.c0.c0(j11) + ((long) ((SystemClock.elapsedRealtime() - j10) * this.f22666o.f14581a)));
    }

    public final boolean j() {
        return this.f22656e == 3 && this.f22663l && this.f22665n == 0;
    }
}
