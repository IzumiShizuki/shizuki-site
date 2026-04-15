package be;

import ef.n;
import ef.u;
import jc.l;
import pc.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f2740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f2741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2742c;

    public b(c cVar, c cVar2, boolean z10) {
        l.e(cVar, "packageFqName");
        l.e(cVar2, "relativeClassName");
        this.f2740a = cVar;
        this.f2741b = cVar2;
        this.f2742c = z10;
        cVar2.f2744a.c();
    }

    public static final String c(c cVar) {
        String str = cVar.f2744a.f2747a;
        return n.o0(str, '/') ? a0.c.G('`', "`", str) : str;
    }

    public final c a() {
        c cVar = this.f2740a;
        boolean zC = cVar.f2744a.c();
        c cVar2 = this.f2741b;
        if (zC) {
            return cVar2;
        }
        return new c(cVar.f2744a.f2747a + '.' + cVar2.f2744a.f2747a);
    }

    public final String b() {
        c cVar = this.f2740a;
        boolean zC = cVar.f2744a.c();
        c cVar2 = this.f2741b;
        if (zC) {
            return c(cVar2);
        }
        return u.i0(cVar.f2744a.f2747a, '.', '/') + "/" + c(cVar2);
    }

    public final b d(e eVar) {
        l.e(eVar, "name");
        return new b(this.f2740a, this.f2741b.a(eVar), this.f2742c);
    }

    public final b e() {
        c cVarB = this.f2741b.b();
        if (cVarB.f2744a.c()) {
            return null;
        }
        return new b(this.f2740a, cVarB, this.f2742c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f2740a, bVar.f2740a) && l.a(this.f2741b, bVar.f2741b) && this.f2742c == bVar.f2742c;
    }

    public final e f() {
        return this.f2741b.f2744a.g();
    }

    public final boolean g() {
        return !this.f2741b.b().f2744a.c();
    }

    public final int hashCode() {
        return ((this.f2741b.hashCode() + (this.f2740a.hashCode() * 31)) * 31) + (this.f2742c ? 1231 : 1237);
    }

    public final String toString() {
        if (!this.f2740a.f2744a.c()) {
            return b();
        }
        return "/" + b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(c cVar, e eVar) {
        this(cVar, f0.U(eVar), false);
        l.e(cVar, "packageFqName");
        l.e(eVar, "topLevelName");
        c cVar2 = c.f2743c;
    }
}
