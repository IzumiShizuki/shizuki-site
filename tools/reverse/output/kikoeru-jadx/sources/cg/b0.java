package cg;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import m4.y0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f4003c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(v vVar, int i10) {
        super(1);
        this.f4002b = i10;
        this.f4003c = vVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        Object objB;
        switch (this.f4002b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                v vVar = this.f4003c;
                ((v4.v) vVar.f4113b).c2(zBooleanValue);
                vVar.V(false);
                vVar.T(false);
                break;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                g8.a.T("onValueChange " + fFloatValue, "EasyPlayerExtends");
                this.f4003c.H(fFloatValue);
                break;
            case 2:
                jc.l.e((Context) obj, "it");
                dg.a aVar = this.f4003c.f4131t;
                try {
                    ViewParent parent = aVar.getParent();
                    objB = null;
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(aVar);
                        objB = ub.a0.f21526a;
                    }
                } catch (Throwable th2) {
                    objB = ub.a.b(th2);
                }
                Throwable thA = ub.n.a(objB);
                if (thA != null) {
                    thA.printStackTrace();
                }
                break;
            case 3:
                long j10 = ((p1.b) obj).f16481a;
                g8.a.T("onDoubleTap", "GestureController");
                v vVar2 = this.f4003c;
                ((v4.v) vVar2.f4113b).c2(!((Boolean) vVar2.f4120i.getValue()).booleanValue());
                vVar2.V(false);
                vVar2.T(false);
                break;
            case 4:
                long j11 = ((p1.b) obj).f16481a;
                g8.a.T("onTap", "GestureController");
                v vVar3 = this.f4003c;
                if (((Boolean) vVar3.f4116e.getValue()).booleanValue()) {
                    vVar3.f4116e.setValue(Boolean.FALSE);
                } else {
                    vVar3.X();
                }
                break;
            default:
                long j12 = ((p1.b) obj).f16481a;
                v vVar4 = this.f4003c;
                y0 y0Var = vVar4.f4113b;
                float f10 = ((v4.v) y0Var).O1().f14581a;
                vVar4.f4126o = f10;
                ((androidx.lifecycle.q) y0Var).y1(f10 * 2);
                vVar4.f4125n.setValue(Boolean.TRUE);
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(v vVar, w0 w0Var) {
        super(1);
        this.f4002b = 3;
        this.f4003c = vVar;
    }
}
