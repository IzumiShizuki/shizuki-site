package q4;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17775b = -9223372036854775807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17774a = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f17775b, ((q) obj).f17775b);
    }
}
