package jc;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class t extends d implements pc.u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10833g;

    public t(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f10833g = (i10 & 2) == 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            return i().equals(tVar.i()) && this.f10821d.equals(tVar.f10821d) && this.f10822e.equals(tVar.f10822e) && l.a(this.f10819b, tVar.f10819b);
        }
        if (obj instanceof pc.u) {
            return obj.equals(f());
        }
        return false;
    }

    @Override // jc.d
    public final pc.b f() {
        return this.f10833g ? this : super.f();
    }

    public final int hashCode() {
        return this.f10822e.hashCode() + h0.e(i().hashCode() * 31, 31, this.f10821d);
    }

    @Override // jc.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final pc.u j() {
        if (this.f10833g) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        pc.b bVarF = f();
        if (bVarF != this) {
            return (pc.u) bVarF;
        }
        throw new hc.a();
    }

    public final String toString() {
        pc.b bVarF = f();
        return bVarF != this ? bVarF.toString() : h0.n(new StringBuilder("property "), this.f10821d, " (Kotlin reflection is not available)");
    }
}
