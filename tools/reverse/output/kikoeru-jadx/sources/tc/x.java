package tc;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends z implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f20663d;

    public x(Method method, Object obj) {
        super(method, vb.r.f22819a);
        this.f20663d = obj;
    }

    @Override // tc.g
    public final Object d(Object[] objArr) {
        jc.l.e(objArr, "args");
        e(objArr);
        return this.f20664a.invoke(this.f20663d, Arrays.copyOf(objArr, objArr.length));
    }
}
