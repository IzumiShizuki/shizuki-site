package ed;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends b0 implements sd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WildcardType f6496a;

    public e0(WildcardType wildcardType) {
        this.f6496a = wildcardType;
    }

    @Override // ed.b0
    public final Type b() {
        return this.f6496a;
    }

    public final b0 c() {
        WildcardType wildcardType = this.f6496a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length == 1) {
            Object objI0 = vb.l.I0(lowerBounds);
            jc.l.d(objI0, "single(...)");
            Type type = (Type) objI0;
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new z(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) ? new i(type) : type instanceof WildcardType ? new e0((WildcardType) type) : new q(type);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        Type type2 = (Type) vb.l.I0(upperBounds);
        if (jc.l.a(type2, Object.class)) {
            return null;
        }
        jc.l.b(type2);
        boolean z11 = type2 instanceof Class;
        if (z11) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                return new z(cls2);
            }
        }
        return ((type2 instanceof GenericArrayType) || (z11 && ((Class) type2).isArray())) ? new i(type2) : type2 instanceof WildcardType ? new e0((WildcardType) type2) : new q(type2);
    }

    @Override // sd.b
    public final Collection getAnnotations() {
        return vb.r.f22819a;
    }
}
