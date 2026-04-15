package l5;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.exoplayer.offline.g;
import b7.z2;
import hd.q0;
import i7.p2;
import j5.c1;
import j5.d0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import m3.l;
import m4.o0;
import m4.q;
import o6.i;
import p4.c0;
import q.t0;
import u4.f;
import v4.e;
import v4.s;
import v4.v;
import ya.a1;
import ya.f0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Handler.Callback {
    public o6.c A;
    public int B;
    public final Handler C;
    public final s D;
    public final v2.e E;
    public boolean F;
    public boolean G;
    public q H;
    public long I;
    public long J;
    public IOException K;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f11714r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f11715s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a f11716t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c f11717u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11718v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11719w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public o6.e f11720x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i f11721y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o6.c f11722z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(s sVar, Looper looper) {
        Handler handler;
        super(3);
        p2 p2Var = c.f11713j0;
        this.D = sVar;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = c0.f16548a;
            handler = new Handler(looper, this);
        }
        this.C = handler;
        this.f11717u = p2Var;
        this.f11714r = new l(15);
        this.f11715s = new f(1);
        this.E = new v2.e(1, false);
        this.J = -9223372036854775807L;
        this.I = -9223372036854775807L;
    }

    public final void A() {
        p4.c.h("Legacy decoding is disabled, can't handle " + this.H.f14544n + " samples (expected application/x-media3-cues).", Objects.equals(this.H.f14544n, "application/cea-608") || Objects.equals(this.H.f14544n, "application/x-mp4-cea-608") || Objects.equals(this.H.f14544n, "application/cea-708"));
    }

    public final long B() {
        if (this.B == -1) {
            return Long.MAX_VALUE;
        }
        this.f11722z.getClass();
        if (this.B >= this.f11722z.g()) {
            return Long.MAX_VALUE;
        }
        return this.f11722z.e(this.B);
    }

    public final long C(long j10) {
        p4.c.i(j10 != -9223372036854775807L);
        return j10 - this.f22460k;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            r7 = this;
            r0 = 1
            r7.f11718v = r0
            m4.q r1 = r7.H
            r1.getClass()
            l5.c r2 = r7.f11717u
            i7.p2 r2 = (i7.p2) r2
            java.lang.Object r2 = r2.f9258a
            m3.l r2 = (m3.l) r2
            java.lang.String r3 = r1.f14544n
            int r4 = r1.I
            if (r3 == 0) goto L50
            int r5 = r3.hashCode()
            r6 = -1
            switch(r5) {
                case 930165504: goto L34;
                case 1566015601: goto L2b;
                case 1566016562: goto L20;
                default: goto L1e;
            }
        L1e:
            r0 = -1
            goto L3e
        L20:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L29
            goto L1e
        L29:
            r0 = 2
            goto L3e
        L2b:
            java.lang.String r5 = "application/cea-608"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L3e
            goto L1e
        L34:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3d
            goto L1e
        L3d:
            r0 = 0
        L3e:
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L4a;
                case 2: goto L42;
                default: goto L41;
            }
        L41:
            goto L50
        L42:
            p6.f r0 = new p6.f
            java.util.List r1 = r1.f14547q
            r0.<init>(r4, r1)
            goto L6d
        L4a:
            p6.c r0 = new p6.c
            r0.<init>(r4, r3)
            goto L6d
        L50:
            boolean r0 = r2.k(r1)
            if (r0 == 0) goto L75
            o6.l r0 = r2.h(r1)
            f5.b r1 = new f5.b
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L6d:
            r7.f11720x = r0
            long r1 = r7.f22461l
            r0.c(r1)
            return
        L75:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = j2.h0.x(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.d.D():void");
    }

    public final void E(o4.c cVar) {
        i0 i0Var = cVar.f16217a;
        s sVar = this.D;
        sVar.f22626a.f22683m.e(27, new z2(2, i0Var));
        v vVar = sVar.f22626a;
        vVar.W = cVar;
        vVar.f22683m.e(27, new g(21, cVar));
    }

    public final void F() {
        this.f11721y = null;
        this.B = -1;
        o6.c cVar = this.f11722z;
        if (cVar != null) {
            cVar.i();
            this.f11722z = null;
        }
        o6.c cVar2 = this.A;
        if (cVar2 != null) {
            cVar2.i();
            this.A = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        E((o4.c) message.obj);
        return true;
    }

    @Override // v4.e
    public final String i() {
        return "TextRenderer";
    }

    @Override // v4.e
    public final boolean k() {
        return this.G;
    }

    @Override // v4.e
    public final boolean l() {
        if (this.H != null) {
            if (this.K == null) {
                try {
                    c1 c1Var = this.f22458i;
                    c1Var.getClass();
                    c1Var.b();
                } catch (IOException e10) {
                    this.K = e10;
                }
            }
            if (this.K != null) {
                q qVar = this.H;
                qVar.getClass();
                if (Objects.equals(qVar.f14544n, "application/x-media3-cues")) {
                    a aVar = this.f11716t;
                    aVar.getClass();
                    return aVar.a(this.I) != Long.MIN_VALUE;
                }
                if (!this.G) {
                    if (this.F) {
                        o6.c cVar = this.f11722z;
                        long j10 = this.I;
                        if (cVar == null || cVar.e(cVar.g() - 1) <= j10) {
                            o6.c cVar2 = this.A;
                            long j11 = this.I;
                            if ((cVar2 == null || cVar2.e(cVar2.g() - 1) <= j11) && this.f11721y != null) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // v4.e
    public final void m() {
        this.H = null;
        this.J = -9223372036854775807L;
        o4.c cVar = new o4.c(C(this.I), a1.f25946e);
        Handler handler = this.C;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            E(cVar);
        }
        this.I = -9223372036854775807L;
        if (this.f11720x != null) {
            F();
            o6.e eVar = this.f11720x;
            eVar.getClass();
            eVar.a();
            this.f11720x = null;
            this.f11719w = 0;
        }
    }

    @Override // v4.e
    public final void o(long j10, boolean z10) {
        this.I = j10;
        a aVar = this.f11716t;
        if (aVar != null) {
            aVar.clear();
        }
        o4.c cVar = new o4.c(C(this.I), a1.f25946e);
        Handler handler = this.C;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            E(cVar);
        }
        this.F = false;
        this.G = false;
        this.J = -9223372036854775807L;
        q qVar = this.H;
        if (qVar == null || Objects.equals(qVar.f14544n, "application/x-media3-cues")) {
            return;
        }
        if (this.f11719w == 0) {
            F();
            o6.e eVar = this.f11720x;
            eVar.getClass();
            eVar.flush();
            eVar.c(this.f22461l);
            return;
        }
        F();
        o6.e eVar2 = this.f11720x;
        eVar2.getClass();
        eVar2.a();
        this.f11720x = null;
        this.f11719w = 0;
        D();
    }

    @Override // v4.e
    public final void t(q[] qVarArr, long j10, long j11, d0 d0Var) {
        q qVar = qVarArr[0];
        this.H = qVar;
        if (Objects.equals(qVar.f14544n, "application/x-media3-cues")) {
            this.f11716t = this.H.J == 1 ? new b() : new q0((byte) 0, 2);
            return;
        }
        A();
        if (this.f11720x != null) {
            this.f11719w = 1;
        } else {
            D();
        }
    }

    @Override // v4.e
    public final void v(long j10, long j11) {
        boolean z10;
        v2.e eVar;
        long jE;
        if (this.f22463n) {
            long j12 = this.J;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                F();
                this.G = true;
            }
        }
        if (this.G) {
            return;
        }
        q qVar = this.H;
        qVar.getClass();
        boolean zEquals = Objects.equals(qVar.f14544n, "application/x-media3-cues");
        Handler handler = this.C;
        v2.e eVar2 = this.E;
        boolean zB = false;
        zB = false;
        zB = false;
        if (zEquals) {
            this.f11716t.getClass();
            if (!this.F) {
                f fVar = this.f11715s;
                if (u(eVar2, fVar, 0) == -4) {
                    if (fVar.d(4)) {
                        this.F = true;
                    } else {
                        fVar.k();
                        ByteBuffer byteBuffer = fVar.f21382e;
                        byteBuffer.getClass();
                        long j13 = fVar.f21384g;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f11714r.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        f0 f0VarP = i0.p();
                        for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i10);
                            bundle2.getClass();
                            f0VarP.a(o4.b.b(bundle2));
                        }
                        o6.a aVar = new o6.a(j13, bundle.getLong("d"), f0VarP.f());
                        fVar.h();
                        zB = this.f11716t.b(aVar, j10);
                    }
                }
            }
            long jA = this.f11716t.a(this.I);
            if (jA == Long.MIN_VALUE && this.F && !zB) {
                this.G = true;
            }
            if (jA != Long.MIN_VALUE && jA <= j10) {
                zB = true;
            }
            if (zB) {
                i0 i0VarC = this.f11716t.c(j10);
                long jD = this.f11716t.d(j10);
                o4.c cVar = new o4.c(C(jD), i0VarC);
                if (handler != null) {
                    handler.obtainMessage(1, cVar).sendToTarget();
                } else {
                    E(cVar);
                }
                this.f11716t.e(jD);
            }
            this.I = j10;
            return;
        }
        A();
        this.I = j10;
        if (this.A == null) {
            o6.e eVar3 = this.f11720x;
            eVar3.getClass();
            eVar3.d(j10);
            try {
                o6.e eVar4 = this.f11720x;
                eVar4.getClass();
                this.A = (o6.c) eVar4.e();
            } catch (o6.f e10) {
                p4.c.o("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.H, e10);
                o4.c cVar2 = new o4.c(C(this.I), a1.f25946e);
                if (handler != null) {
                    handler.obtainMessage(1, cVar2).sendToTarget();
                } else {
                    E(cVar2);
                }
                F();
                o6.e eVar5 = this.f11720x;
                eVar5.getClass();
                eVar5.a();
                this.f11720x = null;
                this.f11719w = 0;
                D();
                return;
            }
        }
        if (this.f22457h != 2) {
            return;
        }
        if (this.f11722z != null) {
            long jB = B();
            z10 = false;
            while (jB <= j10) {
                this.B++;
                jB = B();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        o6.c cVar3 = this.A;
        if (cVar3 == null) {
            eVar = eVar2;
        } else if (cVar3.d(4)) {
            if (!z10 && B() == Long.MAX_VALUE) {
                if (this.f11719w == 2) {
                    F();
                    o6.e eVar6 = this.f11720x;
                    eVar6.getClass();
                    eVar6.a();
                    this.f11720x = null;
                    this.f11719w = 0;
                    D();
                } else {
                    F();
                    this.G = true;
                }
            }
            eVar = eVar2;
        } else {
            eVar = eVar2;
            if (cVar3.f21387c <= j10) {
                o6.c cVar4 = this.f11722z;
                if (cVar4 != null) {
                    cVar4.i();
                }
                this.B = cVar3.a(j10);
                this.f11722z = cVar3;
                this.A = null;
                z10 = true;
            }
        }
        if (z10) {
            this.f11722z.getClass();
            int iA = this.f11722z.a(j10);
            if (iA == 0 || this.f11722z.g() == 0) {
                jE = this.f11722z.f21387c;
            } else if (iA == -1) {
                o6.c cVar5 = this.f11722z;
                jE = cVar5.e(cVar5.g() - 1);
            } else {
                jE = this.f11722z.e(iA - 1);
            }
            o4.c cVar6 = new o4.c(C(jE), this.f11722z.f(j10));
            if (handler != null) {
                handler.obtainMessage(1, cVar6).sendToTarget();
            } else {
                E(cVar6);
            }
        }
        if (this.f11719w == 2) {
            return;
        }
        while (!this.F) {
            try {
                i iVar = this.f11721y;
                if (iVar == null) {
                    o6.e eVar7 = this.f11720x;
                    eVar7.getClass();
                    iVar = (i) eVar7.f();
                    if (iVar == null) {
                        return;
                    } else {
                        this.f11721y = iVar;
                    }
                }
                if (this.f11719w == 1) {
                    iVar.f17713b = 4;
                    o6.e eVar8 = this.f11720x;
                    eVar8.getClass();
                    eVar8.b(iVar);
                    this.f11721y = null;
                    this.f11719w = 2;
                    return;
                }
                int iU = u(eVar, iVar, 0);
                if (iU == -4) {
                    if (iVar.d(4)) {
                        this.F = true;
                        this.f11718v = false;
                    } else {
                        q qVar2 = (q) eVar.f22365c;
                        if (qVar2 == null) {
                            return;
                        }
                        iVar.f16265j = qVar2.f14549s;
                        iVar.k();
                        this.f11718v &= !iVar.d(1);
                    }
                    if (!this.f11718v) {
                        o6.e eVar9 = this.f11720x;
                        eVar9.getClass();
                        eVar9.b(iVar);
                        this.f11721y = null;
                    }
                } else if (iU == -3) {
                    return;
                }
            } catch (o6.f e11) {
                p4.c.o("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.H, e11);
                o4.c cVar7 = new o4.c(C(this.I), a1.f25946e);
                if (handler != null) {
                    handler.obtainMessage(1, cVar7).sendToTarget();
                } else {
                    E(cVar7);
                }
                F();
                o6.e eVar10 = this.f11720x;
                eVar10.getClass();
                eVar10.a();
                this.f11720x = null;
                this.f11719w = 0;
                D();
                return;
            }
        }
    }

    @Override // v4.e
    public final int y(q qVar) {
        boolean zEquals = Objects.equals(qVar.f14544n, "application/x-media3-cues");
        String str = qVar.f14544n;
        if (!zEquals) {
            p2 p2Var = (p2) this.f11717u;
            p2Var.getClass();
            if (!((l) p2Var.f9258a).k(qVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return o0.n(str) ? t0.g(1, 0, 0, 0) : t0.g(0, 0, 0, 0);
            }
        }
        return t0.g(qVar.M == 0 ? 4 : 2, 0, 0, 0);
    }
}
