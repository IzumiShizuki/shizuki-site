package r9;

import ic.n;
import ub.a0;
import x0.o;
import x0.v;
import y.d1;
import y.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18976c;

    public /* synthetic */ e(int i10, int i11, Object obj) {
        this.f18974a = i11;
        this.f18976c = obj;
        this.f18975b = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f18974a) {
            case 0:
                ((Integer) obj2).intValue();
                f.a((d1) this.f18976c, (o) obj, v.D(this.f18975b | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                t9.e.c((k1) this.f18976c, (o) obj, v.D(this.f18975b | 1));
                break;
        }
        return a0.f21526a;
    }
}
