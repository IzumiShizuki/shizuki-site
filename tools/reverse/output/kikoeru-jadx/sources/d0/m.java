package d0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m implements u.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f5370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u.c f5371c;

    public m(d dVar, u.c cVar) {
        this.f5370b = dVar;
        this.f5371c = cVar;
    }

    @Override // u.c
    public final float a(float f10, float f11, float f12) {
        float fA = this.f5371c.a(f10, f11, f12);
        boolean z10 = false;
        if (f10 <= 0.0f ? f10 + f11 <= 0.0f : f10 + f11 > f12) {
            z10 = true;
        }
        float fAbs = Math.abs(fA);
        d dVar = this.f5370b;
        if (fAbs == 0.0f || !z10) {
            if (Math.abs(dVar.f5313f) < 1.0E-6d) {
                return 0.0f;
            }
            float fN = dVar.f5313f * (-1.0f);
            if (((Boolean) dVar.F.getValue()).booleanValue()) {
                fN += dVar.n();
            }
            return nh.b.j(fN, -f12, f12);
        }
        float fN2 = dVar.f5313f * (-1);
        while (fA > 0.0f && fN2 < fA) {
            fN2 += dVar.n();
        }
        while (fA < 0.0f && fN2 > fA) {
            fN2 -= dVar.n();
        }
        return fN2;
    }
}
