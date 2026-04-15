package xf;

import q.t0;
import wf.f0;
import wf.n1;
import wf.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f25012a = z0.a("kotlinx.serialization.json.JsonUnquotedLiteral", n1.f24152a);

    public static final c0 a(String str) {
        return str == null ? v.INSTANCE : new s(str, true);
    }

    public static final void b(String str, m mVar) {
        throw new IllegalArgumentException("Element " + jc.z.f10839a.b(mVar.getClass()) + " is not a " + str);
    }

    public static final Boolean c(c0 c0Var) {
        String strA = c0Var.a();
        String[] strArr = yf.v.f26333a;
        jc.l.e(strA, "<this>");
        if (strA.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (strA.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int d(c0 c0Var) {
        try {
            long jG = g(c0Var);
            if (-2147483648L <= jG && jG <= 2147483647L) {
                return (int) jG;
            }
            throw new NumberFormatException(c0Var.a() + " is not an Int");
        } catch (yf.h e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }

    public static final y e(m mVar) {
        jc.l.e(mVar, "<this>");
        y yVar = mVar instanceof y ? (y) mVar : null;
        if (yVar != null) {
            return yVar;
        }
        b("JsonObject", mVar);
        throw null;
    }

    public static final c0 f(m mVar) {
        jc.l.e(mVar, "<this>");
        c0 c0Var = mVar instanceof c0 ? (c0) mVar : null;
        if (c0Var != null) {
            return c0Var;
        }
        b("JsonPrimitive", mVar);
        throw null;
    }

    public static final long g(c0 c0Var) {
        String strA = c0Var.a();
        h7.k kVar = new h7.k(strA);
        long jL = kVar.l();
        if (kVar.i() == 10) {
            return jL;
        }
        int i10 = kVar.f8197b;
        int i11 = i10 - 1;
        h7.k.q(kVar, t0.D("Expected input to contain a single valid number, but got '", (i10 == strA.length() || i11 < 0) ? "EOF" : String.valueOf(strA.charAt(i11)), "' after it"), i11, null, 4);
        throw null;
    }
}
