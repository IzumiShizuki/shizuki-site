package ba;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2336e;

    public /* synthetic */ e(bg.d dVar, q9.o oVar, bg.p pVar, x0.w0 w0Var) {
        this.f2332a = 3;
        this.f2333b = dVar;
        this.f2335d = oVar;
        this.f2336e = pVar;
        this.f2334c = w0Var;
    }

    @Override // ic.a
    public final Object b() {
        int i10 = this.f2332a;
        ub.a0 a0Var = ub.a0.f21526a;
        Object obj = this.f2335d;
        Object obj2 = this.f2336e;
        Object obj3 = this.f2334c;
        Object obj4 = this.f2333b;
        switch (i10) {
            case 0:
                hf.y yVar = (hf.y) obj4;
                x0.w0 w0Var = (x0.w0) obj3;
                x0.w0 w0Var2 = (x0.w0) obj;
                o1.i iVar = (o1.i) obj2;
                if (!((Boolean) w0Var2.getValue()).booleanValue()) {
                    w0Var.setValue(Boolean.valueOf(!((Boolean) w0Var.getValue()).booleanValue()));
                } else {
                    hf.a0.y(yVar, null, null, new b0.x(iVar, w0Var, w0Var2, null, 1), 3);
                }
                break;
            case 1:
                hf.a0.y((hf.y) obj4, null, null, new b0.x((jc.y) obj3, (m9.c) obj, (ic.a) obj2, null, 25), 3);
                break;
            case 2:
                ((fg.f) obj2).setValue((bg.u) obj4);
                ((q9.o) obj3).w((bg.p) obj, true);
                break;
            case 3:
                ((x0.w0) obj3).setValue((bg.d) obj4);
                ((q9.o) obj).w((bg.p) obj2, true);
                break;
            case 4:
                ((fg.f) obj2).setValue((bg.p0) obj4);
                ((q9.o) obj3).w((bg.p) obj, true);
                break;
            case 5:
                x0.w0 w0Var3 = (x0.w0) obj;
                ((x0.w0) obj3).setValue(Boolean.FALSE);
                ((ic.k) obj4).a(vb.m.G0((List) w0Var3.getValue()));
                ((x0.w0) obj2).setValue("");
                w0Var3.setValue(vb.r.f22819a);
                break;
            case 6:
                t9.g gVar = (t9.g) obj4;
                String strName = ((t9.a) ((x0.w0) obj).getValue()).name();
                String str = (String) ((x0.w0) obj2).getValue();
                gVar.getClass();
                jc.l.e(strName, "type");
                jc.l.e(str, "value");
                k4.a aVarH = androidx.lifecycle.m0.h(gVar);
                pf.e eVar = hf.l0.f8566a;
                hf.a0.y(aVarH, pf.d.f17138c, null, new androidx.lifecycle.r(strName, str, null, 14), 2);
                ((x0.w0) obj3).setValue(Boolean.FALSE);
                break;
            case 7:
                x0.w0 w0Var4 = (x0.w0) obj3;
                w0Var4.setValue((String) ((Map.Entry) obj4).getKey());
                ((hg.b) obj2).e((String) w0Var4.getValue(), z8.c.f26521a[0]);
                ((x0.w0) obj).setValue(Boolean.FALSE);
                break;
            default:
                x0.w0 w0Var5 = (x0.w0) obj3;
                ((hg.b) obj2).e((String) w0Var5.getValue(), z8.e.f26537a[0]);
                ((ic.k) obj4).a((String) w0Var5.getValue());
                ((x0.w0) obj).setValue(Boolean.FALSE);
                break;
        }
        return a0Var;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f2332a = i10;
        this.f2333b = obj;
        this.f2334c = obj2;
        this.f2335d = obj3;
        this.f2336e = obj4;
    }

    public /* synthetic */ e(Object obj, x0.w0 w0Var, hg.b bVar, x0.w0 w0Var2, int i10) {
        this.f2332a = i10;
        this.f2333b = obj;
        this.f2334c = w0Var;
        this.f2336e = bVar;
        this.f2335d = w0Var2;
    }

    public /* synthetic */ e(x0.w0 w0Var, ic.k kVar, x0.w0 w0Var2, x0.w0 w0Var3) {
        this.f2332a = 5;
        this.f2334c = w0Var;
        this.f2333b = kVar;
        this.f2335d = w0Var2;
        this.f2336e = w0Var3;
    }
}
