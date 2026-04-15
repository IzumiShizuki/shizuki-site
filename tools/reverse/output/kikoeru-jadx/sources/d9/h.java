package d9;

import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f5568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.b f5569c;

    public /* synthetic */ h(j jVar, c9.b bVar, int i10) {
        this.f5567a = i10;
        this.f5568b = jVar;
        this.f5569c = bVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        z7.a aVar = (z7.a) obj;
        switch (this.f5567a) {
            case 0:
                jc.l.e(aVar, "<unused var>");
                c9.b bVar = this.f5569c;
                String str = bVar.f3773b;
                String str2 = bVar.f3774c;
                jc.l.e(str, "type");
                jc.l.e(str2, "value");
                j jVar = this.f5568b;
                n7.v vVar = jVar.f5571a;
                if (((c9.b) ua.l.W(vVar, true, false, new b(1, str, str2))) == null) {
                    ua.l.W(vVar, false, true, new h(jVar, bVar, 1));
                }
                return a0.f21526a;
            case 1:
                jc.l.e(aVar, "_connection");
                this.f5568b.f5572b.w(aVar, this.f5569c);
                break;
            default:
                jc.l.e(aVar, "_connection");
                this.f5568b.f5573c.u(aVar, this.f5569c);
                break;
        }
        return a0.f21526a;
    }
}
