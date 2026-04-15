package sc;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends n7.d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f19809p;

    public i(Class cls) {
        jc.l.e(cls, "jClass");
        Object[] declaredMethods = cls.getDeclaredMethods();
        jc.l.d(declaredMethods, "getDeclaredMethods(...)");
        h hVar = new h(0);
        if (declaredMethods.length != 0) {
            declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
            jc.l.d(declaredMethods, "copyOf(...)");
            vb.l.K0(declaredMethods, hVar);
        }
        this.f19809p = vb.l.c0(declaredMethods);
    }

    @Override // n7.d
    public final String a() {
        return vb.m.f0(this.f19809p, "", "<init>(", ")V", c.f19768g, 24);
    }
}
