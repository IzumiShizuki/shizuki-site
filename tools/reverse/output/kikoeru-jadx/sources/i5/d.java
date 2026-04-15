package i5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f9013b;

    public /* synthetic */ d(e eVar, int i10) {
        this.f9012a = i10;
        this.f9013b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9012a) {
            case 0:
                f fVar = this.f9013b.f9016c;
                if (((e) fVar.f9024h) != null) {
                    fVar.a();
                }
                break;
            default:
                f fVar2 = this.f9013b.f9016c;
                if (((e) fVar2.f9024h) != null && (fVar2.f9018b & 3) != 0) {
                    fVar2.a();
                    break;
                }
                break;
        }
    }
}
