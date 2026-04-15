package v0;

import com.tencent.bugly.beta.tinker.TinkerReport;
import q.t0;
import u3.x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f22184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f22186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f22187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f22188f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(l0 l0Var, long j10, long j11, long j12, long j13) {
        super(1);
        this.f22184b = l0Var;
        this.f22185c = j10;
        this.f22186d = j11;
        this.f22187e = j12;
        this.f22188f = j13;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        s1.d dVar = (s1.d) obj;
        l0 l0Var = this.f22184b;
        float[] fArr = l0Var.f22260e;
        float fB = l0Var.b();
        boolean z10 = dVar.getLayoutDirection() == f3.m.f6668b;
        long jB = x0.b(0.0f, p1.b.f(dVar.c0()));
        long jB2 = x0.b(p1.e.d(dVar.e()), p1.b.f(dVar.c0()));
        long j10 = jB;
        long j11 = z10 ? jB2 : j10;
        if (!z10) {
            j10 = jB2;
        }
        float fQ = dVar.Q(k0.f22250d);
        float fQ2 = dVar.Q(k0.f22251e);
        dVar.w(this.f22185c, j11, j10, fQ2, (496 & 16) != 0 ? 0 : 1);
        long j12 = j11;
        long j13 = j10;
        dVar.w(this.f22186d, x0.b(((p1.b.e(j10) - p1.b.e(j11)) * 0.0f) + p1.b.e(j11), p1.b.f(dVar.c0())), x0.b(((p1.b.e(j10) - p1.b.e(j11)) * fB) + p1.b.e(j11), p1.b.f(dVar.c0())), fQ2, (496 & 16) != 0 ? 0 : 1);
        int length = fArr.length;
        int i10 = 0;
        while (i10 < length) {
            float f10 = fArr[i10];
            long j14 = j13;
            t0.j(dVar, (f10 > fB || f10 < 0.0f) ? this.f22187e : this.f22188f, fQ / 2.0f, x0.b(p1.b.e(x0.w(j12, j14, f10)), p1.b.f(dVar.c0())), null, TinkerReport.KEY_APPLIED_EXCEPTION);
            i10++;
            j13 = j14;
        }
        return ub.a0.f21526a;
    }
}
