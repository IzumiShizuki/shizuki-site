package xa;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements e {
    public abstract boolean a(char c3);

    @Override // xa.e
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
