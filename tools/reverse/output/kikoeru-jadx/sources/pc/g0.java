package pc;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements WildcardType, Type {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f16972c = new g0(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f16973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f16974b;

    public g0(Type type, Type type2) {
        this.f16973a = type;
        this.f16974b = type2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f16974b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f16974b;
        if (type != null) {
            return "? super " + f0.m(type);
        }
        Type type2 = this.f16973a;
        if (type2 == null || jc.l.a(type2, Object.class)) {
            return "?";
        }
        return "? extends " + f0.m(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f16973a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
