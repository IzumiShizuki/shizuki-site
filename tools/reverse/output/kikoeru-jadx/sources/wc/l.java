package wc;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f23511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23512b;

    public l(k kVar, int i10) {
        this.f23511a = kVar;
        this.f23512b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return jc.l.a(this.f23511a, lVar.f23511a) && this.f23512b == lVar.f23512b;
    }

    public final int hashCode() {
        return (this.f23511a.hashCode() * 31) + this.f23512b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KindWithArity(kind=");
        sb.append(this.f23511a);
        sb.append(", arity=");
        return h0.m(sb, this.f23512b, ')');
    }
}
