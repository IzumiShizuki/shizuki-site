package i3;

import android.view.View;
import android.view.ViewGroup;
import g2.v0;
import g2.w0;
import g2.x0;
import g2.y;
import i2.j0;
import j3.u;
import java.util.List;
import m0.l3;
import vb.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f8942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8943c;

    public /* synthetic */ e(ViewGroup viewGroup, Object obj, int i10) {
        this.f8941a = i10;
        this.f8942b = viewGroup;
        this.f8943c = obj;
    }

    @Override // g2.v0
    public final int c(y yVar, List list, int i10) {
        switch (this.f8941a) {
            case 0:
                q qVar = (q) this.f8942b;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
                jc.l.b(layoutParams);
                qVar.measure(iMakeMeasureSpec, h.e(qVar, 0, i10, layoutParams.height));
                break;
        }
        return a0.c.f(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final int f(y yVar, List list, int i10) {
        switch (this.f8941a) {
            case 0:
                q qVar = (q) this.f8942b;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
                jc.l.b(layoutParams);
                qVar.measure(iMakeMeasureSpec, h.e(qVar, 0, i10, layoutParams.height));
                break;
        }
        return a0.c.m(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final int g(y yVar, List list, int i10) {
        switch (this.f8941a) {
            case 0:
                q qVar = (q) this.f8942b;
                ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
                jc.l.b(layoutParams);
                qVar.measure(h.e(qVar, 0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                break;
        }
        return a0.c.j(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final w0 h(x0 x0Var, List list, long j10) {
        switch (this.f8941a) {
            case 0:
                q qVar = (q) this.f8942b;
                int childCount = qVar.getChildCount();
                s sVar = s.f22820a;
                if (childCount == 0) {
                    return x0Var.b0(f3.a.j(j10), f3.a.i(j10), sVar, c.f8934d);
                }
                if (f3.a.j(j10) != 0) {
                    qVar.getChildAt(0).setMinimumWidth(f3.a.j(j10));
                }
                if (f3.a.i(j10) != 0) {
                    qVar.getChildAt(0).setMinimumHeight(f3.a.i(j10));
                }
                int iJ = f3.a.j(j10);
                int iH = f3.a.h(j10);
                ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
                jc.l.b(layoutParams);
                int iE = h.e(qVar, iJ, iH, layoutParams.width);
                int i10 = f3.a.i(j10);
                int iG = f3.a.g(j10);
                ViewGroup.LayoutParams layoutParams2 = qVar.getLayoutParams();
                jc.l.b(layoutParams2);
                qVar.measure(iE, h.e(qVar, i10, iG, layoutParams2.height));
                return x0Var.b0(qVar.getMeasuredWidth(), qVar.getMeasuredHeight(), sVar, new d(qVar, (j0) this.f8943c, 1));
            case 1:
                ((u) this.f8942b).setParentLayoutDirection((f3.m) this.f8943c);
                return x0Var.b0(0, 0, s.f22820a, j3.c.f10117e);
            default:
                ((s0.i) this.f8942b).f19332n = (f3.m) this.f8943c;
                return x0Var.b0(0, 0, s.f22820a, new l3(27));
        }
    }

    @Override // g2.v0
    public final int i(y yVar, List list, int i10) {
        switch (this.f8941a) {
            case 0:
                q qVar = (q) this.f8942b;
                ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
                jc.l.b(layoutParams);
                qVar.measure(h.e(qVar, 0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                break;
        }
        return a0.c.c(this, yVar, list, i10);
    }
}
