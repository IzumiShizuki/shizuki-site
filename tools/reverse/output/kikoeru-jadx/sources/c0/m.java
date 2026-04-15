package c0;

import b0.q0;
import g2.f1;
import g2.g1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3102b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f3103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q0 f3105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, ArrayList arrayList, q0 q0Var) {
        super(1);
        this.f3103c = kVar;
        this.f3104d = arrayList;
        this.f3105e = q0Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        boolean z10;
        boolean z11;
        t1.b bVar;
        switch (this.f3102b) {
            case 0:
                f1 f1Var = (f1) obj;
                ArrayList arrayList = this.f3104d;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    r rVar = (r) arrayList.get(i10);
                    boolean zO = this.f3105e.f1337b.O();
                    boolean z12 = rVar.f3138d;
                    if (rVar.f3149o == -1) {
                        x.a.a("position() should be called first");
                    }
                    List list = rVar.f3137c;
                    int size2 = list.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        g1 g1Var = (g1) list.get(i11);
                        int i12 = rVar.f3150p - (z12 ? g1Var.f7181b : g1Var.f7180a);
                        int i13 = rVar.f3151q;
                        int i14 = i10;
                        long j10 = rVar.f3154t;
                        ArrayList arrayList2 = arrayList;
                        int i15 = size;
                        b0.a0 a0VarA = rVar.f3144j.a(i11, rVar.f3136b);
                        if (a0VarA != null) {
                            if (zO) {
                                a0VarA.f1189r = j10;
                                z10 = zO;
                                z11 = z12;
                            } else {
                                r rVar2 = rVar;
                                long jD = f3.j.d(!f3.j.b(a0VarA.f1189r, b0.a0.f1170s) ? a0VarA.f1189r : j10, ((f3.j) a0VarA.f1188q.getValue()).f6660a);
                                rVar = rVar2;
                                z10 = zO;
                                z11 = z12;
                                if (((rVar.a(j10) <= i12 && rVar.a(jD) <= i12) || (rVar.a(j10) >= i13 && rVar.a(jD) >= i13)) && ((Boolean) a0VarA.f1179h.getValue()).booleanValue()) {
                                    hf.a0.y(a0VarA.f1172a, null, null, new b0.u(a0VarA, null, 1), 3);
                                }
                                j10 = jD;
                            }
                            bVar = a0VarA.f1185n;
                        } else {
                            z10 = zO;
                            z11 = z12;
                            bVar = null;
                        }
                        long jD2 = f3.j.d(j10, this.f3103c.f3088i);
                        if (!z10 && a0VarA != null) {
                            a0VarA.f1184m = jD2;
                        }
                        if (bVar == null) {
                            f1.m(f1Var, g1Var, jD2);
                        } else if (f1Var.f() == f3.m.f6667a || f1Var.g() == 0) {
                            f1.b(f1Var, g1Var);
                            g1Var.d0(f3.j.d(jD2, g1Var.f7184e), 0.0f, bVar);
                        } else {
                            int iG = (f1Var.g() - g1Var.f7180a) - ((int) (jD2 >> 32));
                            f1.b(f1Var, g1Var);
                            g1Var.d0(f3.j.d((((long) ((int) (jD2 & 4294967295L))) & 4294967295L) | (((long) iG) << 32), g1Var.f7184e), 0.0f, bVar);
                        }
                        i11++;
                        i10 = i14;
                        arrayList = arrayList2;
                        size = i15;
                        z12 = z11;
                        zO = z10;
                    }
                    i10++;
                }
                break;
            default:
                f1 f1Var2 = (f1) obj;
                q0 q0Var = this.f3105e;
                ArrayList arrayList3 = this.f3104d;
                k kVar = this.f3103c;
                m mVar = new m(arrayList3, kVar, q0Var);
                f1Var2.f7178a = true;
                mVar.a(f1Var2);
                f1Var2.f7178a = false;
                kVar.f3080a.f3200u.getValue();
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ArrayList arrayList, k kVar, q0 q0Var) {
        super(1);
        this.f3104d = arrayList;
        this.f3103c = kVar;
        this.f3105e = q0Var;
    }
}
