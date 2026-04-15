package x4;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import m4.o0;
import m4.s0;
import p4.c0;
import q.t0;
import r.c2;
import r.y1;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Object f24688j0 = new Object();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static ScheduledExecutorService f24689k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static int f24690l0;
    public r A;
    public r B;
    public s0 C;
    public boolean D;
    public ByteBuffer E;
    public int F;
    public long G;
    public long H;
    public long I;
    public long J;
    public int K;
    public boolean L;
    public boolean M;
    public long N;
    public float O;
    public ByteBuffer P;
    public int Q;
    public ByteBuffer R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public m4.e Y;
    public y1 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24691a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f24692a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tc.b0 f24693b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f24694b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f24695c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public long f24696c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f24697d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f24698d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a1 f24699e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f24700e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a1 f24701f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Looper f24702f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f24703g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public long f24704g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayDeque f24705h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public long f24706h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f24707i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Handler f24708i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24709j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public tc.b0 f24710k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c2 f24711l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c2 f24712m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w f24713n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final v2.e f24714o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w f24715p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public w4.k f24716q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y1 f24717r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public q f24718s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public q f24719t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n4.c f24720u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AudioTrack f24721v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f24722w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e f24723x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public tc.b0 f24724y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public m4.d f24725z;

    public v(p pVar) {
        Context context = pVar.f24663a;
        this.f24691a = context;
        this.f24725z = m4.d.f14158g;
        this.f24722w = context != null ? null : pVar.f24664b;
        this.f24693b = pVar.f24665c;
        int i10 = c0.f16548a;
        this.f24707i = false;
        this.f24709j = 0;
        this.f24713n = pVar.f24667e;
        v2.e eVar = pVar.f24669g;
        eVar.getClass();
        this.f24714o = eVar;
        this.f24703g = new n(new y1(28, this));
        o oVar = new o();
        this.f24695c = oVar;
        b0 b0Var = new b0();
        b0Var.f24591m = c0.f16553f;
        this.f24697d = b0Var;
        n4.j jVar = new n4.j();
        g0 g0Var = i0.f25998b;
        Object[] objArr = {jVar, oVar, b0Var};
        ya.q.c(3, objArr);
        this.f24699e = i0.o(3, objArr);
        this.f24701f = i0.u(new a0());
        this.O = 1.0f;
        this.X = 0;
        this.Y = new m4.e();
        s0 s0Var = s0.f14578d;
        this.B = new r(s0Var, 0L, 0L);
        this.C = s0Var;
        this.D = false;
        this.f24705h = new ArrayDeque();
        this.f24711l = new c2();
        this.f24712m = new c2();
        this.f24715p = pVar.f24668f;
    }

    public static boolean p(AudioTrack audioTrack) {
        return c0.f16548a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r10) {
        /*
            r9 = this;
            boolean r0 = r9.x()
            r1 = 0
            tc.b0 r2 = r9.f24693b
            if (r0 != 0) goto L55
            boolean r0 = r9.f24692a0
            if (r0 != 0) goto L4f
            x4.q r0 = r9.f24719t
            int r3 = r0.f24672c
            if (r3 != 0) goto L4f
            m4.q r0 = r0.f24670a
            int r0 = r0.F
            m4.s0 r0 = r9.C
            java.lang.Object r3 = r2.f20620d
            n4.i r3 = (n4.i) r3
            float r4 = r0.f14581a
            r3.getClass()
            r5 = 1
            r6 = 0
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r7 <= 0) goto L2a
            r7 = 1
            goto L2b
        L2a:
            r7 = 0
        L2b:
            p4.c.c(r7)
            float r7 = r3.f15303c
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 == 0) goto L38
            r3.f15303c = r4
            r3.f15309i = r5
        L38:
            float r4 = r0.f14582b
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L40
            r6 = 1
            goto L41
        L40:
            r6 = 0
        L41:
            p4.c.c(r6)
            float r6 = r3.f15304d
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L51
            r3.f15304d = r4
            r3.f15309i = r5
            goto L51
        L4f:
            m4.s0 r0 = m4.s0.f14578d
        L51:
            r9.C = r0
        L53:
            r4 = r0
            goto L58
        L55:
            m4.s0 r0 = m4.s0.f14578d
            goto L53
        L58:
            boolean r0 = r9.f24692a0
            if (r0 != 0) goto L6e
            x4.q r0 = r9.f24719t
            int r3 = r0.f24672c
            if (r3 != 0) goto L6e
            m4.q r0 = r0.f24670a
            int r0 = r0.F
            boolean r1 = r9.D
            java.lang.Object r0 = r2.f20619c
            x4.z r0 = (x4.z) r0
            r0.f24745o = r1
        L6e:
            r9.D = r1
            x4.r r3 = new x4.r
            r0 = 0
            long r5 = java.lang.Math.max(r0, r10)
            x4.q r10 = r9.f24719t
            long r0 = r9.k()
            int r10 = r10.f24674e
            long r7 = p4.c0.T(r10, r0)
            r3.<init>(r4, r5, r7)
            java.util.ArrayDeque r10 = r9.f24705h
            r10.add(r3)
            x4.q r10 = r9.f24719t
            n4.c r10 = r10.f24678i
            r9.f24720u = r10
            r10.a()
            r.y1 r10 = r9.f24717r
            if (r10 == 0) goto Lad
            boolean r11 = r9.D
            java.lang.Object r10 = r10.f18634b
            x4.x r10 = (x4.x) r10
            p5.y r10 = r10.T0
            android.os.Handler r0 = r10.f16767b
            if (r0 == 0) goto Lad
            x4.h r1 = new x4.h
            r1.<init>()
            r0.post(r1)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.v.a(long):void");
    }

    public final AudioTrack b(r5.c cVar, m4.d dVar, int i10, m4.q qVar) throws j {
        try {
            AudioTrack audioTrackA = this.f24715p.a(cVar, dVar, i10);
            int state = audioTrackA.getState();
            if (state == 1) {
                return audioTrackA;
            }
            try {
                audioTrackA.release();
            } catch (Exception unused) {
            }
            throw new j(state, cVar.f18778b, cVar.f18779c, cVar.f18777a, qVar, cVar.f18781e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new j(0, cVar.f18778b, cVar.f18779c, cVar.f18777a, qVar, cVar.f18781e, e10);
        }
    }

    public final AudioTrack c(q qVar) throws j {
        try {
            return b(qVar.a(), this.f24725z, this.X, qVar.f24670a);
        } catch (j e10) {
            y1 y1Var = this.f24717r;
            if (y1Var != null) {
                y1Var.b0(e10);
            }
            throw e10;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(m4.q r28, int[] r29) throws x4.i {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.v.d(m4.q, int[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r13) throws x4.k {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.v.e(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() throws x4.k {
        /*
            r6 = this;
            n4.c r0 = r6.f24720u
            boolean r0 = r0.d()
            r1 = -9223372036854775808
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L14
            r6.e(r1)
            java.nio.ByteBuffer r0 = r6.R
            if (r0 != 0) goto L44
            goto L43
        L14:
            n4.c r0 = r6.f24720u
            boolean r5 = r0.d()
            if (r5 == 0) goto L2e
            boolean r5 = r0.f15265d
            if (r5 == 0) goto L21
            goto L2e
        L21:
            r0.f15265d = r4
            java.util.ArrayList r0 = r0.f15263b
            java.lang.Object r0 = r0.get(r3)
            n4.f r0 = (n4.f) r0
            r0.e()
        L2e:
            r6.t(r1)
            n4.c r0 = r6.f24720u
            boolean r0 = r0.c()
            if (r0 == 0) goto L44
            java.nio.ByteBuffer r0 = r6.R
            if (r0 == 0) goto L43
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L44
        L43:
            return r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.v.f():boolean");
    }

    public final void g() {
        tc.b0 b0Var;
        if (o()) {
            this.G = 0L;
            this.H = 0L;
            this.I = 0L;
            this.J = 0L;
            this.f24700e0 = false;
            this.K = 0;
            this.B = new r(this.C, 0L, 0L);
            this.N = 0L;
            this.A = null;
            this.f24705h.clear();
            this.P = null;
            this.Q = 0;
            this.R = null;
            this.T = false;
            this.S = false;
            this.U = false;
            this.E = null;
            this.F = 0;
            this.f24697d.f24593o = 0L;
            n4.c cVar = this.f24719t.f24678i;
            this.f24720u = cVar;
            cVar.a();
            AudioTrack audioTrack = this.f24703g.f24637c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f24721v.pause();
            }
            if (p(this.f24721v)) {
                tc.b0 b0Var2 = this.f24710k;
                b0Var2.getClass();
                this.f24721v.unregisterStreamEventCallback((u) b0Var2.f20619c);
                ((Handler) b0Var2.f20618b).removeCallbacksAndMessages(null);
            }
            r5.c cVarA = this.f24719t.a();
            q qVar = this.f24718s;
            if (qVar != null) {
                this.f24719t = qVar;
                this.f24718s = null;
            }
            n nVar = this.f24703g;
            nVar.e();
            nVar.f24637c = null;
            nVar.f24639e = null;
            if (c0.f16548a >= 24 && (b0Var = this.f24724y) != null) {
                AudioTrack audioTrack2 = (AudioTrack) b0Var.f20618b;
                s sVar = (s) b0Var.f20620d;
                sVar.getClass();
                audioTrack2.removeOnRoutingChangedListener(sVar);
                b0Var.f20620d = null;
                this.f24724y = null;
            }
            AudioTrack audioTrack3 = this.f24721v;
            y1 y1Var = this.f24717r;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f24688j0) {
                try {
                    if (f24689k0 == null) {
                        f24689k0 = Executors.newSingleThreadScheduledExecutor(new p4.b0());
                    }
                    f24690l0++;
                    f24689k0.schedule(new b7.f(audioTrack3, y1Var, handler, cVarA, 7), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f24721v = null;
        }
        c2 c2Var = this.f24712m;
        c2Var.f18358c = null;
        c2Var.f18356a = -9223372036854775807L;
        c2Var.f18357b = -9223372036854775807L;
        c2 c2Var2 = this.f24711l;
        c2Var2.f18358c = null;
        c2Var2.f18356a = -9223372036854775807L;
        c2Var2.f18357b = -9223372036854775807L;
        this.f24704g0 = 0L;
        this.f24706h0 = 0L;
        Handler handler2 = this.f24708i0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final f h(m4.q qVar) {
        boolean zBooleanValue;
        AudioManager audioManager;
        if (this.f24698d0) {
            return f.f24608d;
        }
        m4.d dVar = this.f24725z;
        v2.e eVar = this.f24714o;
        eVar.getClass();
        qVar.getClass();
        int i10 = qVar.E;
        dVar.getClass();
        int i11 = c0.f16548a;
        if (i11 < 29 || i10 == -1) {
            return f.f24608d;
        }
        Context context = (Context) eVar.f22364b;
        Boolean bool = (Boolean) eVar.f22365c;
        boolean z10 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
                eVar.f22365c = Boolean.FALSE;
            } else {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                eVar.f22365c = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            }
            zBooleanValue = ((Boolean) eVar.f22365c).booleanValue();
        }
        String str = qVar.f14544n;
        str.getClass();
        int iD = o0.d(str, qVar.f14541k);
        if (iD == 0 || i11 < c0.q(iD)) {
            return f.f24608d;
        }
        int iS = c0.s(qVar.D);
        if (iS == 0) {
            return f.f24608d;
        }
        try {
            AudioFormat audioFormatR = c0.r(i10, iS, iD);
            if (i11 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatR, (AudioAttributes) dVar.b().f14586a)) {
                    return f.f24608d;
                }
                l6.c cVar = new l6.c();
                cVar.f11732a = true;
                cVar.f11734c = zBooleanValue;
                return cVar.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatR, (AudioAttributes) dVar.b().f14586a);
            if (playbackOffloadSupport == 0) {
                return f.f24608d;
            }
            l6.c cVar2 = new l6.c();
            if (i11 > 32 && playbackOffloadSupport == 2) {
                z10 = true;
            }
            cVar2.f11732a = true;
            cVar2.f11733b = z10;
            cVar2.f11734c = zBooleanValue;
            return cVar2.a();
        } catch (IllegalArgumentException unused) {
            return f.f24608d;
        }
    }

    public final int i(m4.q qVar) {
        q();
        String str = qVar.f14544n;
        int i10 = qVar.F;
        if ("audio/raw".equals(str)) {
            if (!c0.I(i10)) {
                t0.J(i10, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i10 != 2) {
                return 1;
            }
        } else if (this.f24722w.d(this.f24725z, qVar) == null) {
            return 0;
        }
        return 2;
    }

    public final long j() {
        q qVar = this.f24719t;
        return qVar.f24672c == 0 ? this.G / ((long) qVar.f24671b) : this.H;
    }

    public final long k() {
        q qVar = this.f24719t;
        if (qVar.f24672c != 0) {
            return this.J;
        }
        long j10 = this.I;
        long j11 = qVar.f24673d;
        int i10 = c0.f16548a;
        return ((j10 + j11) - 1) / j11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03a0, code lost:
    
        if (r13 == 0) goto L210;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.nio.ByteBuffer r28, long r29, int r31) throws x4.k, x4.j {
        /*
            Method dump skipped, instruction units count: 1192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.v.l(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean m() {
        if (o()) {
            return !(c0.f16548a >= 29 && this.f24721v.isOffloadedPlayback() && this.U) && this.f24703g.d(k());
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n() throws x4.j {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.v.n():boolean");
    }

    public final boolean o() {
        return this.f24721v != null;
    }

    public final void q() {
        Context context;
        b bVarB;
        c cVar;
        if (this.f24723x == null && (context = this.f24691a) != null) {
            this.f24702f0 = Looper.myLooper();
            e eVar = new e(context, new y6.c0(this), this.f24725z, this.Z);
            this.f24723x = eVar;
            if (eVar.f24607j) {
                bVarB = eVar.f24604g;
                bVarB.getClass();
            } else {
                eVar.f24607j = true;
                d dVar = eVar.f24603f;
                if (dVar != null) {
                    dVar.f24595a.registerContentObserver(dVar.f24596b, false, dVar);
                }
                int i10 = c0.f16548a;
                Handler handler = eVar.f24600c;
                Context context2 = eVar.f24598a;
                if (i10 >= 23 && (cVar = eVar.f24601d) != null) {
                    AudioManager audioManager = (AudioManager) context2.getSystemService("audio");
                    audioManager.getClass();
                    audioManager.registerAudioDeviceCallback(cVar, handler);
                }
                bVarB = b.b(context2, context2.registerReceiver(eVar.f24602e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), eVar.f24606i, eVar.f24605h);
                eVar.f24604g = bVarB;
            }
            this.f24722w = bVarB;
        }
        this.f24722w.getClass();
    }

    public final void r() {
        this.V = true;
        if (o()) {
            n nVar = this.f24703g;
            if (nVar.f24658x != -9223372036854775807L) {
                nVar.I.getClass();
                nVar.f24658x = c0.N(SystemClock.elapsedRealtime());
            }
            m mVar = nVar.f24639e;
            mVar.getClass();
            mVar.a();
            this.f24721v.play();
        }
    }

    public final void s() {
        if (this.T) {
            return;
        }
        this.T = true;
        long jK = k();
        n nVar = this.f24703g;
        nVar.f24660z = nVar.c();
        nVar.I.getClass();
        nVar.f24658x = c0.N(SystemClock.elapsedRealtime());
        nVar.A = jK;
        if (p(this.f24721v)) {
            this.U = false;
        }
        this.f24721v.stop();
        this.F = 0;
    }

    public final void t(long j10) throws k {
        ByteBuffer byteBuffer;
        e(j10);
        if (this.R != null) {
            return;
        }
        if (!this.f24720u.d()) {
            ByteBuffer byteBuffer2 = this.P;
            if (byteBuffer2 != null) {
                w(byteBuffer2);
                e(j10);
                return;
            }
            return;
        }
        while (!this.f24720u.c()) {
            do {
                n4.c cVar = this.f24720u;
                if (cVar.d()) {
                    ByteBuffer byteBuffer3 = cVar.f15264c[cVar.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        cVar.e(n4.f.f15271a);
                        byteBuffer = cVar.f15264c[cVar.b()];
                    }
                } else {
                    byteBuffer = n4.f.f15271a;
                }
                if (byteBuffer.hasRemaining()) {
                    w(byteBuffer);
                    e(j10);
                } else {
                    ByteBuffer byteBuffer4 = this.P;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    n4.c cVar2 = this.f24720u;
                    ByteBuffer byteBuffer5 = this.P;
                    if (cVar2.d() && !cVar2.f15265d) {
                        cVar2.e(byteBuffer5);
                    }
                }
            } while (this.R == null);
            return;
        }
    }

    public final void u() {
        g();
        g0 g0VarListIterator = this.f24699e.listIterator(0);
        while (g0VarListIterator.hasNext()) {
            ((n4.f) g0VarListIterator.next()).reset();
        }
        g0 g0VarListIterator2 = this.f24701f.listIterator(0);
        while (g0VarListIterator2.hasNext()) {
            ((n4.f) g0VarListIterator2.next()).reset();
        }
        n4.c cVar = this.f24720u;
        if (cVar != null) {
            i0 i0Var = cVar.f15262a;
            for (int i10 = 0; i10 < i0Var.size(); i10++) {
                n4.f fVar = (n4.f) i0Var.get(i10);
                fVar.flush();
                fVar.reset();
            }
            cVar.f15264c = new ByteBuffer[0];
            n4.d dVar = n4.d.f15266e;
            cVar.f15265d = false;
        }
        this.V = false;
        this.f24698d0 = false;
    }

    public final void v() {
        if (o()) {
            try {
                this.f24721v.setPlaybackParams(v3.b.k().allowDefaults().setSpeed(this.C.f14581a).setPitch(this.C.f14582b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                p4.c.C("DefaultAudioSink", "Failed to set playback params", e10);
            }
            s0 s0Var = new s0(this.f24721v.getPlaybackParams().getSpeed(), this.f24721v.getPlaybackParams().getPitch());
            this.C = s0Var;
            float f10 = s0Var.f14581a;
            n nVar = this.f24703g;
            nVar.f24643i = f10;
            m mVar = nVar.f24639e;
            if (mVar != null) {
                mVar.a();
            }
            nVar.e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.v.w(java.nio.ByteBuffer):void");
    }

    public final boolean x() {
        q qVar = this.f24719t;
        return qVar != null && qVar.f24679j && c0.f16548a >= 23;
    }
}
