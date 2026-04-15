package m4;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f14601b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f14602a;

    static {
        int i10 = p4.c0.f16548a;
        f14601b = Integer.toString(0, 36);
    }

    public v(t0 t0Var) {
        this.f14602a = (Uri) t0Var.f14586a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v) || !this.f14602a.equals(((v) obj).f14602a)) {
            return false;
        }
        int i10 = p4.c0.f16548a;
        return true;
    }

    public final int hashCode() {
        return this.f14602a.hashCode() * 31;
    }
}
