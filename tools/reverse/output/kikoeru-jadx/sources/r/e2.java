package r;

import i7.p2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.x f18386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o.y f18387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f18389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f18390e = z1.f18640a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f18391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p f18392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p f18393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p f18394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p f18395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f18396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float[] f18397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p2 f18398m;

    public e2(o.x xVar, o.y yVar, int i10, v vVar) {
        this.f18386a = xVar;
        this.f18387b = yVar;
        this.f18388c = i10;
        this.f18389d = vVar;
        float[] fArr = z1.f18641b;
        this.f18391f = fArr;
        this.f18396k = fArr;
        this.f18397l = fArr;
        this.f18398m = z1.f18642c;
    }

    @Override // r.a2
    public final int D() {
        return 0;
    }

    @Override // r.x1
    public final p H(long j10, p pVar, p pVar2, p pVar3) {
        int[] iArr = z1.f18640a;
        int i10 = 0;
        long j11 = (j10 / 1000000) - ((long) 0);
        long j12 = this.f18388c;
        if (j11 < 0) {
            j11 = 0;
        }
        long j13 = j11 > j12 ? j12 : j11;
        if (j13 < 0) {
            return pVar3;
        }
        d(pVar, pVar2, pVar3);
        p pVar4 = this.f18393h;
        jc.l.b(pVar4);
        if (this.f18398m != z1.f18642c) {
            int i11 = (int) j13;
            float fC = c(b(i11), i11, false);
            float[] fArr = this.f18397l;
            q[][] qVarArr = (q[][]) this.f18398m.f9258a;
            float f10 = qVarArr[0][0].f18519a;
            float f11 = qVarArr[qVarArr.length - 1][0].f18520b;
            if (fC < f10) {
                fC = f10;
            }
            if (fC <= f11) {
                f11 = fC;
            }
            int length = fArr.length;
            boolean z10 = false;
            for (q[] qVarArr2 : qVarArr) {
                int i12 = 0;
                int i13 = 0;
                while (i12 < length - 1) {
                    q qVar = qVarArr2[i13];
                    if (f11 <= qVar.f18520b) {
                        if (qVar.f18534p) {
                            fArr[i12] = qVar.f18535q;
                            fArr[i12 + 1] = qVar.f18536r;
                        } else {
                            qVar.c(f11);
                            fArr[i12] = qVar.a();
                            fArr[i12 + 1] = qVar.b();
                        }
                        z10 = true;
                    }
                    i12 += 2;
                    i13++;
                }
                if (z10) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i10 < length2) {
                pVar4.e(fArr[i10], i10);
                i10++;
            }
        } else {
            p pVarG = g((j13 - 1) * 1000000, pVar, pVar2, pVar3);
            p pVarG2 = g(j13 * 1000000, pVar, pVar2, pVar3);
            int iB = pVarG.b();
            while (i10 < iB) {
                pVar4.e((pVarG.a(i10) - pVarG2.a(i10)) * 1000.0f, i10);
                i10++;
            }
        }
        return pVar4;
    }

    @Override // r.a2
    public final int I() {
        return this.f18388c;
    }

    @Override // r.x1
    public final /* synthetic */ boolean a() {
        return false;
    }

    public final int b(int i10) {
        int i11;
        o.x xVar = this.f18386a;
        int i12 = xVar.f16071b;
        xVar.getClass();
        if (i12 <= 0 || i12 > xVar.f16071b) {
            p.a.d("");
            throw null;
        }
        int i13 = i12 - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int i15 = xVar.f16070a[i11];
                if (i15 >= i10) {
                    if (i15 <= i10) {
                        break;
                    }
                    i13 = i11 - 1;
                } else {
                    i14 = i11 + 1;
                }
            } else {
                i11 = -(i14 + 1);
                break;
            }
        }
        return i11 < -1 ? -(i11 + 2) : i11;
    }

    public final float c(int i10, int i11, boolean z10) {
        v vVar;
        float f10;
        o.x xVar = this.f18386a;
        if (i10 >= xVar.f16071b - 1) {
            f10 = i11;
        } else {
            int iC = xVar.c(i10);
            int iC2 = xVar.c(i10 + 1);
            if (i11 == iC) {
                f10 = iC;
            } else {
                int i12 = iC2 - iC;
                d2 d2Var = (d2) this.f18387b.b(iC);
                if (d2Var == null || (vVar = d2Var.f18372b) == null) {
                    vVar = this.f18389d;
                }
                float f11 = i12;
                float fB = vVar.b((i11 - iC) / f11);
                if (z10) {
                    return fB;
                }
                f10 = (f11 * fB) + iC;
            }
        }
        return f10 / 1000;
    }

    public final void d(p pVar, p pVar2, p pVar3) {
        float[] fArr;
        boolean z10 = this.f18398m != z1.f18642c;
        p pVar4 = this.f18392g;
        o.y yVar = this.f18387b;
        o.x xVar = this.f18386a;
        if (pVar4 == null) {
            this.f18392g = pVar.c();
            this.f18393h = pVar3.c();
            int i10 = xVar.f16071b;
            float[] fArr2 = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr2[i11] = xVar.c(i11) / 1000;
            }
            this.f18391f = fArr2;
            int i12 = xVar.f16071b;
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                iArr[i13] = 0;
            }
            this.f18390e = iArr;
        }
        if (z10) {
            if (this.f18398m != z1.f18642c && jc.l.a(this.f18394i, pVar) && jc.l.a(this.f18395j, pVar2)) {
                return;
            }
            this.f18394i = pVar;
            this.f18395j = pVar2;
            int iB = pVar.b() + (pVar.b() % 2);
            this.f18396k = new float[iB];
            this.f18397l = new float[iB];
            int i14 = xVar.f16071b;
            float[][] fArr3 = new float[i14][];
            for (int i15 = 0; i15 < i14; i15++) {
                int iC = xVar.c(i15);
                d2 d2Var = (d2) yVar.b(iC);
                if (iC == 0 && d2Var == null) {
                    fArr = new float[iB];
                    for (int i16 = 0; i16 < iB; i16++) {
                        fArr[i16] = pVar.a(i16);
                    }
                } else if (iC == this.f18388c && d2Var == null) {
                    fArr = new float[iB];
                    for (int i17 = 0; i17 < iB; i17++) {
                        fArr[i17] = pVar2.a(i17);
                    }
                } else {
                    jc.l.b(d2Var);
                    p pVar5 = d2Var.f18371a;
                    float[] fArr4 = new float[iB];
                    for (int i18 = 0; i18 < iB; i18++) {
                        fArr4[i18] = pVar5.a(i18);
                    }
                    fArr = fArr4;
                }
                fArr3[i15] = fArr;
            }
            this.f18398m = new p2(this.f18390e, this.f18391f, fArr3);
        }
    }

    @Override // r.x1
    public final p g(long j10, p pVar, p pVar2, p pVar3) {
        p pVar4;
        p pVar5;
        float f10;
        p pVar6 = pVar;
        p pVar7 = pVar2;
        int[] iArr = z1.f18640a;
        long j11 = (j10 / 1000000) - ((long) 0);
        int i10 = this.f18388c;
        long j12 = i10;
        if (j11 < 0) {
            j11 = 0;
        }
        if (j11 <= j12) {
            j12 = j11;
        }
        int i11 = (int) j12;
        o.y yVar = this.f18387b;
        d2 d2Var = (d2) yVar.b(i11);
        if (d2Var != null) {
            return d2Var.f18371a;
        }
        if (i11 >= i10) {
            return pVar7;
        }
        if (i11 <= 0) {
            return pVar6;
        }
        d(pVar6, pVar7, pVar3);
        p pVar8 = this.f18392g;
        jc.l.b(pVar8);
        if (this.f18398m != z1.f18642c) {
            float fC = c(b(i11), i11, false);
            float[] fArr = this.f18396k;
            q[][] qVarArr = (q[][]) this.f18398m.f9258a;
            int length = qVarArr.length - 1;
            float f11 = qVarArr[0][0].f18519a;
            float f12 = qVarArr[length][0].f18520b;
            int length2 = fArr.length;
            if (fC < f11 || fC > f12) {
                if (fC > f12) {
                    f11 = f12;
                } else {
                    length = 0;
                }
                float f13 = fC - f11;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length2 - 1) {
                    q qVar = qVarArr[length][i13];
                    boolean z10 = qVar.f18534p;
                    float f14 = qVar.f18536r;
                    float f15 = qVar.f18535q;
                    if (z10) {
                        float f16 = qVar.f18519a;
                        float f17 = qVar.f18529k;
                        f10 = f13;
                        float f18 = qVar.f18521c;
                        fArr[i12] = (f15 * f10) + ((qVar.f18523e - f18) * (f11 - f16) * f17) + f18;
                        float f19 = qVar.f18522d;
                        fArr[i12 + 1] = (f10 * f14) + ((qVar.f18524f - f19) * (f11 - f16) * f17) + f19;
                    } else {
                        f10 = f13;
                        qVar.c(f11);
                        fArr[i12] = (qVar.a() * f10) + (qVar.f18532n * qVar.f18526h) + f15;
                        fArr[i12 + 1] = (qVar.b() * f10) + (qVar.f18533o * qVar.f18527i) + f14;
                    }
                    i12 += 2;
                    i13++;
                    f13 = f10;
                }
            } else {
                boolean z11 = false;
                for (q[] qVarArr2 : qVarArr) {
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < length2 - 1) {
                        q qVar2 = qVarArr2[i15];
                        if (fC <= qVar2.f18520b) {
                            if (qVar2.f18534p) {
                                float f20 = qVar2.f18519a;
                                float f21 = qVar2.f18529k;
                                float f22 = qVar2.f18521c;
                                fArr[i14] = ((qVar2.f18523e - f22) * (fC - f20) * f21) + f22;
                                float f23 = qVar2.f18522d;
                                fArr[i14 + 1] = ((qVar2.f18524f - f23) * (fC - f20) * f21) + f23;
                            } else {
                                qVar2.c(fC);
                                fArr[i14] = (qVar2.f18532n * qVar2.f18526h) + qVar2.f18535q;
                                fArr[i14 + 1] = (qVar2.f18533o * qVar2.f18527i) + qVar2.f18536r;
                            }
                            z11 = true;
                        }
                        i14 += 2;
                        i15++;
                    }
                    if (z11) {
                        break;
                    }
                }
            }
            int length3 = fArr.length;
            for (int i16 = 0; i16 < length3; i16++) {
                pVar8.e(fArr[i16], i16);
            }
        } else {
            int iB = b(i11);
            float fC2 = c(iB, i11, true);
            o.x xVar = this.f18386a;
            d2 d2Var2 = (d2) yVar.b(xVar.c(iB));
            if (d2Var2 != null && (pVar5 = d2Var2.f18371a) != null) {
                pVar6 = pVar5;
            }
            d2 d2Var3 = (d2) yVar.b(xVar.c(iB + 1));
            if (d2Var3 != null && (pVar4 = d2Var3.f18371a) != null) {
                pVar7 = pVar4;
            }
            int iB2 = pVar8.b();
            for (int i17 = 0; i17 < iB2; i17++) {
                pVar8.e((pVar7.a(i17) * fC2) + ((1 - fC2) * pVar6.a(i17)), i17);
            }
        }
        return pVar8;
    }

    @Override // r.x1
    public final long n(p pVar, p pVar2, p pVar3) {
        return ((long) I()) * 1000000;
    }

    @Override // r.x1
    public final p t(p pVar, p pVar2, p pVar3) {
        return H(n(pVar, pVar2, pVar3), pVar, pVar2, pVar3);
    }
}
