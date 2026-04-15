package lh;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f12621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f12622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c0 f12623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f12626f;

    public z(h hVar) {
        this.f12621a = hVar;
        f fVarS = hVar.s();
        this.f12622b = fVarS;
        c0 c0Var = fVarS.f12570a;
        this.f12623c = c0Var;
        this.f12624d = c0Var != null ? c0Var.f12557b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f12557b) goto L15;
     */
    @Override // lh.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long W(lh.f r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            jc.l.e(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.f12625e
            if (r3 != 0) goto L63
            lh.c0 r3 = r8.f12623c
            lh.f r4 = r8.f12622b
            if (r3 == 0) goto L2b
            lh.c0 r5 = r4.f12570a
            if (r3 != r5) goto L23
            int r3 = r8.f12624d
            jc.l.b(r5)
            int r5 = r5.f12557b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f12626f
            r2 = 1
            long r0 = r0 + r2
            lh.h r2 = r8.f12621a
            boolean r0 = r2.P(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            lh.c0 r0 = r8.f12623c
            if (r0 != 0) goto L4c
            lh.c0 r0 = r4.f12570a
            if (r0 == 0) goto L4c
            r8.f12623c = r0
            int r0 = r0.f12557b
            r8.f12624d = r0
        L4c:
            long r0 = r4.f12571b
            long r2 = r8.f12626f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            lh.f r2 = r8.f12622b
            long r4 = r8.f12626f
            r3 = r9
            r2.g(r3, r4, r6)
            long r9 = r8.f12626f
            long r9 = r9 + r6
            r8.f12626f = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = j2.h0.i(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: lh.z.W(lh.f, long):long");
    }

    @Override // lh.h0
    public final j0 a() {
        return this.f12621a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12625e = true;
    }
}
