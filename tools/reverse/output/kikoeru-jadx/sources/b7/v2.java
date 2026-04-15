package b7;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v2 implements n3, p3, p4.g, p4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2121c;

    public /* synthetic */ v2(long j10, Object obj, int i10) {
        this.f2121c = obj;
        this.f2119a = i10;
        this.f2120b = j10;
    }

    @Override // p4.k
    public void a(Object obj) {
        w4.a aVar = (w4.a) this.f2121c;
        w4.i iVar = (w4.i) obj;
        HashMap map = iVar.f23379g;
        HashMap map2 = iVar.f23380h;
        j5.d0 d0Var = aVar.f23340d;
        if (d0Var != null) {
            String strD = iVar.f23374b.d(aVar.f23338b, d0Var);
            Long l10 = (Long) map2.get(strD);
            Long l11 = (Long) map.get(strD);
            map2.put(strD, Long.valueOf((l10 == null ? 0L : l10.longValue()) + this.f2120b));
            map.put(strD, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) this.f2119a)));
        }
    }

    @Override // p4.g
    public void accept(Object obj) {
        o6.m mVar = (o6.m) this.f2121c;
        o6.a aVar = (o6.a) obj;
        p4.c.j(mVar.f16277h);
        byte[] bArrR = m3.l.r(aVar.f16242a, aVar.f16244c);
        p4.s sVar = mVar.f16272c;
        sVar.getClass();
        sVar.E(bArrR, bArrR.length);
        mVar.f16270a.e(bArrR.length, sVar);
        long j10 = aVar.f16243b;
        long j11 = this.f2120b;
        if (j10 == -9223372036854775807L) {
            p4.c.i(mVar.f16277h.f14549s == Long.MAX_VALUE);
        } else {
            long j12 = mVar.f16277h.f14549s;
            j11 = j12 == Long.MAX_VALUE ? j11 + j10 : j10 + j12;
        }
        mVar.f16270a.a(j11, this.f2119a | 1, bArrR.length, 0, null);
    }

    @Override // b7.n3
    public void b(z3 z3Var, t1 t1Var) {
        int iE0 = ((q3) this.f2121c).E0(t1Var, z3Var, this.f2119a);
        z3Var.r0();
        ((androidx.lifecycle.q) z3Var.f2227a).r1(iE0, false, this.f2120b);
    }

    @Override // b7.p3
    public Object h(c2 c2Var, t1 t1Var, int i10) {
        List list = (List) this.f2121c;
        int i11 = this.f2119a;
        return c2Var.p(t1Var, list, i11 == -1 ? c2Var.f1693t.G() : i11, i11 == -1 ? c2Var.f1693t.M() : this.f2120b);
    }

    public /* synthetic */ v2(o6.m mVar, long j10, int i10) {
        this.f2121c = mVar;
        this.f2120b = j10;
        this.f2119a = i10;
    }

    public /* synthetic */ v2(w4.a aVar, int i10, long j10, long j11) {
        this.f2121c = aVar;
        this.f2119a = i10;
        this.f2120b = j10;
    }
}
