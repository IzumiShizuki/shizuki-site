package r;

import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f18467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0.e1 f18468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f18469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18472f;

    public /* synthetic */ k(v1 v1Var, Object obj, p pVar, int i10) {
        this(v1Var, obj, (i10 & 4) != 0 ? null : pVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final Object a() {
        return this.f18467a.f18597b.a(this.f18469c);
    }

    @Override // x0.n2
    public final Object getValue() {
        return this.f18468b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f18468b.getValue() + ", velocity=" + a() + ", isRunning=" + this.f18472f + ", lastFrameTimeNanos=" + this.f18470d + ", finishedTimeNanos=" + this.f18471e + ')';
    }

    public k(v1 v1Var, Object obj, p pVar, long j10, long j11, boolean z10) {
        p pVarK;
        this.f18467a = v1Var;
        this.f18468b = x0.v.v(obj);
        if (pVar != null) {
            pVarK = d.k(pVar);
        } else {
            pVarK = (p) v1Var.f18596a.a(obj);
            pVarK.d();
        }
        this.f18469c = pVarK;
        this.f18470d = j10;
        this.f18471e = j11;
        this.f18472f = z10;
    }
}
