package sc;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f19762b;

    public /* synthetic */ b1(d1 d1Var, int i10) {
        this.f19761a = i10;
        this.f19762b = d1Var;
    }

    @Override // ic.a
    public final Object b() throws qc.a {
        int i10 = this.f19761a;
        d1 d1Var = this.f19762b;
        switch (i10) {
            case 0:
                return new c1(d1Var);
            default:
                Object objU = d1Var.u();
                try {
                    Object obj = q1.f19857k;
                    Object objF = d1Var.t() ? n7.e.f(d1Var.f19861h, d1Var.r()) : null;
                    if (objF == obj) {
                        objF = null;
                    }
                    AccessibleObject accessibleObject = ((AccessibleObject) objU) != null ? (AccessibleObject) objU : null;
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(n7.d.v(d1Var));
                    }
                    if (objU == null) {
                        return null;
                    }
                    if (objU instanceof Field) {
                        return ((Field) objU).get(objF);
                    }
                    if (!(objU instanceof Method)) {
                        throw new AssertionError("delegate field/method " + objU + " neither field nor method");
                    }
                    int length = ((Method) objU).getParameterTypes().length;
                    if (length == 0) {
                        return ((Method) objU).invoke(null, null);
                    }
                    if (length == 1) {
                        Method method = (Method) objU;
                        if (objF == null) {
                            Class<?> cls = ((Method) objU).getParameterTypes()[0];
                            jc.l.d(cls, "get(...)");
                            objF = f2.e(cls);
                        }
                        return method.invoke(null, objF);
                    }
                    if (length == 2) {
                        Method method2 = (Method) objU;
                        Class<?> cls2 = ((Method) objU).getParameterTypes()[1];
                        jc.l.d(cls2, "get(...)");
                        return method2.invoke(null, objF, f2.e(cls2));
                    }
                    throw new AssertionError("delegate method " + objU + " should take 0, 1, or 2 parameters");
                } catch (IllegalAccessException e10) {
                    throw new qc.a("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e10);
                }
        }
    }
}
