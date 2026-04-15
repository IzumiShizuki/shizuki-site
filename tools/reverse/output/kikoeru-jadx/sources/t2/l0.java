package t2;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l0 f20361d = new l0(0, 0, null, 0, 0, 0, 16777215);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f20362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f20363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f20364c;

    public l0(d0 d0Var, s sVar, w wVar) {
        this.f20362a = d0Var;
        this.f20363b = sVar;
        this.f20364c = wVar;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public static t2.l0 a(t2.l0 r30, long r31, long r33, x2.k r35, x2.i r36, x2.n r37, long r38, q1.k0 r40, s1.h r41, long r42, t2.w r44, e3.i r45, int r46) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.l0.a(t2.l0, long, long, x2.k, x2.i, x2.n, long, q1.k0, s1.h, long, t2.w, e3.i, int):t2.l0");
    }

    public static l0 e(l0 l0Var, long j10, long j11, x2.k kVar, x2.i iVar, long j12, e3.l lVar, int i10, long j13, int i11) {
        long j14 = (i11 & 1) != 0 ? q1.q.f17575h : j10;
        long j15 = (i11 & 2) != 0 ? f3.o.f6672c : j11;
        x2.k kVar2 = (i11 & 4) != 0 ? null : kVar;
        x2.i iVar2 = (i11 & 8) != 0 ? null : iVar;
        long j16 = (i11 & 128) != 0 ? f3.o.f6672c : j12;
        long j17 = q1.q.f17575h;
        e3.l lVar2 = (i11 & 4096) != 0 ? null : lVar;
        int i12 = (32768 & i11) != 0 ? Integer.MIN_VALUE : i10;
        long j18 = (i11 & 131072) != 0 ? f3.o.f6672c : j13;
        d0 d0VarA = e0.a(l0Var.f20362a, j14, null, Float.NaN, j15, kVar2, iVar2, null, null, null, j16, null, null, null, j17, lVar2, null, null, null);
        s sVarA = t.a(l0Var.f20363b, i12, Integer.MIN_VALUE, j18, null, null, null, 0, Integer.MIN_VALUE, null);
        return (l0Var.f20362a == d0VarA && l0Var.f20363b == sVarA) ? l0Var : new l0(d0VarA, sVarA);
    }

    public final long b() {
        return this.f20362a.f20293a.b();
    }

    public final boolean c(l0 l0Var) {
        if (this != l0Var) {
            return jc.l.a(this.f20363b, l0Var.f20363b) && this.f20362a.a(l0Var.f20362a);
        }
        return true;
    }

    public final l0 d(l0 l0Var) {
        return (l0Var == null || l0Var.equals(f20361d)) ? this : new l0(this.f20362a.c(l0Var.f20362a), this.f20363b.a(l0Var.f20363b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return jc.l.a(this.f20362a, l0Var.f20362a) && jc.l.a(this.f20363b, l0Var.f20363b) && jc.l.a(this.f20364c, l0Var.f20364c);
    }

    public final int hashCode() {
        int iHashCode = (this.f20363b.hashCode() + (this.f20362a.hashCode() * 31)) * 31;
        w wVar = this.f20364c;
        return iHashCode + (wVar != null ? wVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) q1.q.i(b()));
        sb.append(", brush=");
        d0 d0Var = this.f20362a;
        sb.append(d0Var.f20293a.e());
        sb.append(", alpha=");
        sb.append(d0Var.f20293a.a());
        sb.append(", fontSize=");
        sb.append((Object) f3.o.e(d0Var.f20294b));
        sb.append(", fontWeight=");
        sb.append(d0Var.f20295c);
        sb.append(", fontStyle=");
        sb.append(d0Var.f20296d);
        sb.append(", fontSynthesis=");
        sb.append(d0Var.f20297e);
        sb.append(", fontFamily=");
        sb.append(d0Var.f20298f);
        sb.append(", fontFeatureSettings=");
        sb.append(d0Var.f20299g);
        sb.append(", letterSpacing=");
        sb.append((Object) f3.o.e(d0Var.f20300h));
        sb.append(", baselineShift=");
        sb.append(d0Var.f20301i);
        sb.append(", textGeometricTransform=");
        sb.append(d0Var.f20302j);
        sb.append(", localeList=");
        sb.append(d0Var.f20303k);
        sb.append(", background=");
        t0.K(d0Var.f20304l, ", textDecoration=", sb);
        sb.append(d0Var.f20305m);
        sb.append(", shadow=");
        sb.append(d0Var.f20306n);
        sb.append(", drawStyle=");
        sb.append(d0Var.f20308p);
        sb.append(", textAlign=");
        s sVar = this.f20363b;
        sb.append((Object) e3.k.a(sVar.f20387a));
        sb.append(", textDirection=");
        sb.append((Object) e3.m.a(sVar.f20388b));
        sb.append(", lineHeight=");
        sb.append((Object) f3.o.e(sVar.f20389c));
        sb.append(", textIndent=");
        sb.append(sVar.f20390d);
        sb.append(", platformStyle=");
        sb.append(this.f20364c);
        sb.append(", lineHeightStyle=");
        sb.append(sVar.f20392f);
        sb.append(", lineBreak=");
        sb.append((Object) e3.e.a(sVar.f20393g));
        sb.append(", hyphens=");
        sb.append((Object) e3.d.a(sVar.f20394h));
        sb.append(", textMotion=");
        sb.append(sVar.f20395i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l0(d0 d0Var, s sVar) {
        v vVar = d0Var.f20307o;
        u uVar = sVar.f20391e;
        this(d0Var, sVar, (vVar == null && uVar == null) ? null : new w(vVar, uVar));
    }

    public l0(long j10, long j11, x2.k kVar, long j12, int i10, long j13, int i11) {
        this(new d0((i11 & 1) != 0 ? q1.q.f17575h : j10, (i11 & 2) != 0 ? f3.o.f6672c : j11, (i11 & 4) != 0 ? null : kVar, (x2.i) null, (x2.j) null, (i11 & 32) != 0 ? null : x2.n.f24568a, (String) null, (i11 & 128) != 0 ? f3.o.f6672c : j12, (e3.a) null, (e3.p) null, (a3.c) null, q1.q.f17575h, (e3.l) null, (q1.k0) null, (v) null), new s((32768 & i11) != 0 ? Integer.MIN_VALUE : i10, Integer.MIN_VALUE, (i11 & 131072) != 0 ? f3.o.f6672c : j13, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }
}
