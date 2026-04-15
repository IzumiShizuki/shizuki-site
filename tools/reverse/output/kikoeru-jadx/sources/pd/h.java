package pd;

import b0.w1;
import java.util.List;
import yc.n0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends se.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17021c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final re.i f17022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bd.c f17023e;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(i iVar) {
        this.f17023e = iVar;
        w1 w1Var = iVar.f17027j;
        super(((od.a) w1Var.f1395c).f16315a);
        re.o oVar = ((od.a) w1Var.f1395c).f16315a;
        g gVar = new g(iVar, 2);
        re.l lVar = (re.l) oVar;
        lVar.getClass();
        this.f17022d = new re.i(lVar, gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d7  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Collection] */
    @Override // se.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection b() {
        /*
            Method dump skipped, instruction units count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.h.b():java.util.Collection");
    }

    @Override // se.f
    public final n0 d() {
        switch (this.f17021c) {
            case 0:
                return ((od.a) ((i) this.f17023e).f17027j.f1395c).f16327m;
            default:
                return n0.f26123c;
        }
    }

    @Override // se.b, se.k0
    public final yc.h h() {
        switch (this.f17021c) {
            case 0:
                return (i) this.f17023e;
            default:
                return (qe.h) this.f17023e;
        }
    }

    @Override // se.k0
    public final boolean j() {
        switch (this.f17021c) {
        }
        return true;
    }

    @Override // se.b
    /* JADX INFO: renamed from: m */
    public final yc.e h() {
        switch (this.f17021c) {
            case 0:
                return (i) this.f17023e;
            default:
                return (qe.h) this.f17023e;
        }
    }

    @Override // se.k0
    public final List o() {
        switch (this.f17021c) {
        }
        return (List) this.f17022d.b();
    }

    public final String toString() {
        switch (this.f17021c) {
            case 0:
                String strB = ((i) this.f17023e).getName().b();
                jc.l.d(strB, "asString(...)");
                return strB;
            default:
                String str = ((qe.h) this.f17023e).getName().f2751a;
                jc.l.d(str, "toString(...)");
                return str;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(qe.h hVar) {
        this.f17023e = hVar;
        oe.k kVar = hVar.f18177l;
        super(kVar.f16390a.f16364a);
        re.l lVar = kVar.f16390a.f16364a;
        qe.d dVar = new qe.d(hVar, 6);
        lVar.getClass();
        this.f17022d = new re.i(lVar, dVar);
    }
}
