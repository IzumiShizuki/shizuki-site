package o1;

import i2.j0;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f16136a = new w();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        v vVar = (v) obj;
        v vVar2 = (v) obj2;
        int i10 = 0;
        if (f.r(vVar) && f.r(vVar2)) {
            j0 j0VarY = i2.f.y(vVar);
            j0 j0VarY2 = i2.f.y(vVar2);
            if (!jc.l.a(j0VarY, j0VarY2)) {
                Object[] objArr = new j0[16];
                int i11 = 0;
                while (j0VarY != null) {
                    int i12 = i11 + 1;
                    if (objArr.length < i12) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i12, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i11 != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i11 + 0);
                    }
                    objArr[0] = j0VarY;
                    i11++;
                    j0VarY = j0VarY.v();
                }
                Object[] objArr3 = new j0[16];
                int i13 = 0;
                while (j0VarY2 != null) {
                    int i14 = i13 + 1;
                    if (objArr3.length < i14) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i14, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i13 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i13 + 0);
                    }
                    objArr3[0] = j0VarY2;
                    i13++;
                    j0VarY2 = j0VarY2.v();
                }
                int iMin = Math.min(i11 - 1, i13 - 1);
                if (iMin >= 0) {
                    while (jc.l.a(objArr[i10], objArr3[i10])) {
                        if (i10 != iMin) {
                            i10++;
                        }
                    }
                    return jc.l.g(((j0) objArr[i10]).w(), ((j0) objArr3[i10]).w());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (f.r(vVar)) {
                return -1;
            }
            if (f.r(vVar2)) {
                return 1;
            }
        }
        return 0;
    }
}
