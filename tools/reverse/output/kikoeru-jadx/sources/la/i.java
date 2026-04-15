package la;

import hf.r1;
import u.i1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r1 f11997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w.n f11998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f12001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i1 f12002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f12003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w.k f12004l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f12005m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f12006n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(i1 i1Var, long j10, w.k kVar, x0.w0 w0Var, x0.w0 w0Var2, yb.c cVar) {
        super(2, cVar);
        this.f12002j = i1Var;
        this.f12003k = j10;
        this.f12004l = kVar;
        this.f12005m = w0Var;
        this.f12006n = w0Var2;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        i iVar = new i(this.f12002j, this.f12003k, this.f12004l, this.f12005m, this.f12006n, cVar);
        iVar.f12001i = obj;
        return iVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((i) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        if (r13.a(r8, r17) != r4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e6, code lost:
    
        if (r13.a(r5, r17) == r4) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [hf.r1, java.lang.Object, w.n] */
    /* JADX WARN: Type inference failed for: r2v3, types: [hf.r1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [hf.r1, java.lang.Object, w.n] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: la.i.u(java.lang.Object):java.lang.Object");
    }
}
