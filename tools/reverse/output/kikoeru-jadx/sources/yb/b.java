package yb;

import ic.n;
import java.io.Serializable;
import jc.l;
import q.t0;
import x0.q2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements h, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f26085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f26086b;

    public b(f fVar, h hVar) {
        l.e(hVar, "left");
        l.e(fVar, "element");
        this.f26085a = hVar;
        this.f26086b = fVar;
    }

    @Override // yb.h
    public final h G(h hVar) {
        l.e(hVar, "context");
        return hVar == i.f26088a ? this : (h) hVar.y(new q2(4), this);
    }

    @Override // yb.h
    public final h L(g gVar) {
        l.e(gVar, "key");
        f fVar = this.f26086b;
        f fVarR = fVar.R(gVar);
        h hVar = this.f26085a;
        if (fVarR != null) {
            return hVar;
        }
        h hVarL = hVar.L(gVar);
        return hVarL == hVar ? this : hVarL == i.f26088a ? fVar : new b(fVar, hVarL);
    }

    @Override // yb.h
    public final f R(g gVar) {
        l.e(gVar, "key");
        b bVar = this;
        while (true) {
            f fVarR = bVar.f26086b.R(gVar);
            if (fVarR != null) {
                return fVarR;
            }
            h hVar = bVar.f26085a;
            if (!(hVar instanceof b)) {
                return hVar.R(gVar);
            }
            bVar = (b) hVar;
        }
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int i10 = 2;
            b bVar2 = bVar;
            int i11 = 2;
            while (true) {
                h hVar = bVar2.f26085a;
                bVar2 = hVar instanceof b ? (b) hVar : null;
                if (bVar2 == null) {
                    break;
                }
                i11++;
            }
            b bVar3 = this;
            while (true) {
                h hVar2 = bVar3.f26085a;
                bVar3 = hVar2 instanceof b ? (b) hVar2 : null;
                if (bVar3 == null) {
                    break;
                }
                i10++;
            }
            if (i11 == i10) {
                b bVar4 = this;
                while (true) {
                    f fVar = bVar4.f26086b;
                    if (!l.a(bVar.R(fVar.getKey()), fVar)) {
                        zA = false;
                        break;
                    }
                    h hVar3 = bVar4.f26085a;
                    if (!(hVar3 instanceof b)) {
                        l.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f fVar2 = (f) hVar3;
                        zA = l.a(bVar.R(fVar2.getKey()), fVar2);
                        break;
                    }
                    bVar4 = (b) hVar3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f26086b.hashCode() + this.f26085a.hashCode();
    }

    public final String toString() {
        return t0.E(new StringBuilder("["), (String) y(new q2(3), ""), ']');
    }

    @Override // yb.h
    public final Object y(n nVar, Object obj) {
        return nVar.q(this.f26085a.y(nVar, obj), this.f26086b);
    }
}
