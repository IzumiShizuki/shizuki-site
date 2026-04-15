package pc;

import ce.j0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f16981c = new y(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f16982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f16983b;

    public y(z zVar, v vVar) {
        String str;
        this.f16982a = zVar;
        this.f16983b = vVar;
        if ((zVar == null) == (vVar == null)) {
            return;
        }
        if (zVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + zVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f16982a == yVar.f16982a && jc.l.a(this.f16983b, yVar.f16983b);
    }

    public final int hashCode() {
        z zVar = this.f16982a;
        int iHashCode = (zVar == null ? 0 : zVar.hashCode()) * 31;
        v vVar = this.f16983b;
        return iHashCode + (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        z zVar = this.f16982a;
        int i10 = zVar == null ? -1 : x.f16980a[zVar.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        v vVar = this.f16983b;
        if (i10 == 1) {
            return String.valueOf(vVar);
        }
        if (i10 == 2) {
            return "in " + vVar;
        }
        if (i10 != 3) {
            throw new j0();
        }
        return "out " + vVar;
    }
}
