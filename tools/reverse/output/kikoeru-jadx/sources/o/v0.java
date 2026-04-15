package o;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f16058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f16059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f16060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f16061d;

    public v0(int i10) {
        int i11;
        int i12 = 4;
        while (true) {
            i11 = 40;
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (40 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 4;
        this.f16059b = new int[i14];
        this.f16060c = new Object[i14];
    }

    public final void a(int i10, String str) {
        int i11 = this.f16061d;
        if (i11 != 0 && i10 <= this.f16059b[i11 - 1]) {
            f(i10, str);
            return;
        }
        if (this.f16058a && i11 >= this.f16059b.length) {
            t.a(this);
        }
        int i12 = this.f16061d;
        if (i12 >= this.f16059b.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f16059b, i16);
            jc.l.d(iArrCopyOf, "copyOf(...)");
            this.f16059b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f16060c, i16);
            jc.l.d(objArrCopyOf, "copyOf(...)");
            this.f16060c = objArrCopyOf;
        }
        this.f16059b[i12] = i10;
        this.f16060c[i12] = str;
        this.f16061d = i12 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final v0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        jc.l.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        v0 v0Var = (v0) objClone;
        v0Var.f16059b = (int[]) this.f16059b.clone();
        v0Var.f16060c = (Object[]) this.f16060c.clone();
        return v0Var;
    }

    public final boolean c(int i10) {
        if (this.f16058a) {
            t.a(this);
        }
        return p.a.a(this.f16059b, this.f16061d, i10) >= 0;
    }

    public final Object d(int i10) {
        Object obj;
        int iA = p.a.a(this.f16059b, this.f16061d, i10);
        if (iA < 0 || (obj = this.f16060c[iA]) == t.f16043c) {
            return null;
        }
        return obj;
    }

    public final int e(int i10) {
        if (this.f16058a) {
            t.a(this);
        }
        return this.f16059b[i10];
    }

    public final void f(int i10, Object obj) {
        int iA = p.a.a(this.f16059b, this.f16061d, i10);
        if (iA >= 0) {
            this.f16060c[iA] = obj;
            return;
        }
        int i11 = ~iA;
        int i12 = this.f16061d;
        if (i11 < i12) {
            Object[] objArr = this.f16060c;
            if (objArr[i11] == t.f16043c) {
                this.f16059b[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (this.f16058a && i12 >= this.f16059b.length) {
            t.a(this);
            i11 = ~p.a.a(this.f16059b, this.f16061d, i10);
        }
        int i13 = this.f16061d;
        if (i13 >= this.f16059b.length) {
            int i14 = (i13 + 1) * 4;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f16059b, i17);
            jc.l.d(iArrCopyOf, "copyOf(...)");
            this.f16059b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f16060c, i17);
            jc.l.d(objArrCopyOf, "copyOf(...)");
            this.f16060c = objArrCopyOf;
        }
        int i18 = this.f16061d;
        if (i18 - i11 != 0) {
            int[] iArr = this.f16059b;
            int i19 = i11 + 1;
            vb.l.h0(i19, i11, i18, iArr, iArr);
            Object[] objArr2 = this.f16060c;
            vb.l.i0(i19, i11, this.f16061d, objArr2, objArr2);
        }
        this.f16059b[i11] = i10;
        this.f16060c[i11] = obj;
        this.f16061d++;
    }

    public final int g() {
        if (this.f16058a) {
            t.a(this);
        }
        return this.f16061d;
    }

    public final Object h(int i10) {
        if (this.f16058a) {
            t.a(this);
        }
        Object[] objArr = this.f16060c;
        if (i10 < objArr.length) {
            return objArr[i10];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16061d * 28);
        sb.append('{');
        int i10 = this.f16061d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(e(i11));
            sb.append('=');
            Object objH = h(i11);
            if (objH != this) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }
}
