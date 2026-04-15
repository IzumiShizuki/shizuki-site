package n7;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nf.d f15575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yb.h f15576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Executor f15577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f15578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t f15579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f15580f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15582h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m0.w f15581g = new m0.w(new d.i0(0, this, v.class, "onClosed", "onClosed()V", 0, 0, 8));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ThreadLocal f15583i = new ThreadLocal();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f15584j = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15585k = true;

    public final void a() {
        if (this.f15582h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public List b(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(vb.w.t(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(g8.a.D((pc.c) entry.getKey()), entry.getValue());
        }
        return vb.r.f22819a;
    }

    public abstract k c();

    public c4.g d() {
        throw new ub.j();
    }

    public final hf.y e() {
        nf.d dVar = this.f15575a;
        if (dVar != null) {
            return dVar;
        }
        jc.l.k("coroutineScope");
        throw null;
    }

    public final k f() {
        k kVar = this.f15580f;
        if (kVar != null) {
            return kVar;
        }
        jc.l.k("internalTracker");
        throw null;
    }

    public final a8.b g() {
        t tVar = this.f15579e;
        if (tVar == null) {
            jc.l.k("connectionManager");
            throw null;
        }
        a8.b bVarC = tVar.c();
        if (bVarC != null) {
            return bVarC;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public Set h() {
        return vb.m.K0(new ArrayList(vb.n.K(vb.t.f22821a, 10)));
    }

    public LinkedHashMap i() {
        int iT = vb.w.t(vb.n.K(vb.t.f22821a, 10));
        if (iT < 16) {
            iT = 16;
        }
        return new LinkedHashMap(iT);
    }

    public final boolean j() {
        t tVar = this.f15579e;
        if (tVar != null) {
            return tVar.c() != null;
        }
        jc.l.k("connectionManager");
        throw null;
    }

    public final boolean k() {
        return m() && g().getWritableDatabase().T();
    }

    public final void l() {
        g().getWritableDatabase().I();
        if (k()) {
            return;
        }
        k kVarF = f();
        kVarF.f15519b.f(kVarF.f15522e, kVarF.f15523f);
    }

    public final boolean m() {
        t tVar = this.f15579e;
        if (tVar == null) {
            jc.l.k("connectionManager");
            throw null;
        }
        a8.a aVar = tVar.f15571g;
        if (aVar != null) {
            return aVar.isOpen();
        }
        return false;
    }

    public final Object n(boolean z10, ic.n nVar, ac.c cVar) {
        t tVar = this.f15579e;
        if (tVar != null) {
            return tVar.f15570f.S(z10, nVar, cVar);
        }
        jc.l.k("connectionManager");
        throw null;
    }
}
