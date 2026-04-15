package tc;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends q implements f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f20650g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Field field, boolean z10, Object obj) {
        super(field, z10, false);
        jc.l.e(field, "field");
        this.f20650g = obj;
    }

    @Override // tc.q, tc.g
    public final Object d(Object[] objArr) throws IllegalAccessException {
        jc.l.e(objArr, "args");
        e(objArr);
        ((Field) this.f20659a).set(this.f20650g, vb.l.u0(objArr));
        return ub.a0.f21526a;
    }
}
