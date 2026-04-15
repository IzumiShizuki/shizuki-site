package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20789b;

    public /* synthetic */ a(int i10) {
        this.f20789b = i10;
    }

    @Override // u.c
    public final float a(float f10, float f11, float f12) {
        switch (this.f20789b) {
            case 0:
                c.f20829a.getClass();
                float f13 = f11 + f10;
                if ((f10 >= 0.0f && f13 <= f12) || (f10 < 0.0f && f13 > f12)) {
                    return 0.0f;
                }
                float f14 = f13 - f12;
                return Math.abs(f10) < Math.abs(f14) ? f10 : f14;
            default:
                float fAbs = Math.abs((f11 + f10) - f10);
                float f15 = (0.3f * f12) - (0.0f * fAbs);
                float f16 = f12 - f15;
                if ((fAbs <= f12) && f16 < fAbs) {
                    f15 = f12 - fAbs;
                }
                return f10 - f15;
        }
    }
}
