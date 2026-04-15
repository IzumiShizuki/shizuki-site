package b5;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import b0.w1;
import b7.a1;
import b7.a2;
import b7.c2;
import b7.d1;
import b7.h1;
import b7.i4;
import b7.o2;
import b7.p1;
import b7.q3;
import b7.t0;
import b7.t1;
import b7.v1;
import b7.z3;
import c7.e1;
import c7.i0;
import c7.j0;
import c7.k1;
import c7.w0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import hf.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import m4.f1;
import m4.i1;
import m4.u1;
import r.y1;
import v4.u0;
import v4.y0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1551c;

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.f1549a = i10;
        this.f1550b = obj;
        this.f1551c = obj2;
    }

    private final void a() {
        p5.y yVar = (p5.y) this.f1550b;
        v4.f fVar = (v4.f) this.f1551c;
        synchronized (fVar) {
        }
        v4.s sVar = yVar.f16768c;
        int i10 = p4.c0.f16548a;
        w4.d dVar = sVar.f22626a.f22689s;
        w4.a aVarW = dVar.W((j5.d0) dVar.f23352d.f1654f);
        dVar.a0(aVarW, 1020, new androidx.media3.exoplayer.offline.g(aVarW, fVar));
    }

    private final void b() {
        p5.y yVar = (p5.y) this.f1550b;
        synchronized (((v4.f) this.f1551c)) {
        }
        v4.s sVar = yVar.f16768c;
        int i10 = p4.c0.f16548a;
        w4.d dVar = sVar.f22626a.f22689s;
        dVar.a0(dVar.W((j5.d0) dVar.f23352d.f1654f), 1013, new w4.b(22));
    }

    @Override // java.lang.Runnable
    public final void run() throws h0 {
        i4 i4Var;
        long j10;
        boolean z10;
        boolean z11 = true;
        switch (this.f1549a) {
            case 0:
                i iVar = (i) this.f1550b;
                m4.q qVar = (m4.q) this.f1551c;
                j jVar = iVar.f1555d;
                if (jVar.f1570o == 0 || iVar.f1554c) {
                    return;
                }
                Looper looper = jVar.f1574s;
                looper.getClass();
                iVar.f1553b = jVar.b(looper, iVar.f1552a, qVar, false);
                jVar.f1568m.add(iVar);
                return;
            case 1:
                d1 d1Var = (d1) this.f1550b;
                androidx.media3.exoplayer.offline.u uVar = new androidx.media3.exoplayer.offline.u(d1Var.f1711a, (c7.d1) this.f1551c);
                d1Var.f1718h = uVar;
                a1 a1Var = d1Var.f1715e;
                Handler handler = d1Var.f1712b.f1707d;
                if (a1Var == null) {
                    throw new IllegalArgumentException("callback must not be null");
                }
                if (!((Set) uVar.f969c).add(a1Var)) {
                    Log.w("MediaControllerCompat", "the callback has already been registered");
                    return;
                }
                if (handler == null) {
                    handler = new Handler();
                }
                a1Var.j(handler);
                j0 j0Var = (j0) uVar.f968b;
                MediaController mediaController = j0Var.f3647a;
                c7.h0 h0Var = a1Var.f1618a;
                h0Var.getClass();
                mediaController.registerCallback(h0Var, handler);
                synchronized (j0Var.f3648b) {
                    c7.h hVarA = j0Var.f3651e.a();
                    if (hVarA != null) {
                        i0 i0Var = new i0(a1Var);
                        j0Var.f3650d.put(a1Var, i0Var);
                        a1Var.f1620c = i0Var;
                        try {
                            hVarA.J(i0Var);
                            a1Var.i(13, null, null);
                        } catch (RemoteException e10) {
                            Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                        }
                    } else {
                        a1Var.f1620c = null;
                        j0Var.f3649c.add(a1Var);
                    }
                    break;
                }
                return;
            case 2:
                t0 t0Var = (t0) this.f1550b;
                h1 h1Var = (h1) this.f1551c;
                if (t0Var.f2081m) {
                    return;
                }
                h1Var.c(t0Var);
                return;
            case 3:
                c2 c2Var = (c2) this.f1550b;
                Runnable runnable = (Runnable) this.f1551c;
                c2Var.getClass();
                runnable.run();
                return;
            case 4:
                ((cb.e0) this.f1551c).k(Boolean.valueOf(((c2) this.f1550b).n()));
                return;
            case 5:
                c2 c2Var2 = (c2) this.f1550b;
                z3 z3Var = (z3) this.f1551c;
                o2 o2Var = c2Var2.f1681h;
                c2Var2.f1693t = z3Var;
                a2 a2Var = new a2(c2Var2, z3Var);
                z3Var.r0();
                ((v4.v) z3Var.f2227a).f22683m.a(new m4.r(z3Var, a2Var));
                c2Var2.f1695v = a2Var;
                try {
                    o2Var.f2010i.m(0, z3Var);
                    break;
                } catch (RemoteException e11) {
                    p4.c.o("MediaSessionImpl", "Exception in using media1 API", e11);
                }
                e1 e1Var = o2Var.f2012k;
                ((w0) e1Var.f3618b).f3739a.setActive(true);
                Iterator it = ((ArrayList) e1Var.f3620d).iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                c2Var2.f1692s = z3Var.e();
                c2Var2.e(z3Var.m());
                return;
            case 6:
                cb.v vVar = (cb.v) this.f1550b;
                ResultReceiver resultReceiver = (ResultReceiver) this.f1551c;
                try {
                    i4Var = (i4) vVar.f3882a;
                    p4.c.g(i4Var, "SessionResult must not be null");
                    break;
                } catch (InterruptedException e12) {
                    e = e12;
                    p4.c.C("MediaSessionLegacyStub", "Custom command failed", e);
                    i4Var = new i4(-1);
                } catch (CancellationException e13) {
                    p4.c.C("MediaSessionLegacyStub", "Custom command cancelled", e13);
                    i4Var = new i4(1);
                } catch (ExecutionException e14) {
                    e = e14;
                    p4.c.C("MediaSessionLegacyStub", "Custom command failed", e);
                    i4Var = new i4(-1);
                }
                resultReceiver.send(i4Var.f1866a, i4Var.f1867b);
                return;
            case 7:
                c2 c2Var3 = (c2) this.f1550b;
                Intent intent = (Intent) this.f1551c;
                t1 t1VarD = c2Var3.d();
                if (t1VarD == null) {
                    ComponentName component = intent.getComponent();
                    t1VarD = new t1(new k1(-1, -1, component != null ? component.getPackageName() : "androidx.media3.session.MediaSessionService"), 1006000001, 7, false, null, Bundle.EMPTY);
                }
                if (c2Var3.m(t1VarD, intent)) {
                    return;
                }
                p4.c.l("MSessionService", "Ignored unrecognized media button intent.");
                return;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                p1 p1Var = (p1) this.f1550b;
                v1 v1Var = (v1) this.f1551c;
                cb.y yVar = (cb.y) p1Var.f2028g.remove(v1Var);
                if (yVar != null && !yVar.cancel(false)) {
                    try {
                        ((b7.d0) g8.a.B(yVar)).d();
                    } catch (CancellationException | ExecutionException e15) {
                        p4.c.C("MediaController", "MediaController future failed (so we couldn't release it)", e15);
                    }
                }
                v1Var.f2118a.f1696w = null;
                return;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                q3 q3Var = (q3) this.f1550b;
                b7.r rVar = (b7.r) this.f1551c;
                w1 w1Var = q3Var.f2047g;
                t1 t1VarM = w1Var.M(rVar.asBinder());
                if (t1VarM != null) {
                    w1Var.a0(t1VarM);
                    return;
                }
                return;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                ((q3) this.f1550b).f2047g.F((t1) this.f1551c);
                return;
            case 11:
                ((e5.b) ((c5.k) ((c5.q) this.f1550b).f3528c.f1208b).f3480b.f6159d.get(((c5.j) this.f1551c).f3465m)).c(true);
                return;
            case 12:
                d.n nVar = (d.n) this.f1550b;
                nVar.f14026a.W0(new d.f((d.j0) this.f1551c, nVar));
                return;
            case 13:
                e5.b bVar = (e5.b) this.f1550b;
                Uri uri = (Uri) this.f1551c;
                bVar.f6151i = false;
                bVar.d(uri);
                return;
            case 14:
                ((p4.g) this.f1550b).accept(this.f1551c);
                return;
            case 15:
                ((j5.t0) this.f1550b).E((r5.b0) this.f1551c);
                return;
            case 16:
                ((hf.k) this.f1550b).E((jf.d) this.f1551c);
                return;
            case 17:
                gh.g.u((l1.c) this.f1550b, (LongSparseArray) this.f1551c);
                return;
            case 18:
                Runnable runnable2 = (Runnable) this.f1550b;
                n7.y yVar2 = (n7.y) this.f1551c;
                try {
                    runnable2.run();
                    return;
                } finally {
                    yVar2.a();
                }
            case 19:
                ((n5.g) this.f1551c).a(((p4.p) this.f1550b).c());
                return;
            case 20:
                cb.e0 e0Var = (cb.e0) this.f1550b;
                cb.y yVar3 = (cb.y) this.f1551c;
                if (e0Var.f3872a instanceof cb.a) {
                    yVar3.cancel(false);
                    return;
                }
                return;
            case 21:
                ((p5.c) ((m0.w) this.f1550b).f13783c).f16641g.getClass();
                return;
            case 22:
                p5.y yVar4 = (p5.y) this.f1550b;
                u1 u1Var = (u1) this.f1551c;
                v4.s sVar = yVar4.f16768c;
                int i10 = p4.c0.f16548a;
                v4.v vVar2 = sVar.f22626a;
                vVar2.r0 = u1Var;
                vVar2.f22683m.e(25, new v4.r(u1Var));
                return;
            case 23:
                a();
                return;
            case 24:
                q5.k kVar = (q5.k) this.f1550b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f1551c;
                SurfaceTexture surfaceTexture2 = kVar.f17834g;
                Surface surface = kVar.f17835h;
                Surface surface2 = new Surface(surfaceTexture);
                kVar.f17834g = surfaceTexture;
                kVar.f17835h = surface2;
                Iterator it2 = kVar.f17828a.iterator();
                while (it2.hasNext()) {
                    ((v4.s) it2.next()).f22626a.f2(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 25:
                ((qf.e) ((qf.f) this.f1550b)).g((qf.b) this.f1551c, ub.a0.f21526a);
                return;
            case 26:
                v4.v vVar3 = (v4.v) this.f1550b;
                v4.z zVar = (v4.z) this.f1551c;
                int i11 = vVar3.F - zVar.f22726a;
                vVar3.F = i11;
                if (zVar.f22728c) {
                    vVar3.G = zVar.f22729d;
                    vVar3.H = true;
                }
                if (i11 == 0) {
                    i1 i1Var = ((u0) zVar.f22730e).f22652a;
                    if (!vVar3.f22692t0.f22652a.p() && i1Var.p()) {
                        vVar3.f22694u0 = -1;
                        vVar3.f22696v0 = 0L;
                    }
                    if (!i1Var.p()) {
                        List listAsList = Arrays.asList(((y0) i1Var).f22723k);
                        p4.c.i(listAsList.size() == vVar3.f22686p.size());
                        for (int i12 = 0; i12 < listAsList.size(); i12++) {
                            ((v4.u) vVar3.f22686p.get(i12)).f22650c = (i1) listAsList.get(i12);
                        }
                    }
                    long j11 = -9223372036854775807L;
                    if (vVar3.H) {
                        if (((u0) zVar.f22730e).f22653b.equals(vVar3.f22692t0.f22653b) && ((u0) zVar.f22730e).f22655d == vVar3.f22692t0.f22670s) {
                            z11 = false;
                        }
                        if (z11) {
                            if (i1Var.p() || ((u0) zVar.f22730e).f22653b.b()) {
                                j11 = ((u0) zVar.f22730e).f22655d;
                            } else {
                                u0 u0Var = (u0) zVar.f22730e;
                                j5.d0 d0Var = u0Var.f22653b;
                                long j12 = u0Var.f22655d;
                                Object obj = d0Var.f10245a;
                                f1 f1Var = vVar3.f22685o;
                                i1Var.g(obj, f1Var);
                                j11 = j12 + f1Var.f14205e;
                            }
                        }
                        z10 = z11;
                        j10 = j11;
                    } else {
                        j10 = -9223372036854775807L;
                        z10 = false;
                    }
                    vVar3.H = false;
                    vVar3.k2((u0) zVar.f22730e, 1, z10, vVar3.G, j10, -1, false);
                    return;
                }
                return;
            case 27:
                b();
                return;
            default:
                y1 y1Var = (y1) this.f1550b;
                r5.c cVar = (r5.c) this.f1551c;
                p5.y yVar5 = ((x4.x) y1Var.f18634b).T0;
                Handler handler2 = yVar5.f16767b;
                if (handler2 != null) {
                    handler2.post(new x4.g(yVar5, cVar, 9));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ h(c2 c2Var, t1 t1Var, Runnable runnable) {
        this.f1549a = 3;
        this.f1550b = c2Var;
        this.f1551c = runnable;
    }
}
