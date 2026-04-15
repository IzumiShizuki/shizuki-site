package c5;

import j5.b1;
import java.util.Map;
import m4.m0;
import m4.n0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends b1 {
    public final Map H;
    public m4.n I;

    public p(n5.f fVar, b5.t tVar, b5.q qVar, Map map) {
        super(fVar, tVar, qVar);
        this.H = map;
    }

    @Override // j5.b1
    public final m4.q p(m4.q qVar) {
        m4.n nVar;
        m4.n nVar2 = this.I;
        if (nVar2 == null) {
            nVar2 = qVar.f14548r;
        }
        if (nVar2 != null && (nVar = (m4.n) this.H.get(nVar2.f14407c)) != null) {
            nVar2 = nVar;
        }
        n0 n0Var = qVar.f14542l;
        n0 n0Var2 = null;
        if (n0Var == null) {
            n0Var = n0Var2;
        } else {
            m0[] m0VarArr = n0Var.f14409a;
            int length = m0VarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                m0 m0Var = m0VarArr[i11];
                if ((m0Var instanceof f6.m) && "com.apple.streaming.transportStreamTimestamp".equals(((f6.m) m0Var).f6750b)) {
                    break;
                }
                i11++;
            }
            if (i11 != -1) {
                if (length != 1) {
                    m0[] m0VarArr2 = new m0[length - 1];
                    while (i10 < length) {
                        if (i10 != i11) {
                            m0VarArr2[i10 < i11 ? i10 : i10 - 1] = m0VarArr[i10];
                        }
                        i10++;
                    }
                    n0Var2 = new n0(m0VarArr2);
                }
                n0Var = n0Var2;
            }
        }
        if (nVar2 != qVar.f14548r || n0Var != qVar.f14542l) {
            m4.p pVarA = qVar.a();
            pVarA.f14492q = nVar2;
            pVarA.f14486k = n0Var;
            qVar = new m4.q(pVarA);
        }
        return super.p(qVar);
    }
}
