package a0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends jc.m implements ic.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f107e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f108b;

    static {
        int i10 = 1;
        f105c = new r(i10, 0);
        f106d = new r(i10, 1);
        f107e = new r(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10, int i11) {
        super(i10);
        this.f108b = i11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f108b) {
            case 0:
                return ub.a0.f21526a;
            case 1:
                ((Number) obj).intValue();
                return null;
            case 2:
                List list = (List) obj;
                return new g0(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            default:
                ((Number) obj).intValue();
                return null;
        }
    }
}
