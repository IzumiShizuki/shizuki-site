package g2;

import android.os.Handler;
import android.view.ViewGroup;
import j2.p3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements x0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.j0 f7253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x0.r f7254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t1 f7255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o.k0 f7258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o.k0 f7259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k0 f7260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h0 f7261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o.k0 f7262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s1 f7263k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o.k0 f7264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z0.e f7265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7266n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7267o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f7268p;

    public p0(i2.j0 j0Var, t1 t1Var) {
        this.f7253a = j0Var;
        this.f7255c = t1Var;
        long[] jArr = o.s0.f16040a;
        this.f7258f = new o.k0();
        this.f7259g = new o.k0();
        this.f7260h = new k0(this);
        this.f7261i = new h0(this);
        this.f7262j = new o.k0();
        this.f7263k = new s1();
        this.f7264l = new o.k0();
        this.f7265m = new z0.e(new Object[16]);
        this.f7268p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // x0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r18 = this;
            r0 = r18
            r1 = 1
            i2.j0 r2 = r0.f7253a
            r2.f8758q = r1
            o.k0 r1 = r0.f7258f
            java.lang.Object[] r3 = r1.f15997c
            long[] r4 = r1.f15995a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = 0
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L4d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L2e:
            if (r12 >= r10) goto L4b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L47
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            g2.i0 r13 = (g2.i0) r13
            x0.u r13 = r13.f7202c
            if (r13 == 0) goto L47
            r13.l()
        L47:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4b:
            if (r10 != r11) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r2.S()
            r2.f8758q = r6
            r1.a()
            o.k0 r1 = r0.f7259g
            r1.a()
            r0.f7267o = r6
            r0.f7266n = r6
            o.k0 r1 = r0.f7262j
            r1.a()
            r0.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.p0.a():void");
    }

    @Override // x0.i
    public final void b() {
        e(true);
    }

    public final void c(int i10) {
        boolean z10;
        boolean z11 = false;
        this.f7266n = 0;
        List listO = this.f7253a.o();
        z0.b bVar = (z0.b) listO;
        int i11 = (bVar.f26366a.f26374c - this.f7267o) - 1;
        if (i10 <= i11) {
            this.f7263k.clear();
            if (i10 <= i11) {
                int i12 = i10;
                while (true) {
                    Object objG = this.f7258f.g((i2.j0) bVar.get(i12));
                    jc.l.b(objG);
                    ((o.h0) this.f7263k.f7285b).a(((i0) objG).f7200a);
                    if (i12 == i11) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f7255c.l(this.f7263k);
            h1.g gVarD = h1.t.d();
            ic.k kVarE = gVarD != null ? gVarD.e() : null;
            h1.g gVarG = h1.t.g(gVarD);
            z10 = false;
            while (i11 >= i10) {
                try {
                    i2.j0 j0Var = (i2.j0) ((z0.b) listO).get(i11);
                    Object objG2 = this.f7258f.g(j0Var);
                    jc.l.b(objG2);
                    i0 i0Var = (i0) objG2;
                    Object obj = i0Var.f7200a;
                    if (((o.h0) this.f7263k.f7285b).c(obj)) {
                        this.f7266n++;
                        if (((Boolean) i0Var.f7205f.getValue()).booleanValue()) {
                            i2.n0 n0Var = j0Var.G;
                            i2.z0 z0Var = n0Var.f8805p;
                            i2.h0 h0Var = i2.h0.f8722c;
                            z0Var.f8914l = h0Var;
                            i2.v0 v0Var = n0Var.f8806q;
                            if (v0Var != null) {
                                v0Var.f8865j = h0Var;
                            }
                            g(i0Var, false);
                            if (i0Var.f7206g) {
                                z10 = true;
                            }
                        }
                    } else {
                        i2.j0 j0Var2 = this.f7253a;
                        j0Var2.f8758q = true;
                        this.f7258f.k(j0Var);
                        x0.u uVar = i0Var.f7202c;
                        if (uVar != null) {
                            uVar.l();
                        }
                        this.f7253a.T(i11, 1);
                        j0Var2.f8758q = false;
                    }
                    this.f7259g.k(obj);
                    i11--;
                } catch (Throwable th2) {
                    h1.t.k(gVarD, gVarG, kVarE);
                    throw th2;
                }
            }
            h1.t.k(gVarD, gVarG, kVarE);
        } else {
            z10 = false;
        }
        if (z10) {
            synchronized (h1.n.f8051c) {
                o.l0 l0Var = h1.n.f8058j.f7989h;
                if (l0Var != null) {
                    if (l0Var.h()) {
                        z11 = true;
                    }
                }
            }
            if (z11) {
                h1.n.a();
            }
        }
        d();
    }

    public final void d() {
        int i10 = ((z0.b) this.f7253a.o()).f26366a.f26374c;
        o.k0 k0Var = this.f7258f;
        if (k0Var.f15999e != i10) {
            f2.a.a("Inconsistency between the count of nodes tracked by the state (" + k0Var.f15999e + ") and the children count on the SubcomposeLayout (" + i10 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i10 - this.f7266n) - this.f7267o < 0) {
            StringBuilder sbO = j2.h0.o(i10, "Incorrect state. Total children ", ". Reusable children ");
            sbO.append(this.f7266n);
            sbO.append(". Precomposed children ");
            sbO.append(this.f7267o);
            f2.a.a(sbO.toString());
        }
        o.k0 k0Var2 = this.f7262j;
        if (k0Var2.f15999e == this.f7267o) {
            return;
        }
        f2.a.a("Incorrect state. Precomposed children " + this.f7267o + ". Map size " + k0Var2.f15999e);
    }

    public final void e(boolean z10) {
        this.f7267o = 0;
        this.f7262j.a();
        List listO = this.f7253a.o();
        int i10 = ((z0.b) listO).f26366a.f26374c;
        if (this.f7266n != i10) {
            this.f7266n = i10;
            h1.g gVarD = h1.t.d();
            ic.k kVarE = gVarD != null ? gVarD.e() : null;
            h1.g gVarG = h1.t.g(gVarD);
            for (int i11 = 0; i11 < i10; i11++) {
                try {
                    i2.j0 j0Var = (i2.j0) ((z0.b) listO).get(i11);
                    i0 i0Var = (i0) this.f7258f.g(j0Var);
                    if (i0Var != null && ((Boolean) i0Var.f7205f.getValue()).booleanValue()) {
                        i2.n0 n0Var = j0Var.G;
                        i2.z0 z0Var = n0Var.f8805p;
                        i2.h0 h0Var = i2.h0.f8722c;
                        z0Var.f8914l = h0Var;
                        i2.v0 v0Var = n0Var.f8806q;
                        if (v0Var != null) {
                            v0Var.f8865j = h0Var;
                        }
                        g(i0Var, z10);
                        i0Var.f7200a = n1.f7244a;
                    }
                } catch (Throwable th2) {
                    h1.t.k(gVarD, gVarG, kVarE);
                    throw th2;
                }
            }
            h1.t.k(gVarD, gVarG, kVarE);
            this.f7259g.a();
        }
        d();
    }

    public final o1 f(ic.n nVar, Object obj) {
        i2.j0 j0Var = this.f7253a;
        if (j0Var.I()) {
            d();
            if (!this.f7259g.c(obj)) {
                this.f7264l.k(obj);
                o.k0 k0Var = this.f7262j;
                Object objG = k0Var.g(obj);
                if (objG == null) {
                    objG = i(obj);
                    if (objG != null) {
                        int i10 = ((z0.b) j0Var.o()).f26366a.i(objG);
                        int i11 = ((z0.b) j0Var.o()).f26366a.f26374c;
                        j0Var.f8758q = true;
                        j0Var.M(i10, i11, 1);
                        j0Var.f8758q = false;
                        this.f7267o++;
                    } else {
                        int i12 = ((z0.b) j0Var.o()).f26366a.f26374c;
                        i2.j0 j0Var2 = new i2.j0(2);
                        j0Var.f8758q = true;
                        j0Var.B(i12, j0Var2);
                        j0Var.f8758q = false;
                        this.f7267o++;
                        objG = j0Var2;
                    }
                    k0Var.m(obj, objG);
                }
                h((i2.j0) objG, obj, nVar);
            }
        }
        return !j0Var.I() ? new n0() : new o0(this, obj);
    }

    public final void g(i0 i0Var, boolean z10) {
        x0.u uVar;
        if (z10 || !i0Var.f7206g) {
            i0Var.f7205f = x0.v.v(Boolean.FALSE);
        } else {
            i0Var.f7205f.setValue(Boolean.FALSE);
        }
        i0Var.getClass();
        if (z10) {
            x0.u uVar2 = i0Var.f7202c;
            if (uVar2 != null) {
                uVar2.k();
                return;
            }
            return;
        }
        i2.n1 outOfFrameExecutor = ((j2.v) i2.m0.a(this.f7253a)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (i0Var.f7206g || (uVar = i0Var.f7202c) == null) {
                return;
            }
            uVar.k();
            return;
        }
        b0.d0 d0Var = new b0.d0(7, i0Var);
        Handler handler = ((j2.v) outOfFrameExecutor).getHandler();
        if (handler == null) {
            throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
        }
        handler.postAtFrontOfQueue(new a9.m(16, d0Var));
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
    public final void h(i2.j0 j0Var, Object obj, ic.n nVar) {
        boolean z10;
        o.k0 k0Var = this.f7258f;
        Object objG = k0Var.g(j0Var);
        Object obj2 = objG;
        if (objG == null) {
            f1.f fVar = n.f7243a;
            i0 i0Var = new i0();
            i0Var.f7200a = obj;
            i0Var.f7201b = fVar;
            i0Var.f7202c = null;
            i0Var.f7205f = x0.v.v(Boolean.TRUE);
            k0Var.m(j0Var, i0Var);
            obj2 = i0Var;
        }
        i0 i0Var2 = (i0) obj2;
        boolean z11 = i0Var2.f7201b != nVar;
        x0.u uVar = i0Var2.f7202c;
        if (uVar != null) {
            synchronized (uVar.f24493d) {
                z10 = uVar.f24503n.f15999e > 0;
            }
        } else {
            z10 = true;
        }
        if (z11 || z10 || i0Var2.f7203d) {
            i0Var2.f7201b = nVar;
            h1.g gVarD = h1.t.d();
            ic.k kVarE = gVarD != null ? gVarD.e() : null;
            h1.g gVarG = h1.t.g(gVarD);
            try {
                i2.j0 j0Var2 = this.f7253a;
                j0Var2.f8758q = true;
                x0.u uVar2 = i0Var2.f7202c;
                x0.r rVar = this.f7254b;
                if (rVar == null) {
                    f2.a.c("parent composition reference not set");
                    throw new ce.j0();
                }
                if (uVar2 == null) {
                    ViewGroup.LayoutParams layoutParams = p3.f9960a;
                    uVar2 = new x0.u(rVar, new c7.e1(j0Var));
                } else {
                    if (uVar2.f24510u == 3) {
                        ViewGroup.LayoutParams layoutParams2 = p3.f9960a;
                        uVar2 = new x0.u(rVar, new c7.e1(j0Var));
                    }
                }
                i0Var2.f7202c = uVar2;
                ic.n fVar2 = i0Var2.f7201b;
                if (((j2.v) i2.m0.a(this.f7253a)).getOutOfFrameExecutor() != null) {
                    i0Var2.f7206g = false;
                } else {
                    i0Var2.f7206g = true;
                    fVar2 = new f1.f(new b0.i0(8, i0Var2, fVar2), 1524156494, true);
                }
                if (i0Var2.f7204e) {
                    uVar2.i();
                    uVar2.p();
                    x0.o oVar = uVar2.f24509t;
                    oVar.f24400z = 100;
                    oVar.f24399y = true;
                    uVar2.f24490a.a(uVar2, fVar2);
                    oVar.s();
                } else {
                    uVar2.A(fVar2);
                }
                i0Var2.f7204e = false;
                j0Var2.f8758q = false;
                h1.t.k(gVarD, gVarG, kVarE);
                i0Var2.f7203d = false;
            } catch (Throwable th2) {
                h1.t.k(gVarD, gVarG, kVarE);
                throw th2;
            }
        }
    }

    public final i2.j0 i(Object obj) {
        o.k0 k0Var;
        int i10;
        if (this.f7266n == 0) {
            return null;
        }
        i2.j0 j0Var = this.f7253a;
        z0.b bVar = (z0.b) j0Var.o();
        int i11 = bVar.f26366a.f26374c - this.f7267o;
        int i12 = i11 - this.f7266n;
        int i13 = i11 - 1;
        int i14 = i13;
        while (true) {
            k0Var = this.f7258f;
            if (i14 < i12) {
                i10 = -1;
                break;
            }
            Object objG = k0Var.g((i2.j0) bVar.get(i14));
            jc.l.b(objG);
            if (jc.l.a(((i0) objG).f7200a, obj)) {
                i10 = i14;
                break;
            }
            i14--;
        }
        if (i10 == -1) {
            while (i13 >= i12) {
                Object objG2 = k0Var.g((i2.j0) bVar.get(i13));
                jc.l.b(objG2);
                i0 i0Var = (i0) objG2;
                Object obj2 = i0Var.f7200a;
                if (obj2 == n1.f7244a || this.f7255c.T(obj, obj2)) {
                    i0Var.f7200a = obj;
                    i14 = i13;
                    i10 = i14;
                    break;
                }
                i13--;
            }
            i14 = i13;
        }
        if (i10 == -1) {
            return null;
        }
        if (i14 != i12) {
            j0Var.f8758q = true;
            j0Var.M(i14, i12, 1);
            j0Var.f8758q = false;
        }
        this.f7266n--;
        i2.j0 j0Var2 = (i2.j0) bVar.get(i12);
        Object objG3 = k0Var.g(j0Var2);
        jc.l.b(objG3);
        i0 i0Var2 = (i0) objG3;
        i0Var2.f7205f = x0.v.v(Boolean.TRUE);
        i0Var2.f7204e = true;
        i0Var2.f7203d = true;
        return j0Var2;
    }
}
