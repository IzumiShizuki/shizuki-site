package e3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f6070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f6071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f6072d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6073a;

    static {
        a(0.0f);
        a(0.5f);
        f6070b = 0.5f;
        a(-1.0f);
        f6071c = -1.0f;
        a(1.0f);
        f6072d = 1.0f;
    }

    public static void a(float f10) {
        if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
            z2.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f10) {
        if (f10 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f10 == f6070b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f10 == f6071c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f10 == f6072d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f6073a, ((f) obj).f6073a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6073a);
    }

    public final String toString() {
        return b(this.f6073a);
    }
}
