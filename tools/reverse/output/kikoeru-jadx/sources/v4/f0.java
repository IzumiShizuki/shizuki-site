package v4;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22484c;

    public f0(e0 e0Var) {
        this.f22482a = e0Var.f22467a;
        this.f22483b = e0Var.f22468b;
        this.f22484c = e0Var.f22469c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f22482a == f0Var.f22482a && this.f22483b == f0Var.f22483b && this.f22484c == f0Var.f22484c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f22482a), Float.valueOf(this.f22483b), Long.valueOf(this.f22484c)});
    }
}
