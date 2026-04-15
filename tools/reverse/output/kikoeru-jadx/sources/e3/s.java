package e3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f6095c = new s(2, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f6096d = new s(1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6098b;

    public s(int i10, boolean z10) {
        this.f6097a = i10;
        this.f6098b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f6097a == sVar.f6097a && this.f6098b == sVar.f6098b;
    }

    public final int hashCode() {
        return (this.f6097a * 31) + (this.f6098b ? 1231 : 1237);
    }

    public final String toString() {
        return equals(f6095c) ? "TextMotion.Static" : equals(f6096d) ? "TextMotion.Animated" : "Invalid";
    }
}
