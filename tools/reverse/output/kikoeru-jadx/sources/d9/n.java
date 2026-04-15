package d9;

import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f5583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.d f5584c;

    public /* synthetic */ n(o oVar, c9.d dVar, int i10) {
        this.f5582a = i10;
        this.f5583b = oVar;
        this.f5584c = dVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        z7.a aVar = (z7.a) obj;
        switch (this.f5582a) {
            case 0:
                jc.l.e(aVar, "_connection");
                this.f5583b.f5586b.w(aVar, this.f5584c);
                break;
            case 1:
                jc.l.e(aVar, "_connection");
                this.f5583b.f5587c.u(aVar, this.f5584c);
                break;
            default:
                jc.l.e(aVar, "<unused var>");
                c9.d dVar = this.f5584c;
                long j10 = dVar.f3790c;
                o oVar = this.f5583b;
                n7.v vVar = oVar.f5585a;
                c9.d dVar2 = (c9.d) ua.l.W(vVar, true, false, new l(j10, 2));
                if (dVar2 != null) {
                    oVar.a(c9.d.a(dVar, dVar2.f3788a, null, 8190));
                } else {
                    ua.l.W(vVar, false, true, new n(oVar, dVar, 0));
                }
                return a0.f21526a;
        }
        return a0.f21526a;
    }
}
