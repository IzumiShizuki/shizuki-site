package y0;

import x0.d2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25325c;

    public /* synthetic */ i0(int i10, int i11, int i12, byte b10) {
        this.f25323a = i12;
        this.f25324b = i10;
        this.f25325c = i11;
    }

    public static yd.b a(i0 i0Var) {
        return new yd.b(i0Var.f25324b + i0Var.f25325c, 1, 1, (byte) 0);
    }

    public static yd.b b() {
        return new yd.b(0, 1, 1, (byte) 0);
    }

    public abstract void c(m4.j jVar, x0.c cVar, d2 d2Var, f1.m mVar, j0 j0Var);

    public abstract Object d(int i10);

    public x0.a e(m4.j jVar) {
        return null;
    }

    public String toString() {
        switch (this.f25323a) {
            case 0:
                String strY = jc.z.f10839a.b(getClass()).y();
                return strY == null ? "" : strY;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i10, int i11, int i12) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, 0, (byte) 0);
        this.f25323a = 0;
    }
}
