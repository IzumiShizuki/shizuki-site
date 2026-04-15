package ce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f3953a;

    public m() {
        this.f3953a = new j();
    }

    public final boolean i() {
        c0 c0Var = this.f3953a.f3946a;
        int i10 = 0;
        while (true) {
            if (i10 >= c0Var.f3905b.size()) {
                Iterator it = c0Var.c().iterator();
                while (it.hasNext()) {
                    if (!j.e((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!j.e((Map.Entry) c0Var.f3905b.get(i10))) {
                break;
            }
            i10++;
        }
        return false;
    }

    public final int j() {
        c0 c0Var = this.f3953a.f3946a;
        int iD = 0;
        for (int i10 = 0; i10 < c0Var.f3905b.size(); i10++) {
            Map.Entry entry = (Map.Entry) c0Var.f3905b.get(i10);
            iD += j.d((n) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : c0Var.c()) {
            iD += j.d((n) entry2.getKey(), entry2.getValue());
        }
        return iD;
    }

    public final Object k(o oVar) {
        o(oVar);
        n nVar = oVar.f3961d;
        Object obj = this.f3953a.f3946a.get(nVar);
        if (obj == null) {
            return oVar.f3959b;
        }
        if (!nVar.f3957c) {
            return oVar.a(obj);
        }
        if (nVar.f3956b.f3970a != s0.f3980i) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(oVar.a(it.next()));
        }
        return arrayList;
    }

    public final boolean l(o oVar) {
        o(oVar);
        n nVar = oVar.f3961d;
        j jVar = this.f3953a;
        jVar.getClass();
        if (nVar.f3957c) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return jVar.f3946a.get(nVar) != null;
    }

    public final void m() {
        this.f3953a.f();
    }

    public final boolean n(f fVar, g gVar, i iVar, int i10) throws s {
        boolean z10;
        boolean z11;
        Object objC;
        b bVar;
        int i11 = i10 & 7;
        o oVar = (o) iVar.f3942a.get(new h(i10 >>> 3, a()));
        if (oVar == null) {
            z10 = true;
            z11 = false;
        } else {
            n nVar = oVar.f3961d;
            r0 r0Var = nVar.f3956b;
            j jVar = j.f3945c;
            if (i11 == r0Var.f3971b) {
                z10 = false;
                z11 = false;
            } else {
                if (nVar.f3957c && r0Var.a() && i11 == 2) {
                    z10 = false;
                    z11 = true;
                }
                z10 = true;
                z11 = false;
            }
        }
        if (z10) {
            return fVar.q(i10, gVar);
        }
        k kVarD = null;
        j jVar2 = this.f3953a;
        if (z11) {
            int iD = fVar.d(fVar.k());
            n nVar2 = oVar.f3961d;
            if (nVar2.f3956b != r0.f3968g) {
                while (fVar.b() > 0) {
                    jVar2.a(nVar2, j.h(fVar, nVar2.f3956b));
                }
            } else if (fVar.b() > 0) {
                fVar.k();
                throw null;
            }
            fVar.c(iD);
            return true;
        }
        n nVar3 = oVar.f3961d;
        r0 r0Var2 = nVar3.f3956b;
        boolean z12 = nVar3.f3957c;
        int iOrdinal = r0Var2.f3970a.ordinal();
        if (iOrdinal == 7) {
            fVar.k();
            throw null;
        }
        if (iOrdinal != 8) {
            objC = j.h(fVar, r0Var2);
        } else {
            if (!z12 && (bVar = (b) jVar2.f3946a.get(nVar3)) != null) {
                kVarD = bVar.e();
            }
            if (kVarD == null) {
                kVarD = oVar.f3960c.d();
            }
            if (r0Var2 == r0.f3966e) {
                int i12 = nVar3.f3955a;
                int i13 = fVar.f3924i;
                if (i13 >= 64) {
                    throw new s("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                }
                fVar.f3924i = i13 + 1;
                kVarD.d(fVar, iVar);
                fVar.a((i12 << 3) | 4);
                fVar.f3924i--;
            } else {
                int iK = fVar.k();
                if (fVar.f3924i >= 64) {
                    throw new s("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                }
                int iD2 = fVar.d(iK);
                fVar.f3924i++;
                kVarD.d(fVar, iVar);
                fVar.a(0);
                fVar.f3924i--;
                fVar.c(iD2);
            }
            objC = kVarD.c();
        }
        if (z12) {
            jVar2.a(nVar3, oVar.b(objC));
            return true;
        }
        jVar2.i(nVar3, oVar.b(objC));
        return true;
    }

    public final void o(o oVar) {
        if (oVar.f3958a != a()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public m(l lVar) {
        lVar.f3950b.f();
        lVar.f3951c = false;
        this.f3953a = lVar.f3950b;
    }
}
