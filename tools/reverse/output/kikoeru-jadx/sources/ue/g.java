package ue;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import le.o;
import q.t0;
import vb.r;
import vb.t;
import yc.m0;
import yc.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class g implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21620b;

    public g(h hVar, String... strArr) {
        jc.l.e(strArr, "formatParams");
        String str = hVar.f21627a;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f21620b = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // le.q
    public yc.h a(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        jc.l.e(bVar, "location");
        return new a(be.e.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{eVar}, 1))));
    }

    @Override // le.o
    public Set c() {
        return t.f22821a;
    }

    @Override // le.o
    public Set d() {
        return t.f22821a;
    }

    @Override // le.q
    public Collection e(le.f fVar, ic.k kVar) {
        jc.l.e(fVar, "kindFilter");
        return r.f22819a;
    }

    @Override // le.o
    public Set g() {
        return t.f22821a;
    }

    @Override // le.o
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set f(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        a aVar = l.f21666c;
        jc.l.e(aVar, "containingDeclaration");
        c cVar = new c(aVar, null, zc.g.f26696a, be.e.g("<Error function>"), 1, m0.p0);
        i iVarC = l.c(k.RETURN_TYPE_FOR_FUNCTION, new String[0]);
        x xVar = x.f26157d;
        ld.o oVar = yc.o.f26129e;
        r rVar = r.f22819a;
        cVar.I1(null, null, rVar, rVar, rVar, iVarC, xVar, oVar);
        return ud.e.X(cVar);
    }

    @Override // le.o
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set b(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        return l.f21669f;
    }

    public String toString() {
        return t0.E(new StringBuilder("ErrorScope{"), this.f21620b, '}');
    }
}
