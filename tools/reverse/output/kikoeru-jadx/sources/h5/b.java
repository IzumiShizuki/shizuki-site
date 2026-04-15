package h5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import gh.g;
import j5.d0;
import java.util.ArrayList;
import m4.k0;
import m4.l0;
import m4.m0;
import m4.n0;
import m4.q;
import p4.c;
import p4.c0;
import p4.n;
import q.t0;
import v4.e;
import v4.s;
import v4.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Handler.Callback {
    public long A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f8117r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f8118s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Handler f8119t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a6.a f8120u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public g f8121v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f8122w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8123x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f8124y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public n0 f8125z;

    public b(s sVar, Looper looper) {
        Handler handler;
        super(5);
        this.f8118s = sVar;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = c0.f16548a;
            handler = new Handler(looper, this);
        }
        this.f8119t = handler;
        this.f8117r = a.f8116a;
        this.f8120u = new a6.a(1);
        this.A = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(m4.n0 r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            m4.m0[] r1 = r6.f14409a
            int r2 = r1.length
            if (r0 >= r2) goto L46
            r2 = r1[r0]
            m4.q r2 = r2.a()
            if (r2 == 0) goto L3e
            h5.a r3 = r5.f8117r
            boolean r4 = r3.b(r2)
            if (r4 == 0) goto L3e
            gh.g r2 = r3.a(r2)
            r1 = r1[r0]
            byte[] r1 = r1.c()
            r1.getClass()
            a6.a r3 = r5.f8120u
            r3.h()
            int r4 = r1.length
            r3.j(r4)
            java.nio.ByteBuffer r4 = r3.f21382e
            r4.put(r1)
            r3.k()
            m4.n0 r1 = r2.s(r3)
            if (r1 == 0) goto L43
            r5.A(r1, r7)
            goto L43
        L3e:
            r1 = r1[r0]
            r7.add(r1)
        L43:
            int r0 = r0 + 1
            goto L1
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.b.A(m4.n0, java.util.ArrayList):void");
    }

    public final long B(long j10) {
        c.i(j10 != -9223372036854775807L);
        c.i(this.A != -9223372036854775807L);
        return j10 - this.A;
    }

    public final void C(n0 n0Var) {
        s sVar = this.f8118s;
        v vVar = sVar.f22626a;
        l0 l0Var = vVar.f22690s0;
        n nVar = vVar.f22683m;
        k0 k0VarA = l0Var.a();
        int i10 = 0;
        while (true) {
            m0[] m0VarArr = n0Var.f14409a;
            if (i10 >= m0VarArr.length) {
                break;
            }
            m0VarArr[i10].b(k0VarA);
            i10++;
        }
        vVar.f22690s0 = new l0(k0VarA);
        l0 l0VarE1 = vVar.E1();
        if (!l0VarE1.equals(vVar.K)) {
            vVar.K = l0VarE1;
            nVar.c(14, new androidx.media3.exoplayer.offline.g(22, sVar));
        }
        nVar.c(28, new androidx.media3.exoplayer.offline.g(23, n0Var));
        nVar.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        C((n0) message.obj);
        return true;
    }

    @Override // v4.e
    public final String i() {
        return "MetadataRenderer";
    }

    @Override // v4.e
    public final boolean k() {
        return this.f8123x;
    }

    @Override // v4.e
    public final boolean l() {
        return true;
    }

    @Override // v4.e
    public final void m() {
        this.f8125z = null;
        this.f8121v = null;
        this.A = -9223372036854775807L;
    }

    @Override // v4.e
    public final void o(long j10, boolean z10) {
        this.f8125z = null;
        this.f8122w = false;
        this.f8123x = false;
    }

    @Override // v4.e
    public final void t(q[] qVarArr, long j10, long j11, d0 d0Var) {
        this.f8121v = this.f8117r.a(qVarArr[0]);
        n0 n0Var = this.f8125z;
        if (n0Var != null) {
            long j12 = n0Var.f14410b;
            long j13 = (this.A + j12) - j11;
            if (j12 != j13) {
                n0Var = new n0(j13, n0Var.f14409a);
            }
            this.f8125z = n0Var;
        }
        this.A = j11;
    }

    @Override // v4.e
    public final void v(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            if (!this.f8122w && this.f8125z == null) {
                a6.a aVar = this.f8120u;
                aVar.h();
                v2.e eVar = this.f22452c;
                eVar.n();
                int iU = u(eVar, aVar, 0);
                if (iU == -4) {
                    if (aVar.d(4)) {
                        this.f8122w = true;
                    } else if (aVar.f21384g >= this.f22461l) {
                        aVar.f205j = this.f8124y;
                        aVar.k();
                        g gVar = this.f8121v;
                        int i10 = c0.f16548a;
                        n0 n0VarS = gVar.s(aVar);
                        if (n0VarS != null) {
                            ArrayList arrayList = new ArrayList(n0VarS.f14409a.length);
                            A(n0VarS, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f8125z = new n0(B(aVar.f21384g), (m0[]) arrayList.toArray(new m0[0]));
                            }
                        }
                    }
                } else if (iU == -5) {
                    q qVar = (q) eVar.f22365c;
                    qVar.getClass();
                    this.f8124y = qVar.f14549s;
                }
            }
            n0 n0Var = this.f8125z;
            if (n0Var == null || n0Var.f14410b > B(j10)) {
                z10 = false;
            } else {
                n0 n0Var2 = this.f8125z;
                Handler handler = this.f8119t;
                if (handler != null) {
                    handler.obtainMessage(1, n0Var2).sendToTarget();
                } else {
                    C(n0Var2);
                }
                this.f8125z = null;
                z10 = true;
            }
            if (this.f8122w && this.f8125z == null) {
                this.f8123x = true;
            }
        }
    }

    @Override // v4.e
    public final int y(q qVar) {
        if (this.f8117r.b(qVar)) {
            return t0.g(qVar.M == 0 ? 4 : 2, 0, 0, 0);
        }
        return t0.g(0, 0, 0, 0);
    }
}
