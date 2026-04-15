package m5;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import m4.k1;
import m4.n1;
import m4.o1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends n1 {
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final SparseArray K;
    public final SparseBooleanArray L;

    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.i.<init>(android.content.Context):void");
    }

    @Override // m4.n1
    public final void a(k1 k1Var) {
        this.B.put(k1Var.f14346a, k1Var);
    }

    @Override // m4.n1
    public final o1 b() {
        return new j(this);
    }

    @Override // m4.n1
    public final n1 c() {
        super.c();
        return this;
    }

    @Override // m4.n1
    public final n1 f(int i10, int i11) {
        super.f(i10, i11);
        return this;
    }

    public final void g() {
        this.D = true;
        this.E = true;
        this.F = true;
        this.G = true;
        this.H = true;
        this.I = true;
        this.J = true;
    }

    public i(j jVar) {
        d(jVar);
        this.D = jVar.f14709k0;
        this.E = jVar.f14710l0;
        this.F = jVar.f14711m0;
        this.G = jVar.n0;
        this.H = jVar.o0;
        this.I = jVar.p0;
        this.J = jVar.q0;
        SparseArray sparseArray = jVar.r0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.K = sparseArray2;
        this.L = jVar.f14712s0.clone();
    }

    public i() {
        this.K = new SparseArray();
        this.L = new SparseBooleanArray();
        g();
    }
}
