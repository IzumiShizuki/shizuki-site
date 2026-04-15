package sa;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f19716a = new s(Double.valueOf(0.64d), Double.valueOf(0.33d));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f19717b = new s(Double.valueOf(0.3d), Double.valueOf(0.6d));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f19718c = new s(Double.valueOf(0.15d), Double.valueOf(0.06d));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final qa.b f19719d = new qa.b("ACES", new s(Double.valueOf(0.32168d), Double.valueOf(0.33767d)));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f19720e = new s(Double.valueOf(0.7347d), Double.valueOf(0.2653d));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s f19721f = new s(Double.valueOf(0.0d), Double.valueOf(1.0d));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s f19722g = new s(Double.valueOf(1.0E-4d), Double.valueOf(-0.077d));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s f19723h = new s(Double.valueOf(0.713d), Double.valueOf(0.293d));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s f19724i = new s(Double.valueOf(0.165d), Double.valueOf(0.83d));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final s f19725j = new s(Double.valueOf(0.128d), Double.valueOf(0.044d));

    public static final l a(String str, qa.b bVar, j jVar, s sVar, s sVar2, s sVar3) {
        jc.l.e(bVar, "whitePoint");
        jc.l.e(sVar, "r");
        jc.l.e(sVar2, "g");
        jc.l.e(sVar3, "b");
        return new l(str, bVar, jVar, sVar, sVar2, sVar3);
    }

    public static final float[] b(qa.b bVar, s sVar, s sVar2, s sVar3) {
        float f10 = sVar.f19739a;
        float f11 = sVar2.f19739a;
        float f12 = sVar3.f19739a;
        float f13 = sVar.f19740b;
        float f14 = sVar2.f19740b;
        float f15 = sVar3.f19740b;
        float f16 = 1;
        float[] fArr = {f10, f11, f12, f13, f14, f15, (f16 - f10) - f13, (f16 - f11) - f14, (f16 - f12) - f15};
        s sVar4 = bVar.f18136b;
        float[] fArrZ = nh.b.z(fArr);
        float f17 = sVar4.f19739a;
        float f18 = sVar4.f19741c;
        float f19 = (f17 * f18) / sVar4.f19740b;
        float fA = sVar4.a();
        return nh.b.r(t0.w(fArrZ, 2, 0, fA, t0.w(fArrZ, 1, 0, f18, nh.a.i(0, 0, fArrZ) * f19)), t0.w(fArrZ, 2, 1, fA, t0.w(fArrZ, 1, 1, f18, nh.a.i(0, 1, fArrZ) * f19)), t0.w(fArrZ, 2, 2, fA, t0.w(fArrZ, 1, 2, f18, nh.a.i(0, 2, fArrZ) * f19)), fArr);
    }
}
