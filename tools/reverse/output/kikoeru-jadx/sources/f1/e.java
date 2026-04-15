package f1;

import f3.q;
import u.s1;
import u.u1;
import ub.a0;
import x0.a1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e extends jc.a implements ic.n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6622h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, i11, cls, obj, str, str2);
        this.f6622h = i12;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f6622h) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                ((f) this.f10807a).h(iIntValue, (x0.o) obj);
                return a0.f21526a;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                t0.j jVar = (t0.j) this.f10807a;
                boolean zB = jVar.b();
                a1 a1Var = jVar.f20128f;
                float f10 = 0.0f;
                if (!zB) {
                    if (jVar.a() > jVar.f20129g.e()) {
                        ((ic.a) jVar.f20124b.getValue()).b();
                    }
                    hf.a0.y(jVar.f20123a, null, null, new m0.m(jVar, f10, null, 3), 3);
                    if (a1Var.e() == 0.0f || fFloatValue < 0.0f) {
                        fFloatValue = 0.0f;
                    }
                    a1Var.f(0.0f);
                    f10 = fFloatValue;
                }
                return new Float(f10);
            default:
                long j10 = ((q) obj).f6675a;
                u1 u1Var = (u1) this.f10807a;
                hf.a0.y(u1Var.A.c(), null, null, new s1(u1Var, j10, null, 2), 3);
                return a0.f21526a;
        }
    }
}
