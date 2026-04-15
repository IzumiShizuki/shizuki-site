package qf;

import ic.o;
import jc.j;
import jc.l;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a extends j implements o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f18228i = new a(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj;
        f fVar = (f) obj2;
        long j10 = bVar.f18229a;
        a0 a0Var = a0.f21526a;
        if (j10 <= 0) {
            ((e) fVar).f18248e = a0Var;
            return a0Var;
        }
        b5.h hVar = new b5.h(25, fVar, bVar);
        l.c(fVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        e eVar = (e) fVar;
        yb.h hVar2 = eVar.f18244a;
        eVar.f18246c = hf.a0.p(hVar2).O(j10, hVar, hVar2);
        return a0Var;
    }
}
