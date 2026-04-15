package tc;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class z implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f20664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f20665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f20666c;

    public z(Method method, List list) {
        this.f20664a = method;
        this.f20665b = list;
        Class<?> returnType = method.getReturnType();
        jc.l.d(returnType, "getReturnType(...)");
        this.f20666c = returnType;
    }

    @Override // tc.g
    public final List a() {
        return this.f20665b;
    }

    @Override // tc.g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // tc.g
    public final /* bridge */ boolean c() {
        return false;
    }

    public final void e(Object[] objArr) {
        jc.l.e(objArr, "args");
        if (n7.d.q(this) == objArr.length) {
            return;
        }
        throw new IllegalArgumentException("Callable expects " + n7.d.q(this) + " arguments, but " + objArr.length + " were provided.");
    }

    @Override // tc.g
    public final Type n() {
        return this.f20666c;
    }
}
