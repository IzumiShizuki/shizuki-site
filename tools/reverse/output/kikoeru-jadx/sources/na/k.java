package na;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic.o f15715a;

    public /* synthetic */ k(ic.o oVar) {
        this.f15715a = oVar;
    }

    public final void a(e7.a0 a0Var, e7.u uVar) {
        Object next;
        jc.l.e(uVar, "<unused var>");
        h7.g gVar = a0Var.f6299b;
        Iterator it = vb.m.v0(gVar.f8164f).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = ((df.a) df.m.W(it)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (!(((e7.j) next).f6334b instanceof e7.w)) {
                    break;
                }
            }
        }
        e7.j jVar = (e7.j) gVar.f8164f.n();
        this.f15715a.g(a0Var, (e7.j) next, jVar);
    }
}
