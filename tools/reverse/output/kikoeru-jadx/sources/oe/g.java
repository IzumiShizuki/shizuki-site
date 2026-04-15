package oe;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f16360c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f16361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re.j f16362b;

    static {
        be.c cVarI = vc.n.f22869c.i();
        f16360c = ud.e.X(new be.b(cVarI.b(), cVarI.f2744a.g()));
    }

    public g(i iVar) {
        this.f16361a = iVar;
        this.f16362b = iVar.f16364a.c(new bd.a(15, this));
    }

    public final yc.e a(be.b bVar, d dVar) {
        jc.l.e(bVar, "classId");
        return (yc.e) this.f16362b.a(new f(bVar, dVar));
    }
}
