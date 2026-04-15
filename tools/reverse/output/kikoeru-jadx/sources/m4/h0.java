package m4;

import android.net.Uri;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class h0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f14238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f14239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f14240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f14241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f14242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f14243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f14244n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f14245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f14251g;

    static {
        int i10 = p4.c0.f16548a;
        f14238h = Integer.toString(0, 36);
        f14239i = Integer.toString(1, 36);
        f14240j = Integer.toString(2, 36);
        f14241k = Integer.toString(3, 36);
        f14242l = Integer.toString(4, 36);
        f14243m = Integer.toString(5, 36);
        f14244n = Integer.toString(6, 36);
    }

    public h0(g0 g0Var) {
        this.f14245a = g0Var.f14213a;
        this.f14246b = g0Var.f14214b;
        this.f14247c = g0Var.f14215c;
        this.f14248d = g0Var.f14216d;
        this.f14249e = g0Var.f14217e;
        this.f14250f = g0Var.f14218f;
        this.f14251g = g0Var.f14219g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.f14245a.equals(h0Var.f14245a)) {
            String str = h0Var.f14246b;
            int i10 = p4.c0.f16548a;
            if (Objects.equals(this.f14246b, str) && Objects.equals(this.f14247c, h0Var.f14247c) && this.f14248d == h0Var.f14248d && this.f14249e == h0Var.f14249e && Objects.equals(this.f14250f, h0Var.f14250f) && Objects.equals(this.f14251g, h0Var.f14251g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f14245a.hashCode() * 31;
        String str = this.f14246b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14247c;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f14248d) * 31) + this.f14249e) * 31;
        String str3 = this.f14250f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14251g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
