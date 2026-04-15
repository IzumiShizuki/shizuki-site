package p5;

import m4.s1;
import m4.t1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f16702a;

    public o(t1 t1Var) {
        this.f16702a = t1Var;
    }

    public final void a() throws s1 {
        try {
            ((o) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(t1.class).newInstance(this.f16702a)).a();
        } catch (Exception e10) {
            if (!(e10 instanceof s1)) {
                throw new s1(e10);
            }
            int i10 = s1.f14584a;
        }
    }
}
