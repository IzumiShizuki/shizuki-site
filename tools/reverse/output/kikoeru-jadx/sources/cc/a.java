package cc;

import java.lang.reflect.Method;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f3887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f3888b;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        l.b(methods);
        int length = methods.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            method = null;
            if (i11 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i11];
            if (l.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                l.d(parameterTypes, "getParameterTypes(...)");
                if (l.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i11++;
        }
        f3887a = method2;
        int length2 = methods.length;
        while (true) {
            if (i10 >= length2) {
                break;
            }
            Method method3 = methods[i10];
            if (l.a(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i10++;
        }
        f3888b = method;
    }
}
