package j1;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9680a;

    public g(float f10) {
        this.f9680a = f10;
    }

    public final int a(int i10, int i11) {
        return Math.round((1 + this.f9680a) * ((i11 - i10) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Float.compare(this.f9680a, ((g) obj).f9680a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f9680a);
    }

    public final String toString() {
        return h0.l(new StringBuilder("Vertical(bias="), this.f9680a, ')');
    }
}
