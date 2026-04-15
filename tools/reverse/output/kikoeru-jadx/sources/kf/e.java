package kf;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e extends jc.j implements ic.o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f11344i = new e(3, f.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        f fVar = (f) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f.f11345b;
        fVar.getClass();
        if (obj3 == h.f11367l) {
            obj3 = new k(fVar.r());
        }
        return new m(obj3);
    }
}
