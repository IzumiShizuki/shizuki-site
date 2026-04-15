package w1;

import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends jc.m implements ic.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f23205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f23206d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23207b;

    static {
        int i10 = 0;
        f23205c = new g(i10, 0);
        f23206d = new g(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10, int i11) {
        super(i10);
        this.f23207b = i11;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f23207b) {
            case 0:
                return new q1.i(new PathMeasure());
            default:
                return ub.a0.f21526a;
        }
    }
}
