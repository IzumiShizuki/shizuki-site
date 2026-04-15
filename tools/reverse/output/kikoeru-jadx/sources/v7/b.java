package v7;

import ic.k;
import ic.n;
import n7.a0;
import n7.v;
import n7.z;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ac.i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z f22745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f22747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f22748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f22749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v f22750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f22751l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(boolean z10, boolean z11, v vVar, yb.c cVar, k kVar, int i10) {
        super(2, cVar);
        this.f22744e = i10;
        this.f22748i = z10;
        this.f22749j = z11;
        this.f22750k = vVar;
        this.f22751l = kVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f22744e) {
            case 0:
                b bVar = new b(this.f22748i, this.f22749j, this.f22750k, cVar, this.f22751l, 0);
                bVar.f22747h = obj;
                return bVar;
            default:
                b bVar2 = new b(this.f22748i, this.f22749j, this.f22750k, cVar, this.f22751l, 1);
                bVar2.f22747h = obj;
                return bVar2;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f22744e) {
        }
        return ((b) o(a0Var, cVar)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.b.u(java.lang.Object):java.lang.Object");
    }
}
