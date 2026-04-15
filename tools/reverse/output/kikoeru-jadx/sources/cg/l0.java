package cg;

import g2.n1;
import g2.q1;
import l0.u0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ub.e f4071f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(j1.q qVar, Object obj, ub.e eVar, int i10, int i11) {
        super(2);
        this.f4067b = i11;
        this.f4068c = qVar;
        this.f4070e = obj;
        this.f4071f = eVar;
        this.f4069d = i10;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [ic.a, jc.m] */
    /* JADX WARN: Type inference failed for: r1v13, types: [ic.k, jc.m] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ic.k, jc.m] */
    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f4067b) {
            case 0:
                ((Number) obj2).intValue();
                gh.g.b((v) this.f4070e, (j1.q) this.f4068c, (f1.f) this.f4071f, (x0.o) obj, x0.v.D(this.f4069d | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                n1.b((q1) this.f4070e, (j1.q) this.f4068c, (ic.n) this.f4071f, (x0.o) obj, x0.v.D(this.f4069d | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                android.support.v4.media.session.b.c((ic.a) this.f4070e, (j3.q) this.f4068c, (f1.f) this.f4071f, (x0.o) obj, x0.v.D(this.f4069d | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                u0.a((l0.o) this.f4070e, (j1.d) this.f4068c, (f1.f) this.f4071f, (x0.o) obj, x0.v.D(this.f4069d | 1));
                break;
            case 4:
                ((Number) obj2).intValue();
                t.l lVar = (t.l) this.f4070e;
                ic.a aVar = (ic.a) this.f4068c;
                ?? r32 = (jc.m) this.f4071f;
                n7.b0.a(lVar, aVar, j1.n.f9689a, r32, (x0.o) obj, x0.v.D(this.f4069d | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                t.m.b((String) this.f4070e, (t.c) this.f4068c, (jc.m) this.f4071f, (x0.o) obj, x0.v.D(this.f4069d | 1));
                break;
            case 6:
                ((Number) obj2).intValue();
                t.m.c((j3.x) this.f4070e, (ic.a) this.f4068c, (jc.m) this.f4071f, (x0.o) obj, x0.v.D(this.f4069d | 1));
                break;
            case 7:
                ((Number) obj2).intValue();
                j1.q qVar = (j1.q) this.f4068c;
                ta.c cVar = (ta.c) this.f4070e;
                ic.k kVar = (ic.k) this.f4071f;
                ua.j.c(this.f4069d | 1, kVar, qVar, cVar, (x0.o) obj);
                break;
            default:
                ((Number) obj2).intValue();
                y.d.a((j1.q) this.f4068c, (j1.d) this.f4070e, (f1.f) this.f4071f, (x0.o) obj, x0.v.D(this.f4069d | 1));
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l0(j3.x xVar, ic.a aVar, ic.k kVar, int i10) {
        super(2);
        this.f4067b = 6;
        this.f4070e = xVar;
        this.f4068c = aVar;
        this.f4071f = (jc.m) kVar;
        this.f4069d = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, Object obj2, ic.n nVar, int i10, int i11) {
        super(2);
        this.f4067b = i11;
        this.f4070e = obj;
        this.f4068c = obj2;
        this.f4071f = nVar;
        this.f4069d = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l0(String str, t.c cVar, ic.a aVar, int i10) {
        super(2);
        this.f4067b = 5;
        this.f4070e = str;
        this.f4068c = cVar;
        this.f4071f = (jc.m) aVar;
        this.f4069d = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l0(t.l lVar, ic.a aVar, ic.k kVar, int i10) {
        super(2);
        this.f4067b = 4;
        this.f4070e = lVar;
        this.f4068c = aVar;
        this.f4071f = (jc.m) kVar;
        this.f4069d = i10;
    }
}
