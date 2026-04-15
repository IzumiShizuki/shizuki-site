package a0;

import b0.c1;
import b0.u0;
import b0.w0;
import b0.y0;
import b0.z0;
import java.util.Collection;
import u.v1;
import x0.b1;
import x0.e1;
import x0.r0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements v1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final androidx.media3.exoplayer.offline.u f41w = g1.l.b(x.f160b, r.f107e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f42a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f43b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f44c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f45d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e1 f46e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w.k f47f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f48g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u.k f49h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f50i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i2.j0 f51j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b0 f52k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b0.e f53l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f54m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b0.m f55n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final z0 f56o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f57p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w0 f58q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x0.w0 f59r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e1 f60s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e1 f61t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x0.w0 f62u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c1 f63v;

    public g0(int i10, int i11) {
        a aVar = new a();
        aVar.f3a = -1;
        this.f42a = aVar;
        v vVar = new v();
        vVar.f153b = new b1(i10);
        vVar.f154c = new b1(i11);
        vVar.f156e = new u0(i10, 30, 100);
        this.f45d = vVar;
        this.f46e = new e1(j0.f70a, r0.f24436c);
        this.f47f = new w.k();
        this.f49h = new u.k(new f0(0, this));
        this.f50i = true;
        this.f52k = new b0(this, 0);
        this.f53l = new b0.e();
        this.f54m = new androidx.compose.foundation.lazy.layout.b();
        this.f55n = new b0.m(0);
        this.f56o = new z0(new a0(this, i10));
        this.f57p = new z(this);
        this.f58q = new w0();
        this.f59r = b0.g0.g();
        Boolean bool = Boolean.FALSE;
        this.f60s = x0.v.v(bool);
        this.f61t = x0.v.v(bool);
        this.f62u = b0.g0.g();
        this.f63v = new c1(0);
    }

    @Override // u.v1
    public final boolean a() {
        return this.f49h.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r8.b(r6, r7, r0) == r4) goto L22;
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
    @Override // u.v1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(s.v0 r6, ic.n r7, ac.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof a0.e0
            if (r0 == 0) goto L13
            r0 = r8
            a0.e0 r0 = (a0.e0) r0
            int r1 = r0.f34i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34i = r1
            goto L18
        L13:
            a0.e0 r0 = new a0.e0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f32g
            int r1 = r0.f34i
            r2 = 2
            r3 = 1
            zb.a r4 = zb.a.f26667a
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            ub.a.f(r8)
            goto L69
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ac.i r6 = r0.f31f
            r7 = r6
            ic.n r7 = (ic.n) r7
            s.v0 r6 = r0.f30e
            a0.g0 r1 = r0.f29d
            ub.a.f(r8)
            goto L57
        L3f:
            ub.a.f(r8)
            r0.f29d = r5
            r0.f30e = r6
            r8 = r7
            ac.i r8 = (ac.i) r8
            r0.f31f = r8
            r0.f34i = r3
            b0.e r8 = r5.f53l
            java.lang.Object r8 = r8.h(r0)
            if (r8 != r4) goto L56
            goto L68
        L56:
            r1 = r5
        L57:
            u.k r8 = r1.f49h
            r1 = 0
            r0.f29d = r1
            r0.f30e = r1
            r0.f31f = r1
            r0.f34i = r2
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r4) goto L69
        L68:
            return r4
        L69:
            ub.a0 r6 = ub.a0.f21526a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.g0.b(s.v0, ic.n, ac.c):java.lang.Object");
    }

    @Override // u.v1
    public final boolean c() {
        return ((Boolean) this.f61t.getValue()).booleanValue();
    }

    @Override // u.v1
    public final boolean d() {
        return ((Boolean) this.f60s.getValue()).booleanValue();
    }

    @Override // u.v1
    public final float e(float f10) {
        return this.f49h.e(f10);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public final void f(t tVar, boolean z10, boolean z11) {
        if (!z10 && this.f43b) {
            this.f44c = tVar;
            return;
        }
        if (z10) {
            this.f43b = true;
        }
        u uVar = tVar.f114a;
        ?? r22 = tVar.f124k;
        int i10 = tVar.f115b;
        this.f61t.setValue(Boolean.valueOf(((uVar != null ? uVar.f131a : 0) == 0 && i10 == 0) ? false : true));
        this.f60s.setValue(Boolean.valueOf(tVar.f116c));
        this.f48g -= tVar.f117d;
        this.f46e.setValue(tVar);
        v vVar = this.f45d;
        if (z11) {
            vVar.getClass();
            if (!(((float) i10) >= 0.0f)) {
                x.a.c("scrollOffset should be non-negative");
            }
            ((b1) vVar.f154c).f(i10);
        } else {
            vVar.getClass();
            vVar.f155d = uVar != null ? uVar.f139i : null;
            if (vVar.f152a || tVar.f127n > 0) {
                vVar.f152a = true;
                if (!(((float) i10) >= 0.0f)) {
                    x.a.c("scrollOffset should be non-negative");
                }
                vVar.q(uVar != null ? uVar.f131a : 0, i10);
            }
            if (this.f50i) {
                a aVar = this.f42a;
                if (aVar.f3a != -1 && !((Collection) r22).isEmpty()) {
                    if (aVar.f3a != (aVar.f4b ? ((u) vb.m.h0(r22)).f131a + 1 : ((u) vb.m.Y(r22)).f131a - 1)) {
                        aVar.f3a = -1;
                        y0 y0Var = (y0) aVar.f5c;
                        if (y0Var != null) {
                            y0Var.cancel();
                        }
                        aVar.f5c = null;
                    }
                }
            }
        }
        if (z10) {
            this.f63v.I(tVar.f119f, tVar.f122i, tVar.f121h);
        }
    }

    public final t g() {
        return (t) this.f46e.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void h(float f10, t tVar) {
        y0 y0Var;
        y0 y0Var2;
        y0 y0Var3;
        if (this.f50i) {
            Object obj = tVar.f124k;
            ?? r12 = tVar.f124k;
            if (((Collection) obj).isEmpty()) {
                return;
            }
            boolean z10 = f10 < 0.0f;
            int i10 = z10 ? ((u) vb.m.h0(r12)).f131a + 1 : ((u) vb.m.Y(r12)).f131a - 1;
            if (i10 < 0 || i10 >= tVar.f127n) {
                return;
            }
            a aVar = this.f42a;
            if (i10 != aVar.f3a) {
                if (aVar.f4b != z10 && (y0Var3 = (y0) aVar.f5c) != null) {
                    y0Var3.cancel();
                }
                aVar.f4b = z10;
                aVar.f3a = i10;
                g0 g0Var = this.f57p.f166a;
                h1.g gVarD = h1.t.d();
                ic.k kVarE = gVarD != null ? gVarD.e() : null;
                h1.g gVarG = h1.t.g(gVarD);
                try {
                    long j10 = ((t) g0Var.f46e.getValue()).f123j;
                    h1.t.k(gVarD, gVarG, kVarE);
                    aVar.f5c = g0Var.f56o.a(i10, j10);
                } catch (Throwable th2) {
                    h1.t.k(gVarD, gVarG, kVarE);
                    throw th2;
                }
            }
            if (!z10) {
                if (tVar.f125l - ((u) vb.m.Y(r12)).f143m >= f10 || (y0Var = (y0) aVar.f5c) == null) {
                    return;
                }
                y0Var.a();
                return;
            }
            u uVar = (u) vb.m.h0(r12);
            if (((uVar.f143m + uVar.f144n) + tVar.f130q) - tVar.f126m >= (-f10) || (y0Var2 = (y0) aVar.f5c) == null) {
                return;
            }
            y0Var2.a();
        }
    }

    public final void i(int i10, int i11, boolean z10) {
        v vVar = this.f45d;
        if (((b1) vVar.f153b).e() != i10 || ((b1) vVar.f154c).e() != i11) {
            androidx.compose.foundation.lazy.layout.b bVar = this.f54m;
            bVar.e();
            bVar.f577b = null;
            bVar.f578c = -1;
        }
        vVar.q(i10, i11);
        vVar.f155d = null;
        if (!z10) {
            this.f59r.setValue(ub.a0.f21526a);
            return;
        }
        i2.j0 j0Var = this.f51j;
        if (j0Var != null) {
            j0Var.k();
        }
    }
}
