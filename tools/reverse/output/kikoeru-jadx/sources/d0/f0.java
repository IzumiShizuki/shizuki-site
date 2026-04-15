package d0;

import b0.u0;
import b0.w0;
import b0.y0;
import b0.z0;
import java.util.List;
import s.v0;
import u.v1;
import x0.a1;
import x0.b1;
import x0.e1;
import x0.r0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 implements v1 {
    public final w0 A;
    public final x0.w0 B;
    public final x0.w0 C;
    public final e1 D;
    public final e1 E;
    public final e1 F;
    public final e1 G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f5309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f5310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f5311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f5316i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f5317j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u.k f5318k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f5319l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5320m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y0 f5321n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5322o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e1 f5323p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f3.c f5324q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w.k f5325r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b1 f5326s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b1 f5327t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final z0 f5328u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b0.m f5329v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b0.e f5330w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e1 f5331x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a0.b0 f5332y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f5333z;

    public f0(float f10, int i10) {
        double d10 = f10;
        if (-0.5d > d10 || d10 > 0.5d) {
            x.a.a("currentPageOffsetFraction " + f10 + " is not within the range -0.5 to 0.5");
        }
        this.f5310c = x0.v.v(new p1.b(0L));
        this.f5311d = new y(i10, f10, this);
        this.f5312e = i10;
        this.f5314g = Long.MAX_VALUE;
        this.f5318k = new u.k(new c0(this, 1));
        this.f5319l = true;
        this.f5320m = -1;
        this.f5323p = new e1(j0.f5360b, r0.f24436c);
        this.f5324q = j0.f5361c;
        this.f5325r = new w.k();
        this.f5326s = new b1(-1);
        this.f5327t = new b1(i10);
        r0 r0Var = r0.f24439f;
        x0.v.p(new e0(this, 0), r0Var);
        x0.v.p(new e0(this, 1), r0Var);
        this.f5328u = new z0(new c0(this, 0));
        this.f5329v = new b0.m(0);
        this.f5330w = new b0.e();
        this.f5331x = x0.v.v(null);
        this.f5332y = new a0.b0(this, 2);
        this.f5333z = f3.b.b(0, 0, 15);
        this.A = new w0();
        this.B = b0.g0.g();
        this.C = b0.g0.g();
        Boolean bool = Boolean.FALSE;
        this.D = x0.v.v(bool);
        this.E = x0.v.v(bool);
        this.F = x0.v.v(bool);
        this.G = x0.v.v(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r9.b(r7, r8, r0) == r5) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object r(d0.f0 r6, s.v0 r7, ic.n r8, ac.c r9) {
        /*
            boolean r0 = r9 instanceof d0.d0
            if (r0 == 0) goto L13
            r0 = r9
            d0.d0 r0 = (d0.d0) r0
            int r1 = r0.f5289i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5289i = r1
            goto L18
        L13:
            d0.d0 r0 = new d0.d0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f5287g
            int r1 = r0.f5289i
            ub.a0 r2 = ub.a0.f21526a
            r3 = 2
            r4 = 1
            zb.a r5 = zb.a.f26667a
            if (r1 == 0) goto L43
            if (r1 == r4) goto L36
            if (r1 != r3) goto L2e
            d0.f0 r6 = r0.f5284d
            ub.a.f(r9)
            goto L81
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            ac.i r6 = r0.f5286f
            r8 = r6
            ic.n r8 = (ic.n) r8
            s.v0 r7 = r0.f5285e
            d0.f0 r6 = r0.f5284d
            ub.a.f(r9)
            goto L5e
        L43:
            ub.a.f(r9)
            r0.f5284d = r6
            r0.f5285e = r7
            r9 = r8
            ac.i r9 = (ac.i) r9
            r0.f5286f = r9
            r0.f5289i = r4
            b0.e r9 = r6.f5330w
            java.lang.Object r9 = r9.h(r0)
            if (r9 != r5) goto L5a
            goto L5b
        L5a:
            r9 = r2
        L5b:
            if (r9 != r5) goto L5e
            goto L80
        L5e:
            u.k r9 = r6.f5318k
            boolean r9 = r9.a()
            if (r9 != 0) goto L6f
            int r9 = r6.j()
            x0.b1 r1 = r6.f5327t
            r1.f(r9)
        L6f:
            u.k r9 = r6.f5318k
            r0.f5284d = r6
            r1 = 0
            r0.f5285e = r1
            r0.f5286f = r1
            r0.f5289i = r3
            java.lang.Object r7 = r9.b(r7, r8, r0)
            if (r7 != r5) goto L81
        L80:
            return r5
        L81:
            r7 = -1
            x0.b1 r6 = r6.f5326s
            r6.f(r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.f0.r(d0.f0, s.v0, ic.n, ac.c):java.lang.Object");
    }

    @Override // u.v1
    public final boolean a() {
        return this.f5318k.a();
    }

    @Override // u.v1
    public final Object b(v0 v0Var, ic.n nVar, ac.c cVar) {
        return r(this, v0Var, nVar, cVar);
    }

    @Override // u.v1
    public final boolean c() {
        return ((Boolean) this.E.getValue()).booleanValue();
    }

    @Override // u.v1
    public final boolean d() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    @Override // u.v1
    public final float e(float f10) {
        return this.f5318k.e(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r18, r.z0 r19, ac.c r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            boolean r3 = r2 instanceof d0.a0
            if (r3 == 0) goto L19
            r3 = r2
            d0.a0 r3 = (d0.a0) r3
            int r4 = r3.f5271i
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f5271i = r4
            goto L1e
        L19:
            d0.a0 r3 = new d0.a0
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f5269g
            int r4 = r3.f5271i
            r5 = 0
            ub.a0 r6 = ub.a0.f21526a
            r7 = 2
            r8 = 1
            zb.a r9 = zb.a.f26667a
            if (r4 == 0) goto L47
            if (r4 == r8) goto L3b
            if (r4 != r7) goto L33
            ub.a.f(r2)
            return r6
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            int r1 = r3.f5268f
            r.z0 r4 = r3.f5267e
            d0.f0 r8 = r3.f5266d
            ub.a.f(r2)
            r14 = r4
            r11 = r8
            goto L7f
        L47:
            ub.a.f(r2)
            int r2 = r0.j()
            if (r1 != r2) goto L5f
            d0.y r2 = r0.f5311d
            java.lang.Object r2 = r2.f5433d
            x0.a1 r2 = (x0.a1) r2
            float r2 = r2.e()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L5f
            goto Lc4
        L5f:
            int r2 = r0.l()
            if (r2 != 0) goto L66
            goto Lc4
        L66:
            r3.f5266d = r0
            r2 = r19
            r3.f5267e = r2
            r3.f5268f = r1
            r3.f5271i = r8
            b0.e r4 = r0.f5330w
            java.lang.Object r4 = r4.h(r3)
            if (r4 != r9) goto L79
            goto L7a
        L79:
            r4 = r6
        L7a:
            if (r4 != r9) goto L7d
            goto Lc3
        L7d:
            r11 = r0
            r14 = r2
        L7f:
            double r12 = (double) r5
            r15 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r2 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r2 > 0) goto L8d
            r15 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r2 > 0) goto L8d
            goto La3
        L8d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "pageOffsetFraction "
            r2.<init>(r4)
            r2.append(r5)
            java.lang.String r4 = " is not within the range -0.5 to 0.5"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            x.a.a(r2)
        La3:
            int r12 = r11.i(r1)
            int r1 = r11.n()
            float r1 = (float) r1
            float r13 = r5 * r1
            d0.b0 r10 = new d0.b0
            r15 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            r1 = 0
            r3.f5266d = r1
            r3.f5267e = r1
            r3.f5271i = r7
            s.v0 r1 = s.v0.f19292a
            java.lang.Object r1 = r11.b(r1, r10, r3)
            if (r1 != r9) goto Lc4
        Lc3:
            return r9
        Lc4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.f0.f(int, r.z0, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x011f A[Catch: all -> 0x012f, TryCatch #0 {all -> 0x012f, blocks: (B:57:0x00cc, B:59:0x00df, B:61:0x00e3, B:63:0x00ef, B:74:0x0129, B:69:0x011f, B:66:0x0107), top: B:87:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0129 A[Catch: all -> 0x012f, TRY_LEAVE, TryCatch #0 {all -> 0x012f, blocks: (B:57:0x00cc, B:59:0x00df, B:61:0x00e3, B:63:0x00ef, B:74:0x0129, B:69:0x011f, B:66:0x0107), top: B:87:0x00cc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(d0.w r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.f0.h(d0.w, boolean, boolean):void");
    }

    public final int i(int i10) {
        if (l() > 0) {
            return nh.b.k(i10, 0, l() - 1);
        }
        return 0;
    }

    public final int j() {
        return ((b1) this.f5311d.f5432c).e();
    }

    public final w k() {
        return (w) this.f5323p.getValue();
    }

    public abstract int l();

    public final int m() {
        return ((w) this.f5323p.getValue()).f5412b;
    }

    public final int n() {
        return ((w) this.f5323p.getValue()).f5413c + m();
    }

    public final long o() {
        return ((p1.b) this.f5310c.getValue()).f16481a;
    }

    public final boolean p() {
        return ((int) Float.intBitsToFloat((int) (o() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (o() & 4294967295L))) == 0;
    }

    public final void q(float f10, w wVar) {
        y0 y0Var;
        y0 y0Var2;
        y0 y0Var3;
        List list = wVar.f5411a;
        if (this.f5319l && !list.isEmpty()) {
            boolean z10 = f10 > 0.0f;
            int i10 = z10 ? ((j) vb.m.h0(list)).f5346a + 1 : ((j) vb.m.Y(list)).f5346a - 1;
            if (i10 < 0 || i10 >= l()) {
                return;
            }
            if (i10 != this.f5320m) {
                if (this.f5322o != z10 && (y0Var3 = this.f5321n) != null) {
                    y0Var3.cancel();
                }
                this.f5322o = z10;
                this.f5320m = i10;
                this.f5321n = this.f5328u.a(i10, this.f5333z);
            }
            if (z10) {
                if ((((j) vb.m.h0(list)).f5357l + (wVar.f5412b + wVar.f5413c)) - wVar.f5417g >= f10 || (y0Var2 = this.f5321n) == null) {
                    return;
                }
                y0Var2.a();
                return;
            }
            if (wVar.f5416f - ((j) vb.m.Y(list)).f5357l >= (-f10) || (y0Var = this.f5321n) == null) {
                return;
            }
            y0Var.a();
        }
    }

    public final void s(float f10, int i10, boolean z10) {
        y yVar = this.f5311d;
        ((b1) yVar.f5432c).f(i10);
        ((u0) yVar.f5435f).a(i10);
        ((a1) yVar.f5433d).f(f10);
        yVar.f5434e = null;
        if (!z10) {
            this.C.setValue(ub.a0.f21526a);
            return;
        }
        i2.j0 j0Var = (i2.j0) this.f5331x.getValue();
        if (j0Var != null) {
            j0Var.k();
        }
    }
}
