package uh;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22091b;

    public z(float f10, float f11) {
        this.f22090a = f10;
        this.f22091b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Float.compare(this.f22090a, zVar.f22090a) == 0 && Float.compare(this.f22091b, zVar.f22091b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f22091b) + (Float.floatToIntBits(this.f22090a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollAreaOffsets(start=");
        sb.append(this.f22090a);
        sb.append(", end=");
        return h0.l(sb, this.f22091b, ')');
    }
}
