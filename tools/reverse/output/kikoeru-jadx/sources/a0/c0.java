package a0;

import android.view.Choreographer;
import b7.b1;
import bg.o1;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.LinkedHashMap;
import java.util.List;
import u.k1;
import x0.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i10, yb.c cVar, int i11) {
        super(i10, cVar);
        this.f22e = i11;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f22e) {
            case 0:
                return new c0(2, cVar, 0);
            case 1:
                return new c0(2, cVar, 1);
            case 2:
                return new c0(2, cVar, 2);
            case 3:
                return new c0(2, cVar, 3);
            case 4:
                return new c0(2, cVar, 4);
            case 5:
                return new c0(2, cVar, 5);
            case 6:
                return new c0(2, cVar, 6);
            case 7:
                return new c0(2, cVar, 7);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return new c0(2, cVar, 8);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return new c0(2, cVar, 9);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return new c0(2, cVar, 10);
            case 11:
                return new c0(2, cVar, 11);
            case 12:
                return new c0(2, cVar, 12);
            case 13:
                return new c0(2, cVar, 13);
            case 14:
                return new c0(2, cVar, 14);
            case 15:
                return new c0(2, cVar, 15);
            default:
                return new c0(2, cVar, 16);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f22e) {
            case 0:
                c0 c0Var = (c0) o((k1) obj, (yb.c) obj2);
                ub.a0 a0Var = ub.a0.f21526a;
                c0Var.u(a0Var);
                return a0Var;
            case 1:
                c0 c0Var2 = (c0) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var2 = ub.a0.f21526a;
                c0Var2.u(a0Var2);
                return a0Var2;
            case 2:
                c0 c0Var3 = (c0) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var3 = ub.a0.f21526a;
                c0Var3.u(a0Var3);
                return a0Var3;
            case 3:
                return ((c0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 4:
                c0 c0Var4 = (c0) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var4 = ub.a0.f21526a;
                c0Var4.u(a0Var4);
                return a0Var4;
            case 5:
                return ((c0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 6:
                return ((c0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 7:
                c0 c0Var5 = (c0) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var5 = ub.a0.f21526a;
                c0Var5.u(a0Var5);
                return a0Var5;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                c0 c0Var6 = (c0) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var6 = ub.a0.f21526a;
                c0Var6.u(a0Var6);
                return a0Var6;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                c0 c0Var7 = (c0) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var7 = ub.a0.f21526a;
                c0Var7.u(a0Var7);
                return a0Var7;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                c0 c0Var8 = (c0) o((lf.g) obj, (yb.c) obj2);
                ub.a0 a0Var8 = ub.a0.f21526a;
                c0Var8.u(a0Var8);
                return a0Var8;
            case 11:
                return ((c0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 12:
                c0 c0Var9 = (c0) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var9 = ub.a0.f21526a;
                c0Var9.u(a0Var9);
                return a0Var9;
            case 13:
                c0 c0Var10 = (c0) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var10 = ub.a0.f21526a;
                c0Var10.u(a0Var10);
                return a0Var10;
            case 14:
                c0 c0Var11 = (c0) o((k1) obj, (yb.c) obj2);
                ub.a0 a0Var11 = ub.a0.f21526a;
                c0Var11.u(a0Var11);
                return a0Var11;
            case 15:
                c0 c0Var12 = (c0) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var12 = ub.a0.f21526a;
                c0Var12.u(a0Var12);
                return a0Var12;
            default:
                c0 c0Var13 = (c0) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var13 = ub.a0.f21526a;
                c0Var13.u(a0Var13);
                return a0Var13;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        Object objB;
        ug.d0 d0VarF;
        String strN;
        Object objB2;
        String strN2;
        Object objB3;
        String strN3;
        int i10 = this.f22e;
        ka.q qVar = ka.q.f11304b;
        int i11 = 1;
        int i12 = 0;
        ub.a0 a0Var = ub.a0.f21526a;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                return a0Var;
            case 1:
                ub.a.f(obj);
                LinkedHashMap linkedHashMap = b9.f.f2281a;
                b9.f.f2284d.setValue(qVar);
                return a0Var;
            case 2:
                ub.a.f(obj);
                e1 e1Var = b9.f.f2284d;
                if (((ka.q) e1Var.getValue()) == qVar) {
                    e1Var.setValue(ka.q.f11306d);
                }
                return a0Var;
            case 3:
                ub.a.f(obj);
                String str = ag.z.f369a;
                String strF = a9.i.f();
                jc.l.e(strF, "token");
                ch.l lVarD = c.D(ag.z.f369a.concat("/api/circles"));
                lVarD.w("authorization", "Bearer ".concat(strF));
                try {
                    d0VarF = ag.z.f370b.a(new b1(lVarD)).f();
                    try {
                        ug.f0 f0Var = d0VarF.f21762g;
                        jc.l.b(f0Var);
                        strN = f0Var.n();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    objB = ub.a.b(th2);
                }
                if (d0VarF.f21759d != 200) {
                    throw new IllegalStateException(strN.toString());
                }
                xf.r rVar = ag.z.f371c;
                d0.y yVar = rVar.f24989b;
                pc.y yVar2 = pc.y.f16981c;
                objB = rVar.a(strN, n7.e.A(yVar, jc.z.b(nh.a.x(jc.z.a(bg.c.class)))));
                d0VarF.close();
                return new ub.n(objB);
            case 4:
                ub.a.f(obj);
                LinkedHashMap linkedHashMap2 = b9.f.f2281a;
                b9.f.f2284d.setValue(ka.q.f11305c);
                return a0Var;
            case 5:
                ub.a.f(obj);
                String str2 = ag.z.f369a;
                String strF2 = a9.i.f();
                jc.l.e(strF2, "token");
                ch.l lVarD2 = c.D(ag.z.f369a.concat("/api/tags"));
                lVarD2.w("authorization", "Bearer ".concat(strF2));
                try {
                    d0VarF = ag.z.f370b.a(new b1(lVarD2)).f();
                    try {
                        ug.f0 f0Var2 = d0VarF.f21762g;
                        jc.l.b(f0Var2);
                        strN2 = f0Var2.n();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Throwable th3) {
                    objB2 = ub.a.b(th3);
                }
                if (d0VarF.f21759d != 200) {
                    throw new IllegalStateException(strN2.toString());
                }
                xf.r rVar2 = ag.z.f371c;
                d0.y yVar3 = rVar2.f24989b;
                pc.y yVar4 = pc.y.f16981c;
                objB2 = rVar2.a(strN2, n7.e.A(yVar3, jc.z.b(nh.a.x(jc.z.a(bg.e1.class)))));
                d0VarF.close();
                return new ub.n(objB2);
            case 6:
                ub.a.f(obj);
                String str3 = ag.z.f369a;
                String strF3 = a9.i.f();
                jc.l.e(strF3, "token");
                ch.l lVarD3 = c.D(ag.z.f369a.concat("/api/vas"));
                lVarD3.w("authorization", "Bearer ".concat(strF3));
                try {
                    d0VarF = ag.z.f370b.a(new b1(lVarD3)).f();
                    try {
                        ug.f0 f0Var3 = d0VarF.f21762g;
                        jc.l.b(f0Var3);
                        strN3 = f0Var3.n();
                    } finally {
                    }
                } catch (Throwable th4) {
                    objB3 = ub.a.b(th4);
                }
                if (d0VarF.f21759d != 200) {
                    throw new IllegalStateException(strN3.toString());
                }
                xf.r rVar3 = ag.z.f371c;
                d0.y yVar5 = rVar3.f24989b;
                pc.y yVar6 = pc.y.f16981c;
                objB3 = rVar3.a(strN3, n7.e.A(yVar5, jc.z.b(nh.a.x(jc.z.a(o1.class)))));
                d0VarF.close();
                return new ub.n(objB3);
            case 7:
                ub.a.f(obj);
                ua.l.W(((d9.x) a9.i.c().f4307l.getValue()).f5614a, false, true, new d9.i(8));
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                ub.a.f(obj);
                e1 e1Var2 = ba.y.f2506a;
                List list = (List) ua.l.W(a9.i.c().r().f5571a, true, false, new d9.i(i11));
                jc.l.e(list, "<set-?>");
                ba.y.f2508c = list;
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                ub.a.f(obj);
                h9.d.f(false);
                return a0Var;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                ub.a.f(obj);
                return a0Var;
            case 11:
                ub.a.f(obj);
                return Choreographer.getInstance();
            case 12:
                ub.a.f(obj);
                ua.l.W(a9.i.c().t().f5585a, false, true, new d9.i(3));
                return a0Var;
            case 13:
                ub.a.f(obj);
                ua.l.W(a9.i.c().r().f5571a, false, true, new d9.i(i12));
                return a0Var;
            case 14:
                ub.a.f(obj);
                return a0Var;
            case 15:
                ub.a.f(obj);
                f9.f.a(a9.i.c().g().getWritableDatabase());
                ka.n.c("done success: false", 0L, null, null, 511);
                return a0Var;
            default:
                ub.a.f(obj);
                f9.f.a(a9.i.c().g().getWritableDatabase());
                return a0Var;
        }
    }
}
