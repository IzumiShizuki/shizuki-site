package t0;

import a9.r;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ac.i implements ic.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f20121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f20122g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, float f10, yb.c cVar) {
        super(1, cVar);
        this.f20121f = jVar;
        this.f20122g = f10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        return new i(this.f20121f, this.f20122g, (yb.c) obj).u(a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f20120e;
        if (i10 == 0) {
            ub.a.f(obj);
            j jVar = this.f20121f;
            float fE = jVar.f20127e.e();
            r rVar = new r(19, jVar);
            this.f20120e = 1;
            Object objE = r.d.e(fE, this.f20122g, null, rVar, this, 12);
            zb.a aVar = zb.a.f26667a;
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ub.a.f(obj);
        }
        return a0.f21526a;
    }
}
