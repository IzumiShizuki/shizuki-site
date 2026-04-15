package td;

import bd.a0;
import se.w;
import se.w0;

/* JADX INFO: loaded from: classes.dex */
public final class n implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f20701b = new n(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f20702c = new n(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f20703d = new n(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f20704e = new n(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20705a;

    public /* synthetic */ n(int i10) {
        this.f20705a = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f20705a) {
            case 0:
                yc.c cVar = (yc.c) obj;
                jc.l.e(cVar, "it");
                a0 a0VarV0 = cVar.v0();
                jc.l.b(a0VarV0);
                return a0VarV0.b();
            case 1:
                yc.c cVar2 = (yc.c) obj;
                jc.l.e(cVar2, "it");
                w wVarN = cVar2.n();
                jc.l.b(wVarN);
                return wVarN;
            case 2:
                w0 w0Var = (w0) obj;
                jc.l.e(w0Var, "it");
                return Boolean.valueOf(w0Var instanceof qd.h);
            case 3:
                yc.h hVarH = ((w0) obj).t().h();
                if (hVarH == null) {
                    return Boolean.FALSE;
                }
                be.e name = hVarH.getName();
                be.c cVar3 = xc.d.f24910f;
                return Boolean.valueOf(jc.l.a(name, cVar3.f2744a.g()) && jc.l.a(ie.d.c(hVarH), cVar3));
            default:
                o oVar = (o) obj;
                jc.l.e(oVar, "$this$function");
                String strConcat = "java/util/".concat("Spliterator");
                d dVar = l.f20694b;
                oVar.b(strConcat, dVar, dVar);
                return ub.a0.f21526a;
        }
    }
}
