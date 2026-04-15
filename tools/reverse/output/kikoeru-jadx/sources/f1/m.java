package f1;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import o.k0;
import o.l0;
import o.t0;
import pc.f0;
import x0.u1;
import x0.v1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f6635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i1.c f6636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0.e f6637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l0 f6638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z0.e f6639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z0.e f6640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z0.e f6641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l0 f6642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k0 f6643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f6644j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l0 f6645k;

    public m() {
        z0.e eVar = new z0.e(new v1[16]);
        this.f6637c = eVar;
        int i10 = t0.f16044a;
        this.f6638d = new l0();
        this.f6639e = eVar;
        this.f6640f = new z0.e(new Object[16]);
        this.f6641g = new z0.e(new ic.a[16]);
    }

    public final void a() {
        this.f6635a = null;
        this.f6636b = null;
        z0.e eVar = this.f6637c;
        eVar.g();
        this.f6638d.b();
        this.f6639e = eVar;
        this.f6640f.g();
        this.f6641g.g();
        this.f6642h = null;
        this.f6643i = null;
        this.f6644j = null;
    }

    public final void b() {
        Set set = this.f6635a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                u1 u1Var = (u1) it.next();
                it.remove();
                u1Var.a();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        Set set = this.f6635a;
        if (set == null) {
            return;
        }
        this.f6645k = null;
        z0.e eVar = this.f6640f;
        if (eVar.f26374c != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                l0 l0Var = this.f6642h;
                int i10 = eVar.f26374c;
                while (true) {
                    i10--;
                    if (-1 >= i10) {
                        break;
                    }
                    Object obj = eVar.f26372a[i10];
                    try {
                        if (obj instanceof v1) {
                            u1 u1Var = ((v1) obj).f24513a;
                            set.remove(u1Var);
                            u1Var.c();
                        }
                        if (obj instanceof x0.i) {
                            if (l0Var == null || !l0Var.c(obj)) {
                                ((x0.i) obj).b();
                            } else {
                                ((x0.i) obj).a();
                            }
                        }
                    } catch (Throwable th2) {
                        i1.c cVar = this.f6636b;
                        if (cVar != null) {
                            f0.V(th2, new a9.d(12, cVar, obj));
                        }
                        throw th2;
                    }
                }
            } finally {
            }
        }
        z0.e eVar2 = this.f6637c;
        if (eVar2.f26374c != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.f6635a;
                if (set2 != null) {
                    Object[] objArr = eVar2.f26372a;
                    int i11 = eVar2.f26374c;
                    for (int i12 = 0; i12 < i11; i12++) {
                        v1 v1Var = (v1) objArr[i12];
                        u1 u1Var2 = v1Var.f24513a;
                        set2.remove(u1Var2);
                        try {
                            u1Var2.d();
                        } catch (Throwable th3) {
                            i1.c cVar2 = this.f6636b;
                            if (cVar2 != null) {
                                f0.V(th3, new a9.d(12, cVar2, v1Var));
                            }
                            throw th3;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void d(v1 v1Var) {
        if (this.f6638d.c(v1Var)) {
            this.f6638d.l(v1Var);
            if (!this.f6639e.j(v1Var)) {
                z0.e eVar = this.f6637c;
                if (!eVar.j(v1Var)) {
                    Object[] objArr = eVar.f26372a;
                    int i10 = eVar.f26374c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (((v1) objArr[i11]).f24513a instanceof i) {
                            throw null;
                        }
                    }
                }
            }
            Set set = this.f6635a;
            if (set == null) {
                return;
            } else {
                set.add(v1Var.f24513a);
            }
        }
        l0 l0Var = this.f6645k;
        if (l0Var == null || !l0Var.c(v1Var)) {
            this.f6640f.b(v1Var);
        }
    }

    public final void e(Set set, i1.c cVar) {
        a();
        this.f6635a = set;
        this.f6636b = cVar;
    }
}
