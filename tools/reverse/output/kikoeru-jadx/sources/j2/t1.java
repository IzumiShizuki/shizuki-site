package j2;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ah.c f10004f = new ah.c(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f10005a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f10006b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f10007c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s1 f10008d = new s1(new b7.c3(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f10009e = new ArrayList();

    public static void d(ViewGroup viewGroup, Rect rect) {
        int height = viewGroup.getHeight() + viewGroup.getScrollY();
        int width = viewGroup.getWidth() + viewGroup.getScrollX();
        rect.set(width, height, width, height);
    }

    public final View a(int i10, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        int iIndexOf;
        int iLastIndexOf;
        int i11;
        Rect rect2 = this.f10005a;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 17 || i10 == 33) {
                    d(viewGroup, rect2);
                } else if (i10 == 66 || i10 == 130) {
                    int scrollY = viewGroup.getScrollY();
                    int scrollX = viewGroup.getScrollX();
                    rect2.set(scrollX, scrollY, scrollX, scrollY);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                d(viewGroup, rect2);
            } else {
                int scrollY2 = viewGroup.getScrollY();
                int scrollX2 = viewGroup.getScrollX();
                rect2.set(scrollX2, scrollY2, scrollX2, scrollY2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            int scrollY3 = viewGroup.getScrollY();
            int scrollX3 = viewGroup.getScrollX();
            rect2.set(scrollX3, scrollY3, scrollX3, scrollY3);
        } else {
            d(viewGroup, rect2);
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 == 17 || i10 == 33 || i10 == 66 || i10 == 130) {
                return c(i10, rect2, view, viewGroup, arrayList);
            }
            throw new IllegalArgumentException(q.t0.B(i10, "Unknown direction: "));
        }
        s1 s1Var = this.f10008d;
        try {
            s1Var.a(arrayList, viewGroup);
            Collections.sort(arrayList, s1Var);
            s1Var.f9982c.a();
            s1Var.f9981b.b();
            s1Var.f9983d.a();
            s1Var.f9980a.a();
            int size = arrayList.size();
            View viewC = null;
            if (size < 2) {
                return null;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 17 || i10 == 33 || i10 == 66 || i10 == 130) {
                        viewC = c(i10, this.f10005a, view, viewGroup, arrayList);
                    }
                } else if (size >= 2) {
                    viewC = (view == null || (iLastIndexOf = arrayList.lastIndexOf(view)) < 0 || (i11 = iLastIndexOf + 1) >= size) ? (View) arrayList.get(0) : (View) arrayList.get(i11);
                }
            } else if (size >= 2) {
                viewC = (view == null || (iIndexOf = arrayList.indexOf(view)) <= 0) ? (View) arrayList.get(size - 1) : (View) arrayList.get(iIndexOf - 1);
            }
            return viewC == null ? (View) arrayList.get(size - 1) : viewC;
        } catch (Throwable th2) {
            s1Var.f9982c.a();
            s1Var.f9981b.b();
            s1Var.f9983d.a();
            s1Var.f9980a.a();
            throw th2;
        }
    }

    public final View b(ViewGroup viewGroup, View view, int i10) {
        ViewGroup viewGroup2;
        View viewA = null;
        if (view == null || view == viewGroup) {
            viewGroup2 = viewGroup;
        } else {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup3 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent != viewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) parent;
                    if (viewGroup4.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup3 = viewGroup4;
                    }
                    parent = viewGroup4.getParent();
                } else {
                    if (viewGroup3 == null) {
                        break;
                    }
                    viewGroup2 = viewGroup3;
                }
            }
            viewGroup2 = viewGroup;
        }
        View viewL = l0.l(view, viewGroup2, i10);
        View viewL2 = viewL;
        boolean z10 = true;
        while (viewL != null) {
            if (viewL.isFocusable() && viewL.getVisibility() == 0 && (!viewL.isInTouchMode() || viewL.isFocusableInTouchMode())) {
                viewA = viewL;
                break;
            }
            viewL = l0.l(viewL, viewGroup2, i10);
            boolean z11 = !z10;
            if (!z10) {
                viewL2 = viewL2 != null ? l0.l(viewL2, viewGroup2, i10) : null;
                if (viewL2 == viewL) {
                    break;
                }
            }
            z10 = z11;
        }
        if (viewA != null) {
            return viewA;
        }
        ArrayList<View> arrayList = this.f10009e;
        try {
            arrayList.clear();
            if (Build.VERSION.SDK_INT < 26) {
                l0.n(viewGroup2, arrayList, viewGroup2.isInTouchMode());
            } else {
                viewGroup2.addFocusables(arrayList, i10, viewGroup2.isInTouchMode() ? 1 : 0);
            }
            if (!arrayList.isEmpty()) {
                viewA = a(i10, null, view, viewGroup2, arrayList);
            }
            arrayList.clear();
            return viewA;
        } catch (Throwable th2) {
            arrayList.clear();
            throw th2;
        }
    }

    public final View c(int i10, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        Rect rect2 = this.f10006b;
        rect2.set(rect);
        if (i10 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i10 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i10 == 66) {
            rect2.offset((-rect.width()) - 1, 0);
        } else if (i10 == 130) {
            rect2.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = (View) arrayList.get(i11);
            if (!jc.l.a(view3, view) && !jc.l.a(view3, viewGroup)) {
                Rect rect3 = this.f10007c;
                view3.getFocusedRect(rect3);
                viewGroup.offsetDescendantRectToMyCoords(view3, rect3);
                p1.c cVarD = q1.h0.D(rect3);
                p1.c cVarD2 = q1.h0.D(rect2);
                p1.c cVarD3 = q1.h0.D(rect);
                o1.d dVarD = o1.f.D(i10);
                if (o1.f.o(cVarD, cVarD2, cVarD3, dVarD != null ? dVarD.f16086a : 1)) {
                    rect2.set(rect3);
                    view2 = view3;
                }
            }
        }
        return view2;
    }
}
