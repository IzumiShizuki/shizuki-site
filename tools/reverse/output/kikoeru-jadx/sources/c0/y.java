package c0;

import u.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z f3178g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, int i10, yb.c cVar) {
        super(2, cVar);
        this.f3176e = 0;
        this.f3178g = zVar;
        this.f3177f = i10;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f3176e) {
            case 0:
                return new y(this.f3178g, this.f3177f, cVar);
            case 1:
                return new y(this.f3178g, cVar, 1);
            default:
                return new y(this.f3178g, cVar, 2);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f3176e) {
            case 0:
                y yVar = (y) o((k1) obj, (yb.c) obj2);
                ub.a0 a0Var = ub.a0.f21526a;
                yVar.u(a0Var);
                break;
        }
        return ((y) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.List] */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.y.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(z zVar, yb.c cVar, int i10) {
        super(2, cVar);
        this.f3176e = i10;
        this.f3178g = zVar;
    }
}
