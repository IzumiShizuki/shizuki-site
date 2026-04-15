package d9;

import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f5603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.g f5604c;

    public /* synthetic */ t(v vVar, c9.g gVar, int i10) {
        this.f5602a = i10;
        this.f5603b = vVar;
        this.f5604c = gVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        z7.a aVar = (z7.a) obj;
        switch (this.f5602a) {
            case 0:
                jc.l.e(aVar, "_connection");
                this.f5603b.f5609b.w(aVar, this.f5604c);
                break;
            case 1:
                jc.l.e(aVar, "_connection");
                this.f5603b.f5610c.u(aVar, this.f5604c);
                break;
            default:
                jc.l.e(aVar, "<unused var>");
                c9.g gVar = this.f5604c;
                long j10 = gVar.f3816b;
                String str = gVar.f3818d;
                jc.l.e(str, "name");
                v vVar = this.f5603b;
                n7.v vVar2 = vVar.f5608a;
                c9.g gVar2 = (c9.g) ua.l.W(vVar2, true, false, new u(j10, str, 0));
                if (gVar2 != null) {
                    ua.l.W(vVar2, false, true, new t(vVar, c9.g.a(gVar, gVar2.f3815a, null, 126), 1));
                } else {
                    ua.l.W(vVar2, false, true, new t(vVar, gVar, 0));
                }
                return a0.f21526a;
        }
        return a0.f21526a;
    }
}
