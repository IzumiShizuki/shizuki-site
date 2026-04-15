package i3;

import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends jc.m implements ic.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f8933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f8934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f8935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f8936f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8937b;

    static {
        int i10 = 1;
        f8933c = new c(i10, 0);
        f8934d = new c(i10, 1);
        f8935e = new c(i10, 2);
        f8936f = new c(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, int i11) {
        super(i10);
        this.f8937b = i11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f8937b) {
            case 0:
                h hVar = (h) obj;
                hVar.getHandler().post(new a(1, hVar.f8966q));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return a0.f21526a;
    }
}
