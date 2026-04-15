package m9;

import hf.l0;
import hf.y;
import ub.a0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0 f15039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f15040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ic.a f15041i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w0 f15042j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w0 f15043k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w0 f15044l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(w0 w0Var, c cVar, ic.a aVar, w0 w0Var2, w0 w0Var3, w0 w0Var4, yb.c cVar2, int i10) {
        super(2, cVar2);
        this.f15037e = i10;
        this.f15039g = w0Var;
        this.f15040h = cVar;
        this.f15041i = aVar;
        this.f15042j = w0Var2;
        this.f15043k = w0Var3;
        this.f15044l = w0Var4;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f15037e) {
            case 0:
                return new m(this.f15039g, this.f15040h, this.f15041i, this.f15042j, this.f15043k, this.f15044l, cVar, 0);
            default:
                return new m(this.f15039g, this.f15040h, this.f15041i, this.f15042j, this.f15043k, this.f15044l, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        y yVar = (y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f15037e) {
        }
        return ((m) o(yVar, cVar)).u(a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) throws Throwable {
        int i10 = this.f15037e;
        w0 w0Var = this.f15044l;
        w0 w0Var2 = this.f15043k;
        w0 w0Var3 = this.f15042j;
        zb.a aVar = zb.a.f26667a;
        w0 w0Var4 = this.f15039g;
        a0 a0Var = a0.f21526a;
        switch (i10) {
            case 0:
                int i11 = this.f15038f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    w0Var4.setValue(Boolean.TRUE);
                    String str = (String) w0Var3.getValue();
                    String str2 = (String) w0Var2.getValue();
                    String str3 = (String) w0Var.getValue();
                    this.f15038f = 1;
                    c cVar = this.f15040h;
                    cVar.getClass();
                    pf.e eVar = l0.f8566a;
                    Object objH = hf.a0.H(pf.d.f17138c, new a(str, cVar, str2, str3, this.f15041i, null, 1), this);
                    if (objH != aVar) {
                        objH = a0Var;
                    }
                    if (objH == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                w0Var4.setValue(Boolean.FALSE);
                return a0Var;
            default:
                int i12 = this.f15038f;
                if (i12 == 0) {
                    ub.a.f(obj);
                    w0Var4.setValue(Boolean.TRUE);
                    String str4 = (String) w0Var3.getValue();
                    String str5 = (String) w0Var2.getValue();
                    String str6 = (String) w0Var.getValue();
                    this.f15038f = 1;
                    c cVar2 = this.f15040h;
                    cVar2.getClass();
                    pf.e eVar2 = l0.f8566a;
                    Object objH2 = hf.a0.H(pf.d.f17138c, new a(str4, cVar2, str5, str6, this.f15041i, null, 0), this);
                    if (objH2 != aVar) {
                        objH2 = a0Var;
                    }
                    if (objH2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                w0Var4.setValue(Boolean.FALSE);
                return a0Var;
        }
    }
}
