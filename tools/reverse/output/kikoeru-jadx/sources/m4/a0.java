package m4;

import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f14101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f14102j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f14103k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f14104l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f14105m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f14106n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f14107o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f14108p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f14109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f14110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ya.k0 f14111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ya.i0 f14115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f14116h;

    static {
        int i10 = p4.c0.f16548a;
        f14101i = Integer.toString(0, 36);
        f14102j = Integer.toString(1, 36);
        f14103k = Integer.toString(2, 36);
        f14104l = Integer.toString(3, 36);
        f14105m = Integer.toString(4, 36);
        f14106n = Integer.toString(5, 36);
        f14107o = Integer.toString(6, 36);
        f14108p = Integer.toString(7, 36);
    }

    public a0(z zVar) {
        p4.c.i((zVar.f14643c && ((Uri) zVar.f14645e) == null) ? false : true);
        UUID uuid = (UUID) zVar.f14644d;
        uuid.getClass();
        this.f14109a = uuid;
        this.f14110b = (Uri) zVar.f14645e;
        this.f14111c = (ya.k0) zVar.f14646f;
        this.f14112d = zVar.f14641a;
        this.f14114f = zVar.f14643c;
        this.f14113e = zVar.f14642b;
        this.f14115g = (ya.i0) zVar.f14647g;
        byte[] bArr = (byte[]) zVar.f14648h;
        this.f14116h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f14109a.equals(a0Var.f14109a)) {
            Uri uri = a0Var.f14110b;
            int i10 = p4.c0.f16548a;
            if (Objects.equals(this.f14110b, uri) && Objects.equals(this.f14111c, a0Var.f14111c) && this.f14112d == a0Var.f14112d && this.f14114f == a0Var.f14114f && this.f14113e == a0Var.f14113e && this.f14115g.equals(a0Var.f14115g) && Arrays.equals(this.f14116h, a0Var.f14116h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f14109a.hashCode() * 31;
        Uri uri = this.f14110b;
        return Arrays.hashCode(this.f14116h) + ((this.f14115g.hashCode() + ((((((((this.f14111c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f14112d ? 1 : 0)) * 31) + (this.f14114f ? 1 : 0)) * 31) + (this.f14113e ? 1 : 0)) * 31)) * 31);
    }
}
