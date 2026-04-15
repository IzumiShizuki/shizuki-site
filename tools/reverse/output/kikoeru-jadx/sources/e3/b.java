package e3;

import j2.h0;
import q1.j0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f6064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6065b;

    public b(j0 j0Var, float f10) {
        this.f6064a = j0Var;
        this.f6065b = f10;
    }

    @Override // e3.o
    public final float a() {
        return this.f6065b;
    }

    @Override // e3.o
    public final long b() {
        int i10 = q1.q.f17576i;
        return q1.q.f17575h;
    }

    @Override // e3.o
    public final o c(ic.a aVar) {
        return !equals(n.f6087a) ? this : (o) aVar.b();
    }

    @Override // e3.o
    public final /* synthetic */ o d(o oVar) {
        return a0.c.h(this, oVar);
    }

    @Override // e3.o
    public final q1.m e() {
        return this.f6064a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return jc.l.a(this.f6064a, bVar.f6064a) && Float.compare(this.f6065b, bVar.f6065b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6065b) + (this.f6064a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f6064a);
        sb.append(", alpha=");
        return h0.l(sb, this.f6065b, ')');
    }
}
