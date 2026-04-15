package yf;

import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends ac.h implements ic.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ ub.b f26305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b7.m f26306e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(b7.m mVar, yb.c cVar) {
        super(3, cVar);
        this.f26306e = mVar;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        q qVar = new q(this.f26306e, (yb.c) obj3);
        qVar.f26305d = (ub.b) obj;
        return qVar.u(a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        b7.m mVar = this.f26306e;
        h7.k kVar = (h7.k) mVar.f1959c;
        ub.b bVar = this.f26305d;
        int i10 = this.f26304c;
        if (i10 == 0) {
            ub.a.f(obj);
            byte bX = kVar.x();
            if (bX == 1) {
                return mVar.t(true);
            }
            if (bX == 0) {
                return mVar.t(false);
            }
            if (bX != 6) {
                if (bX == 8) {
                    return mVar.r();
                }
                h7.k.q(kVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f26305d = null;
            this.f26304c = 1;
            obj = b7.m.e(mVar, bVar, this);
            zb.a aVar = zb.a.f26667a;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ub.a.f(obj);
        }
        return (xf.m) obj;
    }
}
