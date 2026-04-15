package m7;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends u3.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0 f14869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakHashMap f14870e = new WeakHashMap();

    public f0(g0 g0Var) {
        this.f14869d = g0Var;
    }

    @Override // u3.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        u3.b bVar = (u3.b) this.f14870e.get(view);
        return bVar != null ? bVar.a(view, accessibilityEvent) : this.f21269a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // u3.b
    public final y1 b(View view) {
        u3.b bVar = (u3.b) this.f14870e.get(view);
        return bVar != null ? bVar.b(view) : super.b(view);
    }

    @Override // u3.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        u3.b bVar = (u3.b) this.f14870e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // u3.b
    public final void d(View view, v3.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f22380a;
        g0 g0Var = this.f14869d;
        RecyclerView recyclerView = g0Var.f14876d;
        RecyclerView recyclerView2 = g0Var.f14876d;
        boolean zQ = recyclerView.q();
        View.AccessibilityDelegate accessibilityDelegate = this.f21269a;
        if (zQ || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().getClass();
        RecyclerView.p(view);
        u3.b bVar = (u3.b) this.f14870e.get(view);
        if (bVar != null) {
            bVar.d(view, dVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // u3.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        u3.b bVar = (u3.b) this.f14870e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // u3.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        u3.b bVar = (u3.b) this.f14870e.get(viewGroup);
        return bVar != null ? bVar.f(viewGroup, view, accessibilityEvent) : this.f21269a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // u3.b
    public final boolean g(View view, int i10, Bundle bundle) {
        g0 g0Var = this.f14869d;
        RecyclerView recyclerView = g0Var.f14876d;
        RecyclerView recyclerView2 = g0Var.f14876d;
        if (recyclerView.q() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i10, bundle);
        }
        u3.b bVar = (u3.b) this.f14870e.get(view);
        if (bVar != null) {
            if (bVar.g(view, i10, bundle)) {
                return true;
            }
        } else if (super.g(view, i10, bundle)) {
            return true;
        }
        y yVar = recyclerView2.getLayoutManager().f14925b.f1025b;
        return false;
    }

    @Override // u3.b
    public final void h(View view, int i10) {
        u3.b bVar = (u3.b) this.f14870e.get(view);
        if (bVar != null) {
            bVar.h(view, i10);
        } else {
            super.h(view, i10);
        }
    }

    @Override // u3.b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        u3.b bVar = (u3.b) this.f14870e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
