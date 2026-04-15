package uh;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w extends jc.m implements ic.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f22065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f22066d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22067b;

    static {
        int i10 = 2;
        f22065c = new w(i10, 0);
        f22066d = new w(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i10, int i11) {
        super(i10);
        this.f22067b = i11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f22067b) {
            case 0:
                p1.c cVar = (p1.c) obj;
                p1.c cVar2 = (p1.c) obj2;
                jc.l.e(cVar, "draggingItem");
                jc.l.e(cVar2, "item");
                float f10 = cVar.f16484b;
                float f11 = cVar.f16486d;
                float f12 = p1.b.f(cVar2.b());
                return Boolean.valueOf(f12 >= f10 && f12 < f11);
            default:
                p1.c cVar3 = (p1.c) obj;
                p1.c cVar4 = (p1.c) obj2;
                jc.l.e(cVar3, "draggingItem");
                jc.l.e(cVar4, "item");
                float f13 = cVar3.f16483a;
                float f14 = cVar3.f16485c;
                float fE = p1.b.e(cVar4.b());
                return Boolean.valueOf(fE >= f13 && fE < f14);
        }
    }
}
