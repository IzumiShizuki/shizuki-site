package m4;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c0 f14143f = new c0(new b0());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f14144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f14145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f14146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f14147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f14148k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f14152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f14153e;

    static {
        int i10 = p4.c0.f16548a;
        f14144g = Integer.toString(0, 36);
        f14145h = Integer.toString(1, 36);
        f14146i = Integer.toString(2, 36);
        f14147j = Integer.toString(3, 36);
        f14148k = Integer.toString(4, 36);
    }

    public c0(b0 b0Var) {
        long j10 = b0Var.f14132a;
        long j11 = b0Var.f14133b;
        long j12 = b0Var.f14134c;
        float f10 = b0Var.f14135d;
        float f11 = b0Var.f14136e;
        this.f14149a = j10;
        this.f14150b = j11;
        this.f14151c = j12;
        this.f14152d = f10;
        this.f14153e = f11;
    }

    public static c0 b(Bundle bundle) {
        b0 b0Var = new b0();
        c0 c0Var = f14143f;
        b0Var.f14132a = bundle.getLong(f14144g, c0Var.f14149a);
        b0Var.f14133b = bundle.getLong(f14145h, c0Var.f14150b);
        b0Var.f14134c = bundle.getLong(f14146i, c0Var.f14151c);
        b0Var.f14135d = bundle.getFloat(f14147j, c0Var.f14152d);
        b0Var.f14136e = bundle.getFloat(f14148k, c0Var.f14153e);
        return new c0(b0Var);
    }

    public final b0 a() {
        b0 b0Var = new b0();
        b0Var.f14132a = this.f14149a;
        b0Var.f14133b = this.f14150b;
        b0Var.f14134c = this.f14151c;
        b0Var.f14135d = this.f14152d;
        b0Var.f14136e = this.f14153e;
        return b0Var;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        c0 c0Var = f14143f;
        long j10 = c0Var.f14149a;
        long j11 = this.f14149a;
        if (j11 != j10) {
            bundle.putLong(f14144g, j11);
        }
        long j12 = c0Var.f14150b;
        long j13 = this.f14150b;
        if (j13 != j12) {
            bundle.putLong(f14145h, j13);
        }
        long j14 = c0Var.f14151c;
        long j15 = this.f14151c;
        if (j15 != j14) {
            bundle.putLong(f14146i, j15);
        }
        float f10 = c0Var.f14152d;
        float f11 = this.f14152d;
        if (f11 != f10) {
            bundle.putFloat(f14147j, f11);
        }
        float f12 = c0Var.f14153e;
        float f13 = this.f14153e;
        if (f13 != f12) {
            bundle.putFloat(f14148k, f13);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f14149a == c0Var.f14149a && this.f14150b == c0Var.f14150b && this.f14151c == c0Var.f14151c && this.f14152d == c0Var.f14152d && this.f14153e == c0Var.f14153e;
    }

    public final int hashCode() {
        long j10 = this.f14149a;
        long j11 = this.f14150b;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f14151c;
        int i11 = (i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        float f10 = this.f14152d;
        int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f14153e;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }
}
