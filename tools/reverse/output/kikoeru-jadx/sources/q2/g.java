package q2;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f17597d = new g(0.0f, new oc.a(0.0f, 0.0f), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oc.a f17599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17600c;

    public g(float f10, oc.a aVar, int i10) {
        this.f17598a = f10;
        this.f17599b = aVar;
        this.f17600c = i10;
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final oc.a a() {
        return this.f17599b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f17598a == gVar.f17598a && jc.l.a(this.f17599b, gVar.f17599b) && this.f17600c == gVar.f17600c;
    }

    public final int hashCode() {
        return ((this.f17599b.hashCode() + (Float.floatToIntBits(this.f17598a) * 31)) * 31) + this.f17600c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.f17598a);
        sb.append(", range=");
        sb.append(this.f17599b);
        sb.append(", steps=");
        return h0.m(sb, this.f17600c, ')');
    }
}
