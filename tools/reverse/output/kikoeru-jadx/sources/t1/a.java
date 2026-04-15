package t1;

import q.t0;
import q1.q;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends jc.m implements ic.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f20136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f20137d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20138b;

    static {
        int i10 = 1;
        f20136c = new a(i10, 0);
        f20137d = new a(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11) {
        super(i10);
        this.f20138b = i11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f20138b) {
            case 0:
                break;
            default:
                t0.q((s1.d) obj, q.f17574g, 0L, 0.0f, 126);
                break;
        }
        return a0.f21526a;
    }
}
