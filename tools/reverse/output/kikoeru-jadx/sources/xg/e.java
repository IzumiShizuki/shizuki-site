package xg;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import jc.l;
import lh.a0;
import zg.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends yg.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f25047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25048f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, Object obj, String str) {
        super(str);
        this.f25047e = i10;
        this.f25048f = obj;
    }

    private final long b() {
        g gVar = (g) this.f25048f;
        synchronized (gVar) {
            if (!gVar.f25066m || gVar.f25067n) {
                return -1L;
            }
            try {
                gVar.G();
            } catch (IOException unused) {
                gVar.f25068o = true;
            }
            try {
                if (gVar.o()) {
                    gVar.B();
                    gVar.f25063j = 0;
                }
            } catch (IOException unused2) {
                gVar.f25069p = true;
                a0 a0Var = gVar.f25061h;
                if (a0Var != null) {
                    wg.e.b(a0Var);
                }
                gVar.f25061h = g8.a.k(new lh.d());
            }
            return -1L;
        }
    }

    @Override // yg.a
    public final long a() {
        o oVar;
        switch (this.f25047e) {
            case 0:
                return b();
            case 1:
                ((ic.a) this.f25048f).b();
                return -1L;
            default:
                h9.b bVar = (h9.b) this.f25048f;
                long jNanoTime = System.nanoTime();
                long j10 = (jNanoTime - bVar.f8234a) + 1;
                Iterator it = ((ConcurrentLinkedQueue) bVar.f8237d).iterator();
                l.d(it, "iterator(...)");
                long j11 = Long.MAX_VALUE;
                int i10 = 0;
                int i11 = 0;
                o oVar2 = null;
                o oVar3 = null;
                while (it.hasNext()) {
                    o oVar4 = (o) it.next();
                    l.b(oVar4);
                    synchronized (oVar4) {
                        if (bVar.a(oVar4, jNanoTime) > 0) {
                            i11++;
                        } else {
                            long j12 = j11;
                            long j13 = oVar4.f26901q;
                            if (j13 < j10) {
                                j10 = j13;
                                oVar2 = oVar4;
                            }
                            i10++;
                            if (j13 < j12) {
                                j11 = j13;
                                oVar3 = oVar4;
                            } else {
                                j11 = j12;
                            }
                        }
                    }
                }
                long j14 = j11;
                if (oVar2 != null) {
                    oVar = oVar2;
                } else if (i10 > 5) {
                    oVar = oVar3;
                    j10 = j14;
                } else {
                    j10 = -1;
                    oVar = null;
                }
                if (oVar == null) {
                    if (oVar3 != null) {
                        return (j14 + bVar.f8234a) - jNanoTime;
                    }
                    if (i11 > 0) {
                        return bVar.f8234a;
                    }
                    return -1L;
                }
                synchronized (oVar) {
                    if (oVar.f26900p.isEmpty() && oVar.f26901q == j10) {
                        oVar.f26894j = true;
                        ((ConcurrentLinkedQueue) bVar.f8237d).remove(oVar);
                        wg.g.b(oVar.f26889e);
                        if (!((ConcurrentLinkedQueue) bVar.f8237d).isEmpty()) {
                            return 0L;
                        }
                        ((yg.b) bVar.f8235b).a();
                        return 0L;
                    }
                    return 0L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, ic.a aVar) {
        super(str);
        this.f25047e = 1;
        this.f25048f = aVar;
    }
}
