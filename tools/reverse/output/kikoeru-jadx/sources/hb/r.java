package hb;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f8344e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Constructor f8345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f8346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f8347d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f8344e = map;
    }

    public r(Class cls, q qVar) {
        super(qVar);
        this.f8347d = new HashMap();
        pc.f0 f0Var = jb.c.f10806a;
        Constructor constructorA = f0Var.A(cls);
        this.f8345b = constructorA;
        jb.c.f(constructorA);
        String[] strArrF = f0Var.F(cls);
        for (int i10 = 0; i10 < strArrF.length; i10++) {
            this.f8347d.put(strArrF[i10], Integer.valueOf(i10));
        }
        Class<?>[] parameterTypes = this.f8345b.getParameterTypes();
        this.f8346c = new Object[parameterTypes.length];
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            this.f8346c[i11] = f8344e.get(parameterTypes[i11]);
        }
    }

    @Override // hb.o
    public final Object c() {
        return (Object[]) this.f8346c.clone();
    }

    @Override // hb.o
    public final Object d(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f8345b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e10) {
            pc.f0 f0Var = jb.c.f10806a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (IllegalArgumentException e11) {
            e = e11;
            throw new RuntimeException("Failed to invoke constructor '" + jb.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new RuntimeException("Failed to invoke constructor '" + jb.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Failed to invoke constructor '" + jb.c.b(constructor) + "' with args " + Arrays.toString(objArr), e13.getCause());
        }
    }

    @Override // hb.o
    public final void e(Object obj, mb.a aVar, n nVar) {
        Object[] objArr = (Object[]) obj;
        String str = nVar.f8330c;
        Integer num = (Integer) this.f8347d.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + jb.c.b(this.f8345b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objA = nVar.f8333f.a(aVar);
        if (objA != null || !nVar.f8334g) {
            objArr[iIntValue] = objA;
        } else {
            StringBuilder sbK = a0.c.K("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbK.append(aVar.u(false));
            throw new ce.j0(sbK.toString());
        }
    }
}
