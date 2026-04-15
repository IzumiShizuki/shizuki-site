package d9;

import b0.h0;
import c7.e1;
import da.e0;
import da.m0;
import i2.l0;
import m0.a5;
import m0.z4;
import q.t0;
import r.y1;
import ub.a0;
import x0.f0;
import x0.n2;
import y.d1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f5606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5607c;

    public /* synthetic */ u(long j10, m0 m0Var) {
        this.f5605a = 1;
        this.f5607c = m0Var;
        this.f5606b = j10;
    }

    @Override // ic.k
    public final Object a(Object obj) throws Exception {
        c9.g gVar;
        switch (this.f5605a) {
            case 0:
                long j10 = this.f5606b;
                String str = (String) this.f5607c;
                z7.a aVar = (z7.a) obj;
                jc.l.e(aVar, "_connection");
                z7.c cVarD0 = aVar.d0("SELECT * FROM ManualLRCBean WHERE rj=(?) AND name=(?)");
                try {
                    cVarD0.c(1, j10);
                    cVarD0.v(2, str);
                    int iJ = vb.w.j(cVarD0, "id");
                    int iJ2 = vb.w.j(cVarD0, "rj");
                    int iJ3 = vb.w.j(cVarD0, "sourceId");
                    int iJ4 = vb.w.j(cVarD0, "name");
                    int iJ5 = vb.w.j(cVarD0, "docName");
                    int iJ6 = vb.w.j(cVarD0, "documentUri");
                    int iJ7 = vb.w.j(cVarD0, "zipInnerPath");
                    if (cVarD0.Z()) {
                        gVar = new c9.g((int) cVarD0.getLong(iJ), cVarD0.getLong(iJ2), cVarD0.M(iJ3), cVarD0.M(iJ4), cVarD0.M(iJ5), cVarD0.M(iJ6), cVarD0.M(iJ7));
                        break;
                    } else {
                        gVar = null;
                    }
                    return gVar;
                } finally {
                    cVarD0.close();
                }
            case 1:
                m0 m0Var = (m0) this.f5607c;
                jc.l.e((f0) obj, "$this$DisposableEffect");
                e0 e0Var = new e0(this.f5606b, m0Var);
                h9.a.a().b(e0Var);
                return new h0(3, e0Var);
            case 2:
                t0.q((s1.d) obj, this.f5606b, 0L, ((Number) ((ic.a) this.f5607c).b()).floatValue(), 118);
                return a0.f21526a;
            case 3:
                t0.q((s1.d) obj, this.f5606b, 0L, nh.b.j(((Number) ((n2) this.f5607c).getValue()).floatValue(), 0.0f, 1.0f), 118);
                return a0.f21526a;
            default:
                d1 d1Var = (d1) this.f5607c;
                l0 l0Var = (l0) obj;
                long j11 = this.f5606b;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
                if (fIntBitsToFloat > 0.0f) {
                    float fQ = l0Var.Q(a5.f12653a);
                    s1.b bVar = l0Var.f8782a;
                    float fQ2 = l0Var.Q(d1Var.b(l0Var.getLayoutDirection())) - fQ;
                    float f10 = 2;
                    float fIntBitsToFloat2 = (fQ * f10) + fIntBitsToFloat + fQ2;
                    f3.m layoutDirection = l0Var.getLayoutDirection();
                    int[] iArr = z4.f13996a;
                    float fIntBitsToFloat3 = iArr[layoutDirection.ordinal()] == 1 ? Float.intBitsToFloat((int) (bVar.f19346b.D() >> 32)) - fIntBitsToFloat2 : fQ2 < 0.0f ? 0.0f : fQ2;
                    if (iArr[l0Var.getLayoutDirection().ordinal()] == 1) {
                        fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar.f19346b.D() >> 32)) - (fQ2 >= 0.0f ? fQ2 : 0.0f);
                    }
                    float f11 = fIntBitsToFloat2;
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j11 & 4294967295L));
                    float f12 = (-fIntBitsToFloat4) / f10;
                    float f13 = fIntBitsToFloat4 / f10;
                    e1 e1Var = bVar.f19346b;
                    long jD = e1Var.D();
                    e1Var.z().f();
                    try {
                        ((e1) ((y1) e1Var.f3618b).f18634b).z().o(fIntBitsToFloat3, f12, f11, f13, 0);
                        l0Var.b();
                    } finally {
                        t0.L(e1Var, jD);
                    }
                } else {
                    l0Var.b();
                }
                return a0.f21526a;
        }
    }

    public /* synthetic */ u(long j10, Object obj, int i10) {
        this.f5605a = i10;
        this.f5606b = j10;
        this.f5607c = obj;
    }
}
