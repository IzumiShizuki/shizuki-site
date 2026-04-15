package j2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2.k f10010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o.z f10011b;

    public t2(q2.o oVar, o.m mVar) {
        this.f10010a = oVar.f17639d;
        this.f10011b = new o.z(q2.o.j(4, oVar).size());
        List listJ = q2.o.j(4, oVar);
        int size = listJ.size();
        for (int i10 = 0; i10 < size; i10++) {
            q2.o oVar2 = (q2.o) listJ.get(i10);
            if (mVar.a(oVar2.f17642g)) {
                this.f10011b.a(oVar2.f17642g);
            }
        }
    }
}
