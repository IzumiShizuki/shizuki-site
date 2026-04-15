package c1;

import java.util.Arrays;
import pc.f0;
import x0.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f3232e = new m(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1.b f3235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f3236d;

    public m(int i10, int i11, Object[] objArr, e1.b bVar) {
        this.f3233a = i10;
        this.f3234b = i11;
        this.f3235c = bVar;
        this.f3236d = objArr;
    }

    public static m j(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, e1.b bVar) {
        if (i12 > 30) {
            return new m(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int iJ = f0.J(i10, i12);
        int iJ2 = f0.J(i11, i12);
        if (iJ != iJ2) {
            return new m((1 << iJ) | (1 << iJ2), 0, iJ < iJ2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new m(0, 1 << iJ, new Object[]{j(i10, obj, obj2, i11, obj3, obj4, i12 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i10, int i11, int i12, Object obj, Object obj2, int i13, e1.b bVar) {
        Object obj3 = this.f3236d[i10];
        m mVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i10), i12, obj, obj2, i13 + 5, bVar);
        int iT = t(i11);
        int i14 = iT + 1;
        Object[] objArr = this.f3236d;
        Object[] objArr2 = new Object[objArr.length - 1];
        vb.l.m0(0, i10, 6, objArr, objArr2);
        vb.l.i0(i10, i10 + 2, i14, objArr, objArr2);
        objArr2[iT - 1] = mVarJ;
        vb.l.i0(iT, i14, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.f3234b == 0) {
            return this.f3236d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f3233a);
        int length = this.f3236d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += s(i10).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        oc.b bVarD = nh.b.D(nh.b.E(0, this.f3236d.length), 2);
        int i10 = bVarD.f16307a;
        int i11 = bVarD.f16308b;
        int i12 = bVarD.f16309c;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (!jc.l.a(obj, this.f3236d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i10, int i11, Object obj) {
        int iJ = 1 << f0.J(i10, i11);
        if (h(iJ)) {
            return jc.l.a(obj, this.f3236d[f(iJ)]);
        }
        if (!i(iJ)) {
            return false;
        }
        m mVarS = s(t(iJ));
        return i11 == 30 ? mVarS.c(obj) : mVarS.d(i10, i11 + 5, obj);
    }

    public final boolean e(m mVar) {
        if (this == mVar) {
            return true;
        }
        if (this.f3234b == mVar.f3234b && this.f3233a == mVar.f3233a) {
            int length = this.f3236d.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f3236d[i10] == mVar.f3236d[i10]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i10) {
        return Integer.bitCount((i10 - 1) & this.f3233a) * 2;
    }

    public final Object g(int i10, int i11, Object obj) {
        int iJ = 1 << f0.J(i10, i11);
        if (h(iJ)) {
            int iF = f(iJ);
            if (jc.l.a(obj, this.f3236d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iJ)) {
            return null;
        }
        m mVarS = s(t(iJ));
        if (i11 != 30) {
            return mVarS.g(i10, i11 + 5, obj);
        }
        oc.b bVarD = nh.b.D(nh.b.E(0, mVarS.f3236d.length), 2);
        int i12 = bVarD.f16307a;
        int i13 = bVarD.f16308b;
        int i14 = bVarD.f16309c;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return null;
        }
        while (!jc.l.a(obj, mVarS.f3236d[i12])) {
            if (i12 == i13) {
                return null;
            }
            i12 += i14;
        }
        return mVarS.x(i12);
    }

    public final boolean h(int i10) {
        return (i10 & this.f3233a) != 0;
    }

    public final boolean i(int i10) {
        return (i10 & this.f3234b) != 0;
    }

    public final m k(int i10, e eVar) {
        eVar.b(eVar.f3219f - 1);
        eVar.f3217d = x(i10);
        Object[] objArr = this.f3236d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f3235c != eVar.f3215b) {
            return new m(0, 0, f0.j(i10, objArr), eVar.f3215b);
        }
        this.f3236d = f0.j(i10, objArr);
        return this;
    }

    public final m l(int i10, Object obj, Object obj2, int i11, e eVar) {
        e eVar2;
        m mVarL;
        int iJ = 1 << f0.J(i10, i11);
        boolean zH = h(iJ);
        e1.b bVar = this.f3235c;
        if (zH) {
            int iF = f(iJ);
            if (!jc.l.a(obj, this.f3236d[iF])) {
                eVar.b(eVar.f3219f + 1);
                e1.b bVar2 = eVar.f3215b;
                if (bVar != bVar2) {
                    return new m(this.f3233a ^ iJ, this.f3234b | iJ, a(iF, iJ, i10, obj, obj2, i11, bVar2), bVar2);
                }
                this.f3236d = a(iF, iJ, i10, obj, obj2, i11, bVar2);
                this.f3233a ^= iJ;
                this.f3234b |= iJ;
                return this;
            }
            eVar.f3217d = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (bVar == eVar.f3215b) {
                this.f3236d[iF + 1] = obj2;
                return this;
            }
            eVar.f3218e++;
            Object[] objArr = this.f3236d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            jc.l.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = obj2;
            return new m(this.f3233a, this.f3234b, objArrCopyOf, eVar.f3215b);
        }
        if (!i(iJ)) {
            eVar.b(eVar.f3219f + 1);
            e1.b bVar3 = eVar.f3215b;
            int iF2 = f(iJ);
            if (bVar != bVar3) {
                return new m(this.f3233a | iJ, this.f3234b, f0.h(this.f3236d, iF2, obj, obj2), bVar3);
            }
            this.f3236d = f0.h(this.f3236d, iF2, obj, obj2);
            this.f3233a |= iJ;
            return this;
        }
        int iT = t(iJ);
        m mVarS = s(iT);
        if (i11 == 30) {
            oc.b bVarD = nh.b.D(nh.b.E(0, mVarS.f3236d.length), 2);
            int i12 = bVarD.f16307a;
            int i13 = bVarD.f16308b;
            int i14 = bVarD.f16309c;
            if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                eVar.b(eVar.f3219f + 1);
                mVarL = new m(0, 0, f0.h(mVarS.f3236d, 0, obj, obj2), eVar.f3215b);
                eVar2 = eVar;
            } else {
                while (!jc.l.a(obj, mVarS.f3236d[i12])) {
                    if (i12 == i13) {
                        eVar.b(eVar.f3219f + 1);
                        mVarL = new m(0, 0, f0.h(mVarS.f3236d, 0, obj, obj2), eVar.f3215b);
                        break;
                    }
                    i12 += i14;
                }
                eVar.f3217d = mVarS.x(i12);
                if (mVarS.f3235c == eVar.f3215b) {
                    mVarS.f3236d[i12 + 1] = obj2;
                    mVarL = mVarS;
                } else {
                    eVar.f3218e++;
                    Object[] objArr2 = mVarS.f3236d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    jc.l.d(objArrCopyOf2, "copyOf(...)");
                    objArrCopyOf2[i12 + 1] = obj2;
                    mVarL = new m(0, 0, objArrCopyOf2, eVar.f3215b);
                }
                eVar2 = eVar;
            }
        } else {
            eVar2 = eVar;
            mVarL = mVarS.l(i10, obj, obj2, i11 + 5, eVar2);
        }
        return mVarS == mVarL ? this : r(iT, mVarL, eVar2.f3215b);
    }

    public final m m(m mVar, int i10, e1.a aVar, e eVar) {
        Object[] objArr;
        m mVarJ;
        if (this == mVar) {
            aVar.f6060a += b();
            return this;
        }
        if (i10 > 30) {
            e1.b bVar = eVar.f3215b;
            int i11 = mVar.f3234b;
            Object[] objArr2 = this.f3236d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + mVar.f3236d.length);
            jc.l.d(objArrCopyOf, "copyOf(...)");
            int length = this.f3236d.length;
            oc.b bVarD = nh.b.D(nh.b.E(0, mVar.f3236d.length), 2);
            int i12 = bVarD.f16307a;
            int i13 = bVarD.f16308b;
            int i14 = bVarD.f16309c;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (c(mVar.f3236d[i12])) {
                        aVar.f6060a++;
                    } else {
                        Object[] objArr3 = mVar.f3236d;
                        objArrCopyOf[length] = objArr3[i12];
                        objArrCopyOf[length + 1] = objArr3[i12 + 1];
                        length += 2;
                    }
                    if (i12 == i13) {
                        break;
                    }
                    i12 += i14;
                }
            }
            if (length != this.f3236d.length) {
                if (length == mVar.f3236d.length) {
                    return mVar;
                }
                if (length == objArrCopyOf.length) {
                    return new m(0, 0, objArrCopyOf, bVar);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                jc.l.d(objArrCopyOf2, "copyOf(...)");
                return new m(0, 0, objArrCopyOf2, bVar);
            }
        } else {
            int i15 = this.f3234b | mVar.f3234b;
            int i16 = this.f3233a;
            int i17 = mVar.f3233a;
            int i18 = (i16 ^ i17) & (~i15);
            int i19 = i16 & i17;
            int i20 = i18;
            while (i19 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i19);
                if (jc.l.a(this.f3236d[f(iLowestOneBit)], mVar.f3236d[mVar.f(iLowestOneBit)])) {
                    i20 |= iLowestOneBit;
                } else {
                    i15 |= iLowestOneBit;
                }
                i19 ^= iLowestOneBit;
            }
            if ((i15 & i20) != 0) {
                k1.b("Check failed.");
            }
            m mVar2 = (jc.l.a(this.f3235c, eVar.f3215b) && this.f3233a == i20 && this.f3234b == i15) ? this : new m(i20, i15, new Object[Integer.bitCount(i15) + (Integer.bitCount(i20) * 2)], null);
            int i21 = i15;
            int i22 = 0;
            while (i21 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i21);
                Object[] objArr4 = mVar2.f3236d;
                int length2 = (objArr4.length - 1) - i22;
                if (i(iLowestOneBit2)) {
                    mVarJ = s(t(iLowestOneBit2));
                    if (mVar.i(iLowestOneBit2)) {
                        mVarJ = mVarJ.m(mVar.s(mVar.t(iLowestOneBit2)), i10 + 5, aVar, eVar);
                        objArr = objArr4;
                    } else if (mVar.h(iLowestOneBit2)) {
                        int iF = mVar.f(iLowestOneBit2);
                        Object obj = mVar.f3236d[iF];
                        Object objX = mVar.x(iF);
                        int i23 = eVar.f3219f;
                        objArr = objArr4;
                        mVarJ = mVarJ.l(obj != null ? obj.hashCode() : 0, obj, objX, i10 + 5, eVar);
                        if (eVar.f3219f == i23) {
                            aVar.f6060a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (mVar.i(iLowestOneBit2)) {
                        m mVarS = mVar.s(mVar.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.f3236d[iF2];
                            int i24 = i10 + 5;
                            if (mVarS.d(obj2 != null ? obj2.hashCode() : 0, i24, obj2)) {
                                aVar.f6060a++;
                                mVarJ = mVarS;
                            } else {
                                mVarJ = mVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i24, eVar);
                            }
                        } else {
                            mVarJ = mVarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.f3236d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = mVar.f(iLowestOneBit2);
                        Object obj4 = mVar.f3236d[iF4];
                        mVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, mVar.x(iF4), i10 + 5, eVar.f3215b);
                    }
                }
                objArr[length2] = mVarJ;
                i22++;
                i21 ^= iLowestOneBit2;
            }
            int i25 = 0;
            while (i20 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i20);
                int i26 = i25 * 2;
                if (mVar.h(iLowestOneBit3)) {
                    int iF5 = mVar.f(iLowestOneBit3);
                    Object[] objArr5 = mVar2.f3236d;
                    objArr5[i26] = mVar.f3236d[iF5];
                    objArr5[i26 + 1] = mVar.x(iF5);
                    if (h(iLowestOneBit3)) {
                        aVar.f6060a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = mVar2.f3236d;
                    objArr6[i26] = this.f3236d[iF6];
                    objArr6[i26 + 1] = x(iF6);
                }
                i25++;
                i20 ^= iLowestOneBit3;
            }
            if (!e(mVar2)) {
                return mVar.e(mVar2) ? mVar : mVar2;
            }
        }
        return this;
    }

    public final m n(int i10, Object obj, int i11, e eVar) {
        m mVarN;
        int iJ = 1 << f0.J(i10, i11);
        if (h(iJ)) {
            int iF = f(iJ);
            if (jc.l.a(obj, this.f3236d[iF])) {
                return p(iF, iJ, eVar);
            }
        } else if (i(iJ)) {
            int iT = t(iJ);
            m mVarS = s(iT);
            if (i11 == 30) {
                oc.b bVarD = nh.b.D(nh.b.E(0, mVarS.f3236d.length), 2);
                int i12 = bVarD.f16307a;
                int i13 = bVarD.f16308b;
                int i14 = bVarD.f16309c;
                if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                    mVarN = mVarS;
                    break;
                }
                while (!jc.l.a(obj, mVarS.f3236d[i12])) {
                    if (i12 == i13) {
                        mVarN = mVarS;
                        break;
                    }
                    i12 += i14;
                }
                mVarN = mVarS.k(i12, eVar);
            } else {
                mVarN = mVarS.n(i10, obj, i11 + 5, eVar);
            }
            return q(mVarS, mVarN, iT, iJ, eVar.f3215b);
        }
        return this;
    }

    public final m o(int i10, Object obj, Object obj2, int i11, e eVar) {
        m mVar;
        m mVarO;
        int iJ = 1 << f0.J(i10, i11);
        if (h(iJ)) {
            int iF = f(iJ);
            if (jc.l.a(obj, this.f3236d[iF]) && jc.l.a(obj2, x(iF))) {
                return p(iF, iJ, eVar);
            }
        } else if (i(iJ)) {
            int iT = t(iJ);
            m mVarS = s(iT);
            if (i11 == 30) {
                oc.b bVarD = nh.b.D(nh.b.E(0, mVarS.f3236d.length), 2);
                int i12 = bVarD.f16307a;
                int i13 = bVarD.f16308b;
                int i14 = bVarD.f16309c;
                if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                    mVarO = mVarS;
                    mVar = mVarS;
                } else {
                    while (true) {
                        if (!jc.l.a(obj, mVarS.f3236d[i12]) || !jc.l.a(obj2, mVarS.x(i12))) {
                            if (i12 == i13) {
                                break;
                            }
                            i12 += i14;
                        } else {
                            mVarO = mVarS.k(i12, eVar);
                            break;
                        }
                    }
                    mVarO = mVarS;
                    mVar = mVarS;
                }
            } else {
                mVar = mVarS;
                mVarO = mVar.o(i10, obj, obj2, i11 + 5, eVar);
            }
            return q(mVar, mVarO, iT, iJ, eVar.f3215b);
        }
        return this;
    }

    public final m p(int i10, int i11, e eVar) {
        eVar.b(eVar.f3219f - 1);
        eVar.f3217d = x(i10);
        Object[] objArr = this.f3236d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f3235c != eVar.f3215b) {
            return new m(i11 ^ this.f3233a, this.f3234b, f0.j(i10, objArr), eVar.f3215b);
        }
        this.f3236d = f0.j(i10, objArr);
        this.f3233a ^= i11;
        return this;
    }

    public final m q(m mVar, m mVar2, int i10, int i11, e1.b bVar) {
        e1.b bVar2 = this.f3235c;
        if (mVar2 != null) {
            return (bVar2 == bVar || mVar != mVar2) ? r(i10, mVar2, bVar) : this;
        }
        Object[] objArr = this.f3236d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new m(this.f3233a, i11 ^ this.f3234b, f0.k(i10, objArr), bVar);
        }
        this.f3236d = f0.k(i10, objArr);
        this.f3234b ^= i11;
        return this;
    }

    public final m r(int i10, m mVar, e1.b bVar) {
        Object[] objArr = this.f3236d;
        if (objArr.length == 1 && mVar.f3236d.length == 2 && mVar.f3234b == 0) {
            mVar.f3233a = this.f3234b;
            return mVar;
        }
        if (this.f3235c == bVar) {
            objArr[i10] = mVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        jc.l.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = mVar;
        return new m(this.f3233a, this.f3234b, objArrCopyOf, bVar);
    }

    public final m s(int i10) {
        Object obj = this.f3236d[i10];
        jc.l.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (m) obj;
    }

    public final int t(int i10) {
        return (this.f3236d.length - 1) - Integer.bitCount((i10 - 1) & this.f3234b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        r14.f1959c = w(r12, r4, (c1.m) r14.f1959c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00eb, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b7.m u(java.lang.Object r12, int r13, java.lang.Object r14, int r15) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.m.u(java.lang.Object, int, java.lang.Object, int):b7.m");
    }

    public final m v(int i10, int i11, Object obj) {
        m mVarV;
        int iJ = 1 << f0.J(i10, i11);
        if (h(iJ)) {
            int iF = f(iJ);
            if (jc.l.a(obj, this.f3236d[iF])) {
                Object[] objArr = this.f3236d;
                if (objArr.length != 2) {
                    return new m(this.f3233a ^ iJ, this.f3234b, f0.j(iF, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(iJ)) {
            int iT = t(iJ);
            m mVarS = s(iT);
            if (i11 == 30) {
                oc.b bVarD = nh.b.D(nh.b.E(0, mVarS.f3236d.length), 2);
                int i12 = bVarD.f16307a;
                int i13 = bVarD.f16308b;
                int i14 = bVarD.f16309c;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (!jc.l.a(obj, mVarS.f3236d[i12])) {
                        if (i12 != i13) {
                            i12 += i14;
                        }
                    }
                    Object[] objArr2 = mVarS.f3236d;
                    mVarV = objArr2.length == 2 ? null : new m(0, 0, f0.j(i12, objArr2), null);
                }
                mVarV = mVarS;
                break;
            }
            mVarV = mVarS.v(i10, i11 + 5, obj);
            if (mVarV == null) {
                Object[] objArr3 = this.f3236d;
                if (objArr3.length != 1) {
                    return new m(this.f3233a, iJ ^ this.f3234b, f0.k(iT, objArr3), null);
                }
                return null;
            }
            if (mVarS != mVarV) {
                return w(iT, iJ, mVarV);
            }
        }
        return this;
    }

    public final m w(int i10, int i11, m mVar) {
        Object[] objArr = mVar.f3236d;
        if (objArr.length != 2 || mVar.f3234b != 0) {
            Object[] objArr2 = this.f3236d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            jc.l.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i10] = mVar;
            return new m(this.f3233a, this.f3234b, objArrCopyOf, null);
        }
        if (this.f3236d.length == 1) {
            mVar.f3233a = this.f3234b;
            return mVar;
        }
        int iF = f(i11);
        Object[] objArr3 = this.f3236d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        jc.l.d(objArrCopyOf2, "copyOf(...)");
        vb.l.i0(i10 + 2, i10 + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        vb.l.i0(iF + 2, iF, i10, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new m(this.f3233a ^ i11, i11 ^ this.f3234b, objArrCopyOf2, null);
    }

    public final Object x(int i10) {
        return this.f3236d[i10 + 1];
    }
}
