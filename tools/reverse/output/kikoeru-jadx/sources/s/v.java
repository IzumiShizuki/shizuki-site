package s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f19287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f19288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w f19290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f19291i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, long j10, yb.c cVar) {
        super(2, cVar);
        this.f19290h = wVar;
        this.f19291i = j10;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        return new v(this.f19290h, this.f19291i, cVar);
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((v) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (hf.a0.l(r5 - r7, r11) == r4) goto L19;
     */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f19289g
            r1 = 2
            s.w r2 = r11.f19290h
            r3 = 1
            zb.a r4 = zb.a.f26667a
            if (r0 == 0) goto L22
            if (r0 == r3) goto L1a
            if (r0 != r1) goto L12
            ub.a.f(r12)
            goto L5c
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            long r5 = r11.f19288f
            long r7 = r11.f19287e
            ub.a.f(r12)
            goto L43
        L22:
            ub.a.f(r12)
            x0.o2 r12 = j2.l1.f9877s
            java.lang.Object r12 = i2.f.i(r2, r12)
            j2.z2 r12 = (j2.z2) r12
            r12.getClass()
            long r5 = r12.a()
            r7 = 40
            r11.f19287e = r7
            r11.f19288f = r5
            r11.f19289g = r3
            java.lang.Object r12 = hf.a0.l(r7, r11)
            if (r12 != r4) goto L43
            goto L5b
        L43:
            o.c0 r12 = r2.L
            long r9 = r11.f19291i
            java.lang.Object r12 = r12.e(r9)
            s.t r12 = (s.t) r12
            if (r12 != 0) goto L50
            goto L52
        L50:
            r12.f19272b = r3
        L52:
            long r5 = r5 - r7
            r11.f19289g = r1
            java.lang.Object r12 = hf.a0.l(r5, r11)
            if (r12 != r4) goto L5c
        L5b:
            return r4
        L5c:
            ic.a r12 = r2.f19124v
            r12.b()
            ub.a0 r12 = ub.a0.f21526a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: s.v.u(java.lang.Object):java.lang.Object");
    }
}
