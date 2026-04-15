package g0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements a {
    @Override // g0.a
    public final float b(long j10, f3.c cVar) {
        return 20.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(20.0f, 20.0f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(20.0f);
    }

    public final String toString() {
        return "CornerSize(size = 20.0.px)";
    }
}
