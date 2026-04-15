package r1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18652c;

    public c(long j10, String str, int i10) {
        this.f18650a = str;
        this.f18651b = j10;
        this.f18652c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i10);

    public abstract float b(int i10);

    public boolean c() {
        return false;
    }

    public abstract long d(float f10, float f11, float f12);

    public abstract float e(float f10, float f11, float f12);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f18652c == cVar.f18652c && jc.l.a(this.f18650a, cVar.f18650a)) {
            return b.a(this.f18651b, cVar.f18651b);
        }
        return false;
    }

    public abstract long f(float f10, float f11, float f12, float f13, c cVar);

    public int hashCode() {
        int iHashCode = this.f18650a.hashCode() * 31;
        int i10 = b.f18649e;
        long j10 = this.f18651b;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f18652c;
    }

    public final String toString() {
        return this.f18650a + " (id=" + this.f18652c + ", model=" + ((Object) b.b(this.f18651b)) + ')';
    }
}
