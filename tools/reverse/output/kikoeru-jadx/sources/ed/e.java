package ed;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Annotation f6495a;

    public e(Annotation annotation) {
        jc.l.e(annotation, "annotation");
        this.f6495a = annotation;
    }

    public final ArrayList b() throws IllegalAccessException, InvocationTargetException {
        Annotation annotation = this.f6495a;
        Method[] declaredMethods = g8.a.D(g8.a.y(annotation)).getDeclaredMethods();
        jc.l.d(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            jc.l.d(objInvoke, "invoke(...)");
            be.e eVarE = be.e.e(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = d.f6487a;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new t(eVarE, (Enum) objInvoke) : objInvoke instanceof Annotation ? new g(eVarE, (Annotation) objInvoke) : objInvoke instanceof Object[] ? new h(eVarE, (Object[]) objInvoke) : objInvoke instanceof Class ? new p(eVarE, (Class) objInvoke) : new v(eVarE, objInvoke));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f6495a == ((e) obj).f6495a;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f6495a);
    }

    public final String toString() {
        return e.class.getName() + ": " + this.f6495a;
    }
}
