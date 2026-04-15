package mh;

import androidx.lifecycle.n0;
import g5.w;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import lh.f0;
import lh.h0;
import lh.t;
import lh.u;
import lh.y;
import ub.p;
import vb.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends lh.l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y f15183e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassLoader f15184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lh.l f15185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f15186d;

    static {
        String str = y.f12619b;
        f15183e = w.v("/");
    }

    public h(ClassLoader classLoader) {
        u uVar = lh.l.f12595a;
        jc.l.e(uVar, "systemFileSystem");
        this.f15184b = classLoader;
        this.f15185c = uVar;
        this.f15186d = ub.a.d(new n0(21, this));
    }

    @Override // lh.l
    public final lh.k B(y yVar) {
        jc.l.e(yVar, "path");
        if (!m3.l.n(yVar)) {
            return null;
        }
        y yVar2 = f15183e;
        yVar2.getClass();
        String strS = c.b(yVar2, yVar, true).c(yVar2).f12620a.s();
        for (ub.k kVar : (List) this.f15186d.getValue()) {
            lh.k kVarB = ((lh.l) kVar.f21543a).B(((y) kVar.f21544b).d(strS));
            if (kVarB != null) {
                return kVarB;
            }
        }
        return null;
    }

    @Override // lh.l
    public final t D(y yVar) throws FileNotFoundException {
        if (!m3.l.n(yVar)) {
            throw new FileNotFoundException("file not found: " + yVar);
        }
        y yVar2 = f15183e;
        yVar2.getClass();
        String strS = c.b(yVar2, yVar, true).c(yVar2).f12620a.s();
        for (ub.k kVar : (List) this.f15186d.getValue()) {
            try {
                return ((lh.l) kVar.f21543a).D(((y) kVar.f21544b).d(strS));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + yVar);
    }

    @Override // lh.l
    public final f0 G(y yVar) throws IOException {
        jc.l.e(yVar, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // lh.l
    public final h0 L(y yVar) throws IOException {
        jc.l.e(yVar, "file");
        if (!m3.l.n(yVar)) {
            throw new FileNotFoundException("file not found: " + yVar);
        }
        y yVar2 = f15183e;
        yVar2.getClass();
        URL resource = this.f15184b.getResource(c.b(yVar2, yVar, false).c(yVar2).f12620a.s());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + yVar);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        jc.l.d(inputStream, "getInputStream(...)");
        return g8.a.Z(inputStream);
    }

    @Override // lh.l
    public final f0 b(y yVar) throws IOException {
        jc.l.e(yVar, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // lh.l
    public final void g(y yVar, y yVar2) throws IOException {
        jc.l.e(yVar, "source");
        jc.l.e(yVar2, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // lh.l
    public final void k(y yVar) throws IOException {
        jc.l.e(yVar, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // lh.l
    public final void n(y yVar) throws IOException {
        jc.l.e(yVar, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // lh.l
    public final List u(y yVar) throws FileNotFoundException {
        jc.l.e(yVar, "dir");
        y yVar2 = f15183e;
        yVar2.getClass();
        String strS = c.b(yVar2, yVar, true).c(yVar2).f12620a.s();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (ub.k kVar : (List) this.f15186d.getValue()) {
            lh.l lVar = (lh.l) kVar.f21543a;
            y yVar3 = (y) kVar.f21544b;
            try {
                List listU = lVar.u(yVar3.d(strS));
                ArrayList<y> arrayList = new ArrayList();
                for (Object obj : listU) {
                    if (m3.l.n((y) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(n.K(arrayList, 10));
                for (y yVar4 : arrayList) {
                    jc.l.e(yVar4, "<this>");
                    arrayList2.add(yVar2.d(ef.u.i0(ef.n.F0(yVar4.f12620a.s(), yVar3.f12620a.s()), '\\', '/')));
                }
                vb.m.P(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return vb.m.G0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + yVar);
    }
}
