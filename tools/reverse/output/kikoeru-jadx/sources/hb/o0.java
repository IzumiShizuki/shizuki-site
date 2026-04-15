package hb;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class o0 implements eb.a0 {
    @Override // eb.a0
    public final eb.z a(eb.m mVar, lb.a aVar) {
        Class superclass = aVar.f12165a;
        if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
            return null;
        }
        if (!superclass.isEnum()) {
            superclass = superclass.getSuperclass();
        }
        return new j(superclass);
    }
}
