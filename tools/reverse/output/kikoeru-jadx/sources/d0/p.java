package d0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f5388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf.y f5389d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i10, d dVar, hf.y yVar) {
        super(0);
        this.f5387b = i10;
        this.f5388c = dVar;
        this.f5389d = yVar;
    }

    @Override // ic.a
    public final Object b() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f5387b) {
            case 0:
                d dVar = this.f5388c;
                if (dVar.c()) {
                    hf.a0.y(this.f5389d, null, null, new r(dVar, null, 0), 3);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                d dVar2 = this.f5388c;
                if (dVar2.d()) {
                    hf.a0.y(this.f5389d, null, null, new r(dVar2, null, 1), 3);
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 2:
                d dVar3 = this.f5388c;
                if (dVar3.c()) {
                    hf.a0.y(this.f5389d, null, null, new r(dVar3, null, 0), 3);
                    z12 = true;
                } else {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
            default:
                d dVar4 = this.f5388c;
                if (dVar4.d()) {
                    hf.a0.y(this.f5389d, null, null, new r(dVar4, null, 1), 3);
                    z13 = true;
                } else {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
        }
    }
}
