package ah;

import g5.w;
import jc.l;
import ug.d0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    static {
        lh.i iVar = lh.i.f12572d;
        w.t("\"\\");
        w.t("\t ,=");
    }

    public static final boolean a(d0 d0Var) {
        if (l.a((String) d0Var.f21756a.f1651c, "HEAD")) {
            return false;
        }
        int i10 = d0Var.f21759d;
        if (((i10 < 100 || i10 >= 200) && i10 != 204 && i10 != 304) || wg.g.d(d0Var) != -1) {
            return true;
        }
        String strA = d0Var.f21761f.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        return "chunked".equalsIgnoreCase(strA);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(ug.b r35, ug.t r36, ug.r r37) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.g.b(ug.b, ug.t, ug.r):void");
    }
}
