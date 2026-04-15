package k0;

import java.util.List;
import q1.q;
import q1.r;
import t2.h0;
import t2.i0;
import t2.l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f10950c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i10) {
        super(1);
        this.f10949b = i10;
        this.f10950c = mVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        i0 i0Var;
        switch (this.f10949b) {
            case 0:
                List list = (List) obj;
                m mVar = this.f10950c;
                i0 i0Var2 = mVar.C0().f10906n;
                if (i0Var2 != null) {
                    h0 h0Var = i0Var2.f20344a;
                    t2.g gVar = h0Var.f20326a;
                    l0 l0Var = mVar.f10952p;
                    r rVar = mVar.f10960x;
                    i0Var = new i0(new h0(gVar, l0.e(l0Var, rVar != null ? rVar.a() : q.f17575h, 0L, null, null, 0L, null, 0, 0L, 16777214), h0Var.f20328c, h0Var.f20329d, h0Var.f20330e, h0Var.f20331f, h0Var.f20332g, h0Var.f20333h, h0Var.f20334i, h0Var.f20335j), i0Var2.f20345b, i0Var2.f20346c);
                    list.add(i0Var);
                } else {
                    i0Var = null;
                }
                break;
            case 1:
                t2.g gVar2 = (t2.g) obj;
                m mVar2 = this.f10950c;
                k kVar = mVar2.B;
                vb.r rVar2 = vb.r.f22819a;
                if (kVar == null) {
                    k kVar2 = new k(mVar2.f10951o, gVar2);
                    d dVar = new d(gVar2, mVar2.f10952p, mVar2.f10953q, mVar2.f10955s, mVar2.f10956t, mVar2.f10957u, mVar2.f10958v, rVar2);
                    dVar.c(mVar2.C0().f10902j);
                    kVar2.f10948d = dVar;
                    mVar2.B = kVar2;
                } else if (!jc.l.a(gVar2, kVar.f10946b)) {
                    kVar.f10946b = gVar2;
                    d dVar2 = kVar.f10948d;
                    if (dVar2 != null) {
                        l0 l0Var2 = mVar2.f10952p;
                        x2.d dVar3 = mVar2.f10953q;
                        int i10 = mVar2.f10955s;
                        boolean z10 = mVar2.f10956t;
                        int i11 = mVar2.f10957u;
                        int i12 = mVar2.f10958v;
                        dVar2.f10893a = gVar2;
                        boolean zC = l0Var2.c(dVar2.f10903k);
                        dVar2.f10903k = l0Var2;
                        if (!zC) {
                            dVar2.f10904l = null;
                            dVar2.f10906n = null;
                            dVar2.f10908p = -1;
                            dVar2.f10907o = -1;
                        }
                        dVar2.f10894b = dVar3;
                        dVar2.f10895c = i10;
                        dVar2.f10896d = z10;
                        dVar2.f10897e = i11;
                        dVar2.f10898f = i12;
                        dVar2.f10899g = rVar2;
                        dVar2.f10904l = null;
                        dVar2.f10906n = null;
                        dVar2.f10908p = -1;
                        dVar2.f10907o = -1;
                    }
                }
                i2.f.o(mVar2);
                i2.f.n(mVar2);
                i2.f.m(mVar2);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                m mVar3 = this.f10950c;
                k kVar3 = mVar3.B;
                if (kVar3 != null) {
                    if (kVar3 != null) {
                        kVar3.f10947c = zBooleanValue;
                    }
                    i2.f.o(mVar3);
                    i2.f.n(mVar3);
                    i2.f.m(mVar3);
                }
                break;
        }
        return Boolean.TRUE;
    }
}
