package e3;

import ub.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6066a;

    public c(long j10) {
        this.f6066a = j10;
        if (j10 != 16) {
            return;
        }
        z2.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // e3.o
    public final float a() {
        return q1.q.d(this.f6066a);
    }

    @Override // e3.o
    public final long b() {
        return this.f6066a;
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
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && q1.q.c(this.f6066a, ((c) obj).f6066a);
    }

    public final int hashCode() {
        int i10 = q1.q.f17576i;
        return v.a(this.f6066a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) q1.q.i(this.f6066a)) + ')';
    }
}
