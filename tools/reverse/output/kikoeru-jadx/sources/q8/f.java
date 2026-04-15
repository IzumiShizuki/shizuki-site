package q8;

import m0.w;
import o.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f17923g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, w wVar) {
        super(i10);
        this.f17923g = wVar;
    }

    @Override // o.u
    public final void a(Object obj, Object obj2, Object obj3) {
        e eVar = (e) obj2;
        ((i) this.f17923g.f13782b).c((b) obj, eVar.f17920a, eVar.f17921b, eVar.f17922c);
    }

    @Override // o.u
    public final int f(Object obj, Object obj2) {
        return ((e) obj2).f17922c;
    }
}
