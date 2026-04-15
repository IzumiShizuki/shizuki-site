package y6;

import m7.k0;
import r5.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final double[] f25664r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h0 f25666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v2.e f25667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p4.s f25669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v4.z f25670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f25671g = new boolean[4];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f25672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f25673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f25675k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f25676l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f25677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f25678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f25679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f25680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f25681q;

    public j(v2.e eVar, String str) {
        this.f25667c = eVar;
        this.f25668d = str;
        i iVar = new i();
        iVar.f25663d = new byte[128];
        this.f25672h = iVar;
        if (eVar != null) {
            this.f25670f = new v4.z(178);
            this.f25669e = new p4.s();
        } else {
            this.f25670f = null;
            this.f25669e = null;
        }
        this.f25677m = -9223372036854775807L;
        this.f25679o = -9223372036854775807L;
    }

    @Override // y6.h
    public final void a() {
        q4.p.a(this.f25671g);
        i iVar = this.f25672h;
        iVar.f25660a = false;
        iVar.f25661b = 0;
        iVar.f25662c = 0;
        v4.z zVar = this.f25670f;
        if (zVar != null) {
            zVar.d();
        }
        this.f25673i = 0L;
        this.f25674j = false;
        this.f25677m = -9223372036854775807L;
        this.f25679o = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0202  */
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
    @Override // y6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(p4.s r23) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.j.b(p4.s):void");
    }

    @Override // y6.h
    public final void c(r5.q qVar, k0 k0Var) {
        k0Var.b();
        k0Var.d();
        this.f25665a = (String) k0Var.f14910e;
        k0Var.d();
        this.f25666b = qVar.u(k0Var.f14908c, 2);
        v2.e eVar = this.f25667c;
        if (eVar != null) {
            eVar.q(qVar, k0Var);
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
    @Override // y6.h
    public final void d(boolean z10) {
        p4.c.j(this.f25666b);
        if (z10) {
            boolean z11 = this.f25680p;
            this.f25666b.a(this.f25679o, z11 ? 1 : 0, (int) (this.f25673i - this.f25678n), 0, null);
        }
    }

    @Override // y6.h
    public final void e(int i10, long j10) {
        this.f25677m = j10;
    }
}
