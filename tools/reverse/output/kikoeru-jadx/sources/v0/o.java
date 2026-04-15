package v0;

import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1.h f22288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n2 f22289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n2 f22290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n2 f22291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n2 f22292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f22293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f22294i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(float f10, long j10, long j11, r.c0 c0Var, r.c0 c0Var2, r.c0 c0Var3, r.c0 c0Var4, s1.h hVar) {
        super(1);
        this.f22287b = j10;
        this.f22288c = hVar;
        this.f22289d = c0Var;
        this.f22290e = c0Var2;
        this.f22291f = c0Var3;
        this.f22292g = c0Var4;
        this.f22293h = f10;
        this.f22294i = j11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        float f10;
        s1.d dVar = (s1.d) obj;
        long j10 = this.f22287b;
        s1.h hVar = this.f22288c;
        w.d(dVar, 0.0f, 360.0f, j10, hVar);
        float fFloatValue = (((Number) this.f22289d.getValue()).floatValue() * 216.0f) % 360.0f;
        float fFloatValue2 = ((Number) this.f22290e.getValue()).floatValue();
        n2 n2Var = this.f22291f;
        float fAbs = Math.abs(fFloatValue2 - ((Number) n2Var.getValue()).floatValue());
        float fFloatValue3 = ((Number) n2Var.getValue()).floatValue() + ((Number) this.f22292g.getValue()).floatValue() + (fFloatValue - 90.0f);
        if (hVar.f19354c == 0) {
            f10 = 0.0f;
        } else {
            f10 = ((this.f22293h / (w.f22335e / 2)) * 57.29578f) / 2.0f;
        }
        w.d(dVar, fFloatValue3 + f10, Math.max(fAbs, 0.1f), this.f22294i, hVar);
        return ub.a0.f21526a;
    }
}
