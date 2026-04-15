package b0;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements g2.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f1336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2.r1 f1337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f1338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o.y f1339d;

    public q0(k0 k0Var, g2.r1 r1Var) {
        this.f1336a = k0Var;
        this.f1337b = r1Var;
        this.f1338c = (n0) k0Var.f1282b.b();
        o.y yVar = o.n.f16024a;
        this.f1339d = new o.y();
    }

    @Override // f3.c
    public final long E(float f10) {
        return this.f1337b.E(f10);
    }

    @Override // f3.c
    public final float I(int i10) {
        return this.f1337b.I(i10);
    }

    @Override // f3.c
    public final float J(float f10) {
        return this.f1337b.J(f10);
    }

    @Override // f3.c
    public final float M() {
        return this.f1337b.M();
    }

    @Override // g2.y
    public final boolean O() {
        return this.f1337b.O();
    }

    @Override // f3.c
    public final float Q(float f10) {
        return this.f1337b.Q(f10);
    }

    @Override // f3.c
    public final int U(long j10) {
        return this.f1337b.U(j10);
    }

    @Override // f3.c
    public final float a() {
        return this.f1337b.a();
    }

    @Override // f3.c
    public final int a0(float f10) {
        return this.f1337b.a0(f10);
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
    public final List b(int i10, long j10) {
        o.y yVar = this.f1339d;
        List list = (List) yVar.b(i10);
        if (list != null) {
            return list;
        }
        n0 n0Var = this.f1338c;
        Object objB = n0Var.b(i10);
        List listP = this.f1337b.P(this.f1336a.a(i10, objB, n0Var.c(i10)), objB);
        int size = listP.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(((g2.u0) listP.get(i11)).v(j10));
        }
        yVar.h(i10, arrayList);
        return arrayList;
    }

    @Override // g2.x0
    public final g2.w0 b0(int i10, int i11, Map map, ic.k kVar) {
        return this.f1337b.b0(i10, i11, map, kVar);
    }

    @Override // f3.c
    public final long f0(long j10) {
        return this.f1337b.f0(j10);
    }

    @Override // g2.y
    public final f3.m getLayoutDirection() {
        return this.f1337b.getLayoutDirection();
    }

    @Override // f3.c
    public final float i0(long j10) {
        return this.f1337b.i0(j10);
    }

    @Override // f3.c
    public final long n(long j10) {
        return this.f1337b.n(j10);
    }

    @Override // f3.c
    public final float r(long j10) {
        return this.f1337b.r(j10);
    }

    @Override // g2.x0
    public final g2.w0 y(int i10, int i11, Map map, ic.k kVar, ic.k kVar2) {
        return this.f1337b.y(i10, i11, map, kVar, kVar2);
    }
}
