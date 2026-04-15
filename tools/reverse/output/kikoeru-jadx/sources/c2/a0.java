package c2;

import android.view.MotionEvent;
import i2.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3.q f3244c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(i3.q qVar, int i10) {
        super(1);
        this.f3243b = i10;
        this.f3244c = qVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f3243b) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                i3.q qVar = this.f3244c;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = qVar.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = qVar.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
            default:
                p1 p1Var = (p1) obj;
                j2.v vVar = p1Var instanceof j2.v ? (j2.v) p1Var : null;
                i3.q qVar2 = this.f3244c;
                if (vVar != null) {
                    vVar.getAndroidViewsHandler$ui_release().removeViewInLayout(qVar2);
                    jc.c0.a(vVar.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder()).remove(vVar.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(qVar2));
                    qVar2.setImportantForAccessibility(0);
                }
                qVar2.removeAllViewsInLayout();
                return ub.a0.f21526a;
        }
    }
}
