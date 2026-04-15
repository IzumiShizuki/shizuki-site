package s;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3.c f19140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f19141b = 9205357640488583168L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f19142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0.e1 f19143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f19146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f19147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i2.n f19148i;

    public f(Context context, f3.c cVar, long j10, y.d1 d1Var) {
        this.f19140a = cVar;
        a0 a0Var = new a0(context, q1.h0.B(j10));
        this.f19142c = a0Var;
        this.f19143d = new x0.e1(ub.a0.f21526a, x0.r0.f24436c);
        this.f19144e = true;
        this.f19146g = 0L;
        this.f19147h = -1L;
        d0.h hVar = new d0.h(4, this);
        c2.l lVar = c2.e0.f3261a;
        c2.j0 j0Var = new c2.j0(null, null, null, hVar);
        this.f19148i = Build.VERSION.SDK_INT >= 31 ? new e0(j0Var, this, a0Var) : new e0(j0Var, this, a0Var, d1Var);
    }

    public final void a() {
        boolean z10;
        a0 a0Var = this.f19142c;
        EdgeEffect edgeEffect = a0Var.f19091d;
        boolean z11 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = !edgeEffect.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = a0Var.f19092e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 = !edgeEffect2.isFinished() || z10;
        }
        EdgeEffect edgeEffect3 = a0Var.f19093f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 = !edgeEffect3.isFinished() || z10;
        }
        EdgeEffect edgeEffect4 = a0Var.f19094g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z10) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r18, u.b2 r20, ac.c r21) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.f.b(long, u.b2, ac.c):java.lang.Object");
    }

    public final long c() {
        long jL = this.f19141b;
        if ((9223372034707292159L & jL) == 9205357640488583168L) {
            jL = nh.a.l(this.f19146g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32)) / Float.intBitsToFloat((int) (this.f19146g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jL & 4294967295L)) / Float.intBitsToFloat((int) (this.f19146g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void d() {
        if (this.f19144e) {
            this.f19143d.setValue(ub.a0.f21526a);
        }
    }

    public final float e(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i10 = (int) (j10 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f19146g & 4294967295L));
        EdgeEffect edgeEffectB = this.f19142c.b();
        float fC = -fIntBitsToFloat2;
        float f10 = 1 - fIntBitsToFloat;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fC = m3.f.c(edgeEffectB, fC, f10);
        } else {
            edgeEffectB.onPull(fC, f10);
        }
        return (i11 >= 31 ? m3.f.b(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.f19146g)) * (-fC) : Float.intBitsToFloat(i10);
    }

    public final float f(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f19146g >> 32));
        EdgeEffect edgeEffectC = this.f19142c.c();
        float f10 = 1 - fIntBitsToFloat;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fIntBitsToFloat2 = m3.f.c(edgeEffectC, fIntBitsToFloat2, f10);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f10);
        }
        return (i11 >= 31 ? m3.f.b(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f19146g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i10);
    }

    public final float g(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f19146g >> 32));
        EdgeEffect edgeEffectD = this.f19142c.d();
        float fC = -fIntBitsToFloat2;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fC = m3.f.c(edgeEffectD, fC, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fC, fIntBitsToFloat);
        }
        return (i11 >= 31 ? m3.f.b(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f19146g >> 32)) * (-fC) : Float.intBitsToFloat(i10);
    }

    public final float h(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i10 = (int) (j10 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f19146g & 4294967295L));
        EdgeEffect edgeEffectE = this.f19142c.e();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fIntBitsToFloat2 = m3.f.c(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i11 >= 31 ? m3.f.b(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.f19146g)) * fIntBitsToFloat2 : Float.intBitsToFloat(i10);
    }

    public final void i(long j10) {
        boolean zA = p1.e.a(this.f19146g, 0L);
        boolean zA2 = p1.e.a(j10, this.f19146g);
        this.f19146g = j10;
        if (!zA2) {
            int iR = lc.b.R(Float.intBitsToFloat((int) (j10 >> 32)));
            long jR = (((long) lc.b.R(Float.intBitsToFloat((int) (j10 & 4294967295L)))) & 4294967295L) | (((long) iR) << 32);
            a0 a0Var = this.f19142c;
            a0Var.f19090c = jR;
            EdgeEffect edgeEffect = a0Var.f19091d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jR >> 32), (int) (jR & 4294967295L));
            }
            EdgeEffect edgeEffect2 = a0Var.f19092e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jR >> 32), (int) (jR & 4294967295L));
            }
            EdgeEffect edgeEffect3 = a0Var.f19093f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jR & 4294967295L), (int) (jR >> 32));
            }
            EdgeEffect edgeEffect4 = a0Var.f19094g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jR & 4294967295L), (int) (jR >> 32));
            }
            EdgeEffect edgeEffect5 = a0Var.f19095h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jR >> 32), (int) (jR & 4294967295L));
            }
            EdgeEffect edgeEffect6 = a0Var.f19096i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jR >> 32), (int) (jR & 4294967295L));
            }
            EdgeEffect edgeEffect7 = a0Var.f19097j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jR & 4294967295L), (int) (jR >> 32));
            }
            EdgeEffect edgeEffect8 = a0Var.f19098k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jR), (int) (jR >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}
