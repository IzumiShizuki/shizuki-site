package bg;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class s0 {
    public static final r0 Companion = new r0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f2966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f2967f;

    public s0(int i10, String str, List list, String str2, String str3, float f10, double d10) {
        if (63 != (i10 & 63)) {
            wf.z0.i(i10, 63, q0.f2957b);
            throw null;
        }
        this.f2962a = str;
        this.f2963b = list;
        this.f2964c = str2;
        this.f2965d = str3;
        this.f2966e = f10;
        this.f2967f = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return jc.l.a(this.f2962a, s0Var.f2962a) && jc.l.a(this.f2963b, s0Var.f2963b) && jc.l.a(this.f2964c, s0Var.f2964c) && jc.l.a(this.f2965d, s0Var.f2965d) && Float.valueOf(this.f2966e).equals(Float.valueOf(s0Var.f2966e)) && Double.valueOf(this.f2967f).equals(Double.valueOf(s0Var.f2967f));
    }

    public final int hashCode() {
        int iX = q.t0.x(this.f2966e, j2.h0.e(j2.h0.e(q.t0.z(this.f2962a.hashCode() * 31, 31, this.f2963b), 31, this.f2964c), 31, this.f2965d), 31);
        long jDoubleToLongBits = Double.doubleToLongBits(this.f2967f);
        return iX + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "Subtitle(title=" + this.f2962a + ", subPath=" + this.f2963b + ", hash=" + this.f2964c + ", ext=" + this.f2965d + ", duration=" + this.f2966e + ", confidence=" + this.f2967f + ')';
    }
}
