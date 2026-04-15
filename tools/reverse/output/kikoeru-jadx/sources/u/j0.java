package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20955e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public jc.y f20956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public jc.y f20957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f20959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k0 f20960j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(jc.y yVar, k0 k0Var, yb.c cVar) {
        super(2, cVar);
        this.f20957g = yVar;
        this.f20960j = k0Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f20955e) {
            case 0:
                j0 j0Var = new j0(this.f20957g, this.f20960j, cVar);
                j0Var.f20959i = obj;
                return j0Var;
            default:
                j0 j0Var2 = new j0(this.f20960j, cVar);
                j0Var2.f20959i = obj;
                return j0Var2;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f20955e) {
            case 0:
                return ((j0) o((ic.k) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            default:
                return ((j0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:37|38|(1:94)|17|89|41|(2:47|(2:49|(1:95)))(2:43|(2:45|91))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba A[Catch: CancellationException -> 0x00ca, TryCatch #2 {CancellationException -> 0x00ca, blocks: (B:41:0x00b4, B:43:0x00ba, B:47:0x00cd, B:49:0x00d1), top: B:89:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd A[Catch: CancellationException -> 0x00ca, TryCatch #2 {CancellationException -> 0x00ca, blocks: (B:41:0x00b4, B:43:0x00ba, B:47:0x00cd, B:49:0x00d1), top: B:89:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008b -> B:22:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c7 -> B:22:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00cf -> B:22:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00dc -> B:22:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00ea -> B:14:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0140 -> B:80:0x0141). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0145 -> B:82:0x0146). Please report as a decompilation issue!!! */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.j0.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, yb.c cVar) {
        super(2, cVar);
        this.f20960j = k0Var;
    }
}
