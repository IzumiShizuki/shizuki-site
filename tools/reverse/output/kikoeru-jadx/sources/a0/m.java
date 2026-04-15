package a0;

import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m extends jc.r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f78h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i10, int i11, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i10);
        this.f78h = i11;
    }

    @Override // jc.r, pc.r
    public final Object get() {
        switch (this.f78h) {
            case 0:
                return ((n2) this.f10819b).getValue();
            case 1:
                return ((n2) this.f10819b).getValue();
            case 2:
                return ((n2) this.f10819b).getValue();
            default:
                return this.f10819b.getClass().getSimpleName();
        }
    }
}
