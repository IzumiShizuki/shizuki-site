package y6;

import r5.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f25758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f25759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f25762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25767j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f25768k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f25769l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f25770m;

    public q(h0 h0Var) {
        this.f25758a = h0Var;
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
    public final void a(int i10) {
        long j10 = this.f25769l;
        if (j10 == -9223372036854775807L) {
            return;
        }
        boolean z10 = this.f25770m;
        this.f25758a.a(j10, z10 ? 1 : 0, (int) (this.f25759b - this.f25768k), i10, null);
    }
}
