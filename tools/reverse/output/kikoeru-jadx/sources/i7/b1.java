package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements lf.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f9049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hf.y f9050b;

    public b1(d1 d1Var, hf.y yVar) {
        this.f9049a = d1Var;
        this.f9050b = yVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0397, code lost:
    
        if (r1.g(r0) == r5) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02b2, code lost:
    
        if (r1.g(r0) == r5) goto L151;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03c0 A[PHI: r8 r9 r10
      0x03c0: PHI (r8v46 hf.y) = (r8v23 hf.y), (r8v48 hf.y) binds: [B:85:0x02de, B:119:0x03b4] A[DONT_GENERATE, DONT_INLINE]
      0x03c0: PHI (r9v34 ??) = (r9v52 ??), (r9v36 ??) binds: [B:85:0x02de, B:119:0x03b4] A[DONT_GENERATE, DONT_INLINE]
      0x03c0: PHI (r10v22 i7.c0) = (r10v10 i7.c0), (r10v23 i7.c0) binds: [B:85:0x02de, B:119:0x03b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x032d  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [i7.d1] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [rf.a] */
    /* JADX WARN: Type inference failed for: r1v12, types: [i7.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [rf.a] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3, types: [rf.a] */
    /* JADX WARN: Type inference failed for: r1v36, types: [int] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v61, types: [int] */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r1v89 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [i7.d1] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Type inference failed for: r6v67, types: [i7.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v15, types: [i7.d1] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v37, types: [i7.d1] */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v19, types: [i7.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v26, types: [i7.d1] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v33, types: [i7.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v42, types: [i7.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v49, types: [i7.d1] */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v56, types: [i7.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v60, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v62 */
    /* JADX WARN: Type inference failed for: r8v65 */
    /* JADX WARN: Type inference failed for: r8v66 */
    /* JADX WARN: Type inference failed for: r8v67 */
    /* JADX WARN: Type inference failed for: r8v68 */
    /* JADX WARN: Type inference failed for: r8v69 */
    /* JADX WARN: Type inference failed for: r8v70 */
    /* JADX WARN: Type inference failed for: r8v71 */
    /* JADX WARN: Type inference failed for: r8v72 */
    /* JADX WARN: Type inference failed for: r8v73 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v15, types: [i7.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v21, types: [i7.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v34, types: [i7.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v40, types: [i7.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v52 */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v54 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(yb.c r14) {
        /*
            Method dump skipped, instruction units count: 1226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.b1.a(yb.c):java.lang.Object");
    }

    @Override // lf.g
    public final /* bridge */ /* synthetic */ Object n(Object obj, yb.c cVar) {
        return a(cVar);
    }
}
