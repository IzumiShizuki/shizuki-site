package x4;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import c7.e1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import m4.s0;
import p4.c0;
import r.y1;
import v4.g0;
import v4.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends g5.q implements g0 {
    public final Context S0;
    public final p5.y T0;
    public final v U0;
    public final e1 V0;
    public int W0;
    public boolean X0;
    public boolean Y0;
    public m4.q Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public m4.q f24728a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public long f24729b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f24730c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f24731d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f24732e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f24733f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, g5.j jVar, g5.r rVar, Handler handler, v4.s sVar, v vVar) {
        super(1, jVar, rVar, 44100.0f);
        e1 e1Var = c0.f16548a >= 35 ? new e1(14) : null;
        this.S0 = context.getApplicationContext();
        this.U0 = vVar;
        this.V0 = e1Var;
        this.f24733f1 = -1000;
        this.T0 = new p5.y(handler, sVar, 1);
        vVar.f24717r = new y1(29, this);
    }

    @Override // g5.q
    public final v4.g B(g5.n nVar, m4.q qVar, m4.q qVar2) {
        v4.g gVarB = nVar.b(qVar, qVar2);
        int i10 = gVarB.f22489e;
        if (this.E == null && p0(qVar2)) {
            i10 |= 32768;
        }
        if (v0(nVar, qVar2) > this.W0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new v4.g(nVar.f7385a, qVar, qVar2, i11 != 0 ? 0 : gVarB.f22488d, i11);
    }

    @Override // g5.q
    public final float M(float f10, m4.q[] qVarArr) {
        int iMax = -1;
        for (m4.q qVar : qVarArr) {
            int i10 = qVar.E;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // g5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList N(g5.r r4, m4.q r5, boolean r6) {
        /*
            r3 = this;
            java.lang.String r0 = r5.f14544n
            r1 = 0
            if (r0 != 0) goto L8
            ya.a1 r4 = ya.a1.f25946e
            goto L2f
        L8:
            x4.v r0 = r3.U0
            int r0 = r0.i(r5)
            if (r0 == 0) goto L2b
            java.lang.String r0 = "audio/raw"
            java.util.List r0 = g5.y.e(r0, r1, r1)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L1e
            r0 = 0
            goto L24
        L1e:
            java.lang.Object r0 = r0.get(r1)
            g5.n r0 = (g5.n) r0
        L24:
            if (r0 == 0) goto L2b
            ya.a1 r4 = ya.i0.u(r0)
            goto L2f
        L2b:
            ya.a1 r4 = g5.y.g(r4, r5, r6, r1)
        L2f:
            java.util.HashMap r6 = g5.y.f7430a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            androidx.media3.exoplayer.offline.g r4 = new androidx.media3.exoplayer.offline.g
            r0 = 12
            r4.<init>(r0, r5)
            g5.s r5 = new g5.s
            r5.<init>(r1, r4)
            java.util.Collections.sort(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.x.N(g5.r, m4.q, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    @Override // g5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b7.b1 O(g5.n r13, m4.q r14, android.media.MediaCrypto r15, float r16) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.x.O(g5.n, m4.q, android.media.MediaCrypto, float):b7.b1");
    }

    @Override // g5.q
    public final void P(u4.f fVar) {
        m4.q qVar;
        q qVar2;
        if (c0.f16548a < 29 || (qVar = fVar.f21380c) == null || !Objects.equals(qVar.f14544n, "audio/opus") || !this.f7415w0) {
            return;
        }
        ByteBuffer byteBuffer = fVar.f21385h;
        byteBuffer.getClass();
        m4.q qVar3 = fVar.f21380c;
        qVar3.getClass();
        int i10 = qVar3.G;
        if (byteBuffer.remaining() == 8) {
            int i11 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            v vVar = this.U0;
            AudioTrack audioTrack = vVar.f24721v;
            if (audioTrack == null || !v.p(audioTrack) || (qVar2 = vVar.f24719t) == null || !qVar2.f24680k) {
                return;
            }
            vVar.f24721v.setOffloadDelayPadding(i10, i11);
        }
    }

    @Override // g5.q
    public final void V(Exception exc) {
        p4.c.o("MediaCodecAudioRenderer", "Audio codec error", exc);
        p5.y yVar = this.T0;
        Handler handler = yVar.f16767b;
        if (handler != null) {
            handler.post(new g(yVar, exc, 0));
        }
    }

    @Override // g5.q
    public final void W(long j10, long j11, String str) {
        p5.y yVar = this.T0;
        Handler handler = yVar.f16767b;
        if (handler != null) {
            handler.post(new g(yVar, str, j10, j11));
        }
    }

    @Override // g5.q
    public final void X(String str) {
        p5.y yVar = this.T0;
        Handler handler = yVar.f16767b;
        if (handler != null) {
            handler.post(new g(yVar, str, 3));
        }
    }

    @Override // g5.q
    public final v4.g Y(v2.e eVar) throws v4.m {
        m4.q qVar = (m4.q) eVar.f22365c;
        qVar.getClass();
        this.Z0 = qVar;
        v4.g gVarY = super.Y(eVar);
        p5.y yVar = this.T0;
        Handler handler = yVar.f16767b;
        if (handler != null) {
            handler.post(new g(yVar, qVar, gVarY));
        }
        return gVarY;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0102 A[Catch: i -> 0x0100, TryCatch #0 {i -> 0x0100, blocks: (B:44:0x00d7, B:47:0x00df, B:49:0x00e3, B:51:0x00ec, B:55:0x00fa, B:58:0x0102, B:62:0x0109, B:63:0x010e), top: B:67:0x00d7 }] */
    @Override // g5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(m4.q r9, android.media.MediaFormat r10) throws v4.m {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.x.Z(m4.q, android.media.MediaFormat):void");
    }

    @Override // v4.g0
    public final void a(s0 s0Var) {
        v vVar = this.U0;
        vVar.getClass();
        vVar.C = new s0(c0.h(s0Var.f14581a, 0.1f, 8.0f), c0.h(s0Var.f14582b, 0.1f, 8.0f));
        if (vVar.x()) {
            vVar.v();
            return;
        }
        r rVar = new r(s0Var, -9223372036854775807L, -9223372036854775807L);
        if (vVar.o()) {
            vVar.A = rVar;
        } else {
            vVar.B = rVar;
        }
    }

    @Override // g5.q
    public final void a0() {
        this.U0.getClass();
    }

    @Override // v4.g0
    public final long b() {
        if (this.f22457h == 2) {
            w0();
        }
        return this.f24729b1;
    }

    @Override // v4.g0
    public final boolean c() {
        boolean z10 = this.f24732e1;
        this.f24732e1 = false;
        return z10;
    }

    @Override // g5.q
    public final void c0() {
        this.U0.L = true;
    }

    @Override // v4.e, v4.w0
    public final void d(int i10, Object obj) {
        y1 y1Var;
        e1 e1Var;
        v vVar = this.U0;
        if (i10 == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (vVar.O != fFloatValue) {
                vVar.O = fFloatValue;
                if (vVar.o()) {
                    vVar.f24721v.setVolume(vVar.O);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            m4.d dVar = (m4.d) obj;
            dVar.getClass();
            if (vVar.f24725z.equals(dVar)) {
                return;
            }
            vVar.f24725z = dVar;
            if (vVar.f24692a0) {
                return;
            }
            e eVar = vVar.f24723x;
            if (eVar != null) {
                eVar.f24606i = dVar;
                eVar.a(b.c(eVar.f24598a, dVar, eVar.f24605h));
            }
            vVar.g();
            return;
        }
        if (i10 == 6) {
            m4.e eVar2 = (m4.e) obj;
            eVar2.getClass();
            if (vVar.Y.equals(eVar2)) {
                return;
            }
            if (vVar.f24721v != null) {
                vVar.Y.getClass();
            }
            vVar.Y = eVar2;
            return;
        }
        if (i10 == 12) {
            if (c0.f16548a >= 23) {
                AudioDeviceInfo audioDeviceInfoD = v3.b.d(obj);
                if (audioDeviceInfoD == null) {
                    y1Var = null;
                } else {
                    vVar.getClass();
                    y1Var = new y1(27, audioDeviceInfoD);
                }
                vVar.Z = y1Var;
                e eVar3 = vVar.f24723x;
                if (eVar3 != null) {
                    eVar3.b(audioDeviceInfoD);
                }
                AudioTrack audioTrack = vVar.f24721v;
                if (audioTrack != null) {
                    y1 y1Var2 = vVar.Z;
                    audioTrack.setPreferredDevice(y1Var2 != null ? (AudioDeviceInfo) y1Var2.f18634b : null);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 16) {
            obj.getClass();
            this.f24733f1 = ((Integer) obj).intValue();
            g5.k kVar = this.K;
            if (kVar != null && c0.f16548a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f24733f1));
                kVar.c(bundle);
                return;
            }
            return;
        }
        if (i10 == 9) {
            obj.getClass();
            vVar.D = ((Boolean) obj).booleanValue();
            r rVar = new r(vVar.x() ? s0.f14578d : vVar.C, -9223372036854775807L, -9223372036854775807L);
            if (vVar.o()) {
                vVar.A = rVar;
                return;
            } else {
                vVar.B = rVar;
                return;
            }
        }
        if (i10 != 10) {
            if (i10 == 11) {
                v4.w wVar = (v4.w) obj;
                wVar.getClass();
                this.F = wVar;
                return;
            }
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (vVar.X != iIntValue) {
            vVar.X = iIntValue;
            vVar.W = iIntValue != 0;
            vVar.g();
        }
        if (c0.f16548a < 35 || (e1Var = this.V0) == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) e1Var.f3620d;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            e1Var.f3620d = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(iIntValue, cb.r.f3875a, new g5.h(e1Var));
        e1Var.f3620d = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) e1Var.f3618b).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    @Override // v4.g0
    public final s0 e() {
        return this.U0.C;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    @Override // g5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f0(long r1, long r3, g5.k r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, m4.q r14) throws v4.m {
        /*
            r0 = this;
            r6.getClass()
            m4.q r1 = r0.f24728a1
            r2 = 1
            if (r1 == 0) goto L13
            r1 = r8 & 2
            if (r1 == 0) goto L13
            r5.getClass()
            r5.i(r7)
            return r2
        L13:
            x4.v r1 = r0.U0
            if (r12 == 0) goto L26
            if (r5 == 0) goto L1c
            r5.i(r7)
        L1c:
            v4.f r3 = r0.N0
            int r4 = r3.f22475f
            int r4 = r4 + r9
            r3.f22475f = r4
            r1.L = r2
            return r2
        L26:
            boolean r1 = r1.l(r6, r10, r9)     // Catch: x4.k -> L3b x4.j -> L55
            if (r1 == 0) goto L39
            if (r5 == 0) goto L31
            r5.i(r7)
        L31:
            v4.f r1 = r0.N0
            int r3 = r1.f22474e
            int r3 = r3 + r9
            r1.f22474e = r3
            return r2
        L39:
            r1 = 0
            return r1
        L3b:
            r1 = move-exception
            boolean r2 = r0.f7415w0
            if (r2 == 0) goto L4c
            v4.z0 r2 = r0.f22453d
            r2.getClass()
            int r2 = r2.f22732a
            if (r2 == 0) goto L4c
            r2 = 5003(0x138b, float:7.01E-42)
            goto L4e
        L4c:
            r2 = 5002(0x138a, float:7.009E-42)
        L4e:
            boolean r3 = r1.f24620b
            v4.m r1 = r0.f(r1, r14, r3, r2)
            throw r1
        L55:
            r1 = move-exception
            m4.q r2 = r0.Z0
            boolean r3 = r0.f7415w0
            if (r3 == 0) goto L68
            v4.z0 r3 = r0.f22453d
            r3.getClass()
            int r3 = r3.f22732a
            if (r3 == 0) goto L68
            r3 = 5004(0x138c, float:7.012E-42)
            goto L6a
        L68:
            r3 = 5001(0x1389, float:7.008E-42)
        L6a:
            boolean r4 = r1.f24618b
            v4.m r1 = r0.f(r1, r2, r4, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.x.f0(long, long, g5.k, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, m4.q):boolean");
    }

    @Override // v4.e
    public final String i() {
        return "MediaCodecAudioRenderer";
    }

    @Override // g5.q
    public final void i0() throws v4.m {
        try {
            v vVar = this.U0;
            if (!vVar.S && vVar.o() && vVar.f()) {
                vVar.s();
                vVar.S = true;
            }
        } catch (k e10) {
            throw f(e10, e10.f24621c, e10.f24620b, this.f7415w0 ? 5003 : 5002);
        }
    }

    @Override // v4.e
    public final boolean k() {
        if (!this.J0) {
            return false;
        }
        v vVar = this.U0;
        if (vVar.o()) {
            return vVar.S && !vVar.m();
        }
        return true;
    }

    @Override // g5.q, v4.e
    public final boolean l() {
        return this.U0.m() || super.l();
    }

    @Override // g5.q, v4.e
    public final void m() {
        p5.y yVar = this.T0;
        this.f24731d1 = true;
        this.Z0 = null;
        try {
            this.U0.g();
            try {
                super.m();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.m();
                throw th2;
            } finally {
            }
        }
    }

    @Override // v4.e
    public final void n(boolean z10, boolean z11) {
        v4.f fVar = new v4.f();
        this.N0 = fVar;
        p5.y yVar = this.T0;
        Handler handler = yVar.f16767b;
        if (handler != null) {
            handler.post(new g(yVar, fVar, 4));
        }
        z0 z0Var = this.f22453d;
        z0Var.getClass();
        boolean z12 = z0Var.f22733b;
        v vVar = this.U0;
        if (z12) {
            p4.c.i(vVar.W);
            if (!vVar.f24692a0) {
                vVar.f24692a0 = true;
                vVar.g();
            }
        } else if (vVar.f24692a0) {
            vVar.f24692a0 = false;
            vVar.g();
        }
        w4.k kVar = this.f22455f;
        kVar.getClass();
        vVar.f24716q = kVar;
        p4.v vVar2 = this.f22456g;
        vVar2.getClass();
        vVar.f24703g.I = vVar2;
    }

    @Override // g5.q, v4.e
    public final void o(long j10, boolean z10) throws v4.m {
        super.o(j10, z10);
        this.U0.g();
        this.f24729b1 = j10;
        this.f24732e1 = false;
        this.f24730c1 = true;
    }

    @Override // v4.e
    public final void p() {
        e1 e1Var;
        c cVar;
        e eVar = this.U0.f24723x;
        if (eVar != null) {
            Context context = eVar.f24598a;
            if (eVar.f24607j) {
                eVar.f24604g = null;
                if (c0.f16548a >= 23 && (cVar = eVar.f24601d) != null) {
                    AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                    audioManager.getClass();
                    audioManager.unregisterAudioDeviceCallback(cVar);
                }
                context.unregisterReceiver(eVar.f24602e);
                d dVar = eVar.f24603f;
                if (dVar != null) {
                    dVar.f24595a.unregisterContentObserver(dVar);
                }
                eVar.f24607j = false;
            }
        }
        if (c0.f16548a < 35 || (e1Var = this.V0) == null) {
            return;
        }
        ((HashSet) e1Var.f3618b).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) e1Var.f3620d;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // g5.q
    public final boolean p0(m4.q qVar) {
        z0 z0Var = this.f22453d;
        z0Var.getClass();
        if (z0Var.f22732a != 0) {
            int iU0 = u0(qVar);
            if ((iU0 & 512) != 0) {
                z0 z0Var2 = this.f22453d;
                z0Var2.getClass();
                if (z0Var2.f22732a == 2 || (iU0 & 1024) != 0 || (qVar.G == 0 && qVar.H == 0)) {
                    return true;
                }
            }
        }
        return this.U0.i(qVar) != 0;
    }

    @Override // v4.e
    public final void q() {
        v vVar = this.U0;
        this.f24732e1 = false;
        try {
            try {
                D();
                h0();
                b5.l lVar = this.E;
                if (lVar != null) {
                    lVar.c(null);
                }
                this.E = null;
            } catch (Throwable th2) {
                b5.l lVar2 = this.E;
                if (lVar2 != null) {
                    lVar2.c(null);
                }
                this.E = null;
                throw th2;
            }
        } finally {
            if (this.f24731d1) {
                this.f24731d1 = false;
                vVar.u();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    @Override // g5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int q0(g5.r r19, m4.q r20) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.x.q0(g5.r, m4.q):int");
    }

    @Override // v4.e
    public final void r() {
        this.U0.r();
    }

    @Override // v4.e
    public final void s() {
        w0();
        v vVar = this.U0;
        vVar.V = false;
        if (vVar.o()) {
            n nVar = vVar.f24703g;
            nVar.e();
            if (nVar.f24658x == -9223372036854775807L) {
                m mVar = nVar.f24639e;
                mVar.getClass();
                mVar.a();
            } else {
                nVar.f24660z = nVar.c();
                if (!v.p(vVar.f24721v)) {
                    return;
                }
            }
            vVar.f24721v.pause();
        }
    }

    public final int u0(m4.q qVar) {
        f fVarH = this.U0.h(qVar);
        if (!fVarH.f24609a) {
            return 0;
        }
        int i10 = fVarH.f24610b ? 1536 : 512;
        return fVarH.f24611c ? i10 | 2048 : i10;
    }

    public final int v0(g5.n nVar, m4.q qVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(nVar.f7385a) || (i10 = c0.f16548a) >= 24 || (i10 == 23 && c0.L(this.S0))) {
            return qVar.f14545o;
        }
        return -1;
    }

    public final void w0() {
        long j10;
        long jMax;
        long j11;
        boolean zK = k();
        v vVar = this.U0;
        tc.b0 b0Var = vVar.f24693b;
        if (!vVar.o() || vVar.M) {
            j10 = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(vVar.f24703g.b(zK), c0.T(vVar.f24719t.f24674e, vVar.k()));
            ArrayDeque arrayDeque = vVar.f24705h;
            while (!arrayDeque.isEmpty() && jMin >= ((r) arrayDeque.getFirst()).f24684c) {
                vVar.B = (r) arrayDeque.remove();
            }
            r rVar = vVar.B;
            long jV = jMin - rVar.f24684c;
            long jY = c0.y(rVar.f24682a.f14581a, jV);
            if (arrayDeque.isEmpty()) {
                n4.i iVar = (n4.i) b0Var.f20620d;
                if (iVar.b()) {
                    if (iVar.f15315o >= 1024) {
                        long j12 = iVar.f15314n;
                        n4.h hVar = iVar.f15310j;
                        hVar.getClass();
                        long j13 = j12 - ((long) ((hVar.f15289k * hVar.f15280b) * 2));
                        int i10 = iVar.f15308h.f15267a;
                        int i11 = iVar.f15307g.f15267a;
                        if (i10 == i11) {
                            jV = c0.V(jV, j13, iVar.f15315o, RoundingMode.DOWN);
                            j10 = Long.MIN_VALUE;
                        } else {
                            j10 = Long.MIN_VALUE;
                            jV = c0.V(jV, j13 * ((long) i10), iVar.f15315o * ((long) i11), RoundingMode.DOWN);
                        }
                    } else {
                        j10 = Long.MIN_VALUE;
                        jV = (long) (((double) iVar.f15303c) * jV);
                    }
                    r rVar2 = vVar.B;
                    j11 = rVar2.f24683b + jV;
                    rVar2.f24685d = jV - jY;
                } else {
                    j10 = Long.MIN_VALUE;
                    r rVar22 = vVar.B;
                    j11 = rVar22.f24683b + jV;
                    rVar22.f24685d = jV - jY;
                }
            } else {
                j10 = Long.MIN_VALUE;
                r rVar3 = vVar.B;
                j11 = rVar3.f24683b + jY + rVar3.f24685d;
            }
            long j14 = ((z) b0Var.f20619c).f24747q;
            jMax = c0.T(vVar.f24719t.f24674e, j14) + j11;
            long j15 = vVar.f24704g0;
            if (j14 > j15) {
                long jT = c0.T(vVar.f24719t.f24674e, j14 - j15);
                vVar.f24704g0 = j14;
                vVar.f24706h0 += jT;
                if (vVar.f24708i0 == null) {
                    vVar.f24708i0 = new Handler(Looper.myLooper());
                }
                vVar.f24708i0.removeCallbacksAndMessages(null);
                vVar.f24708i0.postDelayed(new a9.m(23, vVar), 100L);
            }
        }
        if (jMax != j10) {
            if (!this.f24730c1) {
                jMax = Math.max(this.f24729b1, jMax);
            }
            this.f24729b1 = jMax;
            this.f24730c1 = false;
        }
    }

    @Override // v4.e
    public final g0 h() {
        return this;
    }
}
