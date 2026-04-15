package da;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b1 f5852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bg.p f5855i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f5856j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b1 f5857k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(bg.p pVar, long j10, b1 b1Var, yb.c cVar) {
        super(2, cVar);
        this.f5855i = pVar;
        this.f5856j = j10;
        this.f5857k = b1Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        return new y0(this.f5855i, this.f5856j, this.f5857k, cVar);
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((y0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) throws Throwable {
        Object objP;
        b1 b1Var;
        long j10;
        int i10 = this.f5854h;
        m3.l lVar = q9.r0.f18084g;
        zb.a aVar = zb.a.f26667a;
        if (i10 == 0) {
            ub.a.f(obj);
            this.f5854h = 1;
            objP = lVar.p(this.f5855i, this);
            if (objP != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.f5853g;
            b1Var = this.f5852f;
            ub.a.f(obj);
            ((ub.n) obj).getClass();
            b1Var.w(j10, true);
            return ub.a0.f21526a;
        }
        ub.a.f(obj);
        objP = ((ub.n) obj).f21546a;
        if (!(objP instanceof ub.m)) {
            String str = ((bg.p) objP).f2937a;
            long j11 = this.f5856j;
            List listW = ud.b.w(String.valueOf(j11));
            this.f5851e = objP;
            b1 b1Var2 = this.f5857k;
            this.f5852f = b1Var2;
            this.f5853g = j11;
            this.f5854h = 2;
            if (lVar.o(str, listW, this) != aVar) {
                b1Var = b1Var2;
                j10 = j11;
                b1Var.w(j10, true);
            }
            return aVar;
        }
        return ub.a0.f21526a;
    }
}
