package y2;

import t2.k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2.g f25434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f25436c;

    public y(t2.g gVar, long j10, k0 k0Var) {
        k0 k0Var2;
        this.f25434a = gVar;
        this.f25435b = t2.c0.c(gVar.f20320b.length(), j10);
        if (k0Var != null) {
            k0Var2 = new k0(t2.c0.c(gVar.f20320b.length(), k0Var.f20358a));
        } else {
            k0Var2 = null;
        }
        this.f25436c = k0Var2;
    }

    public static y a(y yVar, t2.g gVar, long j10, int i10) {
        if ((i10 & 1) != 0) {
            gVar = yVar.f25434a;
        }
        if ((i10 & 2) != 0) {
            j10 = yVar.f25435b;
        }
        k0 k0Var = (i10 & 4) != 0 ? yVar.f25436c : null;
        yVar.getClass();
        return new y(gVar, j10, k0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return k0.a(this.f25435b, yVar.f25435b) && jc.l.a(this.f25436c, yVar.f25436c) && jc.l.a(this.f25434a, yVar.f25434a);
    }

    public final int hashCode() {
        int i10;
        int iHashCode = this.f25434a.hashCode() * 31;
        int i11 = k0.f20357c;
        long j10 = this.f25435b;
        int i12 = (((int) (j10 ^ (j10 >>> 32))) + iHashCode) * 31;
        k0 k0Var = this.f25436c;
        if (k0Var != null) {
            long j11 = k0Var.f20358a;
            i10 = (int) (j11 ^ (j11 >>> 32));
        } else {
            i10 = 0;
        }
        return i12 + i10;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f25434a) + "', selection=" + ((Object) k0.g(this.f25435b)) + ", composition=" + this.f25436c + ')';
    }

    public y(long j10, String str, int i10) {
        this(new t2.g((i10 & 1) != 0 ? "" : str), (i10 & 2) != 0 ? k0.f20356b : j10, (k0) null);
    }
}
