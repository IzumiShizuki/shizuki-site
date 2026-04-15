package da;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements androidx.media3.exoplayer.offline.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f5674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f5675b;

    public e0(long j10, m0 m0Var) {
        this.f5674a = j10;
        this.f5675b = m0Var;
    }

    @Override // androidx.media3.exoplayer.offline.k
    public final void e(androidx.media3.exoplayer.offline.m mVar, androidx.media3.exoplayer.offline.d dVar, Exception exc) {
        Object objB;
        jc.l.e(mVar, "downloadManager");
        jc.l.e(dVar, "download");
        androidx.media3.exoplayer.offline.o oVar = dVar.f892a;
        long j10 = this.f5674a;
        m0 m0Var = this.f5675b;
        try {
            String str = oVar.f945a;
            jc.l.d(str, "id");
            if (ef.u.k0(str, "RJ" + j10 + "/", false)) {
                String str2 = oVar.f945a;
                jc.l.d(str2, "id");
                List listK0 = ef.n.K0(str2, new String[]{"/"});
                Object objZ = m0Var.z();
                if (listK0.size() <= 2) {
                    return;
                }
                int i10 = 0;
                for (Object obj : listK0.subList(1, listK0.size())) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        ud.b.H();
                        throw null;
                    }
                    String str3 = (String) obj;
                    b bVar = (b) objZ;
                    if (bVar != null) {
                        Iterator it = bVar.f5639d.iterator();
                        int i12 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i12 = -1;
                                break;
                            } else if (jc.l.a(((bg.o0) it.next()).a(), str3)) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (i10 == ud.b.r(listK0) - 1) {
                            bVar.f5637b.set(i12, dVar);
                        } else if (i12 != -1) {
                            objZ = bVar.f5640e.get(i12);
                        }
                    }
                    i10 = i11;
                }
            }
            objB = ub.a0.f21526a;
        } catch (Throwable th2) {
            objB = ub.a.b(th2);
        }
        Throwable thA = ub.n.a(objB);
        if (thA != null) {
            thA.printStackTrace();
        }
    }

    @Override // androidx.media3.exoplayer.offline.k
    public final /* synthetic */ void d(androidx.media3.exoplayer.offline.m mVar) {
    }

    @Override // androidx.media3.exoplayer.offline.k
    public final /* synthetic */ void g(androidx.media3.exoplayer.offline.m mVar) {
    }

    @Override // androidx.media3.exoplayer.offline.k
    public final /* synthetic */ void a(androidx.media3.exoplayer.offline.m mVar, boolean z10) {
    }

    @Override // androidx.media3.exoplayer.offline.k
    public final /* synthetic */ void c(androidx.media3.exoplayer.offline.m mVar, androidx.media3.exoplayer.offline.d dVar) {
    }

    @Override // androidx.media3.exoplayer.offline.k
    public final /* synthetic */ void f(androidx.media3.exoplayer.offline.m mVar, boolean z10) {
    }

    @Override // androidx.media3.exoplayer.offline.k
    public final /* synthetic */ void b(androidx.media3.exoplayer.offline.m mVar, i5.c cVar, int i10) {
    }
}
