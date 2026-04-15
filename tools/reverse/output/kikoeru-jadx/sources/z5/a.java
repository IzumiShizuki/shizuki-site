package z5;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import l6.m;
import p4.s;
import r5.k;
import r5.n;
import r5.o;
import r5.q;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f26460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26463e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g6.a f26465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o f26466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public bh.a f26467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m f26468j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f26459a = new s(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f26464f = -1;

    @Override // r5.n
    public final void a() {
        m mVar = this.f26468j;
        if (mVar != null) {
            mVar.getClass();
        }
    }

    public final void b() {
        q qVar = this.f26460b;
        qVar.getClass();
        qVar.n();
        this.f26460b.a(new r5.s(-9223372036854775807L));
        this.f26461c = 6;
    }

    @Override // r5.n
    public final boolean f(o oVar) throws EOFException, InterruptedIOException {
        k kVar = (k) oVar;
        s sVar = this.f26459a;
        sVar.D(2);
        kVar.i(sVar.f16611a, 0, 2, false);
        if (sVar.A() == 65496) {
            sVar.D(2);
            kVar.i(sVar.f16611a, 0, 2, false);
            int iA = sVar.A();
            this.f26462d = iA;
            if (iA == 65504) {
                sVar.D(2);
                kVar.i(sVar.f16611a, 0, 2, false);
                kVar.a(sVar.A() - 2, false);
                sVar.D(2);
                kVar.i(sVar.f16611a, 0, 2, false);
                this.f26462d = sVar.A();
            }
            if (this.f26462d == 65505) {
                kVar.a(2, false);
                sVar.D(6);
                kVar.i(sVar.f16611a, 0, 6, false);
                if (sVar.w() == 1165519206 && sVar.A() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0179  */
    @Override // r5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(r5.o r26, b0.a r27) throws m4.p0 {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.a.g(r5.o, b0.a):int");
    }

    @Override // r5.n
    public final void h(q qVar) {
        this.f26460b = qVar;
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        if (j10 == 0) {
            this.f26461c = 0;
            this.f26468j = null;
        } else if (this.f26461c == 5) {
            m mVar = this.f26468j;
            mVar.getClass();
            mVar.i(j10, j11);
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
