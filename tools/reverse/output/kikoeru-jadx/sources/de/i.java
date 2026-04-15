package de;

import b0.c1;
import bd.a0;
import bd.q0;
import bd.r0;
import bd.y0;
import ce.j0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q.t0;
import se.n0;
import se.u0;
import se.w;
import se.w0;
import se.y;
import tc.b0;
import yc.c0;
import yc.d0;
import yc.h0;
import yc.k0;
import yc.p0;
import yc.v;
import yc.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f5906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f5907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f5908e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f5909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ub.p f5910b = ub.a.d(new bd.e(4, this));

    static {
        gh.g.T(d.f5882b);
        gh.g.T(d.f5884d);
        gh.g.T(d.f5885e);
        gh.g.T(d.f5886f);
        gh.g.T(d.f5887g);
        gh.g.T(d.f5888h);
        f5906c = gh.g.T(d.f5889i);
        gh.g.T(d.f5890j);
        f5907d = gh.g.T(d.f5891k);
        f5908e = gh.g.T(d.f5892l);
        gh.g.T(d.f5883c);
    }

    public i(m mVar) {
        this.f5909a = mVar;
    }

    public static void U(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean g0(w wVar) {
        if (!ud.n.s(wVar)) {
            return false;
        }
        List listQ = wVar.q();
        if ((listQ instanceof Collection) && listQ.isEmpty()) {
            return true;
        }
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            if (((n0) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    public static final void l(i iVar, k0 k0Var, StringBuilder sb) {
        boolean zP = iVar.p();
        m mVar = iVar.f5909a;
        if (!zP) {
            l lVar = mVar.f5937g;
            pc.u[] uVarArr = m.Y;
            if (!((Boolean) lVar.a(mVar, uVarArr[5])).booleanValue()) {
                List listZ0 = k0Var.z0();
                jc.l.d(listZ0, "getContextReceiverParameters(...)");
                iVar.A(sb, listZ0);
                if (iVar.o().contains(j.ANNOTATIONS)) {
                    iVar.w(sb, k0Var, null);
                    bd.w wVarY0 = k0Var.y0();
                    if (wVarY0 != null) {
                        iVar.w(sb, wVarY0, zc.d.f26680b);
                    }
                    bd.w wVarW0 = k0Var.w0();
                    if (wVarW0 != null) {
                        iVar.w(sb, wVarW0, zc.d.f26688j);
                    }
                    if (((r) mVar.H.a(mVar, uVarArr[32])) == r.f5967b) {
                        q0 q0VarD = k0Var.d();
                        if (q0VarD != null) {
                            iVar.w(sb, q0VarD, zc.d.f26683e);
                        }
                        r0 r0VarE = k0Var.e();
                        if (r0VarE != null) {
                            iVar.w(sb, r0VarE, zc.d.f26684f);
                            List listO0 = r0VarE.o0();
                            jc.l.d(listO0, "getValueParameters(...)");
                            y0 y0Var = (y0) vb.m.x0(listO0);
                            jc.l.b(y0Var);
                            iVar.w(sb, y0Var, zc.d.f26687i);
                        }
                    }
                }
                ld.o oVarF = k0Var.f();
                jc.l.d(oVarF, "getVisibility(...)");
                iVar.e0(oVarF, sb);
                iVar.L(sb, iVar.o().contains(j.CONST) && k0Var.S(), "const");
                iVar.I(k0Var, sb);
                iVar.K(k0Var, sb);
                iVar.Q(k0Var, sb);
                iVar.L(sb, iVar.o().contains(j.LATEINIT) && k0Var.C0(), "lateinit");
                iVar.H(k0Var, sb);
            }
            iVar.b0(k0Var, sb, false);
            List typeParameters = k0Var.getTypeParameters();
            jc.l.d(typeParameters, "getTypeParameters(...)");
            iVar.a0(sb, typeParameters, true);
            iVar.S(k0Var, sb);
        }
        iVar.N(k0Var, sb, true);
        sb.append(": ");
        w wVarB = k0Var.b();
        jc.l.d(wVarB, "getType(...)");
        sb.append(iVar.V(wVarB));
        iVar.T(k0Var, sb);
        iVar.F(k0Var, sb);
        List typeParameters2 = k0Var.getTypeParameters();
        jc.l.d(typeParameters2, "getTypeParameters(...)");
        iVar.f0(sb, typeParameters2);
    }

    public static x t(yc.w wVar) {
        boolean z10 = wVar instanceof yc.e;
        x xVar = x.f26158e;
        yc.f fVar = yc.f.f26110b;
        x xVar2 = x.f26155b;
        if (z10) {
            return ((yc.e) wVar).j() == fVar ? xVar : xVar2;
        }
        yc.k kVarY = wVar.y();
        yc.e eVar = kVarY instanceof yc.e ? (yc.e) kVarY : null;
        if (eVar == null || !(wVar instanceof yc.c)) {
            return xVar2;
        }
        yc.c cVar = (yc.c) wVar;
        Collection collectionA = cVar.A();
        jc.l.d(collectionA, "getOverriddenDescriptors(...)");
        boolean zIsEmpty = collectionA.isEmpty();
        x xVar3 = x.f26157d;
        return (zIsEmpty || eVar.s() == xVar2) ? (eVar.j() != fVar || jc.l.a(cVar.f(), yc.o.f26125a)) ? xVar2 : cVar.s() == xVar ? xVar : xVar3 : xVar3;
    }

    public final void A(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            a0 a0Var = (a0) it.next();
            w(sb, a0Var, zc.d.f26685g);
            w wVarB = a0Var.b();
            jc.l.d(wVarB, "getType(...)");
            sb.append(E(wVarB));
            if (i10 == ud.b.r(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i10 = i11;
        }
    }

    public final void B(StringBuilder sb, se.a0 a0Var) {
        w(sb, a0Var, null);
        if (se.c.l(a0Var)) {
            boolean z10 = a0Var instanceof ue.i;
            m mVar = this.f5909a;
            if (z10 && ((ue.i) a0Var).f21630d.f21663b && ((Boolean) mVar.V.a(mVar, m.Y[47])).booleanValue()) {
                ue.l lVar = ue.l.f21664a;
                if (z10) {
                    boolean z11 = ((ue.i) a0Var).f21630d.f21663b;
                }
                se.k0 k0VarT = a0Var.t();
                jc.l.c(k0VarT, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb.append(C(((ue.j) k0VarT).f21636b[0]));
            } else {
                if (!z10 || ((Boolean) mVar.X.a(mVar, m.Y[49])).booleanValue()) {
                    sb.append(a0Var.t().toString());
                } else {
                    sb.append(((ue.i) a0Var).f21634h);
                }
                sb.append(W(a0Var.q()));
            }
        } else {
            se.k0 k0VarT2 = a0Var.t();
            yc.h hVarH = a0Var.t().h();
            b0 b0VarA = v.a(a0Var, hVarH instanceof yc.i ? (yc.i) hVarH : null, 0);
            if (b0VarA == null) {
                sb.append(X(k0VarT2));
                sb.append(W(a0Var.q()));
            } else {
                R(sb, b0VarA);
            }
        }
        if (a0Var.u()) {
            sb.append("?");
        }
        if (a0Var instanceof se.l) {
            sb.append(" & Any");
        }
    }

    public final String C(String str) {
        int iOrdinal = q().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return t0.D("<font color=red><b>", str, "</b></font>");
        }
        throw new j0();
    }

    public final String D(String str, String str2, vc.i iVar) {
        jc.l.e(str, "lowerRendered");
        jc.l.e(str2, "upperRendered");
        if (lc.b.Z(str, str2)) {
            return ef.u.k0(str2, "(", false) ? t0.D("(", str, ")!") : str.concat("!");
        }
        int i10 = 1;
        String strN = lc.b.N(str, str2, new f(this, iVar, 0), new f(this, iVar, i10), new h(i10, this, i.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0, 0, 0));
        if (strN != null) {
            return strN;
        }
        return "(" + str + ".." + str2 + ')';
    }

    public final String E(w wVar) throws IOException {
        String strV = V(wVar);
        return ((!g0(wVar) || u0.e(wVar)) && !(wVar instanceof se.l)) ? strV : a0.c.G(')', "(", strV);
    }

    public final void F(yc.t0 t0Var, StringBuilder sb) {
        ge.g gVarM0;
        String strZ;
        m mVar = this.f5909a;
        if (!((Boolean) mVar.f5951u.a(mVar, m.Y[19])).booleanValue() || (gVarM0 = t0Var.m0()) == null || (strZ = z(gVarM0)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(m(strZ));
    }

    public final String G(String str) {
        int iOrdinal = q().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new j0();
            }
            m mVar = this.f5909a;
            if (!((Boolean) mVar.W.a(mVar, m.Y[48])).booleanValue()) {
                return t0.D("<b>", str, "</b>");
            }
        }
        return str;
    }

    public final void H(yc.c cVar, StringBuilder sb) {
        String str;
        if (o().contains(j.MEMBER_KIND) && s() && cVar.j() != 1) {
            sb.append("/*");
            int iJ = cVar.j();
            if (iJ == 1) {
                str = "DECLARATION";
            } else if (iJ == 2) {
                str = "FAKE_OVERRIDE";
            } else if (iJ == 3) {
                str = "DELEGATION";
            } else {
                if (iJ != 4) {
                    throw null;
                }
                str = "SYNTHESIZED";
            }
            sb.append(ud.b.J(str));
            sb.append("*/ ");
        }
    }

    public final void I(yc.w wVar, StringBuilder sb) {
        L(sb, wVar.P(), "external");
        boolean z10 = false;
        L(sb, o().contains(j.EXPECT) && wVar.c0(), "expect");
        if (o().contains(j.ACTUAL) && wVar.O0()) {
            z10 = true;
        }
        L(sb, z10, "actual");
    }

    public final void J(x xVar, StringBuilder sb, x xVar2) {
        m mVar = this.f5909a;
        if (((Boolean) mVar.f5946p.a(mVar, m.Y[14])).booleanValue() || xVar != xVar2) {
            L(sb, o().contains(j.MODALITY), ud.b.J(xVar.name()));
        }
    }

    public final void K(yc.c cVar, StringBuilder sb) {
        if (ee.e.r(cVar) && cVar.s() == x.f26155b) {
            return;
        }
        m mVar = this.f5909a;
        if (((p) mVar.B.a(mVar, m.Y[26])) == p.f5959a && cVar.s() == x.f26157d && !cVar.A().isEmpty()) {
            return;
        }
        x xVarS = cVar.s();
        jc.l.d(xVarS, "getModality(...)");
        J(xVarS, sb, t(cVar));
    }

    public final void L(StringBuilder sb, boolean z10, String str) {
        if (z10) {
            sb.append(G(str));
            sb.append(" ");
        }
    }

    public final String M(be.e eVar, boolean z10) {
        String strM = m(lc.b.M(eVar));
        m mVar = this.f5909a;
        return (((Boolean) mVar.W.a(mVar, m.Y[48])).booleanValue() && q() == u.f5970b && z10) ? t0.D("<b>", strM, "</b>") : strM;
    }

    public final void N(yc.k kVar, StringBuilder sb, boolean z10) {
        be.e name = kVar.getName();
        jc.l.d(name, "getName(...)");
        sb.append(M(name, z10));
    }

    public final void O(StringBuilder sb, w wVar) throws IOException {
        w0 w0VarX = wVar.x();
        se.a aVar = w0VarX instanceof se.a ? (se.a) w0VarX : null;
        if (aVar == null) {
            P(sb, wVar);
            return;
        }
        se.a0 a0Var = aVar.f19927c;
        se.a0 a0Var2 = aVar.f19926b;
        m mVar = this.f5909a;
        l lVar = mVar.R;
        pc.u[] uVarArr = m.Y;
        boolean zBooleanValue = ((Boolean) lVar.a(mVar, uVarArr[42])).booleanValue();
        s sVar = u.f5970b;
        if (zBooleanValue) {
            P(sb, a0Var2);
            if (((Boolean) mVar.S.a(mVar, uVarArr[43])).booleanValue()) {
                if (q() == sVar) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* ");
                sb.append("from: ");
                P(sb, a0Var);
                sb.append(" */");
                if (q() == sVar) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        P(sb, a0Var);
        if (((Boolean) mVar.Q.a(mVar, uVarArr[41])).booleanValue()) {
            if (q() == sVar) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* ");
            sb.append("= ");
            P(sb, a0Var2);
            sb.append(" */");
            if (q() == sVar) {
                sb.append("</i></font>");
            }
        }
    }

    public final void P(StringBuilder sb, w wVar) throws IOException {
        be.e eVarH;
        String strM;
        m mVar = this.f5909a;
        if ((wVar instanceof y) && mVar.l()) {
            re.i iVar = ((y) wVar).f20011d;
            if (iVar.f19000c == re.k.f19005a || iVar.f19000c == re.k.f19006b) {
                sb.append("<Not computed yet>");
                return;
            }
        }
        w0 w0VarX = wVar.x();
        if (w0VarX instanceof se.q) {
            sb.append(((se.q) w0VarX).F(this, this));
            return;
        }
        if (!(w0VarX instanceof se.a0)) {
            throw new j0();
        }
        se.a0 a0Var = (se.a0) w0VarX;
        if (a0Var.equals(u0.f19994b) || a0Var.t() == u0.f19993a.f21628b) {
            sb.append("???");
            return;
        }
        se.k0 k0VarT = a0Var.t();
        if ((k0VarT instanceof ue.j) && ((ue.j) k0VarT).f21635a == ue.k.UNINFERRED_TYPE_VARIABLE) {
            if (!((Boolean) mVar.f5950t.a(mVar, m.Y[18])).booleanValue()) {
                sb.append("???");
                return;
            }
            se.k0 k0VarT2 = a0Var.t();
            jc.l.c(k0VarT2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb.append(C(((ue.j) k0VarT2).f21636b[0]));
            return;
        }
        if (se.c.l(a0Var)) {
            B(sb, a0Var);
            return;
        }
        if (!g0(a0Var)) {
            B(sb, a0Var);
            return;
        }
        int length = sb.length();
        ((i) this.f5910b.getValue()).w(sb, a0Var, null);
        boolean z10 = sb.length() != length;
        w wVarO = ud.n.o(a0Var);
        List listK = ud.n.k(a0Var);
        boolean zW = ud.n.w(a0Var);
        boolean zU = a0Var.u();
        boolean z11 = zU || (z10 && wVarO != null);
        if (z11) {
            if (zW) {
                sb.insert(length, '(');
            } else {
                if (z10) {
                    gh.g.E(ef.n.z0(sb));
                    if (sb.charAt(ef.n.s0(sb) - 1) != ')') {
                        sb.insert(ef.n.s0(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        L(sb, zW, "suspend");
        if (!listK.isEmpty()) {
            sb.append("context(");
            Iterator it = listK.subList(0, ud.b.r(listK)).iterator();
            while (it.hasNext()) {
                O(sb, (w) it.next());
                sb.append(", ");
            }
            O(sb, (w) vb.m.h0(listK));
            sb.append(") ");
        }
        if (wVarO != null) {
            boolean z12 = (g0(wVarO) && !wVarO.u()) || ud.n.w(wVarO) || !wVarO.getAnnotations().isEmpty() || (wVarO instanceof se.l);
            if (z12) {
                sb.append("(");
            }
            O(sb, wVarO);
            if (z12) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!ud.n.s(a0Var) || a0Var.getAnnotations().e(vc.n.f22887p) == null || a0Var.q().size() > 1) {
            int i10 = 0;
            for (n0 n0Var : ud.n.r(a0Var)) {
                int i11 = i10 + 1;
                if (i10 > 0) {
                    sb.append(", ");
                }
                if (((Boolean) mVar.U.a(mVar, m.Y[45])).booleanValue()) {
                    w wVarB = n0Var.b();
                    jc.l.d(wVarB, "getType(...)");
                    eVarH = ud.n.h(wVarB);
                } else {
                    eVarH = null;
                }
                if (eVarH != null) {
                    sb.append(M(eVarH, false));
                    sb.append(": ");
                }
                jc.l.e(n0Var, "typeProjection");
                StringBuilder sb2 = new StringBuilder();
                vb.m.e0(ud.b.w(n0Var), sb2, ", ", null, null, new g(this, 0), 60);
                sb.append(sb2.toString());
                i10 = i11;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        int iOrdinal = q().ordinal();
        if (iOrdinal == 0) {
            strM = m("->");
        } else {
            if (iOrdinal != 1) {
                throw new j0();
            }
            strM = "&rarr;";
        }
        sb.append(strM);
        sb.append(" ");
        ud.n.s(a0Var);
        w wVarB2 = ((n0) vb.m.h0(a0Var.q())).b();
        jc.l.d(wVarB2, "getType(...)");
        O(sb, wVarB2);
        if (z11) {
            sb.append(")");
        }
        if (zU) {
            sb.append("?");
        }
    }

    public final void Q(yc.c cVar, StringBuilder sb) {
        if (o().contains(j.OVERRIDE) && !cVar.A().isEmpty()) {
            m mVar = this.f5909a;
            if (((p) mVar.B.a(mVar, m.Y[26])) != p.f5960b) {
                L(sb, true, "override");
                if (s()) {
                    sb.append("/*");
                    sb.append(cVar.A().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    public final void R(StringBuilder sb, b0 b0Var) {
        b0 b0Var2 = (b0) b0Var.f20620d;
        yc.i iVar = (yc.i) b0Var.f20618b;
        if (b0Var2 != null) {
            R(sb, b0Var2);
            sb.append('.');
            be.e name = iVar.getName();
            jc.l.d(name, "getName(...)");
            sb.append(M(name, false));
        } else {
            se.k0 k0VarQ = iVar.Q();
            jc.l.d(k0VarQ, "getTypeConstructor(...)");
            sb.append(X(k0VarQ));
        }
        sb.append(W((List) b0Var.f20619c));
    }

    public final void S(yc.c cVar, StringBuilder sb) {
        a0 a0VarV0 = cVar.v0();
        if (a0VarV0 != null) {
            w(sb, a0VarV0, zc.d.f26685g);
            w wVarB = a0VarV0.b();
            jc.l.d(wVarB, "getType(...)");
            sb.append(E(wVarB));
            sb.append(".");
        }
    }

    public final void T(yc.c cVar, StringBuilder sb) {
        a0 a0VarV0;
        m mVar = this.f5909a;
        if (((Boolean) mVar.F.a(mVar, m.Y[30])).booleanValue() && (a0VarV0 = cVar.v0()) != null) {
            sb.append(" on ");
            w wVarB = a0VarV0.b();
            jc.l.d(wVarB, "getType(...)");
            sb.append(V(wVarB));
        }
    }

    public final String V(w wVar) throws IOException {
        jc.l.e(wVar, "type");
        StringBuilder sb = new StringBuilder();
        m mVar = this.f5909a;
        O(sb, (w) ((ic.k) mVar.f5955y.a(mVar, m.Y[23])).a(wVar));
        return sb.toString();
    }

    public final String W(List list) throws IOException {
        jc.l.e(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m("<"));
        vb.m.e0(list, sb, ", ", null, null, new g(this, 0), 60);
        sb.append(m(">"));
        return sb.toString();
    }

    public final String X(se.k0 k0Var) {
        jc.l.e(k0Var, "typeConstructor");
        yc.h hVarH = k0Var.h();
        if ((hVarH instanceof yc.q0) || (hVarH instanceof yc.e) || (hVarH instanceof p0)) {
            jc.l.e(hVarH, "klass");
            return ue.l.f(hVarH) ? hVarH.Q().toString() : n().a(hVarH, this);
        }
        if (hVarH == null) {
            return k0Var instanceof se.v ? ((se.v) k0Var).c(d.f5893m) : k0Var.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + hVarH.getClass()).toString());
    }

    public final void Y(yc.q0 q0Var, StringBuilder sb, boolean z10) {
        if (z10) {
            sb.append(m("<"));
        }
        if (s()) {
            sb.append("/*");
            sb.append(q0Var.getIndex());
            sb.append("*/ ");
        }
        L(sb, q0Var.Y(), "reified");
        String str = q0Var.e0().f20007a;
        boolean z11 = true;
        L(sb, str.length() > 0, str);
        w(sb, q0Var, null);
        N(q0Var, sb, z10);
        int size = q0Var.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            w wVar = (w) q0Var.getUpperBounds().iterator().next();
            if (wVar == null) {
                vc.i.a(141);
                throw null;
            }
            if (!vc.i.x(wVar) || !wVar.u()) {
                sb.append(" : ");
                sb.append(V(wVar));
            }
        } else if (z10) {
            for (w wVar2 : q0Var.getUpperBounds()) {
                if (wVar2 == null) {
                    vc.i.a(141);
                    throw null;
                }
                if (!vc.i.x(wVar2) || !wVar2.u()) {
                    if (z11) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(V(wVar2));
                    z11 = false;
                }
            }
        }
        if (z10) {
            sb.append(m(">"));
        }
    }

    public final void Z(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Y((yc.q0) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    @Override // de.k
    public final void a(c cVar) {
        this.f5909a.a(cVar);
    }

    public final void a0(StringBuilder sb, List list, boolean z10) {
        m mVar = this.f5909a;
        if (((Boolean) mVar.f5953w.a(mVar, m.Y[21])).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(m("<"));
        Z(sb, list);
        sb.append(m(">"));
        if (z10) {
            sb.append(" ");
        }
    }

    @Override // de.k
    public final void b() {
        this.f5909a.b();
    }

    public final void b0(yc.t0 t0Var, StringBuilder sb, boolean z10) {
        if (z10 || !(t0Var instanceof y0)) {
            sb.append(G(t0Var.u0() ? "var" : "val"));
            sb.append(" ");
        }
    }

    @Override // de.k
    public final void c() {
        this.f5909a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c0(bd.y0 r11, boolean r12, java.lang.StringBuilder r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: de.i.c0(bd.y0, boolean, java.lang.StringBuilder, boolean):void");
    }

    @Override // de.k
    public final void d() {
        this.f5909a.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d0(java.util.Collection r8, boolean r9, java.lang.StringBuilder r10) {
        /*
            r7 = this;
            de.m r0 = r7.f5909a
            de.l r1 = r0.E
            pc.u[] r2 = de.m.Y
            r3 = 29
            r2 = r2[r3]
            java.lang.Object r0 = r1.a(r0, r2)
            de.q r0 = (de.q) r0
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L27
            if (r0 == r2) goto L25
            r9 = 2
            if (r0 != r9) goto L1f
        L1d:
            r9 = 0
            goto L28
        L1f:
            ce.j0 r8 = new ce.j0
            r8.<init>()
            throw r8
        L25:
            if (r9 != 0) goto L1d
        L27:
            r9 = 1
        L28:
            int r0 = r8.size()
            de.e r3 = r7.r()
            r3.getClass()
            java.lang.String r3 = "builder"
            jc.l.e(r10, r3)
            java.lang.String r3 = "("
            r10.append(r3)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r3 = 0
        L44:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L73
            int r4 = r3 + 1
            java.lang.Object r5 = r8.next()
            bd.y0 r5 = (bd.y0) r5
            de.e r6 = r7.r()
            r6.getClass()
            java.lang.String r6 = "parameter"
            jc.l.e(r5, r6)
            r7.c0(r5, r9, r10, r1)
            de.e r5 = r7.r()
            r5.getClass()
            int r5 = r0 + (-1)
            if (r3 == r5) goto L71
            java.lang.String r3 = ", "
            r10.append(r3)
        L71:
            r3 = r4
            goto L44
        L73:
            de.e r8 = r7.r()
            r8.getClass()
            java.lang.String r8 = ")"
            r10.append(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.i.d0(java.util.Collection, boolean, java.lang.StringBuilder):void");
    }

    @Override // de.k
    public final void e(Set set) {
        jc.l.e(set, "<set-?>");
        this.f5909a.e(set);
    }

    public final boolean e0(ld.o oVar, StringBuilder sb) {
        if (!o().contains(j.VISIBILITY)) {
            return false;
        }
        m mVar = this.f5909a;
        l lVar = mVar.f5944n;
        pc.u[] uVarArr = m.Y;
        if (((Boolean) lVar.a(mVar, uVarArr[12])).booleanValue()) {
            oVar = yc.o.f(oVar.f12236a.c());
        }
        if (!((Boolean) mVar.f5945o.a(mVar, uVarArr[13])).booleanValue() && jc.l.a(oVar, yc.o.f26134j)) {
            return false;
        }
        sb.append(G(oVar.f12236a.b()));
        sb.append(" ");
        return true;
    }

    @Override // de.k
    public final void f() {
        this.f5909a.f();
    }

    public final void f0(StringBuilder sb, List list) {
        m mVar = this.f5909a;
        if (((Boolean) mVar.f5953w.a(mVar, m.Y[21])).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yc.q0 q0Var = (yc.q0) it.next();
            List upperBounds = q0Var.getUpperBounds();
            jc.l.d(upperBounds, "getUpperBounds(...)");
            for (w wVar : vb.m.V(upperBounds, 1)) {
                StringBuilder sb2 = new StringBuilder();
                be.e name = q0Var.getName();
                jc.l.d(name, "getName(...)");
                sb2.append(M(name, false));
                sb2.append(" : ");
                jc.l.b(wVar);
                sb2.append(V(wVar));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(G("where"));
        sb.append(" ");
        vb.m.e0(arrayList, sb, ", ", null, null, null, TinkerReport.KEY_APPLIED_INFO_CORRUPTED);
    }

    @Override // de.k
    public final void g() {
        this.f5909a.g();
    }

    @Override // de.k
    public final void h() {
        this.f5909a.h();
    }

    @Override // de.k
    public final void i() {
        this.f5909a.i();
    }

    @Override // de.k
    public final void j() {
        this.f5909a.j();
    }

    @Override // de.k
    public final void k(q qVar) {
        this.f5909a.k(qVar);
    }

    public final String m(String str) {
        return q().a(str);
    }

    public final c n() {
        m mVar = this.f5909a;
        return (c) mVar.f5932b.a(mVar, m.Y[0]);
    }

    public final Set o() {
        m mVar = this.f5909a;
        return (Set) mVar.f5935e.a(mVar, m.Y[3]);
    }

    public final boolean p() {
        m mVar = this.f5909a;
        return ((Boolean) mVar.f5936f.a(mVar, m.Y[4])).booleanValue();
    }

    public final u q() {
        m mVar = this.f5909a;
        return (u) mVar.D.a(mVar, m.Y[28]);
    }

    public final e r() {
        m mVar = this.f5909a;
        return (e) mVar.C.a(mVar, m.Y[27]);
    }

    public final boolean s() {
        m mVar = this.f5909a;
        return ((Boolean) mVar.f5940j.a(mVar, m.Y[8])).booleanValue();
    }

    public final String u(yc.k kVar) {
        yc.k kVarY;
        String str;
        jc.l.e(kVar, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        kVar.a0(new c1(17, this), sb);
        m mVar = this.f5909a;
        l lVar = mVar.f5933c;
        pc.u[] uVarArr = m.Y;
        if (((Boolean) lVar.a(mVar, uVarArr[1])).booleanValue() && !(kVar instanceof d0) && !(kVar instanceof h0) && (kVarY = kVar.y()) != null && !(kVarY instanceof yc.y)) {
            sb.append(" ");
            int iOrdinal = q().ordinal();
            if (iOrdinal == 0) {
                str = "defined in";
            } else {
                if (iOrdinal != 1) {
                    throw new j0();
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(" ");
            be.d dVarG = ee.e.g(kVarY);
            jc.l.d(dVarG, "getFqName(...)");
            sb.append(dVarG.c() ? "root package" : m(lc.b.O(be.d.f(dVarG))));
            if (((Boolean) mVar.f5934d.a(mVar, uVarArr[2])).booleanValue() && (kVarY instanceof d0) && (kVar instanceof yc.l)) {
                ((yc.l) kVar).m().getClass();
            }
        }
        return sb.toString();
    }

    public final String v(zc.b bVar, zc.d dVar) throws IOException {
        bd.l lVarJ0;
        List listO0;
        m mVar = this.f5909a;
        l lVar = mVar.N;
        jc.l.e(bVar, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (dVar != null) {
            sb.append(dVar.f26690a + ':');
        }
        w wVarB = bVar.b();
        sb.append(V(wVarB));
        pc.u[] uVarArr = m.Y;
        if (((a) lVar.a(mVar, uVarArr[38])).f5876a) {
            Map mapC = bVar.c();
            List list = null;
            yc.e eVarD = ((Boolean) mVar.I.a(mVar, uVarArr[33])).booleanValue() ? ie.d.d(bVar) : null;
            if (eVarD != null && (lVarJ0 = eVarD.j0()) != null && (listO0 = lVarJ0.o0()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listO0) {
                    if (((y0) obj).E1()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(vb.n.K(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((y0) it.next()).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = vb.r.f22819a;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!mapC.containsKey((be.e) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(vb.n.K(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((be.e) it2.next()).b() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapC.entrySet();
            ArrayList arrayList5 = new ArrayList(vb.n.K(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                be.e eVar = (be.e) entry.getKey();
                ge.g gVar = (ge.g) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(eVar.b());
                sb2.append(" = ");
                sb2.append(!list.contains(eVar) ? z(gVar) : "...");
                arrayList5.add(sb2.toString());
            }
            List listB0 = vb.m.B0(vb.m.q0(arrayList4, arrayList5));
            if (((a) lVar.a(mVar, m.Y[38])).f5877b || !listB0.isEmpty()) {
                vb.m.e0(listB0, sb, ", ", "(", ")", null, 112);
            }
        }
        if (s() && (se.c.l(wVarB) || (wVarB.t().h() instanceof c0))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    public final void w(StringBuilder sb, zc.a aVar, zc.d dVar) {
        if (o().contains(j.ANNOTATIONS)) {
            boolean z10 = aVar instanceof w;
            m mVar = this.f5909a;
            Set setM = z10 ? mVar.m() : (Set) mVar.K.a(mVar, m.Y[35]);
            ic.k kVar = (ic.k) mVar.M.a(mVar, m.Y[37]);
            for (zc.b bVar : aVar.getAnnotations()) {
                if (!vb.m.S(setM, bVar.a()) && !jc.l.a(bVar.a(), vc.n.f22889r) && (kVar == null || ((Boolean) kVar.a(bVar)).booleanValue())) {
                    sb.append(v(bVar, dVar));
                    if (((Boolean) mVar.J.a(mVar, m.Y[34])).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    public final void y(yc.i iVar, StringBuilder sb) {
        List listL = iVar.L();
        jc.l.d(listL, "getDeclaredTypeParameters(...)");
        List listO = iVar.Q().o();
        jc.l.d(listO, "getParameters(...)");
        if (s() && iVar.d0() && listO.size() > listL.size()) {
            sb.append(" /*captured type parameters: ");
            Z(sb, listO.subList(listL.size(), listO.size()));
            sb.append("*/");
        }
    }

    public final String z(ge.g gVar) {
        m mVar = this.f5909a;
        ic.k kVar = (ic.k) mVar.f5952v.a(mVar, m.Y[20]);
        if (kVar != null) {
            return (String) kVar.a(gVar);
        }
        if (gVar instanceof ge.b) {
            Iterable iterable = (Iterable) ((ge.b) gVar).f7527a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strZ = z((ge.g) it.next());
                if (strZ != null) {
                    arrayList.add(strZ);
                }
            }
            return vb.m.f0(arrayList, ", ", "{", "}", null, 56);
        }
        if (gVar instanceof ge.a) {
            return ef.n.F0(v((zc.b) ((ge.a) gVar).f7527a, null), "@");
        }
        if (!(gVar instanceof ge.s)) {
            return gVar.toString();
        }
        ge.r rVar = (ge.r) ((ge.s) gVar).f7527a;
        if (rVar instanceof ge.p) {
            return ((ge.p) rVar).f7534a + "::class";
        }
        if (!(rVar instanceof ge.q)) {
            throw new j0();
        }
        ge.f fVar = ((ge.q) rVar).f7535a;
        String strG = fVar.f7525a.a().f2744a.f2747a;
        int i10 = fVar.f7526b;
        for (int i11 = 0; i11 < i10; i11++) {
            strG = a0.c.G('>', "kotlin.Array<", strG);
        }
        return j2.h0.j(strG, "::class");
    }
}
