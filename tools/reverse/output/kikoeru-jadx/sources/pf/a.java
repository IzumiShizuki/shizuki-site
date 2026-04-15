package pf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import jc.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f17112i = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f17113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f17114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f17115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f17120h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i10) {
        this.f17120h = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f17113a = new m();
        this.f17114b = new y();
        this.f17115c = b.f17124d;
        this.nextParkedWorker = c.f17130k;
        int iNanoTime = (int) System.nanoTime();
        this.f17118f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = pf.m.f17155d.get(r9);
        r0 = pf.m.f17154c.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (pf.m.f17156e.get(r9) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r9.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r7 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final pf.i a(boolean r12) {
        /*
            r11 = this;
            pf.b r0 = r11.f17115c
            pf.c r2 = r11.f17120h
            r7 = 0
            r8 = 1
            pf.m r9 = r11.f17113a
            pf.b r10 = pf.b.f17121a
            if (r0 != r10) goto Le
            goto L84
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = pf.c.f17128i
        L10:
            long r3 = r0.get(r2)
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r1 = 42
            long r5 = r5 >> r1
            int r1 = (int) r5
            if (r1 != 0) goto L73
            r9.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = pf.m.f17153b
            java.lang.Object r0 = r12.get(r9)
            pf.i r0 = (pf.i) r0
            if (r0 != 0) goto L2e
            goto L41
        L2e:
            boolean r1 = r0.f17144b
            if (r1 != r8) goto L41
        L32:
            boolean r1 = r12.compareAndSet(r9, r0, r7)
            if (r1 == 0) goto L3a
            r7 = r0
            goto L61
        L3a:
            java.lang.Object r1 = r12.get(r9)
            if (r1 == r0) goto L32
            goto L23
        L41:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = pf.m.f17155d
            int r12 = r12.get(r9)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = pf.m.f17154c
            int r0 = r0.get(r9)
        L4d:
            if (r12 == r0) goto L61
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = pf.m.f17156e
            int r1 = r1.get(r9)
            if (r1 != 0) goto L58
            goto L61
        L58:
            int r0 = r0 + (-1)
            pf.i r1 = r9.c(r0, r8)
            if (r1 == 0) goto L4d
            r7 = r1
        L61:
            if (r7 != 0) goto L72
            pf.f r12 = r2.f17136f
            java.lang.Object r12 = r12.d()
            pf.i r12 = (pf.i) r12
            if (r12 != 0) goto L71
            pf.i r12 = r11.i(r8)
        L71:
            return r12
        L72:
            return r7
        L73:
            r5 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r5 = r3 - r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = pf.c.f17128i
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L10
            r11.f17115c = r10
        L84:
            if (r12 == 0) goto Lb8
            int r12 = r2.f17131a
            int r12 = r12 * 2
            int r12 = r11.d(r12)
            if (r12 != 0) goto L91
            goto L92
        L91:
            r8 = 0
        L92:
            if (r8 == 0) goto L9b
            pf.i r12 = r11.e()
            if (r12 == 0) goto L9b
            return r12
        L9b:
            r9.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = pf.m.f17153b
            java.lang.Object r12 = r12.getAndSet(r9, r7)
            pf.i r12 = (pf.i) r12
            if (r12 != 0) goto Lac
            pf.i r12 = r9.b()
        Lac:
            if (r12 == 0) goto Laf
            return r12
        Laf:
            if (r8 != 0) goto Lbf
            pf.i r12 = r11.e()
            if (r12 == 0) goto Lbf
            return r12
        Lb8:
            pf.i r12 = r11.e()
            if (r12 == 0) goto Lbf
            return r12
        Lbf:
            r12 = 3
            pf.i r12 = r11.i(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.a.a(boolean):pf.i");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i10) {
        int i11 = this.f17118f;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f17118f = i14;
        int i15 = i10 - 1;
        return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
    }

    public final i e() {
        int iD = d(2);
        c cVar = this.f17120h;
        if (iD == 0) {
            i iVar = (i) cVar.f17135e.d();
            return iVar != null ? iVar : (i) cVar.f17136f.d();
        }
        i iVar2 = (i) cVar.f17136f.d();
        return iVar2 != null ? iVar2 : (i) cVar.f17135e.d();
    }

    public final void f(int i10) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17120h.f17134d);
        sb.append("-worker-");
        sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
        setName(sb.toString());
        this.indexInArray = i10;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f17115c;
        boolean z10 = bVar2 == b.f17121a;
        if (z10) {
            c.f17128i.addAndGet(this.f17120h, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f17115c = bVar;
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final pf.i i(int r26) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.a.i(int):pf.i");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.a.run():void");
    }
}
