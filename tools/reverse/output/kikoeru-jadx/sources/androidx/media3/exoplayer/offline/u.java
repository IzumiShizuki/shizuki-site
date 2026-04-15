package androidx.media3.exoplayer.offline;

import android.content.Context;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import b0.c1;
import b7.b1;
import b7.d4;
import b7.t0;
import c7.d1;
import c7.e1;
import c7.m0;
import c7.p1;
import ce.r0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.P;
import com.tencent.bugly.proguard.qa;
import g2.s1;
import g2.t1;
import g2.v0;
import i2.f0;
import i2.j0;
import i7.j1;
import i7.o0;
import i7.r2;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.p0;
import p4.c0;
import r5.h0;
import se.k0;
import se.n0;
import se.w0;
import ya.g0;
import ya.i0;
import yc.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u implements n5.q, t1, p4.b, c4.q, P, e5.r, te.b, g1.k, g5.j, g5.k, r2, ld.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f969c;

    public /* synthetic */ u(int i10, Object obj, Object obj2) {
        this.f967a = i10;
        this.f968b = obj;
        this.f969c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void T0(j0 j0Var) {
        if (j0Var.P > 0) {
            if (j0Var.G.f8793d == f0.f8693e && !j0Var.p() && !j0Var.r() && !j0Var.Q && j0Var.J()) {
                j1.p pVar = j0Var.F.f8667f;
                if ((pVar.f9693d & 256) != 0) {
                    while (pVar != null) {
                        if ((pVar.f9692c & 256) != 0) {
                            ?? F = pVar;
                            ?? eVar = 0;
                            while (F != 0) {
                                if (F instanceof i2.q) {
                                    i2.q qVar = (i2.q) F;
                                    qVar.u(i2.f.v(qVar, 256));
                                } else if ((F.f9692c & 256) != 0 && (F instanceof i2.n)) {
                                    j1.p pVar2 = ((i2.n) F).f8789p;
                                    int i10 = 0;
                                    F = F;
                                    eVar = eVar;
                                    while (pVar2 != null) {
                                        if ((pVar2.f9692c & 256) != 0) {
                                            i10++;
                                            eVar = eVar;
                                            if (i10 == 1) {
                                                F = pVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new z0.e(new j1.p[16]);
                                                }
                                                if (F != 0) {
                                                    eVar.b(F);
                                                    F = 0;
                                                }
                                                eVar.b(pVar2);
                                            }
                                        }
                                        pVar2 = pVar2.f9695f;
                                        F = F;
                                        eVar = eVar;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                F = i2.f.f(eVar);
                            }
                        }
                        if ((pVar.f9693d & 256) == 0) {
                            break;
                        } else {
                            pVar = pVar.f9695f;
                        }
                    }
                }
            }
            j0Var.O = false;
            z0.e eVarZ = j0Var.z();
            Object[] objArr = eVarZ.f26372a;
            int i11 = eVarZ.f26374c;
            for (int i12 = 0; i12 < i11; i12++) {
                T0((j0) objArr[i12]);
            }
        }
    }

    @Override // te.b
    public boolean A(ve.e eVar) {
        return te.g.G(te.g.Z(eVar));
    }

    @Override // te.b
    public /* bridge */ boolean A0(ve.h hVar) {
        return te.g.A(hVar);
    }

    @Override // g5.k
    public void B() {
        ((MediaCodec) this.f968b).detachOutputSurface();
    }

    @Override // p4.b
    public cb.y B0(byte[] bArr) {
        byte[] bArr2;
        u uVar = (u) this.f969c;
        if (uVar == null || (bArr2 = (byte[]) uVar.f968b) == null || !Arrays.equals(bArr2, bArr)) {
            cb.y yVarB0 = ((s4.i) this.f968b).B0(bArr);
            this.f969c = new u(3, bArr, yVarB0);
            return yVarB0;
        }
        cb.y yVar = (cb.y) ((u) this.f969c).f969c;
        p4.c.j(yVar);
        return yVar;
    }

    @Override // te.b
    public /* bridge */ se.a0 C(se.q qVar) {
        return te.g.b0(qVar);
    }

    @Override // te.b
    public boolean C0(ve.d dVar) {
        jc.l.e(dVar, "<this>");
        se.a0 a0VarH = te.g.h(dVar);
        return (a0VarH != null ? te.g.e(this, a1(a0VarH)) : null) != null;
    }

    @Override // te.b
    public int D(ve.g gVar) {
        jc.l.e(gVar, "<this>");
        if (gVar instanceof ve.e) {
            return te.g.c((ve.d) gVar);
        }
        if (gVar instanceof ve.a) {
            return ((ve.a) gVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + gVar + ", " + jc.z.f10839a.b(gVar.getClass())).toString());
    }

    @Override // te.b
    public /* bridge */ boolean D0(ve.h hVar) {
        return te.g.G(hVar);
    }

    @Override // te.b
    public /* bridge */ ve.d E(ve.d dVar) {
        return te.g.d0(this, dVar);
    }

    @Override // g5.k
    public ByteBuffer E0(int i10) {
        return ((MediaCodec) this.f968b).getOutputBuffer(i10);
    }

    @Override // te.b
    public /* bridge */ te.a F(ve.e eVar) {
        return te.g.X(this, eVar);
    }

    @Override // n5.q
    public Object F0(Uri uri, s4.k kVar) {
        t tVar = (t) ((n5.q) this.f968b).F0(uri, kVar);
        List list = (List) this.f969c;
        return (list == null || list.isEmpty()) ? tVar : (t) tVar.a(list);
    }

    @Override // te.b
    public /* bridge */ se.f0 G(ve.d dVar) {
        return te.g.i(dVar);
    }

    @Override // te.b
    public /* bridge */ se.q G0(ve.d dVar) {
        return te.g.g(dVar);
    }

    @Override // te.b
    public /* bridge */ boolean H(q0 q0Var, ve.h hVar) {
        return te.g.y(q0Var, hVar);
    }

    @Override // e5.r
    public n5.q H0() {
        return new u(0, ((e5.r) this.f968b).H0(), (List) this.f969c);
    }

    @Override // te.b
    public n0 I(ve.e eVar, int i10) {
        if (i10 < 0 || i10 >= te.g.c(eVar)) {
            return null;
        }
        return te.g.p(eVar, i10);
    }

    @Override // te.b
    public /* bridge */ se.a0 I0(se.w wVar) {
        return te.g.h(wVar);
    }

    @Override // e5.r
    public n5.q J(e5.n nVar, e5.k kVar) {
        return new u(0, ((e5.r) this.f968b).J(nVar, kVar), (List) this.f969c);
    }

    @Override // te.b
    public boolean J0(ve.d dVar) {
        jc.l.e(dVar, "$receiver");
        return dVar instanceof td.f;
    }

    @Override // te.b
    public /* bridge */ te.i K(ve.c cVar) {
        return te.g.a0(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // te.b
    public n0 K0(ve.g gVar, int i10) {
        jc.l.e(gVar, "<this>");
        if (gVar instanceof ve.f) {
            return te.g.p((ve.d) gVar, i10);
        }
        if (gVar instanceof ve.a) {
            E e10 = ((ve.a) gVar).get(i10);
            jc.l.d(e10, "get(...)");
            return (n0) e10;
        }
        throw new IllegalStateException(("unknown type argument list type: " + gVar + ", " + jc.z.f10839a.b(gVar.getClass())).toString());
    }

    @Override // te.b
    public /* bridge */ boolean L(ve.h hVar) {
        return te.g.D(hVar);
    }

    @Override // te.b
    public /* bridge */ w0 L0(ve.c cVar) {
        return te.g.R(cVar);
    }

    @Override // te.b
    public /* bridge */ se.a0 M(se.q qVar) {
        return te.g.Q(qVar);
    }

    @Override // te.b
    public boolean M0(ve.d dVar) {
        jc.l.e(dVar, "<this>");
        se.a0 a0VarH = te.g.h(dVar);
        return (a0VarH != null ? te.g.f(a0VarH) : null) != null;
    }

    @Override // g5.k
    public void N(int i10, long j10) {
        ((MediaCodec) this.f968b).releaseOutputBuffer(i10, j10);
    }

    @Override // te.b
    public /* bridge */ w0 N0(n0 n0Var) {
        return te.g.t(this, n0Var);
    }

    @Override // g5.k
    public int O() {
        return ((MediaCodec) this.f968b).dequeueInputBuffer(0L);
    }

    @Override // te.b
    public boolean O0(ve.e eVar) {
        jc.l.e(eVar, "<this>");
        return te.g.J(q0(eVar)) && !te.g.K(eVar);
    }

    @Override // te.b
    public boolean P(ve.c cVar) {
        return cVar instanceof fe.a;
    }

    @Override // i7.r2
    public void Q() {
        ((o0) this.f969c).f9238d.c1(Boolean.TRUE);
    }

    @Override // c4.q
    public boolean Q0(CharSequence charSequence, int i10, int i11, c4.w wVar) {
        if ((wVar.f3413c & 4) > 0) {
            return true;
        }
        if (((c4.z) this.f968b) == null) {
            this.f968b = new c4.z(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((pe.d) this.f969c).getClass();
        ((c4.z) this.f968b).setSpan(new c4.x(wVar), i10, i11, 33);
        return true;
    }

    @Override // te.b
    public /* bridge */ k0 R(ve.e eVar) {
        return te.g.Z(eVar);
    }

    @Override // te.b
    public /* bridge */ ve.j R0(n0 n0Var) {
        return te.g.v(n0Var);
    }

    @Override // te.b
    public /* bridge */ w0 S(ve.f fVar, ve.f fVar2) {
        return te.g.m(this, fVar, fVar2);
    }

    @Override // g5.j
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public d4 P0(b1 b1Var) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = ((g5.n) b1Var.f1650b).f7385a;
        d4 d4Var = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                d4 d4Var2 = new d4(mediaCodecCreateByCodecName, (HandlerThread) ((g5.c) this.f968b).get(), new g5.e(mediaCodecCreateByCodecName, (HandlerThread) ((g5.c) this.f969c).get()), (e1) b1Var.f1655g);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) b1Var.f1653e;
                    d4.b(d4Var2, (MediaFormat) b1Var.f1651c, surface, (MediaCrypto) b1Var.f1654f, (surface == null && ((g5.n) b1Var.f1650b).f7394j && c0.f16548a >= 35) ? 8 : 0);
                    return d4Var2;
                } catch (Exception e10) {
                    e = e10;
                    d4Var = d4Var2;
                    if (d4Var != null) {
                        d4Var.a();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // g2.t1
    public boolean T(Object obj, Object obj2) {
        b0.k0 k0Var = (b0.k0) this.f968b;
        return jc.l.a(k0Var.b(obj), k0Var.b(obj2));
    }

    @Override // te.b
    public se.a0 U(ve.d dVar) {
        se.a0 a0VarB0;
        jc.l.e(dVar, "<this>");
        se.q qVarG = te.g.g(dVar);
        if (qVarG != null && (a0VarB0 = te.g.b0(qVarG)) != null) {
            return a0VarB0;
        }
        se.a0 a0VarH = te.g.h(dVar);
        jc.l.b(a0VarH);
        return a0VarH;
    }

    public byte[] U0(c6.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f969c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f968b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f3573a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f3574b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f3575c);
            dataOutputStream.writeLong(aVar.f3576d);
            dataOutputStream.write(aVar.f3577e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // te.b
    public /* bridge */ boolean V(ve.e eVar, ve.e eVar2) {
        return te.g.z(eVar, eVar2);
    }

    public v0 V0() {
        return (v0) ((x0.e1) this.f969c).getValue();
    }

    @Override // g5.k
    public int W(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.f968b).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    public p1 W0() {
        c7.j0 j0Var = (c7.j0) this.f968b;
        c7.h hVarA = j0Var.f3651e.a();
        if (hVarA != null) {
            try {
                return hVarA.i();
            } catch (RemoteException e10) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e10);
            }
        }
        PlaybackState playbackState = j0Var.f3647a.getPlaybackState();
        if (playbackState != null) {
            return p1.a(playbackState);
        }
        return null;
    }

    @Override // te.b
    public /* bridge */ boolean X(ve.c cVar) {
        return te.g.M(cVar);
    }

    public c1 X0() {
        MediaController.TransportControls transportControls = ((c7.j0) this.f968b).f3647a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 29 ? new c7.o0(14, transportControls) : i10 >= 24 ? new c7.n0(14, transportControls) : i10 >= 23 ? new m0(14, transportControls) : new c1(14, transportControls);
    }

    @Override // te.b
    public /* bridge */ ve.j Y(q0 q0Var) {
        return te.g.w(q0Var);
    }

    public se.j0 Y0() {
        return new se.j0(true, true, this, te.e.f20725a, te.f.f20727a);
    }

    @Override // te.b
    public /* bridge */ n0 Z(fe.b bVar) {
        return te.g.V(bVar);
    }

    public void Z0(Exception exc, boolean z10) {
        this.f969c = null;
        HashSet hashSet = (HashSet) this.f968b;
        i0 i0VarQ = i0.q(hashSet);
        hashSet.clear();
        g0 g0VarS = i0VarQ.listIterator(0);
        while (g0VarS.hasNext()) {
            b5.e eVar = (b5.e) g0VarS.next();
            eVar.getClass();
            eVar.l(exc, z10 ? 1 : 3);
        }
    }

    @Override // com.tencent.bugly.proguard.P
    public void a(int i10) {
    }

    @Override // te.b
    public /* bridge */ boolean a0(n0 n0Var) {
        return te.g.N(n0Var);
    }

    public ve.f a1(ve.e eVar) {
        se.a0 a0Var;
        se.l lVarF = te.g.f(eVar);
        return (lVarF == null || (a0Var = lVarF.f19968b) == null) ? (ve.f) eVar : a0Var;
    }

    @Override // i7.r2
    public void b() {
        ((u) this.f968b).c1(ub.a0.f21526a);
    }

    @Override // te.b
    public /* bridge */ se.a0 b0(se.q qVar) {
        return te.g.Q(qVar);
    }

    public void b1(b5.e eVar) {
        ((HashSet) this.f968b).add(eVar);
        if (((b5.e) this.f969c) != null) {
            return;
        }
        this.f969c = eVar;
        b5.w wVarH = eVar.f1525b.h();
        eVar.f1547x = wVarH;
        b5.b bVar = eVar.f1541r;
        int i10 = c0.f16548a;
        wVarH.getClass();
        bVar.getClass();
        bVar.obtainMessage(1, new b5.c(j5.u.f10444b.getAndIncrement(), true, SystemClock.elapsedRealtime(), wVarH)).sendToTarget();
    }

    @Override // g5.k
    public void c(Bundle bundle) {
        ((MediaCodec) this.f968b).setParameters(bundle);
    }

    @Override // te.b
    public /* bridge */ boolean c0(ve.h hVar) {
        return te.g.B(hVar);
    }

    public void c1(Object obj) {
        lf.b1 b1Var = (lf.b1) this.f968b;
        ub.k kVar = new ub.k(Integer.valueOf(((Number) ((ub.k) b1Var.getValue()).f21543a).intValue() + 1), obj);
        b1Var.getClass();
        b1Var.m(null, kVar);
    }

    @Override // g5.k
    public void d(int i10, int i11, int i12, long j10) {
        ((MediaCodec) this.f968b).queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // te.b
    public w0 d0(ve.d dVar) {
        return te.g.S(dVar);
    }

    public h0 d1(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f968b;
            if (i11 >= iArr.length) {
                p4.c.n("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new r5.m();
            }
            if (i10 == iArr[i11]) {
                return ((j5.b1[]) this.f969c)[i11];
            }
            i11++;
        }
    }

    @Override // g5.k
    public void e(int i10, u4.b bVar, long j10, int i11) {
        ((MediaCodec) this.f968b).queueSecureInputBuffer(i10, 0, bVar.f21378i, j10, i11);
    }

    @Override // te.b
    public /* bridge */ boolean e0(ve.d dVar) {
        return te.g.I(dVar);
    }

    public void e1(int i10, ce.g gVar) throws IOException {
        Iterator it = (Iterator) this.f968b;
        while (true) {
            Map.Entry entry = (Map.Entry) this.f969c;
            if (entry == null || ((ce.n) entry.getKey()).f3955a >= i10) {
                return;
            }
            ce.n nVar = (ce.n) ((Map.Entry) this.f969c).getKey();
            Object value = ((Map.Entry) this.f969c).getValue();
            ce.j jVar = ce.j.f3945c;
            r0 r0Var = nVar.f3956b;
            int i11 = nVar.f3955a;
            if (nVar.f3957c) {
                for (Object obj : (List) value) {
                    if (r0Var == r0.f3966e) {
                        gVar.Q(i11, 3);
                        ((ce.b) obj).f(gVar);
                        gVar.Q(i11, 4);
                    } else {
                        gVar.Q(i11, r0Var.f3971b);
                        ce.j.k(gVar, r0Var, obj);
                    }
                }
            } else if (r0Var == r0.f3966e) {
                gVar.Q(i11, 3);
                ((ce.b) value).f(gVar);
                gVar.Q(i11, 4);
            } else {
                gVar.Q(i11, r0Var.f3971b);
                ce.j.k(gVar, r0Var, value);
            }
            if (it.hasNext()) {
                this.f969c = (Map.Entry) it.next();
            } else {
                this.f969c = null;
            }
        }
    }

    @Override // te.b
    public /* bridge */ int f(ve.h hVar) {
        return te.g.T(hVar);
    }

    @Override // te.b
    public /* bridge */ se.a0 f0(ve.e eVar) {
        return te.g.c0(eVar, true);
    }

    @Override // g5.k
    public void flush() {
        ((MediaCodec) this.f968b).flush();
    }

    @Override // te.b
    public vc.i g() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // te.b
    public /* bridge */ se.a0 g0(ve.e eVar) {
        return te.g.c0(eVar, false);
    }

    @Override // c4.q
    public Object getResult() {
        return (c4.z) this.f968b;
    }

    @Override // g5.k
    public void h(p5.h hVar, Handler handler) {
        ((MediaCodec) this.f968b).setOnFrameRenderedListener(new g5.b(this, hVar, 1), handler);
    }

    @Override // te.b
    public /* bridge */ boolean h0(ve.d dVar) {
        return te.g.E(dVar);
    }

    @Override // g5.k
    public void i(int i10) {
        ((MediaCodec) this.f968b).releaseOutputBuffer(i10, false);
    }

    @Override // te.b
    public /* bridge */ se.a0 i0(se.q qVar) {
        return te.g.b0(qVar);
    }

    @Override // te.b
    public ve.c j(ve.e eVar) {
        return te.g.e(this, a1(eVar));
    }

    @Override // g5.k
    public /* synthetic */ boolean j0(c1 c1Var) {
        return false;
    }

    @Override // te.b
    public boolean k(ve.e eVar) {
        jc.l.e(eVar, "<this>");
        return te.g.B(te.g.Z(eVar));
    }

    @Override // g1.k
    public Object k0(g1.b bVar, Object obj) {
        return ((ic.n) this.f968b).q(bVar, obj);
    }

    @Override // g2.t1
    public void l(s1 s1Var) {
        o.f0 f0Var = (o.f0) this.f969c;
        f0Var.a();
        for (Object obj : s1Var) {
            Object objB = ((b0.k0) this.f968b).b(obj);
            int iD = f0Var.d(objB);
            int i10 = iD >= 0 ? f0Var.f15955c[iD] : 0;
            if (i10 == 7) {
                s1Var.remove(obj);
            } else {
                f0Var.h(i10 + 1, objB);
            }
        }
    }

    @Override // te.b
    public w0 l0(ArrayList arrayList) {
        se.a0 a0Var;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (w0) vb.m.w0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(vb.n.K(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            z10 = z10 || se.c.l(w0Var);
            if (w0Var instanceof se.a0) {
                a0Var = (se.a0) w0Var;
            } else {
                if (!(w0Var instanceof se.q)) {
                    throw new ce.j0();
                }
                a0Var = ((se.q) w0Var).f19978b;
                z11 = true;
            }
            arrayList2.add(a0Var);
        }
        if (z10) {
            return ue.l.c(ue.k.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        te.s sVar = te.s.f20752a;
        if (!z11) {
            return sVar.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(vb.n.K(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(se.c.G((w0) it2.next()));
        }
        return se.c.g(sVar.b(arrayList2), sVar.b(arrayList3));
    }

    @Override // te.b
    public /* bridge */ ve.c m(se.a0 a0Var) {
        return te.g.e(this, a0Var);
    }

    @Override // te.b
    public boolean m0(w0 w0Var) {
        jc.l.e(w0Var, "<this>");
        return te.g.I(v0(w0Var)) != te.g.I(U(w0Var));
    }

    @Override // te.b
    public boolean n(ve.h hVar, ve.h hVar2) {
        jc.l.e(hVar, "c1");
        jc.l.e(hVar2, "c2");
        if (!(hVar instanceof k0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(hVar2 instanceof k0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (te.g.b(hVar, hVar2)) {
            return true;
        }
        k0 k0Var = (k0) hVar;
        k0 k0Var2 = (k0) hVar2;
        Map map = (Map) this.f968b;
        if (((te.c) this.f969c).a(k0Var, k0Var2)) {
            return true;
        }
        if (map == null) {
            return false;
        }
        k0 k0Var3 = (k0) map.get(k0Var);
        k0 k0Var4 = (k0) map.get(k0Var2);
        if (k0Var3 == null || !k0Var3.equals(k0Var2)) {
            return k0Var4 != null && k0Var4.equals(k0Var);
        }
        return true;
    }

    @Override // te.b
    public /* bridge */ n0 n0(ve.d dVar, int i10) {
        return te.g.p(dVar, i10);
    }

    @Override // te.b
    public void o(ve.d dVar) {
        jc.l.e(dVar, "<this>");
        te.g.g(dVar);
    }

    @Override // g5.k
    public void o0(int i10) {
        ((MediaCodec) this.f968b).setVideoScalingMode(i10);
    }

    @Override // te.b
    public /* bridge */ se.a0 p(ve.d dVar) {
        return te.g.h(dVar);
    }

    @Override // te.b
    public /* bridge */ se.a0 p0(ve.e eVar) {
        return te.g.j(eVar);
    }

    @Override // te.b
    public boolean q(ve.e eVar) {
        jc.l.e(eVar, "<this>");
        return te.g.f(eVar) != null;
    }

    @Override // te.b
    public k0 q0(ve.d dVar) {
        jc.l.e(dVar, "<this>");
        se.a0 a0VarH = te.g.h(dVar);
        if (a0VarH == null) {
            a0VarH = v0(dVar);
        }
        return te.g.Z(a0VarH);
    }

    @Override // te.b
    public /* bridge */ ve.b r(ve.c cVar) {
        return te.g.k(cVar);
    }

    @Override // te.b
    public /* bridge */ void r0(ve.e eVar) {
        te.g.O(eVar);
    }

    @Override // te.b
    public boolean s(ve.d dVar) {
        jc.l.e(dVar, "<this>");
        return !jc.l.a(te.g.Z(v0(dVar)), te.g.Z(U(dVar)));
    }

    @Override // te.b
    public /* bridge */ boolean s0(ve.h hVar) {
        return te.g.C(hVar);
    }

    @Override // te.b
    public /* bridge */ ve.g t(ve.e eVar) {
        return te.g.d(eVar);
    }

    @Override // te.b
    public /* bridge */ boolean t0(ve.h hVar) {
        return te.g.H(hVar);
    }

    public String toString() {
        switch (this.f967a) {
            case 20:
                return (String) this.f968b;
            default:
                return super.toString();
        }
    }

    @Override // te.b
    public /* bridge */ Collection u(ve.e eVar) {
        return te.g.U(this, eVar);
    }

    @Override // te.b
    public /* bridge */ boolean v(ve.h hVar) {
        return te.g.J(hVar);
    }

    @Override // te.b
    public se.a0 v0(ve.d dVar) {
        se.a0 a0VarQ;
        jc.l.e(dVar, "<this>");
        se.q qVarG = te.g.g(dVar);
        if (qVarG != null && (a0VarQ = te.g.Q(qVarG)) != null) {
            return a0VarQ;
        }
        se.a0 a0VarH = te.g.h(dVar);
        jc.l.b(a0VarH);
        return a0VarH;
    }

    @Override // te.b
    public /* bridge */ int w(ve.d dVar) {
        return te.g.c(dVar);
    }

    @Override // te.b
    public /* bridge */ q0 w0(ve.h hVar, int i10) {
        return te.g.r(hVar, i10);
    }

    @Override // g5.k
    public MediaFormat x() {
        return ((MediaCodec) this.f968b).getOutputFormat();
    }

    @Override // g5.k
    public ByteBuffer x0(int i10) {
        return ((MediaCodec) this.f968b).getInputBuffer(i10);
    }

    @Override // g1.k
    public Object y(Object obj) {
        return ((ic.k) this.f969c).a(obj);
    }

    @Override // g5.k
    public void y0(Surface surface) {
        ((MediaCodec) this.f968b).setOutputSurface(surface);
    }

    @Override // te.b
    public /* bridge */ Collection z(ve.h hVar) {
        return te.g.Y(hVar);
    }

    @Override // te.b
    public /* bridge */ void z0(ve.e eVar) {
        te.g.P(eVar);
    }

    public u(HashMap map, te.c cVar) {
        this.f967a = 15;
        jc.l.e(cVar, "equalityAxioms");
        this.f968b = map;
        this.f969c = cVar;
    }

    @Override // com.tencent.bugly.proguard.P
    public void a(int i10, qa qaVar, long j10, long j11, boolean z10, String str) {
        ((com.tencent.bugly.crashreport.crash.e) this.f968b).a(z10, (List<CrashDetailBean>) this.f969c);
    }

    @Override // g5.k
    public void a() {
        e1 e1Var = (e1) this.f969c;
        MediaCodec mediaCodec = (MediaCodec) this.f968b;
        try {
            int i10 = c0.f16548a;
            if (i10 >= 30 && i10 < 33) {
                mediaCodec.stop();
            }
            if (i10 >= 35 && e1Var != null) {
                e1Var.U(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th2) {
            if (c0.f16548a >= 35 && e1Var != null) {
                e1Var.U(mediaCodec);
            }
            mediaCodec.release();
            throw th2;
        }
    }

    public u(ArrayList arrayList, MotionEvent motionEvent) {
        this.f967a = 7;
        this.f969c = arrayList;
        this.f968b = motionEvent;
    }

    public u(j0 j0Var, v0 v0Var) {
        this.f967a = 21;
        this.f968b = j0Var;
        this.f969c = x0.v.v(v0Var);
    }

    public u(jc.o oVar, j1 j1Var) {
        this.f967a = 26;
        this.f968b = oVar;
        this.f969c = j1Var;
        if (j1Var.f9177b != 1 || j1Var.f9178c != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var, " was passed").toString());
        }
    }

    public u(s4.i iVar) {
        this.f967a = 4;
        this.f968b = iVar;
    }

    public u(b0.k0 k0Var) {
        this.f967a = 1;
        this.f968b = k0Var;
        o.f0 f0Var = p0.f16030a;
        this.f969c = new o.f0();
    }

    public u(MediaCodec mediaCodec, e1 e1Var) {
        this.f967a = 18;
        this.f968b = mediaCodec;
        this.f969c = e1Var;
        if (c0.f16548a < 35 || e1Var == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) e1Var.f3620d;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            p4.c.i(((HashSet) e1Var.f3618b).add(mediaCodec));
        }
    }

    public u(Map map) {
        this.f967a = 29;
        this.f968b = map;
        this.f969c = new re.l("Java nullability annotation states").c(new bd.a(10, this));
    }

    public u(Context context, d1 d1Var) {
        this.f967a = 10;
        if (d1Var != null) {
            this.f969c = Collections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f968b = new c7.k0(context, d1Var);
                return;
            } else {
                this.f968b = new c7.j0(context, d1Var);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public u(o0 o0Var, u uVar) {
        this.f967a = 25;
        jc.l.e(uVar, "retryEventBus");
        this.f969c = o0Var;
        this.f968b = uVar;
    }

    public u(ce.m mVar) {
        this.f967a = 11;
        Iterator it = ((ce.i0) mVar.f3953a.f3946a.entrySet()).iterator();
        this.f968b = it;
        if (it.hasNext()) {
            this.f969c = (Map.Entry) it.next();
        }
    }

    public u(String str) {
        this.f967a = 20;
        jc.l.e(str, "name");
        this.f968b = str;
        this.f969c = new ArrayList(0);
        jd.k.f10844a.getClass();
        List listA = jd.j.a();
        new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((jd.k) it.next()).getClass();
        }
    }

    public u(int i10) {
        this.f967a = i10;
        switch (i10) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f968b = byteArrayOutputStream;
                this.f969c = new DataOutputStream(byteArrayOutputStream);
                break;
            case 14:
                this.f968b = new app.nekogram.translator.r(4);
                break;
            case 23:
                this.f968b = new z0.e(new j0[16]);
                break;
            case 24:
                lf.b1 b1VarC = lf.p0.c(new ub.k(Integer.MIN_VALUE, null));
                this.f968b = b1VarC;
                this.f969c = new i7.n(0, b1VarC);
                break;
            case 27:
                this.f968b = new z0.e(new Reference[16]);
                this.f969c = new ReferenceQueue();
                break;
            default:
                this.f968b = new HashSet();
                break;
        }
    }

    @Override // te.b
    public void u0(ve.e eVar, ve.h hVar) {
    }

    public u(t0 t0Var, Looper looper) {
        this.f967a = 5;
        this.f969c = t0Var;
        this.f968b = new Handler(looper, new f(1, this));
    }
}
