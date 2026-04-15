package da;

import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f5689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f5690g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(long j10, boolean z10, yb.c cVar, int i10) {
        super(2, cVar);
        this.f5688e = i10;
        this.f5689f = j10;
        this.f5690g = z10;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f5688e) {
            case 0:
                return new g0(this.f5689f, this.f5690g, cVar, 0);
            case 1:
                return new g0(this.f5689f, this.f5690g, cVar, 1);
            default:
                return new g0(this.f5689f, this.f5690g, cVar, 2);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f5688e) {
        }
        return ((g0) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        Object objH;
        Object objB;
        Object objI;
        Object objI2;
        int i10 = this.f5688e;
        boolean z10 = this.f5690g;
        long j10 = this.f5689f;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                ub.p pVar = b9.d.f2273a;
                ub.n nVar = null;
                if (!((Boolean) a0.c.F(Boolean.TYPE, gg.c.a(), "disableLocalDownloadMetadata", Boolean.FALSE)).booleanValue()) {
                    File file = new File(b9.d.a(), "RJ" + j10 + ".tree");
                    if (file.exists()) {
                        try {
                            String strH0 = fc.b.h0(file);
                            xf.r rVar = na.w.f15765a;
                            rVar.getClass();
                            objB = (List) rVar.a(strH0, new wf.d(bg.o0.Companion.serializer(), 0));
                        } catch (Throwable th2) {
                            objB = ub.a.b(th2);
                        }
                        nVar = new ub.n(objB);
                    }
                    break;
                }
                if (nVar == null || z10) {
                    String str = ag.z.f369a;
                    objH = ag.z.h(j10, a9.i.f(), z10);
                } else {
                    objH = nVar.f21546a;
                }
                return new ub.n(objH);
            case 1:
                ub.a.f(obj);
                ub.p pVar2 = b9.d.f2273a;
                ub.n nVarC = b9.d.c(j10);
                if (nVarC == null || z10) {
                    String str2 = ag.z.f369a;
                    objI = ag.z.i(j10, a9.i.f(), z10);
                } else {
                    objI = nVarC.f21546a;
                }
                return new ub.n(objI);
            default:
                ub.a.f(obj);
                ub.p pVar3 = b9.d.f2273a;
                ub.n nVarC2 = b9.d.c(j10);
                if (nVarC2 != null) {
                    objI2 = nVarC2.f21546a;
                } else {
                    String str3 = ag.z.f369a;
                    objI2 = ag.z.i(j10, a9.i.f(), z10);
                }
                return new ub.n(objI2);
        }
    }
}
