package a0;

import java.util.Collection;
import u.e1;
import x0.b1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements b0.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f35a;

    public f(g0 g0Var) {
        this.f35a = g0Var;
    }

    @Override // b0.r
    public final int a() {
        return this.f35a.g().f127n;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // b0.r
    public final int b() {
        return Math.min(a() - 1, ((u) vb.m.h0(this.f35a.g().f124k)).f131a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // b0.r
    public final int c() {
        int i10;
        g0 g0Var = this.f35a;
        if (g0Var.g().f124k.isEmpty()) {
            return 0;
        }
        t tVarG = g0Var.g();
        int iC = (int) (tVarG.f128o == e1.f20882a ? tVarG.c() & 4294967295L : tVarG.c() >> 32);
        int iC0 = android.support.v4.media.session.b.c0(g0Var.g());
        if (iC0 != 0 && (i10 = iC / iC0) >= 1) {
            return i10;
        }
        return 1;
    }

    @Override // b0.r
    public final boolean d() {
        return !((Collection) this.f35a.g().f124k).isEmpty();
    }

    @Override // b0.r
    public final int e() {
        return Math.max(0, ((b1) this.f35a.f45d.f153b).e());
    }
}
