package y6;

import m7.k0;
import r5.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tc.b0 f25743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25745c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f25749g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f25751i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h0 f25752j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o f25753k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f25754l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f25756n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f25750h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v4.z f25746d = new v4.z(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v4.z f25747e = new v4.z(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v4.z f25748f = new v4.z(6);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f25755m = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p4.s f25757o = new p4.s();

    public p(tc.b0 b0Var, boolean z10, boolean z11) {
        this.f25743a = b0Var;
        this.f25744b = z10;
        this.f25745c = z11;
    }

    @Override // y6.h
    public final void a() {
        this.f25749g = 0L;
        this.f25756n = false;
        this.f25755m = -9223372036854775807L;
        q4.p.a(this.f25750h);
        this.f25746d.d();
        this.f25747e.d();
        this.f25748f.d();
        ((h7.i) this.f25743a.f20620d).b(0);
        o oVar = this.f25753k;
        if (oVar != null) {
            oVar.f25734k = false;
            oVar.f25738o = false;
            n nVar = oVar.f25737n;
            nVar.f25709b = false;
            nVar.f25708a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a6  */
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
    public final void b(p4.s r33) {
        /*
            Method dump skipped, instruction units count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.p.b(p4.s):void");
    }

    @Override // y6.h
    public final void c(r5.q qVar, k0 k0Var) {
        k0Var.b();
        k0Var.d();
        this.f25751i = (String) k0Var.f14910e;
        k0Var.d();
        h0 h0VarU = qVar.u(k0Var.f14908c, 2);
        this.f25752j = h0VarU;
        this.f25753k = new o(h0VarU, this.f25744b, this.f25745c);
        this.f25743a.i(qVar, k0Var);
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
        p4.c.j(this.f25752j);
        int i10 = p4.c0.f16548a;
        if (z10) {
            ((h7.i) this.f25743a.f20620d).b(0);
            o oVar = this.f25753k;
            long j10 = this.f25749g;
            oVar.a();
            oVar.f25733j = j10;
            long j11 = oVar.f25740q;
            if (j11 != -9223372036854775807L) {
                boolean z11 = oVar.f25741r;
                oVar.f25724a.a(j11, z11 ? 1 : 0, (int) (j10 - oVar.f25739p), 0, null);
            }
            oVar.f25738o = false;
        }
    }

    @Override // y6.h
    public final void e(int i10, long j10) {
        this.f25755m = j10;
        this.f25756n = ((i10 & 2) != 0) | this.f25756n;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.p.f(byte[], int, int):void");
    }
}
