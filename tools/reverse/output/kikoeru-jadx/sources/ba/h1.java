package ba;

import bg.d2;
import bg.e2;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i1 f2375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f2377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2378i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(i1 i1Var, int i10, String str, int i11, yb.c cVar, int i12) {
        super(2, cVar);
        this.f2374e = i12;
        this.f2375f = i1Var;
        this.f2376g = i10;
        this.f2377h = str;
        this.f2378i = i11;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f2374e) {
            case 0:
                return new h1(this.f2375f, this.f2376g, this.f2377h, this.f2378i, cVar, 0);
            default:
                return new h1(this.f2375f, this.f2376g, this.f2377h, this.f2378i, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f2374e) {
        }
        return ((h1) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) throws UnsupportedEncodingException {
        Object objB;
        ug.d0 d0VarF;
        String strN;
        Object objB2;
        ug.d0 d0VarF2;
        String strN2;
        int i10 = this.f2374e;
        int i11 = this.f2378i;
        String str = this.f2377h;
        int i12 = this.f2376g;
        i1 i1Var = this.f2375f;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                String str2 = ag.z.f369a;
                String strF = a9.i.f();
                e2 e2VarA = b0.a();
                bg.u uVarB = b0.b();
                boolean zC = b0.c();
                boolean z10 = i1Var.f2389d;
                jc.l.e(strF, "token");
                jc.l.e(str, "keyword");
                jc.l.e(e2VarA, "order");
                jc.l.e(uVarB, "sort");
                String str3 = ag.z.f369a + "/api/search/" + ag.z.g(str);
                jc.l.e(str3, "<this>");
                ug.s sVar = new ug.s();
                sVar.d(null, str3);
                ug.s sVarG = sVar.b().g();
                sVarG.a("order", e2VarA.name());
                sVarG.a("sort", uVarB.name());
                sVarG.a("page", String.valueOf(i12));
                sVarG.a("seed", String.valueOf(i11));
                sVarG.a("subtitle", String.valueOf(zC ? 1 : 0));
                ch.l lVarD = a0.c.D(sVarG.b().f21876h);
                lVarD.w("authorization", "Bearer ".concat(strF));
                if (z10) {
                    lVarD.p(ug.g.f21779n);
                }
                try {
                    d0VarF = ag.z.f370b.a(new b7.b1(lVarD)).f();
                    try {
                        ug.f0 f0Var = d0VarF.f21762g;
                        jc.l.b(f0Var);
                        strN = f0Var.n();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    objB = ub.a.b(th2);
                }
                if (d0VarF.f21759d != 200) {
                    throw new IllegalStateException(strN.toString());
                }
                xf.r rVar = ag.z.f371c;
                objB = rVar.a(strN, n7.e.A(rVar.f24989b, jc.z.a(d2.class)));
                d0VarF.close();
                return new ub.n(objB);
            default:
                ub.a.f(obj);
                String str4 = ag.z.f369a;
                String strF2 = a9.i.f();
                e2 e2VarA2 = b0.a();
                bg.u uVarB2 = b0.b();
                boolean zC2 = b0.c();
                boolean z11 = i1Var.f2389d;
                jc.l.e(strF2, "token");
                jc.l.e(str, "keyword");
                jc.l.e(e2VarA2, "order");
                jc.l.e(uVarB2, "sort");
                String strConcat = ag.z.f369a.concat("/api/search/");
                jc.l.e(strConcat, "<this>");
                ug.s sVar2 = new ug.s();
                sVar2.d(null, strConcat);
                ug.s sVarG2 = sVar2.b().g();
                sVarG2.a("order", e2VarA2.name());
                sVarG2.a("sort", uVarB2.name());
                sVarG2.a("page", String.valueOf(i12));
                sVarG2.a("seed", String.valueOf(i11));
                sVarG2.a("subtitle", String.valueOf(zC2 ? 1 : 0));
                sVarG2.a("keyword", str);
                ch.l lVarD2 = a0.c.D(sVarG2.b().f21876h);
                lVarD2.w("authorization", "Bearer ".concat(strF2));
                if (z11) {
                    lVarD2.p(ug.g.f21779n);
                }
                try {
                    d0VarF2 = ag.z.f370b.a(new b7.b1(lVarD2)).f();
                    try {
                        ug.f0 f0Var2 = d0VarF2.f21762g;
                        jc.l.b(f0Var2);
                        strN2 = f0Var2.n();
                    } finally {
                    }
                } catch (Throwable th3) {
                    objB2 = ub.a.b(th3);
                }
                if (d0VarF2.f21759d != 200) {
                    throw new IllegalStateException(strN2.toString());
                }
                xf.r rVar2 = ag.z.f371c;
                objB2 = rVar2.a(strN2, n7.e.A(rVar2.f24989b, jc.z.a(d2.class)));
                d0VarF2.close();
                return new ub.n(objB2);
        }
    }
}
