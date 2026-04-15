package ug;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f21778a;

    static {
        lh.i iVar = lh.i.f12572d;
        jc.l.e(iVar, "<this>");
        lh.f fVar = new lh.f();
        fVar.X(iVar);
        f21778a = new e0(fVar, iVar.f12573a.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final lh.i b() throws IOException {
        long jG = g();
        if (jG > 2147483647L) {
            throw new IOException(j2.h0.i(jG, "Cannot buffer entire body for content length: "));
        }
        lh.h hVarK = k();
        lh.i th2 = null;
        try {
            lh.i iVarN = hVarK.N();
            try {
                hVarK.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
            th = th2;
            th2 = iVarN;
        } catch (Throwable th4) {
            th = th4;
            if (hVarK != null) {
                try {
                    hVarK.close();
                } catch (Throwable th5) {
                    ub.a.a(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int iD = th2.d();
        if (jG == -1 || jG == iD) {
            return th2;
        }
        throw new IOException("Content-Length (" + jG + ") and stream length (" + iD + ") disagree");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        wg.e.b(k());
    }

    public abstract long g();

    public abstract v i();

    public abstract lh.h k();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final String n() {
        Charset charsetA;
        lh.h hVarK = k();
        String th2 = null;
        try {
            v vVarI = i();
            if (vVarI == null || (charsetA = v.a(vVarI)) == null) {
                charsetA = ef.a.f6541a;
            }
            String strF = hVarK.F(wg.g.e(hVarK, charsetA));
            try {
                hVarK.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
            th = th2;
            th2 = strF;
        } catch (Throwable th4) {
            th = th4;
            if (hVarK != null) {
                try {
                    hVarK.close();
                } catch (Throwable th5) {
                    ub.a.a(th, th5);
                }
            }
        }
        if (th == 0) {
            return th2;
        }
        throw th;
    }
}
