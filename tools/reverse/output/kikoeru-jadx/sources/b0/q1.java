package b0;

import java.util.Map;
import x0.o2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements g1.g, g1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1.h f1340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1.c f1341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o.l0 f1342c;

    public q1(g1.g gVar, Map map, g1.c cVar) {
        a0.f0 f0Var = new a0.f0(3, gVar);
        o2 o2Var = g1.i.f7146a;
        this.f1340a = new g1.h(map, f0Var);
        this.f1341b = cVar;
        int i10 = o.t0.f16044a;
        this.f1342c = new o.l0();
    }

    @Override // g1.c
    public final void a(Object obj, f1.f fVar, x0.o oVar, int i10) {
        oVar.W(-697180401);
        this.f1341b.a(obj, fVar, oVar, i10 & 126);
        boolean zH = oVar.h(this) | oVar.h(obj);
        Object objK = oVar.K();
        if (zH || objK == x0.k.f24334a) {
            objK = new o1(1, this, obj);
            oVar.h0(objK);
        }
        x0.v.c(obj, (ic.k) objK, oVar);
        oVar.p(false);
    }

    @Override // g1.g
    public final boolean b(Object obj) {
        return this.f1340a.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // g1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map c() {
        /*
            r15 = this;
            o.l0 r0 = r15.f1342c
            java.lang.Object[] r1 = r0.f16003b
            long[] r0 = r0.f16002a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L47
            r3 = 0
            r4 = 0
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = 0
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            g1.c r11 = r15.f1341b
            r11.e(r10)
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            g1.h r0 = r15.f1340a
            java.util.Map r0 = r0.c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.q1.c():java.util.Map");
    }

    @Override // g1.g
    public final Object d(String str) {
        return this.f1340a.d(str);
    }

    @Override // g1.c
    public final void e(Object obj) {
        this.f1341b.e(obj);
    }

    @Override // g1.g
    public final g1.f g(String str, ic.a aVar) {
        return this.f1340a.g(str, aVar);
    }
}
