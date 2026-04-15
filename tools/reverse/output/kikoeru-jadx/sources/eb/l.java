package eb;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class l extends hb.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f6456a = null;

    @Override // eb.z
    public final Object a(mb.a aVar) {
        z zVar = this.f6456a;
        if (zVar != null) {
            return zVar.a(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) {
        z zVar = this.f6456a;
        if (zVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        zVar.b(bVar, obj);
    }

    @Override // hb.t
    public final z c() {
        z zVar = this.f6456a;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
