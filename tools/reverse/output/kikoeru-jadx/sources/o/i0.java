package o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends ac.h implements ic.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d1.c f15983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j0 f15984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long[] f15985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f15988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j0 f15989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d1.c f15990j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, d1.c cVar, yb.c cVar2) {
        super(2, cVar2);
        this.f15989i = j0Var;
        this.f15990j = cVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        i0 i0Var = new i0(this.f15989i, this.f15990j, cVar);
        i0Var.f15988h = obj;
        return i0Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((i0) o((df.l) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        df.l lVar;
        j0 j0Var;
        long[] jArr;
        int i10;
        d1.c cVar;
        int i11 = this.f15987g;
        if (i11 == 0) {
            ub.a.f(obj);
            lVar = (df.l) this.f15988h;
            j0Var = this.f15989i;
            h0 h0Var = j0Var.f15993b;
            jArr = h0Var.f15976c;
            i10 = h0Var.f15978e;
            cVar = this.f15990j;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f15986f;
            jArr = this.f15985e;
            j0Var = this.f15984d;
            cVar = this.f15983c;
            lVar = (df.l) this.f15988h;
            ub.a.f(obj);
        }
        if (i10 == Integer.MAX_VALUE) {
            return ub.a0.f21526a;
        }
        int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
        cVar.f5444c = i10;
        Object obj2 = j0Var.f15993b.f15975b[i10];
        this.f15988h = lVar;
        this.f15983c = cVar;
        this.f15984d = j0Var;
        this.f15985e = jArr;
        this.f15986f = i12;
        this.f15987g = 1;
        lVar.b(obj2, this);
        return zb.a.f26667a;
    }
}
