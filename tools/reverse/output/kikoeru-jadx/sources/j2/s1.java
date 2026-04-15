package j2;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s1 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.k0 f9980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o.l0 f9981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o.k0 f9982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o.f0 f9983d;

    public s1(b7.c3 c3Var) {
        long[] jArr = o.s0.f16040a;
        this.f9980a = new o.k0();
        int i10 = o.t0.f16044a;
        this.f9981b = new o.l0();
        this.f9982c = new o.k0();
        o.f0 f0Var = o.p0.f16030a;
        this.f9983d = new o.f0();
    }

    public final void a(ArrayList arrayList, ViewGroup viewGroup) {
        o.f0 f0Var;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            f0Var = this.f9983d;
            if (i10 >= size) {
                break;
            }
            f0Var.h(i10, (View) arrayList.get(i10));
            i10++;
        }
        int size2 = arrayList.size() - 1;
        o.l0 l0Var = this.f9981b;
        o.k0 k0Var = this.f9980a;
        if (size2 >= 0) {
            while (true) {
                int i11 = size2 - 1;
                View view = (View) arrayList.get(size2);
                int nextFocusForwardId = view.getNextFocusForwardId();
                View viewL = (nextFocusForwardId == 0 || nextFocusForwardId == -1) ? null : l0.l(view, viewGroup, 2);
                if (viewL != null && f0Var.d(viewL) >= 0) {
                    k0Var.m(view, viewL);
                    l0Var.a(viewL);
                }
                if (i11 < 0) {
                    break;
                } else {
                    size2 = i11;
                }
            }
        }
        int size3 = arrayList.size() - 1;
        if (size3 < 0) {
            return;
        }
        while (true) {
            int i12 = size3 - 1;
            View view2 = (View) arrayList.get(size3);
            if (((View) k0Var.g(view2)) != null && !l0Var.c(view2)) {
                View view3 = view2;
                while (view2 != null) {
                    o.k0 k0Var2 = this.f9982c;
                    View view4 = (View) k0Var2.g(view2);
                    if (view4 != null) {
                        if (view4 == view3) {
                            break;
                        }
                        view2 = view3;
                        view3 = view4;
                    }
                    k0Var2.m(view2, view3);
                    view2 = (View) k0Var.g(view2);
                }
            }
            if (i12 < 0) {
                return;
            } else {
                size3 = i12;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view == view2) {
            return 0;
        }
        if (view == null) {
            return -1;
        }
        if (view2 == null) {
            return 1;
        }
        o.k0 k0Var = this.f9982c;
        View view3 = (View) k0Var.g(view);
        View view4 = (View) k0Var.g(view2);
        if (view3 == view4 && view3 != null) {
            if (view == view3) {
                return -1;
            }
            return (view2 == view3 || this.f9980a.g(view) == null) ? 1 : -1;
        }
        if (view3 != null) {
            view = view3;
        }
        if (view4 != null) {
            view2 = view4;
        }
        if (view3 == null && view4 == null) {
            return 0;
        }
        o.f0 f0Var = this.f9983d;
        return f0Var.e(view) < f0Var.e(view2) ? -1 : 1;
    }
}
