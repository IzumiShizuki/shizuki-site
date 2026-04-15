package tc;

import hd.q0;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t extends q implements f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f20656h;

    /* JADX WARN: Illegal instructions before constructor call */
    public t(Method method, boolean z10, Object obj) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        jc.l.d(genericParameterTypes, "getGenericParameterTypes(...)");
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : vb.l.o0(1, genericParameterTypes.length, genericParameterTypes)));
        this.f20655g = z10;
        this.f20656h = obj;
    }

    @Override // tc.q, tc.g
    public final Object d(Object[] objArr) {
        jc.l.e(objArr, "args");
        e(objArr);
        q0 q0Var = new q0(2);
        q0Var.f(this.f20656h);
        q0Var.i(objArr);
        ArrayList arrayList = q0Var.f8447b;
        return g(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
