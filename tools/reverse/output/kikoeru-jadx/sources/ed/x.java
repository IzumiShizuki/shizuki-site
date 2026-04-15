package ed;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends w implements sd.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f6516a;

    public x(Method method) {
        jc.l.e(method, "member");
        this.f6516a = method;
    }

    @Override // ed.w
    public final Member b() {
        return this.f6516a;
    }

    public final b0 f() {
        Type genericReturnType = this.f6516a.getGenericReturnType();
        jc.l.d(genericReturnType, "getGenericReturnType(...)");
        boolean z10 = genericReturnType instanceof Class;
        if (z10) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new z(cls);
            }
        }
        return ((genericReturnType instanceof GenericArrayType) || (z10 && ((Class) genericReturnType).isArray())) ? new i(genericReturnType) : genericReturnType instanceof WildcardType ? new e0((WildcardType) genericReturnType) : new q(genericReturnType);
    }

    public final List g() {
        Method method = this.f6516a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        jc.l.d(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        jc.l.d(parameterAnnotations, "getParameterAnnotations(...)");
        return d(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // sd.e
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f6516a.getTypeParameters();
        jc.l.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new c0(typeVariable));
        }
        return arrayList;
    }
}
