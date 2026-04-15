package j5;

import b7.c3;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements b0, a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0[] f10341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdentityHashMap f10342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g5.w f10343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f10344d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f10345e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f10346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o1 f10347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b0[] f10348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m f10349i;

    public l0(g5.w wVar, long[] jArr, b0... b0VarArr) {
        this.f10343c = wVar;
        this.f10341a = b0VarArr;
        wVar.getClass();
        ya.g0 g0Var = ya.i0.f25998b;
        ya.a1 a1Var = ya.a1.f25946e;
        this.f10349i = new m(a1Var, a1Var);
        this.f10342b = new IdentityHashMap();
        this.f10348h = new b0[0];
        for (int i10 = 0; i10 < b0VarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f10341a[i10] = new m1(b0VarArr[i10], j10);
            }
        }
    }

    @Override // j5.a0
    public final void a(b0 b0Var) {
        ArrayList arrayList = this.f10344d;
        arrayList.remove(b0Var);
        if (arrayList.isEmpty()) {
            b0[] b0VarArr = this.f10341a;
            int i10 = 0;
            for (b0 b0Var2 : b0VarArr) {
                i10 += b0Var2.q().f10379a;
            }
            m4.j1[] j1VarArr = new m4.j1[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < b0VarArr.length; i12++) {
                o1 o1VarQ = b0VarArr[i12].q();
                int i13 = o1VarQ.f10379a;
                int i14 = 0;
                while (i14 < i13) {
                    m4.j1 j1VarA = o1VarQ.a(i14);
                    int i15 = j1VarA.f14304a;
                    m4.q[] qVarArr = new m4.q[i15];
                    for (int i16 = 0; i16 < i15; i16++) {
                        m4.q qVar = j1VarA.f14307d[i16];
                        m4.p pVarA = qVar.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i12);
                        sb.append(":");
                        String str = qVar.f14531a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        pVarA.f14476a = sb.toString();
                        qVarArr[i16] = new m4.q(pVarA);
                    }
                    m4.j1 j1Var = new m4.j1(i12 + ":" + j1VarA.f14305b, qVarArr);
                    this.f10345e.put(j1Var, j1VarA);
                    j1VarArr[i11] = j1Var;
                    i14++;
                    i11++;
                }
            }
            this.f10347g = new o1(j1VarArr);
            a0 a0Var = this.f10346f;
            a0Var.getClass();
            a0Var.a(this);
        }
    }

    @Override // j5.d1
    public final void c(e1 e1Var) {
        a0 a0Var = this.f10346f;
        a0Var.getClass();
        a0Var.c(this);
    }

    @Override // j5.e1
    public final long d() {
        return this.f10349i.d();
    }

    @Override // j5.e1
    public final boolean e(v4.f0 f0Var) {
        ArrayList arrayList = this.f10344d;
        if (arrayList.isEmpty()) {
            return this.f10349i.e(f0Var);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b0) arrayList.get(i10)).e(f0Var);
        }
        return false;
    }

    @Override // j5.b0
    public final void f() {
        for (b0 b0Var : this.f10341a) {
            b0Var.f();
        }
    }

    @Override // j5.b0
    public final void g(a0 a0Var, long j10) {
        this.f10346f = a0Var;
        ArrayList arrayList = this.f10344d;
        b0[] b0VarArr = this.f10341a;
        Collections.addAll(arrayList, b0VarArr);
        for (b0 b0Var : b0VarArr) {
            b0Var.g(this, j10);
        }
    }

    @Override // j5.b0
    public final long h(long j10) {
        long jH = this.f10348h[0].h(j10);
        int i10 = 1;
        while (true) {
            b0[] b0VarArr = this.f10348h;
            if (i10 >= b0VarArr.length) {
                return jH;
            }
            if (b0VarArr[i10].h(jH) != jH) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // j5.b0
    public final void i(long j10) {
        for (b0 b0Var : this.f10348h) {
            b0Var.i(j10);
        }
    }

    @Override // j5.b0
    public final long l(m5.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[rVarArr.length];
        int[] iArr3 = new int[rVarArr.length];
        int i10 = 0;
        while (true) {
            int length = rVarArr.length;
            identityHashMap = this.f10342b;
            if (i10 >= length) {
                break;
            }
            c1 c1Var = c1VarArr[i10];
            Integer num = c1Var == null ? null : (Integer) identityHashMap.get(c1Var);
            iArr2[i10] = num == null ? -1 : num.intValue();
            m5.r rVar = rVarArr[i10];
            if (rVar != null) {
                String str = rVar.b().f14305b;
                iArr3[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = rVarArr.length;
        c1[] c1VarArr2 = new c1[length2];
        c1[] c1VarArr3 = new c1[rVarArr.length];
        m5.r[] rVarArr2 = new m5.r[rVarArr.length];
        b0[] b0VarArr = this.f10341a;
        ArrayList arrayList = new ArrayList(b0VarArr.length);
        long j11 = j10;
        int i11 = 0;
        while (i11 < b0VarArr.length) {
            int i12 = 0;
            while (i12 < rVarArr.length) {
                c1VarArr3[i12] = iArr2[i12] == i11 ? c1VarArr[i12] : null;
                if (iArr3[i12] == i11) {
                    m5.r rVar2 = rVarArr[i12];
                    rVar2.getClass();
                    iArr = iArr2;
                    m4.j1 j1Var = (m4.j1) this.f10345e.get(rVar2.b());
                    j1Var.getClass();
                    rVarArr2[i12] = new k0(rVar2, j1Var);
                } else {
                    iArr = iArr2;
                    rVarArr2[i12] = null;
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            b0[] b0VarArr2 = b0VarArr;
            int i13 = i11;
            long jL = b0VarArr2[i11].l(rVarArr2, zArr, c1VarArr3, zArr2, j11);
            if (i13 == 0) {
                j11 = jL;
            } else if (jL != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < rVarArr.length; i14++) {
                if (iArr3[i14] == i13) {
                    c1 c1Var2 = c1VarArr3[i14];
                    c1Var2.getClass();
                    c1VarArr2[i14] = c1VarArr3[i14];
                    identityHashMap.put(c1Var2, Integer.valueOf(i13));
                    z10 = true;
                } else if (iArr4[i14] == i13) {
                    p4.c.i(c1VarArr3[i14] == null);
                }
            }
            if (z10) {
                arrayList.add(b0VarArr2[i13]);
            }
            i11 = i13 + 1;
            b0VarArr = b0VarArr2;
            iArr2 = iArr4;
        }
        System.arraycopy(c1VarArr2, 0, c1VarArr, 0, length2);
        this.f10348h = (b0[]) arrayList.toArray(new b0[0]);
        AbstractList abstractListV = ya.q.v(arrayList, new c3(17));
        this.f10343c.getClass();
        this.f10349i = new m(arrayList, abstractListV);
        return j11;
    }

    @Override // j5.e1
    public final boolean m() {
        return this.f10349i.m();
    }

    @Override // j5.b0
    public final long o(long j10, v4.b1 b1Var) {
        b0[] b0VarArr = this.f10348h;
        return (b0VarArr.length > 0 ? b0VarArr[0] : this.f10341a[0]).o(j10, b1Var);
    }

    @Override // j5.b0
    public final long p() {
        long j10 = -9223372036854775807L;
        for (b0 b0Var : this.f10348h) {
            long jP = b0Var.p();
            if (jP == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && b0Var.h(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (b0 b0Var2 : this.f10348h) {
                    if (b0Var2 == b0Var) {
                        break;
                    }
                    if (b0Var2.h(jP) != jP) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = jP;
            } else if (jP != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // j5.b0
    public final o1 q() {
        o1 o1Var = this.f10347g;
        o1Var.getClass();
        return o1Var;
    }

    @Override // j5.e1
    public final long t() {
        return this.f10349i.t();
    }

    @Override // j5.e1
    public final void w(long j10) {
        this.f10349i.w(j10);
    }
}
