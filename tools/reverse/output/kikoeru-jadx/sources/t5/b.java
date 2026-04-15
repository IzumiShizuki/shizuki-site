package t5;

import b5.d0;
import i7.j1;
import java.util.List;
import m3.l;
import p4.c0;
import p4.s;
import r5.n;
import r5.o;
import r5.p;
import r5.q;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f20499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f20500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f20502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f20504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f20505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f20506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e[] f20507i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f20508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f20509k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f20510l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f20511m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f20512n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20513o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f20514p;

    public b(int i10, l lVar) {
        this.f20502d = lVar;
        this.f20501c = (i10 & 1) == 0;
        this.f20499a = new s(12);
        this.f20500b = new j1();
        this.f20504f = new p(1);
        this.f20507i = new e[0];
        this.f20511m = -1L;
        this.f20512n = -1L;
        this.f20510l = -1;
        this.f20506h = -9223372036854775807L;
    }

    @Override // r5.n
    public final boolean f(o oVar) {
        s sVar = this.f20499a;
        oVar.z(sVar.f16611a, 0, 12);
        sVar.G(0);
        if (sVar.i() == 1179011410) {
            sVar.H(4);
            if (sVar.i() == 541677121) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010f  */
    @Override // r5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(r5.o r24, b0.a r25) throws m4.p0 {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.b.g(r5.o, b0.a):int");
    }

    @Override // r5.n
    public final void h(q qVar) {
        this.f20503e = 0;
        if (this.f20501c) {
            qVar = new d0(qVar, this.f20502d);
        }
        this.f20504f = qVar;
        this.f20508j = -1L;
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        this.f20508j = -1L;
        this.f20509k = null;
        for (e eVar : this.f20507i) {
            if (eVar.f20534k == 0) {
                eVar.f20532i = 0;
            } else {
                eVar.f20532i = eVar.f20537n[c0.e(eVar.f20536m, j10, true)];
            }
        }
        if (j10 != 0) {
            this.f20503e = 6;
        } else if (this.f20507i.length == 0) {
            this.f20503e = 0;
        } else {
            this.f20503e = 3;
        }
    }

    @Override // r5.n
    public final List j() {
        g0 g0Var = i0.f25998b;
        return a1.f25946e;
    }

    @Override // r5.n
    public final void a() {
    }

    @Override // r5.n
    public final n c() {
        return this;
    }
}
