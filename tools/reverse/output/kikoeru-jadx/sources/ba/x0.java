package ba;

import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f2505f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(String str, yb.c cVar, int i10) {
        super(2, cVar);
        this.f2504e = i10;
        this.f2505f = str;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f2504e) {
            case 0:
                return new x0(this.f2505f, cVar, 0);
            case 1:
                return new x0(this.f2505f, cVar, 1);
            case 2:
                return new x0(this.f2505f, cVar, 2);
            case 3:
                return new x0(this.f2505f, cVar, 3);
            case 4:
                return new x0(this.f2505f, cVar, 4);
            case 5:
                return new x0(this.f2505f, cVar, 5);
            case 6:
                return new x0(this.f2505f, cVar, 6);
            case 7:
                return new x0(this.f2505f, cVar, 7);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return new x0(this.f2505f, cVar, 8);
            default:
                return new x0(this.f2505f, cVar, 9);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f2504e) {
            case 0:
                x0 x0Var = (x0) o(yVar, cVar);
                ub.a0 a0Var = ub.a0.f21526a;
                x0Var.u(a0Var);
                break;
            case 1:
                x0 x0Var2 = (x0) o(yVar, cVar);
                ub.a0 a0Var2 = ub.a0.f21526a;
                x0Var2.u(a0Var2);
                break;
        }
        return ((x0) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        Object objB;
        ug.d0 d0VarF;
        Object objB2;
        String strN;
        Object objB3;
        Object objB4;
        String strN2;
        Object objB5;
        Object objB6;
        int i10 = this.f2504e;
        String strB = "";
        ub.a0 a0Var = ub.a0.f21526a;
        String str = this.f2505f;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                if (!ef.n.y0(str)) {
                    d9.x xVar = (d9.x) a9.i.c().f4307l.getValue();
                    xVar.getClass();
                    ua.l.W(xVar.f5614a, false, true, new q0(2, xVar, str));
                }
                return a0Var;
            case 1:
                ub.a.f(obj);
                if (!ef.n.y0(str)) {
                    d9.x xVar2 = (d9.x) a9.i.c().f4307l.getValue();
                    xVar2.getClass();
                    ua.l.W(xVar2.f5614a, false, true, new a9.j(3, str));
                }
                return a0Var;
            case 2:
                ub.a.f(obj);
                ub.p pVar = h9.a.f8233a;
                jc.l.e(str, "id");
                return h9.a.a().f932b.d(str);
            case 3:
                ub.a.f(obj);
                String str2 = ag.z.f369a;
                Serializable serializableB = ag.z.b(a9.i.f(), str);
                String str3 = (String) (serializableB instanceof ub.m ? null : serializableB);
                return str3 == null ? "" : str3;
            case 4:
                ub.a.f(obj);
                String str4 = ag.z.f369a;
                jc.l.e(str, "domain");
                String strConcat = str.concat("/api/health");
                try {
                    ch.l lVar = new ch.l(10);
                    lVar.p(ug.g.f21779n);
                    lVar.B(strConcat);
                    d0VarF = ag.z.f370b.a(new b7.b1(lVar)).f();
                    try {
                        ug.f0 f0Var = d0VarF.f21762g;
                        jc.l.b(f0Var);
                        objB = f0Var.n();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    objB = ub.a.b(th2);
                }
                if (d0VarF.f21759d != 200 || !jc.l.a(objB, "OK")) {
                    throw new IllegalStateException(objB.toString());
                }
                d0VarF.close();
                return Boolean.valueOf(!(objB instanceof ub.m));
                objB = ub.a.b(th2);
                return Boolean.valueOf(!(objB instanceof ub.m));
            case 5:
                ub.a.f(obj);
                String str5 = ag.z.f369a;
                String strF = a9.i.f();
                jc.l.e(strF, "token");
                jc.l.e(str, "playlistId");
                ch.l lVarD = a0.c.D(ag.z.f369a + "/api/playlist/get-liked-status?id=" + str);
                lVarD.w("authorization", "Bearer ".concat(strF));
                lVarD.p(ug.g.f21779n);
                try {
                    d0VarF = ag.z.f370b.a(new b7.b1(lVarD)).f();
                    try {
                        ug.f0 f0Var2 = d0VarF.f21762g;
                        jc.l.b(f0Var2);
                        strN = f0Var2.n();
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
                    throw new IllegalStateException(strN.toString());
                }
                xf.r rVar = ag.z.f371c;
                objB2 = rVar.a(strN, n7.e.A(rVar.f24989b, jc.z.a(ag.l.class)));
                d0VarF.close();
                Throwable thA = ub.n.a(objB2);
                if (thA != null && !na.q.k(thA)) {
                    ka.n.c(thA, 3000L, null, null, 510);
                }
                ag.l lVar2 = (ag.l) (objB2 instanceof ub.m ? null : objB2);
                return Boolean.valueOf(lVar2 != null ? lVar2.f341b : false);
            case 6:
                ub.a.f(obj);
                String str6 = ag.z.f369a;
                String strF2 = a9.i.f();
                jc.l.e(strF2, "token");
                jc.l.e(str, "id");
                String strConcat2 = ag.z.f369a.concat("/api/playlist/delete-playlist");
                ag.l lVar3 = new ag.l(str);
                if (!lVar3.equals(a0Var)) {
                    xf.b bVar = xf.c.f24987d;
                    strB = bVar.b(n7.e.A(bVar.f24989b, jc.z.a(ag.l.class)), lVar3);
                }
                ch.l lVarD2 = a0.c.D(strConcat2);
                lVarD2.w("authorization", "Bearer ".concat(strF2));
                ug.z zVar = ug.b0.f21724a;
                ef.l lVar4 = ug.v.f21877c;
                lVarD2.z(ud.e.q(strB, vb.w.h("application/json")));
                try {
                    d0VarF = ag.z.f370b.a(new b7.b1(lVarD2)).f();
                } catch (Throwable th4) {
                    objB3 = ub.a.b(th4);
                }
                try {
                    ug.f0 f0Var3 = d0VarF.f21762g;
                    jc.l.b(f0Var3);
                    String strN3 = f0Var3.n();
                    if (d0VarF.f21759d != 200) {
                        throw new IllegalStateException(strN3.toString());
                    }
                    xf.r rVar2 = ag.z.f371c;
                    objB3 = rVar2.a(strN3, n7.e.A(rVar2.f24989b, jc.z.a(ag.l.class)));
                    d0VarF.close();
                    if (!(objB3 instanceof ub.m)) {
                        ka.n.c(na.q.g(R.string.delete_success), 0L, null, null, 511);
                    }
                    Throwable thA2 = ub.n.a(objB3);
                    if (thA2 != null && !na.q.k(thA2)) {
                        ka.n.c(thA2, 3000L, null, null, 510);
                    }
                    return new ub.n(objB3);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 7:
                ub.a.f(obj);
                String str7 = ag.z.f369a;
                String strF3 = a9.i.f();
                jc.l.e(strF3, "token");
                jc.l.e(str, "playlistId");
                String strConcat3 = ag.z.f369a.concat("/api/playlist/like-playlist");
                ag.l lVar5 = new ag.l(str);
                if (!lVar5.equals(a0Var)) {
                    xf.b bVar2 = xf.c.f24987d;
                    strB = bVar2.b(n7.e.A(bVar2.f24989b, jc.z.a(ag.l.class)), lVar5);
                }
                ch.l lVarD3 = a0.c.D(strConcat3);
                lVarD3.w("authorization", "Bearer ".concat(strF3));
                ug.z zVar2 = ug.b0.f21724a;
                ef.l lVar6 = ug.v.f21877c;
                lVarD3.z(ud.e.q(strB, vb.w.h("application/json")));
                try {
                    d0VarF = ag.z.f370b.a(new b7.b1(lVarD3)).f();
                    try {
                        ug.f0 f0Var4 = d0VarF.f21762g;
                        jc.l.b(f0Var4);
                        strN2 = f0Var4.n();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Throwable th5) {
                    objB4 = ub.a.b(th5);
                }
                if (d0VarF.f21759d != 200) {
                    throw new IllegalStateException(strN2.toString());
                }
                xf.r rVar3 = ag.z.f371c;
                objB4 = rVar3.a(strN2, n7.e.A(rVar3.f24989b, jc.z.a(ag.l.class)));
                d0VarF.close();
                if (!(objB4 instanceof ub.m)) {
                    ka.n.c(na.q.g(R.string.favorite_success), 0L, null, null, 511);
                }
                Throwable thA3 = ub.n.a(objB4);
                if (thA3 != null && !na.q.k(thA3)) {
                    ka.n.c(thA3, 3000L, null, null, 510);
                }
                return new ub.n(objB4);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                ub.a.f(obj);
                String str8 = ag.z.f369a;
                String strF4 = a9.i.f();
                jc.l.e(strF4, "token");
                jc.l.e(str, "id");
                String strConcat4 = ag.z.f369a.concat("/api/playlist/get-playlist-metadata");
                jc.l.e(strConcat4, "<this>");
                ug.s sVar = new ug.s();
                sVar.d(null, strConcat4);
                ug.s sVarG = sVar.b().g();
                sVarG.a("id", str);
                ch.l lVarD4 = a0.c.D(sVarG.b().f21876h);
                lVarD4.w("authorization", "Bearer ".concat(strF4));
                try {
                    d0VarF = ag.z.f370b.a(new b7.b1(lVarD4)).f();
                } catch (Throwable th6) {
                    objB5 = ub.a.b(th6);
                }
                try {
                    ug.f0 f0Var5 = d0VarF.f21762g;
                    jc.l.b(f0Var5);
                    String strN4 = f0Var5.n();
                    if (d0VarF.f21759d != 200) {
                        throw new IllegalStateException(strN4.toString());
                    }
                    xf.r rVar4 = ag.z.f371c;
                    objB5 = rVar4.a(strN4, n7.e.A(rVar4.f24989b, jc.z.a(bg.p.class)));
                    d0VarF.close();
                    Throwable thA4 = ub.n.a(objB5);
                    if (thA4 != null && !na.q.k(thA4)) {
                        ka.n.c(thA4, 3000L, null, null, 510);
                    }
                    if (objB5 instanceof ub.m) {
                        return null;
                    }
                    return objB5;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            default:
                ub.a.f(obj);
                String str9 = ag.z.f369a;
                String strF5 = a9.i.f();
                jc.l.e(strF5, "token");
                jc.l.e(str, "playlistId");
                String strConcat5 = ag.z.f369a.concat("/api/playlist/remove-like-playlist");
                ag.l lVar7 = new ag.l(str);
                if (!lVar7.equals(a0Var)) {
                    xf.b bVar3 = xf.c.f24987d;
                    strB = bVar3.b(n7.e.A(bVar3.f24989b, jc.z.a(ag.l.class)), lVar7);
                }
                ch.l lVarD5 = a0.c.D(strConcat5);
                lVarD5.w("authorization", "Bearer ".concat(strF5));
                ug.z zVar3 = ug.b0.f21724a;
                ef.l lVar8 = ug.v.f21877c;
                lVarD5.z(ud.e.q(strB, vb.w.h("application/json")));
                try {
                    d0VarF = ag.z.f370b.a(new b7.b1(lVarD5)).f();
                } catch (Throwable th7) {
                    objB6 = ub.a.b(th7);
                }
                try {
                    ug.f0 f0Var6 = d0VarF.f21762g;
                    jc.l.b(f0Var6);
                    String strN5 = f0Var6.n();
                    if (d0VarF.f21759d != 200) {
                        throw new IllegalStateException(strN5.toString());
                    }
                    xf.r rVar5 = ag.z.f371c;
                    objB6 = rVar5.a(strN5, n7.e.A(rVar5.f24989b, jc.z.a(ag.l.class)));
                    d0VarF.close();
                    if (!(objB6 instanceof ub.m)) {
                        ka.n.c(na.q.g(R.string.un_favorite_success), 0L, null, null, 511);
                    }
                    Throwable thA5 = ub.n.a(objB6);
                    if (thA5 != null && !na.q.k(thA5)) {
                        ka.n.c(thA5, 3000L, null, null, 510);
                    }
                    return new ub.n(objB6);
                } finally {
                }
        }
    }
}
