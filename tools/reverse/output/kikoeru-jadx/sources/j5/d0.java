package j5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10249e;

    public d0(Object obj) {
        this(-1L, obj);
    }

    public final d0 a(Object obj) {
        if (this.f10245a.equals(obj)) {
            return this;
        }
        return new d0(obj, this.f10246b, this.f10247c, this.f10248d, this.f10249e);
    }

    public final boolean b() {
        return this.f10246b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f10245a.equals(d0Var.f10245a) && this.f10246b == d0Var.f10246b && this.f10247c == d0Var.f10247c && this.f10248d == d0Var.f10248d && this.f10249e == d0Var.f10249e;
    }

    public final int hashCode() {
        return ((((((((this.f10245a.hashCode() + 527) * 31) + this.f10246b) * 31) + this.f10247c) * 31) + ((int) this.f10248d)) * 31) + this.f10249e;
    }

    public d0(long j10, Object obj) {
        this(obj, -1, -1, j10, -1);
    }

    public d0(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public d0(Object obj, int i10, int i11, long j10, int i12) {
        this.f10245a = obj;
        this.f10246b = i10;
        this.f10247c = i11;
        this.f10248d = j10;
        this.f10249e = i12;
    }
}
