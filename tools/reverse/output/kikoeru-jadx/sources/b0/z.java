package b0;

import java.util.List;
import u.c2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f1412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1413i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1414j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, r.x xVar, long j10, yb.c cVar) {
        super(2, cVar);
        this.f1409e = 0;
        this.f1414j = a0Var;
        this.f1413i = xVar;
        this.f1411g = j10;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f1409e) {
            case 0:
                return new z((a0) this.f1414j, (r.x) this.f1413i, this.f1411g, cVar);
            case 1:
                return new z((da.m0) this.f1413i, (List) this.f1414j, this.f1411g, cVar);
            case 2:
                return new z((x0.w0) this.f1413i, this.f1411g, (w.k) this.f1414j, cVar, 2);
            case 3:
                return new z((s.d) this.f1413i, this.f1411g, (w.k) this.f1414j, cVar, 3);
            default:
                z zVar = new z((c2) this.f1413i, this.f1411g, (jc.v) this.f1414j, cVar, 4);
                zVar.f1412h = obj;
                return zVar;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f1409e) {
            case 0:
                return ((z) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 1:
                return ((z) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 2:
                return ((z) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 3:
                return ((z) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            default:
                return ((z) o((u.a2) obj, (yb.c) obj2)).u(ub.a0.f21526a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ac, code lost:
    
        if (r3.a(r1, r17) == r10) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01c6, code lost:
    
        if (r3.a(r0, r17) == r10) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02db, code lost:
    
        if (r.c.d(r3, r5, r2, r3, r17, 4) != r10) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0166, code lost:
    
        if (((w.k) r3).a(r0, r17) == r10) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014a  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, zb.a] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [da.b] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.z.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(da.m0 m0Var, List list, long j10, yb.c cVar) {
        super(2, cVar);
        this.f1409e = 1;
        this.f1413i = m0Var;
        this.f1414j = list;
        this.f1411g = j10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Object obj, long j10, Object obj2, yb.c cVar, int i10) {
        super(2, cVar);
        this.f1409e = i10;
        this.f1413i = obj;
        this.f1411g = j10;
        this.f1414j = obj2;
    }
}
