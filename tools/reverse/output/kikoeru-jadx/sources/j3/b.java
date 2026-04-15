package j3;

import r.b0;
import r.c0;
import r.h1;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10114f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(0);
        this.f10110b = i10;
        this.f10111c = obj;
        this.f10112d = obj2;
        this.f10113e = obj3;
        this.f10114f = obj4;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f10110b) {
            case 0:
                ((s) this.f10111c).g((ic.a) this.f10112d, (q) this.f10113e, (f3.m) this.f10114f);
                break;
            default:
                Number number = (Number) this.f10113e;
                Number number2 = (Number) this.f10111c;
                c0 c0Var = (c0) this.f10112d;
                if (!number2.equals(c0Var.f18341a) || !number.equals(c0Var.f18342b)) {
                    b0 b0Var = (b0) this.f10114f;
                    c0Var.f18341a = number2;
                    c0Var.f18342b = number;
                    c0Var.f18345e = new h1(b0Var, c0Var.f18343c, number2, number, null);
                    c0Var.f18349i.f18376b.setValue(Boolean.TRUE);
                    c0Var.f18346f = false;
                    c0Var.f18347g = true;
                }
                break;
        }
        return a0.f21526a;
    }
}
