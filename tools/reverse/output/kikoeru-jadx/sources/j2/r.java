package j2;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f9971c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(v vVar, int i10) {
        super(1);
        this.f9970b = i10;
        this.f9971c = vVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        o1.d dVar;
        switch (this.f9970b) {
            case 0:
                KeyEvent keyEvent = ((a2.b) obj).f188a;
                long jL = a2.c.L(keyEvent);
                if (a2.a.a(jL, a2.a.f171b)) {
                    dVar = new o1.d(2);
                } else if (a2.a.a(jL, a2.a.f172c)) {
                    dVar = new o1.d(1);
                } else if (a2.a.a(jL, a2.a.f178i)) {
                    dVar = new o1.d(keyEvent.isShiftPressed() ? 2 : 1);
                } else {
                    dVar = a2.a.a(jL, a2.a.f176g) ? new o1.d(4) : a2.a.a(jL, a2.a.f175f) ? new o1.d(3) : (a2.a.a(jL, a2.a.f173d) || a2.a.a(jL, a2.a.f184o)) ? new o1.d(5) : (a2.a.a(jL, a2.a.f174e) || a2.a.a(jL, a2.a.f185p)) ? new o1.d(6) : (a2.a.a(jL, a2.a.f177h) || a2.a.a(jL, a2.a.f180k) || a2.a.a(jL, a2.a.f186q)) ? new o1.d(7) : (a2.a.a(jL, a2.a.f170a) || a2.a.a(jL, a2.a.f181l)) ? new o1.d(8) : null;
                }
                if (dVar != null) {
                    int i10 = dVar.f16086a;
                    if (a2.c.O(keyEvent) == 2) {
                        Integer numC = o1.f.C(i10);
                        v vVar = this.f9971c;
                        p1.c embeddedViewFocusRect = vVar.getEmbeddedViewFocusRect();
                        Boolean boolE = ((o1.k) vVar.getFocusOwner()).e(i10, embeddedViewFocusRect, new q(dVar, 1));
                        if (boolE != null ? boolE.booleanValue() : true) {
                            return Boolean.TRUE;
                        }
                        if (!(i10 == 1 || i10 == 2)) {
                            return Boolean.FALSE;
                        }
                        if (numC != null) {
                            int iIntValue = numC.intValue();
                            Object obj2 = t1.f10004f.get();
                            jc.l.b(obj2);
                            t1 t1Var = (t1) obj2;
                            View viewB = vVar;
                            while (true) {
                                if (viewB != null) {
                                    View rootView = vVar.getRootView();
                                    jc.l.c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                                    viewB = t1Var.b((ViewGroup) rootView, viewB, iIntValue);
                                    if (viewB != null) {
                                        if (!viewB.equals(vVar)) {
                                            for (ViewParent parent = viewB.getParent(); parent != null; parent = parent.getParent()) {
                                                if (parent == vVar) {
                                                }
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    viewB = null;
                                }
                            }
                            if (jc.l.a(viewB, vVar)) {
                                viewB = null;
                            }
                            if (viewB != null) {
                                Rect rectZ = embeddedViewFocusRect != null ? q1.h0.z(embeddedViewFocusRect) : null;
                                if (rectZ == null) {
                                    throw new IllegalStateException("Invalid rect");
                                }
                                View rootView2 = vVar.getRootView();
                                jc.l.c(rootView2, "null cannot be cast to non-null type android.view.ViewGroup");
                                ViewGroup viewGroup = (ViewGroup) rootView2;
                                viewGroup.offsetDescendantRectToMyCoords(vVar, rectZ);
                                viewGroup.offsetRectIntoDescendantCoords(viewB, rectZ);
                                if (o1.f.y(viewB, numC, rectZ)) {
                                    return Boolean.TRUE;
                                }
                            }
                        }
                        if (!((o1.k) vVar.getFocusOwner()).b(false, i10, false)) {
                            return Boolean.TRUE;
                        }
                        Boolean boolE2 = ((o1.k) vVar.getFocusOwner()).e(i10, null, new q(dVar, 0));
                        return Boolean.valueOf(boolE2 != null ? boolE2.booleanValue() : true);
                    }
                }
                return Boolean.FALSE;
            case 1:
                ic.a aVar = (ic.a) obj;
                v vVar2 = this.f9971c;
                Handler handler = vVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.b();
                } else {
                    Handler handler2 = vVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new i3.a(3, aVar));
                    }
                }
                return ub.a0.f21526a;
            default:
                v vVar3 = this.f9971c;
                return new q0(vVar3, vVar3.getTextInputService(), (hf.y) obj);
        }
    }
}
