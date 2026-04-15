package d9;

import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f5596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.f f5597c;

    public /* synthetic */ r(s sVar, c9.f fVar, int i10) {
        this.f5595a = i10;
        this.f5596b = sVar;
        this.f5597c = fVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        z7.a aVar = (z7.a) obj;
        switch (this.f5595a) {
            case 0:
                jc.l.e(aVar, "_connection");
                this.f5596b.f5600c.u(aVar, this.f5597c);
                break;
            case 1:
                jc.l.e(aVar, "_connection");
                this.f5596b.f5601d.u(aVar, this.f5597c);
                break;
            default:
                jc.l.e(aVar, "_connection");
                this.f5596b.f5599b.w(aVar, this.f5597c);
                break;
        }
        return a0.f21526a;
    }
}
