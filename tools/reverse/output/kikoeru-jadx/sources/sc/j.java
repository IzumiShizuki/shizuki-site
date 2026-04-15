package sc;

import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends n7.d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Constructor f19812p;

    public j(Constructor constructor) {
        jc.l.e(constructor, "constructor");
        this.f19812p = constructor;
    }

    @Override // n7.d
    public final String a() {
        Class<?>[] parameterTypes = this.f19812p.getParameterTypes();
        jc.l.d(parameterTypes, "getParameterTypes(...)");
        return vb.l.D0(parameterTypes, "", "<init>(", ")V", c.f19769h, 24);
    }
}
