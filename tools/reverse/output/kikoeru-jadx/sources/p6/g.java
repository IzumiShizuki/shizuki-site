package p6;

import o6.i;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i implements Comparable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f16839k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (d(4) != gVar.d(4)) {
            return d(4) ? 1 : -1;
        }
        long j10 = this.f21384g - gVar.f21384g;
        if (j10 == 0) {
            j10 = this.f16839k - gVar.f16839k;
            if (j10 == 0) {
                return 0;
            }
        }
        return j10 > 0 ? 1 : -1;
    }
}
