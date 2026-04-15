package i3;

import ub.a0;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8984b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1.q f8985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.k f8986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8987e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ic.k kVar, j1.q qVar, int i10) {
        super(2);
        this.f8986d = kVar;
        this.f8985c = qVar;
        this.f8987e = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f8984b;
        x0.o oVar = (x0.o) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                androidx.compose.ui.viewinterop.a.a(v.D(this.f8987e | 1), this.f8986d, this.f8985c, oVar);
                break;
            default:
                nh.b.a(v.D(this.f8987e | 1), this.f8986d, this.f8985c, oVar);
                break;
        }
        return a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j1.q qVar, ic.k kVar, int i10) {
        super(2);
        this.f8985c = qVar;
        this.f8986d = kVar;
        this.f8987e = i10;
    }
}
