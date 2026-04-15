package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r.l f21051f = new r.l(0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r.x1 f21052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f21053b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r.l f21054c = f21051f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f21056e;

    public q2(r.j jVar) {
        this.f21052a = jVar.a(r.w1.f18620a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        if (x0.v.s(r15).k(r0, r1) == r9) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083 A[Catch: all -> 0x00f3, PHI: r0 r1 r13 r14 r15
      0x0083: PHI (r0v9 ??) = (r0v3 ??), (r0v15 ??) binds: [B:31:0x007c, B:40:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x0083: PHI (r1v4 u.p2) = (r1v2 u.p2), (r1v5 u.p2) binds: [B:31:0x007c, B:40:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x0083: PHI (r13v6 float) = (r13v3 float), (r13v7 float) binds: [B:31:0x007c, B:40:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x0083: PHI (r14v6 ic.k) = (r14v3 ic.k), (r14v7 ic.k) binds: [B:31:0x007c, B:40:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x0083: PHI (r15v17 u.q2) = (r15v8 u.q2), (r15v18 u.q2) binds: [B:31:0x007c, B:40:0x00b9] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x00f3, blocks: (B:38:0x00b4, B:32:0x0083, B:35:0x0095), top: B:55:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090 A[PHI: r0 r1 r14 r15
      0x0090: PHI (r0v4 ??) = (r0v16 ??), (r0v17 ??) binds: [B:33:0x008e, B:40:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r1v3 u.p2) = (r1v4 u.p2), (r1v5 u.p2) binds: [B:33:0x008e, B:40:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r14v4 ic.k) = (r14v6 ic.k), (r14v7 ic.k) binds: [B:33:0x008e, B:40:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r15v11 u.q2) = (r15v17 u.q2), (r15v18 u.q2) binds: [B:33:0x008e, B:40:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095 A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:38:0x00b4, B:32:0x0083, B:35:0x0095), top: B:55:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [ic.a] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [ic.a] */
    /* JADX WARN: Type inference failed for: r13v10, types: [ic.a] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v5, types: [ub.e] */
    /* JADX WARN: Type inference failed for: r14v0, types: [a0.o] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2, types: [u.q2] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [u.q2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b1 -> B:55:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(cg.b r13, a0.o r14, ac.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.q2.a(cg.b, a0.o, ac.c):java.lang.Object");
    }
}
