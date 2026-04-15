package l1;

import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f11692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b1.e f11693d;

    public d(int i10, long j10, e eVar, b1.e eVar2) {
        this.f11690a = i10;
        this.f11691b = j10;
        this.f11692c = eVar;
        this.f11693d = eVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f11690a == dVar.f11690a && this.f11691b == dVar.f11691b && this.f11692c == dVar.f11692c && l.a(this.f11693d, dVar.f11693d);
    }

    public final int hashCode() {
        int i10 = this.f11690a * 31;
        long j10 = this.f11691b;
        int iHashCode = (this.f11692c.hashCode() + ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31;
        b1.e eVar = this.f11693d;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f11690a + ", timestamp=" + this.f11691b + ", type=" + this.f11692c + ", structureCompat=" + this.f11693d + ')';
    }
}
