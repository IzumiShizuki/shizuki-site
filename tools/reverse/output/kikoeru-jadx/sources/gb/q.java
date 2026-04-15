package gb;

import g5.w;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f7509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7510c;

    public q(int i10, Method method) {
        this.f7509b = method;
        this.f7510c = i10;
    }

    @Override // gb.t
    public final Object a(Class cls) {
        String strP = w.p(cls);
        if (strP == null) {
            return this.f7509b.invoke(null, cls, Integer.valueOf(this.f7510c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strP));
    }
}
