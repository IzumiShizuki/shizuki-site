package j2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9724b = new int[2];

    public abstract int[] a(int i10);

    public int[] b(int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return null;
        }
        int[] iArr = (int[]) this.f9724b;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    public String c() {
        String str = (String) this.f9723a;
        if (str != null) {
            return str;
        }
        jc.l.k("text");
        throw null;
    }

    public abstract int[] d(int i10);

    public abstract void e(m4.d dVar);
}
