package gb;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f7479a;

    static {
        int i10;
        String property = System.getProperty("java.version");
        try {
            String[] strArrSplit = property.split("[._]", 3);
            i10 = Integer.parseInt(strArrSplit[0]);
            if (i10 == 1 && strArrSplit.length > 1) {
                i10 = Integer.parseInt(strArrSplit[1]);
            }
        } catch (NumberFormatException unused) {
            i10 = -1;
        }
        if (i10 == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i11 = 0; i11 < property.length(); i11++) {
                    char cCharAt = property.charAt(i11);
                    if (!Character.isDigit(cCharAt)) {
                        break;
                    }
                    sb.append(cCharAt);
                }
                i10 = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i10 = -1;
            }
        }
        if (i10 == -1) {
            i10 = 6;
        }
        f7479a = i10;
    }
}
