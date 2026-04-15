package z9;

import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f26610b;

    public /* synthetic */ b(r rVar, int i10) {
        this.f26609a = i10;
        this.f26610b = rVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f26609a) {
            case 0:
                this.f26610b.H(false);
                break;
            case 1:
                r rVar = this.f26610b;
                rVar.f26663k.setValue(Boolean.TRUE);
                rVar.H(false);
                break;
            case 2:
                this.f26610b.f26663k.setValue(Boolean.FALSE);
                break;
            case 3:
                this.f26610b.G(false);
                break;
            case 4:
                this.f26610b.G(false);
                break;
            case 5:
                this.f26610b.f26663k.setValue(Boolean.FALSE);
                break;
            default:
                this.f26610b.f26654b.setValue(Boolean.TRUE);
                break;
        }
        return a0.f21526a;
    }
}
