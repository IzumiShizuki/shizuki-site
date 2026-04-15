package m4;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s0 f14578d = new s0(1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f14579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f14580f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14583c;

    static {
        int i10 = p4.c0.f16548a;
        f14579e = Integer.toString(0, 36);
        f14580f = Integer.toString(1, 36);
    }

    public s0(float f10) {
        this(f10, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s0.class == obj.getClass()) {
            s0 s0Var = (s0) obj;
            if (this.f14581a == s0Var.f14581a && this.f14582b == s0Var.f14582b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f14582b) + ((Float.floatToRawIntBits(this.f14581a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f14581a), Float.valueOf(this.f14582b)};
        int i10 = p4.c0.f16548a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public s0(float f10, float f11) {
        p4.c.c(f10 > 0.0f);
        p4.c.c(f11 > 0.0f);
        this.f14581a = f10;
        this.f14582b = f11;
        this.f14583c = Math.round(f10 * 1000.0f);
    }
}
