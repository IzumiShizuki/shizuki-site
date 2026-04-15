package d9;

import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f5575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.c f5576c;

    public /* synthetic */ k(m mVar, c9.c cVar, int i10) {
        this.f5574a = i10;
        this.f5575b = mVar;
        this.f5576c = cVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        z7.a aVar = (z7.a) obj;
        switch (this.f5574a) {
            case 0:
                jc.l.e(aVar, "<unused var>");
                c9.c cVar = this.f5576c;
                long j10 = cVar.f3777c;
                m mVar = this.f5575b;
                n7.v vVar = mVar.f5579a;
                c9.c cVar2 = (c9.c) ua.l.W(vVar, true, false, new l(j10, 1));
                if (cVar2 != null) {
                    mVar.b(c9.c.a(cVar, cVar2.f3775a, null, 8190));
                } else {
                    ua.l.W(vVar, false, true, new k(mVar, cVar, 1));
                }
                return a0.f21526a;
            case 1:
                jc.l.e(aVar, "_connection");
                this.f5575b.f5580b.w(aVar, this.f5576c);
                break;
            default:
                jc.l.e(aVar, "_connection");
                this.f5575b.f5581c.u(aVar, this.f5576c);
                break;
        }
        return a0.f21526a;
    }
}
