package ee;

import bd.j0;
import java.util.Collection;
import se.k0;
import yc.d0;
import yc.m0;
import yc.q0;
import yc.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements te.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f6523a = new c();

    public static /* synthetic */ void b(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static m0 e(yc.b bVar) {
        while (bVar instanceof yc.c) {
            yc.c cVar = (yc.c) bVar;
            if (cVar.j() != 2) {
                break;
            }
            Collection collectionA = cVar.A();
            jc.l.d(collectionA, "getOverriddenDescriptors(...)");
            bVar = (yc.c) vb.m.y0(collectionA);
            if (bVar == null) {
                return null;
            }
        }
        return bVar.m();
    }

    @Override // te.c
    public boolean a(k0 k0Var, k0 k0Var2) {
        if (k0Var == null) {
            b(0);
            throw null;
        }
        if (k0Var2 != null) {
            return k0Var.equals(k0Var2);
        }
        b(1);
        throw null;
    }

    public boolean c(yc.k kVar, yc.k kVar2, boolean z10) {
        if ((kVar instanceof yc.e) && (kVar2 instanceof yc.e)) {
            return jc.l.a(((yc.e) kVar).Q(), ((yc.e) kVar2).Q());
        }
        if ((kVar instanceof q0) && (kVar2 instanceof q0)) {
            return d((q0) kVar, (q0) kVar2, z10, a.f6519a);
        }
        if (!(kVar instanceof yc.b) || !(kVar2 instanceof yc.b)) {
            return ((kVar instanceof d0) && (kVar2 instanceof d0)) ? jc.l.a(((j0) ((d0) kVar)).f2596e, ((j0) ((d0) kVar2)).f2596e) : jc.l.a(kVar, kVar2);
        }
        yc.b bVar = (yc.b) kVar;
        yc.b bVar2 = (yc.b) kVar2;
        if (!bVar.equals(bVar2)) {
            if (jc.l.a(bVar.getName(), bVar2.getName()) && ((!(bVar instanceof w) || !(bVar2 instanceof w) || ((w) bVar).c0() == ((w) bVar2).c0()) && ((!jc.l.a(bVar.y(), bVar2.y()) || (z10 && jc.l.a(e(bVar), e(bVar2)))) && !e.n(bVar) && !e.n(bVar2)))) {
                yc.k kVarY = bVar.y();
                yc.k kVarY2 = bVar2.y();
                if (((kVarY instanceof yc.c) || (kVarY2 instanceof yc.c)) ? false : c(kVarY, kVarY2, z10)) {
                    l lVar = new l(new b7.n(bVar, bVar2, z10));
                    if (lVar.m(bVar, bVar2, null, true).b() != 1 || lVar.m(bVar2, bVar, null, true).b() != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean d(q0 q0Var, q0 q0Var2, boolean z10, ic.n nVar) {
        jc.l.e(q0Var, "a");
        jc.l.e(q0Var2, "b");
        if (q0Var.equals(q0Var2)) {
            return true;
        }
        if (jc.l.a(q0Var.y(), q0Var2.y())) {
            return false;
        }
        yc.k kVarY = q0Var.y();
        yc.k kVarY2 = q0Var2.y();
        return (((kVarY instanceof yc.c) || (kVarY2 instanceof yc.c)) ? ((Boolean) nVar.q(kVarY, kVarY2)).booleanValue() : c(kVarY, kVarY2, z10)) && q0Var.getIndex() == q0Var2.getIndex();
    }
}
