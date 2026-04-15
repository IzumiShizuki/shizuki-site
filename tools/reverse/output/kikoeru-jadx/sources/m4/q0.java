package m4;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14557c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14558b;

    static {
        int i10 = p4.c0.f16548a;
        f14557c = Integer.toString(1, 36);
    }

    public q0() {
        this.f14558b = -1.0f;
    }

    @Override // m4.z0
    public final boolean b() {
        return this.f14558b != -1.0f;
    }

    @Override // m4.z0
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(z0.f14649a, 1);
        bundle.putFloat(f14557c, this.f14558b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q0) {
            return this.f14558b == ((q0) obj).f14558b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f14558b)});
    }

    public q0(float f10) {
        p4.c.b("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.f14558b = f10;
    }
}
