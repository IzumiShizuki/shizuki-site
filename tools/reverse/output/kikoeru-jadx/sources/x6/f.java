package x6;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f24814b;

    public f(int i10, b bVar) {
        this.f24813a = i10;
        this.f24814b = bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f24813a, ((f) obj).f24813a);
    }
}
