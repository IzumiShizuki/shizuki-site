package j2;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x0.e1 f9845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9846j;

    public k1(Context context) {
        super(context);
        this.f9845i = x0.v.v(null);
    }

    @Override // j2.a
    public final void a(int i10, x0.o oVar) {
        oVar.Y(420213850);
        int i11 = (oVar.h(this) ? 4 : 2) | i10;
        if (oVar.N(i11 & 1, (i11 & 3) != 2)) {
            ic.n nVar = (ic.n) this.f9845i.getValue();
            if (nVar == null) {
                oVar.W(-1238798753);
            } else {
                oVar.W(98586082);
                nVar.q(oVar, 0);
            }
            oVar.p(false);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.d(i10, 10, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return k1.class.getName();
    }

    @Override // j2.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f9846j;
    }

    public final void setContent(ic.n nVar) {
        this.f9846j = true;
        this.f9845i.setValue(nVar);
        if (isAttachedToWindow()) {
            if (this.f9710d == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            e();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
