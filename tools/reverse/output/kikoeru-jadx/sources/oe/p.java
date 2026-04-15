package oe;

import wd.j0;

/* JADX INFO: loaded from: classes.dex */
public final class p implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f16406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f16407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qe.q f16408d;

    public /* synthetic */ p(t tVar, j0 j0Var, qe.q qVar, int i10) {
        this.f16405a = i10;
        this.f16406b = tVar;
        this.f16407c = j0Var;
        this.f16408d = qVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f16405a) {
            case 0:
                t tVar = this.f16406b;
                re.l lVar = tVar.f16423a.f16390a.f16364a;
                p pVar = new p(tVar, this.f16407c, this.f16408d, 2);
                lVar.getClass();
                return new re.h(lVar, pVar);
            case 1:
                t tVar2 = this.f16406b;
                re.l lVar2 = tVar2.f16423a.f16390a.f16364a;
                p pVar2 = new p(tVar2, this.f16407c, this.f16408d, 3);
                lVar2.getClass();
                return new re.h(lVar2, pVar2);
            case 2:
                t tVar3 = this.f16406b;
                k kVar = tVar3.f16423a;
                w wVarA = tVar3.a(kVar.f16392c);
                jc.l.b(wVarA);
                a aVar = kVar.f16390a.f16368e;
                se.w wVarN = this.f16408d.n();
                jc.l.d(wVarN, "getReturnType(...)");
                return (ge.g) aVar.i(wVarA, this.f16407c, wVarN);
            default:
                t tVar4 = this.f16406b;
                k kVar2 = tVar4.f16423a;
                w wVarA2 = tVar4.a(kVar2.f16392c);
                jc.l.b(wVarA2);
                a aVar2 = kVar2.f16390a.f16368e;
                se.w wVarN2 = this.f16408d.n();
                jc.l.d(wVarN2, "getReturnType(...)");
                return (ge.g) aVar2.f(wVarA2, this.f16407c, wVarN2);
        }
    }
}
