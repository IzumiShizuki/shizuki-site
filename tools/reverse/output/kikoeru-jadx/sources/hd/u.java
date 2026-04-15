package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8461a;

    public u(boolean z10) {
        this.f8461a = z10;
    }

    @Override // hd.c0
    public final Object a() {
        return Boolean.valueOf(this.f8461a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.f8461a == ((u) obj).f8461a;
    }

    public final int hashCode() {
        return this.f8461a ? 1231 : 1237;
    }
}
