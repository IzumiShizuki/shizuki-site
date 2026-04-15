package od;

import b0.w1;
import d9.i;
import df.k;
import df.m;
import df.n;
import df.r;
import java.util.Iterator;
import jc.l;
import re.j;
import zc.h;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f16341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sd.b f16342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f16344d;

    public c(w1 w1Var, sd.b bVar, boolean z10) {
        l.e(w1Var, "c");
        l.e(bVar, "annotationOwner");
        this.f16341a = w1Var;
        this.f16342b = bVar;
        this.f16343c = z10;
        this.f16344d = ((re.l) ((a) w1Var.f1395c).f16315a).c(new bd.a(12, this));
    }

    @Override // zc.h
    public final zc.b e(be.c cVar) {
        zc.b bVar;
        l.e(cVar, "fqName");
        sd.b bVar2 = this.f16342b;
        ed.e eVarA = bVar2.a(cVar);
        if (eVarA != null && (bVar = (zc.b) this.f16344d.a(eVarA)) != null) {
            return bVar;
        }
        be.e eVar = md.c.f15105a;
        return md.c.a(cVar, bVar2, this.f16341a);
    }

    @Override // zc.h
    public final /* bridge */ boolean f(be.c cVar) {
        return ua.j.m(this, cVar);
    }

    @Override // zc.h
    public final boolean isEmpty() {
        return this.f16342b.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        sd.b bVar = this.f16342b;
        r rVarE0 = m.e0(vb.m.R(bVar.getAnnotations()), this.f16344d);
        be.e eVar = md.c.f15105a;
        return new df.e(new df.h(m.Z(vb.l.d0(new k[]{rVarE0, new n(1, md.c.a(vc.n.f22884m, bVar, this.f16341a))})), false, new i(10)));
    }
}
