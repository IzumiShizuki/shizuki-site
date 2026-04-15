package ed;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6478a;

    public a0(Object obj) {
        jc.l.e(obj, "recordComponent");
        this.f6478a = obj;
    }

    @Override // ed.w
    public final Member b() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.f6478a;
        jc.l.e(obj, "recordComponent");
        a aVar = a2.c.f189a;
        Method method = null;
        if (aVar == null) {
            Class<?> cls = obj.getClass();
            try {
                aVar = new a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                aVar = new a(null, null);
            }
            a2.c.f189a = aVar;
        }
        Method method2 = aVar.f6477b;
        if (method2 != null) {
            Object objInvoke = method2.invoke(obj, null);
            jc.l.c(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final sd.d f() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.f6478a;
        jc.l.e(obj, "recordComponent");
        a aVar = a2.c.f189a;
        Class cls = null;
        if (aVar == null) {
            Class<?> cls2 = obj.getClass();
            try {
                aVar = new a(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                aVar = new a(null, null);
            }
            a2.c.f189a = aVar;
        }
        Method method = aVar.f6476a;
        if (method != null) {
            Object objInvoke = method.invoke(obj, null);
            jc.l.c(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new q(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
