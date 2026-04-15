package pd;

import yc.k0;

/* JADX INFO: loaded from: classes.dex */
public final class w implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f17083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ed.u f17084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jc.y f17085d;

    public /* synthetic */ w(z zVar, ed.u uVar, jc.y yVar, int i10) {
        this.f17082a = i10;
        this.f17083b = zVar;
        this.f17084c = uVar;
        this.f17085d = yVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f17082a) {
            case 0:
                z zVar = this.f17083b;
                re.o oVar = ((od.a) zVar.f17093b.f1395c).f16315a;
                w wVar = new w(zVar, this.f17084c, this.f17085d, 1);
                re.l lVar = (re.l) oVar;
                lVar.getClass();
                return new re.h(lVar, wVar);
            default:
                md.h hVar = ((od.a) this.f17083b.f17093b.f1395c).f16322h;
                k0 k0Var = (k0) this.f17085d.f10838a;
                hVar.getClass();
                jc.l.e(this.f17084c, "field");
                jc.l.e(k0Var, "descriptor");
                return null;
        }
    }
}
