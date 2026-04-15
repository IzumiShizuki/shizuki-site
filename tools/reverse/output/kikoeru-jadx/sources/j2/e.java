package j2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static e f9794c;

    @Override // j2.b
    public final int[] a(int i10) {
        int length = c().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < length && c().charAt(i10) == '\n' && (c().charAt(i10) == '\n' || (i10 != 0 && c().charAt(i10 - 1) != '\n'))) {
            i10++;
        }
        if (i10 >= length) {
            return null;
        }
        int i11 = i10 + 1;
        while (i11 < length && !f(i11)) {
            i11++;
        }
        return b(i10, i11);
    }

    @Override // j2.b
    public final int[] d(int i10) {
        int length = c().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && c().charAt(i10 - 1) == '\n' && !f(i10)) {
            i10--;
        }
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        while (i11 > 0 && (c().charAt(i11) == '\n' || (i11 != 0 && c().charAt(i11 - 1) != '\n'))) {
            i11--;
        }
        return b(i11, i10);
    }

    public final boolean f(int i10) {
        if (i10 <= 0 || c().charAt(i10 - 1) == '\n') {
            return false;
        }
        return i10 == c().length() || c().charAt(i10) == '\n';
    }
}
