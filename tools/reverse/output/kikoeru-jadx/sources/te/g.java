package te;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.Collection;
import java.util.List;
import jc.z;
import q.t0;
import se.a0;
import se.d0;
import se.f0;
import se.j0;
import se.k0;
import se.l0;
import se.n0;
import se.r0;
import se.u0;
import se.v;
import se.w;
import se.w0;
import se.x0;
import yc.q0;
import yc.u;
import yc.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final app.nekogram.translator.r f20728a = new app.nekogram.translator.r(10, "KotlinTypeRefiner");

    public static boolean A(ve.h hVar) {
        if (hVar instanceof k0) {
            return vc.i.H((k0) hVar, vc.n.f22865a);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, hVar.getClass(), sb).toString());
    }

    public static boolean B(ve.h hVar) {
        jc.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            return ((k0) hVar).h() instanceof yc.e;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, hVar.getClass(), sb).toString());
    }

    public static boolean C(ve.h hVar) {
        if (hVar instanceof k0) {
            yc.h hVarH = ((k0) hVar).h();
            yc.e eVar = hVarH instanceof yc.e ? (yc.e) hVarH : null;
            return (eVar == null || eVar.s() != x.f26155b || eVar.j() == yc.f.f26111c || eVar.j() == yc.f.f26112d || eVar.j() == yc.f.f26113e) ? false : true;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, hVar.getClass(), sb).toString());
    }

    public static boolean D(ve.h hVar) {
        if (hVar instanceof k0) {
            return ((k0) hVar).j();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, hVar.getClass(), sb).toString());
    }

    public static boolean E(ve.d dVar) {
        jc.l.e(dVar, "$receiver");
        if (dVar instanceof w) {
            return se.c.l((w) dVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, dVar.getClass(), sb).toString());
    }

    public static boolean F(ve.h hVar) {
        jc.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            yc.h hVarH = ((k0) hVar).h();
            yc.e eVar = hVarH instanceof yc.e ? (yc.e) hVarH : null;
            return (eVar != null ? eVar.J0() : null) instanceof u;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, hVar.getClass(), sb).toString());
    }

    public static boolean G(ve.h hVar) {
        jc.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            return hVar instanceof ge.n;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, hVar.getClass(), sb).toString());
    }

    public static boolean H(ve.h hVar) {
        jc.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            return hVar instanceof v;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, hVar.getClass(), sb).toString());
    }

    public static boolean I(ve.d dVar) {
        jc.l.e(dVar, "$receiver");
        return (dVar instanceof a0) && ((a0) dVar).u();
    }

    public static boolean J(ve.h hVar) {
        jc.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            return vc.i.H((k0) hVar, vc.n.f22867b);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, hVar.getClass(), sb).toString());
    }

    public static boolean K(ve.d dVar) {
        jc.l.e(dVar, "$receiver");
        if (dVar instanceof w) {
            return u0.e((w) dVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, dVar.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean L(ve.f fVar) {
        if (fVar instanceof w) {
            return vc.i.F((w) fVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, fVar.getClass(), sb).toString());
    }

    public static boolean M(ve.c cVar) {
        if (cVar instanceof h) {
            return ((h) cVar).f20734g;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, cVar.getClass(), sb).toString());
    }

    public static boolean N(n0 n0Var) {
        jc.l.e(n0Var, "$receiver");
        if (n0Var instanceof n0) {
            return n0Var.c();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(n0Var);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, n0Var.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void O(ve.e eVar) {
        jc.l.e(eVar, "$receiver");
        if (eVar instanceof a0) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(eVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, eVar.getClass(), sb).toString());
    }

    public static void P(ve.e eVar) {
        if (eVar instanceof a0) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(eVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, eVar.getClass(), sb).toString());
    }

    public static a0 Q(se.q qVar) {
        if (qVar instanceof se.q) {
            return qVar.f19978b;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(qVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, qVar.getClass(), sb).toString());
    }

    public static w0 R(ve.c cVar) {
        if (cVar instanceof h) {
            return ((h) cVar).f20731d;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, cVar.getClass(), sb).toString());
    }

    public static w0 S(ve.d dVar) {
        if (dVar instanceof w0) {
            return se.c.o((w0) dVar, false);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, dVar.getClass(), sb).toString());
    }

    public static int T(ve.h hVar) {
        jc.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            return ((k0) hVar).o().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, hVar.getClass(), sb).toString());
    }

    public static Collection U(b bVar, ve.e eVar) {
        k0 k0VarR = bVar.R(eVar);
        if (k0VarR instanceof ge.n) {
            return ((ge.n) k0VarR).f7532a;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(eVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, eVar.getClass(), sb).toString());
    }

    public static n0 V(fe.b bVar) {
        jc.l.e(bVar, "$receiver");
        if (bVar instanceof i) {
            return ((i) bVar).f20735a;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(bVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, bVar.getClass(), sb).toString());
    }

    public static w W(ve.i iVar, ve.d dVar) {
        jc.l.e(iVar, "$receiver");
        jc.l.e(dVar, "type");
        if (!(dVar instanceof w0)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(dVar);
            sb.append(", ");
            throw new IllegalArgumentException(t0.F(z.f10839a, dVar.getClass(), sb).toString());
        }
        if (iVar instanceof r0) {
            return ((r0) iVar).g((w) dVar, x0.INVARIANT);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(iVar);
        sb2.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, iVar.getClass(), sb2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a X(b bVar, ve.e eVar) {
        if (eVar instanceof a0) {
            w wVar = (w) eVar;
            return new a(bVar, new r0(l0.f19970b.g(wVar.t(), wVar.q())));
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(eVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, eVar.getClass(), sb).toString());
    }

    public static Collection Y(ve.h hVar) {
        jc.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            Collection collectionI = ((k0) hVar).i();
            jc.l.d(collectionI, "getSupertypes(...)");
            return collectionI;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, hVar.getClass(), sb).toString());
    }

    public static k0 Z(ve.e eVar) {
        jc.l.e(eVar, "$receiver");
        if (eVar instanceof a0) {
            return ((a0) eVar).t();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(eVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, eVar.getClass(), sb).toString());
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[0] = "type";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i10) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[2] = "capture";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static i a0(ve.c cVar) {
        if (cVar instanceof h) {
            return ((h) cVar).f20730c;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, cVar.getClass(), sb).toString());
    }

    public static boolean b(ve.h hVar, ve.h hVar2) {
        jc.l.e(hVar, "c1");
        jc.l.e(hVar2, "c2");
        if (!(hVar instanceof k0)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(hVar);
            sb.append(", ");
            throw new IllegalArgumentException(t0.F(z.f10839a, hVar.getClass(), sb).toString());
        }
        if (hVar2 instanceof k0) {
            return hVar.equals(hVar2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(hVar2);
        sb2.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, hVar2.getClass(), sb2).toString());
    }

    public static a0 b0(se.q qVar) {
        if (qVar instanceof se.q) {
            return qVar.f19979c;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(qVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, qVar.getClass(), sb).toString());
    }

    public static int c(ve.d dVar) {
        jc.l.e(dVar, "$receiver");
        if (dVar instanceof w) {
            return ((w) dVar).q().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, dVar.getClass(), sb).toString());
    }

    public static a0 c0(ve.e eVar, boolean z10) {
        jc.l.e(eVar, "$receiver");
        if (eVar instanceof a0) {
            return ((a0) eVar).z(z10);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(eVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, eVar.getClass(), sb).toString());
    }

    public static ve.g d(ve.e eVar) {
        jc.l.e(eVar, "$receiver");
        if (eVar instanceof a0) {
            return (ve.g) eVar;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(eVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, eVar.getClass(), sb).toString());
    }

    public static ve.d d0(b bVar, ve.d dVar) {
        if (dVar instanceof ve.e) {
            return bVar.f0((ve.e) dVar);
        }
        if (!(dVar instanceof se.q)) {
            throw new IllegalStateException("sealed");
        }
        se.q qVar = (se.q) dVar;
        return bVar.S(bVar.f0(bVar.b0(qVar)), bVar.f0(bVar.i0(qVar)));
    }

    public static ve.c e(b bVar, ve.f fVar) {
        jc.l.e(fVar, "$receiver");
        if (fVar instanceof a0) {
            if (fVar instanceof d0) {
                return bVar.m(((d0) fVar).f19935b);
            }
            if (fVar instanceof h) {
                return (h) fVar;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, fVar.getClass(), sb).toString());
    }

    public static se.l f(ve.e eVar) {
        jc.l.e(eVar, "$receiver");
        if (eVar instanceof a0) {
            if (eVar instanceof se.l) {
                return (se.l) eVar;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(eVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, eVar.getClass(), sb).toString());
    }

    public static se.q g(ve.d dVar) {
        jc.l.e(dVar, "$receiver");
        if (dVar instanceof w) {
            w0 w0VarX = ((w) dVar).x();
            if (w0VarX instanceof se.q) {
                return (se.q) w0VarX;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, dVar.getClass(), sb).toString());
    }

    public static a0 h(ve.d dVar) {
        jc.l.e(dVar, "$receiver");
        if (dVar instanceof w) {
            w0 w0VarX = ((w) dVar).x();
            if (w0VarX instanceof a0) {
                return (a0) w0VarX;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, dVar.getClass(), sb).toString());
    }

    public static f0 i(ve.d dVar) {
        if (dVar instanceof w) {
            return ud.e.b((w) dVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, dVar.getClass(), sb).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static se.a0 j(ve.e r17) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te.g.j(ve.e):se.a0");
    }

    public static ve.b k(ve.c cVar) {
        if (cVar instanceof h) {
            return ((h) cVar).f20729b;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, cVar.getClass(), sb).toString());
    }

    public static j0 l(boolean z10, b bVar, e eVar, int i10) {
        if ((i10 & 4) != 0) {
            bVar = e.f20726b;
        }
        b bVar2 = bVar;
        if ((i10 & 8) != 0) {
            eVar = e.f20725a;
        }
        return new j0(z10, true, bVar2, eVar, f.f20727a);
    }

    public static w0 m(b bVar, ve.e eVar, ve.e eVar2) {
        jc.l.e(eVar, "lowerBound");
        jc.l.e(eVar2, "upperBound");
        if (!(eVar instanceof a0)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(bVar);
            sb.append(", ");
            throw new IllegalArgumentException(t0.F(z.f10839a, bVar.getClass(), sb).toString());
        }
        if (eVar2 instanceof a0) {
            return se.c.g((a0) eVar, (a0) eVar2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(bVar);
        sb2.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, bVar.getClass(), sb2).toString());
    }

    public static final String n(k0 k0Var) {
        StringBuilder sb = new StringBuilder();
        o("type: " + k0Var, sb);
        o("hashCode: " + k0Var.hashCode(), sb);
        o("javaClass: " + k0Var.getClass().getCanonicalName(), sb);
        for (yc.k kVarH = k0Var.h(); kVarH != null; kVarH = kVarH.y()) {
            o("fqName: " + de.i.f5906c.u(kVarH), sb);
            o("javaClass: " + kVarH.getClass().getCanonicalName(), sb);
        }
        return sb.toString();
    }

    public static final void o(String str, StringBuilder sb) {
        jc.l.e(str, "<this>");
        sb.append(str);
        sb.append('\n');
    }

    public static n0 p(ve.d dVar, int i10) {
        jc.l.e(dVar, "$receiver");
        if (dVar instanceof w) {
            return (n0) ((w) dVar).q().get(i10);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, dVar.getClass(), sb).toString());
    }

    public static List q(ve.d dVar) {
        jc.l.e(dVar, "$receiver");
        if (dVar instanceof w) {
            return ((w) dVar).q();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, dVar.getClass(), sb).toString());
    }

    public static q0 r(ve.h hVar, int i10) {
        jc.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            Object obj = ((k0) hVar).o().get(i10);
            jc.l.d(obj, "get(...)");
            return (q0) obj;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, hVar.getClass(), sb).toString());
    }

    public static List s(ve.h hVar) {
        jc.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            List listO = ((k0) hVar).o();
            jc.l.d(listO, "getParameters(...)");
            return listO;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, hVar.getClass(), sb).toString());
    }

    public static w0 t(b bVar, n0 n0Var) {
        jc.l.e(n0Var, "$receiver");
        if (bVar.a0(n0Var)) {
            return null;
        }
        if (n0Var instanceof n0) {
            return n0Var.b().x();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(n0Var);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, n0Var.getClass(), sb).toString());
    }

    public static q0 u(ve.h hVar) {
        jc.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            yc.h hVarH = ((k0) hVar).h();
            if (hVarH instanceof q0) {
                return (q0) hVarH;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, hVar.getClass(), sb).toString());
    }

    public static ve.j v(n0 n0Var) {
        jc.l.e(n0Var, "$receiver");
        if (n0Var instanceof n0) {
            x0 x0VarA = n0Var.a();
            jc.l.d(x0VarA, "getProjectionKind(...)");
            return ua.j.j(x0VarA);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(n0Var);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, n0Var.getClass(), sb).toString());
    }

    public static ve.j w(q0 q0Var) {
        jc.l.e(q0Var, "$receiver");
        x0 x0VarE0 = q0Var.e0();
        jc.l.d(x0VarE0, "getVariance(...)");
        return ua.j.j(x0VarE0);
    }

    public static boolean x(ve.d dVar, be.c cVar) {
        jc.l.e(dVar, "$receiver");
        jc.l.e(cVar, "fqName");
        if (dVar instanceof w) {
            return ((w) dVar).getAnnotations().f(cVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, dVar.getClass(), sb).toString());
    }

    public static boolean y(q0 q0Var, ve.h hVar) {
        if (hVar == null ? true : hVar instanceof k0) {
            return ud.e.C(q0Var, (k0) hVar, null);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(q0Var);
        sb.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, q0Var.getClass(), sb).toString());
    }

    public static boolean z(ve.e eVar, ve.e eVar2) {
        jc.l.e(eVar, "a");
        jc.l.e(eVar2, "b");
        if (!(eVar instanceof a0)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(eVar);
            sb.append(", ");
            throw new IllegalArgumentException(t0.F(z.f10839a, eVar.getClass(), sb).toString());
        }
        if (eVar2 instanceof a0) {
            return ((a0) eVar).q() == ((a0) eVar2).q();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar2);
        sb2.append(", ");
        throw new IllegalArgumentException(t0.F(z.f10839a, eVar2.getClass(), sb2).toString());
    }
}
