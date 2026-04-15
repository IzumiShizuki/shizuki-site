package tc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import sc.f2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f20639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Member f20640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f20641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final oc.d[] f20642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20643f;

    /* JADX WARN: Removed duplicated region for block: B:135:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[LOOP:1: B:25:0x0075->B:27:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d0(tc.g r11, yc.c r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.d0.<init>(tc.g, yc.c, boolean):void");
    }

    @Override // tc.g
    public final List a() {
        return this.f20639b.a();
    }

    @Override // tc.g
    public final Member b() {
        return this.f20640c;
    }

    @Override // tc.g
    public final boolean c() {
        return this.f20639b instanceof r;
    }

    @Override // tc.g
    public final Object d(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objE;
        Object objE2;
        jc.l.e(objArr, "args");
        b0 b0Var = this.f20641d;
        oc.d dVar = (oc.d) b0Var.f20618b;
        List[] listArr = (List[]) b0Var.f20619c;
        Method method = (Method) b0Var.f20620d;
        boolean zIsEmpty = dVar.isEmpty();
        int i10 = dVar.f16308b;
        int i11 = dVar.f16307a;
        if (!zIsEmpty) {
            if (this.f20643f) {
                wb.b bVar = new wb.b(objArr.length);
                for (int i12 = 0; i12 < i11; i12++) {
                    bVar.add(objArr[i12]);
                }
                if (i11 <= i10) {
                    while (true) {
                        List<Method> list = listArr[i11];
                        Object obj = objArr[i11];
                        if (list != null) {
                            for (Method method2 : list) {
                                if (obj != null) {
                                    objE2 = method2.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method2.getReturnType();
                                    jc.l.d(returnType, "getReturnType(...)");
                                    objE2 = f2.e(returnType);
                                }
                                bVar.add(objE2);
                            }
                        } else {
                            bVar.add(obj);
                        }
                        if (i11 == i10) {
                            break;
                        }
                        i11++;
                    }
                }
                int i13 = i10 + 1;
                int length = objArr.length - 1;
                if (i13 <= length) {
                    while (true) {
                        bVar.add(objArr[i13]);
                        if (i13 == length) {
                            break;
                        }
                        i13++;
                    }
                }
                objArr = ud.b.g(bVar).toArray(new Object[0]);
            } else {
                int length2 = objArr.length;
                Object[] objArr2 = new Object[length2];
                for (int i14 = 0; i14 < length2; i14++) {
                    if (i14 > i10 || i11 > i14) {
                        objE = objArr[i14];
                    } else {
                        List list2 = listArr[i14];
                        Method method3 = list2 != null ? (Method) vb.m.x0(list2) : null;
                        objE = objArr[i14];
                        if (method3 != null) {
                            if (objE != null) {
                                objE = method3.invoke(objE, null);
                            } else {
                                Class<?> returnType2 = method3.getReturnType();
                                jc.l.d(returnType2, "getReturnType(...)");
                                objE = f2.e(returnType2);
                            }
                        }
                    }
                    objArr2[i14] = objE;
                }
                objArr = objArr2;
            }
        }
        Object objD = this.f20639b.d(objArr);
        return (objD == zb.a.f26667a || method == null || (objInvoke = method.invoke(null, objD)) == null) ? objD : objInvoke;
    }

    public final oc.d e(int i10) {
        oc.d[] dVarArr = this.f20642e;
        if (i10 >= 0 && i10 < dVarArr.length) {
            return dVarArr[i10];
        }
        if (dVarArr.length == 0) {
            return new oc.d(i10, i10, 1);
        }
        int length = ((oc.d) vb.l.E0(dVarArr)).f16308b + 1 + (i10 - dVarArr.length);
        return new oc.d(length, length, 1);
    }

    @Override // tc.g
    public final Type n() {
        return this.f20639b.n();
    }
}
