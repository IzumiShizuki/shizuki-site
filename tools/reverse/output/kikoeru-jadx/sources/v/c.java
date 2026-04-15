package v;

import jc.m;
import jc.v;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f22099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.k f22100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(v vVar, ic.k kVar, int i10) {
        super(1);
        this.f22098b = i10;
        this.f22099c = vVar;
        this.f22100d = kVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f22098b) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                v vVar = this.f22099c;
                float f10 = vVar.f10835a - fFloatValue;
                vVar.f10835a = f10;
                this.f22100d.a(Float.valueOf(f10));
                break;
            default:
                float fFloatValue2 = ((Number) obj).floatValue();
                v vVar2 = this.f22099c;
                float f11 = vVar2.f10835a - fFloatValue2;
                vVar2.f10835a = f11;
                this.f22100d.a(Float.valueOf(f11));
                break;
        }
        return a0.f21526a;
    }
}
