package f1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6631a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f6631a);
        sb.append(")@");
        int iHashCode = hashCode();
        gh.g.j(16);
        String string = Integer.toString(iHashCode, 16);
        jc.l.d(string, "toString(...)");
        sb.append(string);
        return sb.toString();
    }
}
