package m0;

import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b4 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12724b;

    public /* synthetic */ b4(int i10, Object obj) {
        this.f12723a = i10;
        this.f12724b = obj;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10;
        switch (this.f12723a) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z8.a(((d9) this.f12724b).f12886i, f1.g.f(905505767, new d1(6), oVar), oVar, 48);
                } else {
                    oVar.Q();
                }
                return ub.a0.f21526a;
            case 1:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    u9.i iVar = (u9.i) this.f12724b;
                    jc.l.e(iVar, "<this>");
                    switch (iVar.ordinal()) {
                        case 0:
                            i10 = R.string.tag;
                            break;
                        case 1:
                            i10 = R.string.has_subtitle;
                            break;
                        case 2:
                            i10 = R.string.age_catalog;
                            break;
                        case 3:
                            i10 = R.string.multilingual;
                            break;
                        case 4:
                            i10 = R.string.duration;
                            break;
                        case 5:
                            i10 = R.string.circle;
                            break;
                        case 6:
                            i10 = R.string.voice_actor;
                            break;
                        case 7:
                            i10 = R.string.order_price;
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            i10 = R.string.order_dl;
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            i10 = R.string.order_rate;
                            break;
                        default:
                            throw new ce.j0();
                    }
                    z8.b(na.q.g(i10), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar2, 0, 0, 131070);
                } else {
                    oVar2.Q();
                }
                return ub.a0.f21526a;
            default:
                x0.o oVar3 = (x0.o) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    throw null;
                }
                oVar3.Q();
                return ub.a0.f21526a;
        }
    }
}
