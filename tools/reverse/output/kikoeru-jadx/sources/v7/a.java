package v7;

import ic.k;
import ic.n;
import p7.l;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ac.i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f22742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f22743g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, k kVar, yb.c cVar) {
        super(2, cVar);
        this.f22741e = i10;
        this.f22743g = kVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f22741e) {
            case 0:
                a aVar = new a(0, this.f22743g, cVar);
                aVar.f22742f = obj;
                return aVar;
            default:
                a aVar2 = new a(1, this.f22743g, cVar);
                aVar2.f22742f = obj;
                return aVar2;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        l lVar = (l) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f22741e) {
        }
        return ((a) o(lVar, cVar)).u(a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f22741e;
        k kVar = this.f22743g;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                l lVar = (l) this.f22742f;
                jc.l.c(lVar, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return kVar.a(lVar.c());
            default:
                ub.a.f(obj);
                l lVar2 = (l) this.f22742f;
                jc.l.c(lVar2, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return kVar.a(lVar2.c());
        }
    }
}
