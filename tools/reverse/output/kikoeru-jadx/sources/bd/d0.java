package bd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f2559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final se.r0 f2560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public se.r0 f2561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f2562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f2563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public se.i f2564f;

    public d0(e0 e0Var, se.r0 r0Var) {
        this.f2559a = e0Var;
        this.f2560b = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void k(int r15) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.d0.k(int):void");
    }

    @Override // yc.e, yc.h
    public final se.a0 E() {
        se.h0 h0VarU;
        List listD = se.u0.d(Q().o());
        zc.h annotations = getAnnotations();
        if (annotations.isEmpty()) {
            se.h0.f19950b.getClass();
            h0VarU = se.h0.f19951c;
        } else {
            m0.w wVar = se.h0.f19950b;
            List listW = ud.b.w(new se.g(annotations));
            wVar.getClass();
            h0VarU = m0.w.u(listW);
        }
        return se.c.w(listD, N0(), h0VarU, Q(), false);
    }

    @Override // yc.e
    public final le.o I0() {
        le.o oVarI0 = this.f2559a.I0();
        if (oVarI0 != null) {
            return oVarI0;
        }
        k(28);
        throw null;
    }

    @Override // yc.e
    public final yc.r0 J0() {
        yc.r0 r0VarJ0 = this.f2559a.J0();
        if (r0VarJ0 == null) {
            return null;
        }
        boolean z10 = r0VarJ0 instanceof yc.u;
        se.x0 x0Var = se.x0.INVARIANT;
        se.r0 r0Var = this.f2560b;
        if (z10) {
            yc.u uVar = (yc.u) r0VarJ0;
            be.e eVar = uVar.f26148a;
            se.a0 a0Var = (se.a0) uVar.f26149b;
            if (a0Var != null && !r0Var.f19981a.e()) {
                a0Var = (se.a0) o().i(a0Var, x0Var);
            }
            return new yc.u(eVar, a0Var);
        }
        if (!(r0VarJ0 instanceof yc.z)) {
            throw new ce.j0();
        }
        ArrayList<ub.k> arrayList = ((yc.z) r0VarJ0).f26162a;
        ArrayList arrayList2 = new ArrayList(vb.n.K(arrayList, 10));
        for (ub.k kVar : arrayList) {
            be.e eVar2 = (be.e) kVar.f21543a;
            se.a0 a0Var2 = (se.a0) ((ve.e) kVar.f21544b);
            if (a0Var2 != null && !r0Var.f19981a.e()) {
                a0Var2 = (se.a0) o().i(a0Var2, x0Var);
            }
            arrayList2.add(new ub.k(eVar2, a0Var2));
        }
        return new yc.z(arrayList2);
    }

    @Override // yc.e, yc.i
    public final List L() {
        o();
        ArrayList arrayList = this.f2563e;
        if (arrayList != null) {
            return arrayList;
        }
        k(30);
        throw null;
    }

    @Override // yc.e
    public final le.o N0() {
        ie.d.i(ee.e.d(this.f2559a));
        return i(te.f.f20727a);
    }

    @Override // yc.w
    public final boolean O0() {
        return this.f2559a.O0();
    }

    @Override // yc.w
    public final boolean P() {
        return this.f2559a.P();
    }

    @Override // yc.h
    public final se.k0 Q() {
        se.k0 k0VarQ = this.f2559a.Q();
        if (this.f2560b.f19981a.e()) {
            if (k0VarQ != null) {
                return k0VarQ;
            }
            k(0);
            throw null;
        }
        if (this.f2564f == null) {
            se.r0 r0VarO = o();
            Collection collectionI = k0VarQ.i();
            ArrayList arrayList = new ArrayList(collectionI.size());
            Iterator it = collectionI.iterator();
            while (it.hasNext()) {
                arrayList.add(r0VarO.i((se.w) it.next(), se.x0.INVARIANT));
            }
            this.f2564f = new se.i(this, this.f2562d, arrayList, re.l.f19010e);
        }
        se.i iVar = this.f2564f;
        if (iVar != null) {
            return iVar;
        }
        k(1);
        throw null;
    }

    @Override // yc.e
    public final List Q0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        k(17);
        throw null;
    }

    @Override // yc.e
    public final boolean R() {
        return this.f2559a.R();
    }

    @Override // yc.e
    public final boolean S0() {
        return this.f2559a.S0();
    }

    @Override // yc.e
    public final Collection T() {
        Collection<l> collectionT = this.f2559a.T();
        ArrayList arrayList = new ArrayList(collectionT.size());
        for (l lVar : collectionT) {
            l lVar2 = lVar;
            lVar2.getClass();
            y yVarJ1 = lVar2.J1(se.r0.f19980b);
            yVarJ1.f2689e = lVar.C1();
            yVarJ1.l(lVar2.s());
            yVarJ1.E(lVar2.f());
            yVarJ1.h(lVar2.j());
            yVarJ1.f2697m = false;
            arrayList.add(((l) yVarJ1.f2708x.G1(yVarJ1)).h(o()));
        }
        return arrayList;
    }

    @Override // yc.e
    public final a0 T0() {
        throw new UnsupportedOperationException();
    }

    @Override // yc.e
    public final boolean W() {
        return this.f2559a.W();
    }

    @Override // bd.e0, yc.e, yc.k, yc.b
    public final yc.e a() {
        yc.e eVarA = this.f2559a.a();
        if (eVarA != null) {
            return eVarA;
        }
        k(21);
        throw null;
    }

    @Override // yc.k
    public final Object a0(yc.m mVar, Object obj) {
        return mVar.K(this, obj);
    }

    @Override // bd.e0
    public final le.o c(se.p0 p0Var, te.f fVar) {
        le.o oVarC = this.f2559a.c(p0Var, fVar);
        if (!this.f2560b.f19981a.e()) {
            return new le.t(oVarC, o());
        }
        if (oVarC != null) {
            return oVarC;
        }
        k(7);
        throw null;
    }

    @Override // yc.w
    public final boolean c0() {
        return this.f2559a.c0();
    }

    @Override // yc.i
    public final boolean d0() {
        return this.f2559a.d0();
    }

    @Override // yc.e, yc.w, yc.n
    public final ld.o f() {
        ld.o oVarF = this.f2559a.f();
        if (oVarF != null) {
            return oVarF;
        }
        k(27);
        throw null;
    }

    @Override // yc.e
    public final le.o f0(se.p0 p0Var) {
        ie.d.i(ee.e.d(this));
        return c(p0Var, te.f.f20727a);
    }

    @Override // zc.a
    public final zc.h getAnnotations() {
        zc.h annotations = this.f2559a.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        k(19);
        throw null;
    }

    @Override // yc.k
    public final be.e getName() {
        be.e name = this.f2559a.getName();
        if (name != null) {
            return name;
        }
        k(20);
        throw null;
    }

    @Override // yc.o0
    public final yc.l h(se.r0 r0Var) {
        if (r0Var != null) {
            return r0Var.f19981a.e() ? this : new d0(this, se.r0.e(r0Var.f(), o().f()));
        }
        k(23);
        throw null;
    }

    @Override // bd.e0
    public final le.o i(te.f fVar) {
        le.o oVarI = this.f2559a.i(fVar);
        if (!this.f2560b.f19981a.e()) {
            return new le.t(oVarI, o());
        }
        if (oVarI != null) {
            return oVarI;
        }
        k(14);
        throw null;
    }

    @Override // yc.e
    public final yc.f j() {
        yc.f fVarJ = this.f2559a.j();
        if (fVarJ != null) {
            return fVarJ;
        }
        k(25);
        throw null;
    }

    @Override // yc.e
    public final l j0() {
        return this.f2559a.j0();
    }

    @Override // yc.e
    public final le.o k0() {
        le.o oVarK0 = this.f2559a.k0();
        if (oVarK0 != null) {
            return oVarK0;
        }
        k(15);
        throw null;
    }

    @Override // yc.e
    public final boolean l() {
        return this.f2559a.l();
    }

    @Override // yc.l
    public final yc.m0 m() {
        return yc.m0.p0;
    }

    public final se.r0 o() {
        if (this.f2561c == null) {
            se.r0 r0Var = this.f2560b;
            if (r0Var.f19981a.e()) {
                this.f2561c = r0Var;
            } else {
                List listO = this.f2559a.Q().o();
                this.f2562d = new ArrayList(listO.size());
                this.f2561c = se.c.B(listO, r0Var.f(), this, this.f2562d);
                ArrayList arrayList = this.f2562d;
                jc.l.e(arrayList, "<this>");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!((yc.q0) obj).x0()) {
                        arrayList2.add(obj);
                    }
                }
                this.f2563e = arrayList2;
            }
        }
        return this.f2561c;
    }

    @Override // yc.e, yc.w
    public final yc.x s() {
        yc.x xVarS = this.f2559a.s();
        if (xVarS != null) {
            return xVarS;
        }
        k(26);
        throw null;
    }

    @Override // yc.e
    public final boolean w() {
        return this.f2559a.w();
    }

    @Override // yc.k
    public final yc.k y() {
        yc.k kVarY = this.f2559a.y();
        if (kVarY != null) {
            return kVarY;
        }
        k(22);
        throw null;
    }
}
