package v4;

import android.util.Pair;
import j5.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import m4.h1;
import m4.i1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends i1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f22716n = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f1 f22718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f22721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f22722j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i1[] f22723k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object[] f22724l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f22725m;

    /* JADX WARN: Illegal instructions before constructor call */
    public y0(ArrayList arrayList, f1 f1Var) {
        i1[] i1VarArr = new i1[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            i1VarArr[i11] = ((k0) it.next()).b();
            i11++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i10] = ((k0) it2.next()).a();
            i10++;
        }
        this(i1VarArr, objArr, f1Var);
    }

    @Override // m4.i1
    public final int a(boolean z10) {
        if (this.f22717e != 0) {
            int iQ = 0;
            if (z10) {
                int[] iArr = this.f22718f.f10259b;
                iQ = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                i1[] i1VarArr = this.f22723k;
                if (!i1VarArr[iQ].p()) {
                    return i1VarArr[iQ].a(z10) + this.f22722j[iQ];
                }
                iQ = q(iQ, z10);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // m4.i1
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f22725m.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.f22723k[iIntValue].b(obj3)) != -1) {
                return this.f22721i[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // m4.i1
    public final int c(boolean z10) {
        int iR;
        int i10 = this.f22717e;
        if (i10 != 0) {
            if (z10) {
                int[] iArr = this.f22718f.f10259b;
                iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iR = i10 - 1;
            }
            do {
                i1[] i1VarArr = this.f22723k;
                if (!i1VarArr[iR].p()) {
                    return i1VarArr[iR].c(z10) + this.f22722j[iR];
                }
                iR = r(iR, z10);
            } while (iR != -1);
        }
        return -1;
    }

    @Override // m4.i1
    public final int e(int i10, int i11, boolean z10) {
        int[] iArr = this.f22722j;
        int iD = p4.c0.d(iArr, i10 + 1, false, false);
        int i12 = iArr[iD];
        i1[] i1VarArr = this.f22723k;
        int iE = i1VarArr[iD].e(i10 - i12, i11 != 2 ? i11 : 0, z10);
        if (iE != -1) {
            return i12 + iE;
        }
        int iQ = q(iD, z10);
        while (iQ != -1 && i1VarArr[iQ].p()) {
            iQ = q(iQ, z10);
        }
        if (iQ != -1) {
            return i1VarArr[iQ].a(z10) + iArr[iQ];
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // m4.i1
    public final m4.f1 f(int i10, m4.f1 f1Var, boolean z10) {
        int[] iArr = this.f22721i;
        int iD = p4.c0.d(iArr, i10 + 1, false, false);
        int i11 = this.f22722j[iD];
        this.f22723k[iD].f(i10 - iArr[iD], f1Var, z10);
        f1Var.f14203c += i11;
        if (z10) {
            Object obj = this.f22724l[iD];
            Object obj2 = f1Var.f14202b;
            obj2.getClass();
            f1Var.f14202b = Pair.create(obj, obj2);
        }
        return f1Var;
    }

    @Override // m4.i1
    public final m4.f1 g(Object obj, m4.f1 f1Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f22725m.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i10 = this.f22722j[iIntValue];
        this.f22723k[iIntValue].g(obj3, f1Var);
        f1Var.f14203c += i10;
        f1Var.f14202b = obj;
        return f1Var;
    }

    @Override // m4.i1
    public final int h() {
        return this.f22720h;
    }

    @Override // m4.i1
    public final int k(int i10, int i11, boolean z10) {
        int[] iArr = this.f22722j;
        int iD = p4.c0.d(iArr, i10 + 1, false, false);
        int i12 = iArr[iD];
        i1[] i1VarArr = this.f22723k;
        int iK = i1VarArr[iD].k(i10 - i12, i11 != 2 ? i11 : 0, z10);
        if (iK != -1) {
            return i12 + iK;
        }
        int iR = r(iD, z10);
        while (iR != -1 && i1VarArr[iR].p()) {
            iR = r(iR, z10);
        }
        if (iR != -1) {
            return i1VarArr[iR].c(z10) + iArr[iR];
        }
        if (i11 == 2) {
            return c(z10);
        }
        return -1;
    }

    @Override // m4.i1
    public final Object l(int i10) {
        int[] iArr = this.f22721i;
        int iD = p4.c0.d(iArr, i10 + 1, false, false);
        return Pair.create(this.f22724l[iD], this.f22723k[iD].l(i10 - iArr[iD]));
    }

    @Override // m4.i1
    public final h1 m(int i10, h1 h1Var, long j10) {
        int[] iArr = this.f22722j;
        int iD = p4.c0.d(iArr, i10 + 1, false, false);
        int i11 = iArr[iD];
        int i12 = this.f22721i[iD];
        this.f22723k[iD].m(i10 - i11, h1Var, j10);
        Object objCreate = this.f22724l[iD];
        if (!h1.f14252q.equals(h1Var.f14262a)) {
            objCreate = Pair.create(objCreate, h1Var.f14262a);
        }
        h1Var.f14262a = objCreate;
        h1Var.f14275n += i12;
        h1Var.f14276o += i12;
        return h1Var;
    }

    @Override // m4.i1
    public final int o() {
        return this.f22719g;
    }

    public final int q(int i10, boolean z10) {
        if (!z10) {
            if (i10 < this.f22717e - 1) {
                return i10 + 1;
            }
            return -1;
        }
        f1 f1Var = this.f22718f;
        int i11 = f1Var.f10260c[i10] + 1;
        int[] iArr = f1Var.f10259b;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    public final int r(int i10, boolean z10) {
        if (!z10) {
            if (i10 > 0) {
                return i10 - 1;
            }
            return -1;
        }
        f1 f1Var = this.f22718f;
        int i11 = f1Var.f10260c[i10] - 1;
        if (i11 >= 0) {
            return f1Var.f10259b[i11];
        }
        return -1;
    }

    public y0(i1[] i1VarArr, Object[] objArr, f1 f1Var) {
        this.f22718f = f1Var;
        this.f22717e = f1Var.f10259b.length;
        int length = i1VarArr.length;
        this.f22723k = i1VarArr;
        this.f22721i = new int[length];
        this.f22722j = new int[length];
        this.f22724l = objArr;
        this.f22725m = new HashMap();
        int length2 = i1VarArr.length;
        int i10 = 0;
        int iO = 0;
        int iH = 0;
        int i11 = 0;
        while (i10 < length2) {
            i1 i1Var = i1VarArr[i10];
            this.f22723k[i11] = i1Var;
            this.f22722j[i11] = iO;
            this.f22721i[i11] = iH;
            iO += i1Var.o();
            iH += this.f22723k[i11].h();
            this.f22725m.put(objArr[i11], Integer.valueOf(i11));
            i10++;
            i11++;
        }
        this.f22719g = iO;
        this.f22720h = iH;
    }
}
