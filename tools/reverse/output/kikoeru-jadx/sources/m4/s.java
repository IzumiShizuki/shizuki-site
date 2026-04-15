package m4;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends z0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f14574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f14575e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14577c;

    static {
        int i10 = p4.c0.f16548a;
        f14574d = Integer.toString(1, 36);
        f14575e = Integer.toString(2, 36);
    }

    public s() {
        this.f14576b = false;
        this.f14577c = false;
    }

    @Override // m4.z0
    public final boolean b() {
        return this.f14576b;
    }

    @Override // m4.z0
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(z0.f14649a, 0);
        bundle.putBoolean(f14574d, this.f14576b);
        bundle.putBoolean(f14575e, this.f14577c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f14577c == sVar.f14577c && this.f14576b == sVar.f14576b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f14576b), Boolean.valueOf(this.f14577c)});
    }

    public s(boolean z10) {
        this.f14576b = true;
        this.f14577c = z10;
    }
}
