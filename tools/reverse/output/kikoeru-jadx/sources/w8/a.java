package w8;

import i8.m;
import s8.j;
import s8.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23434b;

    public a(int i10) {
        this.f23434b = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // w8.e
    public final f a(m mVar, j jVar) {
        return !(jVar instanceof o) ? new d(mVar, jVar) : ((o) jVar).f19660c == j8.f.f10613a ? new d(mVar, jVar) : new b(mVar, jVar, this.f23434b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f23434b == ((a) obj).f23434b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f23434b * 31) + 1237;
    }
}
