package b5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f1589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1590c;

    public /* synthetic */ o(q qVar, r rVar, int i10) {
        this.f1588a = i10;
        this.f1589b = qVar;
        this.f1590c = rVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [b5.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [b5.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [b5.r, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1588a) {
            case 0:
                q qVar = this.f1589b;
                this.f1590c.A(qVar.f1593a, qVar.f1594b);
                break;
            case 1:
                q qVar2 = this.f1589b;
                this.f1590c.v(qVar2.f1593a, qVar2.f1594b);
                break;
            default:
                q qVar3 = this.f1589b;
                this.f1590c.a(qVar3.f1593a, qVar3.f1594b);
                break;
        }
    }
}
