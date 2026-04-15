package pe;

import b0.w1;
import bd.e;
import bd.j0;
import le.o;
import oe.b0;
import oe.i;
import qe.p;
import re.l;
import wd.f0;
import wd.h0;
import wd.n0;
import wd.o0;
import yc.d0;
import yc.y;
import yd.g;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends j0 implements d0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xd.a f17105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f17106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w1 f17107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h0 f17108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p f17109k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(be.c cVar, l lVar, y yVar, h0 h0Var, xd.a aVar) {
        super(yVar, cVar);
        jc.l.e(cVar, "fqName");
        jc.l.e(yVar, "module");
        this.f17105g = aVar;
        o0 o0Var = h0Var.f23716d;
        jc.l.d(o0Var, "getStrings(...)");
        n0 n0Var = h0Var.f23717e;
        jc.l.d(n0Var, "getQualifiedNames(...)");
        g gVar = new g(o0Var, n0Var);
        this.f17106h = gVar;
        this.f17107i = new w1(h0Var, gVar, aVar, new b0(this));
        this.f17108j = h0Var;
    }

    public final void E1(i iVar) {
        jc.l.e(iVar, "components");
        h0 h0Var = this.f17108j;
        if (h0Var == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f17108j = null;
        f0 f0Var = h0Var.f23718f;
        jc.l.d(f0Var, "getPackage(...)");
        this.f17109k = new p(this, f0Var, this.f17106h, this.f17105g, null, iVar, "scope of " + this, new e(12, this));
    }

    @Override // yc.d0
    public final o n0() {
        p pVar = this.f17109k;
        if (pVar != null) {
            return pVar;
        }
        jc.l.k("_memberScope");
        throw null;
    }

    @Override // bd.j0, bd.p
    public final String toString() {
        return "builtins package fragment for " + this.f2596e + " from " + ie.d.j(this);
    }
}
