package h1;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Iterable, kc.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f8034e = new k(0, 0, 0, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f8038d;

    public k(long j10, long j11, long j12, long[] jArr) {
        this.f8035a = j10;
        this.f8036b = j11;
        this.f8037c = j12;
        this.f8038d = jArr;
    }

    public final k a(k kVar) {
        k kVarI;
        long[] jArr;
        k kVar2 = f8034e;
        if (kVar == kVar2) {
            return this;
        }
        if (this == kVar2) {
            return kVar2;
        }
        long j10 = kVar.f8037c;
        long j11 = kVar.f8037c;
        long[] jArr2 = kVar.f8038d;
        long j12 = kVar.f8036b;
        long j13 = kVar.f8035a;
        long j14 = this.f8037c;
        if (j10 == j14 && jArr2 == (jArr = this.f8038d)) {
            return new k(this.f8035a & (~j13), this.f8036b & (~j12), j14, jArr);
        }
        if (jArr2 != null) {
            kVarI = this;
            for (long j15 : jArr2) {
                kVarI = kVarI.i(j15);
            }
        } else {
            kVarI = this;
        }
        long j16 = 1;
        if (j12 != 0) {
            int i10 = 0;
            while (i10 < 64) {
                long j17 = j16;
                if (((j16 << i10) & j12) != 0) {
                    kVarI = kVarI.i(((long) i10) + j11);
                }
                i10++;
                j16 = j17;
            }
        }
        long j18 = j16;
        if (j13 != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((j18 << i11) & j13) != 0) {
                    kVarI = kVarI.i(((long) i11) + j11 + ((long) 64));
                }
            }
        }
        return kVarI;
    }

    public final k i(long j10) {
        long[] jArr;
        int iC;
        long[] jArr2;
        long j11 = j10 - this.f8037c;
        long j12 = 0;
        if (jc.l.h(j11, j12) >= 0 && jc.l.h(j11, 64) < 0) {
            long j13 = 1 << ((int) j11);
            long j14 = this.f8036b;
            if ((j14 & j13) != 0) {
                return new k(this.f8035a, j14 & (~j13), this.f8037c, this.f8038d);
            }
        } else if (jc.l.h(j11, 64) >= 0 && jc.l.h(j11, 128) < 0) {
            long j15 = 1 << (((int) j11) - 64);
            long j16 = this.f8035a;
            if ((j16 & j15) != 0) {
                return new k(j16 & (~j15), this.f8036b, this.f8037c, this.f8038d);
            }
        } else if (jc.l.h(j11, j12) < 0 && (jArr = this.f8038d) != null && (iC = t.c(jArr, j10)) >= 0) {
            int length = jArr.length;
            int i10 = length - 1;
            if (i10 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i10];
                if (iC > 0) {
                    vb.l.k0(jArr, jArr3, 0, 0, iC);
                }
                if (iC < i10) {
                    vb.l.k0(jArr, jArr3, iC, iC + 1, length);
                }
                jArr2 = jArr3;
            }
            return new k(this.f8035a, this.f8036b, this.f8037c, jArr2);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return pc.f0.O(new j(this, null));
    }

    public final boolean j(long j10) {
        long[] jArr;
        long j11 = j10 - this.f8037c;
        long j12 = 0;
        return (jc.l.h(j11, j12) < 0 || jc.l.h(j11, (long) 64) >= 0) ? (jc.l.h(j11, (long) 64) < 0 || jc.l.h(j11, (long) 128) >= 0) ? jc.l.h(j11, j12) <= 0 && (jArr = this.f8038d) != null && t.c(jArr, j10) >= 0 : ((1 << (((int) j11) - 64)) & this.f8035a) != 0 : ((1 << ((int) j11)) & this.f8036b) != 0;
    }

    public final k k(k kVar) {
        k kVarL;
        k kVarL2;
        long[] jArr;
        k kVar2 = f8034e;
        if (kVar == kVar2) {
            return this;
        }
        if (this == kVar2) {
            return kVar;
        }
        long j10 = kVar.f8037c;
        long j11 = kVar.f8037c;
        long[] jArr2 = kVar.f8038d;
        long j12 = kVar.f8036b;
        long j13 = kVar.f8035a;
        long j14 = this.f8036b;
        long j15 = this.f8035a;
        long j16 = this.f8037c;
        if (j10 == j16 && jArr2 == (jArr = this.f8038d)) {
            return new k(j15 | j13, j14 | j12, j16, jArr);
        }
        int i10 = 0;
        long[] jArr3 = this.f8038d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                kVarL = this;
                for (long j17 : jArr2) {
                    kVarL = kVarL.l(j17);
                }
            } else {
                kVarL = this;
            }
            if (j12 != 0) {
                for (int i11 = 0; i11 < 64; i11++) {
                    if (((1 << i11) & j12) != 0) {
                        kVarL = kVarL.l(((long) i11) + j11);
                    }
                }
            }
            if (j13 != 0) {
                while (i10 < 64) {
                    if (((1 << i10) & j13) != 0) {
                        kVarL = kVarL.l(((long) i10) + j11 + ((long) 64));
                    }
                    i10++;
                }
            }
            return kVarL;
        }
        if (jArr3 != null) {
            kVarL2 = kVar;
            for (long j18 : jArr3) {
                kVarL2 = kVarL2.l(j18);
            }
        } else {
            kVarL2 = kVar;
        }
        long j19 = this.f8037c;
        if (j14 != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if (((1 << i12) & j14) != 0) {
                    kVarL2 = kVarL2.l(((long) i12) + j19);
                }
            }
        }
        if (j15 != 0) {
            while (i10 < 64) {
                if (((1 << i10) & j15) != 0) {
                    kVarL2 = kVarL2.l(((long) i10) + j19 + ((long) 64));
                }
                i10++;
            }
        }
        return kVarL2;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h1.k l(long r30) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.k.l(long):h1.k");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(vb.n.K(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
