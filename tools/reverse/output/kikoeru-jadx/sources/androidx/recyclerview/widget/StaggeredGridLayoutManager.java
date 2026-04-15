package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.lifecycle.q;
import c7.r;
import hd.q0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.BitSet;
import m3.l;
import m7.b0;
import m7.h0;
import m7.j;
import m7.j0;
import m7.k0;
import m7.s;
import m7.t;
import pc.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k0[] f1057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q f1058j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q f1059k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1060l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f1061m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f1062n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q0 f1063o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f1064p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f1065q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r f1066r;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1056h = -1;
        this.f1061m = false;
        q0 q0Var = new q0((byte) 0, 3);
        this.f1063o = q0Var;
        this.f1064p = 2;
        new Rect();
        new l(7, this);
        this.f1065q = true;
        this.f1066r = new r(7, this);
        j jVarW = s.w(context, attributeSet, i10, i11);
        int i12 = jVarW.f14889b;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i12 != this.f1060l) {
            this.f1060l = i12;
            q qVar = this.f1058j;
            this.f1058j = this.f1059k;
            this.f1059k = qVar;
            I();
        }
        int i13 = jVarW.f14890c;
        a(null);
        if (i13 != this.f1056h) {
            q0Var.clear();
            I();
            this.f1056h = i13;
            new BitSet(this.f1056h);
            this.f1057i = new k0[this.f1056h];
            for (int i14 = 0; i14 < this.f1056h; i14++) {
                this.f1057i[i14] = new k0(this, i14);
            }
            I();
        }
        boolean z10 = jVarW.f14891d;
        a(null);
        this.f1061m = z10;
        I();
        this.f1058j = q.Y0(this, this.f1060l);
        this.f1059k = q.Y0(this, 1 - this.f1060l);
    }

    @Override // m7.s
    public final void A(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f14925b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f1066r);
        }
        for (int i10 = 0; i10 < this.f1056h; i10++) {
            this.f1057i[i10].a();
        }
        recyclerView.requestLayout();
    }

    @Override // m7.s
    public final void B(AccessibilityEvent accessibilityEvent) {
        super.B(accessibilityEvent);
        if (p() > 0) {
            View viewN = N(false);
            View viewM = M(false);
            if (viewN == null || viewM == null) {
                return;
            }
            ((t) viewN.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // m7.s
    public final Parcelable D() {
        j0 j0Var = new j0();
        j0Var.f14900h = this.f1061m;
        j0Var.f14901i = false;
        j0Var.f14902j = false;
        j0Var.f14897e = 0;
        if (p() <= 0) {
            j0Var.f14893a = -1;
            j0Var.f14894b = -1;
            j0Var.f14895c = 0;
            return j0Var;
        }
        O();
        j0Var.f14893a = 0;
        View viewM = this.f1062n ? M(true) : N(true);
        if (viewM != null) {
            ((t) viewM.getLayoutParams()).getClass();
            throw null;
        }
        j0Var.f14894b = -1;
        int i10 = this.f1056h;
        j0Var.f14895c = i10;
        j0Var.f14896d = new int[i10];
        for (int i11 = 0; i11 < this.f1056h; i11++) {
            k0 k0Var = this.f1057i[i11];
            ArrayList arrayList = (ArrayList) k0Var.f14909d;
            int iF1 = k0Var.f14906a;
            if (iF1 == Integer.MIN_VALUE) {
                if (arrayList.size() == 0) {
                    iF1 = Integer.MIN_VALUE;
                } else {
                    View view = (View) arrayList.get(0);
                    h0 h0Var = (h0) view.getLayoutParams();
                    k0Var.f14906a = ((StaggeredGridLayoutManager) k0Var.f14910e).f1058j.d1(view);
                    h0Var.getClass();
                    iF1 = k0Var.f14906a;
                }
            }
            if (iF1 != Integer.MIN_VALUE) {
                iF1 -= this.f1058j.f1();
            }
            j0Var.f14896d[i11] = iF1;
        }
        return j0Var;
    }

    @Override // m7.s
    public final void E(int i10) {
        if (i10 == 0) {
            K();
        }
    }

    public final boolean K() {
        if (p() == 0 || this.f1064p == 0 || !this.f14928e) {
            return false;
        }
        boolean z10 = this.f1062n;
        if (z10) {
            P();
            O();
        } else {
            O();
            P();
        }
        int iP = p();
        int i10 = iP - 1;
        int i11 = this.f1056h;
        new BitSet(i11).set(0, i11, true);
        if (this.f1060l == 1) {
            RecyclerView recyclerView = this.f14925b;
            Field field = u3.s.f21328a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z10) {
            iP = -1;
        } else {
            i10 = 0;
        }
        if (i10 == iP) {
            return false;
        }
        ((h0) o(i10).getLayoutParams()).getClass();
        throw null;
    }

    public final void L(b0 b0Var) {
        if (p() == 0) {
            return;
        }
        boolean z10 = !this.f1065q;
        View viewN = N(z10);
        View viewM = M(z10);
        if (p() == 0 || b0Var.a() == 0 || viewN == null || viewM == null) {
            return;
        }
        ((t) viewN.getLayoutParams()).getClass();
        throw null;
    }

    public final View M(boolean z10) {
        int iF1 = this.f1058j.f1();
        int iE1 = this.f1058j.e1();
        View view = null;
        for (int iP = p() - 1; iP >= 0; iP--) {
            View viewO = o(iP);
            int iD1 = this.f1058j.d1(viewO);
            int iC1 = this.f1058j.c1(viewO);
            if (iC1 > iF1 && iD1 < iE1) {
                if (iC1 <= iE1 || !z10) {
                    return viewO;
                }
                if (view == null) {
                    view = viewO;
                }
            }
        }
        return view;
    }

    public final View N(boolean z10) {
        int iF1 = this.f1058j.f1();
        int iE1 = this.f1058j.e1();
        int iP = p();
        View view = null;
        for (int i10 = 0; i10 < iP; i10++) {
            View viewO = o(i10);
            int iD1 = this.f1058j.d1(viewO);
            if (this.f1058j.c1(viewO) > iF1 && iD1 < iE1) {
                if (iD1 >= iF1 || !z10) {
                    return viewO;
                }
                if (view == null) {
                    view = viewO;
                }
            }
        }
        return view;
    }

    public final void O() {
        if (p() == 0) {
            return;
        }
        s.v(o(0));
        throw null;
    }

    public final void P() {
        int iP = p();
        if (iP == 0) {
            return;
        }
        s.v(o(iP - 1));
        throw null;
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
        return this.f1060l == 0;
    }

    @Override // m7.s
    public final boolean c() {
        return this.f1060l == 1;
    }

    @Override // m7.s
    public final boolean d(t tVar) {
        return tVar instanceof h0;
    }

    @Override // m7.s
    public final int f(b0 b0Var) {
        if (p() == 0) {
            return 0;
        }
        boolean z10 = !this.f1065q;
        return f0.r(b0Var, this.f1058j, N(z10), M(z10), this, this.f1065q);
    }

    @Override // m7.s
    public final void g(b0 b0Var) {
        L(b0Var);
    }

    @Override // m7.s
    public final int h(b0 b0Var) {
        if (p() == 0) {
            return 0;
        }
        boolean z10 = !this.f1065q;
        return f0.s(b0Var, this.f1058j, N(z10), M(z10), this, this.f1065q);
    }

    @Override // m7.s
    public final int i(b0 b0Var) {
        if (p() == 0) {
            return 0;
        }
        boolean z10 = !this.f1065q;
        return f0.r(b0Var, this.f1058j, N(z10), M(z10), this, this.f1065q);
    }

    @Override // m7.s
    public final void j(b0 b0Var) {
        L(b0Var);
    }

    @Override // m7.s
    public final int k(b0 b0Var) {
        if (p() == 0) {
            return 0;
        }
        boolean z10 = !this.f1065q;
        return f0.s(b0Var, this.f1058j, N(z10), M(z10), this, this.f1065q);
    }

    @Override // m7.s
    public final t l() {
        return this.f1060l == 0 ? new h0(-2, -1) : new h0(-1, -2);
    }

    @Override // m7.s
    public final t m(Context context, AttributeSet attributeSet) {
        return new h0(context, attributeSet);
    }

    @Override // m7.s
    public final t n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new h0((ViewGroup.MarginLayoutParams) layoutParams) : new h0(layoutParams);
    }

    @Override // m7.s
    public final boolean y() {
        return this.f1064p != 0;
    }

    @Override // m7.s
    public final void z() {
        this.f1063o.clear();
        for (int i10 = 0; i10 < this.f1056h; i10++) {
            this.f1057i[i10].a();
        }
    }
}
