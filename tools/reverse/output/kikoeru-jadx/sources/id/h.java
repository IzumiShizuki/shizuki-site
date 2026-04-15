package id;

import android.R;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import b0.d0;
import b0.w1;
import b7.b1;
import bd.f0;
import ce.j0;
import ge.q;
import ge.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jc.l;
import jd.k;
import oe.b0;
import oe.c0;
import qe.t;
import se.a0;
import se.h0;
import se.k0;
import se.n0;
import se.w;
import u3.x0;
import ud.n;
import ud.o;
import ud.p;
import vb.m;
import vb.r;
import wd.t0;
import wd.y0;
import yc.m0;
import yc.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f9506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f9508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f9509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f9510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f9511h;

    public h(yd.f fVar, f0 f0Var, yd.i iVar, h hVar, List list) {
        this.f9504a = 0;
        l.e(fVar, "strings");
        l.e(list, "contextExtensions");
        this.f9505b = fVar;
        this.f9506c = f0Var;
        this.f9507d = iVar;
        this.f9508e = hVar;
        this.f9509f = list;
        this.f9511h = new LinkedHashMap();
        k.f10844a.getClass();
        this.f9510g = jd.j.a();
    }

    public static void a(Menu menu, l2.b bVar) {
        int i10;
        int i11 = bVar.f11704a;
        int i12 = bVar.f11705b;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            i10 = R.string.copy;
        } else if (iOrdinal == 1) {
            i10 = R.string.paste;
        } else if (iOrdinal == 2) {
            i10 = R.string.cut;
        } else if (iOrdinal == 3) {
            i10 = R.string.selectAll;
        } else {
            if (iOrdinal != 4) {
                throw new j0();
            }
            i10 = Build.VERSION.SDK_INT <= 26 ? com.cnl.kikoeru.R.string.autofill : R.string.autofill;
        }
        menu.add(0, i11, i12, i10).setShowAsAction(1);
    }

    public static void c(Menu menu, l2.b bVar, ic.a aVar) {
        int i10 = bVar.f11704a;
        if (aVar != null && menu.findItem(i10) == null) {
            a(menu, bVar);
        } else {
            if (aVar != null || menu.findItem(i10) == null) {
                return;
            }
            menu.removeItem(i10);
        }
    }

    public static a0 e(a0 a0Var, w wVar) {
        vc.i iVarW = ud.e.w(a0Var);
        zc.h annotations = a0Var.getAnnotations();
        w wVarO = n.o(a0Var);
        List listK = n.k(a0Var);
        List listW = m.W(n.r(a0Var));
        ArrayList arrayList = new ArrayList(vb.n.K(listW, 10));
        Iterator it = listW.iterator();
        while (it.hasNext()) {
            arrayList.add(((n0) it.next()).b());
        }
        return n.d(iVarW, annotations, wVarO, listK, arrayList, wVar, true).z(a0Var.u());
    }

    public static final ArrayList p(t0 t0Var, h hVar) {
        List list = t0Var.f23951d;
        l.d(list, "getArgumentList(...)");
        List list2 = list;
        t0 t0VarI = ud.e.I(t0Var, ((oe.k) hVar.f9505b).f16393d);
        Iterable iterableP = t0VarI != null ? p(t0VarI, hVar) : null;
        if (iterableP == null) {
            iterableP = r.f22819a;
        }
        return m.q0(list2, iterableP);
    }

    public static h0 r(List list, zc.h hVar, k0 k0Var, yc.k kVar) {
        h0 h0VarU;
        List list2 = list;
        ArrayList arrayList = new ArrayList(vb.n.K(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((se.k) it.next()).getClass();
            if (hVar.isEmpty()) {
                h0.f19950b.getClass();
                h0VarU = h0.f19951c;
            } else {
                m0.w wVar = h0.f19950b;
                List listW = ud.b.w(new se.g(hVar));
                wVar.getClass();
                h0VarU = m0.w.u(listW);
            }
            arrayList.add(h0VarU);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m.P(arrayList2, (Iterable) it2.next());
        }
        h0.f19950b.getClass();
        return m0.w.u(arrayList2);
    }

    public static final yc.e t(h hVar, t0 t0Var, int i10) {
        oe.k kVar = (oe.k) hVar.f9505b;
        be.b bVarM = x0.m(kVar.f16391b, i10);
        df.r rVarE0 = df.m.e0(df.m.b0(t0Var, new oe.a0(2, hVar)), b0.f16350b);
        ArrayList arrayList = new ArrayList();
        Iterator it = rVarE0.f6007a.iterator();
        while (it.hasNext()) {
            arrayList.add(rVarE0.f6008b.a(it.next()));
        }
        int iX = df.m.X(df.m.b0(bVarM, c0.f16352h));
        while (arrayList.size() < iX) {
            arrayList.add(0);
        }
        return kVar.f16390a.f16375l.K(bVarM, arrayList);
    }

    @Override // ud.o, ud.p
    public void b() {
        b1 b1Var = (b1) this.f9507d;
        be.b bVar = (be.b) this.f9510g;
        HashMap map = (HashMap) this.f9506c;
        l.e(map, "arguments");
        boolean z10 = false;
        if (bVar.equals(uc.a.f21566b)) {
            Object obj = map.get(be.e.e("value"));
            s sVar = obj instanceof s ? (s) obj : null;
            if (sVar != null) {
                Object obj2 = sVar.f7527a;
                q qVar = obj2 instanceof q ? (q) obj2 : null;
                if (qVar != null) {
                    z10 = b1Var.z(qVar.f7535a.f7525a);
                }
            }
        }
        if (z10 || b1Var.z(bVar)) {
            return;
        }
        ((List) this.f9509f).add(new zc.c(((yc.e) this.f9508e).E(), map, (m0) this.f9511h));
    }

    @Override // ud.o
    public void d(be.e eVar, Object obj) {
        ((HashMap) this.f9506c).put(eVar, b1.d((b1) this.f9505b, eVar, obj));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public List f() {
        return m.G0(this.f9511h.values());
    }

    public Integer g(int i10) {
        Integer num = (Integer) ((LinkedHashMap) this.f9511h).get(Integer.valueOf(i10));
        if (num != null) {
            return num;
        }
        h hVar = (h) this.f9508e;
        if (hVar != null) {
            return hVar.g(i10);
        }
        return null;
    }

    @Override // ud.o
    public void h(be.e eVar, ge.f fVar) {
        ((HashMap) this.f9506c).put(eVar, new s(new q(fVar)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public q0 i(int i10) {
        q0 q0Var = (q0) this.f9511h.get(Integer.valueOf(i10));
        if (q0Var != null) {
            return q0Var;
        }
        h hVar = (h) this.f9506c;
        if (hVar != null) {
            return hVar.i(i10);
        }
        return null;
    }

    public boolean j(ActionMode actionMode, MenuItem menuItem) {
        l.b(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            ic.a aVar = (ic.a) this.f9507d;
            if (aVar != null) {
                aVar.b();
            }
        } else if (itemId == 1) {
            ic.a aVar2 = (ic.a) this.f9508e;
            if (aVar2 != null) {
                aVar2.b();
            }
        } else if (itemId == 2) {
            ic.a aVar3 = (ic.a) this.f9509f;
            if (aVar3 != null) {
                aVar3.b();
            }
        } else if (itemId == 3) {
            ic.a aVar4 = (ic.a) this.f9510g;
            if (aVar4 != null) {
                aVar4.b();
            }
        } else {
            if (itemId != 4) {
                return false;
            }
            ic.a aVar5 = (ic.a) this.f9511h;
            if (aVar5 != null) {
                aVar5.b();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    @Override // ud.o
    public void k(be.e eVar, be.b bVar, be.e eVar2) {
        ((HashMap) this.f9506c).put(eVar, new ge.i(bVar, eVar2));
    }

    @Override // ud.o
    public p l(be.e eVar) {
        return new w1((b1) this.f9505b, eVar, this);
    }

    public void m(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (((ic.a) this.f9507d) != null) {
            a(menu, l2.b.f11698c);
        }
        if (((ic.a) this.f9508e) != null) {
            a(menu, l2.b.f11699d);
        }
        if (((ic.a) this.f9509f) != null) {
            a(menu, l2.b.f11700e);
        }
        if (((ic.a) this.f9510g) != null) {
            a(menu, l2.b.f11701f);
        }
        if (((ic.a) this.f9511h) == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        a(menu, l2.b.f11702g);
    }

    public boolean n(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        c(menu, l2.b.f11698c, (ic.a) this.f9507d);
        c(menu, l2.b.f11699d, (ic.a) this.f9508e);
        c(menu, l2.b.f11700e, (ic.a) this.f9509f);
        c(menu, l2.b.f11701f, (ic.a) this.f9510g);
        c(menu, l2.b.f11702g, (ic.a) this.f9511h);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x034f A[PHI: r4
      0x034f: PHI (r4v10 se.a0) = (r4v8 se.a0), (r4v15 se.a0) binds: [B:146:0x0369, B:140:0x0341] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public se.a0 o(wd.t0 r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: id.h.o(wd.t0, boolean):se.a0");
    }

    @Override // ud.o
    public o q(be.b bVar, be.e eVar) {
        ArrayList arrayList = new ArrayList();
        return new ch.l(((b1) this.f9505b).C(bVar, m0.p0, arrayList), this, eVar, arrayList);
    }

    public w s(t0 t0Var) {
        oe.k kVar = (oe.k) this.f9505b;
        l.e(t0Var, "proto");
        if ((t0Var.f23950c & 2) != 2) {
            return o(t0Var, true);
        }
        String string = kVar.f16391b.getString(t0Var.f23953f);
        a0 a0VarO = o(t0Var, true);
        t0 t0VarV = ud.e.v(t0Var, kVar.f16393d);
        l.b(t0VarV);
        return kVar.f16390a.f16373j.c(t0Var, string, a0VarO, o(t0VarV, true));
    }

    public String toString() {
        String str;
        switch (this.f9504a) {
            case 2:
                StringBuilder sb = new StringBuilder();
                sb.append((String) this.f9507d);
                h hVar = (h) this.f9506c;
                if (hVar == null) {
                    str = "";
                } else {
                    str = ". Child of " + ((String) hVar.f9507d);
                }
                sb.append(str);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public h u(List list) {
        l.e(list, "typeParameters");
        h hVar = new h((yd.f) this.f9505b, (f0) this.f9506c, (yd.i) this.f9507d, this, (List) this.f9509f);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            ((LinkedHashMap) hVar.f9511h).put(Integer.valueOf(y0Var.f24046e), Integer.valueOf(y0Var.f24045d));
        }
        return hVar;
    }

    public h(d0 d0Var) {
        this.f9504a = 1;
        this.f9505b = d0Var;
        this.f9506c = p1.c.f16482e;
        this.f9507d = null;
        this.f9508e = null;
        this.f9509f = null;
        this.f9510g = null;
        this.f9511h = null;
    }

    public h(oe.k kVar, h hVar, List list, String str, String str2) {
        Map linkedHashMap;
        this.f9504a = 2;
        l.e(list, "typeParameterProtos");
        l.e(str, "debugName");
        this.f9505b = kVar;
        this.f9506c = hVar;
        this.f9507d = str;
        this.f9508e = str2;
        oe.i iVar = kVar.f16390a;
        this.f9509f = iVar.f16364a.c(new oe.a0(0, this));
        this.f9510g = iVar.f16364a.c(new oe.a0(1, this));
        if (list.isEmpty()) {
            linkedHashMap = vb.s.f22820a;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                y0 y0Var = (y0) it.next();
                linkedHashMap.put(Integer.valueOf(y0Var.f24045d), new t((oe.k) this.f9505b, y0Var, i10));
                i10++;
            }
        }
        this.f9511h = linkedHashMap;
    }

    public h(b1 b1Var, yc.e eVar, be.b bVar, List list, m0 m0Var) {
        this.f9504a = 3;
        this.f9507d = b1Var;
        this.f9508e = eVar;
        this.f9510g = bVar;
        this.f9509f = list;
        this.f9511h = m0Var;
        this.f9505b = b1Var;
        this.f9506c = new HashMap();
    }
}
