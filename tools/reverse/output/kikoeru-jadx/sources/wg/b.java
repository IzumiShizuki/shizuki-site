package wg;

import jc.l;
import ud.n;
import vb.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pc.c f24221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f24222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f24223d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(pc.c cVar, Object obj, n nVar) {
        super(7);
        l.e(obj, "value");
        l.e(nVar, "next");
        this.f24221b = cVar;
        this.f24222c = obj;
        this.f24223d = nVar;
    }

    @Override // ud.n
    public final String toString() {
        return m.f0(m.v0(df.m.g0(df.m.b0(this, new t9.c(7)))), null, "{", "}", new t9.c(8), 25);
    }

    @Override // ud.n
    public final n y(pc.c cVar, Object obj) {
        pc.c cVar2 = this.f24221b;
        boolean zEquals = cVar.equals(cVar2);
        n bVar = this.f24223d;
        if (!zEquals) {
            n nVarY = bVar.y(cVar, null);
            bVar = nVarY == bVar ? this : new b(cVar2, this.f24222c, nVarY);
        }
        return obj != null ? new b(cVar, obj, bVar) : bVar;
    }
}
