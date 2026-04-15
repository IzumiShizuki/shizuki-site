package ag;

import b7.b1;
import bg.a2;
import bg.d2;
import bg.e2;
import bg.l1;
import bg.o0;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ug.a0;
import ug.b0;
import ug.d0;
import ug.f0;
import xf.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f369a = "https://api.asmr.one";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ug.x f370b = new ug.x();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xf.r f371c = ua.l.E(y.f368b);

    public static Serializable a(long j10, String str) {
        jc.l.e(str, "token");
        ch.l lVar = new ch.l(10);
        lVar.B(f369a + "/api/review?work_id=" + j10);
        lVar.w("authorization", "Bearer ".concat(str));
        lVar.p(ug.g.f21779n);
        lVar.y("DELETE", b0.f21724a);
        try {
            d0 d0VarF = f370b.a(new b1(lVar)).f();
            try {
                f0 f0Var = d0VarF.f21762g;
                jc.l.b(f0Var);
                String strN = f0Var.n();
                d0VarF.close();
                return strN;
            } finally {
            }
        } catch (Throwable th2) {
            return ub.a.b(th2);
        }
    }

    public static Serializable b(String str, String str2) {
        jc.l.e(str, "token");
        jc.l.e(str2, "hash");
        ch.l lVar = new ch.l(10);
        lVar.B(f369a + "/api/media/stream/" + str2);
        lVar.w("authorization", "Bearer ".concat(str));
        lVar.y("GET", null);
        try {
            d0 d0VarF = f370b.a(new b1(lVar)).f();
            try {
                f0 f0Var = d0VarF.f21762g;
                jc.l.b(f0Var);
                String strN = f0Var.n();
                d0VarF.close();
                return strN;
            } finally {
            }
        } catch (Throwable th2) {
            return ub.a.b(th2);
        }
    }

    public static Serializable c(String str, bg.d dVar, Integer num, String str2, String str3, long j10) {
        jc.l.e(str, "token");
        jc.l.e(str3, "user_name");
        if (dVar == null && num == null && str2 == null) {
            throw new IllegalStateException("progress, rating, review_text all null");
        }
        ug.z zVar = b0.f21724a;
        xf.b bVar = xf.c.f24987d;
        boolean z10 = false;
        Map mapV = vb.w.v(new ub.k("progress", xf.n.a(dVar != null ? dVar.name() : null)), new ub.k("rating", num == null ? xf.v.INSTANCE : new xf.s(num, false)), new ub.k("review_text", xf.n.a(str2)), new ub.k("user_name", xf.n.a(str3)), new ub.k("work_id", new xf.s(Long.valueOf(j10), false)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapV.entrySet()) {
            if (!jc.l.a((c0) entry.getValue(), xf.v.INSTANCE)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        String strB = bVar.b(n7.e.A(bVar.f24989b, jc.z.a(xf.y.class)), new xf.y(linkedHashMap));
        ef.l lVar = ug.v.f21877c;
        a0 a0VarQ = ud.e.q(strB, vb.w.w("application/json"));
        boolean z11 = dVar == null && num != null && str2 == null;
        if (dVar != null && num == null && str2 == null) {
            z10 = true;
        }
        ch.l lVar2 = new ch.l(10);
        lVar2.B(f369a + "/api/review?starOnly=" + z11 + "&progressOnly=" + z10);
        lVar2.w("authorization", "Bearer ".concat(str));
        lVar2.p(ug.g.f21779n);
        lVar2.y("PUT", a0VarQ);
        try {
            d0 d0VarF = f370b.a(new b1(lVar2)).f();
            try {
                f0 f0Var = d0VarF.f21762g;
                jc.l.b(f0Var);
                String strN = f0Var.n();
                d0VarF.close();
                return strN;
            } finally {
            }
        } catch (Throwable th2) {
            return ub.a.b(th2);
        }
    }

    public static Object d(String str, String str2) {
        jc.l.e(str, "name");
        jc.l.e(str2, "pwd");
        return e(f369a.concat("/api/auth/me"), str, str2);
    }

    public static Object e(String str, String str2, String str3) {
        String strB;
        c cVar = new c(str2, str3);
        if (cVar.equals(ub.a0.f21526a)) {
            strB = "";
        } else {
            xf.b bVar = xf.c.f24987d;
            strB = bVar.b(n7.e.A(bVar.f24989b, jc.z.a(c.class)), cVar);
        }
        ch.l lVar = new ch.l(10);
        lVar.B(str);
        lVar.w("authorization", "Bearer ");
        ug.z zVar = b0.f21724a;
        ef.l lVar2 = ug.v.f21877c;
        lVar.z(ud.e.q(strB, vb.w.h("application/json")));
        lVar.p(ug.g.f21779n);
        try {
            d0 d0VarF = f370b.a(new b1(lVar)).f();
            try {
                f0 f0Var = d0VarF.f21762g;
                jc.l.b(f0Var);
                String strN = f0Var.n();
                if (d0VarF.f21759d != 200) {
                    throw new IllegalStateException(strN.toString());
                }
                xf.r rVar = f371c;
                Object objA = rVar.a(strN, n7.e.A(rVar.f24989b, jc.z.a(l1.class)));
                d0VarF.close();
                return objA;
            } finally {
            }
        } catch (Throwable th2) {
            return ub.a.b(th2);
        }
    }

    public static Object f(String str, int i10, String str2, e2 e2Var, bg.u uVar, int i11, boolean z10, boolean z11, List list, boolean z12) throws UnsupportedEncodingException {
        String strB;
        jc.l.e(str, "token");
        jc.l.e(str2, "keyword");
        jc.l.e(e2Var, "order");
        jc.l.e(uVar, "sort");
        jc.l.e(list, "localSubtitle");
        String strG = g(str2);
        x xVar = new x(i10, e2Var, uVar, i11, z10 ? 1 : 0, list, z12);
        String str3 = f369a + "/api/search/" + strG;
        if (xVar.equals(ub.a0.f21526a)) {
            strB = "";
        } else {
            xf.b bVar = xf.c.f24987d;
            strB = bVar.b(n7.e.A(bVar.f24989b, jc.z.a(x.class)), xVar);
        }
        ch.l lVarD = a0.c.D(str3);
        lVarD.w("authorization", "Bearer ".concat(str));
        ug.z zVar = b0.f21724a;
        ef.l lVar = ug.v.f21877c;
        lVarD.z(ud.e.q(strB, vb.w.h("application/json")));
        if (z11) {
            lVarD.p(ug.g.f21779n);
        }
        try {
            d0 d0VarF = f370b.a(new b1(lVarD)).f();
            try {
                f0 f0Var = d0VarF.f21762g;
                jc.l.b(f0Var);
                String strN = f0Var.n();
                if (d0VarF.f21759d != 200) {
                    throw new IllegalStateException(strN.toString());
                }
                xf.r rVar = f371c;
                Object objA = rVar.a(strN, n7.e.A(rVar.f24989b, jc.z.a(d2.class)));
                d0VarF.close();
                return objA;
            } finally {
            }
        } catch (Throwable th2) {
            return ub.a.b(th2);
        }
    }

    public static String g(String str) throws UnsupportedEncodingException {
        String strEncode = URLEncoder.encode(str, ef.a.f6541a.displayName());
        jc.l.d(strEncode, "encode(this, Charsets.UTF_8.displayName())");
        return ef.u.h0(ef.u.h0(ef.u.h0(ef.u.h0(strEncode, "+", "%20", false), "%7E", "~", false), "%24", "$", false), "%3A", ":", false);
    }

    public static Object h(long j10, String str, boolean z10) {
        jc.l.e(str, "token");
        ch.l lVarD = a0.c.D(f369a + "/api/tracks/" + j10);
        lVarD.w("authorization", "Bearer ".concat(str));
        if (z10) {
            lVarD.p(ug.g.f21779n);
        }
        try {
            d0 d0VarF = f370b.a(new b1(lVarD)).f();
            try {
                f0 f0Var = d0VarF.f21762g;
                jc.l.b(f0Var);
                String strN = f0Var.n();
                if (d0VarF.f21759d != 200) {
                    throw new IllegalStateException(strN.toString());
                }
                xf.r rVar = f371c;
                d0.y yVar = rVar.f24989b;
                pc.y yVar2 = pc.y.f16981c;
                Object objA = rVar.a(strN, n7.e.A(yVar, jc.z.b(nh.a.x(jc.z.a(o0.class)))));
                d0VarF.close();
                return objA;
            } finally {
            }
        } catch (Throwable th2) {
            return ub.a.b(th2);
        }
    }

    public static Object i(long j10, String str, boolean z10) {
        jc.l.e(str, "token");
        ch.l lVarD = a0.c.D(f369a + "/api/work/" + j10);
        lVarD.w("authorization", "Bearer ".concat(str));
        if (z10) {
            lVarD.p(ug.g.f21779n);
        }
        try {
            d0 d0VarF = f370b.a(new b1(lVarD)).f();
            try {
                f0 f0Var = d0VarF.f21762g;
                jc.l.b(f0Var);
                String strN = f0Var.n();
                if (d0VarF.f21759d != 200) {
                    throw new IllegalStateException(strN.toString());
                }
                xf.r rVar = f371c;
                Object objA = rVar.a(strN, n7.e.A(rVar.f24989b, jc.z.a(a2.class)));
                d0VarF.close();
                return objA;
            } finally {
            }
        } catch (Throwable th2) {
            return ub.a.b(th2);
        }
    }
}
