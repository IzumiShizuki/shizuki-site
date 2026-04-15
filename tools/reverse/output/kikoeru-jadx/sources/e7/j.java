package e7;

import android.os.Bundle;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements androidx.lifecycle.x, x0, androidx.lifecycle.k, w7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4.n f6333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f6334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f6335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.p f6336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f6337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f6339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h7.c f6340h = new h7.c(this);

    public j(c4.n nVar, u uVar, Bundle bundle, androidx.lifecycle.p pVar, m mVar, String str, Bundle bundle2) {
        this.f6333a = nVar;
        this.f6334b = uVar;
        this.f6335c = bundle;
        this.f6336d = pVar;
        this.f6337e = mVar;
        this.f6338f = str;
        this.f6339g = bundle2;
        ub.a.d(new androidx.lifecycle.n0(9, this));
    }

    @Override // androidx.lifecycle.k
    public final u0 b() {
        return this.f6340h.f8145l;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // androidx.lifecycle.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i4.e c() {
        /*
            r5 = this;
            h7.c r0 = r5.f6340h
            r0.getClass()
            i4.e r1 = new i4.e
            r1.<init>()
            pe.d r2 = androidx.lifecycle.m0.f783a
            e7.j r3 = r0.f8134a
            java.util.LinkedHashMap r4 = r1.f9002a
            r4.put(r2, r3)
            pe.d r2 = androidx.lifecycle.m0.f784b
            r4.put(r2, r3)
            android.os.Bundle r0 = r0.a()
            if (r0 == 0) goto L23
            pe.d r2 = androidx.lifecycle.m0.f785c
            r4.put(r2, r0)
        L23:
            r0 = 0
            c4.n r2 = r5.f6333a
            if (r2 == 0) goto L39
            android.content.Context r2 = r2.f3388a
            if (r2 == 0) goto L31
            android.content.Context r2 = r2.getApplicationContext()
            goto L32
        L31:
            r2 = r0
        L32:
            boolean r3 = r2 instanceof android.app.Application
            if (r3 == 0) goto L39
            android.app.Application r2 = (android.app.Application) r2
            goto L3a
        L39:
            r2 = r0
        L3a:
            if (r2 == 0) goto L3d
            r0 = r2
        L3d:
            if (r0 == 0) goto L44
            pe.d r2 = androidx.lifecycle.t0.f816e
            r4.put(r2, r0)
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.j.c():i4.e");
    }

    @Override // androidx.lifecycle.x0
    public final w0 d() {
        h7.c cVar = this.f6340h;
        if (!cVar.f8142i) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (cVar.f8143j.f826d == androidx.lifecycle.p.f794a) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        m mVar = cVar.f8138e;
        if (mVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = cVar.f8139f;
        jc.l.e(str, "backStackEntryId");
        LinkedHashMap linkedHashMap = mVar.f6361b;
        w0 w0Var = (w0) linkedHashMap.get(str);
        if (w0Var != null) {
            return w0Var;
        }
        w0 w0Var2 = new w0();
        linkedHashMap.put(str, w0Var2);
        return w0Var2;
    }

    @Override // w7.e
    public final v2.e e() {
        return (v2.e) this.f6340h.f8141h.f22365c;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof j)) {
            j jVar = (j) obj;
            Bundle bundle = jVar.f6335c;
            if (jc.l.a(this.f6338f, jVar.f6338f) && jc.l.a(this.f6334b, jVar.f6334b) && jc.l.a(this.f6340h.f8143j, jVar.f6340h.f8143j) && jc.l.a(e(), jVar.e())) {
                Bundle bundle2 = this.f6335c;
                if (jc.l.a(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!jc.l.a(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.x
    public final androidx.lifecycle.q f() {
        return this.f6340h.f8143j;
    }

    public final void g(androidx.lifecycle.p pVar) {
        h7.c cVar = this.f6340h;
        cVar.getClass();
        cVar.f8144k = pVar;
        cVar.b();
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f6334b.hashCode() + (this.f6338f.hashCode() * 31);
        Bundle bundle = this.f6335c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i10 = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return e().hashCode() + ((this.f6340h.f8143j.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return this.f6340h.toString();
    }
}
