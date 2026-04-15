package ed;

import b0.w1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends s implements sd.b, sd.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f6508a;

    public o(Class cls) {
        jc.l.e(cls, "klass");
        this.f6508a = cls;
    }

    @Override // sd.b
    public final e a(be.c cVar) {
        Annotation[] declaredAnnotations;
        jc.l.e(cVar, "fqName");
        Class cls = this.f6508a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return g8.a.u(declaredAnnotations, cVar);
    }

    public final Collection b() {
        Field[] declaredFields = this.f6508a.getDeclaredFields();
        jc.l.d(declaredFields, "getDeclaredFields(...)");
        return df.m.g0(df.m.e0(new df.h(vb.l.d0(declaredFields), false, l.f6505i), m.f6506i));
    }

    public final be.c c() {
        return d.a(this.f6508a).a();
    }

    public final Collection d() {
        Method[] declaredMethods = this.f6508a.getDeclaredMethods();
        jc.l.d(declaredMethods, "getDeclaredMethods(...)");
        return df.m.g0(df.m.e0(new df.h(vb.l.d0(declaredMethods), true, new bd.a(4, this)), n.f6507i));
    }

    public final be.e e() {
        Class cls = this.f6508a;
        return cls.isAnonymousClass() ? be.e.e(ef.n.R0(cls.getName(), ".")) : be.e.e(cls.getSimpleName());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return jc.l.a(this.f6508a, ((o) obj).f6508a);
        }
        return false;
    }

    public final ArrayList f() {
        Class cls = this.f6508a;
        jc.l.e(cls, "clazz");
        w1 w1Var = android.support.v4.media.session.b.f434b;
        if (w1Var == null) {
            try {
                w1Var = new w1(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 5);
            } catch (NoSuchMethodException unused) {
                w1Var = new w1(objArr, objArr, objArr, objArr, 5);
            }
            android.support.v4.media.session.b.f434b = w1Var;
        }
        Method method = (Method) w1Var.f1394b;
        objArr = method != null ? (Object[]) method.invoke(cls, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new a0(obj));
        }
        return arrayList;
    }

    public final boolean g() throws IllegalAccessException, InvocationTargetException {
        Class cls = this.f6508a;
        jc.l.e(cls, "clazz");
        w1 w1Var = android.support.v4.media.session.b.f434b;
        Boolean bool = null;
        if (w1Var == null) {
            try {
                w1Var = new w1(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 5);
            } catch (NoSuchMethodException unused) {
                w1Var = new w1(bool, bool, bool, bool, 5);
            }
            android.support.v4.media.session.b.f434b = w1Var;
        }
        Method method = (Method) w1Var.f1397e;
        if (method != null) {
            Object objInvoke = method.invoke(cls, null);
            jc.l.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // sd.b
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.f6508a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? vb.r.f22819a : g8.a.z(declaredAnnotations);
    }

    @Override // sd.e
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f6508a.getTypeParameters();
        jc.l.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new c0(typeVariable));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f6508a.hashCode();
    }

    public final String toString() {
        return o.class.getName() + ": " + this.f6508a;
    }
}
