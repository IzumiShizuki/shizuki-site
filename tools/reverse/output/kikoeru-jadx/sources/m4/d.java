package m4;

import android.media.AudioAttributes;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f14158g = new d(0, 0, 1, 1, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f14159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f14160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f14161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f14162k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f14163l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f14169f;

    static {
        int i10 = p4.c0.f16548a;
        f14159h = Integer.toString(0, 36);
        f14160i = Integer.toString(1, 36);
        f14161j = Integer.toString(2, 36);
        f14162k = Integer.toString(3, 36);
        f14163l = Integer.toString(4, 36);
    }

    public d(int i10, int i11, int i12, int i13, int i14) {
        this.f14164a = i10;
        this.f14165b = i11;
        this.f14166c = i12;
        this.f14167d = i13;
        this.f14168e = i14;
    }

    public static d a(Bundle bundle) {
        String str = f14159h;
        int i10 = bundle.containsKey(str) ? bundle.getInt(str) : 0;
        String str2 = f14160i;
        int i11 = bundle.containsKey(str2) ? bundle.getInt(str2) : 0;
        String str3 = f14161j;
        int i12 = bundle.containsKey(str3) ? bundle.getInt(str3) : 1;
        String str4 = f14162k;
        int i13 = bundle.containsKey(str4) ? bundle.getInt(str4) : 1;
        String str5 = f14163l;
        return new d(i10, i11, i12, i13, bundle.containsKey(str5) ? bundle.getInt(str5) : 0);
    }

    public final t0 b() {
        if (this.f14169f == null) {
            t0 t0Var = new t0();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f14164a).setFlags(this.f14165b).setUsage(this.f14166c);
            int i10 = p4.c0.f16548a;
            if (i10 >= 29) {
                usage.setAllowedCapturePolicy(this.f14167d);
            }
            if (i10 >= 32) {
                usage.setSpatializationBehavior(this.f14168e);
            }
            t0Var.f14586a = usage.build();
            this.f14169f = t0Var;
        }
        return this.f14169f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f14164a == dVar.f14164a && this.f14165b == dVar.f14165b && this.f14166c == dVar.f14166c && this.f14167d == dVar.f14167d && this.f14168e == dVar.f14168e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.f14164a) * 31) + this.f14165b) * 31) + this.f14166c) * 31) + this.f14167d) * 31) + this.f14168e;
    }
}
