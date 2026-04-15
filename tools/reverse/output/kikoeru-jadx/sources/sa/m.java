package sa;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f19714a = o.f19726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f19715b;

    static {
        qa.b bVar = qa.a.f18134b;
        i iVar = i.f19703b;
        f19715b = n.a("Linear sRGB", bVar, iVar, n.f19716a, n.f19717b, n.f19718c);
        qa.b bVar2 = n.f19719d;
        n.a("ACES2065-1", bVar2, iVar, n.f19720e, n.f19721f, n.f19722g);
        a aVar = a.f19687a;
        s sVar = n.f19723h;
        s sVar2 = n.f19724i;
        s sVar3 = n.f19725j;
        n.a("ACEScc", bVar2, aVar, sVar, sVar2, sVar3);
        n.a("ACEScct", bVar2, b.f19689a, sVar, sVar2, sVar3);
        n.a("ACEScg", bVar2, iVar, sVar, sVar2, sVar3);
        h hVar = new h(2.19921875d);
        Double dValueOf = Double.valueOf(0.64d);
        Double dValueOf2 = Double.valueOf(0.33d);
        s sVar4 = new s(dValueOf, dValueOf2);
        s sVar5 = new s(Double.valueOf(0.21d), Double.valueOf(0.71d));
        Double dValueOf3 = Double.valueOf(0.15d);
        Double dValueOf4 = Double.valueOf(0.06d);
        n.a("Adobe RGB", bVar, hVar, sVar4, sVar5, new s(dValueOf3, dValueOf4));
        int i10 = c.f19691a;
        n.a("BT.709", bVar, e.f19694a, new s(dValueOf, dValueOf2), new s(Double.valueOf(0.3d), Double.valueOf(0.6d)), new s(dValueOf3, dValueOf4));
        qa.b bVar3 = new qa.b("DCI P3", new s(Double.valueOf(0.314d), Double.valueOf(0.351d)));
        h hVar2 = new h(2.6d);
        Double dValueOf5 = Double.valueOf(0.68d);
        Double dValueOf6 = Double.valueOf(0.32d);
        s sVar6 = new s(dValueOf5, dValueOf6);
        Double dValueOf7 = Double.valueOf(0.265d);
        Double dValueOf8 = Double.valueOf(0.69d);
        n.a("DCI P3", bVar3, hVar2, sVar6, new s(dValueOf7, dValueOf8), new s(dValueOf3, dValueOf4));
        n.a("Display P3", bVar, i.f19705d, new s(dValueOf5, dValueOf6), new s(dValueOf7, dValueOf8), new s(dValueOf3, dValueOf4));
        n.a("ROMM RGB", qa.a.f18133a, i.f19704c, new s(Double.valueOf(0.7347d), Double.valueOf(0.2653d)), new s(Double.valueOf(0.1596d), Double.valueOf(0.8404d)), new s(Double.valueOf(0.0366d), Double.valueOf(1.0E-4d)));
    }
}
