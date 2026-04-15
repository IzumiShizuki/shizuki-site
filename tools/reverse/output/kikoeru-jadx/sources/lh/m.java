package lh;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f12596b;

    public m(l lVar) {
        jc.l.e(lVar, "delegate");
        this.f12596b = lVar;
    }

    @Override // lh.l
    public final k B(y yVar) {
        jc.l.e(yVar, "path");
        k kVarB = this.f12596b.B(yVar);
        if (kVarB == null) {
            return null;
        }
        y yVar2 = kVarB.f12585c;
        if (yVar2 == null) {
            return kVarB;
        }
        boolean z10 = kVarB.f12583a;
        boolean z11 = kVarB.f12584b;
        Long l10 = kVarB.f12586d;
        Long l11 = kVarB.f12587e;
        Long l12 = kVarB.f12588f;
        Long l13 = kVarB.f12589g;
        Map map = kVarB.f12590h;
        jc.l.e(map, "extras");
        return new k(z10, z11, yVar2, l10, l11, l12, l13, map);
    }

    @Override // lh.l
    public final t D(y yVar) {
        return this.f12596b.D(yVar);
    }

    @Override // lh.l
    public f0 G(y yVar) {
        jc.l.e(yVar, "file");
        return this.f12596b.G(yVar);
    }

    @Override // lh.l
    public final h0 L(y yVar) {
        jc.l.e(yVar, "file");
        return this.f12596b.L(yVar);
    }

    @Override // lh.l
    public final f0 b(y yVar) {
        jc.l.e(yVar, "file");
        return this.f12596b.b(yVar);
    }

    @Override // lh.l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12596b.close();
    }

    @Override // lh.l
    public final void g(y yVar, y yVar2) {
        jc.l.e(yVar, "source");
        jc.l.e(yVar2, "target");
        this.f12596b.g(yVar, yVar2);
    }

    @Override // lh.l
    public final void k(y yVar) {
        jc.l.e(yVar, "dir");
        this.f12596b.k(yVar);
    }

    @Override // lh.l
    public final void n(y yVar) {
        jc.l.e(yVar, "path");
        this.f12596b.n(yVar);
    }

    public final String toString() {
        return jc.z.f10839a.b(getClass()).y() + '(' + this.f12596b + ')';
    }

    @Override // lh.l
    public final List u(y yVar) {
        jc.l.e(yVar, "dir");
        List<y> listU = this.f12596b.u(yVar);
        ArrayList arrayList = new ArrayList();
        for (y yVar2 : listU) {
            jc.l.e(yVar2, "path");
            arrayList.add(yVar2);
        }
        vb.p.L(arrayList);
        return arrayList;
    }
}
