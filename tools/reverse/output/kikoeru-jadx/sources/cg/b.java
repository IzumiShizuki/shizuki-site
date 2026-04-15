package cg;

import android.graphics.Canvas;
import android.os.Build;
import b0.o1;
import c7.e1;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.tencent.bugly.beta.tinker.TinkerUtils;
import g2.f1;
import g2.g1;
import h0.h1;
import h0.r1;
import h0.s1;
import h0.u0;
import h0.z0;
import hf.d1;
import i2.c2;
import i2.d2;
import i7.p2;
import java.util.List;
import java.util.concurrent.CancellationException;
import l0.l1;
import l0.p1;
import q.q1;
import q.r0;
import q.t0;
import q.y1;
import q1.p0;
import u.a2;
import u3.x0;
import x0.n2;
import x0.w0;
import y.a1;
import y.b1;
import y.c1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4001e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(i2.l0 l0Var, i2.p pVar, ic.k kVar) {
        super(1);
        this.f3998b = 6;
        this.f3999c = l0Var;
        this.f4000d = pVar;
        this.f4001e = (jc.m) kVar;
    }

    private final Object f(Object obj) {
        s1.d dVar = (s1.d) obj;
        jc.l.e(dVar, "$this$Canvas");
        dVar.T(p1.e.c(dVar.e()) / 2.0f, dVar.c0(), (q1.m) this.f3999c);
        dVar.T(p1.e.c(dVar.e()) / 2.0f, dVar.c0(), (q1.m) this.f4000d);
        t0.j(dVar, ta.c.a((ta.c) this.f4001e, 0.0f, 0.0f, 0.0f, 12).b(), 0.0f, 0L, null, 62);
        return ub.a0.f21526a;
    }

    private final Object h(Object obj) {
        uh.x xVar = (uh.x) obj;
        jc.l.e(xVar, "item");
        long jC = xVar.c();
        p1.c cVarF = n7.b0.f(x0.b((int) (jC >> 32), (int) (jC & 4294967295L)), gh.g.R(xVar.d()));
        uh.y yVar = (uh.y) this.f3999c;
        return Boolean.valueOf(((Boolean) yVar.f22077h.q((p1.c) this.f4000d, cVarF)).booleanValue() && yVar.f22086q.contains(xVar.b()) && ((Boolean) ((ic.k) this.f4001e).a(xVar)).booleanValue());
    }

    private final Object i(Object obj) {
        g1 g1Var = (g1) this.f4000d;
        f1 f1Var = (f1) obj;
        g2.x0 x0Var = (g2.x0) this.f4001e;
        a1 a1Var = (a1) this.f3999c;
        if (a1Var.f25084q) {
            f1.k(f1Var, g1Var, x0Var.a0(a1Var.f25082o), x0Var.a0(a1Var.f25083p));
        } else {
            f1Var.h(g1Var, x0Var.a0(a1Var.f25082o), x0Var.a0(a1Var.f25083p), 0.0f);
        }
        return ub.a0.f21526a;
    }

    private final Object j(Object obj) {
        g1 g1Var = (g1) this.f4001e;
        f1 f1Var = (f1) obj;
        b1 b1Var = (b1) this.f3999c;
        long j10 = ((f3.j) b1Var.f25092o.a((g2.x0) this.f4000d)).f6660a;
        if (b1Var.f25093p) {
            f1.l(f1Var, g1Var, (int) (j10 >> 32), (int) (j10 & 4294967295L));
        } else {
            f1.o(f1Var, g1Var, (int) (j10 >> 32), (int) (j10 & 4294967295L), null, 12);
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13, types: [ic.k, jc.m] */
    /* JADX WARN: Type inference failed for: r9v8, types: [ic.k, jc.m] */
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
    @Override // ic.k
    public final Object a(Object obj) {
        q1.m mVarE;
        e3.n nVar;
        q1.o oVar;
        Integer numE;
        Integer numD;
        Integer numD2;
        Integer numE2;
        t2.i0 i0Var;
        t2.i0 i0Var2;
        r1 r1Var;
        r1 r1Var2;
        t2.i0 i0Var3;
        t2.i0 i0Var4;
        r1 r1Var3;
        r1 r1Var4;
        Integer numD3;
        Integer numE3;
        Integer numE4;
        Integer numD4;
        androidx.media3.exoplayer.offline.u uVar;
        i2.p pVar;
        int i10 = this.f3998b;
        int i11 = 3;
        int i12 = 2;
        y2.y yVar = null;
        p0Var = null;
        p0 p0Var = null;
        Object obj2 = null;
        yVar = null;
        boolean zBooleanValue = false;
        Object[] objArr = 0;
        int i13 = 4;
        int i14 = 1;
        ub.a0 a0Var = ub.a0.f21526a;
        Object obj3 = this.f4000d;
        Object obj4 = this.f3999c;
        Object obj5 = this.f4001e;
        switch (i10) {
            case 0:
                x xVar = (x) obj;
                jc.l.e(xVar, "it");
                ((w0) obj4).setValue(xVar);
                ((w0) obj3).setValue(Boolean.TRUE);
                ((o1) obj5).a(xVar);
                return a0Var;
            case 1:
                long j10 = ((p1.b) obj).f16481a;
                g8.a.T("onDragStart", "GestureController");
                ((jc.x) obj4).f10837a = ((Number) ((v) obj3).f4121j.getValue()).longValue();
                ((jc.v) obj5).f10835a = 0.0f;
                return a0Var;
            case 2:
                y2.y yVar2 = (y2.y) obj;
                ((w0) obj4).setValue(yVar2);
                w0 w0Var = (w0) obj3;
                boolean zA = jc.l.a((String) w0Var.getValue(), yVar2.f25434a.f20320b);
                t2.g gVar = yVar2.f25434a;
                w0Var.setValue(gVar.f20320b);
                if (!zA) {
                    ((ic.k) obj5).a(gVar.f20320b);
                }
                return a0Var;
            case 3:
                s1.d dVar = (s1.d) obj;
                u0 u0Var = (u0) obj4;
                r1 r1VarD = u0Var.d();
                if (r1VarD != null) {
                    y2.y yVar3 = (y2.y) obj3;
                    y2.r rVar = (y2.r) obj5;
                    q1.o oVarZ = dVar.S().z();
                    long j11 = ((t2.k0) u0Var.f7882z.getValue()).f20358a;
                    long j12 = ((t2.k0) u0Var.A.getValue()).f20358a;
                    t2.i0 i0Var5 = r1VarD.f7827a;
                    t2.n nVar2 = i0Var5.f20345b;
                    t2.h0 h0Var = i0Var5.f20344a;
                    p4.p pVar2 = u0Var.f7880x;
                    long j13 = u0Var.f7881y;
                    if (!t2.k0.b(j11)) {
                        pVar2.i(j13);
                        int iP = rVar.p(t2.k0.e(j11));
                        int iP2 = rVar.p(t2.k0.d(j11));
                        if (iP != iP2) {
                            oVarZ.l(i0Var5.i(iP, iP2), pVar2);
                        }
                    } else if (!t2.k0.b(j12)) {
                        long jB = h0Var.f20327b.b();
                        q1.q qVar = jB == 16 ? null : new q1.q(jB);
                        long j14 = qVar != null ? qVar.f17577a : q1.q.f17569b;
                        pVar2.i(q1.q.b(q1.q.d(j14) * 0.2f, j14));
                        int iP3 = rVar.p(t2.k0.e(j12));
                        int iP4 = rVar.p(t2.k0.d(j12));
                        if (iP3 != iP4) {
                            oVarZ.l(i0Var5.i(iP3, iP4), pVar2);
                        }
                    } else if (!t2.k0.b(yVar3.f25435b)) {
                        pVar2.i(j13);
                        long j15 = yVar3.f25435b;
                        int iP5 = rVar.p(t2.k0.e(j15));
                        int iP6 = rVar.p(t2.k0.d(j15));
                        if (iP5 != iP6) {
                            oVarZ.l(i0Var5.i(iP5, iP6), pVar2);
                        }
                    }
                    boolean z10 = i0Var5.d() && h0Var.f20331f != 3;
                    if (z10) {
                        long j16 = i0Var5.f20346c;
                        p1.c cVarF = n7.b0.f(0L, (((long) Float.floatToRawIntBits((int) (j16 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j16 & 4294967295L))) & 4294967295L));
                        oVarZ.f();
                        oVarZ.m(cVarF);
                    }
                    t2.d0 d0Var = h0Var.f20327b.f20362a;
                    e3.l lVar = d0Var.f20305m;
                    e3.o oVar2 = d0Var.f20293a;
                    if (lVar == null) {
                        lVar = e3.l.f6082b;
                    }
                    e3.l lVar2 = lVar;
                    q1.k0 k0Var = d0Var.f20306n;
                    if (k0Var == null) {
                        k0Var = q1.k0.f17544d;
                    }
                    q1.k0 k0Var2 = k0Var;
                    s1.e eVar = d0Var.f20308p;
                    if (eVar == null) {
                        eVar = s1.g.f19351a;
                    }
                    s1.e eVar2 = eVar;
                    try {
                        mVarE = oVar2.e();
                        nVar = e3.n.f6087a;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        if (mVarE != null) {
                            oVar = oVarZ;
                            t2.n.j(nVar2, oVar, mVarE, oVar2 != nVar ? oVar2.a() : 1.0f, k0Var2, lVar2, eVar2);
                        } else {
                            oVar = oVarZ;
                            t2.n.i(nVar2, oVar, oVar2 != nVar ? oVar2.b() : q1.q.f17569b, k0Var2, lVar2, eVar2);
                        }
                        if (z10) {
                            oVar.r();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (z10) {
                            oVarZ.r();
                        }
                        throw th;
                    }
                }
                return a0Var;
            case 4:
                ic.k kVar = (ic.k) obj3;
                y2.c0 c0Var = (y2.c0) ((jc.y) obj5).f10838a;
                y2.y yVarL = ((v2.e) obj4).l((List) obj);
                if (c0Var != null) {
                    c0Var.a(null, yVarL);
                }
                kVar.a(yVarL);
                return a0Var;
            case 5:
                l0.f1 f1Var = (l0.f1) obj;
                h1 h1Var = (h1) obj3;
                int iOrdinal = ((h0.m0) obj4).ordinal();
                int i15 = 19;
                switch (iOrdinal) {
                    case 0:
                        f1Var.f11476e.f11595a = null;
                        if (f1Var.f11478g.f20320b.length() > 0) {
                            if (t2.k0.b(f1Var.f11477f)) {
                                f1Var.i();
                            } else if (f1Var.f()) {
                                int iE = t2.k0.e(f1Var.f11477f);
                                f1Var.p(iE, iE);
                            } else {
                                int iD = t2.k0.d(f1Var.f11477f);
                                f1Var.p(iD, iD);
                            }
                        }
                        return a0Var;
                    case 1:
                        f1Var.f11476e.f11595a = null;
                        if (f1Var.f11478g.f20320b.length() > 0) {
                            if (t2.k0.b(f1Var.f11477f)) {
                                f1Var.l();
                            } else if (f1Var.f()) {
                                int iD2 = t2.k0.d(f1Var.f11477f);
                                f1Var.p(iD2, iD2);
                            } else {
                                int iE2 = t2.k0.e(f1Var.f11477f);
                                f1Var.p(iE2, iE2);
                            }
                        }
                        return a0Var;
                    case 2:
                        p1 p1Var = f1Var.f11476e;
                        p1Var.f11595a = null;
                        t2.g gVar2 = f1Var.f11478g;
                        String str = gVar2.f20320b;
                        String str2 = gVar2.f20320b;
                        if (str.length() > 0) {
                            if (f1Var.f()) {
                                p1Var.f11595a = null;
                                if (str2.length() > 0 && (numD = f1Var.d()) != null) {
                                    int iIntValue = numD.intValue();
                                    f1Var.p(iIntValue, iIntValue);
                                }
                            } else {
                                p1Var.f11595a = null;
                                if (str2.length() > 0 && (numE = f1Var.e()) != null) {
                                    int iIntValue2 = numE.intValue();
                                    f1Var.p(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        return a0Var;
                    case 3:
                        p1 p1Var2 = f1Var.f11476e;
                        p1Var2.f11595a = null;
                        t2.g gVar3 = f1Var.f11478g;
                        String str3 = gVar3.f20320b;
                        String str4 = gVar3.f20320b;
                        if (str3.length() > 0) {
                            if (f1Var.f()) {
                                p1Var2.f11595a = null;
                                if (str4.length() > 0 && (numE2 = f1Var.e()) != null) {
                                    int iIntValue3 = numE2.intValue();
                                    f1Var.p(iIntValue3, iIntValue3);
                                }
                            } else {
                                p1Var2.f11595a = null;
                                if (str4.length() > 0 && (numD2 = f1Var.d()) != null) {
                                    int iIntValue4 = numD2.intValue();
                                    f1Var.p(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        return a0Var;
                    case 4:
                        f1Var.j();
                        return a0Var;
                    case 5:
                        f1Var.k();
                        return a0Var;
                    case 6:
                        f1Var.n();
                        return a0Var;
                    case 7:
                        f1Var.m();
                        return a0Var;
                    case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                        f1Var.f11476e.f11595a = null;
                        if (f1Var.f11478g.f20320b.length() > 0) {
                            if (f1Var.f()) {
                                f1Var.n();
                            } else {
                                f1Var.m();
                            }
                        }
                        return a0Var;
                    case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                        f1Var.f11476e.f11595a = null;
                        if (f1Var.f11478g.f20320b.length() > 0) {
                            if (f1Var.f()) {
                                f1Var.m();
                            } else {
                                f1Var.n();
                            }
                        }
                        return a0Var;
                    case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                        if (f1Var.f11478g.f20320b.length() > 0 && (i0Var = f1Var.f11474c) != null) {
                            int iG = f1Var.g(i0Var, -1);
                            f1Var.p(iG, iG);
                        }
                        return a0Var;
                    case 11:
                        if (f1Var.f11478g.f20320b.length() > 0 && (i0Var2 = f1Var.f11474c) != null) {
                            int iG2 = f1Var.g(i0Var2, 1);
                            f1Var.p(iG2, iG2);
                        }
                        return a0Var;
                    case 12:
                        if (f1Var.f11478g.f20320b.length() > 0 && (r1Var = f1Var.f11480i) != null) {
                            int iH = f1Var.h(r1Var, -1);
                            f1Var.p(iH, iH);
                        }
                        return a0Var;
                    case 13:
                        if (f1Var.f11478g.f20320b.length() > 0 && (r1Var2 = f1Var.f11480i) != null) {
                            int iH2 = f1Var.h(r1Var2, 1);
                            f1Var.p(iH2, iH2);
                        }
                        return a0Var;
                    case 14:
                        f1Var.f11476e.f11595a = null;
                        if (f1Var.f11478g.f20320b.length() > 0) {
                            f1Var.p(0, 0);
                        }
                        return a0Var;
                    case 15:
                        f1Var.f11476e.f11595a = null;
                        t2.g gVar4 = f1Var.f11478g;
                        if (gVar4.f20320b.length() > 0) {
                            int length = gVar4.f20320b.length();
                            f1Var.p(length, length);
                        }
                        return a0Var;
                    case 16:
                        h1Var.f7651b.b(false);
                        return a0Var;
                    case 17:
                        h1Var.f7651b.m();
                        return a0Var;
                    case 18:
                        h1Var.f7651b.d();
                        return a0Var;
                    case 19:
                        List listA = f1Var.a(h0.h.f7638i);
                        if (listA != null) {
                            h1Var.a(listA);
                        }
                        return a0Var;
                    case 20:
                        List listA2 = f1Var.a(h0.h.f7639j);
                        if (listA2 != null) {
                            h1Var.a(listA2);
                        }
                        return a0Var;
                    case 21:
                        List listA3 = f1Var.a(h0.h.f7640k);
                        if (listA3 != null) {
                            h1Var.a(listA3);
                        }
                        return a0Var;
                    case 22:
                        List listA4 = f1Var.a(h0.h.f7641l);
                        if (listA4 != null) {
                            h1Var.a(listA4);
                        }
                        return a0Var;
                    case 23:
                        List listA5 = f1Var.a(h0.h.f7642m);
                        if (listA5 != null) {
                            h1Var.a(listA5);
                        }
                        return a0Var;
                    case 24:
                        List listA6 = f1Var.a(h0.h.f7643n);
                        if (listA6 != null) {
                            h1Var.a(listA6);
                        }
                        return a0Var;
                    case 25:
                        f1Var.f11476e.f11595a = null;
                        t2.g gVar5 = f1Var.f11478g;
                        if (gVar5.f20320b.length() > 0) {
                            f1Var.p(0, gVar5.f20320b.length());
                        }
                        return a0Var;
                    case 26:
                        f1Var.i();
                        f1Var.o();
                        return a0Var;
                    case 27:
                        f1Var.l();
                        f1Var.o();
                        return a0Var;
                    case 28:
                        if (f1Var.f11478g.f20320b.length() > 0 && (i0Var3 = f1Var.f11474c) != null) {
                            int iG3 = f1Var.g(i0Var3, -1);
                            f1Var.p(iG3, iG3);
                        }
                        f1Var.o();
                        return a0Var;
                    case 29:
                        if (f1Var.f11478g.f20320b.length() > 0 && (i0Var4 = f1Var.f11474c) != null) {
                            int iG4 = f1Var.g(i0Var4, 1);
                            f1Var.p(iG4, iG4);
                        }
                        f1Var.o();
                        return a0Var;
                    case 30:
                        if (f1Var.f11478g.f20320b.length() > 0 && (r1Var3 = f1Var.f11480i) != null) {
                            int iH3 = f1Var.h(r1Var3, -1);
                            f1Var.p(iH3, iH3);
                        }
                        f1Var.o();
                        return a0Var;
                    case 31:
                        if (f1Var.f11478g.f20320b.length() > 0 && (r1Var4 = f1Var.f11480i) != null) {
                            int iH4 = f1Var.h(r1Var4, 1);
                            f1Var.p(iH4, iH4);
                        }
                        f1Var.o();
                        return a0Var;
                    case 32:
                        f1Var.f11476e.f11595a = null;
                        if (f1Var.f11478g.f20320b.length() > 0) {
                            f1Var.p(0, 0);
                        }
                        f1Var.o();
                        return a0Var;
                    case 33:
                        f1Var.f11476e.f11595a = null;
                        t2.g gVar6 = f1Var.f11478g;
                        if (gVar6.f20320b.length() > 0) {
                            int length2 = gVar6.f20320b.length();
                            f1Var.p(length2, length2);
                        }
                        f1Var.o();
                        return a0Var;
                    case 34:
                        p1 p1Var3 = f1Var.f11476e;
                        p1Var3.f11595a = null;
                        t2.g gVar7 = f1Var.f11478g;
                        String str5 = gVar7.f20320b;
                        String str6 = gVar7.f20320b;
                        if (str5.length() > 0) {
                            if (f1Var.f()) {
                                p1Var3.f11595a = null;
                                if (str6.length() > 0 && (numE3 = f1Var.e()) != null) {
                                    int iIntValue5 = numE3.intValue();
                                    f1Var.p(iIntValue5, iIntValue5);
                                }
                            } else {
                                p1Var3.f11595a = null;
                                if (str6.length() > 0 && (numD3 = f1Var.d()) != null) {
                                    int iIntValue6 = numD3.intValue();
                                    f1Var.p(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        f1Var.o();
                        return a0Var;
                    case 35:
                        p1 p1Var4 = f1Var.f11476e;
                        p1Var4.f11595a = null;
                        t2.g gVar8 = f1Var.f11478g;
                        String str7 = gVar8.f20320b;
                        String str8 = gVar8.f20320b;
                        if (str7.length() > 0) {
                            if (f1Var.f()) {
                                p1Var4.f11595a = null;
                                if (str8.length() > 0 && (numD4 = f1Var.d()) != null) {
                                    int iIntValue7 = numD4.intValue();
                                    f1Var.p(iIntValue7, iIntValue7);
                                }
                            } else {
                                p1Var4.f11595a = null;
                                if (str8.length() > 0 && (numE4 = f1Var.e()) != null) {
                                    int iIntValue8 = numE4.intValue();
                                    f1Var.p(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        f1Var.o();
                        return a0Var;
                    case 36:
                        f1Var.j();
                        f1Var.o();
                        return a0Var;
                    case 37:
                        f1Var.k();
                        f1Var.o();
                        return a0Var;
                    case 38:
                        f1Var.n();
                        f1Var.o();
                        return a0Var;
                    case 39:
                        f1Var.m();
                        f1Var.o();
                        return a0Var;
                    case 40:
                        f1Var.f11476e.f11595a = null;
                        if (f1Var.f11478g.f20320b.length() > 0) {
                            if (f1Var.f()) {
                                f1Var.n();
                            } else {
                                f1Var.m();
                            }
                        }
                        f1Var.o();
                        return a0Var;
                    case 41:
                        f1Var.f11476e.f11595a = null;
                        if (f1Var.f11478g.f20320b.length() > 0) {
                            if (f1Var.f()) {
                                f1Var.m();
                            } else {
                                f1Var.n();
                            }
                        }
                        f1Var.o();
                        return a0Var;
                    case 42:
                        f1Var.f11476e.f11595a = null;
                        if (f1Var.f11478g.f20320b.length() > 0) {
                            long j17 = f1Var.f11477f;
                            int i16 = t2.k0.f20357c;
                            int i17 = (int) (j17 & 4294967295L);
                            f1Var.p(i17, i17);
                        }
                        return a0Var;
                    case 43:
                        if (h1Var.f7654e) {
                            h1Var.f7650a.f7879w.a(new y2.i(h1Var.f7661l));
                        } else {
                            h1Var.a(ud.b.w(new y2.a(1, "\n")));
                        }
                        return a0Var;
                    case 44:
                        if (h1Var.f7654e) {
                            ((jc.u) obj5).f10834a = false;
                        } else {
                            h1Var.a(ud.b.w(new y2.a(1, "\t")));
                        }
                        return a0Var;
                    case TinkerUtils.MIN_MEMORY_HEAP_SIZE /* 45 */:
                        s1 s1Var = h1Var.f7657h;
                        if (s1Var != null) {
                            s1Var.a(y2.y.a(f1Var.f11479h, f1Var.f11478g, f1Var.f11477f, 4));
                        }
                        s1 s1Var2 = h1Var.f7657h;
                        if (s1Var2 != null) {
                            androidx.media3.exoplayer.offline.u uVar2 = s1Var2.f7833a;
                            if (uVar2 != null && (uVar = (androidx.media3.exoplayer.offline.u) uVar2.f968b) != null) {
                                s1Var2.f7833a = uVar;
                                s1Var2.f7835c -= ((y2.y) uVar2.f969c).f25434a.f20320b.length();
                                s1Var2.f7834b = new androidx.media3.exoplayer.offline.u(i15, s1Var2.f7834b, (y2.y) uVar2.f969c);
                                yVar = (y2.y) uVar.f969c;
                            }
                            if (yVar != null) {
                                h1Var.f7660k.a(yVar);
                            }
                        }
                        return a0Var;
                    case 46:
                        s1 s1Var3 = h1Var.f7657h;
                        if (s1Var3 != null) {
                            androidx.media3.exoplayer.offline.u uVar3 = s1Var3.f7834b;
                            if (uVar3 != null) {
                                s1Var3.f7834b = (androidx.media3.exoplayer.offline.u) uVar3.f968b;
                                y2.y yVar4 = (y2.y) uVar3.f969c;
                                s1Var3.f7833a = new androidx.media3.exoplayer.offline.u(i15, s1Var3.f7833a, yVar4);
                                s1Var3.f7835c = yVar4.f25434a.f20320b.length() + s1Var3.f7835c;
                                obj2 = (y2.y) uVar3.f969c;
                            }
                            if (obj2 != null) {
                                h1Var.f7660k.a(obj2);
                            }
                        }
                        return a0Var;
                    default:
                        return a0Var;
                }
            case 6:
                s1.d dVar2 = (s1.d) obj;
                i2.l0 l0Var = (i2.l0) obj4;
                s1.b bVar = l0Var.f8782a;
                i2.p pVar3 = l0Var.f8783b;
                l0Var.f8783b = (i2.p) obj3;
                try {
                    f3.c cVarB = dVar2.S().B();
                    f3.m mVarC = dVar2.S().C();
                    q1.o oVarZ2 = dVar2.S().z();
                    long jD = dVar2.S().D();
                    t1.b bVar2 = (t1.b) dVar2.S().f3619c;
                    ?? r92 = (jc.m) obj5;
                    f3.c cVarB2 = bVar.f19346b.B();
                    f3.m mVarC2 = bVar.f19346b.C();
                    q1.o oVarZ3 = bVar.f19346b.z();
                    long jD2 = bVar.f19346b.D();
                    e1 e1Var = bVar.f19346b;
                    try {
                        t1.b bVar3 = (t1.b) e1Var.f3619c;
                        e1Var.b0(cVarB);
                        e1Var.c0(mVarC);
                        e1Var.a0(oVarZ2);
                        e1Var.e0(jD);
                        e1Var.f3619c = bVar2;
                        oVarZ2.f();
                        try {
                            r92.a(l0Var);
                            oVarZ2.r();
                            e1 e1Var2 = bVar.f19346b;
                            e1Var2.b0(cVarB2);
                            e1Var2.c0(mVarC2);
                            e1Var2.a0(oVarZ3);
                            e1Var2.e0(jD2);
                            e1Var2.f3619c = bVar3;
                            l0Var.f8783b = pVar3;
                            return a0Var;
                        } catch (Throwable th4) {
                            pVar = pVar3;
                            try {
                                oVarZ2.r();
                                e1 e1Var3 = bVar.f19346b;
                                e1Var3.b0(cVarB2);
                                e1Var3.c0(mVarC2);
                                e1Var3.a0(oVarZ3);
                                e1Var3.e0(jD2);
                                e1Var3.f3619c = bVar3;
                                throw th4;
                            } catch (Throwable th5) {
                                th = th5;
                                l0Var.f8783b = pVar;
                                throw th;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        pVar = pVar3;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    pVar = pVar3;
                }
                break;
            case 7:
                i3.q qVar2 = (i3.q) obj4;
                i2.j0 j0Var = (i2.j0) obj3;
                i3.q qVar3 = (i3.q) obj5;
                q1.o oVarZ4 = ((s1.d) obj).S().z();
                if (qVar2.getView().getVisibility() != 8) {
                    qVar2.f8973x = true;
                    i2.p1 p1Var5 = j0Var.f8755n;
                    j2.v vVar = p1Var5 instanceof j2.v ? (j2.v) p1Var5 : null;
                    if (vVar != null) {
                        Canvas canvasA = q1.c.a(oVarZ4);
                        vVar.getAndroidViewsHandler$ui_release().getClass();
                        qVar3.draw(canvasA);
                    }
                    qVar2.f8973x = false;
                }
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                c2.t tVar = (c2.t) obj;
                if (((l0.l) obj4).i(tVar.f3324c, (l0.s) obj3)) {
                    tVar.a();
                    ((jc.u) obj5).f10834a = true;
                }
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                t.g gVar9 = (t.g) obj;
                l1 l1Var = (l1) obj5;
                int i18 = ((z0) ((n2) obj4).getValue()).f7976a;
                t.l lVar3 = (t.l) obj3;
                h0.a1 a1Var = h0.a1.f7576b;
                if ((i18 & 4) == 4) {
                    t.g.b(gVar9, new d(i13, a1Var), new l0.o1(lVar3, l1Var, objArr == true ? 1 : 0));
                }
                h0.a1 a1Var2 = h0.a1.f7577c;
                if ((i18 & 1) == 1) {
                    t.g.b(gVar9, new d(i13, a1Var2), new l0.o1(lVar3, l1Var, i14));
                }
                h0.a1 a1Var3 = h0.a1.f7578d;
                if ((i18 & 2) == 2) {
                    t.g.b(gVar9, new d(i13, a1Var3), new l0.o1(lVar3, l1Var, i12));
                }
                h0.a1 a1Var4 = h0.a1.f7579e;
                if ((i18 & 8) == 8) {
                    t.g.b(gVar9, new d(i13, a1Var4), new l0.o1(lVar3, l1Var, i11));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    h0.a1 a1Var5 = h0.a1.f7580f;
                    if (l1Var.h() && t2.k0.b(l1Var.k().f25435b)) {
                        t.g.b(gVar9, new d(i13, a1Var5), new l0.o1(lVar3, l1Var, i13));
                    }
                }
                return a0Var;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                d2 d2Var = (d2) obj;
                m1.d dVar3 = (m1.d) d2Var;
                if (!((m1.a) ((j2.v) i2.f.z((m1.d) obj3)).m4getDragAndDropManager()).f14020b.contains(dVar3) || !pc.f0.d(dVar3, a.a.F((p2) obj5))) {
                    return c2.f8657a;
                }
                ((jc.y) obj4).f10838a = d2Var;
                return c2.f8659c;
            case 11:
                o1.v vVar2 = (o1.v) obj;
                if (!jc.l.a(vVar2, (o1.v) obj4)) {
                    if (jc.l.a(vVar2, ((o1.k) obj3).f16099c)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) ((jc.m) obj5).a(vVar2)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 12:
                return new f7.m((h1.s) obj4, obj3, (q.m) obj5);
            case 13:
                return ((Boolean) obj).booleanValue() == ((Boolean) ((q.x) obj4).f17472b.f18542d.getValue()).booleanValue() ? (p1.c) obj3 : (p1.c) obj5;
            case 14:
                q1.i0 i0Var6 = (q1.i0) obj;
                n2 n2Var = (n2) obj3;
                n2 n2Var2 = (n2) obj4;
                i0Var6.b(n2Var2 != null ? ((Number) n2Var2.getValue()).floatValue() : 1.0f);
                i0Var6.f(n2Var != null ? ((Number) n2Var.getValue()).floatValue() : 1.0f);
                i0Var6.g(n2Var != null ? ((Number) n2Var.getValue()).floatValue() : 1.0f);
                n2 n2Var3 = (n2) obj5;
                i0Var6.k(n2Var3 != null ? ((p0) n2Var3.getValue()).f17568a : p0.f17566b);
                return a0Var;
            case 15:
                r0 r0Var = (r0) obj5;
                int iOrdinal2 = ((q.f0) obj).ordinal();
                if (iOrdinal2 == 0) {
                    y1 y1Var = r0Var.f17436a;
                } else if (iOrdinal2 == 1) {
                    p0Var = (p0) obj4;
                } else {
                    if (iOrdinal2 != 2) {
                        throw new ce.j0();
                    }
                    y1 y1Var2 = r0Var.f17436a;
                }
                return new p0(p0Var != null ? p0Var.f17568a : p0.f17566b);
            case 16:
                f1 f1Var2 = (f1) obj;
                q1 q1Var = (q1) obj3;
                g2.c0 c0VarD = f1Var2.d();
                if (c0VarD != null) {
                    if (((g2.x0) obj4).O()) {
                        q1Var.f17420h = c0VarD;
                    } else {
                        q1Var.f17419g = c0VarD;
                    }
                }
                f1Var2.h((g1) obj5, 0, 0, 0.0f);
                return a0Var;
            case 17:
                float fFloatValue = ((Number) obj).floatValue();
                u.g gVar10 = (u.g) obj4;
                float f10 = gVar10.f20902q ? 1.0f : -1.0f;
                u.c2 c2Var = gVar10.f20901p;
                long jE = c2Var.e(c2Var.h(f10 * fFloatValue));
                u.c2 c2Var2 = ((a2) obj5).f20805a;
                float fG = c2Var.g(c2Var.e(u.c2.a(c2Var2, c2Var2.f20853j, jE, 1))) * f10;
                if (Math.abs(fG) < Math.abs(fFloatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')');
                    cancellationException.initCause(null);
                    ((d1) obj3).g(cancellationException);
                }
                return a0Var;
            case 18:
                r.i iVar = (r.i) obj;
                jc.v vVar3 = (jc.v) obj4;
                float fFloatValue2 = ((Number) iVar.f18451e.getValue()).floatValue() - vVar3.f10835a;
                float fA = ((u.y1) obj3).a(fFloatValue2);
                vVar3.f10835a = ((Number) iVar.f18451e.getValue()).floatValue();
                ((jc.v) obj5).f10835a = ((Number) iVar.f18447a.f18597b.a(iVar.f18452f)).floatValue();
                if (Math.abs(fFloatValue2 - fA) > 0.5f) {
                    iVar.a();
                }
                return a0Var;
            case 19:
                d2.e eVar3 = (d2.e) obj4;
                d2.d dVar4 = eVar3.f5463b;
                d2.d dVar5 = eVar3.f5462a;
                lc.b.j(eVar3, (c2.t) obj);
                c2.j0 j0Var2 = (c2.j0) ((c2.x) obj3);
                j0Var2.getClass();
                float fE = i2.f.y(j0Var2).A.e();
                long jC = pc.f0.c(fE, fE);
                if (f3.q.b(jC) <= 0.0f || f3.q.c(jC) <= 0.0f) {
                    f2.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) f3.q.g(jC)));
                }
                long jC2 = pc.f0.c(dVar5.b(f3.q.b(jC)), dVar4.b(f3.q.c(jC)));
                d2.a[] aVarArr = dVar5.f5457d;
                vb.l.p0(0, aVarArr.length, aVarArr);
                dVar5.f5458e = 0;
                d2.a[] aVarArr2 = dVar4.f5457d;
                vb.l.p0(0, aVarArr2.length, aVarArr2);
                dVar4.f5458e = 0;
                eVar3.f5464c = 0L;
                kf.f fVar = ((u.k0) obj5).f20979u;
                if (fVar != null) {
                    i7.k kVar2 = u.l0.f20995a;
                    fVar.e(new u.o(pc.f0.c(Float.isNaN(f3.q.b(jC2)) ? 0.0f : f3.q.b(jC2), Float.isNaN(f3.q.c(jC2)) ? 0.0f : f3.q.c(jC2))));
                }
                return a0Var;
            case 20:
                return f(obj);
            case 21:
                return h(obj);
            case 22:
                return i(obj);
            case 23:
                return j(obj);
            default:
                g1 g1Var = (g1) obj3;
                f1 f1Var3 = (f1) obj;
                g2.x0 x0Var = (g2.x0) obj5;
                c1 c1Var = (c1) obj4;
                if (c1Var.f25104s) {
                    f1.k(f1Var3, g1Var, x0Var.a0(c1Var.f25100o), x0Var.a0(c1Var.f25101p));
                } else {
                    f1Var3.h(g1Var, x0Var.a0(c1Var.f25100o), x0Var.a0(c1Var.f25101p), 0.0f);
                }
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ic.k kVar, w0 w0Var, w0 w0Var2) {
        super(1);
        this.f3998b = 2;
        this.f4001e = kVar;
        this.f3999c = w0Var;
        this.f4000d = w0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i10) {
        super(1);
        this.f3998b = i10;
        this.f3999c = obj;
        this.f4000d = obj2;
        this.f4001e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jc.v vVar, u.y1 y1Var, jc.v vVar2, u.i iVar) {
        super(1);
        this.f3998b = 18;
        this.f3999c = vVar;
        this.f4000d = y1Var;
        this.f4001e = vVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(o1.v vVar, o1.k kVar, ic.k kVar2) {
        super(1);
        this.f3998b = 11;
        this.f3999c = vVar;
        this.f4000d = kVar;
        this.f4001e = (jc.m) kVar2;
    }
}
