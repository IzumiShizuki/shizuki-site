package z9;

import a0.g0;
import a0.u;
import java.util.Iterator;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f26636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c9.f f26637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f26638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26639d;

    public k(r rVar, c9.f fVar, g0 g0Var, int i10) {
        this.f26636a = rVar;
        this.f26637b = fVar;
        this.f26638c = g0Var;
        this.f26639d = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        Object next;
        long j10 = ((p1.b) obj).f16481a;
        c9.f fVar = this.f26637b;
        r rVar = this.f26636a;
        rVar.f26658f.setValue(fVar);
        Iterator it = ((Iterable) this.f26638c.g().f124k).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((u) next).f131a == this.f26639d) {
                break;
            }
        }
        rVar.f26657e.setValue(new p1.b(p1.b.i(j10, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(((u) next) != null ? r3.f143m : 0)) & 4294967295L))));
        rVar.H(true);
        return a0.f21526a;
    }
}
