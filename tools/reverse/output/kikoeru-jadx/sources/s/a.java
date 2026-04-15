package s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f19083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u.i1 f19084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f19085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w.k f19086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f19087k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(u.i1 i1Var, long j10, w.k kVar, d dVar, yb.c cVar) {
        super(2, cVar);
        this.f19084h = i1Var;
        this.f19085i = j10;
        this.f19086j = kVar;
        this.f19087k = dVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        a aVar = new a(this.f19084h, this.f19085i, this.f19086j, this.f19087k, cVar);
        aVar.f19083g = obj;
        return aVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((a) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (r14.a(r1, r17) != r9) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        if (r14.a(r2, r17) == r9) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.a.u(java.lang.Object):java.lang.Object");
    }
}
