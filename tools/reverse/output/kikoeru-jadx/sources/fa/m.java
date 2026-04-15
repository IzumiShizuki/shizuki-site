package fa;

import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f7016c;

    public /* synthetic */ m(long j10, String str, int i10, int i11) {
        this.f7014a = i11;
        this.f7015b = str;
        this.f7016c = j10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f7014a;
        x0.o oVar = (x0.o) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                t.i(this.f7015b, this.f7016c, oVar, x0.v.D(1));
                break;
            default:
                y8.e.a(this.f7015b, this.f7016c, oVar, x0.v.D(1));
                break;
        }
        return a0.f21526a;
    }
}
