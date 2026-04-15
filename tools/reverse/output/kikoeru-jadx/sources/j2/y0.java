package j2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f10098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f10099b;

    public y0(Context context) {
        super(context);
        setClipChildren(false);
        this.f10098a = new HashMap();
        this.f10099b = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<i3.h, i2.j0> getHolderToLayoutNode() {
        return this.f10098a;
    }

    public final HashMap<i2.j0, i3.h> getLayoutNodeToHolder() {
        return this.f10099b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (i3.h hVar : this.f10098a.keySet()) {
            hVar.layout(hVar.getLeft(), hVar.getTop(), hVar.getRight(), hVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (!(View.MeasureSpec.getMode(i10) == 1073741824)) {
            f2.a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i11) == 1073741824)) {
            f2.a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        for (i3.h hVar : this.f10098a.keySet()) {
            int i13 = hVar.f8970u;
            if (i13 != Integer.MIN_VALUE && (i12 = hVar.f8971v) != Integer.MIN_VALUE) {
                hVar.measure(i13, i12);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            i2.j0 j0Var = (i2.j0) this.f10098a.get(childAt);
            if (childAt.isLayoutRequested() && j0Var != null) {
                i2.j0.Y(j0Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
