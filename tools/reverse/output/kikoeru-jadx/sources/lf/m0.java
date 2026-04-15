package lf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements hf.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f12443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hf.k f12446d;

    public m0(o0 o0Var, long j10, Object obj, hf.k kVar) {
        this.f12443a = o0Var;
        this.f12444b = j10;
        this.f12445c = obj;
        this.f12446d = kVar;
    }

    @Override // hf.n0
    public final void a() {
        o0 o0Var = this.f12443a;
        synchronized (o0Var) {
            if (this.f12444b < o0Var.r()) {
                return;
            }
            Object[] objArr = o0Var.f12465h;
            jc.l.b(objArr);
            long j10 = this.f12444b;
            if (objArr[((int) j10) & (objArr.length - 1)] != this) {
                return;
            }
            p0.f(objArr, j10, p0.f12473a);
            o0Var.l();
        }
    }
}
