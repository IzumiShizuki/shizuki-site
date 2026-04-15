package j1;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9679a;

    public f(float f10) {
        this.f9679a = f10;
    }

    public final int a(int i10, int i11, f3.m mVar) {
        float f10 = (i11 - i10) / 2.0f;
        f3.m mVar2 = f3.m.f6667a;
        float f11 = this.f9679a;
        if (mVar != mVar2) {
            f11 *= -1;
        }
        return Math.round((1 + f11) * f10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f9679a, ((f) obj).f9679a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f9679a);
    }

    public final String toString() {
        return h0.l(new StringBuilder("Horizontal(bias="), this.f9679a, ')');
    }
}
