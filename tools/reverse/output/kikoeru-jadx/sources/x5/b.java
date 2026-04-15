package x5;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import p4.s;
import r5.k;
import r5.m;
import r5.n;
import r5.o;
import r5.q;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f24757a = new s(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f24758b = new s(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f24759c = new s(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f24760d = new s();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f24761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f24762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f24765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f24769m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f24770n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f24771o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f24772p;

    public b() {
        c cVar = new c(new m());
        cVar.f24773b = -9223372036854775807L;
        cVar.f24774c = new long[0];
        cVar.f24775d = new long[0];
        this.f24761e = cVar;
        this.f24763g = 1;
    }

    public final s b(o oVar) {
        int i10 = this.f24768l;
        s sVar = this.f24760d;
        byte[] bArr = sVar.f16611a;
        if (i10 > bArr.length) {
            sVar.E(new byte[Math.max(bArr.length * 2, i10)], 0);
        } else {
            sVar.G(0);
        }
        sVar.F(this.f24768l);
        oVar.readFully(sVar.f16611a, 0, this.f24768l);
        return sVar;
    }

    @Override // r5.n
    public final boolean f(o oVar) throws EOFException, InterruptedIOException {
        s sVar = this.f24757a;
        k kVar = (k) oVar;
        kVar.i(sVar.f16611a, 0, 3, false);
        sVar.G(0);
        if (sVar.x() == 4607062) {
            kVar.i(sVar.f16611a, 0, 2, false);
            sVar.G(0);
            if ((sVar.A() & TinkerReport.KEY_LOADED_UNKNOWN_EXCEPTION) == 0) {
                kVar.i(sVar.f16611a, 0, 4, false);
                sVar.G(0);
                int iG = sVar.g();
                kVar.f18848f = 0;
                kVar.a(iG, false);
                kVar.i(sVar.f16611a, 0, 4, false);
                sVar.G(0);
                if (sVar.g() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0398 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017a  */
    @Override // r5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(r5.o r29, b0.a r30) throws m4.p0 {
        /*
            Method dump skipped, instruction units count: 1117
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.b.g(r5.o, b0.a):int");
    }

    @Override // r5.n
    public final void h(q qVar) {
        this.f24762f = qVar;
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        if (j10 == 0) {
            this.f24763g = 1;
            this.f24764h = false;
        } else {
            this.f24763g = 3;
        }
        this.f24766j = 0;
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
