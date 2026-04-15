package h1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g0 f8013b;

    public g0(long j10) {
        this.f8012a = j10;
    }

    public abstract void a(g0 g0Var);

    public abstract g0 b();

    public g0 c(long j10) {
        g0 g0VarB = b();
        g0VarB.f8012a = j10;
        return g0VarB;
    }
}
