package ac;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements yb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f301a = new b();

    @Override // yb.c
    public final void h(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // yb.c
    public final yb.h s() {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
