package androidx.recyclerview.widget;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.lifecycle.q;
import m3.l;
import m7.b0;
import m7.j;
import m7.k;
import m7.s;
import m7.t;
import pc.f0;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l f1016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q f1017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f1018k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f1019l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1020m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f1021n = true;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1015h = 1;
        this.f1018k = false;
        j jVar = new j(0);
        jVar.f14889b = -1;
        jVar.f14890c = Integer.MIN_VALUE;
        jVar.f14891d = false;
        jVar.f14892e = false;
        j jVarW = s.w(context, attributeSet, i10, i11);
        int i12 = jVarW.f14889b;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException(t0.B(i12, "invalid orientation:"));
        }
        a(null);
        if (i12 != this.f1015h || this.f1017j == null) {
            this.f1017j = q.Y0(this, i12);
            this.f1015h = i12;
            I();
        }
        boolean z10 = jVarW.f14891d;
        a(null);
        if (z10 != this.f1018k) {
            this.f1018k = z10;
            I();
        }
        R(jVarW.f14892e);
    }

    @Override // m7.s
    public final void B(AccessibilityEvent accessibilityEvent) {
        super.B(accessibilityEvent);
        if (p() > 0) {
            View viewQ = Q(0, p(), false);
            if (viewQ != null) {
                ((t) viewQ.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            View viewQ2 = Q(p() - 1, -1, false);
            if (viewQ2 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((t) viewQ2.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // m7.s
    public final Parcelable D() {
        k kVar = new k();
        if (p() <= 0) {
            kVar.f14903a = -1;
            return kVar;
        }
        N();
        boolean z10 = this.f1019l;
        kVar.f14905c = z10;
        if (!z10) {
            s.v(o(z10 ? p() - 1 : 0));
            throw null;
        }
        View viewO = o(z10 ? 0 : p() - 1);
        kVar.f14904b = this.f1017j.e1() - this.f1017j.c1(viewO);
        s.v(viewO);
        throw null;
    }

    public final int K(b0 b0Var) {
        if (p() == 0) {
            return 0;
        }
        N();
        boolean z10 = !this.f1021n;
        return f0.r(b0Var, this.f1017j, P(z10), O(z10), this, this.f1021n);
    }

    public final void L(b0 b0Var) {
        if (p() == 0) {
            return;
        }
        N();
        boolean z10 = !this.f1021n;
        View viewP = P(z10);
        View viewO = O(z10);
        if (p() == 0 || b0Var.a() == 0 || viewP == null || viewO == null) {
            return;
        }
        ((t) viewP.getLayoutParams()).getClass();
        throw null;
    }

    public final int M(b0 b0Var) {
        if (p() == 0) {
            return 0;
        }
        N();
        boolean z10 = !this.f1021n;
        return f0.s(b0Var, this.f1017j, P(z10), O(z10), this, this.f1021n);
    }

    public final void N() {
        if (this.f1016i == null) {
            this.f1016i = new l(3);
        }
    }

    public final View O(boolean z10) {
        return this.f1019l ? Q(0, p(), z10) : Q(p() - 1, -1, z10);
    }

    public final View P(boolean z10) {
        return this.f1019l ? Q(p() - 1, -1, z10) : Q(0, p(), z10);
    }

    public final View Q(int i10, int i11, boolean z10) {
        N();
        int i12 = z10 ? 24579 : 320;
        return this.f1015h == 0 ? this.f14926c.y(i10, i11, i12, 320) : this.f14927d.y(i10, i11, i12, 320);
    }

    public void R(boolean z10) {
        a(null);
        if (this.f1020m == z10) {
            return;
        }
        this.f1020m = z10;
        I();
    }

    @Override // m7.s
    public final void a(String str) {
        RecyclerView recyclerView = this.f14925b;
        if (recyclerView != null) {
            recyclerView.b(str);
        }
    }

    @Override // m7.s
    public final boolean b() {
        return this.f1015h == 0;
    }

    @Override // m7.s
    public final boolean c() {
        return this.f1015h == 1;
    }

    @Override // m7.s
    public final int f(b0 b0Var) {
        return K(b0Var);
    }

    @Override // m7.s
    public void g(b0 b0Var) {
        L(b0Var);
    }

    @Override // m7.s
    public int h(b0 b0Var) {
        return M(b0Var);
    }

    @Override // m7.s
    public final int i(b0 b0Var) {
        return K(b0Var);
    }

    @Override // m7.s
    public void j(b0 b0Var) {
        L(b0Var);
    }

    @Override // m7.s
    public int k(b0 b0Var) {
        return M(b0Var);
    }

    @Override // m7.s
    public t l() {
        return new t(-2, -2);
    }

    @Override // m7.s
    public final boolean y() {
        return true;
    }

    @Override // m7.s
    public final void A(RecyclerView recyclerView) {
    }
}
