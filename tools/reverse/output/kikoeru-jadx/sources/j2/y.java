package j2;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.cnl.kikoeru.R;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10097b;

    public /* synthetic */ y(int i10, Object obj) {
        this.f10096a = i10;
        this.f10097b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f10096a) {
            case 0:
                d0 d0Var = (d0) this.f10097b;
                AccessibilityManager accessibilityManager = d0Var.f9772g;
                d0Var.f9776k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                accessibilityManager.addAccessibilityStateChangeListener(d0Var.f9774i);
                accessibilityManager.addTouchExplorationStateChangeListener(d0Var.f9775j);
                break;
            case 1:
            case 2:
                break;
            default:
                q1.e eVar = (q1.e) this.f10097b;
                Context context = view.getContext();
                if (!eVar.f17503d) {
                    context.getApplicationContext().registerComponentCallbacks(eVar.f17504e);
                    eVar.f17503d = true;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z10;
        switch (this.f10096a) {
            case 0:
                d0 d0Var = (d0) this.f10097b;
                d0Var.f9777l.removeCallbacks(d0Var.N);
                AccessibilityManager accessibilityManager = d0Var.f9772g;
                accessibilityManager.removeAccessibilityStateChangeListener(d0Var.f9774i);
                accessibilityManager.removeTouchExplorationStateChangeListener(d0Var.f9775j);
                break;
            case 1:
                a aVar = (a) this.f10097b;
                Iterator it = df.m.b0(aVar.getParent(), u3.u.f21334i).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            jc.l.e(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z10 = true;
                            }
                        }
                    }
                }
                if (!z10) {
                    aVar.d();
                }
                break;
            case 2:
                view.removeOnAttachStateChangeListener(this);
                ((hf.r1) this.f10097b).g(null);
                break;
            default:
                q1.e eVar = (q1.e) this.f10097b;
                Context context = view.getContext();
                if (eVar.f17503d) {
                    context.getApplicationContext().unregisterComponentCallbacks(eVar.f17504e);
                    eVar.f17503d = false;
                }
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
