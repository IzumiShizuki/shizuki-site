package j5;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10202a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f10203b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ah.j f10204c = new ah.j(new CopyOnWriteArrayList(), 0, (d0) null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b5.q f10205d = new b5.q(new CopyOnWriteArrayList(), 0, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Looper f10206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m4.i1 f10207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w4.k f10208g;

    public boolean a(m4.i0 i0Var) {
        return false;
    }

    public final ah.j b(d0 d0Var) {
        return new ah.j((CopyOnWriteArrayList) this.f10204c.f392d, 0, d0Var);
    }

    public abstract b0 c(d0 d0Var, n5.f fVar, long j10);

    public final void d(e0 e0Var) {
        HashSet hashSet = this.f10203b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(e0Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        e();
    }

    public final void f(e0 e0Var) {
        this.f10206e.getClass();
        HashSet hashSet = this.f10203b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(e0Var);
        if (zIsEmpty) {
            g();
        }
    }

    public m4.i1 h() {
        return null;
    }

    public abstract m4.i0 i();

    public boolean j() {
        return true;
    }

    public abstract void k();

    public final void l(e0 e0Var, s4.f0 f0Var, w4.k kVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f10206e;
        p4.c.c(looper == null || looper == looperMyLooper);
        this.f10208g = kVar;
        m4.i1 i1Var = this.f10207f;
        this.f10202a.add(e0Var);
        if (this.f10206e == null) {
            this.f10206e = looperMyLooper;
            this.f10203b.add(e0Var);
            m(f0Var);
        } else if (i1Var != null) {
            f(e0Var);
            e0Var.a(this, i1Var);
        }
    }

    public abstract void m(s4.f0 f0Var);

    public final void n(m4.i1 i1Var) {
        this.f10207f = i1Var;
        Iterator it = this.f10202a.iterator();
        while (it.hasNext()) {
            ((e0) it.next()).a(this, i1Var);
        }
    }

    public abstract void o(b0 b0Var);

    public final void p(e0 e0Var) {
        ArrayList arrayList = this.f10202a;
        arrayList.remove(e0Var);
        if (!arrayList.isEmpty()) {
            d(e0Var);
            return;
        }
        this.f10206e = null;
        this.f10207f = null;
        this.f10208g = null;
        this.f10203b.clear();
        q();
    }

    public abstract void q();

    public final void r(b5.r rVar) {
        CopyOnWriteArrayList<b5.p> copyOnWriteArrayList = this.f10205d.f1595c;
        for (b5.p pVar : copyOnWriteArrayList) {
            if (pVar.f1592b == rVar) {
                copyOnWriteArrayList.remove(pVar);
            }
        }
    }

    public final void s(j0 j0Var) {
        CopyOnWriteArrayList<i0> copyOnWriteArrayList = (CopyOnWriteArrayList) this.f10204c.f392d;
        for (i0 i0Var : copyOnWriteArrayList) {
            if (i0Var.f10304b == j0Var) {
                copyOnWriteArrayList.remove(i0Var);
            }
        }
    }

    public void e() {
    }

    public void g() {
    }

    public void t(m4.i0 i0Var) {
    }
}
