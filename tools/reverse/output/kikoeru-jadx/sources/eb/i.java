package eb;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f6449d = new i("", "", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6452c;

    static {
        new i("\n", "  ", true);
    }

    public i(String str, String str2, boolean z10) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f6450a = str;
        this.f6451b = str2;
        this.f6452c = z10;
    }
}
