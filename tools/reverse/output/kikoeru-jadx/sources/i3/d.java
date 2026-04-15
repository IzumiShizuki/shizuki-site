package i3;

import android.view.WindowInsets;
import g2.c0;
import i2.j0;
import i2.p1;
import j2.v;
import java.util.HashMap;
import u3.s;
import u3.w0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f8939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f8940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(q qVar, j0 j0Var, int i10) {
        super(1);
        this.f8938b = i10;
        this.f8939c = qVar;
        this.f8940d = j0Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        WindowInsets windowInsetsB;
        switch (this.f8938b) {
            case 0:
                p1 p1Var = (p1) obj;
                v vVar = p1Var instanceof v ? (v) p1Var : null;
                q qVar = this.f8939c;
                if (vVar != null) {
                    HashMap<h, j0> holderToLayoutNode = vVar.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                    j0 j0Var = this.f8940d;
                    holderToLayoutNode.put(qVar, j0Var);
                    vVar.getAndroidViewsHandler$ui_release().addView(qVar);
                    vVar.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(j0Var, qVar);
                    qVar.setImportantForAccessibility(1);
                    s.b(qVar, new j2.o(vVar, j0Var, vVar));
                }
                if (qVar.getView().getParent() != qVar) {
                    qVar.addView(qVar.getView());
                }
                break;
            case 1:
                j.d(this.f8939c, this.f8940d);
                break;
            default:
                j0 j0Var2 = this.f8940d;
                q qVar2 = this.f8939c;
                j.d(qVar2, j0Var2);
                ((v) qVar2.f8952c).A = true;
                int[] iArr = qVar2.f8963n;
                int i10 = iArr[0];
                int i11 = iArr[1];
                qVar2.getView().getLocationOnScreen(iArr);
                long j10 = qVar2.f8964o;
                long jK = ((c0) obj).k();
                qVar2.f8964o = jK;
                w0 w0Var = qVar2.f8965p;
                if (w0Var != null && ((i10 != iArr[0] || i11 != iArr[1] || !f3.l.b(j10, jK)) && (windowInsetsB = qVar2.g(w0Var).b()) != null)) {
                    qVar2.getView().dispatchApplyWindowInsets(windowInsetsB);
                }
                break;
        }
        return a0.f21526a;
    }
}
