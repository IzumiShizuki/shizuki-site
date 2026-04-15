package j5;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f10325h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f10326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s4.f0 f10327j;

    @Override // j5.a
    public final void e() {
        for (j jVar : this.f10325h.values()) {
            jVar.f10308a.d(jVar.f10309b);
        }
    }

    @Override // j5.a
    public final void g() {
        for (j jVar : this.f10325h.values()) {
            jVar.f10308a.f(jVar.f10309b);
        }
    }

    @Override // j5.a
    public void k() {
        Iterator it = this.f10325h.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).f10308a.k();
        }
    }

    @Override // j5.a
    public void q() {
        HashMap map = this.f10325h;
        for (j jVar : map.values()) {
            a aVar = jVar.f10308a;
            i iVar = jVar.f10310c;
            aVar.p(jVar.f10309b);
            aVar.s(iVar);
            aVar.r(iVar);
        }
        map.clear();
    }

    public abstract d0 u(Object obj, d0 d0Var);

    public abstract void x(Object obj, a aVar, m4.i1 i1Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j5.e0, j5.h] */
    public final void y(final Object obj, a aVar) {
        HashMap map = this.f10325h;
        p4.c.c(!map.containsKey(obj));
        ?? r12 = new e0() { // from class: j5.h
            @Override // j5.e0
            public final void a(a aVar2, m4.i1 i1Var) {
                this.f10289a.x(obj, aVar2, i1Var);
            }
        };
        i iVar = new i(this, obj);
        map.put(obj, new j(aVar, r12, iVar));
        Handler handler = this.f10326i;
        handler.getClass();
        aVar.getClass();
        ah.j jVar = aVar.f10204c;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) jVar.f392d;
        i0 i0Var = new i0();
        i0Var.f10303a = handler;
        i0Var.f10304b = iVar;
        copyOnWriteArrayList.add(i0Var);
        Handler handler2 = this.f10326i;
        handler2.getClass();
        b5.q qVar = aVar.f10205d;
        qVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = qVar.f1595c;
        b5.p pVar = new b5.p();
        pVar.f1591a = handler2;
        pVar.f1592b = iVar;
        copyOnWriteArrayList2.add(pVar);
        s4.f0 f0Var = this.f10327j;
        w4.k kVar = this.f10208g;
        p4.c.j(kVar);
        aVar.l(r12, f0Var, kVar);
        if (this.f10203b.isEmpty()) {
            aVar.d(r12);
        }
    }

    public long v(long j10, Object obj) {
        return j10;
    }

    public int w(int i10, Object obj) {
        return i10;
    }
}
