package ge;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class b extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.k f7523b;

    public b(List list, ic.k kVar) {
        super(list);
        this.f7523b = kVar;
    }

    @Override // ge.g
    public final se.w a(yc.y yVar) {
        yc.h hVarH;
        jc.l.e(yVar, "module");
        se.w wVar = (se.w) this.f7523b.a(yVar);
        if (!vc.i.y(wVar) && (((hVarH = wVar.t().h()) == null || vc.i.r(hVarH) == null) && !vc.i.B(wVar, vc.n.W.f2744a) && !vc.i.B(wVar, vc.n.X.f2744a) && !vc.i.B(wVar, vc.n.Y.f2744a))) {
            vc.i.B(wVar, vc.n.Z.f2744a);
        }
        return wVar;
    }
}
