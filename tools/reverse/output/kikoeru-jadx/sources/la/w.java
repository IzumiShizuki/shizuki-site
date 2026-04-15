package la;

import bg.a2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f12132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1.q f12133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f12134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ic.a f12135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ic.n f12136f;

    public /* synthetic */ w(a2 a2Var, j1.q qVar, List list, ic.a aVar, ic.n nVar, int i10, int i11) {
        this.f12131a = i11;
        this.f12132b = a2Var;
        this.f12133c = qVar;
        this.f12134d = list;
        this.f12135e = aVar;
        this.f12136f = nVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f12131a) {
            case 0:
                ((Integer) obj2).getClass();
                int iD = x0.v.D(1);
                d0.e(this.f12132b, this.f12133c, this.f12134d, this.f12135e, this.f12136f, (x0.o) obj, iD);
                break;
            default:
                ((Integer) obj2).getClass();
                int iD2 = x0.v.D(1);
                d0.a(this.f12132b, this.f12133c, this.f12134d, this.f12135e, this.f12136f, (x0.o) obj, iD2);
                break;
        }
        return ub.a0.f21526a;
    }
}
