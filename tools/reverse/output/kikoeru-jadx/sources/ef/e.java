package ef;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f6554c = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6555a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6556b = true;

    public e() {
        if (lc.b.i("")) {
            return;
        }
        lc.b.i("");
    }

    public final void a(String str, StringBuilder sb) {
        h0.w(sb, str, "prefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        a("    ", sb);
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
