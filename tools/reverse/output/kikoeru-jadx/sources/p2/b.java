package p2;

import ic.k;
import jc.m;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends m implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f16503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f16504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f16505e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16506b;

    static {
        int i10 = 1;
        f16503c = new b(i10, 0);
        f16504d = new b(i10, 1);
        f16505e = new b(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f16506b = i11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f16506b) {
            case 0:
                ((Number) obj).longValue();
                return a0.f21526a;
            case 1:
                return Integer.valueOf(((h) obj).f16521b);
            default:
                return Integer.valueOf(((h) obj).f16522c.a());
        }
    }
}
