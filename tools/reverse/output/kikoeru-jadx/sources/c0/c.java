package c0;

import h0.q0;
import i2.p1;
import j2.w0;
import l0.l1;
import u.a2;
import u.c2;
import y.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, ic.n nVar, int i10, int i11) {
        super(2);
        this.f3049b = i11;
        this.f3050c = obj;
        this.f3051d = obj2;
        this.f3052e = nVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10;
        switch (this.f3049b) {
            case 0:
                f3.c cVar = (f3.c) obj;
                long j10 = ((f3.a) obj2).f6651a;
                e1 e1Var = (e1) this.f3050c;
                if (f3.a.h(j10) == Integer.MAX_VALUE) {
                    x.a.a("LazyVerticalStaggeredGrid's width should be bound by parent.");
                }
                f3.m mVar = f3.m.f6667a;
                int iH = f3.a.h(j10) - cVar.a0(androidx.compose.foundation.layout.a.d(e1Var, mVar) + androidx.compose.foundation.layout.a.e(e1Var, mVar));
                b0 b0Var = (b0) this.f3051d;
                y.f fVar = (y.f) this.f3052e;
                int iA0 = cVar.a0(fVar.a());
                int iMax = Math.max((iH + iA0) / (cVar.a0(b0Var.f3048a) + iA0), 1);
                int i11 = iH - ((iMax - 1) * iA0);
                int i12 = i11 / iMax;
                int i13 = i11 % iMax;
                int[] iArr = new int[iMax];
                int i14 = 0;
                while (i14 < iMax) {
                    if (i12 < 0) {
                        i10 = 0;
                    } else {
                        i10 = (i14 < i13 ? 1 : 0) + i12;
                    }
                    iArr[i14] = i10;
                    i14++;
                }
                int[] iArr2 = new int[iMax];
                fVar.b(cVar, iH, iArr, mVar, iArr2);
                break;
            case 1:
                ((Number) obj2).intValue();
                lc.b.a((j1.q) this.f3050c, (f1.f) this.f3051d, (f1.f) this.f3052e, (x0.o) obj, x0.v.D(433));
                break;
            case 2:
                ((Number) obj2).intValue();
                q0.f((j1.q) this.f3050c, (l1) this.f3051d, (f1.f) this.f3052e, (x0.o) obj, x0.v.D(385));
                break;
            case 3:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j2.l1.a((j2.v) this.f3050c, (w0) this.f3051d, (ic.n) this.f3052e, oVar, 0);
                } else {
                    oVar.Q();
                }
                break;
            case 4:
                ((Number) obj2).intValue();
                j2.l1.a((p1) this.f3050c, (w0) this.f3051d, (ic.n) this.f3052e, (x0.o) obj, x0.v.D(1));
                break;
            default:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                jc.v vVar = (jc.v) this.f3050c;
                float f10 = fFloatValue - vVar.f10835a;
                c2 c2Var = (c2) this.f3051d;
                a2 a2Var = (a2) this.f3052e;
                long jH = c2Var.h(c2Var.d(f10));
                c2 c2Var2 = a2Var.f20805a;
                vVar.f10835a += c2Var.d(c2Var.g(c2.a(c2Var2, c2Var2.f20853j, jH, 1)));
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i10) {
        super(2);
        this.f3049b = i10;
        this.f3050c = obj;
        this.f3051d = obj2;
        this.f3052e = obj3;
    }
}
