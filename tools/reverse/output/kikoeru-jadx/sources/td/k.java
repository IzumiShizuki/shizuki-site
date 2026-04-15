package td;

import ub.a0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20692b;

    public /* synthetic */ k(int i10, String str) {
        this.f20691a = i10;
        this.f20692b = str;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f20691a;
        a0 a0Var = a0.f21526a;
        String str = this.f20692b;
        o oVar = (o) obj;
        switch (i10) {
            case 0:
                jc.l.e(oVar, "$this$function");
                oVar.b(str, l.f20694b);
                break;
            case 1:
                jc.l.e(oVar, "$this$function");
                d dVar = l.f20694b;
                oVar.b(str, dVar, dVar);
                break;
            case 2:
                jc.l.e(oVar, "$this$function");
                d dVar2 = l.f20694b;
                oVar.a(str, dVar2, dVar2);
                break;
            case 3:
                jc.l.e(oVar, "$this$function");
                oVar.a(str, l.f20694b);
                break;
            case 4:
                jc.l.e(oVar, "$this$function");
                oVar.a(str, l.f20694b);
                break;
            case 5:
                jc.l.e(oVar, "$this$function");
                oVar.b(str, l.f20694b);
                break;
            default:
                jc.l.e(oVar, "$this$function");
                oVar.b(str, l.f20694b);
                break;
        }
        return a0Var;
    }
}
