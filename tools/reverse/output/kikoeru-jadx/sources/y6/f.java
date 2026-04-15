package y6;

import java.util.concurrent.atomic.AtomicInteger;
import m4.o0;
import m7.k0;
import r5.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4.s f25635a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25638d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f25640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h0 f25641g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25644j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f25645k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m4.q f25646l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25647m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f25648n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25642h = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f25651q = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f25636b = new AtomicInteger();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f25649o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f25650p = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25639e = "video/mp2t";

    public f(int i10, int i11, String str) {
        this.f25635a = new p4.s(new byte[i11]);
        this.f25637c = str;
        this.f25638d = i10;
    }

    @Override // y6.h
    public final void a() {
        this.f25642h = 0;
        this.f25643i = 0;
        this.f25644j = 0;
        this.f25651q = -9223372036854775807L;
        this.f25636b.set(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04bd  */
    @Override // y6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(p4.s r40) throws m4.p0 {
        /*
            Method dump skipped, instruction units count: 1418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.f.b(p4.s):void");
    }

    @Override // y6.h
    public final void c(r5.q qVar, k0 k0Var) {
        k0Var.b();
        k0Var.d();
        this.f25640f = (String) k0Var.f14910e;
        k0Var.d();
        this.f25641g = qVar.u(k0Var.f14908c, 1);
    }

    @Override // y6.h
    public final void e(int i10, long j10) {
        this.f25651q = j10;
    }

    public final boolean f(p4.s sVar, byte[] bArr, int i10) {
        int iMin = Math.min(sVar.a(), i10 - this.f25643i);
        sVar.e(bArr, this.f25643i, iMin);
        int i11 = this.f25643i + iMin;
        this.f25643i = i11;
        return i11 == i10;
    }

    public final void g(r5.a aVar) {
        int i10 = aVar.f18748b;
        String str = aVar.f18747a;
        int i11 = aVar.f18749c;
        if (i10 == -2147483647 || i11 == -1) {
            return;
        }
        m4.q qVar = this.f25646l;
        if (qVar != null && i11 == qVar.D && i10 == qVar.E && str.equals(qVar.f14544n)) {
            return;
        }
        m4.q qVar2 = this.f25646l;
        m4.p pVar = qVar2 == null ? new m4.p() : qVar2.a();
        pVar.f14476a = this.f25640f;
        pVar.f14487l = o0.p(this.f25639e);
        pVar.f14488m = o0.p(str);
        pVar.C = i11;
        pVar.D = i10;
        pVar.f14479d = this.f25637c;
        pVar.f14481f = this.f25638d;
        m4.q qVar3 = new m4.q(pVar);
        this.f25646l = qVar3;
        this.f25641g.b(qVar3);
    }

    @Override // y6.h
    public final void d(boolean z10) {
    }
}
