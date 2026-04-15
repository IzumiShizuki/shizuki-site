package j3;

import android.content.Context;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import u3.w0;
import x0.e1;
import x0.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends j2.a implements r, u3.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Window f10150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e1 f10151j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f10152k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10153l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10154m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10155n;

    public p(Context context, Window window) {
        super(context);
        this.f10150i = window;
        this.f10151j = x0.v.v(n.f10148a);
        Field field = u3.s.f21328a;
        u3.l.c(this, this);
        u3.s.c(this, new i3.b(this, 1));
    }

    @Override // j2.a
    public final void a(int i10, x0.o oVar) {
        oVar.Y(1735448596);
        int i11 = (oVar.h(this) ? 4 : 2) | i10;
        if (oVar.N(i11 & 1, (i11 & 3) != 2)) {
            ((ic.n) this.f10151j.getValue()).q(oVar, 0);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.d(i10, 12, this);
        }
    }

    @Override // u3.f
    public final w0 c(View view, w0 w0Var) {
        if (!this.f10153l) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return w0Var.f21343a.n(iMax, iMax2, iMax3, iMax4);
            }
        }
        return w0Var;
    }

    @Override // j2.a
    public final void f(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i14 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i15 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // j2.a
    public final void g(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.g(i10, i11);
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        Window window = this.f10150i;
        int i12 = (mode != Integer.MIN_VALUE || this.f10152k || this.f10153l || window.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i13 = size - paddingRight;
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = i12 - paddingBottom;
        int i15 = i14 >= 0 ? i14 : 0;
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode2 != 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
        }
        childAt.measure(i10, i11);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.f10153l || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.f10152k) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // j2.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f10155n;
    }
}
