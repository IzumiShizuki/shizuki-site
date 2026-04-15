package gb;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f7462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f7463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type[] f7464c;

    public b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type == null && (type2 instanceof Class)) {
            Class cls = (Class) type2;
            if (!Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
                throw new IllegalArgumentException("Must specify owner type for " + type2);
            }
        }
        this.f7462a = type == null ? null : d.a(type);
        this.f7463b = d.a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f7464c = typeArr2;
        int length = typeArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            Objects.requireNonNull(this.f7464c[i10]);
            d.c(this.f7464c[i10]);
            Type[] typeArr3 = this.f7464c;
            typeArr3[i10] = d.a(typeArr3[i10]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d.e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f7464c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f7462a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f7463b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f7464c) ^ this.f7463b.hashCode();
        Type type = this.f7462a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f7464c;
        int length = typeArr.length;
        Type type = this.f7463b;
        if (length == 0) {
            return d.k(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(d.k(type));
        sb.append("<");
        sb.append(d.k(typeArr[0]));
        for (int i10 = 1; i10 < length; i10++) {
            sb.append(", ");
            sb.append(d.k(typeArr[i10]));
        }
        sb.append(">");
        return sb.toString();
    }
}
