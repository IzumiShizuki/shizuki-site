package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f810a = ud.b.x(Application.class, j0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f811b = ud.b.w(j0.class);

    public static final Constructor a(Class cls, List list) {
        jc.l.e(list, "signature");
        jc.b bVarA = jc.k.a(cls.getConstructors());
        while (bVarA.hasNext()) {
            Constructor constructor = (Constructor) bVarA.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            jc.l.d(parameterTypes, "getParameterTypes(...)");
            List listM0 = vb.l.M0(parameterTypes);
            if (list.equals(listM0)) {
                return constructor;
            }
            if (list.size() == listM0.size() && listM0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final s0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (s0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
