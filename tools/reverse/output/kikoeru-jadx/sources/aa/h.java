package aa;

import android.graphics.Rect;
import android.view.View;
import g2.c0;
import g2.n1;
import i2.v1;
import java.util.List;
import m0.f9;
import ub.a0;
import ub.q;
import x0.b1;
import x0.p1;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0 f294e;

    public /* synthetic */ h(int i10, hg.b bVar, List list, w0 w0Var) {
        this.f291b = i10;
        this.f292c = bVar;
        this.f293d = list;
        this.f294e = w0Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f290a) {
            case 0:
                hg.b bVar = (hg.b) this.f292c;
                List list = (List) this.f293d;
                w0 w0Var = this.f294e;
                int iIntValue = ((Number) w0Var.getValue()).intValue();
                int i10 = this.f291b;
                if (iIntValue != i10) {
                    w0Var.setValue(Integer.valueOf(i10));
                    bVar.d(((q) list.get(i10)).f21555c);
                    p1 p1Var = ja.d.f10800c;
                    if (p1Var != null) {
                        p1Var.c();
                    }
                }
                break;
            default:
                f9 f9Var = (f9) this.f292c;
                v1 v1Var = (v1) this.f293d;
                b1 b1Var = (b1) this.f294e;
                View view = f9Var.f13004a;
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                int i11 = rect.top;
                int i12 = rect.bottom;
                c0 c0Var = v1Var.f8881a;
                if (c0Var != null) {
                    b1Var.f(((int) Math.max(n1.g(c0Var).f16484b - i11, (i12 - i11) - n1.g(c0Var).f16486d)) - this.f291b);
                }
                break;
        }
        return a0.f21526a;
    }

    public /* synthetic */ h(f9 f9Var, v1 v1Var, int i10, b1 b1Var) {
        this.f292c = f9Var;
        this.f293d = v1Var;
        this.f291b = i10;
        this.f294e = b1Var;
    }
}
