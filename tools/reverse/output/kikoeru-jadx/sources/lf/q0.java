package lf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends mf.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f12479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hf.k f12480b;

    @Override // mf.d
    public final boolean a(mf.b bVar) {
        o0 o0Var = (o0) bVar;
        if (this.f12479a >= 0) {
            return false;
        }
        long j10 = o0Var.f12466i;
        if (j10 < o0Var.f12467j) {
            o0Var.f12467j = j10;
        }
        this.f12479a = j10;
        return true;
    }

    @Override // mf.d
    public final yb.c[] b(mf.b bVar) {
        long j10 = this.f12479a;
        this.f12479a = -1L;
        this.f12480b = null;
        return ((o0) bVar).x(j10);
    }
}
