package oc;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16306b;

    public a(float f10, float f11) {
        this.f16305a = f10;
        this.f16306b = f11;
    }

    public static boolean a(Float f10, Float f11) {
        return f10.floatValue() <= f11.floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        float f10 = this.f16305a;
        float f11 = this.f16306b;
        if (f10 > f11) {
            a aVar = (a) obj;
            if (aVar.f16305a > aVar.f16306b) {
                return true;
            }
        }
        a aVar2 = (a) obj;
        return f10 == aVar2.f16305a && f11 == aVar2.f16306b;
    }

    public final int hashCode() {
        float f10 = this.f16305a;
        float f11 = this.f16306b;
        if (f10 > f11) {
            return -1;
        }
        return Float.floatToIntBits(f11) + (Float.floatToIntBits(f10) * 31);
    }

    public final String toString() {
        return this.f16305a + ".." + this.f16306b;
    }
}
