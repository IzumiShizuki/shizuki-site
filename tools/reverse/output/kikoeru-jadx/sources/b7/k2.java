package b7;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k2 implements s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7.k1 f1916a;

    public k2(c7.k1 k1Var) {
        this.f1916a = k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != k2.class) {
            return false;
        }
        c7.k1 k1Var = ((k2) obj).f1916a;
        int i10 = p4.c0.f16548a;
        return Objects.equals(this.f1916a, k1Var);
    }

    public final int hashCode() {
        return Objects.hash(this.f1916a);
    }

    @Override // b7.s1
    public final /* synthetic */ void a() {
    }

    @Override // b7.s1
    public final /* synthetic */ void b(int i10) {
    }

    @Override // b7.s1
    public final /* synthetic */ void e(int i10, y yVar) {
    }

    @Override // b7.s1
    public final /* synthetic */ void f(int i10, m4.u0 u0Var) {
    }

    @Override // b7.s1
    public final /* synthetic */ void h(int i10, i4 i4Var) {
    }

    @Override // b7.s1
    public final /* synthetic */ void c(int i10, v3 v3Var, m4.u0 u0Var, boolean z10, boolean z11) {
    }

    @Override // b7.s1
    public final /* synthetic */ void i(int i10, h4 h4Var, boolean z10, boolean z11, int i11) {
    }
}
