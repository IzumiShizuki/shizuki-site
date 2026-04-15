package t4;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        k kVar = (k) obj;
        k kVar2 = (k) obj2;
        long j10 = kVar.f20454f;
        long j11 = kVar2.f20454f;
        return j10 - j11 == 0 ? kVar.compareTo(kVar2) : j10 < j11 ? -1 : 1;
    }
}
