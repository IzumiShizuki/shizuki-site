package p4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f16621c = new u(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16623b;

    static {
        new u(0, 0);
    }

    public u(int i10, int i11) {
        c.c((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f16622a = i10;
        this.f16623b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f16622a == uVar.f16622a && this.f16623b == uVar.f16623b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f16622a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f16623b;
    }

    public final String toString() {
        return this.f16622a + "x" + this.f16623b;
    }
}
