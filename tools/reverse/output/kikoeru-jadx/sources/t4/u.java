package t4;

import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeSet f20481b = new TreeSet(new t());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f20482c;

    public u(long j10) {
        this.f20480a = j10;
    }

    @Override // t4.g
    public final void a(k kVar) {
        this.f20481b.remove(kVar);
        this.f20482c -= kVar.f20451c;
    }

    @Override // t4.g
    public final void b(y yVar, z zVar) {
        this.f20481b.add(zVar);
        this.f20482c += zVar.f20451c;
        f(yVar, 0L);
    }

    @Override // t4.g
    public final void c(b bVar, long j10) {
        if (j10 != -1) {
            f(bVar, j10);
        }
    }

    @Override // t4.g
    public final boolean d() {
        return true;
    }

    @Override // t4.g
    public final void e(y yVar, z zVar, z zVar2) {
        a(zVar);
        b(yVar, zVar2);
    }

    public final void f(b bVar, long j10) {
        while (this.f20482c + j10 > this.f20480a && !this.f20481b.isEmpty()) {
            k kVar = (k) this.f20481b.first();
            y yVar = (y) bVar;
            synchronized (yVar) {
                yVar.n(kVar);
            }
        }
    }
}
