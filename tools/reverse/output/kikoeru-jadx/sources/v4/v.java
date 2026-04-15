package v4;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import b7.b3;
import b7.e1;
import b7.e3;
import b7.g1;
import b7.x2;
import com.tencent.bugly.beta.tinker.TinkerReport;
import j5.f1;
import j5.n1;
import j5.o1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import m4.d1;
import m4.h1;
import m4.i1;
import m4.q1;
import m4.u1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v extends androidx.lifecycle.q implements ExoPlayer {
    public final p4.f A;
    public final p4.f B;
    public final long C;
    public int D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public f1 I;
    public m4.u0 J;
    public m4.l0 K;
    public m4.l0 L;
    public Object M;
    public Surface N;
    public SurfaceHolder O;
    public q5.k P;
    public boolean Q;
    public final int R;
    public p4.u S;
    public m4.d T;
    public float U;
    public boolean V;
    public o4.c W;
    public final boolean X;
    public boolean Y;
    public final int Z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m5.u f22672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m4.u0 f22673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p4.f f22674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f22675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f22676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e[] f22677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e[] f22678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j2.b f22679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p4.x f22680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q f22681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c0 f22682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p4.n f22683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArraySet f22684n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m4.f1 f22685o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f22686p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f22687q;
    public final m4.k q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j5.c0 f22688r;
    public u1 r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w4.d f22689s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public m4.l0 f22690s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Looper f22691t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public u0 f22692t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f22693u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f22694u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f22695v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public long f22696v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f22697w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s f22698x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t f22699y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final d f22700z;

    static {
        m4.j0.a("media3.exoplayer");
    }

    public v(n nVar) {
        super(2);
        this.f22674d = new p4.f();
        try {
            p4.c.s("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.0-alpha01] [" + p4.c0.f16552e + "]");
            Context context = nVar.f22579a;
            String str = nVar.f22599u;
            p4.v vVar = nVar.f22580b;
            this.f22675e = context.getApplicationContext();
            this.f22689s = new w4.d(vVar);
            this.Z = nVar.f22587i;
            this.T = nVar.f22588j;
            this.R = nVar.f22589k;
            this.V = false;
            this.C = nVar.f22596r;
            s sVar = new s(this);
            this.f22698x = sVar;
            this.f22699y = new t();
            Handler handler = new Handler(nVar.f22586h);
            e[] eVarArrB = ((l) nVar.f22581c.get()).b(handler, sVar, sVar, sVar, sVar);
            this.f22677g = eVarArrB;
            p4.c.i(eVarArrB.length > 0);
            this.f22678h = new e[eVarArrB.length];
            int i10 = 0;
            while (true) {
                e[] eVarArr = this.f22678h;
                if (i10 >= eVarArr.length) {
                    break;
                }
                int i11 = this.f22677g[i10].f22451b;
                eVarArr[i10] = null;
                i10++;
            }
            j2.b bVar = (j2.b) nVar.f22583e.get();
            this.f22679i = bVar;
            this.f22688r = (j5.c0) nVar.f22582d.get();
            n5.e eVar = (n5.e) nVar.f22585g.get();
            this.f22687q = nVar.f22590l;
            b1 b1Var = nVar.f22591m;
            this.f22693u = nVar.f22592n;
            this.f22695v = nVar.f22593o;
            this.f22697w = nVar.f22594p;
            Looper looper = nVar.f22586h;
            this.f22691t = looper;
            this.f22676f = this;
            this.f22683m = new p4.n(looper, vVar, new d1(this));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f22684n = copyOnWriteArraySet;
            this.f22686p = new ArrayList();
            this.I = new f1();
            e[] eVarArr2 = this.f22677g;
            m5.u uVar = new m5.u(new z0[eVarArr2.length], new m5.r[eVarArr2.length], q1.f14559b, null);
            this.f22672b = uVar;
            this.f22685o = new m4.f1();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            int length = iArr.length;
            int i12 = 0;
            while (i12 < length) {
                int[] iArr2 = iArr;
                int i13 = iArr2[i12];
                p4.c.i(!false);
                sparseBooleanArray.append(i13, true);
                i12++;
                iArr = iArr2;
                bVar = bVar;
            }
            j2.b bVar2 = bVar;
            p4.c.i(!false);
            sparseBooleanArray.append(29, true);
            p4.c.i(!false);
            m4.o oVar = new m4.o(sparseBooleanArray);
            this.f22673c = new m4.u0(oVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i14 = 0; i14 < oVar.f14437a.size(); i14++) {
                int iB = oVar.b(i14);
                p4.c.i(!false);
                sparseBooleanArray2.append(iB, true);
            }
            p4.c.i(!false);
            sparseBooleanArray2.append(4, true);
            p4.c.i(!false);
            sparseBooleanArray2.append(10, true);
            p4.c.i(!false);
            this.J = new m4.u0(new m4.o(sparseBooleanArray2));
            this.f22680j = vVar.a(looper, null);
            q qVar = new q(this, 0);
            this.f22681k = qVar;
            this.f22692t0 = u0.h(uVar);
            this.f22689s.b0(this, looper);
            c0 c0Var = new c0(this.f22677g, this.f22678h, bVar2, uVar, (j) nVar.f22584f.get(), eVar, this.D, this.E, this.f22689s, b1Var, nVar.f22595q, looper, vVar, qVar, p4.c0.f16548a < 31 ? new w4.k(str) : ua.j.x(this.f22675e, this, nVar.f22597s, str));
            this.f22682l = c0Var;
            Looper looper2 = c0Var.f22417j;
            this.U = 1.0f;
            this.D = 0;
            m4.l0 l0Var = m4.l0.K;
            this.K = l0Var;
            this.L = l0Var;
            this.f22690s0 = l0Var;
            this.f22694u0 = -1;
            AudioManager audioManager = (AudioManager) this.f22675e.getSystemService("audio");
            int iGenerateAudioSessionId = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            this.W = o4.c.f16214c;
            this.X = true;
            w4.d dVar = this.f22689s;
            p4.n nVar2 = this.f22683m;
            dVar.getClass();
            nVar2.a(dVar);
            ((n5.i) eVar).a(new Handler(looper), this.f22689s);
            copyOnWriteArraySet.add(this.f22698x);
            b7.n nVar3 = new b7.n(context, handler, this.f22698x);
            a aVar = (a) nVar3.f1986d;
            Context context2 = (Context) nVar3.f1985c;
            if (nVar3.f1984b) {
                context2.unregisterReceiver(aVar);
                nVar3.f1984b = false;
            }
            d dVar2 = new d(context, handler, this.f22698x);
            this.f22700z = dVar2;
            dVar2.b(null);
            this.A = new p4.f(context, looper2, vVar, 2);
            this.B = new p4.f(context, looper2, vVar, 3);
            this.q0 = m4.k.f14309e;
            this.r0 = u1.f14594d;
            this.S = p4.u.f16621c;
            bVar2.e(this.T);
            a2(1, 10, Integer.valueOf(iGenerateAudioSessionId));
            a2(2, 10, Integer.valueOf(iGenerateAudioSessionId));
            a2(1, 3, this.T);
            a2(2, 4, Integer.valueOf(this.R));
            a2(2, 5, 0);
            a2(1, 9, Boolean.valueOf(this.V));
            a2(2, 7, this.f22699y);
            a2(6, 8, this.f22699y);
            a2(-1, 16, Integer.valueOf(this.Z));
            this.f22674d.f();
        } catch (Throwable th2) {
            this.f22674d.f();
            throw th2;
        }
    }

    public static long P1(u0 u0Var) {
        h1 h1Var = new h1();
        m4.f1 f1Var = new m4.f1();
        u0Var.f22652a.g(u0Var.f22653b.f10245a, f1Var);
        long j10 = u0Var.f22654c;
        return j10 == -9223372036854775807L ? u0Var.f22652a.m(f1Var.f14203c, h1Var, 0L).f14273l : f1Var.f14205e + j10;
    }

    @Override // m4.y0
    public final void A0(List list) {
        m2();
        ArrayList arrayListF1 = F1(list);
        m2();
        b2(arrayListF1, -1, -9223372036854775807L, true);
    }

    @Override // m4.y0
    public final m4.r0 B() {
        m2();
        return this.f22692t0.f22657f;
    }

    public final void B1(int i10, List list) {
        m2();
        ArrayList arrayListF1 = F1(list);
        m2();
        p4.c.c(i10 >= 0);
        ArrayList arrayList = this.f22686p;
        int iMin = Math.min(i10, arrayList.size());
        if (!arrayList.isEmpty()) {
            k2(D1(this.f22692t0, iMin, arrayListF1), 0, false, 5, -9223372036854775807L, -1, false);
            return;
        }
        boolean z10 = this.f22694u0 == -1;
        m2();
        b2(arrayListF1, -1, -9223372036854775807L, z10);
    }

    @Override // m4.y0
    public final long C() {
        m2();
        return J1(this.f22692t0);
    }

    public final ArrayList C1(int i10, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            s0 s0Var = new s0((j5.a) arrayList.get(i11), this.f22687q);
            arrayList2.add(s0Var);
            u uVar = new u(s0Var.f22628b, s0Var.f22627a);
            this.f22686p.add(i11 + i10, uVar);
        }
        this.I = this.I.a(i10, arrayList2.size());
        return arrayList2;
    }

    @Override // m4.y0
    public final q1 D() {
        m2();
        return this.f22692t0.f22660i.f14764d;
    }

    public final u0 D1(u0 u0Var, int i10, ArrayList arrayList) {
        i1 i1Var = u0Var.f22652a;
        this.F++;
        ArrayList arrayListC1 = C1(i10, arrayList);
        y0 y0Var = new y0(this.f22686p, this.I);
        u0 u0VarQ1 = Q1(u0Var, y0Var, N1(i1Var, y0Var, L1(u0Var), J1(u0Var)));
        f1 f1Var = this.I;
        p4.x xVar = this.f22682l.f22415h;
        x xVar2 = new x(arrayListC1, f1Var, -1, -9223372036854775807L);
        xVar.getClass();
        p4.w wVarB = p4.x.b();
        wVarB.f16625a = xVar.f16627a.obtainMessage(18, i10, 0, xVar2);
        wVarB.b();
        return u0VarQ1;
    }

    public final m4.l0 E1() {
        i1 i1VarJ = J();
        if (i1VarJ.p()) {
            return this.f22690s0;
        }
        m4.i0 i0Var = i1VarJ.m(G(), (h1) this.f801a, 0L).f14264c;
        m4.k0 k0VarA = this.f22690s0.a();
        m4.l0 l0Var = i0Var.f14288d;
        if (l0Var != null) {
            ya.i0 i0Var2 = l0Var.J;
            byte[] bArr = l0Var.f14374k;
            CharSequence charSequence = l0Var.f14364a;
            if (charSequence != null) {
                k0VarA.f14318a = charSequence;
            }
            CharSequence charSequence2 = l0Var.f14365b;
            if (charSequence2 != null) {
                k0VarA.f14319b = charSequence2;
            }
            CharSequence charSequence3 = l0Var.f14366c;
            if (charSequence3 != null) {
                k0VarA.f14320c = charSequence3;
            }
            CharSequence charSequence4 = l0Var.f14367d;
            if (charSequence4 != null) {
                k0VarA.f14321d = charSequence4;
            }
            CharSequence charSequence5 = l0Var.f14368e;
            if (charSequence5 != null) {
                k0VarA.f14322e = charSequence5;
            }
            CharSequence charSequence6 = l0Var.f14369f;
            if (charSequence6 != null) {
                k0VarA.f14323f = charSequence6;
            }
            CharSequence charSequence7 = l0Var.f14370g;
            if (charSequence7 != null) {
                k0VarA.f14324g = charSequence7;
            }
            Long l10 = l0Var.f14371h;
            if (l10 != null) {
                k0VarA.c(l10);
            }
            m4.z0 z0Var = l0Var.f14372i;
            if (z0Var != null) {
                k0VarA.f14326i = z0Var;
            }
            m4.z0 z0Var2 = l0Var.f14373j;
            if (z0Var2 != null) {
                k0VarA.f14327j = z0Var2;
            }
            Uri uri = l0Var.f14376m;
            if (uri != null || bArr != null) {
                k0VarA.f14330m = uri;
                k0VarA.b(bArr, l0Var.f14375l);
            }
            Integer num = l0Var.f14377n;
            if (num != null) {
                k0VarA.f14331n = num;
            }
            Integer num2 = l0Var.f14378o;
            if (num2 != null) {
                k0VarA.f14332o = num2;
            }
            Integer num3 = l0Var.f14379p;
            if (num3 != null) {
                k0VarA.f14333p = num3;
            }
            Boolean bool = l0Var.f14380q;
            if (bool != null) {
                k0VarA.f14334q = bool;
            }
            Boolean bool2 = l0Var.f14381r;
            if (bool2 != null) {
                k0VarA.f14335r = bool2;
            }
            Integer num4 = l0Var.f14382s;
            if (num4 != null) {
                k0VarA.f14336s = num4;
            }
            Integer num5 = l0Var.f14383t;
            if (num5 != null) {
                k0VarA.f14336s = num5;
            }
            Integer num6 = l0Var.f14384u;
            if (num6 != null) {
                k0VarA.f14337t = num6;
            }
            Integer num7 = l0Var.f14385v;
            if (num7 != null) {
                k0VarA.f14338u = num7;
            }
            Integer num8 = l0Var.f14386w;
            if (num8 != null) {
                k0VarA.f14339v = num8;
            }
            Integer num9 = l0Var.f14387x;
            if (num9 != null) {
                k0VarA.f14340w = num9;
            }
            Integer num10 = l0Var.f14388y;
            if (num10 != null) {
                k0VarA.f14341x = num10;
            }
            CharSequence charSequence8 = l0Var.f14389z;
            if (charSequence8 != null) {
                k0VarA.f14342y = charSequence8;
            }
            CharSequence charSequence9 = l0Var.A;
            if (charSequence9 != null) {
                k0VarA.f14343z = charSequence9;
            }
            CharSequence charSequence10 = l0Var.B;
            if (charSequence10 != null) {
                k0VarA.A = charSequence10;
            }
            Integer num11 = l0Var.C;
            if (num11 != null) {
                k0VarA.B = num11;
            }
            Integer num12 = l0Var.D;
            if (num12 != null) {
                k0VarA.C = num12;
            }
            CharSequence charSequence11 = l0Var.E;
            if (charSequence11 != null) {
                k0VarA.D = charSequence11;
            }
            CharSequence charSequence12 = l0Var.F;
            if (charSequence12 != null) {
                k0VarA.E = charSequence12;
            }
            CharSequence charSequence13 = l0Var.G;
            if (charSequence13 != null) {
                k0VarA.F = charSequence13;
            }
            Integer num13 = l0Var.H;
            if (num13 != null) {
                k0VarA.G = num13;
            }
            Bundle bundle = l0Var.I;
            if (bundle != null) {
                k0VarA.H = bundle;
            }
            if (!i0Var2.isEmpty()) {
                k0VarA.I = ya.i0.q(i0Var2);
            }
        }
        return new m4.l0(k0VarA);
    }

    @Override // m4.y0
    public final int F() {
        m2();
        if (o()) {
            return this.f22692t0.f22653b.f10246b;
        }
        return -1;
    }

    public final ArrayList F1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f22688r.a((m4.i0) list.get(i10)));
        }
        return arrayList;
    }

    @Override // m4.y0
    public final int G() {
        m2();
        int iL1 = L1(this.f22692t0);
        if (iL1 == -1) {
            return 0;
        }
        return iL1;
    }

    public final x0 G1(w0 w0Var) {
        int iL1 = L1(this.f22692t0);
        i1 i1Var = this.f22692t0.f22652a;
        int i10 = iL1 == -1 ? 0 : iL1;
        c0 c0Var = this.f22682l;
        return new x0(c0Var, w0Var, i1Var, i10, c0Var.f22417j);
    }

    @Override // m4.y0
    public final int H() {
        m2();
        return this.f22692t0.f22665n;
    }

    public final long H1() {
        m2();
        if (!o()) {
            return I1();
        }
        u0 u0Var = this.f22692t0;
        return u0Var.f22662k.equals(u0Var.f22653b) ? p4.c0.c0(this.f22692t0.f22668q) : M1();
    }

    public final long I1() {
        m2();
        if (this.f22692t0.f22652a.p()) {
            return this.f22696v0;
        }
        u0 u0Var = this.f22692t0;
        if (u0Var.f22662k.f10248d != u0Var.f22653b.f10248d) {
            return p4.c0.c0(u0Var.f22652a.m(G(), (h1) this.f801a, 0L).f14274m);
        }
        long j10 = u0Var.f22668q;
        if (this.f22692t0.f22662k.b()) {
            u0 u0Var2 = this.f22692t0;
            m4.f1 f1VarG = u0Var2.f22652a.g(u0Var2.f22662k.f10245a, this.f22685o);
            long jD = f1VarG.d(this.f22692t0.f22662k.f10246b);
            j10 = jD == Long.MIN_VALUE ? f1VarG.f14204d : jD;
        }
        u0 u0Var3 = this.f22692t0;
        i1 i1Var = u0Var3.f22652a;
        Object obj = u0Var3.f22662k.f10245a;
        m4.f1 f1Var = this.f22685o;
        i1Var.g(obj, f1Var);
        return p4.c0.c0(j10 + f1Var.f14205e);
    }

    @Override // m4.y0
    public final i1 J() {
        m2();
        return this.f22692t0.f22652a;
    }

    public final long J1(u0 u0Var) {
        j5.d0 d0Var = u0Var.f22653b;
        long j10 = u0Var.f22654c;
        i1 i1Var = u0Var.f22652a;
        if (!d0Var.b()) {
            return p4.c0.c0(K1(u0Var));
        }
        Object obj = u0Var.f22653b.f10245a;
        m4.f1 f1Var = this.f22685o;
        i1Var.g(obj, f1Var);
        if (j10 == -9223372036854775807L) {
            return p4.c0.c0(i1Var.m(L1(u0Var), (h1) this.f801a, 0L).f14273l);
        }
        return p4.c0.c0(j10) + p4.c0.c0(f1Var.f14205e);
    }

    @Override // m4.y0
    public final void K(int i10, long j10, List list) {
        m2();
        ArrayList arrayListF1 = F1(list);
        m2();
        b2(arrayListF1, i10, j10, false);
    }

    public final long K1(u0 u0Var) {
        if (u0Var.f22652a.p()) {
            return p4.c0.N(this.f22696v0);
        }
        long jI = u0Var.f22667p ? u0Var.i() : u0Var.f22670s;
        if (u0Var.f22653b.b()) {
            return jI;
        }
        i1 i1Var = u0Var.f22652a;
        Object obj = u0Var.f22653b.f10245a;
        m4.f1 f1Var = this.f22685o;
        i1Var.g(obj, f1Var);
        return jI + f1Var.f14205e;
    }

    public final int L1(u0 u0Var) {
        return u0Var.f22652a.p() ? this.f22694u0 : u0Var.f22652a.g(u0Var.f22653b.f10245a, this.f22685o).f14203c;
    }

    @Override // m4.y0
    public final long M() {
        m2();
        return p4.c0.c0(K1(this.f22692t0));
    }

    public final long M1() {
        m2();
        if (!o()) {
            return Z0();
        }
        u0 u0Var = this.f22692t0;
        j5.d0 d0Var = u0Var.f22653b;
        i1 i1Var = u0Var.f22652a;
        Object obj = d0Var.f10245a;
        m4.f1 f1Var = this.f22685o;
        i1Var.g(obj, f1Var);
        return p4.c0.c0(f1Var.a(d0Var.f10246b, d0Var.f10247c));
    }

    public final Pair N1(i1 i1Var, y0 y0Var, int i10, long j10) {
        if (i1Var.p() || y0Var.p()) {
            boolean z10 = !i1Var.p() && y0Var.p();
            return R1(y0Var, z10 ? -1 : i10, z10 ? -9223372036854775807L : j10);
        }
        Pair pairI = i1Var.i((h1) this.f801a, this.f22685o, i10, p4.c0.N(j10));
        Object obj = pairI.first;
        if (y0Var.b(obj) != -1) {
            return pairI;
        }
        int iN = c0.N((h1) this.f801a, this.f22685o, this.D, this.E, obj, i1Var, y0Var);
        if (iN == -1) {
            return R1(y0Var, -1, -9223372036854775807L);
        }
        h1 h1Var = (h1) this.f801a;
        y0Var.m(iN, h1Var, 0L);
        return R1(y0Var, iN, p4.c0.c0(h1Var.f14273l));
    }

    public final m4.s0 O1() {
        m2();
        return this.f22692t0.f22666o;
    }

    public final u0 Q1(u0 u0Var, i1 i1Var, Pair pair) {
        List list;
        p4.c.c(i1Var.p() || pair != null);
        i1 i1Var2 = u0Var.f22652a;
        long jJ1 = J1(u0Var);
        u0 u0VarG = u0Var.g(i1Var);
        if (i1Var.p()) {
            j5.d0 d0Var = u0.f22651u;
            long jN = p4.c0.N(this.f22696v0);
            u0 u0VarA = u0VarG.b(d0Var, jN, jN, jN, 0L, o1.f10377d, this.f22672b, ya.a1.f25946e).a(d0Var);
            u0VarA.f22668q = u0VarA.f22670s;
            return u0VarA;
        }
        Object obj = u0VarG.f22653b.f10245a;
        int i10 = p4.c0.f16548a;
        boolean zEquals = obj.equals(pair.first);
        j5.d0 d0Var2 = !zEquals ? new j5.d0(pair.first) : u0VarG.f22653b;
        long jLongValue = ((Long) pair.second).longValue();
        long jN2 = p4.c0.N(jJ1);
        if (!i1Var2.p()) {
            jN2 -= i1Var2.g(obj, this.f22685o).f14205e;
        }
        if (!zEquals || jLongValue < jN2) {
            j5.d0 d0Var3 = d0Var2;
            p4.c.i(!d0Var3.b());
            o1 o1Var = !zEquals ? o1.f10377d : u0VarG.f22659h;
            m5.u uVar = !zEquals ? this.f22672b : u0VarG.f22660i;
            if (zEquals) {
                list = u0VarG.f22661j;
            } else {
                ya.g0 g0Var = ya.i0.f25998b;
                list = ya.a1.f25946e;
            }
            u0 u0VarA2 = u0VarG.b(d0Var3, jLongValue, jLongValue, jLongValue, 0L, o1Var, uVar, list).a(d0Var3);
            u0VarA2.f22668q = jLongValue;
            return u0VarA2;
        }
        if (jLongValue != jN2) {
            j5.d0 d0Var4 = d0Var2;
            p4.c.i(!d0Var4.b());
            long jMax = Math.max(0L, u0VarG.f22669r - (jLongValue - jN2));
            long j10 = u0VarG.f22668q;
            if (u0VarG.f22662k.equals(u0VarG.f22653b)) {
                j10 = jLongValue + jMax;
            }
            u0 u0VarB = u0VarG.b(d0Var4, jLongValue, jLongValue, jLongValue, jMax, u0VarG.f22659h, u0VarG.f22660i, u0VarG.f22661j);
            u0VarB.f22668q = j10;
            return u0VarB;
        }
        int iB = i1Var.b(u0VarG.f22662k.f10245a);
        if (iB != -1 && i1Var.f(iB, this.f22685o, false).f14203c == i1Var.g(d0Var2.f10245a, this.f22685o).f14203c) {
            return u0VarG;
        }
        i1Var.g(d0Var2.f10245a, this.f22685o);
        long jA = d0Var2.b() ? this.f22685o.a(d0Var2.f10246b, d0Var2.f10247c) : this.f22685o.f14204d;
        j5.d0 d0Var5 = d0Var2;
        u0 u0VarA3 = u0VarG.b(d0Var5, u0VarG.f22670s, u0VarG.f22670s, u0VarG.f22655d, jA - u0VarG.f22670s, u0VarG.f22659h, u0VarG.f22660i, u0VarG.f22661j).a(d0Var5);
        u0VarA3.f22668q = jA;
        return u0VarA3;
    }

    public final Pair R1(i1 i1Var, int i10, long j10) {
        if (i1Var.p()) {
            this.f22694u0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f22696v0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= i1Var.o()) {
            i10 = i1Var.a(this.E);
            j10 = p4.c0.c0(i1Var.m(i10, (h1) this.f801a, 0L).f14273l);
        }
        return i1Var.i((h1) this.f801a, this.f22685o, i10, p4.c0.N(j10));
    }

    public final void S1(int i10, int i11) {
        p4.u uVar = this.S;
        if (i10 == uVar.f16622a && i11 == uVar.f16623b) {
            return;
        }
        this.S = new p4.u(i10, i11);
        this.f22683m.e(24, new b3(i10, i11, 2));
        a2(2, 14, new p4.u(i10, i11));
    }

    public final void T1(int i10, int i11, int i12) {
        m2();
        p4.c.c(i10 >= 0 && i10 <= i11 && i12 >= 0);
        ArrayList arrayList = this.f22686p;
        int size = arrayList.size();
        int iMin = Math.min(i11, size);
        int iMin2 = Math.min(i12, size - (iMin - i10));
        if (i10 >= size || i10 == iMin || i10 == iMin2) {
            return;
        }
        i1 i1VarJ = J();
        this.F++;
        p4.c0.M(i10, iMin, iMin2, arrayList);
        y0 y0Var = new y0(arrayList, this.I);
        u0 u0Var = this.f22692t0;
        u0 u0VarQ1 = Q1(u0Var, y0Var, N1(i1VarJ, y0Var, L1(u0Var), J1(this.f22692t0)));
        f1 f1Var = this.I;
        c0 c0Var = this.f22682l;
        c0Var.getClass();
        c0Var.f22415h.a(19, new y(i10, iMin, iMin2, f1Var)).b();
        k2(u0VarQ1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void U1(m4.w0 w0Var) {
        m2();
        p4.n nVar = this.f22683m;
        nVar.f();
        CopyOnWriteArraySet<p4.m> copyOnWriteArraySet = nVar.f16591d;
        for (p4.m mVar : copyOnWriteArraySet) {
            if (mVar.f16584a.equals(w0Var)) {
                p4.l lVar = nVar.f16590c;
                mVar.f16587d = true;
                if (mVar.f16586c) {
                    mVar.f16586c = false;
                    lVar.g(mVar.f16584a, mVar.f16585b.d());
                }
                copyOnWriteArraySet.remove(mVar);
            }
        }
    }

    public final void V1(int i10, int i11) {
        m2();
        p4.c.c(i10 >= 0 && i11 >= i10);
        int size = this.f22686p.size();
        int iMin = Math.min(i11, size);
        if (i10 >= size || i10 == iMin) {
            return;
        }
        u0 u0VarW1 = W1(this.f22692t0, i10, iMin);
        k2(u0VarW1, 0, !u0VarW1.f22653b.f10245a.equals(this.f22692t0.f22653b.f10245a), 4, K1(u0VarW1), -1, false);
    }

    public final u0 W1(u0 u0Var, int i10, int i11) {
        int iL1 = L1(u0Var);
        long jJ1 = J1(u0Var);
        i1 i1Var = u0Var.f22652a;
        ArrayList arrayList = this.f22686p;
        int size = arrayList.size();
        this.F++;
        X1(i10, i11);
        y0 y0Var = new y0(arrayList, this.I);
        u0 u0VarQ1 = Q1(u0Var, y0Var, N1(i1Var, y0Var, iL1, jJ1));
        int i12 = u0VarQ1.f22656e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && iL1 >= u0VarQ1.f22652a.o()) {
            u0VarQ1 = u0VarQ1.f(4);
        }
        f1 f1Var = this.I;
        p4.x xVar = this.f22682l.f22415h;
        xVar.getClass();
        p4.w wVarB = p4.x.b();
        wVarB.f16625a = xVar.f16627a.obtainMessage(20, i10, i11, f1Var);
        wVarB.b();
        return u0VarQ1;
    }

    public final void X1(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f22686p.remove(i12);
        }
        f1 f1Var = this.I;
        int i13 = i11 - i10;
        int[] iArr = f1Var.f10259b;
        int[] iArr2 = new int[iArr.length - i13];
        int i14 = 0;
        for (int i15 = 0; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            if (i16 < i10 || i16 >= i11) {
                int i17 = i15 - i14;
                if (i16 >= i10) {
                    i16 -= i13;
                }
                iArr2[i17] = i16;
            } else {
                i14++;
            }
        }
        this.I = new f1(iArr2, new Random(f1Var.f10258a.nextLong()));
    }

    public final void Y1() {
        q5.k kVar = this.P;
        s sVar = this.f22698x;
        if (kVar != null) {
            x0 x0VarG1 = G1(this.f22699y);
            p4.c.i(!x0VarG1.f22711f);
            x0VarG1.f22708c = 10000;
            p4.c.i(!x0VarG1.f22711f);
            x0VarG1.f22709d = null;
            x0VarG1.b();
            this.P.f17828a.remove(sVar);
            this.P = null;
        }
        SurfaceHolder surfaceHolder = this.O;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(sVar);
            this.O = null;
        }
    }

    public final void Z1(int i10, int i11, List list) {
        m2();
        p4.c.c(i10 >= 0 && i11 >= i10);
        ArrayList arrayList = this.f22686p;
        int size = arrayList.size();
        if (i10 > size) {
            return;
        }
        int iMin = Math.min(i11, size);
        if (iMin - i10 == list.size()) {
            for (int i12 = i10; i12 < iMin; i12++) {
                if (((u) arrayList.get(i12)).f22649b.f10407k.a((m4.i0) list.get(i12 - i10))) {
                }
            }
            this.F++;
            p4.x xVar = this.f22682l.f22415h;
            xVar.getClass();
            p4.w wVarB = p4.x.b();
            wVarB.f16625a = xVar.f16627a.obtainMessage(27, i10, iMin, list);
            wVarB.b();
            for (int i13 = i10; i13 < iMin; i13++) {
                u uVar = (u) arrayList.get(i13);
                uVar.f22650c = new n1(uVar.f22650c, (m4.i0) list.get(i13 - i10));
            }
            k2(this.f22692t0.g(new y0(arrayList, this.I)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList arrayListF1 = F1(list);
        if (!arrayList.isEmpty()) {
            u0 u0VarW1 = W1(D1(this.f22692t0, iMin, arrayListF1), i10, iMin);
            k2(u0VarW1, 0, !u0VarW1.f22653b.f10245a.equals(this.f22692t0.f22653b.f10245a), 4, K1(u0VarW1), -1, false);
        } else {
            boolean z10 = this.f22694u0 == -1;
            m2();
            b2(arrayListF1, -1, -9223372036854775807L, z10);
        }
    }

    public final void a2(int i10, int i11, Object obj) {
        for (e eVar : this.f22677g) {
            if (i10 == -1 || eVar.f22451b == i10) {
                x0 x0VarG1 = G1(eVar);
                p4.c.i(!x0VarG1.f22711f);
                x0VarG1.f22708c = i11;
                p4.c.i(!x0VarG1.f22711f);
                x0VarG1.f22709d = obj;
                x0VarG1.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b2(java.util.ArrayList r16, int r17, long r18, boolean r20) {
        /*
            r15 = this;
            r1 = r17
            v4.u0 r2 = r15.f22692t0
            int r2 = r15.L1(r2)
            long r3 = r15.M()
            int r5 = r15.F
            r6 = 1
            int r5 = r5 + r6
            r15.F = r5
            java.util.ArrayList r5 = r15.f22686p
            boolean r7 = r5.isEmpty()
            r8 = 0
            if (r7 != 0) goto L22
            int r7 = r5.size()
            r15.X1(r8, r7)
        L22:
            r7 = r16
            java.util.ArrayList r10 = r15.C1(r8, r7)
            v4.y0 r7 = new v4.y0
            j5.f1 r9 = r15.I
            r7.<init>(r5, r9)
            boolean r5 = r7.p()
            int r9 = r7.f22719g
            if (r5 != 0) goto L40
            if (r1 >= r9) goto L3a
            goto L40
        L3a:
            m4.t r1 = new m4.t
            r1.<init>()
            throw r1
        L40:
            r5 = -1
            if (r20 == 0) goto L50
            boolean r1 = r15.E
            int r1 = r7.a(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4e:
            r12 = r1
            goto L58
        L50:
            if (r1 != r5) goto L55
            r12 = r2
            r2 = r3
            goto L58
        L55:
            r2 = r18
            goto L4e
        L58:
            v4.u0 r1 = r15.f22692t0
            android.util.Pair r4 = r15.R1(r7, r12, r2)
            v4.u0 r1 = r15.Q1(r1, r7, r4)
            int r4 = r1.f22656e
            if (r12 == r5) goto L74
            if (r4 == r6) goto L74
            boolean r4 = r7.p()
            if (r4 != 0) goto L73
            if (r12 < r9) goto L71
            goto L73
        L71:
            r4 = 2
            goto L74
        L73:
            r4 = 4
        L74:
            v4.u0 r1 = r1.f(r4)
            long r13 = p4.c0.N(r2)
            j5.f1 r11 = r15.I
            v4.c0 r2 = r15.f22682l
            p4.x r2 = r2.f22415h
            v4.x r9 = new v4.x
            r9.<init>(r10, r11, r12, r13)
            r3 = 17
            p4.w r2 = r2.a(r3, r9)
            r2.b()
            v4.u0 r2 = r15.f22692t0
            j5.d0 r2 = r2.f22653b
            java.lang.Object r2 = r2.f10245a
            j5.d0 r3 = r1.f22653b
            java.lang.Object r3 = r3.f10245a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lac
            v4.u0 r2 = r15.f22692t0
            m4.i1 r2 = r2.f22652a
            boolean r2 = r2.p()
            if (r2 != 0) goto Lac
            r3 = 1
            goto Lad
        Lac:
            r3 = 0
        Lad:
            long r5 = r15.K1(r1)
            r7 = -1
            r8 = 0
            r2 = 0
            r4 = 4
            r0 = r15
            r0.k2(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.v.b2(java.util.ArrayList, int, long, boolean):void");
    }

    @Override // m4.y0
    public final void c() {
        m2();
        boolean zR = r();
        int iD = this.f22700z.d(2, zR);
        j2(iD, iD == -1 ? 2 : 1, zR);
        u0 u0Var = this.f22692t0;
        if (u0Var.f22656e != 1) {
            return;
        }
        u0 u0VarD = u0Var.d(null);
        u0 u0VarF = u0VarD.f(u0VarD.f22652a.p() ? 4 : 2);
        this.F++;
        p4.x xVar = this.f22682l.f22415h;
        xVar.getClass();
        p4.w wVarB = p4.x.b();
        wVarB.f16625a = xVar.f16627a.obtainMessage(29);
        wVarB.b();
        k2(u0VarF, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void c2(boolean z10) {
        m2();
        int iD = this.f22700z.d(i(), z10);
        j2(iD, iD == -1 ? 2 : 1, z10);
    }

    public final void d2(m4.s0 s0Var) {
        m2();
        if (this.f22692t0.f22666o.equals(s0Var)) {
            return;
        }
        u0 u0VarE = this.f22692t0.e(s0Var);
        this.F++;
        this.f22682l.f22415h.a(4, s0Var).b();
        k2(u0VarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void e2(int i10) {
        m2();
        if (this.D != i10) {
            this.D = i10;
            p4.x xVar = this.f22682l.f22415h;
            xVar.getClass();
            p4.w wVarB = p4.x.b();
            wVarB.f16625a = xVar.f16627a.obtainMessage(11, i10, 0);
            wVarB.b();
            x2 x2Var = new x2(i10, 4);
            p4.n nVar = this.f22683m;
            nVar.c(8, x2Var);
            i2();
            nVar.b();
        }
    }

    public final void f2(Surface surface) {
        Object obj = this.M;
        boolean z10 = true;
        boolean z11 = (obj == null || obj == surface) ? false : true;
        long j10 = z11 ? this.C : -9223372036854775807L;
        c0 c0Var = this.f22682l;
        synchronized (c0Var) {
            if (!c0Var.B && c0Var.f22417j.getThread().isAlive()) {
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                c0Var.f22415h.a(30, new Pair(surface, atomicBoolean)).b();
                if (j10 != -9223372036854775807L) {
                    c0Var.q0(new j5.o(4, atomicBoolean), j10);
                    z10 = atomicBoolean.get();
                }
            }
        }
        if (z11) {
            Object obj2 = this.M;
            Surface surface2 = this.N;
            if (obj2 == surface2) {
                surface2.release();
                this.N = null;
            }
        }
        this.M = surface;
        if (z10) {
            return;
        }
        h2(new m(2, new ce.j0("Detaching surface timed out."), 1003));
    }

    public final void g2() {
        m2();
        this.f22700z.d(1, r());
        h2(null);
        this.W = new o4.c(this.f22692t0.f22670s, ya.a1.f25946e);
    }

    public final void h2(m mVar) {
        u0 u0Var = this.f22692t0;
        u0 u0VarA = u0Var.a(u0Var.f22653b);
        u0VarA.f22668q = u0VarA.f22670s;
        u0VarA.f22669r = 0L;
        u0 u0VarF = u0VarA.f(1);
        if (mVar != null) {
            u0VarF = u0VarF.d(mVar);
        }
        u0 u0Var2 = u0VarF;
        this.F++;
        p4.x xVar = this.f22682l.f22415h;
        xVar.getClass();
        p4.w wVarB = p4.x.b();
        wVarB.f16625a = xVar.f16627a.obtainMessage(6);
        wVarB.b();
        k2(u0Var2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // m4.y0
    public final int i() {
        m2();
        return this.f22692t0.f22656e;
    }

    public final void i2() {
        m4.u0 u0Var = this.J;
        int i10 = p4.c0.f16548a;
        v vVar = this.f22676f;
        boolean zO = vVar.o();
        boolean zN1 = vVar.n1();
        boolean zJ1 = vVar.j1();
        boolean zI1 = vVar.i1();
        boolean zM1 = vVar.m1();
        boolean zL1 = vVar.l1();
        boolean zP = vVar.J().p();
        m4.t0 t0Var = new m4.t0();
        t0Var.f14586a = new k5.d();
        k5.d dVar = (k5.d) t0Var.f14586a;
        dVar.b(this.f22673c.f14593a);
        boolean z10 = !zO;
        t0Var.a(4, z10);
        boolean z11 = false;
        int i11 = 1;
        t0Var.a(5, zN1 && !zO);
        t0Var.a(6, zJ1 && !zO);
        t0Var.a(7, !zP && (zJ1 || !zM1 || zN1) && !zO);
        t0Var.a(8, zI1 && !zO);
        t0Var.a(9, !zP && (zI1 || (zM1 && zL1)) && !zO);
        t0Var.a(10, z10);
        t0Var.a(11, zN1 && !zO);
        if (zN1 && !zO) {
            z11 = true;
        }
        t0Var.a(12, z11);
        m4.u0 u0Var2 = new m4.u0(dVar.d());
        this.J = u0Var2;
        if (u0Var2.equals(u0Var)) {
            return;
        }
        this.f22683m.c(13, new q(this, i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final void j2(int i10, int i11, boolean z10) {
        ?? r52 = (!z10 || i10 == -1) ? 0 : 1;
        int i12 = i10 == 0 ? 1 : 0;
        u0 u0Var = this.f22692t0;
        boolean z11 = u0Var.f22663l;
        if (z11 == r52 && u0Var.f22665n == i12 && u0Var.f22664m == i11) {
            return;
        }
        this.F++;
        boolean z12 = u0Var.f22667p;
        u0 u0Var2 = u0Var;
        if (z12) {
            u0Var2 = new u0(u0Var.f22652a, u0Var.f22653b, u0Var.f22654c, u0Var.f22655d, u0Var.f22656e, u0Var.f22657f, u0Var.f22658g, u0Var.f22659h, u0Var.f22660i, u0Var.f22661j, u0Var.f22662k, z11, u0Var.f22664m, u0Var.f22665n, u0Var.f22666o, u0Var.f22668q, u0Var.f22669r, u0Var.i(), SystemClock.elapsedRealtime(), u0Var.f22667p);
        }
        u0 u0VarC = u0Var2.c(i11, i12, r52);
        int i13 = i11 | (i12 << 4);
        p4.x xVar = this.f22682l.f22415h;
        xVar.getClass();
        p4.w wVarB = p4.x.b();
        wVarB.f16625a = xVar.f16627a.obtainMessage(1, r52, i13);
        wVarB.b();
        k2(u0VarC, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void k2(final u0 u0Var, int i10, boolean z10, int i11, long j10, int i12, boolean z11) {
        Pair pair;
        int i13;
        m4.i0 i0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14;
        Object obj;
        m4.i0 i0Var2;
        Object obj2;
        int i15;
        long j11;
        long j12;
        long jP1;
        long jP12;
        Object obj3;
        m4.i0 i0Var3;
        Object obj4;
        int i16;
        u0 u0Var2 = this.f22692t0;
        this.f22692t0 = u0Var;
        boolean zEquals = u0Var2.f22652a.equals(u0Var.f22652a);
        h1 h1Var = (h1) this.f801a;
        m4.f1 f1Var = this.f22685o;
        i1 i1Var = u0Var2.f22652a;
        j5.d0 d0Var = u0Var2.f22653b;
        i1 i1Var2 = u0Var.f22652a;
        j5.d0 d0Var2 = u0Var.f22653b;
        if (i1Var2.p() && i1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (i1Var2.p() != i1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (i1Var.m(i1Var.g(d0Var.f10245a, f1Var).f14203c, h1Var, 0L).f14262a.equals(i1Var2.m(i1Var2.g(d0Var2.f10245a, f1Var).f14203c, h1Var, 0L).f14262a)) {
            pair = (z10 && i11 == 0 && d0Var.f10248d < d0Var2.f10248d) ? new Pair(Boolean.TRUE, 0) : (z10 && i11 == 1 && z11) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z10 && i11 == 0) {
                i13 = 1;
            } else if (z10 && i11 == 1) {
                i13 = 2;
            } else {
                if (zEquals) {
                    throw new IllegalStateException();
                }
                i13 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            i0Var = !u0Var.f22652a.p() ? u0Var.f22652a.m(u0Var.f22652a.g(u0Var.f22653b.f10245a, this.f22685o).f14203c, (h1) this.f801a, 0L).f14264c : null;
            this.f22690s0 = m4.l0.K;
        } else {
            i0Var = null;
        }
        if (zBooleanValue || !u0Var2.f22661j.equals(u0Var.f22661j)) {
            m4.k0 k0VarA = this.f22690s0.a();
            List list = u0Var.f22661j;
            for (int i17 = 0; i17 < list.size(); i17++) {
                m4.n0 n0Var = (m4.n0) list.get(i17);
                int i18 = 0;
                while (true) {
                    m4.m0[] m0VarArr = n0Var.f14409a;
                    if (i18 < m0VarArr.length) {
                        m0VarArr[i18].b(k0VarA);
                        i18++;
                    }
                }
            }
            this.f22690s0 = new m4.l0(k0VarA);
        }
        m4.l0 l0VarE1 = E1();
        boolean zEquals2 = l0VarE1.equals(this.K);
        this.K = l0VarE1;
        boolean z15 = u0Var2.f22663l != u0Var.f22663l;
        boolean z16 = u0Var2.f22656e != u0Var.f22656e;
        if (z16 || z15) {
            l2();
        }
        boolean z17 = u0Var2.f22658g != u0Var.f22658g;
        if (!zEquals) {
            this.f22683m.c(0, new e1(i10, 2, u0Var));
        }
        if (z10) {
            m4.f1 f1Var2 = new m4.f1();
            if (u0Var2.f22652a.p()) {
                z12 = zBooleanValue;
                z13 = zEquals2;
                z14 = z16;
                i14 = i12;
                obj = null;
                i0Var2 = null;
                obj2 = null;
                i15 = -1;
            } else {
                Object obj5 = u0Var2.f22653b.f10245a;
                u0Var2.f22652a.g(obj5, f1Var2);
                int i19 = f1Var2.f14203c;
                int iB = u0Var2.f22652a.b(obj5);
                z12 = zBooleanValue;
                z13 = zEquals2;
                z14 = z16;
                obj = u0Var2.f22652a.m(i19, (h1) this.f801a, 0L).f14262a;
                i0Var2 = ((h1) this.f801a).f14264c;
                obj2 = obj5;
                i14 = i19;
                i15 = iB;
            }
            if (i11 == 0) {
                if (u0Var2.f22653b.b()) {
                    j5.d0 d0Var3 = u0Var2.f22653b;
                    jP1 = f1Var2.a(d0Var3.f10246b, d0Var3.f10247c);
                    jP12 = P1(u0Var2);
                } else if (u0Var2.f22653b.f10249e != -1) {
                    jP1 = P1(this.f22692t0);
                    jP12 = jP1;
                } else {
                    j11 = f1Var2.f14205e;
                    j12 = f1Var2.f14204d;
                    jP1 = j11 + j12;
                    jP12 = jP1;
                }
            } else if (u0Var2.f22653b.b()) {
                jP1 = u0Var2.f22670s;
                jP12 = P1(u0Var2);
            } else {
                j11 = f1Var2.f14205e;
                j12 = u0Var2.f22670s;
                jP1 = j11 + j12;
                jP12 = jP1;
            }
            long jC0 = p4.c0.c0(jP1);
            long jC02 = p4.c0.c0(jP12);
            j5.d0 d0Var4 = u0Var2.f22653b;
            m4.x0 x0Var = new m4.x0(obj, i14, i0Var2, obj2, i15, jC0, jC02, d0Var4.f10246b, d0Var4.f10247c);
            h1 h1Var2 = (h1) this.f801a;
            int iG = G();
            if (this.f22692t0.f22652a.p()) {
                obj3 = null;
                i0Var3 = null;
                obj4 = null;
                i16 = -1;
            } else {
                u0 u0Var3 = this.f22692t0;
                Object obj6 = u0Var3.f22653b.f10245a;
                u0Var3.f22652a.g(obj6, this.f22685o);
                int iB2 = this.f22692t0.f22652a.b(obj6);
                Object obj7 = this.f22692t0.f22652a.m(iG, h1Var2, 0L).f14262a;
                i0Var3 = h1Var2.f14264c;
                i16 = iB2;
                obj4 = obj6;
                obj3 = obj7;
            }
            long jC03 = p4.c0.c0(j10);
            long jC04 = this.f22692t0.f22653b.b() ? p4.c0.c0(P1(this.f22692t0)) : jC03;
            j5.d0 d0Var5 = this.f22692t0.f22653b;
            this.f22683m.c(11, new g1(i11, x0Var, new m4.x0(obj3, iG, i0Var3, obj4, i16, jC03, jC04, d0Var5.f10246b, d0Var5.f10247c)));
        } else {
            z12 = zBooleanValue;
            z13 = zEquals2;
            z14 = z16;
        }
        if (z12) {
            this.f22683m.c(1, new e1(iIntValue, 3, i0Var));
        }
        if (u0Var2.f22657f != u0Var.f22657f) {
            final int i20 = 7;
            this.f22683m.c(10, new p4.k() { // from class: v4.p
                @Override // p4.k
                public final void a(Object obj8) {
                    m4.w0 w0Var = (m4.w0) obj8;
                    switch (i20) {
                        case 0:
                            u0 u0Var4 = u0Var;
                            w0Var.c(u0Var4.f22658g);
                            w0Var.l(u0Var4.f22658g);
                            break;
                        case 1:
                            u0 u0Var5 = u0Var;
                            w0Var.L(u0Var5.f22656e, u0Var5.f22663l);
                            break;
                        case 2:
                            w0Var.r(u0Var.f22656e);
                            break;
                        case 3:
                            u0 u0Var6 = u0Var;
                            w0Var.n(u0Var6.f22664m, u0Var6.f22663l);
                            break;
                        case 4:
                            w0Var.b(u0Var.f22665n);
                            break;
                        case 5:
                            w0Var.U(u0Var.j());
                            break;
                        case 6:
                            w0Var.o(u0Var.f22666o);
                            break;
                        case 7:
                            w0Var.O(u0Var.f22657f);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.i(u0Var.f22657f);
                            break;
                        default:
                            w0Var.j(u0Var.f22660i.f14764d);
                            break;
                    }
                }
            });
            if (u0Var.f22657f != null) {
                final int i21 = 8;
                this.f22683m.c(10, new p4.k() { // from class: v4.p
                    @Override // p4.k
                    public final void a(Object obj8) {
                        m4.w0 w0Var = (m4.w0) obj8;
                        switch (i21) {
                            case 0:
                                u0 u0Var4 = u0Var;
                                w0Var.c(u0Var4.f22658g);
                                w0Var.l(u0Var4.f22658g);
                                break;
                            case 1:
                                u0 u0Var5 = u0Var;
                                w0Var.L(u0Var5.f22656e, u0Var5.f22663l);
                                break;
                            case 2:
                                w0Var.r(u0Var.f22656e);
                                break;
                            case 3:
                                u0 u0Var6 = u0Var;
                                w0Var.n(u0Var6.f22664m, u0Var6.f22663l);
                                break;
                            case 4:
                                w0Var.b(u0Var.f22665n);
                                break;
                            case 5:
                                w0Var.U(u0Var.j());
                                break;
                            case 6:
                                w0Var.o(u0Var.f22666o);
                                break;
                            case 7:
                                w0Var.O(u0Var.f22657f);
                                break;
                            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                                w0Var.i(u0Var.f22657f);
                                break;
                            default:
                                w0Var.j(u0Var.f22660i.f14764d);
                                break;
                        }
                    }
                });
            }
        }
        m5.u uVar = u0Var2.f22660i;
        m5.u uVar2 = u0Var.f22660i;
        if (uVar != uVar2) {
            j2.b bVar = this.f22679i;
            Object obj8 = uVar2.f14765e;
            bVar.getClass();
            final int i22 = 9;
            this.f22683m.c(2, new p4.k() { // from class: v4.p
                @Override // p4.k
                public final void a(Object obj82) {
                    m4.w0 w0Var = (m4.w0) obj82;
                    switch (i22) {
                        case 0:
                            u0 u0Var4 = u0Var;
                            w0Var.c(u0Var4.f22658g);
                            w0Var.l(u0Var4.f22658g);
                            break;
                        case 1:
                            u0 u0Var5 = u0Var;
                            w0Var.L(u0Var5.f22656e, u0Var5.f22663l);
                            break;
                        case 2:
                            w0Var.r(u0Var.f22656e);
                            break;
                        case 3:
                            u0 u0Var6 = u0Var;
                            w0Var.n(u0Var6.f22664m, u0Var6.f22663l);
                            break;
                        case 4:
                            w0Var.b(u0Var.f22665n);
                            break;
                        case 5:
                            w0Var.U(u0Var.j());
                            break;
                        case 6:
                            w0Var.o(u0Var.f22666o);
                            break;
                        case 7:
                            w0Var.O(u0Var.f22657f);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.i(u0Var.f22657f);
                            break;
                        default:
                            w0Var.j(u0Var.f22660i.f14764d);
                            break;
                    }
                }
            });
        }
        if (!z13) {
            this.f22683m.c(14, new e3(this.K));
        }
        if (z17) {
            final int i23 = 0;
            this.f22683m.c(3, new p4.k() { // from class: v4.p
                @Override // p4.k
                public final void a(Object obj82) {
                    m4.w0 w0Var = (m4.w0) obj82;
                    switch (i23) {
                        case 0:
                            u0 u0Var4 = u0Var;
                            w0Var.c(u0Var4.f22658g);
                            w0Var.l(u0Var4.f22658g);
                            break;
                        case 1:
                            u0 u0Var5 = u0Var;
                            w0Var.L(u0Var5.f22656e, u0Var5.f22663l);
                            break;
                        case 2:
                            w0Var.r(u0Var.f22656e);
                            break;
                        case 3:
                            u0 u0Var6 = u0Var;
                            w0Var.n(u0Var6.f22664m, u0Var6.f22663l);
                            break;
                        case 4:
                            w0Var.b(u0Var.f22665n);
                            break;
                        case 5:
                            w0Var.U(u0Var.j());
                            break;
                        case 6:
                            w0Var.o(u0Var.f22666o);
                            break;
                        case 7:
                            w0Var.O(u0Var.f22657f);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.i(u0Var.f22657f);
                            break;
                        default:
                            w0Var.j(u0Var.f22660i.f14764d);
                            break;
                    }
                }
            });
        }
        if (z14 || z15) {
            final int i24 = 1;
            this.f22683m.c(-1, new p4.k() { // from class: v4.p
                @Override // p4.k
                public final void a(Object obj82) {
                    m4.w0 w0Var = (m4.w0) obj82;
                    switch (i24) {
                        case 0:
                            u0 u0Var4 = u0Var;
                            w0Var.c(u0Var4.f22658g);
                            w0Var.l(u0Var4.f22658g);
                            break;
                        case 1:
                            u0 u0Var5 = u0Var;
                            w0Var.L(u0Var5.f22656e, u0Var5.f22663l);
                            break;
                        case 2:
                            w0Var.r(u0Var.f22656e);
                            break;
                        case 3:
                            u0 u0Var6 = u0Var;
                            w0Var.n(u0Var6.f22664m, u0Var6.f22663l);
                            break;
                        case 4:
                            w0Var.b(u0Var.f22665n);
                            break;
                        case 5:
                            w0Var.U(u0Var.j());
                            break;
                        case 6:
                            w0Var.o(u0Var.f22666o);
                            break;
                        case 7:
                            w0Var.O(u0Var.f22657f);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.i(u0Var.f22657f);
                            break;
                        default:
                            w0Var.j(u0Var.f22660i.f14764d);
                            break;
                    }
                }
            });
        }
        if (z14) {
            final int i25 = 2;
            this.f22683m.c(4, new p4.k() { // from class: v4.p
                @Override // p4.k
                public final void a(Object obj82) {
                    m4.w0 w0Var = (m4.w0) obj82;
                    switch (i25) {
                        case 0:
                            u0 u0Var4 = u0Var;
                            w0Var.c(u0Var4.f22658g);
                            w0Var.l(u0Var4.f22658g);
                            break;
                        case 1:
                            u0 u0Var5 = u0Var;
                            w0Var.L(u0Var5.f22656e, u0Var5.f22663l);
                            break;
                        case 2:
                            w0Var.r(u0Var.f22656e);
                            break;
                        case 3:
                            u0 u0Var6 = u0Var;
                            w0Var.n(u0Var6.f22664m, u0Var6.f22663l);
                            break;
                        case 4:
                            w0Var.b(u0Var.f22665n);
                            break;
                        case 5:
                            w0Var.U(u0Var.j());
                            break;
                        case 6:
                            w0Var.o(u0Var.f22666o);
                            break;
                        case 7:
                            w0Var.O(u0Var.f22657f);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.i(u0Var.f22657f);
                            break;
                        default:
                            w0Var.j(u0Var.f22660i.f14764d);
                            break;
                    }
                }
            });
        }
        if (z15 || u0Var2.f22664m != u0Var.f22664m) {
            final int i26 = 3;
            this.f22683m.c(5, new p4.k() { // from class: v4.p
                @Override // p4.k
                public final void a(Object obj82) {
                    m4.w0 w0Var = (m4.w0) obj82;
                    switch (i26) {
                        case 0:
                            u0 u0Var4 = u0Var;
                            w0Var.c(u0Var4.f22658g);
                            w0Var.l(u0Var4.f22658g);
                            break;
                        case 1:
                            u0 u0Var5 = u0Var;
                            w0Var.L(u0Var5.f22656e, u0Var5.f22663l);
                            break;
                        case 2:
                            w0Var.r(u0Var.f22656e);
                            break;
                        case 3:
                            u0 u0Var6 = u0Var;
                            w0Var.n(u0Var6.f22664m, u0Var6.f22663l);
                            break;
                        case 4:
                            w0Var.b(u0Var.f22665n);
                            break;
                        case 5:
                            w0Var.U(u0Var.j());
                            break;
                        case 6:
                            w0Var.o(u0Var.f22666o);
                            break;
                        case 7:
                            w0Var.O(u0Var.f22657f);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.i(u0Var.f22657f);
                            break;
                        default:
                            w0Var.j(u0Var.f22660i.f14764d);
                            break;
                    }
                }
            });
        }
        if (u0Var2.f22665n != u0Var.f22665n) {
            final int i27 = 4;
            this.f22683m.c(6, new p4.k() { // from class: v4.p
                @Override // p4.k
                public final void a(Object obj82) {
                    m4.w0 w0Var = (m4.w0) obj82;
                    switch (i27) {
                        case 0:
                            u0 u0Var4 = u0Var;
                            w0Var.c(u0Var4.f22658g);
                            w0Var.l(u0Var4.f22658g);
                            break;
                        case 1:
                            u0 u0Var5 = u0Var;
                            w0Var.L(u0Var5.f22656e, u0Var5.f22663l);
                            break;
                        case 2:
                            w0Var.r(u0Var.f22656e);
                            break;
                        case 3:
                            u0 u0Var6 = u0Var;
                            w0Var.n(u0Var6.f22664m, u0Var6.f22663l);
                            break;
                        case 4:
                            w0Var.b(u0Var.f22665n);
                            break;
                        case 5:
                            w0Var.U(u0Var.j());
                            break;
                        case 6:
                            w0Var.o(u0Var.f22666o);
                            break;
                        case 7:
                            w0Var.O(u0Var.f22657f);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.i(u0Var.f22657f);
                            break;
                        default:
                            w0Var.j(u0Var.f22660i.f14764d);
                            break;
                    }
                }
            });
        }
        if (u0Var2.j() != u0Var.j()) {
            final int i28 = 5;
            this.f22683m.c(7, new p4.k() { // from class: v4.p
                @Override // p4.k
                public final void a(Object obj82) {
                    m4.w0 w0Var = (m4.w0) obj82;
                    switch (i28) {
                        case 0:
                            u0 u0Var4 = u0Var;
                            w0Var.c(u0Var4.f22658g);
                            w0Var.l(u0Var4.f22658g);
                            break;
                        case 1:
                            u0 u0Var5 = u0Var;
                            w0Var.L(u0Var5.f22656e, u0Var5.f22663l);
                            break;
                        case 2:
                            w0Var.r(u0Var.f22656e);
                            break;
                        case 3:
                            u0 u0Var6 = u0Var;
                            w0Var.n(u0Var6.f22664m, u0Var6.f22663l);
                            break;
                        case 4:
                            w0Var.b(u0Var.f22665n);
                            break;
                        case 5:
                            w0Var.U(u0Var.j());
                            break;
                        case 6:
                            w0Var.o(u0Var.f22666o);
                            break;
                        case 7:
                            w0Var.O(u0Var.f22657f);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.i(u0Var.f22657f);
                            break;
                        default:
                            w0Var.j(u0Var.f22660i.f14764d);
                            break;
                    }
                }
            });
        }
        if (!u0Var2.f22666o.equals(u0Var.f22666o)) {
            final int i29 = 6;
            this.f22683m.c(12, new p4.k() { // from class: v4.p
                @Override // p4.k
                public final void a(Object obj82) {
                    m4.w0 w0Var = (m4.w0) obj82;
                    switch (i29) {
                        case 0:
                            u0 u0Var4 = u0Var;
                            w0Var.c(u0Var4.f22658g);
                            w0Var.l(u0Var4.f22658g);
                            break;
                        case 1:
                            u0 u0Var5 = u0Var;
                            w0Var.L(u0Var5.f22656e, u0Var5.f22663l);
                            break;
                        case 2:
                            w0Var.r(u0Var.f22656e);
                            break;
                        case 3:
                            u0 u0Var6 = u0Var;
                            w0Var.n(u0Var6.f22664m, u0Var6.f22663l);
                            break;
                        case 4:
                            w0Var.b(u0Var.f22665n);
                            break;
                        case 5:
                            w0Var.U(u0Var.j());
                            break;
                        case 6:
                            w0Var.o(u0Var.f22666o);
                            break;
                        case 7:
                            w0Var.O(u0Var.f22657f);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.i(u0Var.f22657f);
                            break;
                        default:
                            w0Var.j(u0Var.f22660i.f14764d);
                            break;
                    }
                }
            });
        }
        i2();
        this.f22683m.b();
        if (u0Var2.f22667p != u0Var.f22667p) {
            Iterator it = this.f22684n.iterator();
            while (it.hasNext()) {
                ((s) it.next()).f22626a.l2();
            }
        }
    }

    public final void l2() {
        int i10 = i();
        p4.f fVar = this.B;
        p4.f fVar2 = this.A;
        boolean z10 = false;
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                m2();
                boolean z11 = this.f22692t0.f22667p;
                if (r() && !z11) {
                    z10 = true;
                }
                if (fVar2.f16572a != z10) {
                    fVar2.f16572a = z10;
                }
                boolean zR = r();
                if (fVar.f16572a == zR) {
                    return;
                }
                fVar.f16572a = zR;
                return;
            }
            if (i10 != 4) {
                throw new IllegalStateException();
            }
        }
        if (fVar2.f16572a) {
            fVar2.f16572a = false;
        }
        if (fVar.f16572a) {
            fVar.f16572a = false;
        }
    }

    public final void m2() {
        this.f22674d.d();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f22691t;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i10 = p4.c0.f16548a;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.X) {
                throw new IllegalStateException(str);
            }
            p4.c.C("ExoPlayerImpl", str, this.Y ? null : new IllegalStateException());
            this.Y = true;
        }
    }

    @Override // m4.y0
    public final boolean o() {
        m2();
        return this.f22692t0.f22653b.b();
    }

    @Override // m4.y0
    public final long q() {
        m2();
        return p4.c0.c0(this.f22692t0.f22669r);
    }

    @Override // m4.y0
    public final boolean r() {
        m2();
        return this.f22692t0.f22663l;
    }

    @Override // androidx.lifecycle.q
    public final void r1(int i10, boolean z10, long j10) {
        m2();
        if (i10 == -1) {
            return;
        }
        p4.c.c(i10 >= 0);
        i1 i1Var = this.f22692t0.f22652a;
        if (i1Var.p() || i10 < i1Var.o()) {
            w4.d dVar = this.f22689s;
            if (!dVar.f23356h) {
                w4.a aVarV = dVar.V();
                dVar.f23356h = true;
                dVar.a0(aVarV, -1, new w4.b(6));
            }
            this.F++;
            if (o()) {
                p4.c.B("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                z zVar = new z(this.f22692t0);
                zVar.c(1);
                v vVar = this.f22681k.f22618b;
                vVar.f22680j.c(new b5.h(26, vVar, zVar));
                return;
            }
            u0 u0VarF = this.f22692t0;
            int i11 = u0VarF.f22656e;
            if (i11 == 3 || (i11 == 4 && !i1Var.p())) {
                u0VarF = this.f22692t0.f(2);
            }
            int iG = G();
            u0 u0VarQ1 = Q1(u0VarF, i1Var, R1(i1Var, i10, j10));
            this.f22682l.f22415h.a(3, new b0(i1Var, i10, p4.c0.N(j10))).b();
            k2(u0VarQ1, 0, true, 1, K1(u0VarQ1), iG, z10);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        m2();
        a2(4, 15, imageOutput);
    }

    @Override // m4.y0
    public final int u() {
        m2();
        if (this.f22692t0.f22652a.p()) {
            return 0;
        }
        u0 u0Var = this.f22692t0;
        return u0Var.f22652a.b(u0Var.f22653b.f10245a);
    }

    @Override // m4.y0
    public final int x() {
        m2();
        if (o()) {
            return this.f22692t0.f22653b.f10247c;
        }
        return -1;
    }
}
