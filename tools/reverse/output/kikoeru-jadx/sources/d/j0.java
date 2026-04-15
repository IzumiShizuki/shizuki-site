package d;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f5214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vb.j f5215b = new vb.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0 f5216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f5217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f5218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5220g;

    public j0(Runnable runnable) {
        this.f5214a = runnable;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f5217d = i10 >= 34 ? new f0(new c0(this, 0), new c0(this, 1), new d0(this, 0), new d0(this, 1)) : new e0(0, new d0(this, 2));
        }
    }

    public final void a(androidx.lifecycle.x xVar, b0 b0Var) {
        jc.l.e(xVar, "owner");
        jc.l.e(b0Var, "onBackPressedCallback");
        androidx.lifecycle.q qVarF = xVar.f();
        if (qVarF.a1() == androidx.lifecycle.p.f794a) {
            return;
        }
        b0Var.f5181b.add(new g0(this, qVarF, b0Var));
        e();
        b0Var.f5182c = new i0(0, this, j0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 0);
    }

    public final void b() {
        Object objPrevious;
        b0 b0Var = this.f5216c;
        if (b0Var == null) {
            vb.j jVar = this.f5215b;
            ListIterator<E> listIterator = jVar.listIterator(jVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((b0) objPrevious).f5180a) {
                        break;
                    }
                }
            }
            b0Var = (b0) objPrevious;
        }
        this.f5216c = null;
        if (b0Var != null) {
            b0Var.a();
        }
    }

    public final void c() {
        Object objPrevious;
        b0 b0Var = this.f5216c;
        if (b0Var == null) {
            vb.j jVar = this.f5215b;
            ListIterator listIterator = jVar.listIterator(jVar.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((b0) objPrevious).f5180a) {
                        break;
                    }
                }
            }
            b0Var = (b0) objPrevious;
        }
        this.f5216c = null;
        if (b0Var != null) {
            b0Var.b();
        } else {
            this.f5214a.run();
        }
    }

    public final void d(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f5218e;
        OnBackInvokedCallback onBackInvokedCallback = this.f5217d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z10 && !this.f5219f) {
            j.h(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f5219f = true;
        } else {
            if (z10 || !this.f5219f) {
                return;
            }
            j.i(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f5219f = false;
        }
    }

    public final void e() {
        boolean z10 = this.f5220g;
        boolean z11 = false;
        vb.j jVar = this.f5215b;
        if (jVar == null || !jVar.isEmpty()) {
            Iterator it = jVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((b0) it.next()).f5180a) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f5220g = z11;
        if (z11 == z10 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z11);
    }
}
