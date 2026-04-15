package a0;

import java.util.Collection;
import u.k1;
import u.v1;
import x0.a1;
import x0.b1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f159c;

    public /* synthetic */ w(k1 k1Var, v1 v1Var, int i10) {
        this.f157a = i10;
        this.f159c = v1Var;
        this.f158b = k1Var;
    }

    @Override // u.k1
    public final float a(float f10) {
        switch (this.f157a) {
        }
        return this.f158b.a(f10);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final int b(int i10) {
        Object obj;
        switch (this.f157a) {
            case 0:
                t tVarG = ((g0) this.f159c).g();
                if (tVarG.f124k.isEmpty()) {
                    return 0;
                }
                int iC = c();
                if (i10 > e() || iC > i10) {
                    return ((i10 - c()) * android.support.v4.media.session.b.c0(tVarG)) - d();
                }
                ?? r0 = tVarG.f124k;
                int size = ((Collection) r0).size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        obj = r0.get(i11);
                        if (((u) obj).f131a != i10) {
                            i11++;
                        }
                    } else {
                        obj = null;
                    }
                }
                u uVar = (u) obj;
                if (uVar != null) {
                    return uVar.f143m;
                }
                return 0;
            default:
                d0.f0 f0Var = (d0.f0) this.f159c;
                return (int) (nh.b.l(gh.g.r(f0Var) + ((long) lc.b.R(((f0Var.n() * (i10 - f0Var.j())) - (((a1) f0Var.f5311d.f5433d).e() * f0Var.n())) + 0)), f0Var.f5315h, f0Var.f5314g) - gh.g.r(f0Var));
        }
    }

    public final int c() {
        switch (this.f157a) {
            case 0:
                return ((b1) ((g0) this.f159c).f45d.f153b).e();
            default:
                return ((d0.f0) this.f159c).f5312e;
        }
    }

    public final int d() {
        switch (this.f157a) {
            case 0:
                return ((b1) ((g0) this.f159c).f45d.f154c).e();
            default:
                return ((d0.f0) this.f159c).f5313f;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    public final int e() {
        switch (this.f157a) {
            case 0:
                u uVar = (u) vb.m.i0(((g0) this.f159c).g().f124k);
                if (uVar != null) {
                    return uVar.f131a;
                }
                return 0;
            default:
                return ((d0.j) vb.m.h0(((d0.f0) this.f159c).k().f5411a)).f5346a;
        }
    }

    public final void f(int i10) {
        switch (this.f157a) {
            case 0:
                ((g0) this.f159c).i(i10, 0, true);
                break;
            default:
                ((d0.f0) this.f159c).s(0 / r1.n(), i10, true);
                break;
        }
    }
}
