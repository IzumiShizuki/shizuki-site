package ba;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f2503a;

    public x(String[] strArr, int i10) {
        switch (i10) {
            case 1:
                this.f2503a = strArr;
                break;
            default:
                jc.l.e(strArr, "tables");
                this.f2503a = strArr;
                break;
        }
    }
}
