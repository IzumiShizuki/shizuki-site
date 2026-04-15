package y6;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m4.p0;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements r5.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f25591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p4.s f25592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseIntArray f25593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s3.e f25594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o6.j f25595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseArray f25596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f25597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseBooleanArray f25598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x f25599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public w5.a f25600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public r5.q f25601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f25602n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f25603o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f25604p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f25605q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f0 f25606r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f25607s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f25608t;

    public d0(int i10, int i11, o6.j jVar, p4.y yVar, s3.e eVar) {
        this.f25594f = eVar;
        this.f25589a = i10;
        this.f25590b = i11;
        this.f25595g = jVar;
        if (i10 == 1 || i10 == 2) {
            this.f25591c = Collections.singletonList(yVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f25591c = arrayList;
            arrayList.add(yVar);
        }
        this.f25592d = new p4.s(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f25597i = sparseBooleanArray;
        this.f25598j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f25596h = sparseArray;
        this.f25593e = new SparseIntArray();
        this.f25599k = new x(1);
        this.f25601m = r5.q.n0;
        this.f25608t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i12 = 0; i12 < size; i12++) {
            sparseArray.put(sparseArray2.keyAt(i12), (f0) sparseArray2.valueAt(i12));
        }
        sparseArray.put(0, new b0(new v2.e(this)));
        this.f25606r = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // r5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(r5.o r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            p4.s r0 = r6.f25592d
            byte[] r0 = r0.f16611a
            r5.k r7 = (r5.k) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.i(r0, r1, r2, r1)
            r2 = 0
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = 0
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.r(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.d0.f(r5.o):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    @Override // r5.n
    public final int g(r5.o oVar, b0.a aVar) throws p0 {
        r5.o oVar2;
        int i10;
        ?? r12;
        int i11;
        int i12;
        boolean z10;
        int i13;
        long length = oVar.getLength();
        int i14 = this.f25589a;
        boolean z11 = i14 == 2;
        if (this.f25603o) {
            long j10 = -9223372036854775807L;
            x xVar = this.f25599k;
            if (length != -1 && !z11 && !xVar.f25860d) {
                int i15 = this.f25608t;
                p4.y yVar = xVar.f25858b;
                p4.s sVar = xVar.f25859c;
                if (i15 <= 0) {
                    xVar.a(oVar);
                    return 0;
                }
                if (xVar.f25862f) {
                    if (xVar.f25864h == -9223372036854775807L) {
                        xVar.a(oVar);
                        return 0;
                    }
                    if (xVar.f25861e) {
                        long j11 = xVar.f25863g;
                        if (j11 == -9223372036854775807L) {
                            xVar.a(oVar);
                            return 0;
                        }
                        xVar.f25865i = yVar.c(xVar.f25864h) - yVar.b(j11);
                        xVar.a(oVar);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800, oVar.getLength());
                    long j12 = 0;
                    if (oVar.getPosition() != j12) {
                        aVar.f1169a = j12;
                        return 1;
                    }
                    sVar.D(iMin);
                    oVar.q();
                    oVar.z(sVar.f16611a, 0, iMin);
                    int i16 = sVar.f16612b;
                    int i17 = sVar.f16613c;
                    while (true) {
                        if (i16 >= i17) {
                            break;
                        }
                        if (sVar.f16611a[i16] == 71) {
                            long jY = ua.l.Y(sVar, i16, i15);
                            if (jY != -9223372036854775807L) {
                                j10 = jY;
                                break;
                            }
                        }
                        i16++;
                    }
                    xVar.f25863g = j10;
                    xVar.f25861e = true;
                    return 0;
                }
                long length2 = oVar.getLength();
                int iMin2 = (int) Math.min(112800, length2);
                long j13 = length2 - ((long) iMin2);
                if (oVar.getPosition() != j13) {
                    aVar.f1169a = j13;
                    return 1;
                }
                sVar.D(iMin2);
                oVar.q();
                oVar.z(sVar.f16611a, 0, iMin2);
                int i18 = sVar.f16612b;
                int i19 = sVar.f16613c;
                int i20 = i19 - 188;
                while (true) {
                    if (i20 < i18) {
                        break;
                    }
                    byte[] bArr = sVar.f16611a;
                    int i21 = -4;
                    int i22 = 0;
                    while (true) {
                        if (i21 > 4) {
                            break;
                        }
                        int i23 = (i21 * 188) + i20;
                        if (i23 < i18 || i23 >= i19 || bArr[i23] != 71) {
                            i22 = 0;
                        } else {
                            i22++;
                            if (i22 == 5) {
                                long jY2 = ua.l.Y(sVar, i20, i15);
                                if (jY2 != -9223372036854775807L) {
                                    j10 = jY2;
                                    break;
                                }
                            }
                        }
                        i21++;
                    }
                    i20--;
                }
                xVar.f25864h = j10;
                xVar.f25862f = true;
                return 0;
            }
            if (this.f25604p) {
                i10 = i14;
                z10 = false;
                i13 = 1;
            } else {
                this.f25604p = true;
                long j14 = xVar.f25865i;
                if (j14 != -9223372036854775807L) {
                    i10 = i14;
                    z10 = false;
                    i13 = 1;
                    w5.a aVar2 = new w5.a(new m3.l(29), new ah.j(this.f25608t, xVar.f25858b), j14, j14 + 1, 0L, length, 188L, 940);
                    this.f25600l = aVar2;
                    this.f25601m.a(aVar2.f23404a);
                } else {
                    i10 = i14;
                    z10 = false;
                    i13 = 1;
                    this.f25601m.a(new r5.s(j14));
                }
            }
            if (this.f25605q) {
                this.f25605q = z10;
                i(0L, 0L);
                if (oVar.getPosition() != 0) {
                    aVar.f1169a = 0L;
                    return i13;
                }
            }
            w5.a aVar3 = this.f25600l;
            if (aVar3 != null && aVar3.f23406c != null) {
                return aVar3.b(oVar, aVar);
            }
            oVar2 = oVar;
            r12 = z10;
        } else {
            oVar2 = oVar;
            i10 = i14;
            r12 = 0;
        }
        p4.s sVar2 = this.f25592d;
        byte[] bArr2 = sVar2.f16611a;
        if (9400 - sVar2.f16612b < 188) {
            int iA = sVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, sVar2.f16612b, bArr2, r12, iA);
            }
            sVar2.E(bArr2, iA);
        }
        while (true) {
            int iA2 = sVar2.a();
            SparseArray sparseArray = this.f25596h;
            if (iA2 >= 188) {
                int i24 = sVar2.f16612b;
                int i25 = sVar2.f16613c;
                byte[] bArr3 = sVar2.f16611a;
                int i26 = i24;
                while (i26 < i25 && bArr3[i26] != 71) {
                    i26++;
                }
                sVar2.G(i26);
                int i27 = i26 + 188;
                if (i27 > i25) {
                    int i28 = (i26 - i24) + this.f25607s;
                    this.f25607s = i28;
                    i11 = i10;
                    i12 = 2;
                    if (i11 == 2 && i28 > 376) {
                        throw p0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i11 = i10;
                    i12 = 2;
                    this.f25607s = r12;
                }
                int i29 = sVar2.f16613c;
                if (i27 > i29) {
                    return r12;
                }
                int iG = sVar2.g();
                if ((8388608 & iG) != 0) {
                    sVar2.G(i27);
                    return r12;
                }
                int i30 = (4194304 & iG) != 0 ? 1 : 0;
                int i31 = (2096896 & iG) >> 8;
                boolean z12 = (iG & 32) != 0;
                f0 f0Var = (iG & 16) != 0 ? (f0) sparseArray.get(i31) : null;
                if (f0Var == null) {
                    sVar2.G(i27);
                    return r12;
                }
                if (i11 != i12) {
                    int i32 = iG & 15;
                    SparseIntArray sparseIntArray = this.f25593e;
                    int i33 = sparseIntArray.get(i31, i32 - 1);
                    sparseIntArray.put(i31, i32);
                    if (i33 == i32) {
                        sVar2.G(i27);
                        return r12;
                    }
                    if (i32 != ((i33 + 1) & 15)) {
                        f0Var.a();
                    }
                }
                if (z12) {
                    int iU = sVar2.u();
                    i30 |= (sVar2.u() & 64) != 0 ? 2 : 0;
                    sVar2.H(iU - 1);
                }
                boolean z13 = this.f25603o;
                if (i11 == i12 || z13 || !this.f25598j.get(i31, r12)) {
                    sVar2.F(i27);
                    f0Var.b(i30, sVar2);
                    sVar2.F(i29);
                }
                if (i11 != i12 && !z13 && this.f25603o && length != -1) {
                    this.f25605q = true;
                }
                sVar2.G(i27);
                return r12;
            }
            int i34 = sVar2.f16613c;
            int i35 = oVar2.read(bArr2, i34, 9400 - i34);
            if (i35 == -1) {
                for (int i36 = 0; i36 < sparseArray.size(); i36++) {
                    f0 f0Var2 = (f0) sparseArray.valueAt(i36);
                    if (f0Var2 instanceof w) {
                        w wVar = (w) f0Var2;
                        if (wVar.f25847c == 3 && wVar.f25854j == -1 && (!z11 || !(wVar.f25845a instanceof j))) {
                            wVar.b(1, new p4.s());
                        }
                    }
                }
                return -1;
            }
            sVar2.F(i34 + i35);
        }
    }

    @Override // r5.n
    public final void h(r5.q qVar) {
        if ((this.f25590b & 1) == 0) {
            qVar = new b5.d0(qVar, this.f25595g);
        }
        this.f25601m = qVar;
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        w5.a aVar;
        p4.c.i(this.f25589a != 2);
        List list = this.f25591c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            p4.y yVar = (p4.y) list.get(i10);
            boolean z10 = yVar.e() == -9223372036854775807L;
            if (!z10) {
                long jD = yVar.d();
                z10 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
            }
            if (z10) {
                yVar.g(j11);
            }
        }
        if (j11 != 0 && (aVar = this.f25600l) != null) {
            aVar.d(j11);
        }
        this.f25592d.D(0);
        this.f25593e.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f25596h;
            if (i11 >= sparseArray.size()) {
                this.f25607s = 0;
                return;
            } else {
                ((f0) sparseArray.valueAt(i11)).a();
                i11++;
            }
        }
    }

    @Override // r5.n
    public final List j() {
        g0 g0Var = i0.f25998b;
        return a1.f25946e;
    }

    @Override // r5.n
    public final void a() {
    }

    @Override // r5.n
    public final r5.n c() {
        return this;
    }
}
