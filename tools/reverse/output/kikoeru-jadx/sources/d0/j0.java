package d0;

import u.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f5359a = 56;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f5360b = new w(0, 0, 0, 0, 0, v.k.f22128a, new g0(), hf.a0.b(yb.i.f26088a));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f5361c = new h0();

    public static final long a(w wVar, int i10) {
        long j10 = (((((long) i10) * ((long) (wVar.f5413c + wVar.f5412b))) + ((long) (-wVar.f5416f))) + ((long) wVar.f5414d)) - ((long) wVar.f5413c);
        e1 e1Var = wVar.f5415e;
        e1 e1Var2 = e1.f20883b;
        long jC = wVar.c();
        int i11 = (int) (e1Var == e1Var2 ? jC >> 32 : jC & 4294967295L);
        wVar.f5423m.getClass();
        long jK = j10 - ((long) (i11 - nh.b.k(0, 0, i11)));
        if (jK < 0) {
            return 0L;
        }
        return jK;
    }
}
