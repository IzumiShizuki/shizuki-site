package qe;

import b0.w1;
import bd.a0;
import bd.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import n7.b0;
import se.k0;
import u3.x0;
import wd.d0;
import wd.g1;
import wd.h1;
import wd.t0;
import wd.z0;
import yc.l0;
import yc.m0;
import yc.n0;
import yc.r0;
import yc.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends bd.c implements yc.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wd.k f18170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yd.a f18171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m0 f18172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final be.b f18173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x f18174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ld.o f18175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final yc.f f18176k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final oe.k f18177l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final le.p f18178m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final pd.h f18179n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l0 f18180o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w1 f18181p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yc.k f18182q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final re.h f18183r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final re.i f18184s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final re.h f18185t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final oe.u f18186u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final zc.h f18187v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public h(oe.k kVar, wd.k kVar2, yd.f fVar, yd.a aVar, m0 m0Var) {
        yc.f fVar2;
        le.p sVar;
        oe.u uVar;
        wd.k kVar3;
        f0 f0Var;
        m0 m0Var2;
        super(kVar.f16390a.f16364a, x0.m(fVar, kVar2.f23805e).f());
        jc.l.e(kVar, "outerContext");
        jc.l.e(kVar2, "classProto");
        jc.l.e(fVar, "nameResolver");
        jc.l.e(m0Var, "sourceElement");
        this.f18170e = kVar2;
        this.f18171f = aVar;
        this.f18172g = m0Var;
        this.f18173h = x0.m(fVar, kVar2.f23805e);
        this.f18174i = oe.j.e((d0) yd.d.f26175e.d(kVar2.f23804d));
        this.f18175j = b0.h((h1) yd.d.f26174d.d(kVar2.f23804d));
        wd.j jVar = (wd.j) yd.d.f26176f.d(kVar2.f23804d);
        int i10 = jVar == null ? -1 : oe.x.f16435b[jVar.ordinal()];
        yc.f fVar3 = yc.f.f26111c;
        yc.f fVar4 = yc.f.f26109a;
        switch (i10) {
            case 1:
            default:
                fVar2 = fVar4;
                break;
            case 2:
                fVar4 = yc.f.f26110b;
                fVar2 = fVar4;
                break;
            case 3:
                fVar2 = fVar3;
                break;
            case 4:
                fVar4 = yc.f.f26112d;
                fVar2 = fVar4;
                break;
            case 5:
                fVar4 = yc.f.f26113e;
                fVar2 = fVar4;
                break;
            case 6:
            case 7:
                fVar4 = yc.f.f26114f;
                fVar2 = fVar4;
                break;
        }
        this.f18176k = fVar2;
        List list = kVar2.f23807g;
        jc.l.d(list, "getTypeParameterList(...)");
        z0 z0Var = kVar2.A;
        jc.l.d(z0Var, "getTypeTable(...)");
        f0 f0Var2 = new f0(z0Var);
        yd.i iVar = yd.i.f26206b;
        g1 g1Var = kVar2.C;
        jc.l.d(g1Var, "getVersionRequirementTable(...)");
        oe.k kVarA = kVar.a(this, list, fVar, f0Var2, ud.n.c(g1Var), aVar);
        oe.i iVar2 = kVarA.f16390a;
        this.f18177l = kVarA;
        boolean zBooleanValue = yd.d.f26183m.d(kVar2.f23804d).booleanValue();
        if (fVar2 == fVar3) {
            sVar = new le.s(iVar2.f16364a, this, zBooleanValue || jc.l.a(iVar2.f16382s.d(), Boolean.TRUE));
        } else {
            sVar = le.n.f12335b;
        }
        this.f18178m = sVar;
        this.f18179n = new pd.h(this);
        n0 n0Var = l0.f26117d;
        re.l lVar = iVar2.f16364a;
        re.l lVar2 = iVar2.f16364a;
        ((te.l) iVar2.f16380q).getClass();
        int i11 = 0;
        de.h hVar = new de.h(1, this, g.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0, 0, 6);
        n0Var.getClass();
        jc.l.e(lVar, "storageManager");
        this.f18180o = new l0(this, lVar, hVar);
        this.f18181p = fVar2 == fVar3 ? new w1(this) : null;
        yc.k kVar4 = kVar.f16392c;
        this.f18182q = kVar4;
        d dVar = new d(this, i11);
        lVar2.getClass();
        this.f18183r = new re.h(lVar2, dVar);
        this.f18184s = new re.i(lVar2, new d(this, 1));
        new re.h(lVar2, new d(this, 2));
        lVar2.a(new d(this, 3));
        this.f18185t = new re.h(lVar2, new d(this, 4));
        yd.f fVar5 = kVarA.f16391b;
        f0 f0Var3 = kVarA.f16393d;
        h hVar2 = kVar4 instanceof h ? (h) kVar4 : null;
        if (hVar2 != null) {
            uVar = hVar2.f18186u;
            f0Var = f0Var3;
            m0Var2 = m0Var;
            kVar3 = kVar2;
        } else {
            uVar = null;
            kVar3 = kVar2;
            f0Var = f0Var3;
            m0Var2 = m0Var;
        }
        this.f18186u = new oe.u(kVar3, fVar5, f0Var, m0Var2, uVar);
        this.f18187v = !yd.d.f26173c.d(kVar3.f23804d).booleanValue() ? zc.g.f26696a : new u(lVar2, new d(this, 5));
    }

    @Override // yc.e
    public final r0 J0() {
        return (r0) this.f18185t.b();
    }

    @Override // yc.e, yc.i
    public final List L() {
        return this.f18177l.f16397h.f();
    }

    @Override // yc.w
    public final boolean O0() {
        return false;
    }

    @Override // yc.w
    public final boolean P() {
        return yd.d.f26179i.d(this.f18170e.f23804d).booleanValue();
    }

    @Override // yc.h
    public final k0 Q() {
        return this.f18179n;
    }

    @Override // bd.c, yc.e
    public final List Q0() {
        oe.k kVar = this.f18177l;
        List listN = ud.e.n(this.f18170e, kVar.f16393d);
        ArrayList arrayList = new ArrayList(vb.n.K(listN, 10));
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            arrayList.add(new a0(T0(), new me.a(this, kVar.f16397h.s((t0) it.next()), (be.e) null), zc.g.f26696a));
        }
        return arrayList;
    }

    @Override // yc.e
    public final boolean R() {
        return yd.d.f26176f.d(this.f18170e.f23804d) == wd.j.f23774f;
    }

    @Override // yc.e
    public final boolean S0() {
        return yd.d.f26178h.d(this.f18170e.f23804d).booleanValue();
    }

    @Override // yc.e
    public final Collection T() {
        return (Collection) this.f18184s.b();
    }

    @Override // yc.e
    public final boolean W() {
        return yd.d.f26182l.d(this.f18170e.f23804d).booleanValue();
    }

    @Override // yc.w
    public final boolean c0() {
        return yd.d.f26180j.d(this.f18170e.f23804d).booleanValue();
    }

    @Override // yc.i
    public final boolean d0() {
        return yd.d.f26177g.d(this.f18170e.f23804d).booleanValue();
    }

    @Override // yc.e, yc.w, yc.n
    public final ld.o f() {
        return this.f18175j;
    }

    @Override // zc.a
    public final zc.h getAnnotations() {
        return this.f18187v;
    }

    @Override // bd.e0
    public final le.o i(te.f fVar) {
        l0 l0Var = this.f18180o;
        ie.d.j(l0Var.f26119a);
        return (le.o) b0.r(l0Var.f26121c, l0.f26118e[0]);
    }

    @Override // yc.e
    public final yc.f j() {
        return this.f18176k;
    }

    @Override // yc.e
    public final bd.l j0() {
        return (bd.l) this.f18183r.b();
    }

    @Override // yc.e
    public final le.o k0() {
        return this.f18178m;
    }

    @Override // yc.e
    public final boolean l() {
        if (!yd.d.f26181k.d(this.f18170e.f23804d).booleanValue()) {
            return false;
        }
        yd.a aVar = this.f18171f;
        int i10 = aVar.f26166b;
        if (i10 >= 1) {
            if (i10 > 1) {
                return false;
            }
            int i11 = aVar.f26167c;
            if (i11 >= 4 && (i11 > 4 || aVar.f26168d > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // yc.l
    public final m0 m() {
        return this.f18172g;
    }

    public final g q() {
        ((te.l) this.f18177l.f16390a.f16380q).getClass();
        l0 l0Var = this.f18180o;
        ie.d.j(l0Var.f26119a);
        return (g) ((le.o) b0.r(l0Var.f26121c, l0.f26118e[0]));
    }

    public final se.a0 r(be.e eVar) {
        Iterator it = q().b(eVar, gd.b.f7520g).iterator();
        boolean z10 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z10) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((yc.k0) next).v0() == null) {
                    if (z10) {
                        break;
                    }
                    z10 = true;
                    obj = next;
                }
            }
        }
        obj = null;
        yc.k0 k0Var = (yc.k0) obj;
        return (se.a0) (k0Var != null ? k0Var.b() : null);
    }

    @Override // yc.e, yc.w
    public final x s() {
        return this.f18174i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(c0() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // yc.e
    public final boolean w() {
        return yd.d.f26181k.d(this.f18170e.f23804d).booleanValue() && this.f18171f.a(1, 4, 2);
    }

    @Override // yc.k
    public final yc.k y() {
        return this.f18182q;
    }
}
