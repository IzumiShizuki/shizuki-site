package z9;

import hf.y;
import j9.b0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f26632g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, yb.c cVar) {
        super(2, cVar);
        this.f26630e = 2;
        b0 b0Var = b0.f10659a;
        this.f26632g = rVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        int i10 = this.f26630e;
        r rVar = this.f26632g;
        switch (i10) {
            case 0:
                return new i(rVar, cVar, 0);
            case 1:
                return new i(rVar, cVar, 1);
            default:
                b0 b0Var = b0.f10659a;
                return new i(rVar, cVar);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        y yVar = (y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f26630e) {
        }
        return ((i) o(yVar, cVar)).u(a0.f21526a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.i.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(r rVar, yb.c cVar, int i10) {
        super(2, cVar);
        this.f26630e = i10;
        this.f26632g = rVar;
    }
}
