package x0;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f24265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f24266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f24267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f24268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f24269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o.y f24270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f24278n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f24279o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i2.v f24280p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i2.v f24281q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i2.v f24282r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public o.y f24283s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f24284t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f24285u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f24286v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f24287w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public o.x f24288x;

    public d2(a2 a2Var) {
        this.f24265a = a2Var;
        int[] iArr = a2Var.f24236a;
        this.f24266b = iArr;
        Object[] objArr = a2Var.f24238c;
        this.f24267c = objArr;
        this.f24268d = a2Var.f24244i;
        this.f24269e = a2Var.f24245j;
        this.f24270f = a2Var.f24246k;
        int i10 = a2Var.f24237b;
        this.f24271g = i10;
        this.f24272h = (iArr.length / 5) - i10;
        int i11 = a2Var.f24239d;
        this.f24275k = i11;
        this.f24276l = objArr.length - i11;
        this.f24277m = i10;
        this.f24280p = new i2.v();
        this.f24281q = new i2.v();
        this.f24282r = new i2.v();
        this.f24285u = i10;
        this.f24286v = -1;
    }

    public static int i(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    public static void y(d2 d2Var) {
        int i10 = d2Var.f24286v;
        int iR = d2Var.r(i10);
        int[] iArr = d2Var.f24266b;
        int i11 = (iR * 5) + 1;
        int i12 = iArr[i11];
        if ((i12 & 134217728) != 0) {
            return;
        }
        int i13 = (i12 & (-134217729)) | 134217728;
        iArr[i11] = i13;
        if ((67108864 & i13) != 0) {
            return;
        }
        d2Var.S(d2Var.D(iArr, i10));
    }

    public final void A(int i10) {
        a aVar;
        int i11;
        a aVar2;
        int i12;
        int i13;
        int i14 = this.f24272h;
        int i15 = this.f24271g;
        if (i15 != i10) {
            if (!this.f24268d.isEmpty()) {
                int iO = o() - this.f24272h;
                if (i15 < i10) {
                    for (int iB = c2.b(this.f24268d, i15, iO); iB < this.f24268d.size() && (i12 = (aVar2 = (a) this.f24268d.get(iB)).f24233a) < 0 && (i13 = i12 + iO) < i10; iB++) {
                        aVar2.f24233a = i13;
                    }
                } else {
                    for (int iB2 = c2.b(this.f24268d, i10, iO); iB2 < this.f24268d.size() && (i11 = (aVar = (a) this.f24268d.get(iB2)).f24233a) >= 0; iB2++) {
                        aVar.f24233a = -(iO - i11);
                    }
                }
            }
            if (i14 > 0) {
                int[] iArr = this.f24266b;
                int i16 = i10 * 5;
                int i17 = i14 * 5;
                int i18 = i15 * 5;
                if (i10 < i15) {
                    vb.l.h0(i17 + i16, i16, i18, iArr, iArr);
                } else {
                    vb.l.h0(i18, i18 + i17, i16 + i17, iArr, iArr);
                }
            }
            if (i10 < i15) {
                i15 = i10 + i14;
            }
            int iO2 = o();
            if (i15 >= iO2) {
                p.c("Check failed");
            }
            while (i15 < iO2) {
                int i19 = (i15 * 5) + 2;
                int i20 = this.f24266b[i19];
                int iP = i20 > -2 ? i20 : (p() + i20) - (-2);
                if (iP >= i10) {
                    iP = -((p() - iP) - (-2));
                }
                if (iP != i20) {
                    this.f24266b[i19] = iP;
                }
                i15++;
                if (i15 == i10) {
                    i15 += i14;
                }
            }
        }
        this.f24271g = i10;
    }

    public final void B(int i10, int i11) {
        int i12 = this.f24276l;
        int i13 = this.f24275k;
        int i14 = this.f24277m;
        if (i13 != i10) {
            Object[] objArr = this.f24267c;
            if (i10 < i13) {
                System.arraycopy(objArr, i10, objArr, i10 + i12, i13 - i10);
            } else {
                int i15 = i13 + i12;
                System.arraycopy(objArr, i15, objArr, i13, (i10 + i12) - i15);
            }
        }
        int iMin = Math.min(i11 + 1, p());
        if (i14 != iMin) {
            int length = this.f24267c.length - i12;
            if (iMin < i14) {
                int iR = r(iMin);
                int iR2 = r(i14);
                int i16 = this.f24271g;
                while (iR < iR2) {
                    int i17 = (iR * 5) + 4;
                    int i18 = this.f24266b[i17];
                    if (!(i18 >= 0)) {
                        p.c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f24266b[i17] = -((length - i18) + 1);
                    iR++;
                    if (iR == i16) {
                        iR += this.f24272h;
                    }
                }
            } else {
                int iR3 = r(i14);
                int iR4 = r(iMin);
                while (iR3 < iR4) {
                    int i19 = (iR3 * 5) + 4;
                    int i20 = this.f24266b[i19];
                    if (!(i20 < 0)) {
                        p.c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f24266b[i19] = i20 + length + 1;
                    iR3++;
                    if (iR3 == this.f24271g) {
                        iR3 += this.f24272h;
                    }
                }
            }
            this.f24277m = iMin;
        }
        this.f24275k = i10;
    }

    public final Object C(int i10) {
        int iR = r(i10);
        int[] iArr = this.f24266b;
        if ((iArr[(iR * 5) + 1] & 1073741824) != 0) {
            return this.f24267c[h(g(iArr, iR))];
        }
        return null;
    }

    public final int D(int[] iArr, int i10) {
        int i11 = iArr[(r(i10) * 5) + 2];
        return i11 > -2 ? i11 : (p() + i11) - (-2);
    }

    public final Object E(Object obj) {
        if (this.f24278n > 0) {
            w(1, this.f24286v);
        }
        Object[] objArr = this.f24267c;
        int i10 = this.f24273i;
        this.f24273i = i10 + 1;
        Object obj2 = objArr[h(i10)];
        if (this.f24273i > this.f24274j) {
            p.c("Writing to an invalid slot");
        }
        this.f24267c[h(this.f24273i - 1)] = obj;
        return obj2;
    }

    public final void F() {
        int i10;
        o.x xVar = this.f24288x;
        if (xVar != null) {
            while (xVar.f16071b != 0) {
                int iC = v.C(xVar);
                int iR = r(iC);
                int iT = iC + 1;
                int iT2 = t(iC) + iC;
                while (true) {
                    if (iT >= iT2) {
                        i10 = 0;
                        break;
                    } else {
                        if ((this.f24266b[(r(iT) * 5) + 1] & 201326592) != 0) {
                            i10 = 1;
                            break;
                        }
                        iT += t(iT);
                    }
                }
                int[] iArr = this.f24266b;
                int i11 = (iR * 5) + 1;
                int i12 = iArr[i11];
                if (((67108864 & i12) != 0 ? 1 : 0) != i10) {
                    iArr[i11] = (i10 << 26) | ((-67108865) & i12);
                    int iD = D(iArr, iC);
                    if (iD >= 0) {
                        v.i(xVar, iD);
                    }
                }
            }
        }
    }

    public final boolean G() {
        if (!(this.f24278n == 0)) {
            p.c("Cannot remove group while inserting");
        }
        int i10 = this.f24284t;
        int i11 = this.f24273i;
        int iG = g(this.f24266b, r(i10));
        int iK = K();
        N(this.f24286v);
        o.x xVar = this.f24288x;
        if (xVar != null) {
            while (true) {
                int i12 = xVar.f16071b;
                if (i12 == 0) {
                    break;
                }
                if (i12 == 0) {
                    p.a.e("IntList is empty.");
                    throw null;
                }
                if (xVar.f16070a[0] < i10) {
                    break;
                }
                v.C(xVar);
            }
        }
        boolean zH = H(i10, this.f24284t - i10);
        I(iG, this.f24273i - iG, i10 - 1);
        this.f24284t = i10;
        this.f24273i = i11;
        this.f24279o -= iK;
        return zH;
    }

    public final boolean H(int i10, int i11) {
        if (i11 > 0) {
            ArrayList arrayList = this.f24268d;
            A(i10);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f24269e;
                int i12 = i10 + i11;
                int iB = c2.b(this.f24268d, i12, o() - this.f24272h);
                if (iB >= this.f24268d.size()) {
                    iB--;
                }
                int i13 = iB + 1;
                int i14 = 0;
                while (iB >= 0) {
                    a aVar = (a) this.f24268d.get(iB);
                    int iC = c(aVar);
                    if (iC < i10) {
                        break;
                    }
                    if (iC < i12) {
                        aVar.f24233a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i14 == 0) {
                            i14 = iB + 1;
                        }
                        i13 = iB;
                    }
                    iB--;
                }
                z = i13 < i14;
                if (z) {
                    this.f24268d.subList(i13, i14).clear();
                }
            }
            this.f24271g = i10;
            this.f24272h += i11;
            int i15 = this.f24277m;
            if (i15 > i10) {
                this.f24277m = Math.max(i10, i15 - i11);
            }
            int i16 = this.f24285u;
            if (i16 >= this.f24271g) {
                this.f24285u = i16 - i11;
            }
            int i17 = this.f24286v;
            if (i17 >= 0 && (this.f24266b[(r(i17) * 5) + 1] & 67108864) != 0) {
                S(i17);
            }
        }
        return z;
    }

    public final void I(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f24276l;
            int i14 = i10 + i11;
            B(i14, i12);
            this.f24275k = i10;
            this.f24276l = i13 + i11;
            vb.l.p0(i10, i14, this.f24267c);
            int i15 = this.f24274j;
            if (i15 >= i10) {
                this.f24274j = i15 - i11;
            }
        }
    }

    public final Object J(int i10, int i11, Object obj) {
        int iM = M(this.f24266b, r(i10));
        int iG = g(this.f24266b, r(i10 + 1));
        int i12 = iM + i11;
        if (i12 < iM || i12 >= iG) {
            p.c("Write to an invalid slot index " + i11 + " for group " + i10);
        }
        int iH = h(i12);
        Object[] objArr = this.f24267c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    public final int K() {
        int iR = r(this.f24284t);
        int iA = c2.a(this.f24266b, iR) + this.f24284t;
        this.f24284t = iA;
        this.f24273i = g(this.f24266b, r(iA));
        int i10 = this.f24266b[(iR * 5) + 1];
        if ((1073741824 & i10) != 0) {
            return 1;
        }
        return i10 & 67108863;
    }

    public final void L() {
        int i10 = this.f24285u;
        this.f24284t = i10;
        this.f24273i = g(this.f24266b, r(i10));
    }

    public final int M(int[] iArr, int i10) {
        if (i10 >= o()) {
            return this.f24267c.length - this.f24276l;
        }
        int iC = c2.c(iArr, i10);
        return iC < 0 ? (this.f24267c.length - this.f24276l) + iC + 1 : iC;
    }

    public final k0 N(int i10) {
        a aVarQ;
        HashMap map = this.f24269e;
        if (map == null || (aVarQ = Q(i10)) == null) {
            return null;
        }
        return (k0) map.get(aVarQ);
    }

    public final void O() {
        if (this.f24278n != 0) {
            p.c("Key must be supplied when inserting");
        }
        r0 r0Var = k.f24334a;
        P(0, r0Var, r0Var, false);
    }

    public final void P(int i10, Object obj, Object obj2, boolean z10) {
        int i11;
        int i12 = this.f24286v;
        boolean z11 = this.f24278n > 0;
        this.f24282r.c(this.f24279o);
        r0 r0Var = k.f24334a;
        if (z11) {
            int i13 = this.f24284t;
            int iG = g(this.f24266b, r(i13));
            v(1);
            this.f24273i = iG;
            this.f24274j = iG;
            int iR = r(i13);
            int i14 = obj != r0Var ? 1 : 0;
            int i15 = (z10 || obj2 == r0Var) ? 0 : 1;
            int i16 = i(iG, this.f24275k, this.f24276l, this.f24267c.length);
            if (i16 >= 0 && this.f24277m < i13) {
                i16 = -(((this.f24267c.length - this.f24276l) - i16) + 1);
            }
            int[] iArr = this.f24266b;
            int i17 = this.f24286v;
            int i18 = iR * 5;
            iArr[i18] = i10;
            iArr[i18 + 1] = ((z10 ? 1 : 0) << 30) | (i14 << 29) | (i15 << 28);
            iArr[i18 + 2] = i17;
            iArr[i18 + 3] = 0;
            iArr[i18 + 4] = i16;
            int i19 = (z10 ? 1 : 0) + i14 + i15;
            if (i19 > 0) {
                w(i19, i13);
                Object[] objArr = this.f24267c;
                int i20 = this.f24273i;
                if (z10) {
                    objArr[i20] = obj2;
                    i20++;
                }
                if (i14 != 0) {
                    objArr[i20] = obj;
                    i20++;
                }
                if (i15 != 0) {
                    objArr[i20] = obj2;
                    i20++;
                }
                this.f24273i = i20;
            }
            this.f24279o = 0;
            i11 = i13 + 1;
            this.f24286v = i13;
            this.f24284t = i11;
            if (i12 >= 0) {
                N(i12);
            }
        } else {
            this.f24280p.c(i12);
            this.f24281q.c((o() - this.f24272h) - this.f24285u);
            int i21 = this.f24284t;
            int iR2 = r(i21);
            if (!jc.l.a(obj2, r0Var)) {
                if (z10) {
                    T(this.f24284t, obj2);
                } else {
                    R(obj2);
                }
            }
            this.f24273i = M(this.f24266b, iR2);
            this.f24274j = g(this.f24266b, r(this.f24284t + 1));
            int[] iArr2 = this.f24266b;
            int i22 = iR2 * 5;
            this.f24279o = iArr2[i22 + 1] & 67108863;
            this.f24286v = i21;
            this.f24284t = i21 + 1;
            i11 = i21 + iArr2[i22 + 3];
        }
        this.f24285u = i11;
    }

    public final a Q(int i10) {
        ArrayList arrayList;
        int iE;
        if (i10 < 0 || i10 >= p() || (iE = c2.e((arrayList = this.f24268d), i10, p())) < 0) {
            return null;
        }
        return (a) arrayList.get(iE);
    }

    public final void R(Object obj) {
        int iR = r(this.f24284t);
        int i10 = (iR * 5) + 1;
        if ((this.f24266b[i10] & 268435456) == 0) {
            p.c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f24267c;
        int[] iArr = this.f24266b;
        objArr[h(Integer.bitCount(iArr[i10] >> 29) + g(iArr, iR))] = obj;
    }

    public final void S(int i10) {
        if (i10 >= 0) {
            o.x xVar = this.f24288x;
            if (xVar == null) {
                xVar = new o.x();
                this.f24288x = xVar;
            }
            v.i(xVar, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.r(r5)
            int[] r1 = r4.f24266b
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 != 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Updating the node of a group at "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            x0.p.c(r5)
        L2e:
            java.lang.Object[] r5 = r4.f24267c
            int[] r1 = r4.f24266b
            int r0 = r4.g(r1, r0)
            int r0 = r4.h(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.d2.T(int, java.lang.Object):void");
    }

    public final void a(int i10) {
        boolean z10 = false;
        if (!(i10 >= 0)) {
            p.c("Cannot seek backwards");
        }
        if (!(this.f24278n <= 0)) {
            k1.b("Cannot call seek() while inserting");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f24284t + i10;
        if (i11 >= this.f24286v && i11 <= this.f24285u) {
            z10 = true;
        }
        if (!z10) {
            p.c("Cannot seek outside the current group (" + this.f24286v + '-' + this.f24285u + ')');
        }
        this.f24284t = i11;
        int iG = g(this.f24266b, r(i11));
        this.f24273i = iG;
        this.f24274j = iG;
    }

    public final a b(int i10) {
        ArrayList arrayList = this.f24268d;
        int iE = c2.e(arrayList, i10, p());
        if (iE >= 0) {
            return (a) arrayList.get(iE);
        }
        if (i10 > this.f24271g) {
            i10 = -(p() - i10);
        }
        a aVar = new a(i10);
        arrayList.add(-(iE + 1), aVar);
        return aVar;
    }

    public final int c(a aVar) {
        int i10 = aVar.f24233a;
        return i10 < 0 ? p() + i10 : i10;
    }

    public final void d() {
        int i10 = this.f24278n;
        this.f24278n = i10 + 1;
        if (i10 == 0) {
            this.f24281q.c((o() - this.f24272h) - this.f24285u);
        }
    }

    public final void e(boolean z10) {
        this.f24287w = true;
        if (z10 && this.f24280p.f8860b == 0) {
            A(p());
            B(this.f24267c.length - this.f24276l, this.f24271g);
            int i10 = this.f24275k;
            vb.l.p0(i10, this.f24276l + i10, this.f24267c);
            F();
        }
        int[] iArr = this.f24266b;
        int i11 = this.f24271g;
        Object[] objArr = this.f24267c;
        int i12 = this.f24275k;
        ArrayList arrayList = this.f24268d;
        HashMap map = this.f24269e;
        o.y yVar = this.f24270f;
        a2 a2Var = this.f24265a;
        if (!a2Var.f24242g) {
            k1.a("Unexpected writer close()");
        }
        a2Var.f24242g = false;
        a2Var.f24236a = iArr;
        a2Var.f24237b = i11;
        a2Var.f24238c = objArr;
        a2Var.f24239d = i12;
        a2Var.f24244i = arrayList;
        a2Var.f24245j = map;
        a2Var.f24246k = yVar;
    }

    public final int f(int i10) {
        return g(this.f24266b, r(i10));
    }

    public final int g(int[] iArr, int i10) {
        if (i10 >= o()) {
            return this.f24267c.length - this.f24276l;
        }
        int i11 = iArr[(i10 * 5) + 4];
        return i11 < 0 ? (this.f24267c.length - this.f24276l) + i11 + 1 : i11;
    }

    public final int h(int i10) {
        return (this.f24276l * (i10 < this.f24275k ? 0 : 1)) + i10;
    }

    public final void j() {
        o.g0 g0Var;
        boolean z10 = this.f24278n > 0;
        int i10 = this.f24284t;
        int i11 = this.f24285u;
        int i12 = this.f24286v;
        int iR = r(i12);
        int i13 = this.f24279o;
        int i14 = i10 - i12;
        int i15 = iR * 5;
        int i16 = i15 + 1;
        boolean z11 = (this.f24266b[i16] & 1073741824) != 0;
        i2.v vVar = this.f24282r;
        if (z10) {
            o.y yVar = this.f24283s;
            if (yVar != null && (g0Var = (o.g0) yVar.b(i12)) != null) {
                Object[] objArr = g0Var.f15970a;
                int i17 = g0Var.f15971b;
                for (int i18 = 0; i18 < i17; i18++) {
                    E(objArr[i18]);
                }
            }
            int[] iArr = this.f24266b;
            iArr[i15 + 3] = i14;
            c2.d(iArr, iR, i13);
            int iB = vVar.b();
            if (z11) {
                i13 = 1;
            }
            this.f24279o = iB + i13;
            int iD = D(this.f24266b, i12);
            this.f24286v = iD;
            int iP = iD < 0 ? p() : r(iD + 1);
            int iG = iP >= 0 ? g(this.f24266b, iP) : 0;
            this.f24273i = iG;
            this.f24274j = iG;
            return;
        }
        if (i10 != i11) {
            p.c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f24266b;
        int i19 = i15 + 3;
        int i20 = iArr2[i19];
        int i21 = iArr2[i16] & 67108863;
        iArr2[i19] = i14;
        c2.d(iArr2, iR, i13);
        int iB2 = this.f24280p.b();
        this.f24285u = (o() - this.f24272h) - this.f24281q.b();
        this.f24286v = iB2;
        int iD2 = D(this.f24266b, i12);
        int iB3 = vVar.b();
        this.f24279o = iB3;
        if (iD2 == iB2) {
            this.f24279o = iB3 + (z11 ? 0 : i13 - i21);
            return;
        }
        int i22 = i14 - i20;
        int i23 = z11 ? 0 : i13 - i21;
        if (i22 != 0 || i23 != 0) {
            while (iD2 != 0 && iD2 != iB2 && (i23 != 0 || i22 != 0)) {
                int iR2 = r(iD2);
                if (i22 != 0) {
                    int[] iArr3 = this.f24266b;
                    int i24 = (iR2 * 5) + 3;
                    iArr3[i24] = iArr3[i24] + i22;
                }
                if (i23 != 0) {
                    int[] iArr4 = this.f24266b;
                    c2.d(iArr4, iR2, (iArr4[(iR2 * 5) + 1] & 67108863) + i23);
                }
                int[] iArr5 = this.f24266b;
                if ((iArr5[(iR2 * 5) + 1] & 1073741824) != 0) {
                    i23 = 0;
                }
                iD2 = D(iArr5, iD2);
            }
        }
        this.f24279o += i23;
    }

    public final void k() {
        if (this.f24278n <= 0) {
            k1.b("Unbalanced begin/end insert");
        }
        int i10 = this.f24278n - 1;
        this.f24278n = i10;
        if (i10 == 0) {
            if (this.f24282r.f8860b != this.f24280p.f8860b) {
                p.c("startGroup/endGroup mismatch while inserting");
            }
            this.f24285u = (o() - this.f24272h) - this.f24281q.b();
        }
    }

    public final void l(int i10) {
        boolean z10 = false;
        if (!(this.f24278n <= 0)) {
            p.c("Cannot call ensureStarted() while inserting");
        }
        int i11 = this.f24286v;
        if (i11 != i10) {
            if (i10 >= i11 && i10 < this.f24285u) {
                z10 = true;
            }
            if (!z10) {
                p.c("Started group at " + i10 + " must be a subgroup of the group at " + i11);
            }
            int i12 = this.f24284t;
            int i13 = this.f24273i;
            int i14 = this.f24274j;
            this.f24284t = i10;
            O();
            this.f24284t = i12;
            this.f24273i = i13;
            this.f24274j = i14;
        }
    }

    public final void m(int i10, int i11, int i12) {
        if (i10 >= this.f24271g) {
            i10 = -((p() - i10) + 2);
        }
        while (i12 < i11) {
            this.f24266b[(r(i12) * 5) + 2] = i10;
            int i13 = this.f24266b[(r(i12) * 5) + 3] + i12;
            m(i12, i13, i12 + 1);
            i12 = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00eb, code lost:
    
        p.a.d("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f0, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(int r20, ic.n r21) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.d2.n(int, ic.n):void");
    }

    public final int o() {
        return this.f24266b.length / 5;
    }

    public final int p() {
        return o() - this.f24272h;
    }

    public final Object q(int i10) {
        int iR = r(i10);
        int[] iArr = this.f24266b;
        int i11 = (iR * 5) + 1;
        if ((iArr[i11] & 268435456) == 0) {
            return k.f24334a;
        }
        return this.f24267c[Integer.bitCount(iArr[i11] >> 29) + g(iArr, iR)];
    }

    public final int r(int i10) {
        return (this.f24272h * (i10 < this.f24271g ? 0 : 1)) + i10;
    }

    public final Object s(int i10) {
        int iR = r(i10);
        int[] iArr = this.f24266b;
        int i11 = iR * 5;
        int i12 = iArr[i11 + 1];
        if ((536870912 & i12) == 0) {
            return null;
        }
        return this.f24267c[Integer.bitCount(i12 >> 30) + iArr[i11 + 4]];
    }

    public final int t(int i10) {
        return c2.a(this.f24266b, r(i10));
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f24284t + " end=" + this.f24285u + " size = " + p() + " gap=" + this.f24271g + '-' + (this.f24271g + this.f24272h) + ')';
    }

    public final boolean u(int i10, int i11) {
        int iO;
        int iT;
        if (i11 == this.f24286v) {
            iO = this.f24285u;
        } else {
            i2.v vVar = this.f24280p;
            if (i11 > vVar.a(0)) {
                iT = t(i11);
            } else {
                int[] iArr = vVar.f8859a;
                int iMin = Math.min(iArr.length, vVar.f8860b);
                int i12 = 0;
                while (true) {
                    if (i12 >= iMin) {
                        i12 = -1;
                        break;
                    }
                    if (iArr[i12] == i11) {
                        break;
                    }
                    i12++;
                }
                if (i12 < 0) {
                    iT = t(i11);
                } else {
                    iO = (o() - this.f24272h) - this.f24281q.f8859a[i12];
                }
            }
            iO = iT + i11;
        }
        return i10 > i11 && i10 < iO;
    }

    public final void v(int i10) {
        if (i10 > 0) {
            int i11 = this.f24284t;
            A(i11);
            int i12 = this.f24271g;
            int i13 = this.f24272h;
            int[] iArr = this.f24266b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                vb.l.h0(0, 0, i12 * 5, iArr, iArr2);
                vb.l.h0((i12 + i15) * 5, (i13 + i12) * 5, length * 5, iArr, iArr2);
                this.f24266b = iArr2;
                i13 = i15;
            }
            int i16 = this.f24285u;
            if (i16 >= i12) {
                this.f24285u = i16 + i10;
            }
            int i17 = i12 + i10;
            this.f24271g = i17;
            this.f24272h = i13 - i10;
            int i18 = i(i14 > 0 ? f(i11 + i10) : 0, this.f24277m >= i12 ? this.f24275k : 0, this.f24276l, this.f24267c.length);
            for (int i19 = i12; i19 < i17; i19++) {
                this.f24266b[(i19 * 5) + 4] = i18;
            }
            int i20 = this.f24277m;
            if (i20 >= i12) {
                this.f24277m = i20 + i10;
            }
        }
    }

    public final void w(int i10, int i11) {
        if (i10 > 0) {
            B(this.f24273i, i11);
            int i12 = this.f24275k;
            int i13 = this.f24276l;
            if (i13 < i10) {
                Object[] objArr = this.f24267c;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                int i17 = i13 + i12;
                System.arraycopy(objArr, 0, objArr2, 0, i12);
                System.arraycopy(objArr, i17, objArr2, i12 + i16, length - i17);
                this.f24267c = objArr2;
                i13 = i16;
            }
            int i18 = this.f24274j;
            if (i18 >= i12) {
                this.f24274j = i18 + i10;
            }
            this.f24275k = i12 + i10;
            this.f24276l = i13 - i10;
        }
    }

    public final boolean x(int i10) {
        return (this.f24266b[(r(i10) * 5) + 1] & 1073741824) != 0;
    }

    public final void z(a2 a2Var, int i10) {
        if (this.f24278n <= 0) {
            p.c("Check failed");
        }
        if (i10 == 0 && this.f24284t == 0 && this.f24265a.f24237b == 0) {
            int[] iArr = a2Var.f24236a;
            int i11 = iArr[(i10 * 5) + 3];
            int i12 = a2Var.f24237b;
            if (i11 == i12) {
                int[] iArr2 = this.f24266b;
                Object[] objArr = this.f24267c;
                ArrayList arrayList = this.f24268d;
                HashMap map = this.f24269e;
                o.y yVar = this.f24270f;
                Object[] objArr2 = a2Var.f24238c;
                int i13 = a2Var.f24239d;
                HashMap map2 = a2Var.f24245j;
                o.y yVar2 = a2Var.f24246k;
                this.f24266b = iArr;
                this.f24267c = objArr2;
                this.f24268d = a2Var.f24244i;
                this.f24271g = i12;
                this.f24272h = (iArr.length / 5) - i12;
                this.f24275k = i13;
                this.f24276l = objArr2.length - i13;
                this.f24277m = i12;
                this.f24269e = map2;
                this.f24270f = yVar2;
                a2Var.f24236a = iArr2;
                a2Var.f24237b = 0;
                a2Var.f24238c = objArr;
                a2Var.f24239d = 0;
                a2Var.f24244i = arrayList;
                a2Var.f24245j = map;
                a2Var.f24246k = yVar;
                return;
            }
        }
        d2 d2VarK = a2Var.k();
        try {
            v.u(d2VarK, i10, this, true, true, false);
            d2VarK.e(true);
        } catch (Throwable th2) {
            d2VarK.e(false);
            throw th2;
        }
    }
}
