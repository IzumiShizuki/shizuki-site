package i7;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y1 implements lf.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lf.f f9385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9387d;

    public /* synthetic */ y1(lf.f fVar, Object obj, Object obj2, int i10) {
        this.f9384a = i10;
        this.f9385b = fVar;
        this.f9386c = obj;
        this.f9387d = obj2;
    }

    @Override // lf.f
    public final Object b(lf.g gVar, yb.c cVar) {
        switch (this.f9384a) {
            case 0:
                Object objB = this.f9385b.b(new f7.v(gVar, (Executor) this.f9386c, (a9.n) this.f9387d, 3), cVar);
                if (objB != zb.a.f26667a) {
                    break;
                }
                break;
            case 1:
                Object objB2 = this.f9385b.b(new f7.v(gVar, (x0.w0) this.f9386c, (x0.w0) this.f9387d), cVar);
                if (objB2 != zb.a.f26667a) {
                    break;
                }
                break;
            default:
                Object objB3 = this.f9385b.b(new f7.v(gVar, (n7.v) this.f9386c, (d9.i) this.f9387d, 10), cVar);
                if (objB3 != zb.a.f26667a) {
                    break;
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
