package y6;

import java.util.Arrays;
import m4.o0;
import m7.k0;
import r5.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f25609x = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25610a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f25616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h0 f25617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h0 f25618i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f25622m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f25623n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f25626q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f25627r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f25629t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h0 f25631v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f25632w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4.r f25611b = new p4.r(new byte[7], 7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p4.s f25612c = new p4.s(Arrays.copyOf(f25609x, 10));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f25624o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f25625p = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f25628s = -9223372036854775807L;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f25630u = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25619j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25620k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f25621l = 256;

    public e(String str, int i10, String str2, boolean z10) {
        this.f25610a = z10;
        this.f25613d = str;
        this.f25614e = i10;
        this.f25615f = str2;
    }

    @Override // y6.h
    public final void a() {
        this.f25630u = -9223372036854775807L;
        this.f25623n = false;
        this.f25619j = 0;
        this.f25620k = 0;
        this.f25621l = 256;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0207  */
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
    public final void b(p4.s r24) throws m4.p0 {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.e.b(p4.s):void");
    }

    @Override // y6.h
    public final void c(r5.q qVar, k0 k0Var) {
        k0Var.b();
        k0Var.d();
        this.f25616g = (String) k0Var.f14910e;
        k0Var.d();
        h0 h0VarU = qVar.u(k0Var.f14908c, 1);
        this.f25617h = h0VarU;
        this.f25631v = h0VarU;
        if (!this.f25610a) {
            this.f25618i = new r5.m();
            return;
        }
        k0Var.b();
        k0Var.d();
        h0 h0VarU2 = qVar.u(k0Var.f14908c, 5);
        this.f25618i = h0VarU2;
        m4.p pVar = new m4.p();
        k0Var.d();
        pVar.f14476a = (String) k0Var.f14910e;
        pVar.f14487l = o0.p(this.f25615f);
        pVar.f14488m = o0.p("application/id3");
        a0.c.O(pVar, h0VarU2);
    }

    @Override // y6.h
    public final void e(int i10, long j10) {
        this.f25630u = j10;
    }

    @Override // y6.h
    public final void d(boolean z10) {
    }
}
