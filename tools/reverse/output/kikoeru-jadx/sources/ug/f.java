package ug;

import b7.b1;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xg.g f21777a;

    public f(File file) {
        lh.u uVar = lh.l.f12595a;
        String str = lh.y.f12619b;
        lh.y yVarW = g5.w.w(file);
        jc.l.e(uVar, "fileSystem");
        yg.c cVar = yg.c.f26354l;
        jc.l.e(cVar, "taskRunner");
        this.f21777a = new xg.g(uVar, yVarW, cVar);
    }

    public final void b(b1 b1Var) {
        jc.l.e(b1Var, "request");
        xg.g gVar = this.f21777a;
        String strR = ud.s.r((t) b1Var.f1650b);
        synchronized (gVar) {
            jc.l.e(strR, "key");
            gVar.n();
            gVar.b();
            xg.g.L(strR);
            xg.c cVar = (xg.c) gVar.f25062i.get(strR);
            if (cVar == null) {
                return;
            }
            gVar.D(cVar);
            if (gVar.f25060g <= gVar.f25056c) {
                gVar.f25068o = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f21777a.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f21777a.flush();
    }

    public final synchronized void g() {
    }
}
