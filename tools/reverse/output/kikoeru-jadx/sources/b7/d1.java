package b7;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f1712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k4 f1713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p4.n f1714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a1 f1715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p4.b f1716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f1717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.media3.exoplayer.offline.u f1718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c7.o f1719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1721k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1724n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c1 f1722l = new c1();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c1 f1723m = new c1();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b1 f1725o = new b1(0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f1726p = -9223372036854775807L;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f1727q = -9223372036854775807L;

    public d1(Context context, d0 d0Var, k4 k4Var, Bundle bundle, Looper looper, p4.b bVar) {
        this.f1714d = new p4.n(looper, p4.v.f16624a, new b5.a(5, this));
        this.f1711a = context;
        this.f1712b = d0Var;
        this.f1715e = new a1(this, looper);
        this.f1713c = k4Var;
        this.f1717g = bundle;
        this.f1716f = bVar;
        ya.a1 a1Var = ya.a1.f25946e;
    }

    public static List b(List list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static c7.p1 d(c7.p1 p1Var) {
        if (p1Var == null) {
            return null;
        }
        if (p1Var.f3690d > 0.0f) {
            return p1Var;
        }
        p4.c.B("MCImplLegacy", "Adjusting playback speed to 1.0f because negative playback speed isn't supported.");
        ArrayList arrayList = new ArrayList();
        long j10 = p1Var.f3689c;
        long j11 = p1Var.f3691e;
        int i10 = p1Var.f3692f;
        CharSequence charSequence = p1Var.f3693g;
        AbstractCollection abstractCollection = p1Var.f3695i;
        if (abstractCollection != null) {
            arrayList.addAll(abstractCollection);
        }
        return new c7.p1(p1Var.f3687a, p1Var.f3688b, j10, 1.0f, j11, i10, charSequence, p1Var.f3694h, arrayList, p1Var.f3696j, p1Var.f3697k);
    }

    public static m4.x0 e(int i10, m4.i0 i0Var, long j10, boolean z10) {
        return new m4.x0(null, i10, i0Var, null, i10, j10, j10, z10 ? 0 : -1, z10 ? 0 : -1);
    }

    @Override // b7.c0
    public final m4.r0 B() {
        return ((v3) this.f1725o.f1650b).f2134a;
    }

    @Override // b7.c0
    public final long C() {
        return M();
    }

    @Override // b7.c0
    public final m4.q1 D() {
        return m4.q1.f14559b;
    }

    @Override // b7.c0
    public final int F() {
        return -1;
    }

    @Override // b7.c0
    public final int G() {
        return ((v3) this.f1725o.f1650b).f2136c.f1831a.f14632b;
    }

    @Override // b7.c0
    public final int H() {
        return 0;
    }

    @Override // b7.c0
    public final m4.i1 J() {
        return ((v3) this.f1725o.f1650b).f2143j;
    }

    @Override // b7.c0
    public final void K(int i10, long j10, List list) {
        if (!list.isEmpty()) {
            b4 b4Var = b4.f1659g;
            b4Var.getClass();
            ya.f0 f0Var = new ya.f0(4);
            ya.i0 i0Var = b4Var.f1661e;
            f0Var.c(i0Var.subList(0, 0));
            for (int i11 = 0; i11 < list.size(); i11++) {
                f0Var.a(new a4((m4.i0) list.get(i11), -1L, -9223372036854775807L));
            }
            f0Var.c(i0Var.subList(0, i0Var.size()));
            v3 v3VarG = ((v3) this.f1725o.f1650b).g(new b4(f0Var.f(), b4Var.f1662f), new h4(e(i10, (m4.i0) list.get(i10), j10 == -9223372036854775807L ? 0L : j10, false), false, SystemClock.elapsedRealtime(), -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L), 0);
            b1 b1Var = this.f1725o;
            m(new b1(v3VarG, (f4) b1Var.f1651c, (m4.u0) b1Var.f1652d, (ya.i0) b1Var.f1653e, (Bundle) b1Var.f1654f, (g4) null), null, null);
            if (h()) {
                g();
                return;
            }
            return;
        }
        p4.c.c(true);
        int iO = J().o();
        int iMin = Math.min(Integer.MAX_VALUE, iO);
        if (iO <= 0 || iMin == 0) {
            return;
        }
        b4 b4Var2 = (b4) ((v3) this.f1725o.f1650b).f2143j;
        b4Var2.getClass();
        ya.f0 f0Var2 = new ya.f0(4);
        ya.i0 i0Var2 = b4Var2.f1661e;
        f0Var2.c(i0Var2.subList(0, 0));
        f0Var2.c(i0Var2.subList(iMin, i0Var2.size()));
        b4 b4Var3 = new b4(f0Var2.f(), b4Var2.f1662f);
        int iG = G();
        int i12 = iMin + 0;
        if (iG >= 0) {
            iG = iG < iMin ? -1 : iG - i12;
        }
        if (iG == -1) {
            iG = p4.c0.i(0, 0, b4Var3.o() - 1);
            p4.c.B("MCImplLegacy", "Currently playing item is removed. Assumes item at " + iG + " is the new current item");
        }
        int i13 = iG;
        v3 v3Var = (v3) this.f1725o.f1650b;
        m4.r0 r0Var = v3Var.f2134a;
        int i14 = v3Var.f2135b;
        h4 h4Var = v3Var.f2136c;
        m4.x0 x0Var = v3Var.f2137d;
        m4.x0 x0Var2 = v3Var.f2138e;
        int i15 = v3Var.f2139f;
        m4.s0 s0Var = v3Var.f2140g;
        int i16 = v3Var.f2141h;
        boolean z10 = v3Var.f2142i;
        m4.u1 u1Var = v3Var.f2145l;
        m4.l0 l0Var = v3Var.f2146m;
        float f10 = v3Var.f2147n;
        m4.d dVar = v3Var.f2148o;
        o4.c cVar = v3Var.f2149p;
        m4.k kVar = v3Var.f2150q;
        int i17 = v3Var.f2151r;
        boolean z11 = v3Var.f2152s;
        boolean z12 = v3Var.f2153t;
        int i18 = v3Var.f2154u;
        boolean z13 = v3Var.f2155v;
        boolean z14 = v3Var.f2156w;
        int i19 = v3Var.f2157x;
        int i20 = v3Var.f2158y;
        m4.l0 l0Var2 = v3Var.f2159z;
        long j11 = v3Var.A;
        long j12 = v3Var.B;
        long j13 = v3Var.C;
        m4.q1 q1Var = v3Var.D;
        m4.o1 o1Var = v3Var.E;
        m4.x0 x0Var3 = h4Var.f1831a;
        h4 h4Var2 = new h4(new m4.x0(x0Var3.f14631a, i13, x0Var3.f14633c, x0Var3.f14634d, x0Var3.f14635e, x0Var3.f14636f, x0Var3.f14637g, x0Var3.f14638h, x0Var3.f14639i), h4Var.f1832b, h4Var.f1833c, h4Var.f1834d, h4Var.f1835e, h4Var.f1836f, h4Var.f1837g, h4Var.f1838h, h4Var.f1839i, h4Var.f1840j);
        p4.c.i(b4Var3.p() || h4Var2.f1831a.f14632b < b4Var3.o());
        v3 v3Var2 = new v3(r0Var, i14, h4Var2, x0Var, x0Var2, i15, s0Var, i16, z10, u1Var, b4Var3, 0, l0Var, f10, dVar, cVar, kVar, i17, z11, z12, i18, i19, i20, z13, z14, l0Var2, j11, j12, j13, q1Var, o1Var);
        b1 b1Var2 = this.f1725o;
        m(new b1(v3Var2, (f4) b1Var2.f1651c, (m4.u0) b1Var2.f1652d, (ya.i0) b1Var2.f1653e, (Bundle) b1Var2.f1654f, (g4) null), null, null);
        if (h()) {
            for (int i21 = 0; i21 < iMin && i21 < this.f1722l.f1669d.size(); i21++) {
                androidx.media3.exoplayer.offline.u uVar = this.f1718h;
                c7.q0 q0Var = ((c7.b1) this.f1722l.f1669d.get(i21)).f3590a;
                c7.j0 j0Var = (c7.j0) uVar.f968b;
                if ((j0Var.f3647a.getFlags() & 4) == 0) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", lc.b.o(q0Var, MediaDescriptionCompat.CREATOR));
                j0Var.f3647a.sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, null);
            }
        }
    }

    @Override // b7.c0
    public final long M() {
        long jF = s3.f((v3) this.f1725o.f1650b, this.f1726p, this.f1727q, this.f1712b.f1708e);
        this.f1726p = jF;
        return jF;
    }

    @Override // b7.c0
    public final m4.u0 N() {
        return (m4.u0) this.f1725o.f1652d;
    }

    @Override // b7.c0
    public final f4 O() {
        return (f4) this.f1725o.f1651c;
    }

    @Override // b7.c0
    public final ya.i0 P() {
        return (ya.i0) this.f1725o.f1653e;
    }

    @Override // b7.c0
    public final void Q() {
        k4 k4Var = this.f1713c;
        int iB = k4Var.f1919a.b();
        d0 d0Var = this.f1712b;
        if (iB != 0) {
            d0Var.e(new x0(this, 1));
            return;
        }
        Object objG = k4Var.f1919a.g();
        p4.c.j(objG);
        d0Var.e(new b5.h(1, this, (c7.d1) objG));
        d0Var.f1707d.post(new x0(this, 0));
    }

    @Override // b7.c0
    public final cb.y R(e4 e4Var) {
        Bundle bundle = Bundle.EMPTY;
        boolean zContains = ((f4) this.f1725o.f1651c).f1778a.contains(e4Var);
        String str = e4Var.f1762b;
        if (zContains) {
            this.f1718h.X0().D(str, bundle);
            return g8.a.Q(new i4(0));
        }
        cb.e0 e0Var = new cb.e0();
        z0 z0Var = new z0(this.f1712b.f1707d, e0Var);
        androidx.media3.exoplayer.offline.u uVar = this.f1718h;
        uVar.getClass();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command must neither be null nor empty");
        }
        ((c7.j0) uVar.f968b).f3647a.sendCommand(str, bundle, z0Var);
        return e0Var;
    }

    @Override // b7.c0
    public final void S(m4.w0 w0Var) {
        this.f1714d.a(w0Var);
    }

    @Override // b7.c0
    public final boolean T() {
        return this.f1721k;
    }

    @Override // b7.c0
    public final Bundle U() {
        return this.f1717g;
    }

    @Override // b7.c0
    public final void V(List list) {
        K(0, -9223372036854775807L, list);
    }

    @Override // b7.c0
    public final void a() {
        Messenger messenger;
        if (this.f1720j) {
            return;
        }
        this.f1720j = true;
        c7.o oVar = this.f1719i;
        if (oVar != null) {
            c7.j jVar = oVar.f3674a;
            c7.n nVar = jVar.f3644f;
            if (nVar != null && (messenger = jVar.f3645g) != null) {
                try {
                    nVar.c(7, null, messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            jVar.f3640b.disconnect();
            this.f1719i = null;
        }
        androidx.media3.exoplayer.offline.u uVar = this.f1718h;
        if (uVar != null) {
            a1 a1Var = this.f1715e;
            if (a1Var == null) {
                throw new IllegalArgumentException("callback must not be null");
            }
            if (((Set) uVar.f969c).remove(a1Var)) {
                try {
                    ((c7.j0) uVar.f968b).b(a1Var);
                } finally {
                    a1Var.j(null);
                }
            } else {
                Log.w("MediaControllerCompat", "the callback has never been registered");
            }
            a1Var.f1621d.removeCallbacksAndMessages(null);
            this.f1718h = null;
        }
        this.f1721k = false;
        this.f1714d.d();
    }

    @Override // b7.c0
    public final void c() {
        v3 v3Var = (v3) this.f1725o.f1650b;
        if (v3Var.f2158y != 1) {
            return;
        }
        v3 v3VarC = v3Var.c(v3Var.f2143j.p() ? 4 : 2, null);
        b1 b1Var = this.f1725o;
        m(new b1(v3VarC, (f4) b1Var.f1651c, (m4.u0) b1Var.f1652d, (ya.i0) b1Var.f1653e, (Bundle) b1Var.f1654f, (g4) null), null, null);
        if (((v3) this.f1725o.f1650b).f2143j.p()) {
            return;
        }
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01f6 A[PHI: r7
      0x01f6: PHI (r7v7 b7.b4) = (r7v2 b7.b4), (r7v9 b7.b4) binds: [B:104:0x01fa, B:101:0x01f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01fa A[PHI: r6
      0x01fa: PHI (r6v12 int) = (r6v11 int), (r6v17 int) binds: [B:93:0x01ba, B:103:0x01f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b3 A[PHI: r33
      0x02b3: PHI (r33v7 long) = (r33v4 long), (r33v8 long) binds: [B:140:0x02bd, B:135:0x02b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x042f A[LOOP:2: B:212:0x042b->B:214:0x042f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x07cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0671 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x080e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:439:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bc  */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.AbstractCollection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v41, types: [java.util.AbstractCollection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r83, b7.c1 r84) {
        /*
            Method dump skipped, instruction units count: 2286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.d1.f(boolean, b7.c1):void");
    }

    public final void g() {
        m4.h1 h1Var = new m4.h1();
        int i10 = 0;
        p4.c.i(h() && !((v3) this.f1725o.f1650b).f2143j.p());
        v3 v3Var = (v3) this.f1725o.f1650b;
        b4 b4Var = (b4) v3Var.f2143j;
        int i11 = v3Var.f2136c.f1831a.f14632b;
        b4Var.m(i11, h1Var, 0L);
        m4.i0 i0Var = h1Var.f14264c;
        if (b4Var.q(i11) == -1) {
            m4.e0 e0Var = i0Var.f14290f;
            String str = i0Var.f14285a;
            if (e0Var.f14191a != null) {
                if (((v3) this.f1725o.f1650b).f2153t) {
                    b0.c1 c1VarX0 = this.f1718h.X0();
                    Uri uri = e0Var.f14191a;
                    Bundle bundle = e0Var.f14193c;
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    c1VarX0.s(uri, bundle);
                } else {
                    b0.c1 c1VarX02 = this.f1718h.X0();
                    Uri uri2 = e0Var.f14191a;
                    Bundle bundle2 = e0Var.f14193c;
                    if (bundle2 == null) {
                        bundle2 = Bundle.EMPTY;
                    }
                    c1VarX02.z(uri2, bundle2);
                }
            } else if (e0Var.f14192b != null) {
                if (((v3) this.f1725o.f1650b).f2153t) {
                    b0.c1 c1VarX03 = this.f1718h.X0();
                    String str2 = e0Var.f14192b;
                    Bundle bundle3 = e0Var.f14193c;
                    if (bundle3 == null) {
                        bundle3 = Bundle.EMPTY;
                    }
                    ((MediaController.TransportControls) c1VarX03.f1208b).playFromSearch(str2, bundle3);
                } else {
                    b0.c1 c1VarX04 = this.f1718h.X0();
                    String str3 = e0Var.f14192b;
                    Bundle bundle4 = e0Var.f14193c;
                    if (bundle4 == null) {
                        bundle4 = Bundle.EMPTY;
                    }
                    c1VarX04.x(str3, bundle4);
                }
            } else if (((v3) this.f1725o.f1650b).f2153t) {
                b0.c1 c1VarX05 = this.f1718h.X0();
                Bundle bundle5 = e0Var.f14193c;
                if (bundle5 == null) {
                    bundle5 = Bundle.EMPTY;
                }
                ((MediaController.TransportControls) c1VarX05.f1208b).playFromMediaId(str, bundle5);
            } else {
                b0.c1 c1VarX06 = this.f1718h.X0();
                Bundle bundle6 = e0Var.f14193c;
                if (bundle6 == null) {
                    bundle6 = Bundle.EMPTY;
                }
                c1VarX06.u(str, bundle6);
            }
        } else if (((v3) this.f1725o.f1650b).f2153t) {
            ((MediaController.TransportControls) this.f1718h.X0().f1208b).play();
        } else {
            this.f1718h.X0().t();
        }
        if (((v3) this.f1725o.f1650b).f2136c.f1831a.f14636f != 0) {
            ((MediaController.TransportControls) this.f1718h.X0().f1208b).seekTo(((v3) this.f1725o.f1650b).f2136c.f1831a.f14636f);
        }
        if (((m4.u0) this.f1725o.f1652d).a(20)) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < b4Var.o(); i12++) {
                if (i12 != i11 && b4Var.q(i12) == -1) {
                    b4Var.m(i12, h1Var, 0L);
                    arrayList.add(h1Var.f14264c);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            y0 y0Var = new y0(this, new AtomicInteger(0), arrayList, arrayList2, i10, 0);
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                byte[] bArr = ((m4.i0) arrayList.get(i13)).f14288d.f14374k;
                if (bArr == null) {
                    arrayList2.add(null);
                    y0Var.run();
                } else {
                    cb.y yVarB0 = this.f1716f.B0(bArr);
                    arrayList2.add(yVarB0);
                    Handler handler = this.f1712b.f1707d;
                    Objects.requireNonNull(handler);
                    yVarB0.a(y0Var, new k1(handler, 1));
                }
            }
        }
    }

    public final boolean h() {
        return ((v3) this.f1725o.f1650b).f2158y != 1;
    }

    @Override // b7.c0
    public final int i() {
        return ((v3) this.f1725o.f1650b).f2158y;
    }

    public final void j() {
        c7.r0 r0VarCreateFromParcel;
        int iD0;
        if (this.f1720j || this.f1721k) {
            return;
        }
        this.f1721k = true;
        MediaController.PlaybackInfo playbackInfo = ((c7.j0) this.f1718h.f968b).f3647a.getPlaybackInfo();
        c7.l0 l0Var = playbackInfo != null ? new c7.l0(playbackInfo.getPlaybackType(), c7.d.a(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()) : null;
        c7.p1 p1VarD = d(this.f1718h.W0());
        MediaMetadata metadata = ((c7.j0) this.f1718h.f968b).f3647a.getMetadata();
        if (metadata != null) {
            o.e eVar = c7.r0.f3714c;
            Parcel parcelObtain = Parcel.obtain();
            metadata.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            r0VarCreateFromParcel = c7.r0.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            r0VarCreateFromParcel.f3717b = metadata;
        } else {
            r0VarCreateFromParcel = null;
        }
        List<MediaSession.QueueItem> queue = ((c7.j0) this.f1718h.f968b).f3647a.getQueue();
        List listB = b(queue != null ? c7.b1.a(queue) : null);
        CharSequence queueTitle = ((c7.j0) this.f1718h.f968b).f3647a.getQueueTitle();
        c7.h hVarA = ((c7.j0) this.f1718h.f968b).f3651e.a();
        int iP0 = -1;
        if (hVarA != null) {
            try {
                iP0 = hVarA.p0();
            } catch (RemoteException e10) {
                Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", e10);
            }
        }
        c7.h hVarA2 = ((c7.j0) this.f1718h.f968b).f3651e.a();
        if (hVarA2 != null) {
            try {
                iD0 = hVarA2.d0();
            } catch (RemoteException e11) {
                Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", e11);
                iD0 = -1;
            }
        } else {
            iD0 = -1;
        }
        f(true, new c1(l0Var, p1VarD, r0VarCreateFromParcel, listB, queueTitle, iP0, iD0, ((c7.j0) this.f1718h.f968b).f3647a.getExtras()));
    }

    @Override // b7.c0
    public final void k() {
        v3 v3Var = (v3) this.f1725o.f1650b;
        if (v3Var.f2153t) {
            return;
        }
        this.f1726p = s3.f(v3Var, this.f1726p, this.f1727q, this.f1712b.f1708e);
        this.f1727q = SystemClock.elapsedRealtime();
        v3 v3VarB = ((v3) this.f1725o.f1650b).b(1, 0, true);
        b1 b1Var = this.f1725o;
        m(new b1(v3VarB, (f4) b1Var.f1651c, (m4.u0) b1Var.f1652d, (ya.i0) b1Var.f1653e, (Bundle) b1Var.f1654f, (g4) null), null, null);
        if (!h() || ((v3) this.f1725o.f1650b).f2143j.p()) {
            return;
        }
        ((MediaController.TransportControls) this.f1718h.X0().f1208b).play();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(boolean z10, c1 c1Var, boolean z11, final b1 b1Var, Integer num, Integer num2) {
        g4 g4Var;
        final int i10;
        boolean z12;
        ya.i0 i0Var = (ya.i0) b1Var.f1653e;
        c1 c1Var2 = this.f1722l;
        b1 b1Var2 = this.f1725o;
        if (c1Var2 != c1Var) {
            this.f1722l = new c1(c1Var);
        }
        if (z11) {
            this.f1723m = this.f1722l;
        }
        this.f1725o = b1Var;
        d0 d0Var = this.f1712b;
        if (z10) {
            d0Var.a();
            if (((ya.i0) b1Var2.f1653e).equals(i0Var)) {
                return;
            }
            p4.c.i(Looper.myLooper() == d0Var.f1707d.getLooper());
            b0 b0Var = d0Var.f1706c;
            b0Var.x(d0Var, i0Var);
            b0Var.w();
            return;
        }
        v3 v3Var = (v3) b1Var2.f1650b;
        m4.i1 i1Var = v3Var.f2143j;
        v3 v3Var2 = (v3) b1Var.f1650b;
        g4 g4Var2 = (g4) b1Var.f1655g;
        boolean zEquals = i1Var.equals(v3Var2.f2143j);
        final int i11 = 4;
        p4.n nVar = this.f1714d;
        if (!zEquals) {
            nVar.c(0, new p4.k() { // from class: b7.v0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i11) {
                        case 0:
                            w0Var.R(((v3) b1Var.f1650b).f2148o);
                            break;
                        case 1:
                            w0Var.u(((v3) b1Var.f1650b).f2150q);
                            break;
                        case 2:
                            v3 v3Var3 = (v3) b1Var.f1650b;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case 3:
                            w0Var.y((m4.u0) b1Var.f1652d);
                            break;
                        case 4:
                            v3 v3Var4 = (v3) b1Var.f1650b;
                            w0Var.m(v3Var4.f2143j, v3Var4.f2144k);
                            break;
                        case 5:
                            w0Var.f(((v3) b1Var.f1650b).f2146m);
                            break;
                        case 6:
                            w0Var.r(((v3) b1Var.f1650b).f2158y);
                            break;
                        case 7:
                            w0Var.n(4, ((v3) b1Var.f1650b).f2153t);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.U(((v3) b1Var.f1650b).f2155v);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            w0Var.o(((v3) b1Var.f1650b).f2140g);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.d(((v3) b1Var.f1650b).f2141h);
                            break;
                        default:
                            w0Var.t(((v3) b1Var.f1650b).f2142i);
                            break;
                    }
                }
            });
        }
        CharSequence charSequence = c1Var2.f1670e;
        CharSequence charSequence2 = c1Var.f1670e;
        c7.p1 p1Var = c1Var.f1667b;
        int i12 = p4.c0.f16548a;
        boolean zEquals2 = Objects.equals(charSequence, charSequence2);
        final int i13 = 5;
        if (!zEquals2) {
            nVar.c(15, new p4.k() { // from class: b7.v0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i13) {
                        case 0:
                            w0Var.R(((v3) b1Var.f1650b).f2148o);
                            break;
                        case 1:
                            w0Var.u(((v3) b1Var.f1650b).f2150q);
                            break;
                        case 2:
                            v3 v3Var3 = (v3) b1Var.f1650b;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case 3:
                            w0Var.y((m4.u0) b1Var.f1652d);
                            break;
                        case 4:
                            v3 v3Var4 = (v3) b1Var.f1650b;
                            w0Var.m(v3Var4.f2143j, v3Var4.f2144k);
                            break;
                        case 5:
                            w0Var.f(((v3) b1Var.f1650b).f2146m);
                            break;
                        case 6:
                            w0Var.r(((v3) b1Var.f1650b).f2158y);
                            break;
                        case 7:
                            w0Var.n(4, ((v3) b1Var.f1650b).f2153t);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.U(((v3) b1Var.f1650b).f2155v);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            w0Var.o(((v3) b1Var.f1650b).f2140g);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.d(((v3) b1Var.f1650b).f2141h);
                            break;
                        default:
                            w0Var.t(((v3) b1Var.f1650b).f2142i);
                            break;
                    }
                }
            });
        }
        if (num != null) {
            g4Var = g4Var2;
            nVar.c(11, new w0(b1Var2, b1Var, num, 0));
        } else {
            g4Var = g4Var2;
        }
        if (num2 != null) {
            nVar.c(1, new i0(4, b1Var, num2));
        }
        c7.p1 p1Var2 = c1Var2.f1667b;
        boolean z13 = p1Var2 != null && p1Var2.f3687a == 7;
        boolean z14 = p1Var != null && p1Var.f3687a == 7;
        final int i14 = 2;
        final int i15 = 10;
        if (!z13 || !z14 ? z13 != z14 : p1Var2.f3692f != p1Var.f3692f || !TextUtils.equals(p1Var2.f3693g, p1Var.f3693g)) {
            m4.r0 r0VarM = x.m(p1Var);
            nVar.c(10, new j0(i14, r0VarM));
            if (r0VarM != null) {
                nVar.c(10, new j0(3, r0VarM));
            }
        }
        if (c1Var2.f1668c != c1Var.f1668c) {
            nVar.c(14, new androidx.media3.exoplayer.offline.g(i14, this));
        }
        if (v3Var.f2158y != v3Var2.f2158y) {
            final int i16 = 6;
            nVar.c(4, new p4.k() { // from class: b7.v0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i16) {
                        case 0:
                            w0Var.R(((v3) b1Var.f1650b).f2148o);
                            break;
                        case 1:
                            w0Var.u(((v3) b1Var.f1650b).f2150q);
                            break;
                        case 2:
                            v3 v3Var3 = (v3) b1Var.f1650b;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case 3:
                            w0Var.y((m4.u0) b1Var.f1652d);
                            break;
                        case 4:
                            v3 v3Var4 = (v3) b1Var.f1650b;
                            w0Var.m(v3Var4.f2143j, v3Var4.f2144k);
                            break;
                        case 5:
                            w0Var.f(((v3) b1Var.f1650b).f2146m);
                            break;
                        case 6:
                            w0Var.r(((v3) b1Var.f1650b).f2158y);
                            break;
                        case 7:
                            w0Var.n(4, ((v3) b1Var.f1650b).f2153t);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.U(((v3) b1Var.f1650b).f2155v);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            w0Var.o(((v3) b1Var.f1650b).f2140g);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.d(((v3) b1Var.f1650b).f2141h);
                            break;
                        default:
                            w0Var.t(((v3) b1Var.f1650b).f2142i);
                            break;
                    }
                }
            });
        }
        if (v3Var.f2153t != v3Var2.f2153t) {
            i10 = 7;
            nVar.c(5, new p4.k() { // from class: b7.v0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i10) {
                        case 0:
                            w0Var.R(((v3) b1Var.f1650b).f2148o);
                            break;
                        case 1:
                            w0Var.u(((v3) b1Var.f1650b).f2150q);
                            break;
                        case 2:
                            v3 v3Var3 = (v3) b1Var.f1650b;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case 3:
                            w0Var.y((m4.u0) b1Var.f1652d);
                            break;
                        case 4:
                            v3 v3Var4 = (v3) b1Var.f1650b;
                            w0Var.m(v3Var4.f2143j, v3Var4.f2144k);
                            break;
                        case 5:
                            w0Var.f(((v3) b1Var.f1650b).f2146m);
                            break;
                        case 6:
                            w0Var.r(((v3) b1Var.f1650b).f2158y);
                            break;
                        case 7:
                            w0Var.n(4, ((v3) b1Var.f1650b).f2153t);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.U(((v3) b1Var.f1650b).f2155v);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            w0Var.o(((v3) b1Var.f1650b).f2140g);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.d(((v3) b1Var.f1650b).f2141h);
                            break;
                        default:
                            w0Var.t(((v3) b1Var.f1650b).f2142i);
                            break;
                    }
                }
            });
        } else {
            i10 = 7;
        }
        final int i17 = 8;
        if (v3Var.f2155v != v3Var2.f2155v) {
            nVar.c(i10, new p4.k() { // from class: b7.v0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i17) {
                        case 0:
                            w0Var.R(((v3) b1Var.f1650b).f2148o);
                            break;
                        case 1:
                            w0Var.u(((v3) b1Var.f1650b).f2150q);
                            break;
                        case 2:
                            v3 v3Var3 = (v3) b1Var.f1650b;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case 3:
                            w0Var.y((m4.u0) b1Var.f1652d);
                            break;
                        case 4:
                            v3 v3Var4 = (v3) b1Var.f1650b;
                            w0Var.m(v3Var4.f2143j, v3Var4.f2144k);
                            break;
                        case 5:
                            w0Var.f(((v3) b1Var.f1650b).f2146m);
                            break;
                        case 6:
                            w0Var.r(((v3) b1Var.f1650b).f2158y);
                            break;
                        case 7:
                            w0Var.n(4, ((v3) b1Var.f1650b).f2153t);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.U(((v3) b1Var.f1650b).f2155v);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            w0Var.o(((v3) b1Var.f1650b).f2140g);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.d(((v3) b1Var.f1650b).f2141h);
                            break;
                        default:
                            w0Var.t(((v3) b1Var.f1650b).f2142i);
                            break;
                    }
                }
            });
        }
        final int i18 = 9;
        if (!v3Var.f2140g.equals(v3Var2.f2140g)) {
            nVar.c(12, new p4.k() { // from class: b7.v0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i18) {
                        case 0:
                            w0Var.R(((v3) b1Var.f1650b).f2148o);
                            break;
                        case 1:
                            w0Var.u(((v3) b1Var.f1650b).f2150q);
                            break;
                        case 2:
                            v3 v3Var3 = (v3) b1Var.f1650b;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case 3:
                            w0Var.y((m4.u0) b1Var.f1652d);
                            break;
                        case 4:
                            v3 v3Var4 = (v3) b1Var.f1650b;
                            w0Var.m(v3Var4.f2143j, v3Var4.f2144k);
                            break;
                        case 5:
                            w0Var.f(((v3) b1Var.f1650b).f2146m);
                            break;
                        case 6:
                            w0Var.r(((v3) b1Var.f1650b).f2158y);
                            break;
                        case 7:
                            w0Var.n(4, ((v3) b1Var.f1650b).f2153t);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.U(((v3) b1Var.f1650b).f2155v);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            w0Var.o(((v3) b1Var.f1650b).f2140g);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.d(((v3) b1Var.f1650b).f2141h);
                            break;
                        default:
                            w0Var.t(((v3) b1Var.f1650b).f2142i);
                            break;
                    }
                }
            });
        }
        if (v3Var.f2141h != v3Var2.f2141h) {
            nVar.c(8, new p4.k() { // from class: b7.v0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i15) {
                        case 0:
                            w0Var.R(((v3) b1Var.f1650b).f2148o);
                            break;
                        case 1:
                            w0Var.u(((v3) b1Var.f1650b).f2150q);
                            break;
                        case 2:
                            v3 v3Var3 = (v3) b1Var.f1650b;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case 3:
                            w0Var.y((m4.u0) b1Var.f1652d);
                            break;
                        case 4:
                            v3 v3Var4 = (v3) b1Var.f1650b;
                            w0Var.m(v3Var4.f2143j, v3Var4.f2144k);
                            break;
                        case 5:
                            w0Var.f(((v3) b1Var.f1650b).f2146m);
                            break;
                        case 6:
                            w0Var.r(((v3) b1Var.f1650b).f2158y);
                            break;
                        case 7:
                            w0Var.n(4, ((v3) b1Var.f1650b).f2153t);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.U(((v3) b1Var.f1650b).f2155v);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            w0Var.o(((v3) b1Var.f1650b).f2140g);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.d(((v3) b1Var.f1650b).f2141h);
                            break;
                        default:
                            w0Var.t(((v3) b1Var.f1650b).f2142i);
                            break;
                    }
                }
            });
        }
        if (v3Var.f2142i != v3Var2.f2142i) {
            final int i19 = 11;
            nVar.c(9, new p4.k() { // from class: b7.v0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i19) {
                        case 0:
                            w0Var.R(((v3) b1Var.f1650b).f2148o);
                            break;
                        case 1:
                            w0Var.u(((v3) b1Var.f1650b).f2150q);
                            break;
                        case 2:
                            v3 v3Var3 = (v3) b1Var.f1650b;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case 3:
                            w0Var.y((m4.u0) b1Var.f1652d);
                            break;
                        case 4:
                            v3 v3Var4 = (v3) b1Var.f1650b;
                            w0Var.m(v3Var4.f2143j, v3Var4.f2144k);
                            break;
                        case 5:
                            w0Var.f(((v3) b1Var.f1650b).f2146m);
                            break;
                        case 6:
                            w0Var.r(((v3) b1Var.f1650b).f2158y);
                            break;
                        case 7:
                            w0Var.n(4, ((v3) b1Var.f1650b).f2153t);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.U(((v3) b1Var.f1650b).f2155v);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            w0Var.o(((v3) b1Var.f1650b).f2140g);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.d(((v3) b1Var.f1650b).f2141h);
                            break;
                        default:
                            w0Var.t(((v3) b1Var.f1650b).f2142i);
                            break;
                    }
                }
            });
        }
        if (v3Var.f2148o.equals(v3Var2.f2148o)) {
            z12 = false;
        } else {
            z12 = false;
            final Object[] objArr = 0 == true ? 1 : 0;
            nVar.c(20, new p4.k() { // from class: b7.v0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (objArr) {
                        case 0:
                            w0Var.R(((v3) b1Var.f1650b).f2148o);
                            break;
                        case 1:
                            w0Var.u(((v3) b1Var.f1650b).f2150q);
                            break;
                        case 2:
                            v3 v3Var3 = (v3) b1Var.f1650b;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case 3:
                            w0Var.y((m4.u0) b1Var.f1652d);
                            break;
                        case 4:
                            v3 v3Var4 = (v3) b1Var.f1650b;
                            w0Var.m(v3Var4.f2143j, v3Var4.f2144k);
                            break;
                        case 5:
                            w0Var.f(((v3) b1Var.f1650b).f2146m);
                            break;
                        case 6:
                            w0Var.r(((v3) b1Var.f1650b).f2158y);
                            break;
                        case 7:
                            w0Var.n(4, ((v3) b1Var.f1650b).f2153t);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.U(((v3) b1Var.f1650b).f2155v);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            w0Var.o(((v3) b1Var.f1650b).f2140g);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.d(((v3) b1Var.f1650b).f2141h);
                            break;
                        default:
                            w0Var.t(((v3) b1Var.f1650b).f2142i);
                            break;
                    }
                }
            });
        }
        if (!v3Var.f2150q.equals(v3Var2.f2150q)) {
            final int i20 = 1;
            nVar.c(29, new p4.k() { // from class: b7.v0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i20) {
                        case 0:
                            w0Var.R(((v3) b1Var.f1650b).f2148o);
                            break;
                        case 1:
                            w0Var.u(((v3) b1Var.f1650b).f2150q);
                            break;
                        case 2:
                            v3 v3Var3 = (v3) b1Var.f1650b;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case 3:
                            w0Var.y((m4.u0) b1Var.f1652d);
                            break;
                        case 4:
                            v3 v3Var4 = (v3) b1Var.f1650b;
                            w0Var.m(v3Var4.f2143j, v3Var4.f2144k);
                            break;
                        case 5:
                            w0Var.f(((v3) b1Var.f1650b).f2146m);
                            break;
                        case 6:
                            w0Var.r(((v3) b1Var.f1650b).f2158y);
                            break;
                        case 7:
                            w0Var.n(4, ((v3) b1Var.f1650b).f2153t);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.U(((v3) b1Var.f1650b).f2155v);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            w0Var.o(((v3) b1Var.f1650b).f2140g);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.d(((v3) b1Var.f1650b).f2141h);
                            break;
                        default:
                            w0Var.t(((v3) b1Var.f1650b).f2142i);
                            break;
                    }
                }
            });
        }
        if (v3Var.f2151r != v3Var2.f2151r || v3Var.f2152s != v3Var2.f2152s) {
            nVar.c(30, new p4.k() { // from class: b7.v0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i14) {
                        case 0:
                            w0Var.R(((v3) b1Var.f1650b).f2148o);
                            break;
                        case 1:
                            w0Var.u(((v3) b1Var.f1650b).f2150q);
                            break;
                        case 2:
                            v3 v3Var3 = (v3) b1Var.f1650b;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case 3:
                            w0Var.y((m4.u0) b1Var.f1652d);
                            break;
                        case 4:
                            v3 v3Var4 = (v3) b1Var.f1650b;
                            w0Var.m(v3Var4.f2143j, v3Var4.f2144k);
                            break;
                        case 5:
                            w0Var.f(((v3) b1Var.f1650b).f2146m);
                            break;
                        case 6:
                            w0Var.r(((v3) b1Var.f1650b).f2158y);
                            break;
                        case 7:
                            w0Var.n(4, ((v3) b1Var.f1650b).f2153t);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.U(((v3) b1Var.f1650b).f2155v);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            w0Var.o(((v3) b1Var.f1650b).f2140g);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.d(((v3) b1Var.f1650b).f2141h);
                            break;
                        default:
                            w0Var.t(((v3) b1Var.f1650b).f2142i);
                            break;
                    }
                }
            });
        }
        if (!((m4.u0) b1Var2.f1652d).equals((m4.u0) b1Var.f1652d)) {
            final int i21 = 3;
            nVar.c(13, new p4.k() { // from class: b7.v0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i21) {
                        case 0:
                            w0Var.R(((v3) b1Var.f1650b).f2148o);
                            break;
                        case 1:
                            w0Var.u(((v3) b1Var.f1650b).f2150q);
                            break;
                        case 2:
                            v3 v3Var3 = (v3) b1Var.f1650b;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case 3:
                            w0Var.y((m4.u0) b1Var.f1652d);
                            break;
                        case 4:
                            v3 v3Var4 = (v3) b1Var.f1650b;
                            w0Var.m(v3Var4.f2143j, v3Var4.f2144k);
                            break;
                        case 5:
                            w0Var.f(((v3) b1Var.f1650b).f2146m);
                            break;
                        case 6:
                            w0Var.r(((v3) b1Var.f1650b).f2158y);
                            break;
                        case 7:
                            w0Var.n(4, ((v3) b1Var.f1650b).f2153t);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.U(((v3) b1Var.f1650b).f2155v);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            w0Var.o(((v3) b1Var.f1650b).f2140g);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.d(((v3) b1Var.f1650b).f2141h);
                            break;
                        default:
                            w0Var.t(((v3) b1Var.f1650b).f2142i);
                            break;
                    }
                }
            });
        }
        if (!((f4) b1Var2.f1651c).equals((f4) b1Var.f1651c)) {
            d0Var.getClass();
            p4.c.i(Looper.myLooper() == d0Var.f1707d.getLooper());
            d0Var.f1706c.k();
        }
        if (!((ya.i0) b1Var2.f1653e).equals(i0Var)) {
            d0Var.getClass();
            p4.c.i(Looper.myLooper() == d0Var.f1707d.getLooper());
            b0 b0Var2 = d0Var.f1706c;
            b0Var2.x(d0Var, i0Var);
            b0Var2.w();
        }
        if (g4Var != null) {
            d0Var.getClass();
            if (Looper.myLooper() == d0Var.f1707d.getLooper()) {
                z12 = true;
            }
            p4.c.i(z12);
            d0Var.f1706c.getClass();
        }
        nVar.b();
    }

    public final void m(b1 b1Var, Integer num, Integer num2) {
        l(false, this.f1722l, false, b1Var, num, num2);
    }

    @Override // b7.c0
    public final boolean o() {
        return ((v3) this.f1725o.f1650b).f2136c.f1832b;
    }

    @Override // b7.c0
    public final long q() {
        return ((v3) this.f1725o.f1650b).f2136c.f1837g;
    }

    @Override // b7.c0
    public final boolean r() {
        return ((v3) this.f1725o.f1650b).f2153t;
    }

    @Override // b7.c0
    public final void t(m4.i0 i0Var, long j10) {
        K(0, j10, ya.i0.u(i0Var));
    }

    @Override // b7.c0
    public final int u() {
        return G();
    }

    @Override // b7.c0
    public final void v() {
        Integer num;
        Integer num2;
        long j10;
        long j11;
        long j12;
        int i10;
        int iG = G();
        p4.c.c(iG >= 0);
        int iG2 = G();
        m4.i1 i1Var = ((v3) this.f1725o.f1650b).f2143j;
        if ((i1Var.p() || iG < i1Var.o()) && !o()) {
            if (iG != iG2) {
                long jQ = ((b4) ((v3) this.f1725o.f1650b).f2143j).q(iG);
                if (jQ != -1) {
                    ((MediaController.TransportControls) this.f1718h.X0().f1208b).skipToQueueItem(jQ);
                    num = 2;
                } else {
                    q.t0.J(iG, "Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex=", "MCImplLegacy");
                    iG = iG2;
                    num = null;
                }
            } else {
                iG = iG2;
                num = null;
            }
            long jM = M();
            long j13 = 0;
            if (0 == -9223372036854775807L) {
                j13 = jM;
                num2 = null;
            } else {
                ((MediaController.TransportControls) this.f1718h.X0().f1208b).seekTo(0L);
                num2 = 1;
            }
            if (num == null) {
                long j14 = ((v3) this.f1725o.f1650b).f2136c.f1835e;
                long j15 = ((v3) this.f1725o.f1650b).f2136c.f1834d;
                long jMax = j13 < jM ? j13 : Math.max(j13, j14);
                j12 = j15;
                j10 = jMax;
                i10 = j15 == -9223372036854775807L ? 0 : (int) ((100 * jMax) / j15);
                j11 = jMax - j13;
            } else {
                j10 = 0;
                j11 = 0;
                j12 = -9223372036854775807L;
                i10 = 0;
            }
            v3 v3VarE = ((v3) this.f1725o.f1650b).e(new h4(e(iG, !i1Var.p() ? i1Var.m(iG, new m4.h1(), 0L).f14264c : null, j13, false), false, SystemClock.elapsedRealtime(), j12, j10, i10, j11, -9223372036854775807L, j12, j10));
            if (v3VarE.f2158y != 1) {
                v3VarE = v3VarE.c(2, null);
            }
            v3 v3Var = v3VarE;
            b1 b1Var = this.f1725o;
            m(new b1(v3Var, (f4) b1Var.f1651c, (m4.u0) b1Var.f1652d, (ya.i0) b1Var.f1653e, (Bundle) b1Var.f1654f, (g4) null), num2, num);
        }
    }

    @Override // b7.c0
    public final int x() {
        return -1;
    }

    @Override // b7.c0
    public final void z(m4.i0 i0Var) {
        t(i0Var, -9223372036854775807L);
    }
}
