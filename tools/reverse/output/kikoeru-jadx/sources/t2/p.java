package t2;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f20377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f20382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f20383g;

    public p(a aVar, int i10, int i11, int i12, int i13, float f10, float f11) {
        this.f20377a = aVar;
        this.f20378b = i10;
        this.f20379c = i11;
        this.f20380d = i12;
        this.f20381e = i13;
        this.f20382f = f10;
        this.f20383g = f11;
    }

    public final p1.c a(p1.c cVar) {
        return cVar.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f20382f)) & 4294967295L));
    }

    public final long b(long j10, boolean z10) {
        if (z10) {
            long j11 = k0.f20356b;
            if (k0.a(j10, j11)) {
                return j11;
            }
        }
        int i10 = k0.f20357c;
        int i11 = (int) (j10 >> 32);
        int i12 = this.f20378b;
        return c0.b(i11 + i12, ((int) (j10 & 4294967295L)) + i12);
    }

    public final p1.c c(p1.c cVar) {
        float f10 = -this.f20382f;
        return cVar.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L));
    }

    public final int d(int i10) {
        int i11 = this.f20379c;
        int i12 = this.f20378b;
        return nh.b.k(i10, i12, i11) - i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f20377a.equals(pVar.f20377a) && this.f20378b == pVar.f20378b && this.f20379c == pVar.f20379c && this.f20380d == pVar.f20380d && this.f20381e == pVar.f20381e && Float.compare(this.f20382f, pVar.f20382f) == 0 && Float.compare(this.f20383g, pVar.f20383g) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f20383g) + t0.x(this.f20382f, ((((((((this.f20377a.hashCode() * 31) + this.f20378b) * 31) + this.f20379c) * 31) + this.f20380d) * 31) + this.f20381e) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f20377a);
        sb.append(", startIndex=");
        sb.append(this.f20378b);
        sb.append(", endIndex=");
        sb.append(this.f20379c);
        sb.append(", startLineIndex=");
        sb.append(this.f20380d);
        sb.append(", endLineIndex=");
        sb.append(this.f20381e);
        sb.append(", top=");
        sb.append(this.f20382f);
        sb.append(", bottom=");
        return j2.h0.l(sb, this.f20383g, ')');
    }
}
