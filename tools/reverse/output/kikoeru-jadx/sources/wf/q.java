package wf;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends ClassValue {
    @Override // java.lang.ClassValue
    public final Object computeValue(Class cls) {
        jc.l.e(cls, "type");
        t0 t0Var = new t0();
        t0Var.f24184a = new SoftReference(null);
        return t0Var;
    }
}
