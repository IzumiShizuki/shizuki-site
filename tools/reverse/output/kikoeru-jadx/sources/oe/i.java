package oe;

import b0.w1;
import bd.f0;
import i7.p2;
import java.util.List;
import java.util.Set;
import yc.g0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final re.l f16364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yc.y f16365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f16366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f16367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f16368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0 f16369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f16370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f16371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gd.a f16372i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f16373j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Iterable f16374k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w1 f16375l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f16376m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ad.b f16377n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ad.d f16378o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ce.i f16379p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final te.k f16380q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f16381r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f16382s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f16383t;

    public i(re.l lVar, yc.y yVar, e eVar, a aVar, g0 g0Var, m mVar, n nVar, Iterable iterable, w1 w1Var, ad.b bVar, ad.d dVar, ce.i iVar, te.k kVar, g5.w wVar, List list, l lVar2) {
        j jVar = j.f16384b;
        j jVar2 = j.f16388f;
        jc.l.e(yVar, "moduleDescriptor");
        jc.l.e(iVar, "extensionRegistryLite");
        jc.l.e(kVar, "kotlinTypeChecker");
        jc.l.e(lVar2, "enumEntriesDeserializationSupport");
        this.f16364a = lVar;
        this.f16365b = yVar;
        this.f16366c = jVar;
        this.f16367d = eVar;
        this.f16368e = aVar;
        this.f16369f = g0Var;
        this.f16370g = jVar2;
        this.f16371h = mVar;
        this.f16372i = gd.a.f7513a;
        this.f16373j = nVar;
        this.f16374k = iterable;
        this.f16375l = w1Var;
        this.f16376m = h.f16363a;
        this.f16377n = bVar;
        this.f16378o = dVar;
        this.f16379p = iVar;
        this.f16380q = kVar;
        this.f16381r = list;
        this.f16382s = lVar2;
        this.f16383t = new g(this);
    }

    public final k a(yc.d0 d0Var, yd.f fVar, f0 f0Var, yd.i iVar, yd.a aVar, qe.j jVar) {
        jc.l.e(fVar, "nameResolver");
        jc.l.e(aVar, "metadataVersion");
        return new k(this, fVar, d0Var, f0Var, iVar, aVar, jVar, null, vb.r.f22819a);
    }

    public final yc.e b(be.b bVar) {
        jc.l.e(bVar, "classId");
        Set set = g.f16360c;
        return this.f16383t.a(bVar, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(re.l lVar, yc.y yVar, p2 p2Var, m0.w wVar, g0 g0Var, Iterable iterable, w1 w1Var, ad.b bVar, ad.d dVar, ce.i iVar, te.k kVar, g5.w wVar2, int i10) {
        te.k kVar2;
        j jVar = j.f16386d;
        j jVar2 = j.f16387e;
        if ((i10 & 65536) != 0) {
            te.k.f20742b.getClass();
            kVar2 = te.j.f20741b;
        } else {
            kVar2 = kVar;
        }
        this(lVar, yVar, p2Var, wVar, g0Var, m.f16399m0, jVar, iterable, w1Var, bVar, dVar, iVar, kVar2, wVar2, ud.b.w(se.k.f19967a), (i10 & 524288) != 0 ? j.f16385c : jVar2);
    }
}
