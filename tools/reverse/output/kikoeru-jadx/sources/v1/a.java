package v1;

import f3.j;
import gh.g;
import i2.l0;
import jc.l;
import q.t0;
import q1.f;
import q1.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f22348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f22349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22350h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f22351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f22352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k f22353k;

    public a(f fVar, long j10) {
        int i10;
        int i11;
        this.f22348f = fVar;
        this.f22349g = j10;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i10 = (int) (j10 >> 32)) < 0 || (i11 = (int) (4294967295L & j10)) < 0 || i10 > fVar.f17505a.getWidth() || i11 > fVar.f17505a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f22351i = j10;
        this.f22352j = 1.0f;
    }

    @Override // v1.b
    public final boolean b(float f10) {
        this.f22352j = f10;
        return true;
    }

    @Override // v1.b
    public final boolean e(k kVar) {
        this.f22353k = kVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f22348f, aVar.f22348f) && j.b(0L, 0L) && f3.l.b(this.f22349g, aVar.f22349g) && this.f22350h == aVar.f22350h;
    }

    @Override // v1.b
    public final long h() {
        return g.R(this.f22351i);
    }

    public final int hashCode() {
        int iHashCode = (((int) 0) + (this.f22348f.hashCode() * 31)) * 31;
        long j10 = this.f22349g;
        return ((((int) ((j10 >>> 32) ^ j10)) + iHashCode) * 31) + this.f22350h;
    }

    @Override // v1.b
    public final void i(l0 l0Var) {
        int iRound = Math.round(Float.intBitsToFloat((int) (l0Var.e() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (l0Var.e() & 4294967295L)));
        float f10 = this.f22352j;
        k kVar = this.f22353k;
        int i10 = this.f22350h;
        t0.k(l0Var, this.f22348f, this.f22349g, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f10, kVar, i10, 328);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f22348f);
        sb.append(", srcOffset=");
        sb.append((Object) j.e(0L));
        sb.append(", srcSize=");
        sb.append((Object) f3.l.c(this.f22349g));
        sb.append(", filterQuality=");
        int i10 = this.f22350h;
        sb.append((Object) (i10 == 0 ? "None" : i10 == 1 ? "Low" : i10 == 2 ? "Medium" : i10 == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
