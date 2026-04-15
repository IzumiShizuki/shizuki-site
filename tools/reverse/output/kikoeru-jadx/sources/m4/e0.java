package m4;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f14187d = new e0(new c7.e1(23));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f14188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f14189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f14190g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f14191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f14193c;

    static {
        int i10 = p4.c0.f16548a;
        f14188e = Integer.toString(0, 36);
        f14189f = Integer.toString(1, 36);
        f14190g = Integer.toString(2, 36);
    }

    public e0(c7.e1 e1Var) {
        this.f14191a = (Uri) e1Var.f3618b;
        this.f14192b = (String) e1Var.f3619c;
        this.f14193c = (Bundle) e1Var.f3620d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        Uri uri = e0Var.f14191a;
        int i10 = p4.c0.f16548a;
        if (Objects.equals(this.f14191a, uri) && Objects.equals(this.f14192b, e0Var.f14192b)) {
            if ((this.f14193c == null) == (e0Var.f14193c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.f14191a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f14192b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f14193c != null ? 1 : 0);
    }
}
