package v0;

import g2.f1;
import g2.g1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f22253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22255e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i10, int i11, g1 g1Var) {
        super(1);
        this.f22252b = 0;
        this.f22254d = i10;
        this.f22253c = g1Var;
        this.f22255e = i11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f22252b) {
            case 0:
                ((f1) obj).h(this.f22253c, lc.b.R((this.f22254d - r0.f7180a) / 2.0f), lc.b.R((this.f22255e - r0.f7181b) / 2.0f), 0.0f);
                break;
            case 1:
                ((f1) obj).h(this.f22253c, this.f22254d, this.f22255e, 0.0f);
                break;
            default:
                ((f1) obj).h(this.f22253c, this.f22254d, this.f22255e, 0.0f);
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(g1 g1Var, int i10, int i11, int i12) {
        super(1);
        this.f22252b = i12;
        this.f22253c = g1Var;
        this.f22254d = i10;
        this.f22255e = i11;
    }
}
