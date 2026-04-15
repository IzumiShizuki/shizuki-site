package i3;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import j2.v;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f8995c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i10) {
        super(1);
        this.f8994b = i10;
        this.f8995c = oVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f8994b) {
            case 0:
                o1.a aVar = (o1.a) obj;
                o oVar = this.f8995c;
                View viewC = j.c(oVar);
                if (!viewC.isFocused() && !viewC.hasFocus()) {
                    if (!o1.f.y(viewC, o1.f.C(aVar.f16078a), j.b(((v) i2.f.z(oVar)).getFocusOwner(), i2.f.A(oVar), viewC))) {
                        aVar.f16079b = true;
                    }
                }
                return a0.f21526a;
            default:
                o1.a aVar2 = (o1.a) obj;
                o oVar2 = this.f8995c;
                View viewC2 = j.c(oVar2);
                if (viewC2.hasFocus()) {
                    o1.i focusOwner = ((v) i2.f.z(oVar2)).getFocusOwner();
                    View viewA = i2.f.A(oVar2);
                    if (viewC2 instanceof ViewGroup) {
                        Rect rectB = j.b(focusOwner, viewA, viewC2);
                        Integer numC = o1.f.C(aVar2.f16078a);
                        int iIntValue = numC != null ? numC.intValue() : 130;
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View view = oVar2.f8996o;
                        View viewFindNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) viewA, view, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewA, rectB, iIntValue);
                        if (viewFindNextFocus != null && j.a(viewC2, viewFindNextFocus)) {
                            viewFindNextFocus.requestFocus(iIntValue, rectB);
                            aVar2.f16079b = true;
                        } else if (!viewA.requestFocus()) {
                            throw new IllegalStateException("host view did not take focus");
                        }
                    } else if (!viewA.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                }
                return a0.f21526a;
        }
    }
}
