package ge;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import se.h0;
import se.k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f7532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ub.p f7533b;

    public n(Set set) {
        h0.f19950b.getClass();
        h0 h0Var = h0.f19951c;
        jc.l.e(h0Var, "attributes");
        se.c.w(vb.r.f22819a, ue.l.a(ue.h.f21622c, true, "unknown integer literal type"), h0Var, this, false);
        this.f7533b = ub.a.d(new l());
        this.f7532a = set;
    }

    @Override // se.k0
    public final vc.i g() {
        throw null;
    }

    @Override // se.k0
    public final yc.h h() {
        return null;
    }

    @Override // se.k0
    public final Collection i() {
        return (List) this.f7533b.getValue();
    }

    @Override // se.k0
    public final boolean j() {
        return false;
    }

    @Override // se.k0
    public final List o() {
        return vb.r.f22819a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegerLiteralType");
        sb.append("[" + vb.m.f0(this.f7532a, ",", null, null, m.f7531a, 30) + ']');
        return sb.toString();
    }
}
