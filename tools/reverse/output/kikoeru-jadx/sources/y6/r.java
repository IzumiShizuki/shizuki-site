package y6;

import m7.k0;
import r5.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tc.b0 f25771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h0 f25773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f25774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25775e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f25782l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f25776f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v4.z f25777g = new v4.z(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v4.z f25778h = new v4.z(33);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v4.z f25779i = new v4.z(34);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v4.z f25780j = new v4.z(39);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v4.z f25781k = new v4.z(40);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f25783m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p4.s f25784n = new p4.s();

    public r(tc.b0 b0Var) {
        this.f25771a = b0Var;
    }

    @Override // y6.h
    public final void a() {
        this.f25782l = 0L;
        this.f25783m = -9223372036854775807L;
        q4.p.a(this.f25776f);
        this.f25777g.d();
        this.f25778h.d();
        this.f25779i.d();
        this.f25780j.d();
        this.f25781k.d();
        ((h7.i) this.f25771a.f20620d).b(0);
        q qVar = this.f25774d;
        if (qVar != null) {
            qVar.f25763f = false;
            qVar.f25764g = false;
            qVar.f25765h = false;
            qVar.f25766i = false;
            qVar.f25767j = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0250  */
    @Override // y6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(p4.s r37) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.r.b(p4.s):void");
    }

    @Override // y6.h
    public final void c(r5.q qVar, k0 k0Var) {
        k0Var.b();
        k0Var.d();
        this.f25772b = (String) k0Var.f14910e;
        k0Var.d();
        h0 h0VarU = qVar.u(k0Var.f14908c, 2);
        this.f25773c = h0VarU;
        this.f25774d = new q(h0VarU);
        this.f25771a.i(qVar, k0Var);
    }

    @Override // y6.h
    public final void d(boolean z10) {
        p4.c.j(this.f25773c);
        int i10 = p4.c0.f16548a;
        if (z10) {
            ((h7.i) this.f25771a.f20620d).b(0);
            q qVar = this.f25774d;
            long j10 = this.f25782l;
            qVar.f25770m = qVar.f25760c;
            qVar.a((int) (j10 - qVar.f25759b));
            qVar.f25768k = qVar.f25759b;
            qVar.f25759b = j10;
            qVar.a(0);
            qVar.f25766i = false;
        }
    }

    @Override // y6.h
    public final void e(int i10, long j10) {
        this.f25783m = j10;
    }

    public final void f(byte[] bArr, int i10, int i11) {
        q qVar = this.f25774d;
        if (qVar.f25763f) {
            int i12 = qVar.f25761d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                qVar.f25764g = (bArr[i13] & 128) != 0;
                qVar.f25763f = false;
            } else {
                qVar.f25761d = (i11 - i10) + i12;
            }
        }
        if (!this.f25775e) {
            this.f25777g.a(bArr, i10, i11);
            this.f25778h.a(bArr, i10, i11);
            this.f25779i.a(bArr, i10, i11);
        }
        this.f25780j.a(bArr, i10, i11);
        this.f25781k.a(bArr, i10, i11);
    }
}
