package d0;

import h0.c1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ac.h implements ic.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f5338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5339h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10, Object obj, yb.c cVar) {
        super(2, cVar);
        this.f5334c = i10;
        this.f5339h = obj;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f5334c) {
            case 0:
                g gVar = new g(0, (d) this.f5339h, cVar);
                gVar.f5337f = obj;
                return gVar;
            case 1:
                g gVar2 = new g(1, (i0.a) this.f5339h, cVar);
                gVar2.f5337f = obj;
                return gVar2;
            case 2:
                g gVar3 = new g((l0.l) this.f5335d, (ah.j) this.f5338g, (c1) this.f5339h, cVar, 2);
                gVar3.f5337f = obj;
                return gVar3;
            default:
                g gVar4 = new g((cg.b0) this.f5335d, (cg.y) this.f5338g, (cg.y) this.f5339h, cVar, 3);
                gVar4.f5337f = obj;
                return gVar4;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        c2.i0 i0Var = (c2.i0) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f5334c) {
        }
        return ((g) o(i0Var, cVar)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0238, code lost:
    
        if (r12 == r9) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03be, code lost:
    
        if (r6 != r8) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x032f, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c6, code lost:
    
        if (r10 == r9) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c8, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Path cross not found for [B:108:0x021b, B:103:0x01fa], limit reached: 304 */
    /* JADX WARN: Path cross not found for [B:111:0x0220, B:114:0x0226], limit reached: 304 */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0490 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b A[Catch: CancellationException -> 0x0026, TryCatch #0 {CancellationException -> 0x0026, blocks: (B:10:0x001f, B:34:0x00a0, B:36:0x00a8, B:38:0x00b8, B:40:0x00c4, B:41:0x00c7, B:42:0x00ca, B:43:0x00d2, B:17:0x0035, B:29:0x0067, B:31:0x006b, B:20:0x003f, B:26:0x0058, B:23:0x004c), top: B:265:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8 A[Catch: CancellationException -> 0x0026, TryCatch #0 {CancellationException -> 0x0026, blocks: (B:10:0x001f, B:34:0x00a0, B:36:0x00a8, B:38:0x00b8, B:40:0x00c4, B:41:0x00c7, B:42:0x00ca, B:43:0x00d2, B:17:0x0035, B:29:0x0067, B:31:0x006b, B:20:0x003f, B:26:0x0058, B:23:0x004c), top: B:265:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2 A[Catch: CancellationException -> 0x0026, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0026, blocks: (B:10:0x001f, B:34:0x00a0, B:36:0x00a8, B:38:0x00b8, B:40:0x00c4, B:41:0x00c7, B:42:0x00ca, B:43:0x00d2, B:17:0x0035, B:29:0x0067, B:31:0x006b, B:20:0x003f, B:26:0x0058, B:23:0x004c), top: B:265:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0159  */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v42, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v47, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x0238 -> B:119:0x023b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:220:0x03be -> B:222:0x03c2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:254:0x046f -> B:256:0x0472). Please report as a decompilation issue!!! */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 1206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.g.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, Object obj3, yb.c cVar, int i10) {
        super(2, cVar);
        this.f5334c = i10;
        this.f5335d = obj;
        this.f5338g = obj2;
        this.f5339h = obj3;
    }
}
