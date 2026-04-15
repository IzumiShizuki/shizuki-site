package ug;

import b7.b1;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f21756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f21757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f21760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f21761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f0 f21762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lh.g0 f21763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d0 f21764i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d0 f21765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d0 f21766k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f21767l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f21768m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b5.d0 f21769n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i0 f21770o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g f21771p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f21772q;

    public d0(b1 b1Var, y yVar, String str, int i10, q qVar, r rVar, f0 f0Var, lh.g0 g0Var, d0 d0Var, d0 d0Var2, d0 d0Var3, long j10, long j11, b5.d0 d0Var4, i0 i0Var) {
        jc.l.e(b1Var, "request");
        jc.l.e(yVar, "protocol");
        jc.l.e(str, "message");
        jc.l.e(f0Var, "body");
        jc.l.e(i0Var, "trailersSource");
        this.f21756a = b1Var;
        this.f21757b = yVar;
        this.f21758c = str;
        this.f21759d = i10;
        this.f21760e = qVar;
        this.f21761f = rVar;
        this.f21762g = f0Var;
        this.f21763h = g0Var;
        this.f21764i = d0Var;
        this.f21765j = d0Var2;
        this.f21766k = d0Var3;
        this.f21767l = j10;
        this.f21768m = j11;
        this.f21769n = d0Var4;
        this.f21770o = i0Var;
        boolean z10 = false;
        if (200 <= i10 && i10 < 300) {
            z10 = true;
        }
        this.f21772q = z10;
    }

    public final g b() {
        g gVar = this.f21771p;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = g.f21779n;
        g gVarR = ua.j.r(this.f21761f);
        this.f21771p = gVarR;
        return gVarR;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f21762g.close();
    }

    public final c0 g() {
        c0 c0Var = new c0();
        c0Var.f21731c = -1;
        c0Var.f21735g = f0.f21778a;
        c0Var.f21743o = i0.f21805b;
        c0Var.f21729a = this.f21756a;
        c0Var.f21730b = this.f21757b;
        c0Var.f21731c = this.f21759d;
        c0Var.f21732d = this.f21758c;
        c0Var.f21733e = this.f21760e;
        c0Var.f21734f = this.f21761f.j();
        c0Var.f21735g = this.f21762g;
        c0Var.f21736h = this.f21763h;
        c0Var.f21737i = this.f21764i;
        c0Var.f21738j = this.f21765j;
        c0Var.f21739k = this.f21766k;
        c0Var.f21740l = this.f21767l;
        c0Var.f21741m = this.f21768m;
        c0Var.f21742n = this.f21769n;
        c0Var.f21743o = this.f21770o;
        return c0Var;
    }

    public final String toString() {
        return "Response{protocol=" + this.f21757b + ", code=" + this.f21759d + ", message=" + this.f21758c + ", url=" + ((t) this.f21756a.f1650b) + '}';
    }
}
