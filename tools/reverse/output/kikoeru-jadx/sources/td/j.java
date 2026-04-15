package td;

import ub.a0;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20690c;

    public /* synthetic */ j(int i10, String str, String str2) {
        this.f20688a = i10;
        this.f20689b = str;
        this.f20690c = str2;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f20688a;
        a0 a0Var = a0.f21526a;
        String str = this.f20690c;
        String str2 = this.f20689b;
        o oVar = (o) obj;
        switch (i10) {
            case 0:
                jc.l.e(oVar, "$this$function");
                d dVar = l.f20694b;
                oVar.a(str2, dVar);
                d dVar2 = l.f20693a;
                oVar.a(str, dVar, dVar, dVar2, dVar2);
                oVar.b(str2, dVar2);
                break;
            case 1:
                jc.l.e(oVar, "$this$function");
                d dVar3 = l.f20694b;
                oVar.a(str2, dVar3);
                oVar.a(str, dVar3, dVar3, dVar3);
                oVar.b(str2, dVar3);
                break;
            case 2:
                jc.l.e(oVar, "$this$function");
                d dVar4 = l.f20694b;
                oVar.a(str2, dVar4);
                d dVar5 = l.f20693a;
                oVar.a(str, dVar4, dVar4, l.f20695c, dVar5);
                oVar.b(str2, dVar5);
                break;
            case 3:
                jc.l.e(oVar, "$this$function");
                d dVar6 = l.f20694b;
                oVar.a(str2, dVar6);
                d dVar7 = l.f20695c;
                oVar.a(str2, dVar7);
                d dVar8 = l.f20693a;
                oVar.a(str, dVar6, dVar7, dVar7, dVar8);
                oVar.b(str2, dVar8);
                break;
            case 4:
                jc.l.e(oVar, "$this$function");
                d dVar9 = l.f20695c;
                oVar.a(str2, dVar9);
                oVar.b(str, l.f20694b, dVar9);
                break;
            default:
                jc.l.e(oVar, "$this$function");
                oVar.a(str2, l.f20693a);
                oVar.b(str, l.f20694b, l.f20695c);
                break;
        }
        return a0Var;
    }
}
