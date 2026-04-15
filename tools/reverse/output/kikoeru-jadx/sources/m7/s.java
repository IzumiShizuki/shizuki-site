package m7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import c7.e1;
import i7.p2;
import java.lang.reflect.Field;
import java.util.ArrayList;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e1 f14924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f14925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.w f14926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.w f14927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14930g;

    public s() {
        r rVar = new r(this, 0);
        r rVar2 = new r(this, 1);
        this.f14926c = new m0.w(rVar);
        this.f14927d = new m0.w(rVar2);
        this.f14928e = false;
    }

    public static int e(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
    }

    public static void v(View view) {
        ((t) view.getLayoutParams()).getClass();
        throw null;
    }

    public static j w(Context context, AttributeSet attributeSet, int i10, int i11) {
        j jVar = new j(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l7.a.f11873a, i10, i11);
        jVar.f14889b = typedArrayObtainStyledAttributes.getInt(0, 1);
        jVar.f14890c = typedArrayObtainStyledAttributes.getInt(10, 1);
        jVar.f14891d = typedArrayObtainStyledAttributes.getBoolean(9, false);
        jVar.f14892e = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return jVar;
    }

    public abstract void A(RecyclerView recyclerView);

    public void B(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f14925b;
        y yVar = recyclerView.f1025b;
        b0 b0Var = recyclerView.V;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z10 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f14925b.canScrollVertically(-1) && !this.f14925b.canScrollHorizontally(-1) && !this.f14925b.canScrollHorizontally(1)) {
            z10 = false;
        }
        accessibilityEvent.setScrollable(z10);
        this.f14925b.getClass();
    }

    public void C(y yVar, b0 b0Var, v3.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f22380a;
        if (this.f14925b.canScrollVertically(-1) || this.f14925b.canScrollHorizontally(-1)) {
            dVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f14925b.canScrollVertically(1) || this.f14925b.canScrollHorizontally(1)) {
            dVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(x(yVar, b0Var), q(yVar, b0Var), false, 0));
    }

    public abstract Parcelable D();

    public final void F() {
        int iP = p() - 1;
        if (iP < 0) {
            return;
        }
        RecyclerView.p(o(iP));
        throw null;
    }

    public final void G(y yVar) {
        ArrayList arrayList = yVar.f14936a;
        int size = arrayList.size();
        int i10 = size - 1;
        if (i10 >= 0) {
            throw t0.A(i10, arrayList);
        }
        arrayList.clear();
        if (size > 0) {
            this.f14925b.invalidate();
        }
    }

    public final boolean H(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        int iS = s();
        int iU = u();
        int iT = this.f14929f - t();
        int iR = this.f14930g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i10 = left - iS;
        int iMin = Math.min(0, i10);
        int i11 = top - iU;
        int iMin2 = Math.min(0, i11);
        int i12 = iWidth - iT;
        int iMax = Math.max(0, i12);
        int iMax2 = Math.max(0, iHeight - iR);
        RecyclerView recyclerView2 = this.f14925b;
        Field field = u3.s.f21328a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i10, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i12);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i11, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i13 = iArr[0];
        int i14 = iArr[1];
        if (z11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iS2 = s();
            int iU2 = u();
            int iT2 = this.f14929f - t();
            int iR2 = this.f14930g - r();
            Rect rect2 = this.f14925b.f1031h;
            int[] iArr2 = RecyclerView.f1022y0;
            t tVar = (t) focusedChild.getLayoutParams();
            Rect rect3 = tVar.f14931a;
            z12 = true;
            z13 = false;
            rect2.set((focusedChild.getLeft() - rect3.left) - ((ViewGroup.MarginLayoutParams) tVar).leftMargin, (focusedChild.getTop() - rect3.top) - ((ViewGroup.MarginLayoutParams) tVar).topMargin, focusedChild.getRight() + rect3.right + ((ViewGroup.MarginLayoutParams) tVar).rightMargin, focusedChild.getBottom() + rect3.bottom + ((ViewGroup.MarginLayoutParams) tVar).bottomMargin);
            if (rect2.left - i13 >= iT2 || rect2.right - i13 <= iS2 || rect2.top - i14 >= iR2 || rect2.bottom - i14 <= iU2) {
                return false;
            }
        } else {
            z12 = true;
            z13 = false;
        }
        if (i13 == 0 && i14 == 0) {
            return z13;
        }
        if (z10) {
            recyclerView.scrollBy(i13, i14);
            return z12;
        }
        recyclerView.z(i13, i14, false);
        return z12;
    }

    public final void I() {
        RecyclerView recyclerView = this.f14925b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void J(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f14925b = null;
            this.f14924a = null;
            this.f14929f = 0;
            this.f14930g = 0;
            return;
        }
        this.f14925b = recyclerView;
        this.f14924a = recyclerView.f1028e;
        this.f14929f = recyclerView.getWidth();
        this.f14930g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(t tVar) {
        return tVar != null;
    }

    public abstract int f(b0 b0Var);

    public abstract void g(b0 b0Var);

    public abstract int h(b0 b0Var);

    public abstract int i(b0 b0Var);

    public abstract void j(b0 b0Var);

    public abstract int k(b0 b0Var);

    public abstract t l();

    public t m(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    public t n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof t ? new t((t) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new t((ViewGroup.MarginLayoutParams) layoutParams) : new t(layoutParams);
    }

    public final View o(int i10) {
        e1 e1Var = this.f14924a;
        if (e1Var == null) {
            return null;
        }
        bh.a aVar = (bh.a) e1Var.f3619c;
        int i11 = -1;
        if (i10 >= 0) {
            int childCount = ((RecyclerView) ((p2) e1Var.f3618b).f9258a).getChildCount();
            int i12 = i10;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                int iB = i10 - (i12 - aVar.B(i12));
                if (iB == 0) {
                    i11 = i12;
                    while (aVar.C(i11)) {
                        i11++;
                    }
                } else {
                    i12 += iB;
                }
            }
        }
        return ((RecyclerView) ((p2) e1Var.f3618b).f9258a).getChildAt(i11);
    }

    public final int p() {
        e1 e1Var = this.f14924a;
        if (e1Var != null) {
            return ((RecyclerView) ((p2) e1Var.f3618b).f9258a).getChildCount() - ((ArrayList) e1Var.f3620d).size();
        }
        return 0;
    }

    public int q(y yVar, b0 b0Var) {
        return -1;
    }

    public final int r() {
        RecyclerView recyclerView = this.f14925b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.f14925b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f14925b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f14925b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(y yVar, b0 b0Var) {
        return -1;
    }

    public abstract boolean y();

    public void z() {
    }

    public void E(int i10) {
    }
}
