package b5;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import m4.o0;
import ya.a1;
import ya.i0;
import ya.m0;
import ya.o1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f1556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f1557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f1558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f1559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f1561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.media3.exoplayer.offline.u f1563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m3.l f1564i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f1565j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f1566k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f1567l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f1568m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set f1569n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1570o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public x f1571p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public e f1572q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e f1573r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Looper f1574s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Handler f1575t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f1576u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public w4.k f1577v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile d f1578w;

    public j(UUID uuid, d0 d0Var, HashMap map, boolean z10, int[] iArr, boolean z11, m3.l lVar) {
        uuid.getClass();
        p4.c.b("Use C.CLEARKEY_UUID instead", !m4.g.f14209b.equals(uuid));
        this.f1556a = uuid;
        this.f1557b = c0.f1514d;
        this.f1558c = d0Var;
        this.f1559d = map;
        this.f1560e = z10;
        this.f1561f = iArr;
        this.f1562g = z11;
        this.f1564i = lVar;
        this.f1563h = new androidx.media3.exoplayer.offline.u(2);
        this.f1565j = new f(this);
        this.f1567l = new ArrayList();
        this.f1568m = Collections.newSetFromMap(new IdentityHashMap());
        this.f1569n = Collections.newSetFromMap(new IdentityHashMap());
        this.f1566k = 300000L;
    }

    public static boolean d(e eVar) {
        eVar.p();
        if (eVar.f1538o != 1) {
            return false;
        }
        k kVarG = eVar.g();
        kVarG.getClass();
        Throwable cause = kVarG.getCause();
        return (cause instanceof ResourceBusyException) || a2.c.Q(cause);
    }

    public static ArrayList i(m4.n nVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(nVar.f14408d);
        for (int i10 = 0; i10 < nVar.f14408d; i10++) {
            m4.m mVar = nVar.f14405a[i10];
            if ((mVar.a(uuid) || (m4.g.f14210c.equals(uuid) && mVar.a(m4.g.f14209b))) && (mVar.f14397e != null || z10)) {
                arrayList.add(mVar);
            }
        }
        return arrayList;
    }

    @Override // b5.t
    public final void a() {
        l(true);
        int i10 = this.f1570o - 1;
        this.f1570o = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f1566k != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f1567l);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((e) arrayList.get(i11)).c(null);
            }
        }
        o1 it = m0.q(this.f1568m).iterator();
        while (it.hasNext()) {
            ((i) it.next()).a();
        }
        j();
    }

    public final l b(Looper looper, q qVar, m4.q qVar2, boolean z10) {
        ArrayList arrayListI;
        if (this.f1578w == null) {
            this.f1578w = new d(this, looper, 1);
        }
        m4.n nVar = qVar2.f14548r;
        int i10 = 0;
        e eVar = null;
        if (nVar == null) {
            int i11 = o0.i(qVar2.f14544n);
            x xVar = this.f1571p;
            xVar.getClass();
            if (xVar.v() != 2 || !y.f1603c) {
                int[] iArr = this.f1561f;
                while (true) {
                    if (i10 >= iArr.length) {
                        i10 = -1;
                        break;
                    }
                    if (iArr[i10] == i11) {
                        break;
                    }
                    i10++;
                }
                if (i10 != -1 && xVar.v() != 1) {
                    e eVar2 = this.f1572q;
                    if (eVar2 == null) {
                        ya.g0 g0Var = i0.f25998b;
                        e eVarH = h(a1.f25946e, true, null, z10);
                        this.f1567l.add(eVarH);
                        this.f1572q = eVarH;
                    } else {
                        eVar2.b(null);
                    }
                    return this.f1572q;
                }
            }
            return null;
        }
        if (this.f1576u == null) {
            arrayListI = i(nVar, this.f1556a, false);
            if (arrayListI.isEmpty()) {
                g gVar = new g("Media does not support uuid: " + this.f1556a);
                p4.c.o("DefaultDrmSessionMgr", "DRM error", gVar);
                if (qVar != null) {
                    qVar.d(gVar);
                }
                return new u(new k(gVar, 6003));
            }
        } else {
            arrayListI = null;
        }
        if (this.f1560e) {
            Iterator it = this.f1567l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e eVar3 = (e) it.next();
                if (Objects.equals(eVar3.f1524a, arrayListI)) {
                    eVar = eVar3;
                    break;
                }
            }
        } else {
            eVar = this.f1573r;
        }
        if (eVar != null) {
            eVar.b(qVar);
            return eVar;
        }
        e eVarH2 = h(arrayListI, false, qVar, z10);
        if (!this.f1560e) {
            this.f1573r = eVarH2;
        }
        this.f1567l.add(eVarH2);
        return eVarH2;
    }

    @Override // b5.t
    public final void c() {
        x dVar;
        l(true);
        int i10 = this.f1570o;
        this.f1570o = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f1571p == null) {
            UUID uuid = this.f1556a;
            this.f1557b.getClass();
            try {
                try {
                    try {
                        dVar = new c0(uuid);
                    } catch (Exception e10) {
                        throw new g0(e10);
                    }
                } catch (UnsupportedSchemeException e11) {
                    throw new g0(e11);
                }
            } catch (g0 unused) {
                p4.c.n("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                dVar = new pe.d(11);
            }
            this.f1571p = dVar;
            dVar.l(new f(this));
            return;
        }
        if (this.f1566k == -9223372036854775807L) {
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f1567l;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((e) arrayList.get(i11)).b(null);
            i11++;
        }
    }

    @Override // b5.t
    public final s e(q qVar, m4.q qVar2) {
        p4.c.i(this.f1570o > 0);
        p4.c.j(this.f1574s);
        i iVar = new i(this, qVar);
        Handler handler = this.f1575t;
        handler.getClass();
        handler.post(new h(0, iVar, qVar2));
        return iVar;
    }

    public final e f(List list, boolean z10, q qVar) {
        this.f1571p.getClass();
        boolean z11 = this.f1562g | z10;
        x xVar = this.f1571p;
        byte[] bArr = this.f1576u;
        Looper looper = this.f1574s;
        looper.getClass();
        w4.k kVar = this.f1577v;
        kVar.getClass();
        e eVar = new e(this.f1556a, xVar, this.f1563h, this.f1565j, list, z11, z10, bArr, this.f1559d, this.f1558c, looper, this.f1564i, kVar);
        eVar.b(qVar);
        if (this.f1566k != -9223372036854775807L) {
            eVar.b(null);
        }
        return eVar;
    }

    @Override // b5.t
    public final void g(Looper looper, w4.k kVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.f1574s;
                if (looper2 == null) {
                    this.f1574s = looper;
                    this.f1575t = new Handler(looper);
                } else {
                    p4.c.i(looper2 == looper);
                    this.f1575t.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f1577v = kVar;
    }

    public final e h(List list, boolean z10, q qVar, boolean z11) {
        e eVarF = f(list, z10, qVar);
        boolean zD = d(eVarF);
        long j10 = this.f1566k;
        Set set = this.f1569n;
        if (zD && !set.isEmpty()) {
            o1 it = m0.q(set).iterator();
            while (it.hasNext()) {
                ((l) it.next()).c(null);
            }
            eVarF.c(qVar);
            if (j10 != -9223372036854775807L) {
                eVarF.c(null);
            }
            eVarF = f(list, z10, qVar);
        }
        if (d(eVarF) && z11) {
            Set set2 = this.f1568m;
            if (!set2.isEmpty()) {
                o1 it2 = m0.q(set2).iterator();
                while (it2.hasNext()) {
                    ((i) it2.next()).a();
                }
                if (!set.isEmpty()) {
                    o1 it3 = m0.q(set).iterator();
                    while (it3.hasNext()) {
                        ((l) it3.next()).c(null);
                    }
                }
                eVarF.c(qVar);
                if (j10 != -9223372036854775807L) {
                    eVarF.c(null);
                }
                return f(list, z10, qVar);
            }
        }
        return eVarF;
    }

    public final void j() {
        if (this.f1571p != null && this.f1570o == 0 && this.f1567l.isEmpty() && this.f1568m.isEmpty()) {
            x xVar = this.f1571p;
            xVar.getClass();
            xVar.a();
            this.f1571p = null;
        }
    }

    @Override // b5.t
    public final int k(m4.q qVar) {
        l(false);
        x xVar = this.f1571p;
        xVar.getClass();
        int iV = xVar.v();
        m4.n nVar = qVar.f14548r;
        if (nVar == null) {
            int i10 = o0.i(qVar.f14544n);
            int i11 = 0;
            while (true) {
                int[] iArr = this.f1561f;
                if (i11 >= iArr.length) {
                    i11 = -1;
                    break;
                }
                if (iArr[i11] == i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return 0;
            }
        } else if (this.f1576u == null) {
            UUID uuid = this.f1556a;
            if (i(nVar, uuid, true).isEmpty()) {
                if (nVar.f14408d == 1 && nVar.f14405a[0].a(m4.g.f14209b)) {
                    p4.c.B("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = nVar.f14407c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : p4.c0.f16548a < 25)) {
                return 1;
            }
        }
        return iV;
    }

    public final void l(boolean z10) {
        if (z10 && this.f1574s == null) {
            p4.c.C("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f1574s;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            p4.c.C("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f1574s.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // b5.t
    public final l w(q qVar, m4.q qVar2) {
        l(false);
        p4.c.i(this.f1570o > 0);
        p4.c.j(this.f1574s);
        return b(this.f1574s, qVar, qVar2, true);
    }
}
