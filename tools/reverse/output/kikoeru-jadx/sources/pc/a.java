package pc;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements GenericArrayType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f16963a;

    public a(Type type) {
        jc.l.e(type, "elementType");
        this.f16963a = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return jc.l.a(this.f16963a, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f16963a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return f0.m(this.f16963a) + "[]";
    }

    public final int hashCode() {
        return this.f16963a.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
