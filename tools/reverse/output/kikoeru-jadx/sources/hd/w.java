package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f8483a;

    public w(char c3) {
        this.f8483a = c3;
    }

    @Override // hd.c0
    public final Object a() {
        return Character.valueOf(this.f8483a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.f8483a == ((w) obj).f8483a;
    }

    public final int hashCode() {
        return this.f8483a;
    }
}
