package sa;

import n7.b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f19726a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qa.b f19727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f19728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f19729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f19730e;

    static {
        b0.u("RGB");
        qa.b bVar = qa.a.f18134b;
        f19727b = bVar;
        f19728c = i.f19705d;
        float[] fArrB = n.b(bVar, n.f19716a, n.f19717b, n.f19718c);
        f19729d = fArrB;
        f19730e = nh.b.z(fArrB);
    }

    @Override // sa.k
    public final j G() {
        return f19728c;
    }

    @Override // sa.k
    public final float[] f() {
        return f19729d;
    }

    public final String toString() {
        return "sRGB";
    }

    @Override // qa.c
    public final qa.b z() {
        return f19727b;
    }
}
