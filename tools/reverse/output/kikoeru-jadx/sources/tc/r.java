package tc;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends q implements f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f20654g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Method method, Object obj) {
        super(method, false, 4);
        jc.l.e(method, "method");
        this.f20654g = obj;
    }

    @Override // tc.q, tc.g
    public final Object d(Object[] objArr) {
        jc.l.e(objArr, "args");
        e(objArr);
        return g(this.f20654g, objArr);
    }
}
