package j3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10197e;

    public y(int i10) {
        this((i10 & 1) == 0, z.f10198a, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f10193a == yVar.f10193a && this.f10194b == yVar.f10194b && this.f10195c == yVar.f10195c && this.f10196d == yVar.f10196d && this.f10197e == yVar.f10197e;
    }

    public final int hashCode() {
        return (((((((((this.f10193a * 31) + (this.f10194b ? 1231 : 1237)) * 31) + (this.f10195c ? 1231 : 1237)) * 31) + (this.f10196d ? 1231 : 1237)) * 31) + (this.f10197e ? 1231 : 1237)) * 31) + 1237;
    }

    public y(boolean z10, z zVar, boolean z11) {
        x0.z zVar2 = j.f10142a;
        int i10 = !z10 ? 262152 : 262144;
        i10 = zVar == z.f10199b ? i10 | 8192 : i10;
        i10 = z11 ? i10 : i10 | 512;
        boolean z12 = zVar == z.f10198a;
        this.f10193a = i10;
        this.f10194b = z12;
        this.f10195c = true;
        this.f10196d = true;
        this.f10197e = true;
    }
}
