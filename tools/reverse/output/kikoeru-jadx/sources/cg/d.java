package cg;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import b0.o1;
import com.tencent.bugly.beta.tinker.TinkerReport;
import h0.a1;
import h0.c1;
import h0.q0;
import hf.r1;
import i7.u2;
import j2.k1;
import java.util.List;
import l0.b1;
import l0.l1;
import l0.y0;
import q.r0;
import r.y1;
import u.t1;
import u.u1;
import u3.x0;
import x0.e1;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4010c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11, Object obj) {
        super(2);
        this.f4009b = i11;
        this.f4010c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v92, types: [rf.c] */
    /* JADX WARN: Type inference failed for: r8v13, types: [hf.z, yb.c, yb.h] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
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
    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        long j10;
        uh.b bVar;
        long jI;
        yb.c cVar;
        boolean zB;
        uh.x xVarC;
        ?? r82;
        switch (this.f4009b) {
            case 0:
                x xVar = (x) obj;
                ((Number) obj2).floatValue();
                jc.l.e(xVar, "type1");
                ((o1) this.f4010c).a(xVar);
                return ub.a0.f21526a;
            case 1:
                ((Number) obj2).intValue();
                android.support.v4.media.session.b.i((b0.i0) this.f4010c, (x0.o) obj, x0.v.D(1));
                return ub.a0.f21526a;
            case 2:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    List list = (List) this.f4010c;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ic.n nVar = (ic.n) list.get(i10);
                        long j11 = oVar.T;
                        int i11 = (int) (j11 ^ (j11 >>> 32));
                        i2.k.f8771g0.getClass();
                        i2.i iVar = i2.j.f8734c;
                        oVar.a0();
                        if (oVar.S) {
                            oVar.k(iVar);
                        } else {
                            oVar.k0();
                        }
                        i2.h hVar = i2.j.f8741j;
                        if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(i11))) {
                            j2.h0.s(i11, oVar, i11, hVar);
                        }
                        nVar.q(oVar, 0);
                        oVar.p(true);
                    }
                } else {
                    oVar.Q();
                }
                return ub.a0.f21526a;
            case 3:
                long jLongValue = ((Number) obj2).longValue();
                if (b1.a((y0) this.f4010c, jLongValue)) {
                    return Long.valueOf(jLongValue);
                }
                return null;
            case 4:
                x0.o oVar2 = (x0.o) obj;
                ((Number) obj2).intValue();
                oVar2.W(-1744780674);
                String strE = n7.e.E(((a1) this.f4010c).f7582a, oVar2);
                oVar2.p(false);
                return strE;
            case 5:
                ((Number) obj2).intValue();
                q0.g((l1) this.f4010c, (x0.o) obj, x0.v.D(1));
                return ub.a0.f21526a;
            case 6:
                ((c1) this.f4010c).e(((p1.b) obj2).f16481a);
                return ub.a0.f21526a;
            case 7:
                i7.w wVar = (i7.w) obj;
                i7.w wVar2 = (i7.w) obj2;
                jc.l.e(wVar, "prependHint");
                jc.l.e(wVar2, "appendHint");
                u2 u2Var = (u2) this.f4010c;
                if (i7.u.d(u2Var, wVar.f9346a, i7.d0.f9072b)) {
                    wVar.f9346a = u2Var;
                    wVar.f9347b.j(u2Var);
                }
                if (i7.u.d(u2Var, wVar2.f9346a, i7.d0.f9073c)) {
                    wVar2.f9346a = u2Var;
                    wVar2.f9347b.j(u2Var);
                }
                return ub.a0.f21526a;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                j1.q qVar = (j1.q) obj;
                j1.q qVarB = (j1.o) obj2;
                x0.o oVar3 = (x0.o) this.f4010c;
                if (qVarB instanceof j1.k) {
                    ic.o oVar4 = ((j1.k) qVarB).f9686b;
                    jc.c0.c(3, oVar4);
                    qVarB = j1.a.b((j1.q) oVar4.g(j1.n.f9689a, oVar3, 0), oVar3);
                }
                return qVar.e(qVarB);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                x0.o oVar5 = (x0.o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (oVar5.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ((j2.a) this.f4010c).a(0, oVar5);
                } else {
                    oVar5.Q();
                }
                return ub.a0.f21526a;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                ((Number) obj2).intValue();
                ((k1) this.f4010c).a(x0.v.D(1), (x0.o) obj);
                return ub.a0.f21526a;
            case 11:
                x0.o oVar6 = (x0.o) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (oVar6.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objK = oVar6.K();
                    if (objK == x0.k.f24334a) {
                        objK = j3.c.f10115c;
                        oVar6.h0(objK);
                    }
                    android.support.v4.media.session.b.p(new AppendedSemanticsElement((ic.k) objK, false), (ic.n) ((w0) this.f4010c).getValue(), oVar6, 0);
                } else {
                    oVar6.Q();
                }
                return ub.a0.f21526a;
            case 12:
                ((Number) obj2).intValue();
                ((j3.p) this.f4010c).a(x0.v.D(1), (x0.o) obj);
                return ub.a0.f21526a;
            case 13:
                ((Number) obj2).intValue();
                ((j3.u) this.f4010c).a(x0.v.D(1), (x0.o) obj);
                return ub.a0.f21526a;
            case 14:
                g2.c0 c0Var = (g2.c0) this.f4010c;
                g2.c0 c0VarC = ((l0.n) obj).c();
                g2.c0 c0VarC2 = ((l0.n) obj2).c();
                long jO = c0VarC != null ? c0Var.o(c0VarC, 0L) : 0L;
                long jO2 = c0VarC2 != null ? c0Var.o(c0VarC2, 0L) : 0L;
                int i12 = (int) (jO & 4294967295L);
                int i13 = (int) (4294967295L & jO2);
                return Integer.valueOf(Float.intBitsToFloat(i12) == Float.intBitsToFloat(i13) ? ud.b.j(Float.valueOf(Float.intBitsToFloat((int) (jO >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jO2 >> 32)))) : ud.b.j(Float.valueOf(Float.intBitsToFloat(i12)), Float.valueOf(Float.intBitsToFloat(i13))));
            case 15:
                q.f0 f0Var = (q.f0) obj;
                q.f0 f0Var2 = (q.f0) obj2;
                q.f0 f0Var3 = q.f0.f17292c;
                return Boolean.valueOf(f0Var == f0Var3 && f0Var2 == f0Var3 && !((r0) this.f4010c).f17436a.f17482d);
            case 16:
                ((Number) obj2).intValue();
                ((r.e0) this.f4010c).a(x0.v.D(1), (x0.o) obj);
                return ub.a0.f21526a;
            case 17:
                float fFloatValue = ((Number) obj).floatValue();
                float fFloatValue2 = ((Number) obj2).floatValue();
                u1 u1Var = (u1) this.f4010c;
                hf.a0.y(u1Var.n0(), null, null, new t1(u1Var, fFloatValue, fFloatValue2, null), 3);
                return Boolean.TRUE;
            case 18:
                c2.t tVar = (c2.t) obj;
                long j12 = ((p1.b) obj2).f16481a;
                jc.l.e(tVar, "change");
                tVar.a();
                uh.y yVar = ((uh.j) this.f4010c).f22009a;
                ?? r12 = yVar.f22078i;
                uh.g0 g0Var = yVar.f22075f;
                a0.z zVar = yVar.f22070a;
                e1 e1Var = yVar.f22081l;
                e1Var.setValue(new p1.b(p1.b.i(((p1.b) e1Var.getValue()).f16481a, j12)));
                uh.x xVarD = yVar.d();
                if (xVarD != null) {
                    long jH = yVar.h(yVar.e());
                    yVar.i(jH);
                    long jC = xVarD.c();
                    long jI2 = p1.b.i(x0.b((int) (jC >> 32), (int) (jC & 4294967295L)), jH);
                    long jR = gh.g.R(xVarD.d());
                    long jB = x0.b(p1.e.d(jR) + p1.b.e(jI2), p1.e.b(jR) + p1.b.f(jI2));
                    y1 y1VarA = zVar.a();
                    uh.a aVar = yVar.f22074e;
                    u.e1 e1VarW = y1VarA.W();
                    ((a0.t) y1VarA.f18634b).getClass();
                    jc.l.e(e1VarW, "orientation");
                    int iOrdinal = e1VarW.ordinal();
                    if (iOrdinal == 0) {
                        j10 = 4294967295L;
                        bVar = new uh.b(aVar.f21946c, aVar.f21947d);
                    } else {
                        if (iOrdinal != 1) {
                            throw new ce.j0();
                        }
                        j10 = 4294967295L;
                        bVar = new uh.b(aVar.f21944a, aVar.f21945b);
                    }
                    uh.z zVarX = y1VarA.X(bVar);
                    float f10 = zVarX.f22090a;
                    float f11 = zVarX.f22091b;
                    ((a0.t) zVar.a().f18634b).getClass();
                    boolean z10 = yVar.f22076g == f3.m.f6668b && yVar.f() == u.e1.f20883b;
                    if (z10) {
                        jI = p1.b.h(jB, yVar.f22085p);
                    } else {
                        if (z10) {
                            throw new ce.j0();
                        }
                        jI = p1.b.i(jI2, yVar.f22085p);
                    }
                    long jQ = ua.l.Q(yVar.f(), -((a0.t) zVar.a().f18634b).f125l);
                    long jI3 = p1.b.i(jI, x0.b((int) (jQ >> 32), (int) (jQ & j10)));
                    float fS = ua.l.S(jI3, yVar.f()) - f10;
                    if (fS < 0.0f) {
                        fS = 0.0f;
                    }
                    float fS2 = f11 - ua.l.S(jI3, yVar.f());
                    if (fS2 < 0.0f) {
                        fS2 = 0.0f;
                    }
                    float f12 = yVar.f22073d;
                    if (fS < f12) {
                        zB = g0Var.b(uh.a0.f21948a, (1 - nh.b.j((fS + f12) / (f12 * 2), 0.0f, 1.0f)) * 10, new uh.n(yVar, 2), new uh.r(yVar, null, 0));
                        cVar = null;
                    } else if (fS2 < f12) {
                        cVar = null;
                        zB = g0Var.b(uh.a0.f21949b, (1 - nh.b.j((fS2 + f12) / (f12 * 2), 0.0f, 1.0f)) * 10, new uh.n(yVar, 3), new uh.r(yVar, cVar, 1));
                    } else {
                        cVar = null;
                        hf.a0.y(g0Var.f21999b, null, null, new uh.e0(g0Var, cVar, 1), 3);
                        zB = false;
                    }
                    if (r12.f()) {
                        r1 r1Var = g0Var.f22001d;
                        if ((r1Var != null && r1Var.b()) || zB || (xVarC = uh.y.c(yVar, n7.b0.e(jI2, jB), zVar.a().Y(), null, new q.a0(15, xVarD), 4)) == null) {
                            r82 = cVar;
                        } else {
                            ?? r83 = cVar;
                            hf.a0.y(yVar.f22071b, r83, r83, new uh.p(yVar, xVarD, xVarC, r83, 1), 3);
                            r82 = r83;
                        }
                        r12.b(r82);
                    }
                }
                return ub.a0.f21526a;
            case 19:
                ((Number) obj2).intValue();
                y.p.a((j1.q) this.f4010c, (x0.o) obj, x0.v.D(1));
                return ub.a0.f21526a;
            case 20:
                return new f3.j((((long) ((j1.g) this.f4010c).a(0, (int) (((f3.l) obj).f6666a & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
            default:
                return new f3.j(((j1.d) this.f4010c).a(0L, ((f3.l) obj).f6666a, (f3.m) obj2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, Object obj) {
        super(2);
        this.f4009b = i10;
        this.f4010c = obj;
    }
}
