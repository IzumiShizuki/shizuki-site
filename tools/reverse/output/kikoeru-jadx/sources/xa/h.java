package xa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import se.w;
import ug.g0;
import xc.l;
import zg.o;
import zg.p;
import zg.r;
import zg.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements bf.b, y4.h, zg.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24888a;

    public /* synthetic */ h(Object obj) {
        this.f24888a = obj;
    }

    @Override // zg.h
    public o a() throws Throwable {
        s sVarB;
        IOException iOException = null;
        while (!((p) this.f24888a).f26912k.f26883p) {
            try {
                sVarB = ((p) this.f24888a).b();
            } catch (IOException e10) {
                if (iOException == null) {
                    iOException = e10;
                } else {
                    ub.a.a(iOException, e10);
                }
                if (!((p) this.f24888a).a(null)) {
                    throw iOException;
                }
            }
            if (!sVarB.a()) {
                r rVarD = sVarB.d();
                if (rVarD.f26920b == null && rVarD.f26921c == null) {
                    rVarD = sVarB.g();
                }
                s sVar = rVarD.f26920b;
                Throwable th2 = rVarD.f26921c;
                if (th2 != null) {
                    throw th2;
                }
                if (sVar != null) {
                    ((p) this.f24888a).f26917p.addFirst(sVar);
                }
            }
            return sVarB.c();
        }
        throw new IOException("Canceled");
    }

    @Override // y4.h
    public long b(long j10) {
        return 0L;
    }

    @Override // bf.b
    public Iterable d(Object obj) {
        l lVar = (l) this.f24888a;
        Collection collectionI = ((yc.e) obj).Q().i();
        jc.l.d(collectionI, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionI.iterator();
        while (it.hasNext()) {
            yc.h hVarH = ((w) it.next()).t().h();
            yc.e eVarF = null;
            yc.h hVarA = hVarH != null ? hVarH.a() : null;
            yc.e eVar = hVarA instanceof yc.e ? (yc.e) hVarA : null;
            if (eVar != null && (eVarF = lVar.f(eVar)) == null) {
                eVarF = eVar;
            }
            if (eVarF != null) {
                arrayList.add(eVarF);
            }
        }
        return arrayList;
    }

    @Override // y4.h
    public long e(long j10, long j11) {
        return 0L;
    }

    @Override // zg.h
    public p f() {
        return (p) this.f24888a;
    }

    @Override // y4.h
    public long g(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // y4.h
    public z4.j h(long j10) {
        return (z4.j) this.f24888a;
    }

    public synchronized void i(g0 g0Var) {
        jc.l.e(g0Var, "route");
        ((LinkedHashSet) this.f24888a).remove(g0Var);
    }

    public Object j(uf.g gVar, yf.l lVar) {
        jc.l.e(gVar, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) this.f24888a).get(gVar);
        Object obj = map != null ? map.get(lVar) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // y4.h
    public long l(long j10, long j11) {
        return 0L;
    }

    @Override // y4.h
    public boolean s() {
        return true;
    }

    @Override // y4.h
    public long v() {
        return 0L;
    }

    @Override // y4.h
    public long x(long j10) {
        return 1L;
    }

    @Override // y4.h
    public long y(long j10, long j11) {
        return 1L;
    }

    public h(int i10) {
        switch (i10) {
            case 6:
                this.f24888a = new LinkedHashSet();
                break;
            default:
                this.f24888a = new ConcurrentHashMap(16);
                break;
        }
    }

    public h(wg.f fVar) {
        this.f24888a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), fVar);
    }

    @Override // y4.h
    public long c(long j10, long j11) {
        return j11;
    }
}
