package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c2 implements sf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c2 f24099a = new c2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1 f24100b = new f1("kotlin.uuid.Uuid", uf.e.f21690j);

    @Override // sf.a
    public final uf.g a() {
        return f24100b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        String strConcat;
        String strR = bVar.r();
        jc.l.e(strR, "uuidString");
        int length = strR.length();
        if (length == 32) {
            long jB = ef.c.b(0, 16, strR);
            long jB2 = ef.c.b(16, 32, strR);
            if (jB != 0 || jB2 != 0) {
                return new gf.b(jB, jB2);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (strR.length() <= 64) {
                    strConcat = strR;
                } else {
                    String strSubstring = strR.substring(0, 64);
                    jc.l.d(strSubstring, "substring(...)");
                    strConcat = strSubstring.concat("...");
                }
                sb.append(strConcat);
                sb.append("\" of length ");
                sb.append(strR.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long jB3 = ef.c.b(0, 8, strR);
            lc.b.m(8, strR);
            long jB4 = ef.c.b(9, 13, strR);
            lc.b.m(13, strR);
            long jB5 = ef.c.b(14, 18, strR);
            lc.b.m(18, strR);
            long jB6 = ef.c.b(19, 23, strR);
            lc.b.m(23, strR);
            long j10 = (jB4 << 16) | (jB3 << 32) | jB5;
            long jB7 = ef.c.b(24, 36, strR) | (jB6 << 48);
            if (j10 != 0 || jB7 != 0) {
                return new gf.b(j10, jB7);
            }
        }
        return gf.b.f7539c;
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        gf.b bVar = (gf.b) obj;
        jc.l.e(bVar, "value");
        tVar.u(bVar.toString());
    }
}
