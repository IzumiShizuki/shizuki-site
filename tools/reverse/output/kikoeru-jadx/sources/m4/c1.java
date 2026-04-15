package m4;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends z0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f14154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f14155e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14157c;

    static {
        int i10 = p4.c0.f16548a;
        f14154d = Integer.toString(1, 36);
        f14155e = Integer.toString(2, 36);
    }

    public c1() {
        this.f14156b = false;
        this.f14157c = false;
    }

    @Override // m4.z0
    public final boolean b() {
        return this.f14156b;
    }

    @Override // m4.z0
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(z0.f14649a, 3);
        bundle.putBoolean(f14154d, this.f14156b);
        bundle.putBoolean(f14155e, this.f14157c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f14157c == c1Var.f14157c && this.f14156b == c1Var.f14156b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f14156b), Boolean.valueOf(this.f14157c)});
    }

    public c1(boolean z10) {
        this.f14156b = true;
        this.f14157c = z10;
    }
}
