package v7;

import hf.y;
import ic.k;
import ic.n;
import n7.v;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ac.i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22752e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v f22754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f22755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f22756i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f22757j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(v vVar, boolean z10, boolean z11, k kVar, yb.c cVar) {
        super(2, cVar);
        this.f22754g = vVar;
        this.f22755h = z10;
        this.f22756i = z11;
        this.f22757j = kVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f22752e) {
            case 0:
                return new c(this.f22754g, this.f22755h, this.f22756i, this.f22757j, cVar);
            default:
                return new c(cVar, this.f22754g, this.f22755h, this.f22756i, this.f22757j);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        y yVar = (y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f22752e) {
        }
        return ((c) o(yVar, cVar)).u(a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f22752e) {
            case 0:
                int i10 = this.f22753f;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return obj;
                }
                ub.a.f(obj);
                v vVar = this.f22754g;
                boolean z10 = !(vVar.j() && vVar.k()) && this.f22755h;
                boolean z11 = this.f22756i;
                v vVar2 = this.f22754g;
                b bVar = new b(z10, z11, vVar2, null, this.f22757j, 0);
                this.f22753f = 1;
                Object objN = vVar2.n(z11, bVar, this);
                zb.a aVar = zb.a.f26667a;
                return objN == aVar ? aVar : objN;
            default:
                int i11 = this.f22753f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return obj;
                }
                ub.a.f(obj);
                k kVar = this.f22757j;
                boolean z12 = this.f22756i;
                boolean z13 = this.f22755h;
                v vVar3 = this.f22754g;
                b bVar2 = new b(z12, z13, vVar3, null, kVar, 1);
                this.f22753f = 1;
                Object objN2 = vVar3.n(z13, bVar2, this);
                zb.a aVar2 = zb.a.f26667a;
                return objN2 == aVar2 ? aVar2 : objN2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yb.c cVar, v vVar, boolean z10, boolean z11, k kVar) {
        super(2, cVar);
        this.f22754g = vVar;
        this.f22755h = z10;
        this.f22756i = z11;
        this.f22757j = kVar;
    }
}
