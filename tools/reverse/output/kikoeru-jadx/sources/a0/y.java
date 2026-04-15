package a0;

import ba.i1;
import ba.k0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f165i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i10, Object obj, Object obj2, yb.c cVar, int i11) {
        super(2, cVar);
        this.f161e = i11;
        this.f164h = i10;
        this.f163g = obj;
        this.f165i = obj2;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f161e) {
            case 0:
                y yVar = new y((g0) this.f165i, this.f164h, cVar, 0);
                yVar.f163g = obj;
                return yVar;
            case 1:
                y yVar2 = new y((i1) this.f165i, this.f164h, cVar, 1);
                yVar2.f163g = obj;
                return yVar2;
            case 2:
                return new y(this.f164h, (w0) this.f163g, (w0) this.f165i, cVar, 2);
            case 3:
                return new y((ma.e) this.f165i, cVar);
            default:
                return new y(this.f164h, (k0) this.f163g, (c0.z) this.f165i, cVar, 4);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f161e) {
        }
        return ((y) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
    
        if (h9.d.h(r34) == r7) goto L50;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:356:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r35) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instruction units count: 2136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.y.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, int i10, yb.c cVar, int i11) {
        super(2, cVar);
        this.f161e = i11;
        this.f165i = obj;
        this.f164h = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ma.e eVar, yb.c cVar) {
        super(2, cVar);
        this.f161e = 3;
        this.f165i = eVar;
    }
}
