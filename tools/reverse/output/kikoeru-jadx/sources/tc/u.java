package tc;

import hd.q0;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends q implements f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object[] f20657g;

    /* JADX WARN: Illegal instructions before constructor call */
    public u(Method method, Object[] objArr) {
        Collection collectionW;
        jc.l.e(method, "method");
        jc.l.e(objArr, "boundReceiverComponents");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        jc.l.d(genericParameterTypes, "getGenericParameterTypes(...)");
        int length = objArr.length;
        if (length < 0) {
            throw new IllegalArgumentException(t0.C(length, "Requested element count ", " is less than zero.").toString());
        }
        int length2 = genericParameterTypes.length - length;
        length2 = length2 < 0 ? 0 : length2;
        if (length2 < 0) {
            throw new IllegalArgumentException(t0.C(length2, "Requested element count ", " is less than zero.").toString());
        }
        if (length2 == 0) {
            collectionW = vb.r.f22819a;
        } else {
            int length3 = genericParameterTypes.length;
            if (length2 >= length3) {
                collectionW = vb.l.M0(genericParameterTypes);
            } else if (length2 == 1) {
                collectionW = ud.b.w(genericParameterTypes[length3 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length2);
                for (int i10 = length3 - length2; i10 < length3; i10++) {
                    arrayList.add(genericParameterTypes[i10]);
                }
                collectionW = arrayList;
            }
        }
        super(method, false, (Type[]) collectionW.toArray(new Type[0]));
        this.f20657g = objArr;
    }

    @Override // tc.q, tc.g
    public final Object d(Object[] objArr) {
        jc.l.e(objArr, "args");
        e(objArr);
        q0 q0Var = new q0(2);
        q0Var.i(this.f20657g);
        q0Var.i(objArr);
        ArrayList arrayList = q0Var.f8447b;
        return g(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
