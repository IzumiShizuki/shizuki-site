package b7;

import android.util.SparseBooleanArray;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f4 f2051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m4.u0 f2052f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f4 f2053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m4.u0 f2054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ya.i0 f2055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ya.i0 f2056d;

    static {
        HashSet hashSet = new HashSet();
        ya.a1 a1Var = e4.f1756d;
        for (int i10 = 0; i10 < a1Var.f25948d; i10++) {
            hashSet.add(new e4(((Integer) a1Var.get(i10)).intValue()));
        }
        f2051e = new f4(hashSet);
        HashSet hashSet2 = new HashSet();
        ya.a1 a1Var2 = e4.f1757e;
        for (int i11 = 0; i11 < a1Var2.f25948d; i11++) {
            hashSet2.add(new e4(((Integer) a1Var2.get(i11)).intValue()));
        }
        for (int i12 = 0; i12 < a1Var.f25948d; i12++) {
            hashSet2.add(new e4(((Integer) a1Var.get(i12)).intValue()));
        }
        new f4(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i13 : m4.t0.f14585b) {
            p4.c.i(!false);
            sparseBooleanArray.append(i13, true);
        }
        p4.c.i(!false);
        f2052f = new m4.u0(new m4.o(sparseBooleanArray));
    }

    public r1(f4 f4Var, m4.u0 u0Var, ya.i0 i0Var, ya.i0 i0Var2) {
        this.f2053a = f4Var;
        this.f2054b = u0Var;
        this.f2055c = i0Var;
        this.f2056d = i0Var2;
    }
}
