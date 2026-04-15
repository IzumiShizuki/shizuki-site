package m5;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.tencent.bugly.CrashModule;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import m4.d1;
import m4.n1;
import m4.o1;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends o1 {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final String H0;
    public static final String I0;
    public static final String J0;
    public static final String K0;
    public static final String L0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f14702t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f14703u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f14704v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f14705w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f14706x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f14707y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f14708z0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final boolean f14709k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final boolean f14710l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final boolean f14711m0;
    public final boolean n0;
    public final boolean o0;
    public final boolean p0;
    public final boolean q0;
    public final SparseArray r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final SparseBooleanArray f14712s0;

    static {
        new j(new i());
        int i10 = c0.f16548a;
        f14702t0 = Integer.toString(1000, 36);
        f14703u0 = Integer.toString(1001, 36);
        f14704v0 = Integer.toString(1002, 36);
        f14705w0 = Integer.toString(1003, 36);
        f14706x0 = Integer.toString(CrashModule.MODULE_ID, 36);
        f14707y0 = Integer.toString(1005, 36);
        f14708z0 = Integer.toString(1006, 36);
        A0 = Integer.toString(1007, 36);
        B0 = Integer.toString(1008, 36);
        C0 = Integer.toString(1009, 36);
        D0 = Integer.toString(1010, 36);
        E0 = Integer.toString(1011, 36);
        F0 = Integer.toString(1012, 36);
        G0 = Integer.toString(1013, 36);
        H0 = Integer.toString(1014, 36);
        I0 = Integer.toString(1015, 36);
        J0 = Integer.toString(1016, 36);
        K0 = Integer.toString(1017, 36);
        L0 = Integer.toString(1018, 36);
    }

    public j(i iVar) {
        super(iVar);
        this.f14709k0 = iVar.D;
        this.f14710l0 = iVar.E;
        this.f14711m0 = iVar.F;
        this.n0 = iVar.G;
        this.o0 = iVar.H;
        this.p0 = iVar.I;
        this.q0 = iVar.J;
        this.r0 = iVar.K;
        this.f14712s0 = iVar.L;
    }

    @Override // m4.o1
    public final n1 a() {
        return new i(this);
    }

    @Override // m4.o1
    public final Bundle c() {
        Bundle bundleC = super.c();
        bundleC.putBoolean(f14702t0, this.f14709k0);
        bundleC.putBoolean(f14703u0, false);
        bundleC.putBoolean(f14704v0, this.f14710l0);
        bundleC.putBoolean(H0, false);
        bundleC.putBoolean(f14705w0, this.f14711m0);
        bundleC.putBoolean(f14706x0, false);
        bundleC.putBoolean(f14707y0, false);
        bundleC.putBoolean(f14708z0, false);
        bundleC.putBoolean(I0, false);
        bundleC.putBoolean(L0, this.n0);
        bundleC.putBoolean(J0, this.o0);
        bundleC.putBoolean(A0, this.p0);
        bundleC.putBoolean(B0, false);
        bundleC.putBoolean(C0, this.q0);
        bundleC.putBoolean(K0, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray2 = this.r0;
            if (i10 >= sparseArray2.size()) {
                SparseBooleanArray sparseBooleanArray = this.f14712s0;
                int[] iArr = new int[sparseBooleanArray.size()];
                for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
                    iArr[i11] = sparseBooleanArray.keyAt(i11);
                }
                bundleC.putIntArray(G0, iArr);
                return bundleC;
            }
            int iKeyAt = sparseArray2.keyAt(i10);
            for (Map.Entry entry : ((Map) sparseArray2.valueAt(i10)).entrySet()) {
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                arrayList2.add((j5.o1) entry.getKey());
                arrayList.add(Integer.valueOf(iKeyAt));
            }
            bundleC.putIntArray(D0, g8.a.a0(arrayList));
            bundleC.putParcelableArrayList(E0, p4.c.A(arrayList2, new d1(4)));
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
            if (sparseArray.size() > 0) {
                sparseArray.keyAt(0);
                a0.c.N(sparseArray.valueAt(0));
                throw null;
            }
            bundleC.putSparseParcelableArray(F0, sparseArray3);
            i10++;
        }
    }

    @Override // m4.o1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (super.equals(jVar) && this.f14709k0 == jVar.f14709k0 && this.f14710l0 == jVar.f14710l0 && this.f14711m0 == jVar.f14711m0 && this.n0 == jVar.n0 && this.o0 == jVar.o0 && this.p0 == jVar.p0 && this.q0 == jVar.q0) {
                SparseBooleanArray sparseBooleanArray = jVar.f14712s0;
                SparseBooleanArray sparseBooleanArray2 = this.f14712s0;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            SparseArray sparseArray = jVar.r0;
                            SparseArray sparseArray2 = this.r0;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i11 = 0; i11 < size2; i11++) {
                                    int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i11));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i11);
                                        Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                j5.o1 o1Var = (j5.o1) entry.getKey();
                                                if (map2.containsKey(o1Var)) {
                                                    Object value = entry.getValue();
                                                    Object obj2 = map2.get(o1Var);
                                                    int i12 = c0.f16548a;
                                                    if (!Objects.equals(value, obj2)) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i10)) < 0) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // m4.o1
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f14709k0 ? 1 : 0)) * 961) + (this.f14710l0 ? 1 : 0)) * 961) + (this.f14711m0 ? 1 : 0)) * 28629151) + (this.n0 ? 1 : 0)) * 31) + (this.o0 ? 1 : 0)) * 31) + (this.p0 ? 1 : 0)) * 961) + (this.q0 ? 1 : 0)) * 31;
    }
}
