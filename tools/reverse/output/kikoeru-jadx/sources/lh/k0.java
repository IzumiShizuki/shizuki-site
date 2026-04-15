package lh;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y f12591e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f12592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f12593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f12594d;

    static {
        String str = y.f12619b;
        f12591e = g5.w.v("/");
    }

    public k0(y yVar, l lVar, LinkedHashMap linkedHashMap) {
        this.f12592b = yVar;
        this.f12593c = lVar;
        this.f12594d = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0127  */
    @Override // lh.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final lh.k B(lh.y r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lh.k0.B(lh.y):lh.k");
    }

    @Override // lh.l
    public final t D(y yVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // lh.l
    public final f0 G(y yVar) throws IOException {
        jc.l.e(yVar, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // lh.l
    public final h0 L(y yVar) throws Throwable {
        Throwable th2;
        b0 b0VarL;
        jc.l.e(yVar, "file");
        y yVar2 = f12591e;
        yVar2.getClass();
        mh.j jVar = (mh.j) this.f12594d.get(mh.c.b(yVar2, yVar, true));
        if (jVar == null) {
            throw new FileNotFoundException("no such file: " + yVar);
        }
        long j10 = jVar.f15193f;
        t tVarD = this.f12593c.D(this.f12592b);
        try {
            b0VarL = g8.a.l(tVarD.b(jVar.f15195h));
            try {
                tVarD.close();
                th2 = null;
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            if (tVarD != null) {
                try {
                    tVarD.close();
                } catch (Throwable th5) {
                    ub.a.a(th4, th5);
                }
            }
            th2 = th4;
            b0VarL = null;
        }
        if (th2 != null) {
            throw th2;
        }
        jc.l.e(b0VarL, "<this>");
        mh.b.f(b0VarL, null);
        if (jVar.f15194g == 0) {
            return new mh.g(b0VarL, j10, true);
        }
        return new mh.g(new r(g8.a.l(new mh.g(b0VarL, jVar.f15192e, true)), new Inflater(true)), j10, false);
    }

    @Override // lh.l
    public final f0 b(y yVar) throws IOException {
        jc.l.e(yVar, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // lh.l
    public final void g(y yVar, y yVar2) throws IOException {
        jc.l.e(yVar, "source");
        jc.l.e(yVar2, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // lh.l
    public final void k(y yVar) throws IOException {
        jc.l.e(yVar, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // lh.l
    public final void n(y yVar) throws IOException {
        jc.l.e(yVar, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // lh.l
    public final List u(y yVar) throws IOException {
        jc.l.e(yVar, "dir");
        y yVar2 = f12591e;
        yVar2.getClass();
        mh.j jVar = (mh.j) this.f12594d.get(mh.c.b(yVar2, yVar, true));
        if (jVar != null) {
            return vb.m.G0(jVar.f15204q);
        }
        throw new IOException("not a directory: " + yVar);
    }
}
