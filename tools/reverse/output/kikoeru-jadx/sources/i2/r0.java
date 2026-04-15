package i2;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class r0 extends q0 implements g2.u0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g1 f8831o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinkedHashMap f8833q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public g2.w0 f8835s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o.f0 f8836t;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f8832p = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g2.r0 f8834r = new g2.r0(this);

    public r0(g1 g1Var) {
        this.f8831o = g1Var;
        o.f0 f0Var = o.p0.f16030a;
        this.f8836t = new o.f0();
    }

    public static final void B0(r0 r0Var, g2.w0 w0Var) {
        LinkedHashMap linkedHashMap;
        if (w0Var != null) {
            r0Var.h0((((long) w0Var.b()) & 4294967295L) | (((long) w0Var.h()) << 32));
        } else {
            r0Var.h0(0L);
        }
        if (!jc.l.a(r0Var.f8835s, w0Var) && w0Var != null && ((((linkedHashMap = r0Var.f8833q) != null && !linkedHashMap.isEmpty()) || !w0Var.i().isEmpty()) && !jc.l.a(w0Var.i(), r0Var.f8833q))) {
            v0 v0Var = r0Var.f8831o.f8700o.G.f8806q;
            jc.l.b(v0Var);
            v0Var.f8874s.f();
            LinkedHashMap linkedHashMap2 = r0Var.f8833q;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                r0Var.f8833q = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(w0Var.i());
        }
        r0Var.f8835s = w0Var;
    }

    @Override // g2.g1, g2.u0
    public final Object A() {
        return this.f8831o.A();
    }

    @Override // i2.q0
    public final void A0() {
        Y(this.f8832p, 0.0f, null);
    }

    public final long C0() {
        return (((long) this.f7181b) & 4294967295L) | (((long) this.f7180a) << 32);
    }

    public void D0() {
        u0().j();
    }

    public final void E0(long j10) {
        if (!f3.j.b(this.f8832p, j10)) {
            this.f8832p = j10;
            g1 g1Var = this.f8831o;
            v0 v0Var = g1Var.f8700o.G.f8806q;
            if (v0Var != null) {
                v0Var.o0();
            }
            q0.y0(g1Var);
        }
        if (this.f8824k) {
            return;
        }
        p0(u0());
    }

    public final long F0(r0 r0Var, boolean z10) {
        long jD = 0;
        r0 r0VarK0 = this;
        while (!r0VarK0.equals(r0Var)) {
            if (!r0VarK0.f8822i || !z10) {
                jD = f3.j.d(jD, r0VarK0.f8832p);
            }
            g1 g1Var = r0VarK0.f8831o.f8704s;
            jc.l.b(g1Var);
            r0VarK0 = g1Var.K0();
            jc.l.b(r0VarK0);
        }
        return jD;
    }

    @Override // f3.c
    public final float M() {
        return this.f8831o.M();
    }

    @Override // i2.q0, g2.y
    public final boolean O() {
        return true;
    }

    @Override // g2.g1
    public final void Y(long j10, float f10, ic.k kVar) {
        E0(j10);
        if (this.f8823j) {
            return;
        }
        D0();
    }

    @Override // f3.c
    public final float a() {
        return this.f8831o.a();
    }

    @Override // g2.y
    public final f3.m getLayoutDirection() {
        return this.f8831o.f8700o.f8767z;
    }

    @Override // i2.q0
    public final q0 q0() {
        g1 g1Var = this.f8831o.f8703r;
        if (g1Var != null) {
            return g1Var.K0();
        }
        return null;
    }

    @Override // i2.q0
    public final g2.c0 r0() {
        return this.f8834r;
    }

    @Override // i2.q0
    public final boolean s0() {
        return this.f8835s != null;
    }

    @Override // i2.q0
    public final j0 t0() {
        return this.f8831o.f8700o;
    }

    @Override // i2.q0
    public final g2.w0 u0() {
        g2.w0 w0Var = this.f8835s;
        if (w0Var != null) {
            return w0Var;
        }
        throw j2.h0.g("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // i2.q0
    public final q0 v0() {
        g1 g1Var = this.f8831o.f8704s;
        if (g1Var != null) {
            return g1Var.K0();
        }
        return null;
    }

    @Override // i2.q0
    public final long w0() {
        return this.f8832p;
    }
}
