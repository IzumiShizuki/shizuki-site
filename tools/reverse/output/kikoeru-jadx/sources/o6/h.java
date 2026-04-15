package o6;

import java.util.ArrayList;
import java.util.List;
import m4.o0;
import m4.p;
import m4.q;
import p4.c0;
import p4.s;
import r5.h0;
import r5.n;
import r5.o;
import r5.y;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f16255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f16256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f16257c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h0 f16260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long[] f16263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f16264j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f16259e = c0.f16553f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f16258d = new s();

    public h(l lVar, q qVar) {
        q qVar2;
        this.f16255a = lVar;
        if (qVar != null) {
            p pVarA = qVar.a();
            pVarA.f14488m = o0.p("application/x-media3-cues");
            pVarA.f14485j = qVar.f14544n;
            pVarA.I = lVar.u();
            qVar2 = new q(pVarA);
        } else {
            qVar2 = null;
        }
        this.f16256b = qVar2;
        this.f16257c = new ArrayList();
        this.f16262h = 0;
        this.f16263i = c0.f16554g;
        this.f16264j = -9223372036854775807L;
    }

    @Override // r5.n
    public final void a() {
        if (this.f16262h == 5) {
            return;
        }
        this.f16255a.reset();
        this.f16262h = 5;
    }

    public final void b(g gVar) {
        p4.c.j(this.f16260f);
        byte[] bArr = gVar.f16254b;
        int length = bArr.length;
        s sVar = this.f16258d;
        sVar.getClass();
        sVar.E(bArr, bArr.length);
        this.f16260f.e(length, sVar);
        this.f16260f.a(gVar.f16253a, 1, length, 0, null);
    }

    @Override // r5.n
    public final boolean f(o oVar) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x007f A[EXC_TOP_SPLITTER, PHI: r22
      0x007f: PHI (r22v4 int) = (r22v5 int), (r22v6 int) binds: [B:32:0x007d, B:29:0x0078] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // r5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(r5.o r21, b0.a r22) throws m4.p0 {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.h.g(r5.o, b0.a):int");
    }

    @Override // r5.n
    public final void h(r5.q qVar) {
        p4.c.i(this.f16262h == 0);
        h0 h0VarU = qVar.u(0, 3);
        this.f16260f = h0VarU;
        q qVar2 = this.f16256b;
        if (qVar2 != null) {
            h0VarU.b(qVar2);
            qVar.n();
            qVar.a(new y(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.f16262h = 1;
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        int i10 = this.f16262h;
        p4.c.i((i10 == 0 || i10 == 5) ? false : true);
        this.f16264j = j11;
        if (this.f16262h == 2) {
            this.f16262h = 1;
        }
        if (this.f16262h == 4) {
            this.f16262h = 3;
        }
    }

    @Override // r5.n
    public final List j() {
        g0 g0Var = i0.f25998b;
        return a1.f25946e;
    }

    @Override // r5.n
    public final n c() {
        return this;
    }
}
