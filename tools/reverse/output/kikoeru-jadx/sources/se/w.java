package se;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class w implements zc.a, ve.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20000a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (u() == wVar.u()) {
            return c.A(te.e.f20726b, x(), wVar.x());
        }
        return false;
    }

    @Override // zc.a
    public final zc.h getAnnotations() {
        return h.a(r());
    }

    public final int hashCode() {
        int iHashCode;
        int i10 = this.f20000a;
        if (i10 != 0) {
            return i10;
        }
        if (c.l(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (u() ? 1 : 0) + ((q().hashCode() + (t().hashCode() * 31)) * 31);
        }
        this.f20000a = iHashCode;
        return iHashCode;
    }

    public abstract le.o n0();

    public abstract List q();

    public abstract h0 r();

    public abstract k0 t();

    public abstract boolean u();

    public abstract w v(te.f fVar);

    public abstract w0 x();
}
