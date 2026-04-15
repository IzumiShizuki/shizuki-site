package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import i7.p2;
import j2.h0;
import m7.b0;
import m7.i;
import m7.s;
import m7.t;
import m7.y;
import q.t0;
import v3.d;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1013o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p2 f1014p;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f1013o = -1;
        new SparseIntArray();
        new SparseIntArray();
        p2 p2Var = new p2(14, false);
        this.f1014p = p2Var;
        new Rect();
        int i12 = s.w(context, attributeSet, i10, i11).f14890c;
        if (i12 == this.f1013o) {
            return;
        }
        if (i12 < 1) {
            throw new IllegalArgumentException(t0.B(i12, "Span count should be at least 1. Provided "));
        }
        this.f1013o = i12;
        ((SparseIntArray) p2Var.f9258a).clear();
        I();
    }

    @Override // m7.s
    public final void C(y yVar, b0 b0Var, d dVar) {
        super.C(yVar, b0Var, dVar);
        dVar.h("android.widget.GridView");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void R(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.R(false);
    }

    public final int S(y yVar, b0 b0Var, int i10) {
        boolean z10 = b0Var.f14831c;
        p2 p2Var = this.f1014p;
        if (!z10) {
            p2Var.getClass();
            return p2.w(i10, this.f1013o);
        }
        RecyclerView recyclerView = yVar.f14941f;
        b0 b0Var2 = recyclerView.V;
        if (i10 < 0 || i10 >= b0Var2.a()) {
            StringBuilder sbO = h0.o(i10, "invalid position ", ". State item count is ");
            sbO.append(b0Var2.a());
            sbO.append(recyclerView.m());
            throw new IndexOutOfBoundsException(sbO.toString());
        }
        int iU = !b0Var2.f14831c ? i10 : recyclerView.f1027d.u(i10, 0);
        if (iU != -1) {
            p2Var.getClass();
            return p2.w(iU, this.f1013o);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    @Override // m7.s
    public final boolean d(t tVar) {
        return tVar instanceof i;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m7.s
    public final void g(b0 b0Var) {
        L(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m7.s
    public final int h(b0 b0Var) {
        return M(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m7.s
    public final void j(b0 b0Var) {
        L(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m7.s
    public final int k(b0 b0Var) {
        return M(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m7.s
    public final t l() {
        return this.f1015h == 0 ? new i(-2, -1) : new i(-1, -2);
    }

    @Override // m7.s
    public final t m(Context context, AttributeSet attributeSet) {
        return new i(context, attributeSet);
    }

    @Override // m7.s
    public final t n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new i((ViewGroup.MarginLayoutParams) layoutParams) : new i(layoutParams);
    }

    @Override // m7.s
    public final int q(y yVar, b0 b0Var) {
        if (this.f1015h == 1) {
            return this.f1013o;
        }
        if (b0Var.a() < 1) {
            return 0;
        }
        return S(yVar, b0Var, b0Var.a() - 1) + 1;
    }

    @Override // m7.s
    public final int x(y yVar, b0 b0Var) {
        if (this.f1015h == 0) {
            return this.f1013o;
        }
        if (b0Var.a() < 1) {
            return 0;
        }
        return S(yVar, b0Var, b0Var.a() - 1) + 1;
    }
}
