package c2;

import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f3271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3272h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(long j10, Object obj, yb.c cVar, int i10) {
        super(2, cVar);
        this.f3269e = i10;
        this.f3271g = j10;
        this.f3272h = obj;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f3269e) {
            case 0:
                return new g0(this.f3271g, (i0) this.f3272h, cVar, 0);
            case 1:
                return new g0(this.f3271g, (w0) this.f3272h, cVar, 1);
            case 2:
                return new g0((i3.h) this.f3272h, this.f3271g, cVar, 2);
            case 3:
                return new g0((r.c) this.f3272h, this.f3271g, cVar, 3);
            case 4:
                return new g0((n9.e) this.f3272h, this.f3271g, cVar, 4);
            case 5:
                return new g0((uh.y) this.f3272h, this.f3271g, cVar, 5);
            default:
                return new g0((z9.r) this.f3272h, this.f3271g, cVar, 6);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f3269e) {
        }
        return ((g0) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (r.c.d(r0, r1, r3, null, r18, 12) == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01bd, code lost:
    
        if (hf.a0.l(8, r18) == r10) goto L96;
     */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.g0.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Object obj, long j10, yb.c cVar, int i10) {
        super(2, cVar);
        this.f3269e = i10;
        this.f3272h = obj;
        this.f3271g = j10;
    }
}
