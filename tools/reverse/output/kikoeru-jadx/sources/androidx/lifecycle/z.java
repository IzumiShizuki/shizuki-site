package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import lf.b1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n.a f825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b1 f832j;

    public z(x xVar, boolean z10) {
        super(0);
        this.f824b = z10;
        this.f825c = new n.a();
        p pVar = p.f795b;
        this.f826d = pVar;
        this.f831i = new ArrayList();
        this.f827e = new WeakReference(xVar);
        this.f832j = lf.p0.c(pVar);
    }

    public final p B1(w wVar) {
        HashMap map = this.f825c.f15224e;
        n.c cVar = map.containsKey(wVar) ? ((n.c) map.get(wVar)).f15231d : null;
        p pVar = cVar != null ? cVar.f15229b.f822a : null;
        ArrayList arrayList = this.f831i;
        p pVar2 = arrayList.isEmpty() ? null : (p) arrayList.get(arrayList.size() - 1);
        p pVar3 = this.f826d;
        jc.l.e(pVar3, "state1");
        if (pVar == null || pVar.compareTo(pVar3) >= 0) {
            pVar = pVar3;
        }
        return (pVar2 == null || pVar2.compareTo(pVar) >= 0) ? pVar : pVar2;
    }

    public final void C1(String str) {
        if (this.f824b) {
            m.a.W().f12629b.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(q.t0.D("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void D1(o oVar) {
        jc.l.e(oVar, "event");
        C1("handleLifecycleEvent");
        E1(oVar.a());
    }

    public final void E1(p pVar) {
        if (this.f826d == pVar) {
            return;
        }
        x xVar = (x) this.f827e.get();
        p pVar2 = this.f826d;
        jc.l.e(pVar2, "current");
        jc.l.e(pVar, "next");
        p pVar3 = p.f795b;
        p pVar4 = p.f794a;
        if (pVar2 == pVar3 && pVar == pVar4) {
            throw new IllegalStateException(("State must be at least '" + p.f796c + "' to be moved to '" + pVar + "' in component " + xVar).toString());
        }
        if (pVar2 == pVar4 && pVar2 != pVar) {
            throw new IllegalStateException(("State is '" + pVar4 + "' and cannot be moved to `" + pVar + "` in component " + xVar).toString());
        }
        this.f826d = pVar;
        if (this.f829g || this.f828f != 0) {
            this.f830h = true;
            return;
        }
        this.f829g = true;
        G1();
        this.f829g = false;
        if (this.f826d == pVar4) {
            this.f825c = new n.a();
        }
    }

    public final void F1(p pVar) {
        jc.l.e(pVar, "state");
        C1("setCurrentState");
        E1(pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r12.f830h = false;
        r12.f832j.l(r12.f826d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G1() {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.z.G1():void");
    }

    @Override // androidx.lifecycle.q
    public final void W0(w wVar) {
        v hVar;
        y yVar;
        x xVar;
        jc.l.e(wVar, "observer");
        C1("addObserver");
        p pVar = this.f826d;
        p pVar2 = p.f794a;
        if (pVar != pVar2) {
            pVar2 = p.f795b;
        }
        y yVar2 = new y();
        HashMap map = a0.f750a;
        boolean z10 = wVar instanceof v;
        boolean z11 = wVar instanceof f;
        if (z10 && z11) {
            hVar = new h((f) wVar, (v) wVar);
        } else if (z11) {
            hVar = new h((f) wVar, (v) null);
        } else if (z10) {
            hVar = (v) wVar;
        } else {
            Class<?> cls = wVar.getClass();
            if (a0.b(cls) == 2) {
                Object obj = a0.f751b.get(cls);
                jc.l.b(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    a0.a((Constructor) list.get(0), wVar);
                    throw null;
                }
                int size = list.size();
                j[] jVarArr = new j[size];
                if (size > 0) {
                    a0.a((Constructor) list.get(0), wVar);
                    throw null;
                }
                hVar = new e(i, jVarArr);
            } else {
                hVar = new h(wVar);
            }
        }
        yVar2.f823b = hVar;
        yVar2.f822a = pVar2;
        n.a aVar = this.f825c;
        n.c cVar = (n.c) aVar.f15224e.get(wVar);
        if (cVar != null) {
            yVar = cVar.f15229b;
        } else {
            HashMap map2 = aVar.f15224e;
            n.c cVar2 = new n.c(wVar, yVar2);
            aVar.f15223d++;
            n.c cVar3 = aVar.f15221b;
            if (cVar3 == null) {
                aVar.f15220a = cVar2;
                aVar.f15221b = cVar2;
            } else {
                cVar3.f15230c = cVar2;
                cVar2.f15231d = cVar3;
                aVar.f15221b = cVar2;
            }
            map2.put(wVar, cVar2);
            yVar = null;
        }
        if (yVar == null && (xVar = (x) this.f827e.get()) != null) {
            i = (this.f828f != 0 || this.f829g) ? 1 : 0;
            p pVarB1 = B1(wVar);
            this.f828f++;
            while (yVar2.f822a.compareTo(pVarB1) < 0 && this.f825c.f15224e.containsKey(wVar)) {
                p pVar3 = yVar2.f822a;
                ArrayList arrayList = this.f831i;
                arrayList.add(pVar3);
                m mVar = o.Companion;
                p pVar4 = yVar2.f822a;
                mVar.getClass();
                jc.l.e(pVar4, "state");
                int iOrdinal = pVar4.ordinal();
                o oVar = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : o.ON_RESUME : o.ON_START : o.ON_CREATE;
                if (oVar == null) {
                    throw new IllegalStateException("no event up from " + yVar2.f822a);
                }
                yVar2.a(xVar, oVar);
                arrayList.remove(arrayList.size() - 1);
                pVarB1 = B1(wVar);
            }
            if (i == 0) {
                G1();
            }
            this.f828f--;
        }
    }

    @Override // androidx.lifecycle.q
    public final p a1() {
        return this.f826d;
    }

    @Override // androidx.lifecycle.q
    public final void q1(w wVar) {
        jc.l.e(wVar, "observer");
        C1("removeObserver");
        n.a aVar = this.f825c;
        WeakHashMap weakHashMap = aVar.f15222c;
        HashMap map = aVar.f15224e;
        n.c cVar = (n.c) map.get(wVar);
        if (cVar != null) {
            aVar.f15223d--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((n.e) it.next()).a(cVar);
                }
            }
            n.c cVar2 = cVar.f15231d;
            if (cVar2 != null) {
                cVar2.f15230c = cVar.f15230c;
            } else {
                aVar.f15220a = cVar.f15230c;
            }
            n.c cVar3 = cVar.f15230c;
            if (cVar3 != null) {
                cVar3.f15231d = cVar2;
            } else {
                aVar.f15221b = cVar2;
            }
            cVar.f15230c = null;
            cVar.f15231d = null;
        }
        map.remove(wVar);
    }
}
