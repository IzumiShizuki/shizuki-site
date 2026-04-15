package ce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f3958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f3960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f3961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f3962e;

    public o(b bVar, Object obj, b bVar2, n nVar, Class cls) {
        if (bVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (nVar.f3956b == r0.f3967f && bVar2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.f3958a = bVar;
        this.f3959b = obj;
        this.f3960c = bVar2;
        this.f3961d = nVar;
        if (!q.class.isAssignableFrom(cls)) {
            this.f3962e = null;
            return;
        }
        try {
            this.f3962e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(name.length() + 52);
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"valueOf\".");
            throw new RuntimeException(sb.toString(), e10);
        }
    }

    public final Object a(Object obj) {
        if (this.f3961d.f3956b.f3970a != s0.f3980i) {
            return obj;
        }
        try {
            return this.f3962e.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final Object b(Object obj) {
        return this.f3961d.f3956b.f3970a == s0.f3980i ? Integer.valueOf(((q) obj).a()) : obj;
    }
}
