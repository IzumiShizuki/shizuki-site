package tc;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20649e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Field field, boolean z10, int i10) {
        super(field, z10);
        this.f20649e = i10;
    }

    @Override // tc.w
    public void e(Object[] objArr) {
        switch (this.f20649e) {
            case 1:
                jc.l.e(objArr, "args");
                super.e(objArr);
                f(vb.l.v0(objArr));
                break;
            default:
                super.e(objArr);
                break;
        }
    }
}
