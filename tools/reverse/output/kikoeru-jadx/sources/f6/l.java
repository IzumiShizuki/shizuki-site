package f6;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f6748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f6749f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f6745b = i10;
        this.f6746c = i11;
        this.f6747d = i12;
        this.f6748e = iArr;
        this.f6749f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f6745b == lVar.f6745b && this.f6746c == lVar.f6746c && this.f6747d == lVar.f6747d && Arrays.equals(this.f6748e, lVar.f6748e) && Arrays.equals(this.f6749f, lVar.f6749f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6749f) + ((Arrays.hashCode(this.f6748e) + ((((((527 + this.f6745b) * 31) + this.f6746c) * 31) + this.f6747d) * 31)) * 31);
    }
}
