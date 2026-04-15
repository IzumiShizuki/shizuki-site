package ed;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b0 implements sd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f6500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f6501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vb.r f6502c;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Type type) {
        b0 zVar;
        b0 zVar2;
        this.f6500a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    jc.l.d(componentType, "getComponentType(...)");
                    zVar = componentType.isPrimitive() ? new z(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new i(componentType) : componentType instanceof WildcardType ? new e0((WildcardType) componentType) : new q(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        jc.l.d(genericComponentType, "getGenericComponentType(...)");
        boolean z10 = genericComponentType instanceof Class;
        if (z10) {
            Class cls2 = (Class) genericComponentType;
            if (cls2.isPrimitive()) {
                zVar2 = new z(cls2);
                this.f6501b = zVar2;
                this.f6502c = vb.r.f22819a;
            }
        }
        zVar = ((genericComponentType instanceof GenericArrayType) || (z10 && ((Class) genericComponentType).isArray())) ? new i(genericComponentType) : genericComponentType instanceof WildcardType ? new e0((WildcardType) genericComponentType) : new q(genericComponentType);
        zVar2 = zVar;
        this.f6501b = zVar2;
        this.f6502c = vb.r.f22819a;
    }

    @Override // ed.b0
    public final Type b() {
        return this.f6500a;
    }

    @Override // sd.b
    public final Collection getAnnotations() {
        return this.f6502c;
    }
}
