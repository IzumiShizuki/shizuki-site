package tc;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends w {
    /* JADX WARN: Illegal instructions before constructor call */
    public m(Field field, boolean z10) {
        Type genericType = field.getGenericType();
        jc.l.d(genericType, "getGenericType(...)");
        super(field, genericType, z10 ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // tc.g
    public Object d(Object[] objArr) {
        jc.l.e(objArr, "args");
        e(objArr);
        return ((Field) this.f20659a).get(this.f20661c != null ? vb.l.u0(objArr) : null);
    }
}
