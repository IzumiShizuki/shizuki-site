package o;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f16036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f16037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f16038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f16039d;

    public s(int i10) {
        if (i10 == 0) {
            this.f16037b = p.a.f16475b;
            this.f16038c = p.a.f16476c;
            return;
        }
        int i11 = i10 * 8;
        int i12 = 4;
        while (true) {
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 8;
        this.f16037b = new long[i14];
        this.f16038c = new Object[i14];
    }

    public final void a(long j10, Long l10) {
        int i10 = this.f16039d;
        if (i10 != 0 && j10 <= this.f16037b[i10 - 1]) {
            g(j10, l10);
            return;
        }
        if (this.f16036a) {
            long[] jArr = this.f16037b;
            if (i10 >= jArr.length) {
                Object[] objArr = this.f16038c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != t.f16041a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f16036a = false;
                this.f16039d = i11;
            }
        }
        int i13 = this.f16039d;
        if (i13 >= this.f16037b.length) {
            int i14 = (i13 + 1) * 8;
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
            int i17 = i14 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f16037b, i17);
            jc.l.d(jArrCopyOf, "copyOf(...)");
            this.f16037b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f16038c, i17);
            jc.l.d(objArrCopyOf, "copyOf(...)");
            this.f16038c = objArrCopyOf;
        }
        this.f16037b[i13] = j10;
        this.f16038c[i13] = l10;
        this.f16039d = i13 + 1;
    }

    public final void b() {
        int i10 = this.f16039d;
        Object[] objArr = this.f16038c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f16039d = 0;
        this.f16036a = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final s clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        jc.l.c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        s sVar = (s) objClone;
        sVar.f16037b = (long[]) this.f16037b.clone();
        sVar.f16038c = (Object[]) this.f16038c.clone();
        return sVar;
    }

    public final Object d(long j10) {
        Object obj;
        int iB = p.a.b(this.f16037b, this.f16039d, j10);
        if (iB < 0 || (obj = this.f16038c[iB]) == t.f16041a) {
            return null;
        }
        return obj;
    }

    public final Object e(long j10) {
        Object obj;
        int iB = p.a.b(this.f16037b, this.f16039d, j10);
        if (iB < 0 || (obj = this.f16038c[iB]) == t.f16041a) {
            return -1L;
        }
        return obj;
    }

    public final long f(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f16039d)) {
            p.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f16036a) {
            long[] jArr = this.f16037b;
            Object[] objArr = this.f16038c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != t.f16041a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f16036a = false;
            this.f16039d = i12;
        }
        return this.f16037b[i10];
    }

    public final void g(long j10, Object obj) {
        Object obj2 = t.f16041a;
        int iB = p.a.b(this.f16037b, this.f16039d, j10);
        if (iB >= 0) {
            this.f16038c[iB] = obj;
            return;
        }
        int i10 = ~iB;
        int i11 = this.f16039d;
        if (i10 < i11) {
            Object[] objArr = this.f16038c;
            if (objArr[i10] == obj2) {
                this.f16037b[i10] = j10;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f16036a) {
            long[] jArr = this.f16037b;
            if (i11 >= jArr.length) {
                Object[] objArr2 = this.f16038c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj3 = objArr2[i13];
                    if (obj3 != obj2) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr2[i12] = obj3;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f16036a = false;
                this.f16039d = i12;
                i10 = ~p.a.b(this.f16037b, i12, j10);
            }
        }
        int i14 = this.f16039d;
        if (i14 >= this.f16037b.length) {
            int i15 = (i14 + 1) * 8;
            int i16 = 4;
            while (true) {
                if (i16 >= 32) {
                    break;
                }
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
                i16++;
            }
            int i18 = i15 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f16037b, i18);
            jc.l.d(jArrCopyOf, "copyOf(...)");
            this.f16037b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f16038c, i18);
            jc.l.d(objArrCopyOf, "copyOf(...)");
            this.f16038c = objArrCopyOf;
        }
        int i19 = this.f16039d;
        if (i19 - i10 != 0) {
            long[] jArr2 = this.f16037b;
            int i20 = i10 + 1;
            vb.l.k0(jArr2, jArr2, i20, i10, i19);
            Object[] objArr3 = this.f16038c;
            vb.l.i0(i20, i10, this.f16039d, objArr3, objArr3);
        }
        this.f16037b[i10] = j10;
        this.f16038c[i10] = obj;
        this.f16039d++;
    }

    public final void h(long j10) {
        int iB = p.a.b(this.f16037b, this.f16039d, j10);
        if (iB >= 0) {
            Object[] objArr = this.f16038c;
            Object obj = objArr[iB];
            Object obj2 = t.f16041a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f16036a = true;
            }
        }
    }

    public final int i() {
        if (this.f16036a) {
            int i10 = this.f16039d;
            long[] jArr = this.f16037b;
            Object[] objArr = this.f16038c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != t.f16041a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f16036a = false;
            this.f16039d = i11;
        }
        return this.f16039d;
    }

    public final Object j(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f16039d)) {
            p.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f16036a) {
            long[] jArr = this.f16037b;
            Object[] objArr = this.f16038c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != t.f16041a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f16036a = false;
            this.f16039d = i12;
        }
        return this.f16038c[i10];
    }

    public final String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16039d * 28);
        sb.append('{');
        int i10 = this.f16039d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(f(i11));
            sb.append('=');
            Object objJ = j(i11);
            if (objJ != sb) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }

    public /* synthetic */ s(Object obj) {
        this(10);
    }
}
