package ac;

import c7.e1;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements yb.c, d, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yb.c f300a;

    public a(yb.c cVar) {
        this.f300a = cVar;
    }

    @Override // ac.d
    public d f() {
        yb.c cVar = this.f300a;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    @Override // yb.c
    public final void h(Object obj) {
        yb.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            yb.c cVar2 = aVar.f300a;
            l.b(cVar2);
            try {
                obj = aVar.u(obj);
                if (obj == zb.a.f26667a) {
                    return;
                }
            } catch (Throwable th2) {
                obj = ub.a.b(th2);
            }
            aVar.w();
            if (!(cVar2 instanceof a)) {
                cVar2.h(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    public yb.c o(Object obj, yb.c cVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement r() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null || eVar.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i10 = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        e1 e1Var = f.f305b;
        e1 e1Var2 = f.f304a;
        if (e1Var == null) {
            try {
                e1 e1Var3 = new e1(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 2);
                f.f305b = e1Var3;
                e1Var = e1Var3;
            } catch (Exception unused2) {
                f.f305b = e1Var2;
                e1Var = e1Var2;
            }
        }
        if (e1Var != e1Var2 && (method = (Method) e1Var.f3618b) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) e1Var.f3619c) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) e1Var.f3620d;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i10);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objR = r();
        if (objR == null) {
            objR = getClass().getName();
        }
        sb.append(objR);
        return sb.toString();
    }

    public abstract Object u(Object obj);

    public void w() {
    }
}
