package wf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends b1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f24115l;

    public f0(String str, g0 g0Var) {
        super(str, g0Var, 1);
        this.f24115l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ub.h] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, ub.h] */
    @Override // wf.b1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            uf.g gVar = (uf.g) obj;
            if (this.f24085a.equals(gVar.m())) {
                f0 f0Var = (f0) obj;
                if (f0Var.f24115l && Arrays.equals((uf.g[]) this.f24094j.getValue(), (uf.g[]) f0Var.f24094j.getValue())) {
                    int iP = gVar.p();
                    int i10 = this.f24087c;
                    if (i10 == iP) {
                        for (int i11 = 0; i11 < i10; i11++) {
                            if (jc.l.a(s(i11).m(), gVar.s(i11).m()) && jc.l.a(s(i11).j(), gVar.s(i11).j())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // wf.b1
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // wf.b1, uf.g
    public final boolean l() {
        return this.f24115l;
    }
}
