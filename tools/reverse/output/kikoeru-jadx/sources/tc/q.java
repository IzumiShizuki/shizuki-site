package tc;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20652e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20653f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q(Method method, boolean z10, int i10) {
        z10 = (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        jc.l.d(genericParameterTypes, "getGenericParameterTypes(...)");
        this(method, z10, genericParameterTypes);
    }

    @Override // tc.g
    public Object d(Object[] objArr) throws IllegalAccessException {
        jc.l.e(objArr, "args");
        e(objArr);
        ((Field) this.f20659a).set(this.f20661c != null ? vb.l.u0(objArr) : null, vb.l.E0(objArr));
        return ub.a0.f21526a;
    }

    @Override // tc.w
    public void e(Object[] objArr) {
        switch (this.f20652e) {
            case 0:
                jc.l.e(objArr, "args");
                super.e(objArr);
                if (this.f20653f && vb.l.E0(objArr) == null) {
                    throw new IllegalArgumentException("null is not allowed as a value for this property.");
                }
                return;
            default:
                super.e(objArr);
                return;
        }
    }

    public Object g(Object obj, Object[] objArr) {
        jc.l.e(objArr, "args");
        return this.f20653f ? ub.a0.f21526a : ((Method) this.f20659a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(Method method, boolean z10, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        jc.l.d(genericReturnType, "getGenericReturnType(...)");
        super(method, genericReturnType, z10 ? method.getDeclaringClass() : null, typeArr);
        this.f20653f = genericReturnType.equals(Void.TYPE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(Field field, boolean z10, boolean z11) {
        Class cls = Void.TYPE;
        jc.l.d(cls, "TYPE");
        Class<?> declaringClass = z11 ? field.getDeclaringClass() : null;
        Type genericType = field.getGenericType();
        jc.l.d(genericType, "getGenericType(...)");
        super(field, cls, declaringClass, new Type[]{genericType});
        this.f20653f = z10;
    }
}
