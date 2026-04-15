package l0;

import r.v1;
import r.w1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r.m f11591a = new r.m(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v1 f11592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f11593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r.z0 f11594d;

    static {
        n0 n0Var = n0.f11574c;
        n0 n0Var2 = n0.f11575d;
        v1 v1Var = w1.f18620a;
        f11592b = new v1(n0Var, n0Var2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        f11593c = jFloatToRawIntBits;
        f11594d = new r.z0(3, new p1.b(jFloatToRawIntBits));
    }
}
