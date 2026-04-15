package f1;

import bg.a2;
import c0.z;
import com.tencent.bugly.beta.tinker.TinkerReport;
import j1.q;
import java.util.List;
import la.d0;
import m0.b1;
import m0.d9;
import m0.u6;
import m0.v2;
import m0.y5;
import ub.a0;
import x0.n2;
import x0.v;
import y.d1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6614e;

    public /* synthetic */ c(int i10, int i11, Object obj, Object obj2, Object obj3) {
        this.f6610a = i11;
        this.f6612c = obj;
        this.f6611b = obj2;
        this.f6614e = obj3;
        this.f6613d = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f6610a) {
            case 0:
                ((Integer) obj2).intValue();
                int iD = v.D(this.f6613d) | 1;
                ((f) this.f6612c).m(this.f6611b, this.f6614e, (x0.o) obj, iD);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iD2 = v.D(this.f6613d | 1);
                ((g1.e) this.f6614e).a(this.f6611b, (f) this.f6612c, (x0.o) obj, iD2);
                break;
            case 2:
                ((Integer) obj2).intValue();
                ka.b.f((n2) this.f6612c, (q) this.f6611b, (ic.a) this.f6614e, (x0.o) obj, v.D(this.f6613d | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ka.b.d((j7.b) this.f6612c, (ic.a) this.f6611b, (ic.a) this.f6614e, (x0.o) obj, v.D(9), this.f6613d);
                break;
            case 4:
                ((Integer) obj2).getClass();
                d0.b((a2) this.f6612c, (q) this.f6611b, (q) this.f6614e, (x0.o) obj, v.D(this.f6613d | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                android.support.v4.media.session.b.a((List) this.f6611b, (q) this.f6614e, (f) this.f6612c, (x0.o) obj, v.D(this.f6613d | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                gh.g.e((b1) this.f6612c, (d9) this.f6611b, (y5) this.f6614e, (x0.o) obj, v.D(this.f6613d | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                a.a.l((u6) this.f6612c, (q) this.f6611b, (ic.o) this.f6614e, (x0.o) obj, v.D(this.f6613d | 1));
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                ((Integer) obj2).getClass();
                q9.a.a((d1) this.f6612c, (z) this.f6611b, (String) this.f6614e, (x0.o) obj, v.D(this.f6613d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                s0.g.a((ic.a) this.f6611b, (v2) this.f6614e, (f) this.f6612c, (x0.o) obj, v.D(this.f6613d | 1));
                break;
        }
        return a0.f21526a;
    }

    public /* synthetic */ c(g1.e eVar, Object obj, f fVar, int i10) {
        this.f6610a = 1;
        this.f6614e = eVar;
        this.f6611b = obj;
        this.f6612c = fVar;
        this.f6613d = i10;
    }

    public /* synthetic */ c(j7.b bVar, ic.a aVar, ic.a aVar2, int i10, int i11) {
        this.f6610a = 3;
        this.f6612c = bVar;
        this.f6611b = aVar;
        this.f6614e = aVar2;
        this.f6613d = i11;
    }

    public /* synthetic */ c(Object obj, Object obj2, f fVar, int i10, int i11) {
        this.f6610a = i11;
        this.f6611b = obj;
        this.f6614e = obj2;
        this.f6612c = fVar;
        this.f6613d = i10;
    }
}
