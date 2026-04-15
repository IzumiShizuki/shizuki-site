package e7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends u {
    @Override // e7.u
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a) || !super.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // e7.u
    public final int hashCode() {
        return super.hashCode() * 961;
    }
}
