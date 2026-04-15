package t0;

import android.text.Layout;
import c7.e1;
import jc.v;
import jc.w;
import q.t0;
import q.v0;
import q1.e0;
import r.y1;
import t2.c0;
import t2.k0;
import t2.p;
import ub.a0;
import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20094a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f20095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20098e;

    public /* synthetic */ c(long j10, float[] fArr, w wVar, v vVar) {
        this.f20095b = j10;
        this.f20096c = fArr;
        this.f20097d = wVar;
        this.f20098e = vVar;
    }

    @Override // ic.k
    public final Object a(Object obj) throws Throwable {
        long j10;
        float f10;
        p1.c cVar;
        float[] fArr;
        long j11;
        t2.a aVar;
        int i10;
        float fA;
        float fA2;
        switch (this.f20094a) {
            case 0:
                j jVar = (j) this.f20096c;
                n2 n2Var = (n2) this.f20097d;
                long j12 = this.f20095b;
                e0 e0Var = (e0) this.f20098e;
                s1.d dVar = (s1.d) obj;
                float fA3 = jVar.a() / jVar.f20129g.e();
                float fMax = (Math.max(Math.min(1.0f, fA3) - 0.4f, 0.0f) * 5) / 3;
                float fAbs = Math.abs(fA3) - 1.0f;
                float f11 = fAbs >= 0.0f ? fAbs : 0.0f;
                if (f11 > 2.0f) {
                    f11 = 2.0f;
                }
                float fPow = (((0.4f * fMax) - 0.25f) + (f11 - (((float) Math.pow(f11, 2)) / 4))) * 0.5f;
                float f12 = 360;
                float f13 = fPow * f12;
                float f14 = ((0.8f * fMax) + fPow) * f12;
                v0 v0Var = new v0(fPow, f13, f14, Math.min(1.0f, fMax));
                float fFloatValue = ((Number) n2Var.getValue()).floatValue();
                long jC0 = dVar.c0();
                e1 e1VarS = dVar.S();
                long jD = e1VarS.D();
                e1VarS.z().f();
                try {
                    ((y1) e1VarS.f3618b).f0(fPow, jC0);
                    float fQ = dVar.Q(f.f20109c);
                    f10 = f.f20110d;
                    float fQ2 = (dVar.Q(f10) / 2.0f) + fQ;
                    try {
                        cVar = new p1.c(Float.intBitsToFloat((int) (nh.a.l(dVar.e()) >> 32)) - fQ2, Float.intBitsToFloat((int) (nh.a.l(dVar.e()) & 4294967295L)) - fQ2, Float.intBitsToFloat((int) (nh.a.l(dVar.e()) >> 32)) + fQ2, Float.intBitsToFloat((int) (nh.a.l(dVar.e()) & 4294967295L)) + fQ2);
                    } catch (Throwable th2) {
                        th = th2;
                        j10 = jD;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    j10 = jD;
                }
                try {
                    dVar.m0(j12, f13, f14 - f13, cVar.d(), cVar.c(), (768 & 64) != 0 ? 1.0f : fFloatValue, new s1.h(dVar.Q(f10), 0.0f, 2, 0, 26));
                    f.c(dVar, e0Var, cVar, j12, fFloatValue, v0Var);
                    t0.L(e1VarS, jD);
                } catch (Throwable th4) {
                    th = th4;
                    j10 = jD;
                    t0.L(e1VarS, j10);
                    throw th;
                }
                break;
            default:
                float[] fArr2 = (float[]) this.f20096c;
                w wVar = (w) this.f20097d;
                v vVar = (v) this.f20098e;
                p pVar = (p) obj;
                int i11 = pVar.f20378b;
                t2.a aVar2 = pVar.f20377a;
                int iD = pVar.f20379c;
                long j13 = this.f20095b;
                int iE = i11 > k0.e(j13) ? pVar.f20378b : k0.e(j13);
                if (iD >= k0.d(j13)) {
                    iD = k0.d(j13);
                }
                long jB = c0.b(pVar.d(iE), pVar.d(iD));
                int i12 = wVar.f10836a;
                u2.k kVar = aVar2.f20257d;
                int iE2 = k0.e(jB);
                int iD2 = k0.d(jB);
                Layout layout = kVar.f21253f;
                int length = layout.getText().length();
                if (iE2 < 0) {
                    z2.a.a("startOffset must be > 0");
                }
                if (iE2 >= length) {
                    z2.a.a("startOffset must be less than text length");
                }
                if (iD2 <= iE2) {
                    z2.a.a("endOffset must be greater than startOffset");
                }
                if (iD2 > length) {
                    z2.a.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i12 < (iD2 - iE2) * 4) {
                    z2.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iE2);
                int lineForOffset2 = layout.getLineForOffset(iD2 - 1);
                p2.f fVar = new p2.f(kVar);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        fArr = fArr2;
                        int iF = kVar.f(lineForOffset);
                        int iMax = Math.max(iE2, lineStart);
                        int iMin = Math.min(iD2, iF);
                        float fG = kVar.g(lineForOffset);
                        float fE = kVar.e(lineForOffset);
                        j11 = jB;
                        aVar = aVar2;
                        boolean z10 = false;
                        boolean z11 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z11 || zIsRtlCharAt) {
                                if (z11 && zIsRtlCharAt) {
                                    z10 = false;
                                    float fA4 = fVar.a(iMax, false, false, false);
                                    i10 = iMin;
                                    fA = fVar.a(iMax + 1, true, true, false);
                                    fA2 = fA4;
                                } else {
                                    i10 = iMin;
                                    z10 = false;
                                    if (z11 || !zIsRtlCharAt) {
                                        fA = fVar.a(iMax, false, false, false);
                                        fA2 = fVar.a(iMax + 1, true, true, false);
                                    } else {
                                        fA2 = fVar.a(iMax, false, false, true);
                                        fA = fVar.a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr[i12] = fA;
                                fArr[i12 + 1] = fG;
                                fArr[i12 + 2] = fA2;
                                fArr[i12 + 3] = fE;
                                i12 += 4;
                                iMax++;
                                iMin = i10;
                            } else {
                                fA = fVar.a(iMax, z10, z10, true);
                                i10 = iMin;
                                fA2 = fVar.a(iMax + 1, true, true, true);
                            }
                            z10 = false;
                            fArr[i12] = fA;
                            fArr[i12 + 1] = fG;
                            fArr[i12 + 2] = fA2;
                            fArr[i12 + 3] = fE;
                            i12 += 4;
                            iMax++;
                            iMin = i10;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            aVar2 = aVar;
                            fArr2 = fArr;
                            jB = j11;
                        }
                    }
                } else {
                    fArr = fArr2;
                    j11 = jB;
                    aVar = aVar2;
                }
                int iC = (k0.c(j11) * 4) + wVar.f10836a;
                for (int i13 = wVar.f10836a; i13 < iC; i13 += 4) {
                    int i14 = i13 + 1;
                    float f15 = fArr[i14];
                    float f16 = vVar.f10835a;
                    fArr[i14] = f15 + f16;
                    int i15 = i13 + 3;
                    fArr[i15] = fArr[i15] + f16;
                }
                wVar.f10836a = iC;
                vVar.f10835a = aVar.b() + vVar.f10835a;
                break;
        }
        return a0.f21526a;
    }

    public /* synthetic */ c(j jVar, n2 n2Var, long j10, e0 e0Var) {
        this.f20096c = jVar;
        this.f20097d = n2Var;
        this.f20095b = j10;
        this.f20098e = e0Var;
    }
}
