package da;

import bg.a2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f5664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f5665d;

    public /* synthetic */ d(m0 m0Var, long j10, ic.k kVar) {
        this.f5662a = 5;
        this.f5664c = m0Var;
        this.f5665d = j10;
        this.f5663b = kVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f5662a) {
            case 0:
                hf.a0.y((hf.y) this.f5663b, null, null, new m(this.f5664c, this.f5665d, null, 1), 3);
                break;
            case 1:
                hf.a0.y((hf.y) this.f5663b, null, null, new m(this.f5664c, this.f5665d, null, 4), 3);
                break;
            case 2:
                hf.y yVar = (hf.y) this.f5663b;
                m0 m0Var = this.f5664c;
                hf.a0.y(yVar, null, null, new m(m0Var, this.f5665d, null, 2), 3);
                m0Var.c0(false);
                break;
            case 3:
                hf.a0.y((hf.y) this.f5663b, null, null, new y(this.f5665d, null, 0), 3);
                this.f5664c.c0(false);
                break;
            case 4:
                hf.a0.y((hf.y) this.f5663b, null, null, new b9.b(this.f5664c, this.f5665d, null, 1), 3);
                break;
            default:
                ic.k kVar = (ic.k) this.f5663b;
                m0 m0Var2 = this.f5664c;
                a2 a2VarA = m0Var2.A();
                String strL = a2VarA != null ? na.c.l(a2VarA) : na.w.a(this.f5665d);
                jc.l.e(kVar, "uriCb");
                hf.a0.y(androidx.lifecycle.m0.h(m0Var2), null, null, new f9.a(kVar, strL, (yb.c) null), 3);
                break;
        }
        return ub.a0.f21526a;
    }

    public /* synthetic */ d(hf.y yVar, m0 m0Var, long j10, int i10) {
        this.f5662a = i10;
        this.f5663b = yVar;
        this.f5664c = m0Var;
        this.f5665d = j10;
    }
}
