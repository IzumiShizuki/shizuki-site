package m7;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends u3.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f14876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f0 f14877e;

    public g0(RecyclerView recyclerView) {
        this.f14876d = recyclerView;
        f0 f0Var = this.f14877e;
        if (f0Var != null) {
            this.f14877e = f0Var;
        } else {
            this.f14877e = new f0(this);
        }
    }

    @Override // u3.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f14876d.q()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().B(accessibilityEvent);
        }
    }

    @Override // u3.b
    public final void d(View view, v3.d dVar) {
        this.f21269a.onInitializeAccessibilityNodeInfo(view, dVar.f22380a);
        RecyclerView recyclerView = this.f14876d;
        if (recyclerView.q() || recyclerView.getLayoutManager() == null) {
            return;
        }
        s layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f14925b;
        layoutManager.C(recyclerView2.f1025b, recyclerView2.V, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3 A[ADDED_TO_REGION] */
    @Override // u3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(android.view.View r6, int r7, android.os.Bundle r8) {
        /*
            r5 = this;
            boolean r6 = super.g(r6, r7, r8)
            r8 = 1
            if (r6 == 0) goto L8
            return r8
        L8:
            androidx.recyclerview.widget.RecyclerView r6 = r5.f14876d
            boolean r0 = r6.q()
            r1 = 0
            if (r0 != 0) goto Lac
            m7.s r0 = r6.getLayoutManager()
            if (r0 == 0) goto Lac
            m7.s r6 = r6.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r6.f14925b
            m7.y r0 = r0.f1025b
            int r0 = r6.f14930g
            int r2 = r6.f14929f
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            androidx.recyclerview.widget.RecyclerView r4 = r6.f14925b
            android.graphics.Matrix r4 = r4.getMatrix()
            boolean r4 = r4.isIdentity()
            if (r4 == 0) goto L44
            androidx.recyclerview.widget.RecyclerView r4 = r6.f14925b
            boolean r4 = r4.getGlobalVisibleRect(r3)
            if (r4 == 0) goto L44
            int r0 = r3.height()
            int r2 = r3.width()
        L44:
            r3 = 4096(0x1000, float:5.74E-42)
            if (r7 == r3) goto L79
            r3 = 8192(0x2000, float:1.148E-41)
            if (r7 == r3) goto L4f
            r7 = 0
        L4d:
            r0 = 0
            goto La1
        L4f:
            androidx.recyclerview.widget.RecyclerView r7 = r6.f14925b
            r3 = -1
            boolean r7 = r7.canScrollVertically(r3)
            if (r7 == 0) goto L64
            int r7 = r6.u()
            int r0 = r0 - r7
            int r7 = r6.r()
            int r0 = r0 - r7
            int r7 = -r0
            goto L65
        L64:
            r7 = 0
        L65:
            androidx.recyclerview.widget.RecyclerView r0 = r6.f14925b
            boolean r0 = r0.canScrollHorizontally(r3)
            if (r0 == 0) goto L4d
            int r0 = r6.s()
            int r2 = r2 - r0
            int r0 = r6.t()
            int r2 = r2 - r0
            int r0 = -r2
            goto La1
        L79:
            androidx.recyclerview.widget.RecyclerView r7 = r6.f14925b
            boolean r7 = r7.canScrollVertically(r8)
            if (r7 == 0) goto L8d
            int r7 = r6.u()
            int r0 = r0 - r7
            int r7 = r6.r()
            int r0 = r0 - r7
            r7 = r0
            goto L8e
        L8d:
            r7 = 0
        L8e:
            androidx.recyclerview.widget.RecyclerView r0 = r6.f14925b
            boolean r0 = r0.canScrollHorizontally(r8)
            if (r0 == 0) goto L4d
            int r0 = r6.s()
            int r2 = r2 - r0
            int r0 = r6.t()
            int r0 = r2 - r0
        La1:
            if (r7 != 0) goto La6
            if (r0 != 0) goto La6
            goto Lac
        La6:
            androidx.recyclerview.widget.RecyclerView r6 = r6.f14925b
            r6.z(r0, r7, r8)
            return r8
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.g0.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
