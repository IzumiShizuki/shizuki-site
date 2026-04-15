package ac;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends a {
    public g(yb.c cVar) {
        super(cVar);
        if (cVar != null && cVar.s() != yb.i.f26088a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // yb.c
    public final yb.h s() {
        return yb.i.f26088a;
    }
}
