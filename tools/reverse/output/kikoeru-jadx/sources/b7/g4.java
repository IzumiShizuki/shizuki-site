package b7;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f1794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f1795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f1796f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f1799c;

    static {
        int i10 = p4.c0.f16548a;
        f1794d = Integer.toString(0, 36);
        f1795e = Integer.toString(1, 36);
        f1796f = Integer.toString(2, 36);
    }

    public g4(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public static g4 a(Bundle bundle) {
        int i10 = bundle.getInt(f1794d, 1000);
        String string = bundle.getString(f1795e, "");
        Bundle bundle2 = bundle.getBundle(f1796f);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new g4(string, i10, bundle2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f1794d, this.f1797a);
        bundle.putString(f1795e, this.f1798b);
        Bundle bundle2 = this.f1799c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f1796f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return this.f1797a == g4Var.f1797a && Objects.equals(this.f1798b, g4Var.f1798b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1797a), this.f1798b);
    }

    public g4(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        p4.c.c(z10);
        this.f1797a = i10;
        this.f1798b = str;
        this.f1799c = bundle;
    }
}
