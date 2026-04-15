package c0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends jc.m implements ic.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f3099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f3100d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3101b;

    static {
        int i10 = 1;
        f3099c = new l(i10, 0);
        f3100d = new l(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10, int i11) {
        super(i10);
        this.f3101b = i11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f3101b) {
            case 0:
                return ub.a0.f21526a;
            default:
                List list = (List) obj;
                return new z((int[]) list.get(0), (int[]) list.get(1));
        }
    }
}
