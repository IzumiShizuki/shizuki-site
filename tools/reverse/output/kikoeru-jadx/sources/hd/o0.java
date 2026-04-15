package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends gh.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8437b;

    public o0(int i10) {
        this.f8437b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && this.f8437b == ((o0) obj).f8437b;
    }

    public final int hashCode() {
        return this.f8437b;
    }

    public final String toString() {
        return j2.h0.m(new StringBuilder("TypeParameter(id="), this.f8437b, ')');
    }
}
