package uh;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f21952b;

    public b(float f10, float f11) {
        this.f21951a = f10;
        this.f21952b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f21951a, bVar.f21951a) == 0 && Float.compare(this.f21952b, bVar.f21952b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f21952b) + (Float.floatToIntBits(this.f21951a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionScrollPadding(start=");
        sb.append(this.f21951a);
        sb.append(", end=");
        return h0.l(sb, this.f21952b, ')');
    }
}
