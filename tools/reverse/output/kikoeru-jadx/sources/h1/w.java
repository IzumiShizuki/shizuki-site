package h1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8076b;

    public /* synthetic */ w(int i10, Object obj) {
        this.f8075a = i10;
        this.f8076b = obj;
    }

    public final void a() {
        switch (this.f8075a) {
            case 0:
                x xVar = (x) this.f8076b;
                xVar.f8086j--;
                break;
            default:
                x0.o oVar = (x0.o) this.f8076b;
                oVar.A--;
                break;
        }
    }

    public final void b() {
        switch (this.f8075a) {
            case 0:
                ((x) this.f8076b).f8086j++;
                break;
            default:
                ((x0.o) this.f8076b).A++;
                break;
        }
    }
}
