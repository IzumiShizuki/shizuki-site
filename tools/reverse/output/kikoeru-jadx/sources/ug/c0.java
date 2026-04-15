package ug;

import b7.b1;
import hd.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b1 f21729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f21730b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f21732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f21733e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public lh.g0 f21736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d0 f21737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d0 f21738j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d0 f21739k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f21740l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f21741m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b5.d0 f21742n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21731c = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f0 f21735g = f0.f21778a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i0 f21743o = i0.f21805b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q0 f21734f = new q0((byte) 0, 5);

    public static void b(String str, d0 d0Var) {
        if (d0Var != null) {
            if (d0Var.f21764i != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (d0Var.f21765j != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (d0Var.f21766k != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final d0 a() {
        int i10 = this.f21731c;
        if (i10 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f21731c).toString());
        }
        b1 b1Var = this.f21729a;
        if (b1Var == null) {
            throw new IllegalStateException("request == null");
        }
        y yVar = this.f21730b;
        if (yVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f21732d;
        if (str != null) {
            return new d0(b1Var, yVar, str, i10, this.f21733e, this.f21734f.k(), this.f21735g, this.f21736h, this.f21737i, this.f21738j, this.f21739k, this.f21740l, this.f21741m, this.f21742n, this.f21743o);
        }
        throw new IllegalStateException("message == null");
    }

    public final void c(r rVar) {
        jc.l.e(rVar, "headers");
        this.f21734f = rVar.j();
    }
}
