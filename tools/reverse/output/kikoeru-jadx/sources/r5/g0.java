package r5;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f18820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18822d;

    public g0(int i10, int i11, int i12, byte[] bArr) {
        this.f18819a = i10;
        this.f18820b = bArr;
        this.f18821c = i11;
        this.f18822d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f18819a == g0Var.f18819a && this.f18821c == g0Var.f18821c && this.f18822d == g0Var.f18822d && Arrays.equals(this.f18820b, g0Var.f18820b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f18820b) + (this.f18819a * 31)) * 31) + this.f18821c) * 31) + this.f18822d;
    }
}
