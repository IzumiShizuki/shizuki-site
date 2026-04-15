package pc;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements ParameterizedType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f16965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f16966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type[] f16967c;

    public b0(Class cls, Type type, ArrayList arrayList) {
        this.f16965a = cls;
        this.f16966b = type;
        this.f16967c = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return jc.l.a(this.f16965a, parameterizedType.getRawType()) && jc.l.a(this.f16966b, parameterizedType.getOwnerType()) && Arrays.equals(this.f16967c, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f16967c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f16966b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f16965a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.f16965a;
        Type type = this.f16966b;
        if (type != null) {
            sb.append(f0.m(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(f0.m(cls));
        }
        Type[] typeArr = this.f16967c;
        if (typeArr.length != 0) {
            vb.l.C0(typeArr, sb, ", ", "<", ">", "...", a0.f16964i);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.f16965a.hashCode();
        Type type = this.f16966b;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f16967c);
    }

    public final String toString() {
        return getTypeName();
    }
}
