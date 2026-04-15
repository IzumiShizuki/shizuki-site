package o1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends jc.m implements ic.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f16105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f16106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f16107e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16108b;

    static {
        int i10 = 1;
        f16105c = new m(i10, 0);
        f16106d = new m(i10, 1);
        f16107e = new m(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i10, int i11) {
        super(i10);
        this.f16108b = i11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f16108b) {
            case 0:
                break;
            case 1:
                break;
        }
        return Boolean.valueOf(((v) obj).F0(7));
    }
}
