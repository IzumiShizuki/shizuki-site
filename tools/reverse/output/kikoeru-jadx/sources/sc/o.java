package sc;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n7.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Method f19839o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Method f19840p;

    public o(Method method, Method method2) {
        jc.l.e(method, "getterMethod");
        this.f19839o = method;
        this.f19840p = method2;
    }

    @Override // n7.e
    public final String d() {
        return nh.b.e(this.f19839o);
    }
}
