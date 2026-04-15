package y6;

import m7.k0;
import r5.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f25696l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v2.e f25697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4.s f25698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f25699c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f25700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v4.z f25701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f25702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f25703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f25704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h0 f25705i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25706j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f25707k;

    public m(v2.e eVar) {
        this.f25697a = eVar;
        k kVar = new k();
        kVar.f25687e = new byte[128];
        this.f25700d = kVar;
        this.f25707k = -9223372036854775807L;
        this.f25701e = new v4.z(178);
        this.f25698b = new p4.s();
    }

    @Override // y6.h
    public final void a() {
        q4.p.a(this.f25699c);
        k kVar = this.f25700d;
        kVar.f25683a = false;
        kVar.f25685c = 0;
        kVar.f25684b = 0;
        l lVar = this.f25702f;
        if (lVar != null) {
            lVar.f25689b = false;
            lVar.f25690c = false;
            lVar.f25691d = false;
            lVar.f25692e = -1;
        }
        v4.z zVar = this.f25701e;
        if (zVar != null) {
            zVar.d();
        }
        this.f25703g = 0L;
        this.f25707k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0236  */
    @Override // y6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(p4.s r20) {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.m.b(p4.s):void");
    }

    @Override // y6.h
    public final void c(r5.q qVar, k0 k0Var) {
        k0Var.b();
        k0Var.d();
        this.f25704h = (String) k0Var.f14910e;
        k0Var.d();
        h0 h0VarU = qVar.u(k0Var.f14908c, 2);
        this.f25705i = h0VarU;
        this.f25702f = new l(h0VarU);
        this.f25697a.q(qVar, k0Var);
    }

    @Override // y6.h
    public final void d(boolean z10) {
        p4.c.j(this.f25702f);
        if (z10) {
            this.f25702f.b(0, this.f25706j, this.f25703g);
            l lVar = this.f25702f;
            lVar.f25689b = false;
            lVar.f25690c = false;
            lVar.f25691d = false;
            lVar.f25692e = -1;
        }
    }

    @Override // y6.h
    public final void e(int i10, long j10) {
        this.f25707k = j10;
    }
}
