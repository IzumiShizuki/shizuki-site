package le;

import bd.s0;
import java.util.Collection;
import java.util.List;
import jc.a0;
import jc.z;
import n7.b0;
import pc.u;
import q.t0;
import yc.k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ u[] f12339f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qe.h f12340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final re.i f12342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final re.i f12343e;

    static {
        jc.s sVar = new jc.s(s.class, "functions", "getFunctions()Ljava/util/List;", 0);
        a0 a0Var = z.f10839a;
        f12339f = new u[]{a0Var.g(sVar), t0.H(s.class, "properties", "getProperties()Ljava/util/List;", 0, a0Var)};
    }

    public s(re.l lVar, qe.h hVar, boolean z10) {
        jc.l.e(lVar, "storageManager");
        this.f12340b = hVar;
        this.f12341c = z10;
        this.f12342d = new re.i(lVar, new r(this, 0));
        this.f12343e = new re.i(lVar, new r(this, 1));
    }

    @Override // le.p, le.q
    public final yc.h a(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        jc.l.e(bVar, "location");
        return null;
    }

    @Override // le.p, le.o
    public final Collection b(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        List list = (List) b0.r(this.f12343e, f12339f[1]);
        bf.g gVar = new bf.g();
        for (Object obj : list) {
            if (jc.l.a(((k0) obj).getName(), eVar)) {
                gVar.add(obj);
            }
        }
        return gVar;
    }

    @Override // le.p, le.q
    public final Collection e(f fVar, ic.k kVar) {
        jc.l.e(fVar, "kindFilter");
        u[] uVarArr = f12339f;
        return vb.m.q0((List) b0.r(this.f12342d, uVarArr[0]), (List) b0.r(this.f12343e, uVarArr[1]));
    }

    @Override // le.p, le.o
    public final Collection f(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        List list = (List) b0.r(this.f12342d, f12339f[0]);
        bf.g gVar = new bf.g();
        for (Object obj : list) {
            if (jc.l.a(((s0) obj).getName(), eVar)) {
                gVar.add(obj);
            }
        }
        return gVar;
    }
}
