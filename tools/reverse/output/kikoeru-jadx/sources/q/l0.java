package q;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r.v1 f17354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r.z0 f17355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r.z0 f17356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r.z0 f17357d;

    static {
        r rVar = r.f17427g;
        r rVar2 = r.f17428h;
        r.v1 v1Var = r.w1.f18620a;
        f17354a = new r.v1(rVar, rVar2);
        f17355b = r.d.q(5, null);
        long j10 = 1;
        long j11 = (j10 & 4294967295L) | (j10 << 32);
        f17356c = r.d.q(1, new f3.j(j11));
        f17357d = r.d.q(1, new f3.l(j11));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static q0 a(r.u1 u1Var, int i10) {
        int i11 = 1;
        r.x xVarQ = u1Var;
        if ((i10 & 1) != 0) {
            long j10 = 1;
            xVarQ = r.d.q(1, new f3.l((j10 & 4294967295L) | (j10 << 32)));
        }
        j1.g gVar = j1.c.f9673l;
        return new q0(new y1((s0) null, (w1) null, new z(gVar.equals(j1.c.f9671j) ? j1.c.f9663b : gVar.equals(gVar) ? j1.c.f9669h : j1.c.f9666e, new r(i11, 10), xVarQ), (nd.h) null, (LinkedHashMap) null, 59));
    }

    public static q0 b(r.u1 u1Var, int i10) {
        r.x xVarQ = u1Var;
        if ((i10 & 1) != 0) {
            xVarQ = r.d.q(5, null);
        }
        return new q0(new y1(new s0(xVarQ), (w1) null, (z) null, (nd.h) null, (LinkedHashMap) null, 62));
    }

    public static r0 c(r.u1 u1Var, int i10) {
        r.x xVarQ = u1Var;
        if ((i10 & 1) != 0) {
            xVarQ = r.d.q(5, null);
        }
        return new r0(new y1(new s0(xVarQ), (w1) null, (z) null, (nd.h) null, (LinkedHashMap) null, 62));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static r0 d(r.u1 u1Var, int i10) {
        int i11 = 1;
        r.x xVarQ = u1Var;
        if ((i10 & 1) != 0) {
            long j10 = 1;
            xVarQ = r.d.q(1, new f3.l((j10 & 4294967295L) | (j10 << 32)));
        }
        j1.g gVar = j1.c.f9673l;
        return new r0(new y1((s0) null, (w1) null, new z(gVar.equals(j1.c.f9671j) ? j1.c.f9663b : gVar.equals(gVar) ? j1.c.f9669h : j1.c.f9666e, new r(i11, 11), xVarQ), (nd.h) null, (LinkedHashMap) null, 59));
    }
}
