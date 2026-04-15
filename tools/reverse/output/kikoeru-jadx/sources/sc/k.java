package sc;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends n7.d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Method f19816p;

    public k(Method method) {
        jc.l.e(method, "method");
        this.f19816p = method;
    }

    @Override // n7.d
    public final String a() {
        return nh.b.e(this.f19816p);
    }
}
