package fa;

import hf.y;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j9.u f7023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f7025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ic.k f7028j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ic.k kVar, yb.c cVar) {
        super(2, cVar);
        j9.u uVar = j9.u.f10753a;
        this.f7028j = kVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        j9.u uVar = j9.u.f10753a;
        p pVar = new p(this.f7028j, cVar);
        pVar.f7027i = obj;
        return pVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((p) o((y) obj, (yb.c) obj2)).u(a0.f21526a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        if (r3.f(true, r18) != r7) goto L38;
     */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.p.u(java.lang.Object):java.lang.Object");
    }
}
