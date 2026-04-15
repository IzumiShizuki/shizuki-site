package i3;

import android.view.View;
import android.view.ViewGroup;
import g2.n1;
import i2.u;
import java.util.List;
import m0.w;
import u3.e0;
import u3.v;
import u3.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f8932d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ViewGroup viewGroup, int i10) {
        super(1);
        this.f8931c = i10;
        this.f8932d = viewGroup;
    }

    @Override // u3.v
    public final w0 d(w0 w0Var, List list) {
        switch (this.f8931c) {
            case 0:
                return ((q) this.f8932d).g(w0Var);
            default:
                j3.p pVar = (j3.p) this.f8932d;
                if (pVar.f10153l) {
                    return w0Var;
                }
                View childAt = pVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, pVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, pVar.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? w0Var : w0Var.f21343a.n(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // u3.v
    public final w e(e0 e0Var, w wVar) {
        switch (this.f8931c) {
            case 0:
                u uVar = ((q) this.f8932d).f8974y.F.f8664c;
                if (!uVar.R.f9703n) {
                    return wVar;
                }
                long jX = android.support.v4.media.session.b.X(uVar.H(0L));
                int i10 = (int) (jX >> 32);
                if (i10 < 0) {
                    i10 = 0;
                }
                int i11 = (int) (jX & 4294967295L);
                if (i11 < 0) {
                    i11 = 0;
                }
                long jK = n1.i(uVar).k();
                int i12 = (int) (jK & 4294967295L);
                long j10 = uVar.f7182c;
                long jX2 = android.support.v4.media.session.b.X(uVar.H((((long) Float.floatToRawIntBits((int) (j10 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j10 >> 32))) << 32)));
                int i13 = ((int) (jK >> 32)) - ((int) (jX2 >> 32));
                if (i13 < 0) {
                    i13 = 0;
                }
                int i14 = i12 - ((int) (jX2 & 4294967295L));
                int i15 = i14 < 0 ? 0 : i14;
                if (i10 == 0 && i11 == 0 && i13 == 0 && i15 == 0) {
                    return wVar;
                }
                return new w(25, h.f((p3.b) wVar.f13782b, i10, i11, i13, i15), h.f((p3.b) wVar.f13783c, i10, i11, i13, i15));
            default:
                j3.p pVar = (j3.p) this.f8932d;
                if (pVar.f10153l) {
                    return wVar;
                }
                View childAt = pVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, pVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, pVar.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return wVar;
                }
                p3.b bVarB = p3.b.b(iMax, iMax2, iMax3, iMax4);
                int i16 = bVarB.f16525a;
                p3.b bVar = (p3.b) wVar.f13782b;
                int i17 = bVarB.f16526b;
                int i18 = bVarB.f16527c;
                int i19 = bVarB.f16528d;
                return new w(25, w0.a(bVar, i16, i17, i18, i19), w0.a((p3.b) wVar.f13783c, i16, i17, i18, i19));
        }
    }
}
