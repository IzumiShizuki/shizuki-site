package yf;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import jc.a0;
import jc.z;
import wf.d1;
import wf.f0;
import xf.c0;
import xf.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements xf.k, vf.b, vf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f26275a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xf.c f26277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xf.j f26279e;

    public a(xf.c cVar, String str) {
        this.f26277c = cVar;
        this.f26278d = str;
        this.f26279e = cVar.f24988a;
    }

    @Override // vf.b
    public final short A() {
        return O(T());
    }

    @Override // vf.b
    public final float B() {
        return K(T());
    }

    @Override // vf.a
    public final float C(uf.g gVar, int i10) {
        jc.l.e(gVar, "descriptor");
        return K(R(gVar, i10));
    }

    @Override // vf.b
    public final double D() {
        return J(T());
    }

    public abstract xf.m E(String str);

    public final xf.m F() {
        xf.m mVarE;
        String str = (String) vb.m.i0(this.f26275a);
        return (str == null || (mVarE = E(str)) == null) ? S() : mVarE;
    }

    public final boolean G(Object obj) {
        String str = (String) obj;
        jc.l.e(str, "tag");
        xf.m mVarE = E(str);
        if (mVarE instanceof c0) {
            c0 c0Var = (c0) mVarE;
            try {
                Boolean boolC = xf.n.c(c0Var);
                if (boolC != null) {
                    return boolC.booleanValue();
                }
                W(c0Var, "boolean", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                W(c0Var, "boolean", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        a0 a0Var = z.f10839a;
        sb.append(a0Var.b(c0.class).y());
        sb.append(", but had ");
        sb.append(a0Var.b(mVarE.getClass()).y());
        sb.append(" as the serialized body of boolean at element: ");
        sb.append(V(str));
        throw k.e(-1, sb.toString(), mVarE.toString());
    }

    public final byte H(Object obj) {
        String str = (String) obj;
        jc.l.e(str, "tag");
        xf.m mVarE = E(str);
        if (!(mVarE instanceof c0)) {
            StringBuilder sb = new StringBuilder("Expected ");
            a0 a0Var = z.f10839a;
            sb.append(a0Var.b(c0.class).y());
            sb.append(", but had ");
            sb.append(a0Var.b(mVarE.getClass()).y());
            sb.append(" as the serialized body of byte at element: ");
            sb.append(V(str));
            throw k.e(-1, sb.toString(), mVarE.toString());
        }
        c0 c0Var = (c0) mVarE;
        try {
            long jG = xf.n.g(c0Var);
            Byte bValueOf = (-128 > jG || jG > 127) ? null : Byte.valueOf((byte) jG);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            W(c0Var, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            W(c0Var, "byte", str);
            throw null;
        }
    }

    public final char I(Object obj) {
        String str = (String) obj;
        jc.l.e(str, "tag");
        xf.m mVarE = E(str);
        if (!(mVarE instanceof c0)) {
            StringBuilder sb = new StringBuilder("Expected ");
            a0 a0Var = z.f10839a;
            sb.append(a0Var.b(c0.class).y());
            sb.append(", but had ");
            sb.append(a0Var.b(mVarE.getClass()).y());
            sb.append(" as the serialized body of char at element: ");
            sb.append(V(str));
            throw k.e(-1, sb.toString(), mVarE.toString());
        }
        c0 c0Var = (c0) mVarE;
        try {
            String strA = c0Var.a();
            jc.l.e(strA, "<this>");
            int length = strA.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strA.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            W(c0Var, "char", str);
            throw null;
        }
    }

    public final double J(Object obj) {
        String str = (String) obj;
        jc.l.e(str, "tag");
        xf.m mVarE = E(str);
        if (!(mVarE instanceof c0)) {
            StringBuilder sb = new StringBuilder("Expected ");
            a0 a0Var = z.f10839a;
            sb.append(a0Var.b(c0.class).y());
            sb.append(", but had ");
            sb.append(a0Var.b(mVarE.getClass()).y());
            sb.append(" as the serialized body of double at element: ");
            sb.append(V(str));
            throw k.e(-1, sb.toString(), mVarE.toString());
        }
        c0 c0Var = (c0) mVarE;
        try {
            f0 f0Var = xf.n.f25012a;
            double d10 = Double.parseDouble(c0Var.a());
            xf.j jVar = this.f26277c.f24988a;
            if (Math.abs(d10) <= Double.MAX_VALUE) {
                return d10;
            }
            throw k.a(Double.valueOf(d10), str, F().toString());
        } catch (IllegalArgumentException unused) {
            W(c0Var, "double", str);
            throw null;
        }
    }

    public final float K(Object obj) {
        String str = (String) obj;
        jc.l.e(str, "tag");
        xf.m mVarE = E(str);
        if (!(mVarE instanceof c0)) {
            StringBuilder sb = new StringBuilder("Expected ");
            a0 a0Var = z.f10839a;
            sb.append(a0Var.b(c0.class).y());
            sb.append(", but had ");
            sb.append(a0Var.b(mVarE.getClass()).y());
            sb.append(" as the serialized body of float at element: ");
            sb.append(V(str));
            throw k.e(-1, sb.toString(), mVarE.toString());
        }
        c0 c0Var = (c0) mVarE;
        try {
            f0 f0Var = xf.n.f25012a;
            float f10 = Float.parseFloat(c0Var.a());
            xf.j jVar = this.f26277c.f24988a;
            if (Math.abs(f10) <= Float.MAX_VALUE) {
                return f10;
            }
            throw k.a(Float.valueOf(f10), str, F().toString());
        } catch (IllegalArgumentException unused) {
            W(c0Var, "float", str);
            throw null;
        }
    }

    public final vf.b L(Object obj, uf.g gVar) {
        String str = (String) obj;
        jc.l.e(str, "tag");
        jc.l.e(gVar, "inlineDescriptor");
        if (!u.a(gVar)) {
            this.f26275a.add(str);
            return this;
        }
        xf.m mVarE = E(str);
        String strM = gVar.m();
        if (mVarE instanceof c0) {
            String strA = ((c0) mVarE).a();
            xf.c cVar = this.f26277c;
            jc.l.e(cVar, "json");
            jc.l.e(strA, "source");
            return new g(new h7.k(strA), cVar);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        a0 a0Var = z.f10839a;
        sb.append(a0Var.b(c0.class).y());
        sb.append(", but had ");
        sb.append(a0Var.b(mVarE.getClass()).y());
        sb.append(" as the serialized body of ");
        sb.append(strM);
        sb.append(" at element: ");
        sb.append(V(str));
        throw k.e(-1, sb.toString(), mVarE.toString());
    }

    public final int M(Object obj) {
        String str = (String) obj;
        jc.l.e(str, "tag");
        xf.m mVarE = E(str);
        if (!(mVarE instanceof c0)) {
            StringBuilder sb = new StringBuilder("Expected ");
            a0 a0Var = z.f10839a;
            sb.append(a0Var.b(c0.class).y());
            sb.append(", but had ");
            sb.append(a0Var.b(mVarE.getClass()).y());
            sb.append(" as the serialized body of int at element: ");
            sb.append(V(str));
            throw k.e(-1, sb.toString(), mVarE.toString());
        }
        c0 c0Var = (c0) mVarE;
        try {
            long jG = xf.n.g(c0Var);
            Integer numValueOf = (-2147483648L > jG || jG > 2147483647L) ? null : Integer.valueOf((int) jG);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            W(c0Var, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            W(c0Var, "int", str);
            throw null;
        }
    }

    public final long N(Object obj) {
        String str = (String) obj;
        jc.l.e(str, "tag");
        xf.m mVarE = E(str);
        if (mVarE instanceof c0) {
            c0 c0Var = (c0) mVarE;
            try {
                return xf.n.g(c0Var);
            } catch (IllegalArgumentException unused) {
                W(c0Var, "long", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        a0 a0Var = z.f10839a;
        sb.append(a0Var.b(c0.class).y());
        sb.append(", but had ");
        sb.append(a0Var.b(mVarE.getClass()).y());
        sb.append(" as the serialized body of long at element: ");
        sb.append(V(str));
        throw k.e(-1, sb.toString(), mVarE.toString());
    }

    public final short O(Object obj) {
        String str = (String) obj;
        jc.l.e(str, "tag");
        xf.m mVarE = E(str);
        if (!(mVarE instanceof c0)) {
            StringBuilder sb = new StringBuilder("Expected ");
            a0 a0Var = z.f10839a;
            sb.append(a0Var.b(c0.class).y());
            sb.append(", but had ");
            sb.append(a0Var.b(mVarE.getClass()).y());
            sb.append(" as the serialized body of short at element: ");
            sb.append(V(str));
            throw k.e(-1, sb.toString(), mVarE.toString());
        }
        c0 c0Var = (c0) mVarE;
        try {
            long jG = xf.n.g(c0Var);
            Short shValueOf = (-32768 > jG || jG > 32767) ? null : Short.valueOf((short) jG);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            W(c0Var, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            W(c0Var, "short", str);
            throw null;
        }
    }

    public final String P(Object obj) {
        String str = (String) obj;
        jc.l.e(str, "tag");
        xf.m mVarE = E(str);
        if (!(mVarE instanceof c0)) {
            StringBuilder sb = new StringBuilder("Expected ");
            a0 a0Var = z.f10839a;
            sb.append(a0Var.b(c0.class).y());
            sb.append(", but had ");
            sb.append(a0Var.b(mVarE.getClass()).y());
            sb.append(" as the serialized body of string at element: ");
            sb.append(V(str));
            throw k.e(-1, sb.toString(), mVarE.toString());
        }
        c0 c0Var = (c0) mVarE;
        if (!(c0Var instanceof xf.s)) {
            StringBuilder sbK = a0.c.K("Expected string value for a non-null key '", str, "', got null literal instead at element: ");
            sbK.append(V(str));
            throw k.e(-1, sbK.toString(), F().toString());
        }
        xf.s sVar = (xf.s) c0Var;
        if (sVar.f25016a) {
            return sVar.f25017b;
        }
        xf.j jVar = this.f26277c.f24988a;
        StringBuilder sbK2 = a0.c.K("String literal for key '", str, "' should be quoted at element: ");
        sbK2.append(V(str));
        sbK2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw k.e(-1, sbK2.toString(), F().toString());
    }

    public String Q(uf.g gVar, int i10) {
        jc.l.e(gVar, "descriptor");
        return gVar.q(i10);
    }

    public final String R(uf.g gVar, int i10) {
        jc.l.e(gVar, "<this>");
        String strQ = Q(gVar, i10);
        jc.l.e(strQ, "nestedName");
        return strQ;
    }

    public abstract xf.m S();

    public final Object T() {
        ArrayList arrayList = this.f26275a;
        Object objRemove = arrayList.remove(ud.b.r(arrayList));
        this.f26276b = true;
        return objRemove;
    }

    public final String U() {
        ArrayList arrayList = this.f26275a;
        return arrayList.isEmpty() ? "$" : vb.m.f0(arrayList, ".", "$.", null, null, 60);
    }

    public final String V(String str) {
        jc.l.e(str, "currentTag");
        return U() + '.' + str;
    }

    public final void W(c0 c0Var, String str, String str2) {
        throw k.e(-1, "Failed to parse literal '" + c0Var + "' as " + (ef.u.k0(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + V(str2), F().toString());
    }

    @Override // vf.a
    public final Object a(uf.g gVar, int i10, sf.a aVar, Object obj) {
        jc.l.e(gVar, "descriptor");
        this.f26275a.add(R(gVar, i10));
        Object objD = (aVar.a().n() || v()) ? d(aVar) : null;
        if (!this.f26276b) {
            T();
        }
        this.f26276b = false;
        return objD;
    }

    @Override // vf.a
    public final double c(uf.g gVar, int i10) {
        jc.l.e(gVar, "descriptor");
        return J(R(gVar, i10));
    }

    @Override // vf.b
    public final Object d(sf.a aVar) {
        jc.l.e(aVar, "deserializer");
        if (!(aVar instanceof wf.b)) {
            return aVar.b(this);
        }
        xf.c cVar = this.f26277c;
        xf.j jVar = cVar.f24988a;
        wf.b bVar = (wf.b) aVar;
        String strH = k.h(bVar.a(), cVar);
        xf.m mVarF = F();
        String strM = bVar.a().m();
        if (!(mVarF instanceof y)) {
            StringBuilder sb = new StringBuilder("Expected ");
            a0 a0Var = z.f10839a;
            sb.append(a0Var.b(y.class).y());
            sb.append(", but had ");
            sb.append(a0Var.b(mVarF.getClass()).y());
            sb.append(" as the serialized body of ");
            sb.append(strM);
            sb.append(" at element: ");
            sb.append(U());
            throw k.e(-1, sb.toString(), mVarF.toString());
        }
        y yVar = (y) mVarF;
        xf.m mVar = (xf.m) yVar.get(strH);
        String strA = null;
        if (mVar != null) {
            c0 c0VarF = xf.n.f(mVar);
            if (!(c0VarF instanceof xf.v)) {
                strA = c0VarF.a();
            }
        }
        try {
            return k.o(cVar, strH, yVar, n7.d.o((wf.b) aVar, this, strA));
        } catch (sf.h e10) {
            String message = e10.getMessage();
            jc.l.b(message);
            throw k.e(-1, message, yVar.toString());
        }
    }

    @Override // vf.b
    public final boolean e() {
        return G(T());
    }

    @Override // vf.b
    public final vf.b f(uf.g gVar) {
        jc.l.e(gVar, "descriptor");
        if (vb.m.i0(this.f26275a) != null) {
            return L(T(), gVar);
        }
        return new m(this.f26277c, S(), this.f26278d).f(gVar);
    }

    @Override // vf.a
    public final Object g(uf.g gVar, int i10, sf.a aVar, Object obj) {
        jc.l.e(gVar, "descriptor");
        jc.l.e(aVar, "deserializer");
        this.f26275a.add(R(gVar, i10));
        jc.l.e(aVar, "deserializer");
        Object objD = d(aVar);
        if (!this.f26276b) {
            T();
        }
        this.f26276b = false;
        return objD;
    }

    @Override // vf.b
    public final char h() {
        return I(T());
    }

    @Override // vf.b
    public vf.a i(uf.g gVar) {
        jc.l.e(gVar, "descriptor");
        xf.m mVarF = F();
        ud.n nVarJ = gVar.j();
        boolean zA = jc.l.a(nVarJ, uf.k.f21706c);
        xf.c cVar = this.f26277c;
        if (zA || (nVarJ instanceof uf.d)) {
            String strM = gVar.m();
            if (mVarF instanceof xf.e) {
                return new o(cVar, (xf.e) mVarF);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            a0 a0Var = z.f10839a;
            sb.append(a0Var.b(xf.e.class).y());
            sb.append(", but had ");
            sb.append(a0Var.b(mVarF.getClass()).y());
            sb.append(" as the serialized body of ");
            sb.append(strM);
            sb.append(" at element: ");
            sb.append(U());
            throw k.e(-1, sb.toString(), mVarF.toString());
        }
        if (!jc.l.a(nVarJ, uf.k.f21707d)) {
            String strM2 = gVar.m();
            if (mVarF instanceof y) {
                return new n(cVar, (y) mVarF, this.f26278d, 8);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            a0 a0Var2 = z.f10839a;
            sb2.append(a0Var2.b(y.class).y());
            sb2.append(", but had ");
            sb2.append(a0Var2.b(mVarF.getClass()).y());
            sb2.append(" as the serialized body of ");
            sb2.append(strM2);
            sb2.append(" at element: ");
            sb2.append(U());
            throw k.e(-1, sb2.toString(), mVarF.toString());
        }
        uf.g gVarF = k.f(gVar.s(0), cVar.f24989b);
        ud.n nVarJ2 = gVarF.j();
        if (!(nVarJ2 instanceof uf.f) && !jc.l.a(nVarJ2, uf.j.f21704b)) {
            throw k.c(gVarF);
        }
        String strM3 = gVar.m();
        if (mVarF instanceof y) {
            return new p(cVar, (y) mVarF);
        }
        StringBuilder sb3 = new StringBuilder("Expected ");
        a0 a0Var3 = z.f10839a;
        sb3.append(a0Var3.b(y.class).y());
        sb3.append(", but had ");
        sb3.append(a0Var3.b(mVarF.getClass()).y());
        sb3.append(" as the serialized body of ");
        sb3.append(strM3);
        sb3.append(" at element: ");
        sb3.append(U());
        throw k.e(-1, sb3.toString(), mVarF.toString());
    }

    @Override // vf.a
    public void j(uf.g gVar) {
        jc.l.e(gVar, "descriptor");
    }

    @Override // vf.b
    public final int k(uf.g gVar) {
        jc.l.e(gVar, "enumDescriptor");
        String str = (String) T();
        jc.l.e(str, "tag");
        xf.m mVarE = E(str);
        String strM = gVar.m();
        if (mVarE instanceof c0) {
            return k.j(gVar, this.f26277c, ((c0) mVarE).a(), "");
        }
        StringBuilder sb = new StringBuilder("Expected ");
        a0 a0Var = z.f10839a;
        sb.append(a0Var.b(c0.class).y());
        sb.append(", but had ");
        sb.append(a0Var.b(mVarE.getClass()).y());
        sb.append(" as the serialized body of ");
        sb.append(strM);
        sb.append(" at element: ");
        sb.append(V(str));
        throw k.e(-1, sb.toString(), mVarE.toString());
    }

    @Override // xf.k
    public final xf.m l() {
        return F();
    }

    @Override // vf.b
    public final int m() {
        return M(T());
    }

    @Override // vf.a
    public final byte n(d1 d1Var, int i10) {
        jc.l.e(d1Var, "descriptor");
        return H(R(d1Var, i10));
    }

    @Override // vf.a
    public final boolean o(uf.g gVar, int i10) {
        jc.l.e(gVar, "descriptor");
        return G(R(gVar, i10));
    }

    @Override // vf.a
    public final d0.y p() {
        return this.f26277c.f24989b;
    }

    @Override // vf.a
    public final String q(uf.g gVar, int i10) {
        jc.l.e(gVar, "descriptor");
        return P(R(gVar, i10));
    }

    @Override // vf.b
    public final String r() {
        return P(T());
    }

    @Override // vf.a
    public final vf.b s(d1 d1Var, int i10) {
        jc.l.e(d1Var, "descriptor");
        return L(R(d1Var, i10), d1Var.s(i10));
    }

    @Override // vf.a
    public final int t(uf.g gVar, int i10) {
        jc.l.e(gVar, "descriptor");
        return M(R(gVar, i10));
    }

    @Override // vf.b
    public final long u() {
        return N(T());
    }

    @Override // vf.b
    public boolean v() {
        return !(F() instanceof xf.v);
    }

    @Override // vf.a
    public final char w(d1 d1Var, int i10) {
        jc.l.e(d1Var, "descriptor");
        return I(R(d1Var, i10));
    }

    @Override // vf.a
    public final short x(d1 d1Var, int i10) {
        jc.l.e(d1Var, "descriptor");
        return O(R(d1Var, i10));
    }

    @Override // vf.a
    public final long y(uf.g gVar, int i10) {
        jc.l.e(gVar, "descriptor");
        return N(R(gVar, i10));
    }

    @Override // vf.b
    public final byte z() {
        return H(T());
    }
}
