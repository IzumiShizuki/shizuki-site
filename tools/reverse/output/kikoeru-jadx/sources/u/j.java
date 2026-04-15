package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f20954a;

    public j(k kVar) {
        this.f20954a = kVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ic.k, jc.m] */
    @Override // u.k1
    public final float a(float f10) {
        if (Float.isNaN(f10)) {
            return 0.0f;
        }
        k kVar = this.f20954a;
        float fFloatValue = ((Number) kVar.f20969a.a(Float.valueOf(f10))).floatValue();
        kVar.f20973e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        kVar.f20974f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
