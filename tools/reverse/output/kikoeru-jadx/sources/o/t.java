package o;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f16041a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f16042b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f16043c = new Object();

    public static final void a(v0 v0Var) {
        int i10 = v0Var.f16061d;
        int[] iArr = v0Var.f16059b;
        Object[] objArr = v0Var.f16060c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f16043c) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        v0Var.f16058a = false;
        v0Var.f16061d = i11;
    }

    public static final void b(f fVar, int i10) {
        fVar.f15950a = new int[i10];
        fVar.f15951b = new Object[i10];
    }

    public static final int c(f fVar, Object obj, int i10) {
        int i11 = fVar.f15952c;
        if (i11 == 0) {
            return -1;
        }
        try {
            int iA = p.a.a(fVar.f15950a, i11, i10);
            if (iA < 0 || jc.l.a(obj, fVar.f15951b[iA])) {
                return iA;
            }
            int i12 = iA + 1;
            while (i12 < i11 && fVar.f15950a[i12] == i10) {
                if (jc.l.a(obj, fVar.f15951b[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = iA - 1; i13 >= 0 && fVar.f15950a[i13] == i10; i13--) {
                if (jc.l.a(obj, fVar.f15951b[i13])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
