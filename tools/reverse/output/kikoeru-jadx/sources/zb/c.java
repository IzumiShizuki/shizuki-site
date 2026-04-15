package zb;

import ic.n;
import jc.c0;
import jc.l;
import yb.h;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f26675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb.c f26676f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yb.c cVar, h hVar, n nVar, yb.c cVar2) {
        super(cVar, hVar);
        this.f26675e = nVar;
        this.f26676f = cVar2;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f26674d;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f26674d = 2;
            ub.a.f(obj);
            return obj;
        }
        this.f26674d = 1;
        ub.a.f(obj);
        n nVar = this.f26675e;
        l.c(nVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        c0.c(2, nVar);
        return nVar.q(this.f26676f, this);
    }
}
