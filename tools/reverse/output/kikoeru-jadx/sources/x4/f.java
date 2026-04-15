package x4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f24608d = new l6.c().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24611c;

    public f(l6.c cVar) {
        this.f24609a = cVar.f11732a;
        this.f24610b = cVar.f11733b;
        this.f24611c = cVar.f11734c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f24609a == fVar.f24609a && this.f24610b == fVar.f24610b && this.f24611c == fVar.f24611c;
    }

    public final int hashCode() {
        return ((this.f24609a ? 1 : 0) << 2) + ((this.f24610b ? 1 : 0) << 1) + (this.f24611c ? 1 : 0);
    }
}
