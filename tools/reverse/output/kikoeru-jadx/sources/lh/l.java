package lh;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class l implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f12595a;

    static {
        u uVar;
        try {
            Class.forName("java.nio.file.Files");
            uVar = new v();
        } catch (ClassNotFoundException unused) {
            uVar = new u();
        }
        f12595a = uVar;
        String str = y.f12619b;
        String property = System.getProperty("java.io.tmpdir");
        jc.l.d(property, "getProperty(...)");
        g5.w.v(property);
        ClassLoader classLoader = mh.h.class.getClassLoader();
        jc.l.d(classLoader, "getClassLoader(...)");
        new mh.h(classLoader);
    }

    public abstract k B(y yVar);

    public abstract t D(y yVar);

    public abstract f0 G(y yVar);

    public abstract h0 L(y yVar);

    public abstract f0 b(y yVar);

    public abstract void g(y yVar, y yVar2);

    public final void i(y yVar) {
        vb.j jVar = new vb.j();
        while (yVar != null && !q(yVar)) {
            jVar.addFirst(yVar);
            yVar = yVar.b();
        }
        Iterator<E> it = jVar.iterator();
        while (it.hasNext()) {
            k((y) it.next());
        }
    }

    public abstract void k(y yVar);

    public abstract void n(y yVar);

    public final void o(y yVar) {
        jc.l.e(yVar, "path");
        n(yVar);
    }

    public final boolean q(y yVar) {
        jc.l.e(yVar, "path");
        return B(yVar) != null;
    }

    public abstract List u(y yVar);

    public final k y(y yVar) throws FileNotFoundException {
        jc.l.e(yVar, "path");
        k kVarB = B(yVar);
        if (kVarB != null) {
            return kVarB;
        }
        throw new FileNotFoundException("no such file: " + yVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
