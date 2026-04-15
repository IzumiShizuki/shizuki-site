package j0;

import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends jc.m implements ic.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f9581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f9582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f9583e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9584b;

    static {
        int i10 = 1;
        f9581c = new a(i10, 0);
        f9582d = new a(i10, 1);
        f9583e = new a(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11) {
        super(i10);
        this.f9584b = i11;
    }

    @Override // ic.k
    public final /* synthetic */ Object a(Object obj) {
        switch (this.f9584b) {
            case 0:
                ((Number) obj).longValue();
                break;
            case 1:
                break;
            default:
                int i10 = ((y2.i) obj).f25408a;
                break;
        }
        return a0.f21526a;
    }
}
