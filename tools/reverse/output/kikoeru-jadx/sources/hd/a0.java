package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8357a;

    public a0(int i10) {
        this.f8357a = i10;
    }

    @Override // hd.c0
    public final Object a() {
        return Integer.valueOf(this.f8357a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && this.f8357a == ((a0) obj).f8357a;
    }

    public final int hashCode() {
        return this.f8357a;
    }
}
