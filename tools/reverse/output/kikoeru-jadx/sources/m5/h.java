package m5;

import q.t0;
import ya.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14701b;

    public h(m4.q qVar, int i10) {
        this.f14700a = (qVar.f14535e & 1) != 0;
        this.f14701b = t0.v(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return y.f26074a.c(this.f14701b, hVar.f14701b).c(this.f14700a, hVar.f14700a).e();
    }
}
