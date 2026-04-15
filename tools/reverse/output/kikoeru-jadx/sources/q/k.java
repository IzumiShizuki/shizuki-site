package q;

import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f17345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f17346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, long j10, int i10) {
        super(1);
        this.f17344b = i10;
        this.f17345c = lVar;
        this.f17346d = j10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        long j10;
        r.x xVar;
        long j11;
        switch (this.f17344b) {
            case 0:
                r.k1 k1Var = (r.k1) obj;
                Object objA = k1Var.a();
                l lVar = this.f17345c;
                if (jc.l.a(objA, lVar.f17352q.a())) {
                    j10 = f3.l.b(lVar.f17353r, androidx.compose.animation.a.f453a) ? this.f17346d : lVar.f17353r;
                } else {
                    n2 n2Var = (n2) lVar.f17352q.f17363d.g(k1Var.a());
                    j10 = n2Var != null ? ((f3.l) n2Var.getValue()).f6666a : 0L;
                }
                n2 n2Var2 = (n2) lVar.f17352q.f17363d.g(k1Var.c());
                long j12 = n2Var2 != null ? ((f3.l) n2Var2.getValue()).f6666a : 0L;
                v1 v1Var = (v1) lVar.f17351p.getValue();
                return (v1Var == null || (xVar = (r.x) v1Var.f17466a.q(new f3.l(j10), new f3.l(j12))) == null) ? r.d.q(5, null) : xVar;
            default:
                l lVar2 = this.f17345c;
                if (jc.l.a(obj, lVar2.f17352q.a())) {
                    j11 = f3.l.b(lVar2.f17353r, androidx.compose.animation.a.f453a) ? this.f17346d : lVar2.f17353r;
                } else {
                    n2 n2Var3 = (n2) lVar2.f17352q.f17363d.g(obj);
                    j11 = n2Var3 != null ? ((f3.l) n2Var3.getValue()).f6666a : 0L;
                }
                return new f3.l(j11);
        }
    }
}
