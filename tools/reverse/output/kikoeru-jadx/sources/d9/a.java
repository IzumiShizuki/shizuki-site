package d9;

import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f5549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.a f5550c;

    public /* synthetic */ a(g gVar, c9.a aVar, int i10) {
        this.f5548a = i10;
        this.f5549b = gVar;
        this.f5550c = aVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        z7.a aVar = (z7.a) obj;
        switch (this.f5548a) {
            case 0:
                jc.l.e(aVar, "_connection");
                this.f5549b.f5565c.u(aVar, this.f5550c);
                break;
            case 1:
                jc.l.e(aVar, "<unused var>");
                c9.a aVar2 = this.f5550c;
                String str = aVar2.f3767b;
                String str2 = aVar2.f3768c;
                jc.l.e(str, "server");
                jc.l.e(str2, "username");
                g gVar = this.f5549b;
                n7.v vVar = gVar.f5563a;
                c9.a aVar3 = (c9.a) ua.l.W(vVar, true, false, new b(0, str, str2));
                if (aVar3 == null) {
                    ua.l.W(vVar, false, true, new a(gVar, aVar2, 2));
                } else {
                    int i10 = aVar3.f3766a;
                    String str3 = aVar2.f3769d;
                    String str4 = aVar2.f3770e;
                    long j10 = aVar2.f3771f;
                    jc.l.e(str3, "password");
                    jc.l.e(str4, "token");
                    ua.l.W(vVar, false, true, new a(gVar, new c9.a(i10, str, str2, str3, str4, j10), 3));
                }
                return a0.f21526a;
            case 2:
                jc.l.e(aVar, "_connection");
                this.f5549b.f5564b.w(aVar, this.f5550c);
                break;
            default:
                jc.l.e(aVar, "_connection");
                this.f5549b.f5566d.u(aVar, this.f5550c);
                break;
        }
        return a0.f21526a;
    }
}
