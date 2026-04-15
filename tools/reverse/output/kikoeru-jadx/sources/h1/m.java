package h1;

import m0.t2;
import m0.u2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.k f8048b;

    public /* synthetic */ m(ic.k kVar, int i10) {
        this.f8047a = i10;
        this.f8048b = kVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f8047a) {
            case 0:
                g gVar = (g) this.f8048b.a((k) obj);
                synchronized (n.f8051c) {
                    n.f8052d = n.f8052d.l(gVar.g());
                }
                return gVar;
            case 1:
                return new t2((u2) obj, this.f8048b);
            default:
                ic.k kVar = this.f8048b;
                z7.c cVar = (z7.c) obj;
                jc.l.e(cVar, "it");
                kVar.a(new n7.a(cVar));
                return ub.a0.f21526a;
        }
    }
}
