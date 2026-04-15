package d0;

import b0.a1;
import b0.v1;
import b0.x0;
import b0.z0;
import c7.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f5283c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(f0 f0Var, int i10) {
        super(1);
        this.f5282b = i10;
        this.f5283c = f0Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        w wVar;
        switch (this.f5282b) {
            case 0:
                x0 x0Var = (x0) obj;
                f0 f0Var = this.f5283c;
                h1.g gVarD = h1.t.d();
                ic.k kVarE = gVarD != null ? gVarD.e() : null;
                h1.g gVarG = h1.t.g(gVarD);
                try {
                    int i10 = f0Var.f5312e;
                    x0Var.getClass();
                    long j10 = a1.f1190a;
                    z0 z0Var = x0Var.f1404b;
                    e1 e1Var = z0Var.f1417c;
                    if (e1Var != null) {
                        x0Var.f1403a.add(new v1(e1Var, i10, j10, z0Var.f1416b));
                        break;
                    }
                    h1.t.k(gVarD, gVarG, kVarE);
                    return ub.a0.f21526a;
                } catch (Throwable th2) {
                    h1.t.k(gVarD, gVarG, kVarE);
                    throw th2;
                }
            default:
                float fFloatValue = ((Number) obj).floatValue();
                f0 f0Var2 = this.f5283c;
                long jR = gh.g.r(f0Var2);
                float f10 = f0Var2.f5316i + fFloatValue;
                long jS = lc.b.S(f10);
                f0Var2.f5316i = f10 - jS;
                if (Math.abs(fFloatValue) >= 1.0E-4f) {
                    long j11 = jR + jS;
                    long jL = nh.b.l(j11, f0Var2.f5315h, f0Var2.f5314g);
                    boolean z10 = j11 != jL;
                    long j12 = jL - jR;
                    float f11 = j12;
                    f0Var2.f5317j = f11;
                    if (Math.abs(j12) != 0) {
                        f0Var2.F.setValue(Boolean.valueOf(f11 > 0.0f));
                        f0Var2.G.setValue(Boolean.valueOf(f11 < 0.0f));
                    }
                    int i11 = (int) j12;
                    int i12 = -i11;
                    w wVarA = ((w) f0Var2.f5323p.getValue()).a(i12);
                    if (wVarA != null && (wVar = f0Var2.f5309b) != null) {
                        w wVarA2 = wVar.a(i12);
                        if (wVarA2 != null) {
                            f0Var2.f5309b = wVarA2;
                        } else {
                            wVarA = null;
                        }
                    }
                    if (wVarA != null) {
                        f0Var2.h(wVarA, f0Var2.f5308a, true);
                        f0Var2.B.setValue(ub.a0.f21526a);
                    } else {
                        y yVar = f0Var2.f5311d;
                        f0 f0Var3 = (f0) yVar.f5431b;
                        x0.a1 a1Var = (x0.a1) yVar.f5433d;
                        a1Var.f(a1Var.e() + (f0Var3.n() != 0 ? i11 / f0Var3.n() : 0.0f));
                        i2.j0 j0Var = (i2.j0) f0Var2.f5331x.getValue();
                        if (j0Var != null) {
                            j0Var.k();
                        }
                    }
                    fFloatValue = (z10 ? Long.valueOf(j12) : Float.valueOf(fFloatValue)).floatValue();
                }
                return Float.valueOf(fFloatValue);
        }
    }
}
