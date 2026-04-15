package s;

import com.tencent.bugly.beta.tinker.TinkerReport;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q1.m f19220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f19221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f19222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f19223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f19224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f19225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s1.h f19226i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z10, q1.n0 n0Var, long j10, float f10, float f11, long j11, long j12, s1.h hVar) {
        super(1);
        this.f19219b = z10;
        this.f19220c = n0Var;
        this.f19221d = j10;
        this.f19222e = f10;
        this.f19223f = f11;
        this.f19224g = j11;
        this.f19225h = j12;
        this.f19226i = hVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        i2.l0 l0Var = (i2.l0) obj;
        l0Var.b();
        s1.b bVar = l0Var.f8782a;
        if (this.f19219b) {
            q.t0.r(l0Var, this.f19220c, 0L, 0L, this.f19221d, null, 246);
        } else {
            long j10 = this.f19221d;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
            float f10 = this.f19222e;
            if (fIntBitsToFloat < f10) {
                float f11 = this.f19223f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar.f19346b.D() >> 32));
                float f12 = this.f19223f;
                float f13 = fIntBitsToFloat2 - f12;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (bVar.f19346b.D() & 4294967295L)) - f12;
                q1.m mVar = this.f19220c;
                long j11 = this.f19221d;
                c7.e1 e1Var = bVar.f19346b;
                long jD = e1Var.D();
                e1Var.z().f();
                try {
                    ((c7.e1) ((y1) e1Var.f3618b).f18634b).z().o(f11, f11, f13, fIntBitsToFloat3, 0);
                    q.t0.r(l0Var, mVar, 0L, 0L, j11, null, 246);
                } finally {
                    q.t0.L(e1Var, jD);
                }
            } else {
                q.t0.r(l0Var, this.f19220c, this.f19224g, this.f19225h, nh.a.C(f10, j10), this.f19226i, TinkerReport.KEY_APPLIED_FAIL_COST_60S_LESS);
            }
        }
        return ub.a0.f21526a;
    }
}
