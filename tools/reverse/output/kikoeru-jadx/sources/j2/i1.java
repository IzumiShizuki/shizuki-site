package j2;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i1 f9827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i1 f9828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i1 f9829e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9830b;

    static {
        int i10 = 2;
        f9827c = new i1(i10, 0);
        f9828d = new i1(i10, 1);
        f9829e = new i1(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(int i10, int i11) {
        super(i10);
        this.f9830b = i11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f9830b) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                }
                break;
            case 1:
                ((o1) obj).M((Matrix) obj2);
                break;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                break;
        }
        return ub.a0.f21526a;
    }
}
