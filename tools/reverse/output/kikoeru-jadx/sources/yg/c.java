package yg;

import c7.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import jc.l;
import q.t0;
import wg.e;
import wg.f;
import wg.g;
import xa.h;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f26353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f26354l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f26355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f26356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f26359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f26362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f26363i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f26364j;

    static {
        Logger logger = Logger.getLogger(c.class.getName());
        l.d(logger, "getLogger(...)");
        f26353k = logger;
        String str = g.f24232b + " TaskRunner";
        l.e(str, "name");
        f26354l = new c(new h(new f(str, true)));
    }

    public c(h hVar) {
        Logger logger = f26353k;
        l.e(logger, "logger");
        this.f26355a = hVar;
        this.f26356b = logger;
        this.f26357c = 10000;
        this.f26362h = new ArrayList();
        this.f26363i = new ArrayList();
        this.f26364j = new r(10, this);
    }

    public static final void a(c cVar, a aVar, long j10, boolean z10) {
        TimeZone timeZone = g.f24231a;
        b bVar = aVar.f26345c;
        l.b(bVar);
        if (bVar.f26350d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z11 = bVar.f26352f;
        bVar.f26352f = false;
        bVar.f26350d = null;
        cVar.f26362h.remove(bVar);
        if (j10 != -1 && !z11 && !bVar.f26349c) {
            bVar.f(aVar, j10, true);
        }
        if (bVar.f26351e.isEmpty()) {
            return;
        }
        cVar.f26363i.add(bVar);
        if (z10) {
            return;
        }
        cVar.e();
    }

    public final a b() {
        boolean z10;
        TimeZone timeZone = g.f24231a;
        while (true) {
            ArrayList arrayList = this.f26363i;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                a aVar2 = (a) ((b) it.next()).f26351e.get(0);
                long jMax = Math.max(0L, aVar2.f26346d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z10 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            ArrayList arrayList2 = this.f26362h;
            if (aVar != null) {
                TimeZone timeZone2 = g.f24231a;
                aVar.f26346d = -1L;
                b bVar = aVar.f26345c;
                l.b(bVar);
                bVar.f26351e.remove(aVar);
                arrayList.remove(bVar);
                bVar.f26350d = aVar;
                arrayList2.add(bVar);
                if (z10 || (!this.f26358d && !arrayList.isEmpty())) {
                    e();
                }
                return aVar;
            }
            if (!this.f26358d) {
                this.f26358d = true;
                this.f26359e = jNanoTime + jMin;
                try {
                    try {
                        TimeZone timeZone3 = g.f24231a;
                        if (jMin > 0) {
                            long j10 = jMin / 1000000;
                            Long.signum(j10);
                            long j11 = jMin - (1000000 * j10);
                            if (j10 > 0 || jMin > 0) {
                                wait(j10, (int) j11);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = g.f24231a;
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((b) arrayList2.get(size)).b();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            b bVar2 = (b) arrayList.get(size2);
                            bVar2.b();
                            if (bVar2.f26351e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.f26358d = false;
                }
            } else if (jMin < this.f26359e - jNanoTime) {
                notify();
            }
        }
        return null;
    }

    public final void c(b bVar) {
        l.e(bVar, "taskQueue");
        TimeZone timeZone = g.f24231a;
        if (bVar.f26350d == null) {
            boolean zIsEmpty = bVar.f26351e.isEmpty();
            ArrayList arrayList = this.f26363i;
            if (zIsEmpty) {
                arrayList.remove(bVar);
            } else {
                byte[] bArr = e.f24227a;
                l.e(arrayList, "<this>");
                if (!arrayList.contains(bVar)) {
                    arrayList.add(bVar);
                }
            }
        }
        if (this.f26358d) {
            notify();
        } else {
            e();
        }
    }

    public final b d() {
        int i10;
        synchronized (this) {
            i10 = this.f26357c;
            this.f26357c = i10 + 1;
        }
        return new b(this, t0.B(i10, "Q"));
    }

    public final void e() {
        TimeZone timeZone = g.f24231a;
        int i10 = this.f26360f;
        if (i10 > this.f26361g) {
            return;
        }
        this.f26360f = i10 + 1;
        r rVar = this.f26364j;
        l.e(rVar, "runnable");
        ((ThreadPoolExecutor) this.f26355a.f24888a).execute(rVar);
    }
}
