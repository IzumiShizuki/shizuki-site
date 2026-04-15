package k5;

import android.net.Uri;
import androidx.media3.exoplayer.offline.u;
import b5.t;
import j5.b1;
import j5.c1;
import j5.e1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m4.q;
import n5.o;
import p4.c0;
import r5.b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements c1, e1, n5.j, n5.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f11070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q[] f11071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f11072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y4.k f11073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y4.b f11074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ah.j f11075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m3.l f11076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f11077i = new o("ChunkSampleStream");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f11078j = new d(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f11079k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f11080l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b1 f11081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b1[] f11082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u f11083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f11084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public q f11085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h f11086r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f11087s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f11088t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11089u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f11090v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f11091w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11092x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f11093y;

    public i(int i10, int[] iArr, q[] qVarArr, y4.k kVar, y4.b bVar, n5.f fVar, long j10, t tVar, b5.q qVar, m3.l lVar, ah.j jVar, boolean z10) {
        this.f11069a = i10;
        this.f11070b = iArr;
        this.f11071c = qVarArr;
        this.f11073e = kVar;
        this.f11074f = bVar;
        this.f11075g = jVar;
        this.f11076h = lVar;
        this.f11091w = z10;
        ArrayList arrayList = new ArrayList();
        this.f11079k = arrayList;
        this.f11080l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f11082n = new b1[length];
        this.f11072d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        b1[] b1VarArr = new b1[i11];
        tVar.getClass();
        b1 b1Var = new b1(fVar, tVar, qVar);
        this.f11081m = b1Var;
        int i12 = 0;
        iArr2[0] = i10;
        b1VarArr[0] = b1Var;
        while (i12 < length) {
            b1 b1Var2 = new b1(fVar, null, null);
            this.f11082n[i12] = b1Var2;
            int i13 = i12 + 1;
            b1VarArr[i13] = b1Var2;
            iArr2[i13] = this.f11070b[i12];
            i12 = i13;
        }
        this.f11083o = new u(28, iArr2, b1VarArr);
        this.f11087s = j10;
        this.f11088t = j10;
    }

    public final void A() {
        int iB = B(this.f11081m.t(), this.f11089u - 1);
        while (true) {
            int i10 = this.f11089u;
            if (i10 > iB) {
                return;
            }
            this.f11089u = i10 + 1;
            a aVar = (a) this.f11079k.get(i10);
            q qVar = aVar.f11058d;
            if (!qVar.equals(this.f11085q)) {
                this.f11075g.j(this.f11069a, qVar, aVar.f11059e, aVar.f11060f, aVar.f11061g);
            }
            this.f11085q = qVar;
        }
    }

    public final int B(int i10, int i11) {
        ArrayList arrayList;
        do {
            i11++;
            arrayList = this.f11079k;
            if (i11 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i11)).c(0) <= i10);
        return i11 - 1;
    }

    public final void C(y4.b bVar) {
        this.f11086r = bVar;
        b1 b1Var = this.f11081m;
        b1Var.k();
        b5.l lVar = b1Var.f10216h;
        if (lVar != null) {
            lVar.c(b1Var.f10213e);
            b1Var.f10216h = null;
            b1Var.f10215g = null;
        }
        for (b1 b1Var2 : this.f11082n) {
            b1Var2.k();
            b5.l lVar2 = b1Var2.f10216h;
            if (lVar2 != null) {
                lVar2.c(b1Var2.f10213e);
                b1Var2.f10216h = null;
                b1Var2.f10215g = null;
            }
        }
        this.f11077i.e(this);
    }

    @Override // j5.c1
    public final boolean a() {
        return !z() && this.f11081m.x(this.f11093y);
    }

    @Override // j5.c1
    public final void b() throws IOException {
        o oVar = this.f11077i;
        oVar.b();
        this.f11081m.z();
        if (oVar.d()) {
            return;
        }
        y4.k kVar = this.f11073e;
        j5.b bVar = kVar.f25526m;
        if (bVar != null) {
            throw bVar;
        }
        kVar.f25514a.b();
    }

    @Override // n5.m
    public final void c() {
        b1 b1Var = this.f11081m;
        b1Var.D(true);
        b5.l lVar = b1Var.f10216h;
        if (lVar != null) {
            lVar.c(b1Var.f10213e);
            b1Var.f10216h = null;
            b1Var.f10215g = null;
        }
        for (b1 b1Var2 : this.f11082n) {
            b1Var2.D(true);
            b5.l lVar2 = b1Var2.f10216h;
            if (lVar2 != null) {
                lVar2.c(b1Var2.f10213e);
                b1Var2.f10216h = null;
                b1Var2.f10215g = null;
            }
        }
        for (y4.i iVar : this.f11073e.f25522i) {
            e eVar = (e) iVar.f25509c;
            if (eVar != null) {
                eVar.f11046a.a();
            }
        }
        h hVar = this.f11086r;
        if (hVar != null) {
            y4.b bVar = (y4.b) hVar;
            synchronized (bVar) {
                y4.n nVar = (y4.n) bVar.f25461n.remove(this);
                if (nVar != null) {
                    b1 b1Var3 = nVar.f25538a;
                    b1Var3.D(true);
                    b5.l lVar3 = b1Var3.f10216h;
                    if (lVar3 != null) {
                        lVar3.c(b1Var3.f10213e);
                        b1Var3.f10216h = null;
                        b1Var3.f10215g = null;
                    }
                }
            }
        }
    }

    @Override // j5.e1
    public final long d() {
        if (z()) {
            return this.f11087s;
        }
        if (this.f11093y) {
            return Long.MIN_VALUE;
        }
        return x().f11062h;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0403  */
    @Override // j5.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(v4.f0 r59) {
        /*
            Method dump skipped, instruction units count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.i.e(v4.f0):boolean");
    }

    @Override // j5.c1
    public final int j(long j10) throws Throwable {
        if (z()) {
            return 0;
        }
        boolean z10 = this.f11093y;
        b1 b1Var = this.f11081m;
        int iV = b1Var.v(j10, z10);
        a aVar = this.f11090v;
        if (aVar != null) {
            iV = Math.min(iV, aVar.c(0) - b1Var.t());
        }
        b1Var.H(iV);
        A();
        return iV;
    }

    @Override // n5.j
    public final void k(n5.l lVar, long j10, long j11) {
        f fVar = (f) lVar;
        this.f11084p = null;
        y4.k kVar = this.f11073e;
        y4.i[] iVarArr = kVar.f25522i;
        if (fVar instanceof k) {
            int iS = kVar.f25523j.s(((k) fVar).f11058d);
            y4.i iVar = iVarArr[iS];
            if (((y4.h) iVar.f25512f) == null) {
                e eVar = (e) iVar.f25509c;
                p4.c.j(eVar);
                b0 b0Var = eVar.f11053h;
                r5.j jVar = b0Var instanceof r5.j ? (r5.j) b0Var : null;
                if (jVar != null) {
                    z4.m mVar = (z4.m) iVar.f25510d;
                    iVarArr[iS] = new y4.i(iVar.f25507a, mVar, (z4.b) iVar.f25511e, (e) iVar.f25509c, iVar.f25508b, new bh.a(jVar, mVar.f26439c, 3));
                }
            }
        }
        y4.n nVar = kVar.f25521h;
        if (nVar != null) {
            long j12 = nVar.f25541d;
            if (j12 == -9223372036854775807L || fVar.f11062h > j12) {
                nVar.f25541d = fVar.f11062h;
            }
            nVar.f25542e.f25549g = true;
        }
        long j13 = fVar.f11055a;
        Uri uri = fVar.f11063i.f19399c;
        j5.u uVar = new j5.u(j11);
        this.f11076h.getClass();
        this.f11075g.B(uVar, fVar.f11057c, this.f11069a, fVar.f11058d, fVar.f11059e, fVar.f11060f, fVar.f11061g, fVar.f11062h);
        this.f11074f.c(this);
    }

    @Override // j5.e1
    public final boolean m() {
        return this.f11077i.d();
    }

    @Override // j5.c1
    public final int n(v2.e eVar, u4.f fVar, int i10) {
        if (z()) {
            return -3;
        }
        a aVar = this.f11090v;
        b1 b1Var = this.f11081m;
        if (aVar != null && aVar.c(0) <= b1Var.t()) {
            return -3;
        }
        A();
        return b1Var.C(eVar, fVar, i10, this.f11093y);
    }

    @Override // n5.j
    public final void r(n5.l lVar, long j10, long j11, int i10) {
        j5.u uVar;
        f fVar = (f) lVar;
        if (i10 == 0) {
            long j12 = fVar.f11055a;
            uVar = new j5.u(fVar.f11056b);
        } else {
            long j13 = fVar.f11055a;
            Uri uri = fVar.f11063i.f19399c;
            uVar = new j5.u(j11);
        }
        j5.u uVar2 = uVar;
        this.f11075g.E(uVar2, fVar.f11057c, this.f11069a, fVar.f11058d, fVar.f11059e, fVar.f11060f, fVar.f11061g, fVar.f11062h, i10);
    }

    @Override // n5.j
    public final void s(n5.l lVar, long j10, long j11, boolean z10) {
        f fVar = (f) lVar;
        this.f11084p = null;
        this.f11090v = null;
        long j12 = fVar.f11055a;
        Uri uri = fVar.f11063i.f19399c;
        j5.u uVar = new j5.u(j11);
        this.f11076h.getClass();
        this.f11075g.A(uVar, fVar.f11057c, this.f11069a, fVar.f11058d, fVar.f11059e, fVar.f11060f, fVar.f11061g, fVar.f11062h);
        if (z10) {
            return;
        }
        if (z()) {
            this.f11081m.D(false);
            for (b1 b1Var : this.f11082n) {
                b1Var.D(false);
            }
        } else if (fVar instanceof a) {
            ArrayList arrayList = this.f11079k;
            u(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.f11087s = this.f11088t;
            }
        }
        this.f11074f.c(this);
    }

    @Override // j5.e1
    public final long t() {
        if (this.f11093y) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.f11087s;
        }
        long jMax = this.f11088t;
        a aVarX = x();
        if (!aVarX.b()) {
            ArrayList arrayList = this.f11079k;
            aVarX = arrayList.size() > 1 ? (a) arrayList.get(arrayList.size() - 2) : null;
        }
        if (aVarX != null) {
            jMax = Math.max(jMax, aVarX.f11062h);
        }
        return Math.max(jMax, this.f11081m.q());
    }

    public final a u(int i10) {
        ArrayList arrayList = this.f11079k;
        a aVar = (a) arrayList.get(i10);
        c0.S(i10, arrayList.size(), arrayList);
        this.f11089u = Math.max(this.f11089u, arrayList.size());
        int i11 = 0;
        this.f11081m.n(aVar.c(0));
        while (true) {
            b1[] b1VarArr = this.f11082n;
            if (i11 >= b1VarArr.length) {
                return aVar;
            }
            b1 b1Var = b1VarArr[i11];
            i11++;
            b1Var.n(aVar.c(i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022c  */
    @Override // n5.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b7.q0 v(n5.l r23, long r24, long r26, java.io.IOException r28, int r29) {
        /*
            Method dump skipped, instruction units count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.i.v(n5.l, long, long, java.io.IOException, int):b7.q0");
    }

    @Override // j5.e1
    public final void w(long j10) {
        o oVar = this.f11077i;
        if (oVar.c() || z()) {
            return;
        }
        boolean zD = oVar.d();
        List list = this.f11080l;
        y4.k kVar = this.f11073e;
        ArrayList arrayList = this.f11079k;
        if (zD) {
            f fVar = this.f11084p;
            fVar.getClass();
            boolean z10 = fVar instanceof a;
            if (z10 && y(arrayList.size() - 1)) {
                return;
            }
            if (kVar.f25526m == null ? kVar.f25523j.d(j10, fVar, list) : false) {
                oVar.a();
                if (z10) {
                    this.f11090v = (a) fVar;
                    return;
                }
                return;
            }
            return;
        }
        int size = (kVar.f25526m != null || kVar.f25523j.length() < 2) ? list.size() : kVar.f25523j.j(j10, list);
        if (size < arrayList.size()) {
            p4.c.i(!oVar.d());
            int size2 = arrayList.size();
            while (true) {
                if (size >= size2) {
                    size = -1;
                    break;
                } else if (!y(size)) {
                    break;
                } else {
                    size++;
                }
            }
            if (size == -1) {
                return;
            }
            long j11 = x().f11062h;
            a aVarU = u(size);
            if (arrayList.isEmpty()) {
                this.f11087s = this.f11088t;
            }
            this.f11093y = false;
            this.f11075g.M(this.f11069a, aVarU.f11061g, j11);
        }
    }

    public final a x() {
        return (a) this.f11079k.get(r0.size() - 1);
    }

    public final boolean y(int i10) {
        int iT;
        a aVar = (a) this.f11079k.get(i10);
        if (this.f11081m.t() > aVar.c(0)) {
            return true;
        }
        int i11 = 0;
        do {
            b1[] b1VarArr = this.f11082n;
            if (i11 >= b1VarArr.length) {
                return false;
            }
            iT = b1VarArr[i11].t();
            i11++;
        } while (iT <= aVar.c(i11));
        return true;
    }

    public final boolean z() {
        return this.f11087s != -9223372036854775807L;
    }
}
