package h7;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.p;
import androidx.lifecycle.w0;
import androidx.lifecycle.x;
import c4.n;
import e7.a0;
import e7.d0;
import e7.m;
import e7.m0;
import e7.n0;
import e7.u;
import e7.w;
import j2.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import jc.c0;
import jc.l;
import lf.b1;
import lf.k0;
import lf.o0;
import lf.p0;
import o.v0;
import vb.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f8159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ca.b f8160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f8161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f8162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle[] f8163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vb.j f8164f = new vb.j();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b1 f8165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b1 f8166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k0 f8167i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f8168j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f8169k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f8170l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f8171m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x f8172n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f8173o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f8174p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p f8175q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final eg.b f8176r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n0 f8177s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f8178t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ic.k f8179u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e f8180v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f8181w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8182x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f8183y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o0 f8184z;

    public g(a0 a0Var, ca.b bVar) {
        this.f8159a = a0Var;
        this.f8160b = bVar;
        r rVar = r.f22819a;
        this.f8165g = p0.c(rVar);
        b1 b1VarC = p0.c(rVar);
        this.f8166h = b1VarC;
        this.f8167i = new k0(b1VarC);
        this.f8168j = new LinkedHashMap();
        this.f8169k = new LinkedHashMap();
        this.f8170l = new LinkedHashMap();
        this.f8171m = new LinkedHashMap();
        this.f8174p = new ArrayList();
        this.f8175q = p.f795b;
        this.f8176r = new eg.b(1, this);
        this.f8177s = new n0();
        this.f8178t = new LinkedHashMap();
        this.f8181w = new LinkedHashMap();
        this.f8183y = new ArrayList();
        this.f8184z = p0.a((1 & 1) != 0 ? 0 : 1, (1 & 2) == 0 ? 16 : 0, kf.a.f11337b);
    }

    public static u d(int i10, u uVar, u uVar2, boolean z10) {
        if (uVar.f6400b.f8187a == i10 && (uVar2 == null || (uVar.equals(uVar2) && l.a(uVar.f6401c, uVar2.f6401c)))) {
            return uVar;
        }
        w wVar = uVar instanceof w ? (w) uVar : null;
        if (wVar == null) {
            wVar = uVar.f6401c;
            l.b(wVar);
        }
        return wVar.f6409f.t(i10, wVar, uVar2, z10);
    }

    public static /* synthetic */ void n(g gVar, e7.j jVar) {
        gVar.m(jVar, false, new vb.j());
    }

    public final void a(u uVar, Bundle bundle, e7.j jVar, List list) {
        Object objPrevious;
        Object objPrevious2;
        n nVar = this.f8159a.f6300c;
        u uVar2 = jVar.f6334b;
        boolean z10 = uVar2 instanceof e7.e;
        vb.j jVar2 = this.f8164f;
        if (!z10) {
            while (!jVar2.isEmpty() && (((e7.j) jVar2.last()).f6334b instanceof e7.e) && l(true, ((e7.j) jVar2.last()).f6334b.f6400b.f8187a, false)) {
            }
        }
        vb.j<e7.j> jVar3 = new vb.j();
        Object obj = null;
        if (uVar instanceof w) {
            u uVar3 = uVar2;
            do {
                l.b(uVar3);
                uVar3 = uVar3.f6401c;
                if (uVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious2 = listIterator.previous();
                            if (l.a(((e7.j) objPrevious2).f6334b, uVar3)) {
                                break;
                            }
                        } else {
                            objPrevious2 = null;
                            break;
                        }
                    }
                    e7.j jVarC = (e7.j) objPrevious2;
                    if (jVarC == null) {
                        jVarC = pe.d.C(nVar, uVar3, bundle, h(), this.f8173o);
                    }
                    jVar3.addFirst(jVarC);
                    if (!jVar2.isEmpty() && ((e7.j) jVar2.last()).f6334b == uVar3) {
                        n(this, (e7.j) jVar2.last());
                    }
                }
                if (uVar3 == null) {
                    break;
                }
            } while (uVar3 != uVar);
        }
        u uVar4 = jVar3.isEmpty() ? uVar2 : ((e7.j) jVar3.first()).f6334b;
        while (uVar4 != null && c(uVar4.f6400b.f8187a, uVar4) != uVar4) {
            uVar4 = uVar4.f6401c;
            if (uVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious = listIterator2.previous();
                        if (l.a(((e7.j) objPrevious).f6334b, uVar4)) {
                            break;
                        }
                    } else {
                        objPrevious = null;
                        break;
                    }
                }
                e7.j jVarC2 = (e7.j) objPrevious;
                if (jVarC2 == null) {
                    jVarC2 = pe.d.C(nVar, uVar4, uVar4.a(bundle2), h(), this.f8173o);
                }
                jVar3.addFirst(jVarC2);
            }
        }
        if (!jVar3.isEmpty()) {
            uVar2 = ((e7.j) jVar3.first()).f6334b;
        }
        while (!jVar2.isEmpty() && (((e7.j) jVar2.last()).f6334b instanceof w)) {
            u uVar5 = ((e7.j) jVar2.last()).f6334b;
            l.c(uVar5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((v0) ((w) uVar5).f6409f.f8199d).d(uVar2.f6400b.f8187a) != null) {
                break;
            } else {
                n(this, (e7.j) jVar2.last());
            }
        }
        e7.j jVar4 = (e7.j) jVar2.l();
        if (jVar4 == null) {
            jVar4 = (e7.j) jVar3.l();
        }
        if (!l.a(jVar4 != null ? jVar4.f6334b : null, this.f8161c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object objPrevious3 = listIterator3.previous();
                u uVar6 = ((e7.j) objPrevious3).f6334b;
                w wVar = this.f8161c;
                l.b(wVar);
                if (l.a(uVar6, wVar)) {
                    obj = objPrevious3;
                    break;
                }
            }
            e7.j jVarC3 = (e7.j) obj;
            if (jVarC3 == null) {
                w wVar2 = this.f8161c;
                l.b(wVar2);
                w wVar3 = this.f8161c;
                l.b(wVar3);
                jVarC3 = pe.d.C(nVar, wVar2, wVar3.a(bundle), h(), this.f8173o);
            }
            jVar3.addFirst(jVarC3);
        }
        for (e7.j jVar5 : jVar3) {
            Object obj2 = this.f8178t.get(this.f8177s.b(jVar5.f6334b.f6399a));
            if (obj2 == null) {
                throw new IllegalStateException(h0.n(new StringBuilder("NavigatorBackStack for "), uVar.f6399a, " should already be created").toString());
            }
            ((e7.l) obj2).a(jVar5);
        }
        jVar2.addAll(jVar3);
        jVar2.addLast(jVar);
        for (e7.j jVar6 : vb.m.r0(jVar3, jVar)) {
            w wVar4 = jVar6.f6334b.f6401c;
            if (wVar4 != null) {
                j(jVar6, e(wVar4.f6400b.f8187a));
            }
        }
    }

    public final boolean b() {
        vb.j jVar;
        while (true) {
            jVar = this.f8164f;
            if (jVar.isEmpty() || !(((e7.j) jVar.last()).f6334b instanceof w)) {
                break;
            }
            n(this, (e7.j) jVar.last());
        }
        e7.j jVar2 = (e7.j) jVar.n();
        ArrayList arrayList = this.f8183y;
        if (jVar2 != null) {
            arrayList.add(jVar2);
        }
        this.f8182x++;
        r();
        int i10 = this.f8182x - 1;
        this.f8182x = i10;
        if (i10 == 0) {
            ArrayList<e7.j> arrayListH0 = vb.m.H0(arrayList);
            arrayList.clear();
            for (e7.j jVar3 : arrayListH0) {
                for (na.k kVar : vb.m.G0(this.f8174p)) {
                    u uVar = jVar3.f6334b;
                    jVar3.f6340h.a();
                    kVar.a(this.f8159a, uVar);
                }
                this.f8184z.j(jVar3);
            }
            ArrayList arrayListH02 = vb.m.H0(jVar);
            b1 b1Var = this.f8165g;
            b1Var.getClass();
            b1Var.m(null, arrayListH02);
            ArrayList arrayListO = o();
            b1 b1Var2 = this.f8166h;
            b1Var2.getClass();
            b1Var2.m(null, arrayListO);
        }
        return jVar2 != null;
    }

    public final u c(int i10, u uVar) {
        u uVar2;
        w wVar = this.f8161c;
        if (wVar == null) {
            return null;
        }
        if (wVar.f6400b.f8187a == i10) {
            if (uVar == null) {
                return wVar;
            }
            if (l.a(wVar, uVar) && uVar.f6401c == null) {
                return this.f8161c;
            }
        }
        e7.j jVar = (e7.j) this.f8164f.n();
        if (jVar == null || (uVar2 = jVar.f6334b) == null) {
            uVar2 = this.f8161c;
            l.b(uVar2);
        }
        return d(i10, uVar2, uVar, false);
    }

    public final e7.j e(int i10) {
        Object objPrevious;
        vb.j jVar = this.f8164f;
        ListIterator<E> listIterator = jVar.listIterator(jVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((e7.j) objPrevious).f6334b.f6400b.f8187a == i10) {
                break;
            }
        }
        e7.j jVar2 = (e7.j) objPrevious;
        if (jVar2 != null) {
            return jVar2;
        }
        StringBuilder sbO = h0.o(i10, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbO.append(f());
        throw new IllegalArgumentException(sbO.toString().toString());
    }

    public final u f() {
        e7.j jVar = (e7.j) this.f8164f.n();
        if (jVar != null) {
            return jVar.f6334b;
        }
        return null;
    }

    public final w g() {
        w wVar = this.f8161c;
        if (wVar == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        l.c(wVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return wVar;
    }

    public final p h() {
        return this.f8172n == null ? p.f796c : this.f8175q;
    }

    public final w i() {
        u uVar;
        e7.j jVar = (e7.j) this.f8164f.n();
        if (jVar == null || (uVar = jVar.f6334b) == null) {
            uVar = this.f8161c;
            l.b(uVar);
        }
        w wVar = uVar instanceof w ? (w) uVar : null;
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = uVar.f6401c;
        l.b(wVar2);
        return wVar2;
    }

    public final void j(e7.j jVar, e7.j jVar2) {
        this.f8168j.put(jVar, jVar2);
        LinkedHashMap linkedHashMap = this.f8169k;
        if (linkedHashMap.get(jVar2) == null) {
            linkedHashMap.put(jVar2, new a());
        }
        Object obj = linkedHashMap.get(jVar2);
        l.b(obj);
        ((a) obj).f8132a.incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(e7.u r22, android.os.Bundle r23, e7.d0 r24) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.g.k(e7.u, android.os.Bundle, e7.d0):void");
    }

    public final boolean l(boolean z10, int i10, boolean z11) {
        u uVar;
        g gVar;
        boolean z12;
        vb.j jVar = this.f8164f;
        final int i11 = 0;
        if (jVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = vb.m.v0(jVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                uVar = null;
                break;
            }
            uVar = ((e7.j) it.next()).f6334b;
            String str = uVar.f6399a;
            i iVar = uVar.f6400b;
            m0 m0VarB = this.f8177s.b(str);
            if (z10 || iVar.f8187a != i10) {
                arrayList.add(m0VarB);
            }
            if (iVar.f8187a == i10) {
                break;
            }
        }
        if (uVar == null) {
            int i12 = u.f6398e;
            String str2 = "Ignoring popBackStack to destination " + e7.g.a(this.f8159a.f6300c, i10) + " as it was not found on the current back stack";
            l.e(str2, "message");
            Log.i("NavController", str2);
            return false;
        }
        jc.u uVar2 = new jc.u();
        vb.j jVar2 = new vb.j();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                gVar = this;
                z12 = z11;
                break;
            }
            m0 m0Var = (m0) it2.next();
            jc.u uVar3 = new jc.u();
            e7.j jVar3 = (e7.j) jVar.last();
            gVar = this;
            z12 = z11;
            e eVar = new e(uVar3, uVar2, gVar, z12, jVar2);
            l.e(m0Var, "navigator");
            l.e(jVar3, "popUpTo");
            gVar.f8180v = eVar;
            m0Var.e(jVar3, z12);
            gVar.f8180v = null;
            if (!uVar3.f10834a) {
                break;
            }
            z11 = z12;
        }
        if (z12) {
            final int i13 = 1;
            LinkedHashMap linkedHashMap = gVar.f8170l;
            if (!z10) {
                df.e eVar2 = new df.e(new df.f(df.m.b0(uVar, new g1.d(5)), new ic.k(this) { // from class: h7.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f8158b;

                    {
                        this.f8158b = this;
                    }

                    @Override // ic.k
                    public final Object a(Object obj) {
                        boolean zContainsKey;
                        u uVar4 = (u) obj;
                        switch (i11) {
                            case 0:
                                l.e(uVar4, "destination");
                                zContainsKey = this.f8158b.f8170l.containsKey(Integer.valueOf(uVar4.f6400b.f8187a));
                                break;
                            default:
                                l.e(uVar4, "destination");
                                zContainsKey = this.f8158b.f8170l.containsKey(Integer.valueOf(uVar4.f6400b.f8187a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, 1), (byte) 0);
                while (eVar2.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((u) eVar2.next()).f6400b.f8187a);
                    e7.k kVar = (e7.k) jVar2.l();
                    linkedHashMap.put(numValueOf, kVar != null ? (String) kVar.f6342a.f16600b : null);
                }
            }
            if (!jVar2.isEmpty()) {
                p4.p pVar = ((e7.k) jVar2.first()).f6342a;
                df.e eVar3 = new df.e(new df.f(df.m.b0(c(pVar.f16599a, null), new g1.d(6)), new ic.k(this) { // from class: h7.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f8158b;

                    {
                        this.f8158b = this;
                    }

                    @Override // ic.k
                    public final Object a(Object obj) {
                        boolean zContainsKey;
                        u uVar4 = (u) obj;
                        switch (i13) {
                            case 0:
                                l.e(uVar4, "destination");
                                zContainsKey = this.f8158b.f8170l.containsKey(Integer.valueOf(uVar4.f6400b.f8187a));
                                break;
                            default:
                                l.e(uVar4, "destination");
                                zContainsKey = this.f8158b.f8170l.containsKey(Integer.valueOf(uVar4.f6400b.f8187a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, 1), (byte) 0);
                while (eVar3.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((u) eVar3.next()).f6400b.f8187a), (String) pVar.f16600b);
                }
                if (linkedHashMap.values().contains((String) pVar.f16600b)) {
                    gVar.f8171m.put((String) pVar.f16600b, jVar2);
                }
            }
        }
        gVar.f8160b.b();
        return uVar2.f10834a;
    }

    public final void m(e7.j jVar, boolean z10, vb.j jVar2) {
        m mVar;
        k0 k0Var;
        Set set;
        l.e(jVar, "popUpTo");
        vb.j jVar3 = this.f8164f;
        e7.j jVar4 = (e7.j) jVar3.last();
        if (!l.a(jVar4, jVar)) {
            throw new IllegalStateException(("Attempted to pop " + jVar.f6334b + ", which is not the top of the back stack (" + jVar4.f6334b + ')').toString());
        }
        vb.m.u0(jVar3);
        e7.l lVar = (e7.l) this.f8178t.get(this.f8177s.b(jVar4.f6334b.f6399a));
        boolean z11 = true;
        if ((lVar == null || (k0Var = lVar.f6358f) == null || (set = (Set) k0Var.f12434a.getValue()) == null || !set.contains(jVar4)) && !this.f8169k.containsKey(jVar4)) {
            z11 = false;
        }
        p pVar = jVar4.f6340h.f8143j.f826d;
        p pVar2 = p.f796c;
        if (pVar.compareTo(pVar2) >= 0) {
            if (z10) {
                jVar4.g(pVar2);
                jVar2.addFirst(new e7.k(jVar4));
            }
            if (z11) {
                jVar4.g(pVar2);
            } else {
                jVar4.g(p.f794a);
                q(jVar4);
            }
        }
        if (z10 || z11 || (mVar = this.f8173o) == null) {
            return;
        }
        String str = jVar4.f6338f;
        l.e(str, "backStackEntryId");
        w0 w0Var = (w0) mVar.f6361b.remove(str);
        if (w0Var != null) {
            w0Var.a();
        }
    }

    public final ArrayList o() {
        p pVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f8178t.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            pVar = p.f797d;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((e7.l) it.next()).f6358f.f12434a.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                e7.j jVar = (e7.j) obj;
                if (!arrayList.contains(jVar) && jVar.f6340h.f8144k.compareTo(pVar) < 0) {
                    arrayList2.add(obj);
                }
            }
            vb.m.P(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f8164f) {
            e7.j jVar2 = (e7.j) obj2;
            if (!arrayList.contains(jVar2) && jVar2.f6340h.f8144k.compareTo(pVar) >= 0) {
                arrayList3.add(obj2);
            }
        }
        vb.m.P(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((e7.j) obj3).f6334b instanceof w)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final boolean p(int i10, Bundle bundle, d0 d0Var) {
        u uVarG;
        e7.j jVar;
        u uVar;
        Bundle bundle2;
        Integer numValueOf = Integer.valueOf(i10);
        LinkedHashMap linkedHashMap = this.f8170l;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i10));
        Collection collectionValues = linkedHashMap.values();
        l.e(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (l.a((String) it.next(), str)) {
                it.remove();
            }
        }
        vb.j<e7.k> jVar2 = (vb.j) c0.a(this.f8171m).remove(str);
        n nVar = this.f8159a.f6300c;
        ArrayList arrayList = new ArrayList();
        e7.j jVar3 = (e7.j) this.f8164f.n();
        if (jVar3 == null || (uVarG = jVar3.f6334b) == null) {
            uVarG = g();
        }
        if (jVar2 != null) {
            for (e7.k kVar : jVar2) {
                p4.p pVar = kVar.f6342a;
                p4.p pVar2 = kVar.f6342a;
                u uVarD = d(pVar.f16599a, uVarG, null, true);
                if (uVarD == null) {
                    int i11 = u.f6398e;
                    throw new IllegalStateException(("Restore State failed: destination " + e7.g.a(nVar, pVar2.f16599a) + " cannot be found from the current destination " + uVarG).toString());
                }
                p pVarH = h();
                m mVar = this.f8173o;
                l.e(nVar, "context");
                l.e(pVarH, "hostLifecycleState");
                Bundle bundle3 = (Bundle) pVar2.f16601c;
                if (bundle3 != null) {
                    Context context = nVar.f3388a;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                String str2 = (String) pVar2.f16600b;
                Bundle bundle4 = (Bundle) pVar2.f16602d;
                l.e(str2, "id");
                arrayList.add(new e7.j(nVar, uVarD, bundle2, pVarH, mVar, str2, bundle4));
                uVarG = uVarD;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList<e7.j> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((e7.j) obj).f6334b instanceof w)) {
                arrayList3.add(obj);
            }
        }
        for (e7.j jVar4 : arrayList3) {
            List list = (List) vb.m.i0(arrayList2);
            if (l.a((list == null || (jVar = (e7.j) vb.m.h0(list)) == null || (uVar = jVar.f6334b) == null) ? null : uVar.f6399a, jVar4.f6334b.f6399a)) {
                list.add(jVar4);
            } else {
                arrayList2.add(ud.b.A(jVar4));
            }
        }
        jc.u uVar2 = new jc.u();
        for (List list2 : arrayList2) {
            m0 m0VarB = this.f8177s.b(((e7.j) vb.m.Y(list2)).f6334b.f6399a);
            ArrayList arrayList4 = arrayList;
            this.f8179u = new e.b(uVar2, arrayList4, new jc.w(), this, bundle, 1);
            m0VarB.d(list2, d0Var);
            this.f8179u = null;
            arrayList = arrayList4;
        }
        return uVar2.f10834a;
    }

    public final void q(e7.j jVar) {
        l.e(jVar, "child");
        e7.j jVar2 = (e7.j) this.f8168j.remove(jVar);
        if (jVar2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f8169k;
        a aVar = (a) linkedHashMap.get(jVar2);
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.f8132a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            e7.l lVar = (e7.l) this.f8178t.get(this.f8177s.b(jVar2.f6334b.f6399a));
            if (lVar != null) {
                lVar.c(jVar2);
            }
            linkedHashMap.remove(jVar2);
        }
    }

    public final void r() {
        a aVar;
        k0 k0Var;
        Set set;
        ArrayList<e7.j> arrayListH0 = vb.m.H0(this.f8164f);
        if (arrayListH0.isEmpty()) {
            return;
        }
        ArrayList arrayListA = ud.b.A(((e7.j) vb.m.h0(arrayListH0)).f6334b);
        ArrayList arrayList = new ArrayList();
        if (vb.m.h0(arrayListA) instanceof e7.e) {
            Iterator it = vb.m.v0(arrayListH0).iterator();
            while (it.hasNext()) {
                u uVar = ((e7.j) it.next()).f6334b;
                arrayList.add(uVar);
                if (!(uVar instanceof e7.e) && !(uVar instanceof w)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (e7.j jVar : vb.m.v0(arrayListH0)) {
            p pVar = jVar.f6340h.f8144k;
            u uVar2 = jVar.f6334b;
            u uVar3 = (u) vb.m.a0(arrayListA);
            p pVar2 = p.f798e;
            p pVar3 = p.f797d;
            if (uVar3 != null && uVar3.f6400b.f8187a == uVar2.f6400b.f8187a) {
                if (pVar != pVar2) {
                    e7.l lVar = (e7.l) this.f8178t.get(this.f8177s.b(jVar.f6334b.f6399a));
                    if (l.a((lVar == null || (k0Var = lVar.f6358f) == null || (set = (Set) k0Var.f12434a.getValue()) == null) ? null : Boolean.valueOf(set.contains(jVar)), Boolean.TRUE) || ((aVar = (a) this.f8169k.get(jVar)) != null && aVar.f8132a.get() == 0)) {
                        map.put(jVar, pVar3);
                    } else {
                        map.put(jVar, pVar2);
                    }
                }
                u uVar4 = (u) vb.m.a0(arrayList);
                if (uVar4 != null && uVar4.f6400b.f8187a == uVar2.f6400b.f8187a) {
                    vb.m.t0(arrayList);
                }
                vb.m.t0(arrayListA);
                w wVar = uVar2.f6401c;
                if (wVar != null) {
                    arrayListA.add(wVar);
                }
            } else if (arrayList.isEmpty() || uVar2.f6400b.f8187a != ((u) vb.m.Y(arrayList)).f6400b.f8187a) {
                jVar.g(p.f796c);
            } else {
                u uVar5 = (u) vb.m.t0(arrayList);
                if (pVar == pVar2) {
                    jVar.g(pVar3);
                } else if (pVar != pVar3) {
                    map.put(jVar, pVar3);
                }
                w wVar2 = uVar5.f6401c;
                if (wVar2 != null && !arrayList.contains(wVar2)) {
                    arrayList.add(wVar2);
                }
            }
        }
        for (e7.j jVar2 : arrayListH0) {
            p pVar4 = (p) map.get(jVar2);
            if (pVar4 != null) {
                jVar2.g(pVar4);
            } else {
                jVar2.f6340h.b();
            }
        }
    }
}
