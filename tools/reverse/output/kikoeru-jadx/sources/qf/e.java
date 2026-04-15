package qf;

import hf.c2;
import hf.j;
import ic.k;
import ic.n;
import ic.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jc.l;
import nf.r;
import ub.a0;
import vb.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements hf.i, f, c2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18243f = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yb.h f18244a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f18246c;
    private volatile /* synthetic */ Object state$volatile = h.f18250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f18245b = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18247d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f18248e = h.f18253d;

    public e(yb.h hVar) {
        this.f18244a = hVar;
    }

    @Override // hf.c2
    public final void a(r rVar, int i10) {
        this.f18246c = rVar;
        this.f18247d = i10;
    }

    @Override // hf.i
    public final void b(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18243f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == h.f18251b) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h.f18252c)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f18245b;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a();
            }
            this.f18248e = h.f18253d;
            this.f18245b = null;
            return;
        }
    }

    public final Object c(ac.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18243f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        c cVar2 = (c) obj;
        Object obj2 = this.f18248e;
        ArrayList<c> arrayList = this.f18245b;
        if (arrayList != null) {
            for (c cVar3 : arrayList) {
                if (cVar3 != cVar2) {
                    cVar3.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, h.f18251b);
            this.f18248e = h.f18253d;
            this.f18245b = null;
        }
        Object objG = cVar2.f18232c.g(cVar2.f18230a, cVar2.f18233d, obj2);
        ub.e eVar = cVar2.f18234e;
        return cVar2.f18233d == h.f18254e ? ((k) eVar).a(cVar) : ((n) eVar).q(objG, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(ac.c r11) throws hf.h0 {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.e.d(ac.c):java.lang.Object");
    }

    public final c e(Object obj) {
        ArrayList arrayList = this.f18245b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((c) next).f18230a == obj) {
                obj2 = next;
                break;
            }
        }
        c cVar = (c) obj2;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void f(c cVar, boolean z10) {
        Object obj = cVar.f18230a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18243f;
        if (atomicReferenceFieldUpdater.get(this) instanceof c) {
            return;
        }
        if (!z10) {
            ArrayList arrayList = this.f18245b;
            l.b(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((c) it.next()).f18230a == obj) {
                        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                    }
                }
            }
        }
        cVar.f18231b.g(obj, this, cVar.f18233d);
        if (this.f18248e != h.f18253d) {
            atomicReferenceFieldUpdater.set(this, cVar);
            return;
        }
        if (!z10) {
            ArrayList arrayList2 = this.f18245b;
            l.b(arrayList2);
            arrayList2.add(cVar);
        }
        cVar.f18236g = this.f18246c;
        cVar.f18237h = this.f18247d;
        this.f18246c = null;
        this.f18247d = -1;
    }

    public final int g(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18243f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof j)) {
                if (l.a(obj3, h.f18251b) || (obj3 instanceof c)) {
                    return 3;
                }
                if (l.a(obj3, h.f18252c)) {
                    return 2;
                }
                if (l.a(obj3, h.f18250a)) {
                    List listW = ud.b.w(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listW)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList arrayListR0 = m.r0((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListR0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            c cVarE = e(obj);
            if (cVarE != null) {
                o oVar = cVarE.f18235f;
                o oVar2 = oVar != null ? (o) oVar.g(this, cVarE.f18233d, obj2) : null;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, cVarE)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                j jVar = (j) obj3;
                this.f18248e = obj2;
                app.nekogram.translator.r rVarV = jVar.v(a0.f21526a, oVar2);
                if (rVarV == null) {
                    this.f18248e = h.f18253d;
                    return 2;
                }
                jVar.z(rVarV);
                return 0;
            }
            continue;
        }
    }
}
