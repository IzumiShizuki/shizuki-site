package eb;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gb.n f6470a = new gb.n(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof r) && ((r) obj).f6470a.equals(this.f6470a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f6470a.hashCode();
    }
}
