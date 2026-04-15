package t2;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3.o f20293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x2.k f20295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x2.i f20296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x2.j f20297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x2.n f20298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f20299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f20300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e3.a f20301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e3.p f20302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a3.c f20303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f20304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e3.l f20305m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q1.k0 f20306n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final v f20307o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s1.e f20308p;

    public d0(long j10, long j11, x2.k kVar, x2.i iVar, x2.j jVar, x2.n nVar, String str, long j12, e3.a aVar, e3.p pVar, a3.c cVar, long j13, e3.l lVar, q1.k0 k0Var, v vVar) {
        this(j10 != 16 ? new e3.c(j10) : e3.n.f6087a, j11, kVar, iVar, jVar, nVar, str, j12, aVar, pVar, cVar, j13, lVar, k0Var, vVar, null);
    }

    public final boolean a(d0 d0Var) {
        if (this == d0Var) {
            return true;
        }
        return f3.o.a(this.f20294b, d0Var.f20294b) && jc.l.a(this.f20295c, d0Var.f20295c) && jc.l.a(this.f20296d, d0Var.f20296d) && jc.l.a(this.f20297e, d0Var.f20297e) && jc.l.a(this.f20298f, d0Var.f20298f) && jc.l.a(this.f20299g, d0Var.f20299g) && f3.o.a(this.f20300h, d0Var.f20300h) && jc.l.a(this.f20301i, d0Var.f20301i) && jc.l.a(this.f20302j, d0Var.f20302j) && jc.l.a(this.f20303k, d0Var.f20303k) && q1.q.c(this.f20304l, d0Var.f20304l) && jc.l.a(this.f20307o, d0Var.f20307o);
    }

    public final boolean b(d0 d0Var) {
        return jc.l.a(this.f20293a, d0Var.f20293a) && jc.l.a(this.f20305m, d0Var.f20305m) && jc.l.a(this.f20306n, d0Var.f20306n) && jc.l.a(this.f20308p, d0Var.f20308p);
    }

    public final d0 c(d0 d0Var) {
        if (d0Var == null) {
            return this;
        }
        e3.o oVar = d0Var.f20293a;
        return e0.a(this, oVar.b(), oVar.e(), oVar.a(), d0Var.f20294b, d0Var.f20295c, d0Var.f20296d, d0Var.f20297e, d0Var.f20298f, d0Var.f20299g, d0Var.f20300h, d0Var.f20301i, d0Var.f20302j, d0Var.f20303k, d0Var.f20304l, d0Var.f20305m, d0Var.f20306n, d0Var.f20307o, d0Var.f20308p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return a(d0Var) && b(d0Var);
    }

    public final int hashCode() {
        e3.o oVar = this.f20293a;
        long jB = oVar.b();
        int i10 = q1.q.f17576i;
        int iA = ub.v.a(jB) * 31;
        q1.m mVarE = oVar.e();
        int iD = (f3.o.d(this.f20294b) + ((Float.floatToIntBits(oVar.a()) + ((iA + (mVarE != null ? mVarE.hashCode() : 0)) * 31)) * 31)) * 31;
        x2.k kVar = this.f20295c;
        int i11 = (iD + (kVar != null ? kVar.f24566a : 0)) * 31;
        x2.i iVar = this.f20296d;
        int i12 = (i11 + (iVar != null ? iVar.f24558a : 0)) * 31;
        x2.j jVar = this.f20297e;
        int i13 = (i12 + (jVar != null ? jVar.f24559a : 0)) * 31;
        x2.n nVar = this.f20298f;
        int iHashCode = (i13 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        String str = this.f20299g;
        int iD2 = (f3.o.d(this.f20300h) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        e3.a aVar = this.f20301i;
        int iFloatToIntBits = (iD2 + (aVar != null ? Float.floatToIntBits(aVar.f6063a) : 0)) * 31;
        e3.p pVar = this.f20302j;
        int iHashCode2 = (iFloatToIntBits + (pVar != null ? pVar.hashCode() : 0)) * 31;
        a3.c cVar = this.f20303k;
        int iY = t0.y((iHashCode2 + (cVar != null ? cVar.f196a.hashCode() : 0)) * 31, 31, this.f20304l);
        e3.l lVar = this.f20305m;
        int i14 = (iY + (lVar != null ? lVar.f6085a : 0)) * 31;
        q1.k0 k0Var = this.f20306n;
        int iHashCode3 = (i14 + (k0Var != null ? k0Var.hashCode() : 0)) * 31;
        v vVar = this.f20307o;
        int iHashCode4 = (iHashCode3 + (vVar != null ? vVar.hashCode() : 0)) * 31;
        s1.e eVar = this.f20308p;
        return iHashCode4 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        e3.o oVar = this.f20293a;
        sb.append((Object) q1.q.i(oVar.b()));
        sb.append(", brush=");
        sb.append(oVar.e());
        sb.append(", alpha=");
        sb.append(oVar.a());
        sb.append(", fontSize=");
        sb.append((Object) f3.o.e(this.f20294b));
        sb.append(", fontWeight=");
        sb.append(this.f20295c);
        sb.append(", fontStyle=");
        sb.append(this.f20296d);
        sb.append(", fontSynthesis=");
        sb.append(this.f20297e);
        sb.append(", fontFamily=");
        sb.append(this.f20298f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f20299g);
        sb.append(", letterSpacing=");
        sb.append((Object) f3.o.e(this.f20300h));
        sb.append(", baselineShift=");
        sb.append(this.f20301i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f20302j);
        sb.append(", localeList=");
        sb.append(this.f20303k);
        sb.append(", background=");
        t0.K(this.f20304l, ", textDecoration=", sb);
        sb.append(this.f20305m);
        sb.append(", shadow=");
        sb.append(this.f20306n);
        sb.append(", platformStyle=");
        sb.append(this.f20307o);
        sb.append(", drawStyle=");
        sb.append(this.f20308p);
        sb.append(')');
        return sb.toString();
    }

    public d0(e3.o oVar, long j10, x2.k kVar, x2.i iVar, x2.j jVar, x2.n nVar, String str, long j11, e3.a aVar, e3.p pVar, a3.c cVar, long j12, e3.l lVar, q1.k0 k0Var, v vVar, s1.e eVar) {
        this.f20293a = oVar;
        this.f20294b = j10;
        this.f20295c = kVar;
        this.f20296d = iVar;
        this.f20297e = jVar;
        this.f20298f = nVar;
        this.f20299g = str;
        this.f20300h = j11;
        this.f20301i = aVar;
        this.f20302j = pVar;
        this.f20303k = cVar;
        this.f20304l = j12;
        this.f20305m = lVar;
        this.f20306n = k0Var;
        this.f20307o = vVar;
        this.f20308p = eVar;
    }

    public d0(long j10, long j11, x2.k kVar, x2.i iVar, x2.j jVar, x2.n nVar, String str, long j12, e3.a aVar, e3.p pVar, a3.c cVar, long j13, e3.l lVar, q1.k0 k0Var, int i10) {
        this((i10 & 1) != 0 ? q1.q.f17575h : j10, (i10 & 2) != 0 ? f3.o.f6672c : j11, (i10 & 4) != 0 ? null : kVar, (i10 & 8) != 0 ? null : iVar, (i10 & 16) != 0 ? null : jVar, (i10 & 32) != 0 ? null : nVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? f3.o.f6672c : j12, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : pVar, (i10 & 1024) != 0 ? null : cVar, (i10 & 2048) != 0 ? q1.q.f17575h : j13, (i10 & 4096) != 0 ? null : lVar, (i10 & 8192) != 0 ? null : k0Var, (v) null);
    }
}
