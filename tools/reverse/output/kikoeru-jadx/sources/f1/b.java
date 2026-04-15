package f1;

import m0.r3;
import m0.z8;
import q9.w;
import t2.l0;
import ub.a0;
import x0.n1;
import x0.v;
import x0.w0;
import y.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6609d;

    public /* synthetic */ b(fg.f fVar, int i10, p9.f fVar2) {
        this.f6606a = 3;
        this.f6608c = fVar;
        this.f6607b = i10;
        this.f6609d = fVar2;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f6606a) {
            case 0:
                ((Integer) obj2).intValue();
                ((f) this.f6608c).f(v.D(this.f6607b) | 1, this.f6609d, (x0.o) obj);
                break;
            case 1:
                ((Integer) obj2).intValue();
                z8.a((l0) this.f6608c, (ic.n) this.f6609d, (x0.o) obj, v.D(this.f6607b | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                n9.b.b((k1) this.f6608c, (r9.c) this.f6609d, (x0.o) obj, v.D(this.f6607b | 1));
                break;
            case 3:
                fg.f fVar = (fg.f) this.f6608c;
                p9.f fVar2 = (p9.f) this.f6609d;
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r3.b(((Number) fVar.getValue()).intValue() == this.f6607b ? fVar2.f16953a : fVar2.f16954b, fVar2.f16955c, null, 0L, oVar, 0, 12);
                } else {
                    oVar.Q();
                }
                return a0.f21526a;
            case 4:
                ((Integer) obj2).getClass();
                w.e((w0) this.f6608c, (ic.k) this.f6609d, (x0.o) obj, v.D(this.f6607b | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                v.a((n1) this.f6608c, (ic.n) this.f6609d, (x0.o) obj, v.D(this.f6607b | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                v.b((n1[]) this.f6608c, (ic.n) this.f6609d, (x0.o) obj, v.D(this.f6607b | 1));
                break;
        }
        return a0.f21526a;
    }

    public /* synthetic */ b(Object obj, Object obj2, int i10, int i11) {
        this.f6606a = i11;
        this.f6608c = obj;
        this.f6609d = obj2;
        this.f6607b = i10;
    }
}
