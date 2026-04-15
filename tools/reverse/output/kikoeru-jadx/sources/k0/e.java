package k0;

import h0.q0;
import t2.c0;
import t2.l0;
import t2.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f10910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x2.d f10911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10915g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f3.c f10917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t2.a f10918j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f10919k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f10920l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f10921m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public r f10922n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f3.m f10923o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f10916h = a.f10881a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f10924p = f3.b.h(0, 0, 0, 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10925q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10926r = -1;

    public e(String str, l0 l0Var, x2.d dVar, int i10, boolean z10, int i11, int i12) {
        this.f10909a = str;
        this.f10910b = l0Var;
        this.f10911c = dVar;
        this.f10912d = i10;
        this.f10913e = z10;
        this.f10914f = i11;
        this.f10915g = i12;
        long j10 = 0;
        this.f10920l = (j10 & 4294967295L) | (j10 << 32);
    }

    public static long e(e eVar, long j10, f3.m mVar) {
        l0 l0Var = eVar.f10910b;
        b bVar = eVar.f10921m;
        f3.c cVar = eVar.f10917i;
        jc.l.b(cVar);
        b bVarW = gh.g.w(bVar, mVar, l0Var, cVar, eVar.f10911c);
        eVar.f10921m = bVarW;
        return bVarW.a(eVar.f10915g, j10);
    }

    public final int a(int i10, f3.m mVar) {
        int i11 = this.f10925q;
        int i12 = this.f10926r;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        long jA = f3.b.a(0, i10, 0, Integer.MAX_VALUE);
        if (this.f10915g > 1) {
            jA = e(this, jA, mVar);
        }
        r rVarD = d(mVar);
        long jT = g8.a.t(rVarD.j(), this.f10912d, jA, this.f10913e);
        boolean z10 = this.f10913e;
        int i13 = this.f10912d;
        int i14 = this.f10914f;
        int iM = q0.m(new t2.a((b3.c) rVarD, ((z10 || !(i13 == 2 || i13 == 4 || i13 == 5)) && i14 >= 1) ? i14 : 1, i13, jT).b());
        int i15 = f3.a.i(jA);
        if (iM < i15) {
            iM = i15;
        }
        this.f10925q = i10;
        this.f10926r = iM;
        return iM;
    }

    public final void b() {
        this.f10918j = null;
        this.f10922n = null;
        this.f10923o = null;
        this.f10925q = -1;
        this.f10926r = -1;
        this.f10924p = f3.b.h(0, 0, 0, 0);
        long j10 = 0;
        this.f10920l = (j10 & 4294967295L) | (j10 << 32);
        this.f10919k = false;
    }

    public final void c(f3.c cVar) {
        long jA;
        f3.c cVar2 = this.f10917i;
        if (cVar != null) {
            int i10 = a.f10882b;
            jA = a.a(cVar.a(), cVar.M());
        } else {
            jA = a.f10881a;
        }
        if (cVar2 == null) {
            this.f10917i = cVar;
            this.f10916h = jA;
        } else if (cVar == null || this.f10916h != jA) {
            this.f10917i = cVar;
            this.f10916h = jA;
            b();
        }
    }

    public final r d(f3.m mVar) {
        r cVar = this.f10922n;
        if (cVar == null || mVar != this.f10923o || cVar.c()) {
            this.f10923o = mVar;
            String str = this.f10909a;
            l0 l0VarH = c0.h(this.f10910b, mVar);
            f3.c cVar2 = this.f10917i;
            jc.l.b(cVar2);
            x2.d dVar = this.f10911c;
            vb.r rVar = vb.r.f22819a;
            cVar = new b3.c(str, l0VarH, rVar, rVar, dVar, cVar2);
        }
        this.f10922n = cVar;
        return cVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f10918j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j10 = this.f10916h;
        int i10 = a.f10882b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j10 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j10 & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
