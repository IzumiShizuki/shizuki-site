package tc;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v extends q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20658g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Method method, boolean z10, int i10, int i11) {
        super(method, z10, i10);
        this.f20658g = i11;
    }

    @Override // tc.q, tc.g
    public final Object d(Object[] objArr) {
        switch (this.f20658g) {
            case 0:
                jc.l.e(objArr, "args");
                e(objArr);
                return g(objArr[0], objArr.length <= 1 ? new Object[0] : vb.l.o0(1, objArr.length, objArr));
            case 1:
                jc.l.e(objArr, "args");
                e(objArr);
                f(vb.l.v0(objArr));
                return g(null, objArr.length <= 1 ? new Object[0] : vb.l.o0(1, objArr.length, objArr));
            default:
                jc.l.e(objArr, "args");
                e(objArr);
                return g(null, objArr);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Method method) {
        super(method, false, 6);
        this.f20658g = 0;
        jc.l.e(method, "method");
    }
}
