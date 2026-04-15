package c2;

import android.graphics.Matrix;
import j2.l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f3254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f3257h;

    /* JADX WARN: Multi-variable type inference failed */
    public d(ic.n nVar) {
        this.f3254e = (jc.m) nVar;
        this.f3256g = q1.a0.a();
        this.f3257h = q1.a0.a();
        this.f3252c = true;
        this.f3253d = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r18, java.util.List r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.d.a(long, java.util.List, boolean):void");
    }

    public float[] b(Object obj) {
        float[] fArr = (float[]) this.f3257h;
        if (this.f3251b) {
            this.f3252c = l0.A(c(obj), fArr);
            this.f3251b = false;
        }
        if (this.f3252c) {
            return fArr;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ic.n, jc.m] */
    public float[] c(Object obj) {
        float[] fArr = (float[]) this.f3256g;
        if (!this.f3250a) {
            return fArr;
        }
        Matrix matrix = (Matrix) this.f3255f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f3255f = matrix;
        }
        ((jc.m) this.f3254e).q(obj, matrix);
        q1.h0.v(matrix, fArr);
        this.f3250a = false;
        this.f3253d = q1.h0.p(fArr);
        return fArr;
    }

    public boolean d(b7.n nVar, boolean z10) {
        o.g0 g0Var = (o.g0) this.f3255f;
        k kVar = (k) this.f3256g;
        boolean zA = kVar.a((o.s) nVar.f1985c, (g2.c0) this.f3254e, nVar, z10);
        z0.e eVar = kVar.f3307a;
        if (!zA) {
            return false;
        }
        boolean z11 = true;
        this.f3250a = true;
        Object[] objArr = eVar.f26372a;
        int i10 = eVar.f26374c;
        boolean z12 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            z12 = ((j) objArr[i11]).e(nVar, z10) || z12;
        }
        Object[] objArr2 = eVar.f26372a;
        int i12 = eVar.f26374c;
        boolean z13 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            z13 = ((j) objArr2[i13]).d(nVar) || z13;
        }
        kVar.b(nVar);
        if (!z13 && !z12) {
            z11 = false;
        }
        this.f3250a = false;
        if (this.f3253d) {
            this.f3253d = false;
            int i14 = g0Var.f15971b;
            for (int i15 = 0; i15 < i14; i15++) {
                g((j1.p) g0Var.e(i15));
            }
            g0Var.c();
        }
        if (this.f3251b) {
            this.f3251b = false;
            f();
        }
        if (this.f3252c) {
            this.f3252c = false;
            kVar.f3307a.g();
        }
        return z11;
    }

    public void e() {
        this.f3250a = true;
        this.f3251b = true;
    }

    public void f() {
        k kVar = (k) this.f3256g;
        if (this.f3250a) {
            this.f3251b = true;
            return;
        }
        z0.e eVar = kVar.f3307a;
        Object[] objArr = eVar.f26372a;
        int i10 = eVar.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((j) objArr[i11]).c();
        }
        if (this.f3252c) {
            this.f3252c = true;
        } else {
            kVar.f3307a.g();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void g(j1.p pVar) {
        if (this.f3250a) {
            this.f3253d = true;
            ((o.g0) this.f3255f).a(pVar);
            return;
        }
        k kVar = (k) this.f3256g;
        o.g0 g0Var = kVar.f3308b;
        g0Var.c();
        g0Var.a(kVar);
        while (g0Var.h()) {
            k kVar2 = (k) g0Var.j(g0Var.f15971b - 1);
            int i10 = 0;
            while (true) {
                z0.e eVar = kVar2.f3307a;
                if (i10 < eVar.f26374c) {
                    j jVar = (j) eVar.f26372a[i10];
                    if (jc.l.a(jVar.f3288c, pVar)) {
                        kVar2.f3307a.j(jVar);
                        jVar.c();
                    } else {
                        g0Var.a(jVar);
                        i10++;
                    }
                }
            }
        }
    }

    public d(g2.c0 c0Var) {
        this.f3254e = c0Var;
        this.f3255f = new o.g0();
        this.f3256g = new k();
        this.f3257h = new o.c0(10);
    }
}
