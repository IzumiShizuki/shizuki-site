package b5;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f1525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.media3.exoplayer.offline.u f1526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f1527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f1530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p4.h f1531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m3.l f1532i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4.k f1533j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d0 f1534k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final UUID f1535l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Looper f1536m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f1537n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1538o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1539p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HandlerThread f1540q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f1541r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public u4.a f1542s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k f1543t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f1544u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f1545v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v f1546w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public w f1547x;

    public e(UUID uuid, x xVar, androidx.media3.exoplayer.offline.u uVar, f fVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap map, d0 d0Var, Looper looper, m3.l lVar, w4.k kVar) {
        this.f1535l = uuid;
        this.f1526c = uVar;
        this.f1527d = fVar;
        this.f1525b = xVar;
        this.f1528e = z10;
        this.f1529f = z11;
        if (bArr != null) {
            this.f1545v = bArr;
            this.f1524a = null;
        } else {
            list.getClass();
            this.f1524a = Collections.unmodifiableList(list);
        }
        this.f1530g = map;
        this.f1534k = d0Var;
        this.f1531h = new p4.h();
        this.f1532i = lVar;
        this.f1533j = kVar;
        this.f1538o = 2;
        this.f1536m = looper;
        this.f1537n = new d(this, looper, 0);
    }

    @Override // b5.l
    public final UUID a() {
        p();
        return this.f1535l;
    }

    @Override // b5.l
    public final void b(q qVar) {
        p();
        if (this.f1539p < 0) {
            p4.c.n("DefaultDrmSession", "Session reference count less than zero: " + this.f1539p);
            this.f1539p = 0;
        }
        if (qVar != null) {
            p4.h hVar = this.f1531h;
            synchronized (hVar.f16573a) {
                try {
                    ArrayList arrayList = new ArrayList(hVar.f16576d);
                    arrayList.add(qVar);
                    hVar.f16576d = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) hVar.f16574b.get(qVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(hVar.f16575c);
                        hashSet.add(qVar);
                        hVar.f16575c = Collections.unmodifiableSet(hashSet);
                    }
                    hVar.f16574b.put(qVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i10 = this.f1539p + 1;
        this.f1539p = i10;
        if (i10 == 1) {
            p4.c.i(this.f1538o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f1540q = handlerThread;
            handlerThread.start();
            this.f1541r = new b(this, this.f1540q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (qVar != null && k() && this.f1531h.a(qVar) == 1) {
            qVar.c(this.f1538o);
        }
        j jVar = this.f1527d.f1548a;
        if (jVar.f1566k != -9223372036854775807L) {
            jVar.f1569n.remove(this);
            Handler handler = jVar.f1575t;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // b5.l
    public final void c(q qVar) {
        p();
        int i10 = this.f1539p;
        if (i10 <= 0) {
            p4.c.n("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f1539p = i11;
        if (i11 == 0) {
            this.f1538o = 0;
            d dVar = this.f1537n;
            int i12 = p4.c0.f16548a;
            dVar.removeCallbacksAndMessages(null);
            b bVar = this.f1541r;
            synchronized (bVar) {
                bVar.removeCallbacksAndMessages(null);
                bVar.f1508b = true;
            }
            this.f1541r = null;
            this.f1540q.quit();
            this.f1540q = null;
            this.f1542s = null;
            this.f1543t = null;
            this.f1546w = null;
            this.f1547x = null;
            byte[] bArr = this.f1544u;
            if (bArr != null) {
                this.f1525b.p(bArr);
                this.f1544u = null;
            }
        }
        if (qVar != null) {
            this.f1531h.i(qVar);
            if (this.f1531h.a(qVar) == 0) {
                qVar.e();
            }
        }
        f fVar = this.f1527d;
        int i13 = this.f1539p;
        j jVar = fVar.f1548a;
        if (i13 == 1 && jVar.f1570o > 0 && jVar.f1566k != -9223372036854775807L) {
            jVar.f1569n.add(this);
            Handler handler = jVar.f1575t;
            handler.getClass();
            handler.postAtTime(new a9.m(4, this), this, SystemClock.uptimeMillis() + jVar.f1566k);
        } else if (i13 == 0) {
            jVar.f1567l.remove(this);
            if (jVar.f1572q == this) {
                jVar.f1572q = null;
            }
            if (jVar.f1573r == this) {
                jVar.f1573r = null;
            }
            androidx.media3.exoplayer.offline.u uVar = jVar.f1563h;
            HashSet hashSet = (HashSet) uVar.f968b;
            hashSet.remove(this);
            if (((e) uVar.f969c) == this) {
                uVar.f969c = null;
                if (!hashSet.isEmpty()) {
                    e eVar = (e) hashSet.iterator().next();
                    uVar.f969c = eVar;
                    w wVarH = eVar.f1525b.h();
                    eVar.f1547x = wVarH;
                    b bVar2 = eVar.f1541r;
                    int i14 = p4.c0.f16548a;
                    wVarH.getClass();
                    bVar2.getClass();
                    bVar2.obtainMessage(1, new c(j5.u.f10444b.getAndIncrement(), true, SystemClock.elapsedRealtime(), wVarH)).sendToTarget();
                }
            }
            if (jVar.f1566k != -9223372036854775807L) {
                Handler handler2 = jVar.f1575t;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                jVar.f1569n.remove(this);
            }
        }
        jVar.j();
    }

    @Override // b5.l
    public final boolean d() {
        p();
        return this.f1528e;
    }

    @Override // b5.l
    public final int e() {
        p();
        return this.f1538o;
    }

    @Override // b5.l
    public final boolean f(String str) {
        p();
        byte[] bArr = this.f1544u;
        p4.c.j(bArr);
        return this.f1525b.n(bArr, str);
    }

    @Override // b5.l
    public final k g() {
        p();
        if (this.f1538o == 1) {
            return this.f1543t;
        }
        return null;
    }

    @Override // b5.l
    public final u4.a h() {
        p();
        return this.f1542s;
    }

    public final void i(a aVar) {
        Set set;
        p4.h hVar = this.f1531h;
        synchronized (hVar.f16573a) {
            set = hVar.f16575c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((q) it.next()).a();
        }
    }

    public final void j(boolean z10) {
        long jMin;
        String str;
        Set set;
        if (this.f1529f) {
            return;
        }
        byte[] bArr = this.f1544u;
        int i10 = p4.c0.f16548a;
        boolean z11 = true;
        if (this.f1545v == null) {
            o(bArr, 1, z10);
            return;
        }
        if (this.f1538o != 4) {
            try {
                this.f1525b.o(this.f1544u, this.f1545v);
            } catch (Exception | NoSuchMethodError e10) {
                l(e10, 1);
                z11 = false;
            }
            if (!z11) {
                return;
            }
        }
        if (m4.g.f14211d.equals(this.f1535l)) {
            p();
            byte[] bArr2 = this.f1544u;
            Pair pair = null;
            Map mapF = bArr2 == null ? null : this.f1525b.f(bArr2);
            if (mapF != null) {
                long j10 = -9223372036854775807L;
                try {
                    str = (String) mapF.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                long j11 = str != null ? Long.parseLong(str) : -9223372036854775807L;
                Long lValueOf = Long.valueOf(j11);
                try {
                    String str2 = (String) mapF.get("PlaybackDurationRemaining");
                    if (str2 != null) {
                        j10 = Long.parseLong(str2);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j10));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (jMin <= 60) {
            p4.c.l("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            o(bArr, 2, z10);
            return;
        }
        if (jMin <= 0) {
            l(new e0(), 2);
            return;
        }
        this.f1538o = 4;
        p4.h hVar = this.f1531h;
        synchronized (hVar.f16573a) {
            set = hVar.f16575c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((q) it.next()).b();
        }
    }

    public final boolean k() {
        int i10 = this.f1538o;
        return i10 == 3 || i10 == 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.lang.Throwable r6, int r7) {
        /*
            r5 = this;
            b5.k r0 = new b5.k
            boolean r1 = r6 instanceof android.media.MediaDrm.MediaDrmStateException
            r2 = 1
            if (r1 == 0) goto L17
            r7 = r6
            android.media.MediaDrm$MediaDrmStateException r7 = (android.media.MediaDrm.MediaDrmStateException) r7
            java.lang.String r7 = r7.getDiagnosticInfo()
            int r7 = p4.c0.x(r7)
            int r7 = p4.c0.w(r7)
            goto L66
        L17:
            int r1 = p4.c0.f16548a
            r3 = 23
            r4 = 6006(0x1776, float:8.416E-42)
            if (r1 < r3) goto L28
            boolean r1 = v3.b.u(r6)
            if (r1 == 0) goto L28
        L25:
            r7 = 6006(0x1776, float:8.416E-42)
            goto L66
        L28:
            boolean r1 = r6 instanceof android.media.NotProvisionedException
            r3 = 6002(0x1772, float:8.41E-42)
            if (r1 != 0) goto L5d
            boolean r1 = a2.c.P(r6)
            if (r1 == 0) goto L35
            goto L5d
        L35:
            boolean r1 = r6 instanceof android.media.DeniedByServerException
            if (r1 == 0) goto L3c
            r7 = 6007(0x1777, float:8.418E-42)
            goto L66
        L3c:
            boolean r1 = r6 instanceof b5.g0
            if (r1 == 0) goto L43
            r7 = 6001(0x1771, float:8.409E-42)
            goto L66
        L43:
            boolean r1 = r6 instanceof b5.g
            if (r1 == 0) goto L4a
            r7 = 6003(0x1773, float:8.412E-42)
            goto L66
        L4a:
            boolean r1 = r6 instanceof b5.e0
            if (r1 == 0) goto L51
            r7 = 6008(0x1778, float:8.419E-42)
            goto L66
        L51:
            if (r7 != r2) goto L54
            goto L25
        L54:
            r1 = 2
            if (r7 != r1) goto L5a
            r7 = 6004(0x1774, float:8.413E-42)
            goto L66
        L5a:
            r1 = 3
            if (r7 != r1) goto L60
        L5d:
            r7 = 6002(0x1772, float:8.41E-42)
            goto L66
        L60:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        L66:
            r0.<init>(r6, r7)
            r5.f1543t = r0
            java.lang.String r7 = "DefaultDrmSession"
            java.lang.String r0 = "DRM session error"
            p4.c.o(r7, r0, r6)
            boolean r7 = r6 instanceof java.lang.Exception
            if (r7 == 0) goto L98
            p4.h r7 = r5.f1531h
            java.lang.Object r0 = r7.f16573a
            monitor-enter(r0)
            java.util.Set r7 = r7.f16575c     // Catch: java.lang.Throwable -> L95
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L95
            java.util.Iterator r7 = r7.iterator()
        L82:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lac
            java.lang.Object r0 = r7.next()
            b5.q r0 = (b5.q) r0
            r1 = r6
            java.lang.Exception r1 = (java.lang.Exception) r1
            r0.d(r1)
            goto L82
        L95:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L95
            throw r6
        L98:
            boolean r7 = r6 instanceof java.lang.Error
            if (r7 == 0) goto Lb4
            boolean r7 = a2.c.Q(r6)
            if (r7 != 0) goto Lac
            boolean r7 = a2.c.P(r6)
            if (r7 == 0) goto La9
            goto Lac
        La9:
            java.lang.Error r6 = (java.lang.Error) r6
            throw r6
        Lac:
            int r6 = r5.f1538o
            r7 = 4
            if (r6 == r7) goto Lb3
            r5.f1538o = r2
        Lb3:
            return
        Lb4:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unexpected Throwable subclass"
            r7.<init>(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.e.l(java.lang.Throwable, int):void");
    }

    public final void m(Throwable th2, boolean z10) {
        if ((th2 instanceof NotProvisionedException) || a2.c.P(th2)) {
            this.f1526c.b1(this);
        } else {
            l(th2, z10 ? 1 : 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n() {
        /*
            r4 = this;
            boolean r0 = r4.k()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            b5.x r0 = r4.f1525b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            byte[] r0 = r0.m()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r4.f1544u = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            b5.x r2 = r4.f1525b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            w4.k r3 = r4.f1533j     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r2.i(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            b5.x r0 = r4.f1525b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            byte[] r2 = r4.f1544u     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            u4.a r0 = r0.j(r2)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r4.f1542s = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r0 = 3
            r4.f1538o = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            p4.h r2 = r4.f1531h     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            java.lang.Object r3 = r2.f16573a     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            monitor-enter(r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            java.util.Set r2 = r2.f16575c     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
        L30:
            boolean r3 = r2.hasNext()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            b5.q r3 = (b5.q) r3     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r3.c(r0)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            goto L30
        L40:
            byte[] r0 = r4.f1544u     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r0.getClass()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            return r1
        L46:
            r0 = move-exception
            goto L4d
        L48:
            r0 = move-exception
            goto L4d
        L4a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            throw r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
        L4d:
            boolean r2 = a2.c.P(r0)
            if (r2 == 0) goto L59
            androidx.media3.exoplayer.offline.u r0 = r4.f1526c
            r0.b1(r4)
            goto L62
        L59:
            r4.l(r0, r1)
            goto L62
        L5d:
            androidx.media3.exoplayer.offline.u r0 = r4.f1526c
            r0.b1(r4)
        L62:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.e.n():boolean");
    }

    public final void o(byte[] bArr, int i10, boolean z10) {
        try {
            v vVarU = this.f1525b.u(bArr, this.f1524a, i10, this.f1530g);
            this.f1546w = vVarU;
            b bVar = this.f1541r;
            int i11 = p4.c0.f16548a;
            vVarU.getClass();
            bVar.getClass();
            bVar.obtainMessage(2, new c(j5.u.f10444b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), vVarU)).sendToTarget();
        } catch (Exception | NoSuchMethodError e10) {
            m(e10, true);
        }
    }

    public final void p() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f1536m;
        if (threadCurrentThread != looper.getThread()) {
            p4.c.C("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
