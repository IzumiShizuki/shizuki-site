package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ac.i implements ic.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f9154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f9156i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, Object obj, yb.c cVar) {
        super(3, cVar);
        this.f9152e = i10;
        this.f9156i = obj;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [ac.i, ic.n] */
    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f9152e) {
            case 0:
                int i10 = 0;
                i iVar = new i(i10, (k4.a) this.f9156i, (yb.c) obj3);
                iVar.f9154g = (lf.g) obj;
                iVar.f9155h = obj2;
                return iVar.u(ub.a0.f21526a);
            case 1:
                ((Boolean) obj2).getClass();
                i iVar2 = new i((o0) this.f9156i, (yb.c) obj3);
                iVar2.f9155h = (l0) obj;
                return iVar2.u(ub.a0.f21526a);
            case 2:
                int i11 = 2;
                i iVar3 = new i(i11, (o0) this.f9156i, (yb.c) obj3);
                iVar3.f9154g = (lf.g) obj;
                iVar3.f9155h = obj2;
                return iVar3.u(ub.a0.f21526a);
            default:
                i iVar4 = new i((ic.n) this.f9156i, (yb.c) obj3);
                iVar4.f9154g = (lf.g) obj;
                iVar4.f9155h = obj2;
                return iVar4.u(ub.a0.f21526a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018e  */
    /* JADX WARN: Type inference failed for: r6v20, types: [ac.i, ic.n] */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.i.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o0 o0Var, yb.c cVar) {
        super(3, cVar);
        this.f9152e = 1;
        this.f9156i = o0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(ic.n nVar, yb.c cVar) {
        super(3, cVar);
        this.f9152e = 3;
        this.f9156i = (ac.i) nVar;
    }
}
