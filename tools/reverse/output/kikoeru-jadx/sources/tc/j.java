package tc;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends m implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f20648e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Field field, Object obj) {
        super(field, false);
        jc.l.e(field, "field");
        this.f20648e = obj;
    }

    @Override // tc.m, tc.g
    public final Object d(Object[] objArr) {
        jc.l.e(objArr, "args");
        e(objArr);
        return ((Field) this.f20659a).get(this.f20648e);
    }
}
