package e;

import android.os.Build;
import androidx.media3.exoplayer.offline.m;
import com.cnl.kikoeru.MainApplication;
import com.cnl.kikoeru.R;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.beta.tinker.TinkerReport;
import hd.q0;
import j5.o;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.Executors;
import ka.n;
import p4.c0;
import pc.f0;
import q1.n0;
import q1.q;
import r.y1;
import t4.u;
import t4.y;
import u3.x0;
import ub.a0;
import ub.p;
import ug.x;
import v4.v;
import w1.g0;
import x0.o2;
import x0.z;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6022a;

    public /* synthetic */ e(int i10) {
        this.f6022a = i10;
    }

    @Override // ic.a
    public final Object b() {
        t4.e eVar;
        int i10 = this.f6022a;
        int i11 = 2;
        Object objB = a0.f21526a;
        boolean z10 = false;
        switch (i10) {
            case 0:
                z zVar = f.f6023a;
                return null;
            case 1:
                z zVar2 = g.f6024a;
                return null;
            case 2:
                return ((Boolean) h9.d.f8244d.getValue()).booleanValue() ? n7.e.u() : nh.a.r();
            case 3:
                int iIntValue = ((Number) h9.d.f8245e.getValue()).intValue();
                if (iIntValue == 0) {
                    w1.f fVar = nd.h.f15788b;
                    if (fVar != null) {
                        return fVar;
                    }
                    w1.e eVar2 = new w1.e("Filled.Dehaze", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i12 = g0.f23208a;
                    n0 n0Var = new n0(q.f17569b);
                    q0 q0Var = new q0((byte) 0, 6);
                    q0Var.u(2.0f, 15.5f);
                    q0Var.z(2.0f);
                    q0Var.r(20.0f);
                    q0Var.z(-2.0f);
                    q0Var.s(2.0f, 15.5f);
                    q0Var.l();
                    q0Var.u(2.0f, 10.5f);
                    q0Var.z(2.0f);
                    q0Var.r(20.0f);
                    q0Var.z(-2.0f);
                    q0Var.s(2.0f, 10.5f);
                    q0Var.l();
                    q0Var.u(2.0f, 5.5f);
                    q0Var.z(2.0f);
                    q0Var.r(20.0f);
                    q0Var.z(-2.0f);
                    q0Var.s(2.0f, 5.5f);
                    q0Var.l();
                    w1.e.a(eVar2, q0Var.f8447b, 0, n0Var);
                    w1.f fVarB = eVar2.b();
                    nd.h.f15788b = fVarB;
                    return fVarB;
                }
                if (iIntValue != 1) {
                    if (iIntValue != 2) {
                        throw new IllegalStateException("never happen repeatMode else");
                    }
                    w1.f fVar2 = n7.e.f15467i;
                    if (fVar2 != null) {
                        return fVar2;
                    }
                    w1.e eVar3 = new w1.e("Filled.Repeat", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i13 = g0.f23208a;
                    n0 n0Var2 = new n0(q.f17569b);
                    q0 q0Var2 = new q0((byte) 0, 6);
                    q0Var2.u(7.0f, 7.0f);
                    q0Var2.r(10.0f);
                    q0Var2.z(3.0f);
                    q0Var2.t(4.0f, -4.0f);
                    q0Var2.t(-4.0f, -4.0f);
                    q0Var2.z(3.0f);
                    q0Var2.s(5.0f, 5.0f);
                    q0Var2.z(6.0f);
                    q0Var2.r(2.0f);
                    q0Var2.s(7.0f, 7.0f);
                    q0Var2.l();
                    q0Var2.u(17.0f, 17.0f);
                    q0Var2.s(7.0f, 17.0f);
                    q0Var2.z(-3.0f);
                    q0Var2.t(-4.0f, 4.0f);
                    q0Var2.t(4.0f, 4.0f);
                    q0Var2.z(-3.0f);
                    q0Var2.r(12.0f);
                    q0Var2.z(-6.0f);
                    q0Var2.r(-2.0f);
                    q0Var2.z(4.0f);
                    q0Var2.l();
                    w1.e.a(eVar3, q0Var2.f8447b, 0, n0Var2);
                    w1.f fVarB2 = eVar3.b();
                    n7.e.f15467i = fVarB2;
                    return fVarB2;
                }
                w1.f fVar3 = x0.f21354l;
                if (fVar3 != null) {
                    return fVar3;
                }
                w1.e eVar4 = new w1.e("Filled.RepeatOne", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i14 = g0.f23208a;
                n0 n0Var3 = new n0(q.f17569b);
                q0 q0Var3 = new q0((byte) 0, 6);
                q0Var3.u(7.0f, 7.0f);
                q0Var3.r(10.0f);
                q0Var3.z(3.0f);
                q0Var3.t(4.0f, -4.0f);
                q0Var3.t(-4.0f, -4.0f);
                q0Var3.z(3.0f);
                q0Var3.s(5.0f, 5.0f);
                q0Var3.z(6.0f);
                q0Var3.r(2.0f);
                q0Var3.s(7.0f, 7.0f);
                q0Var3.l();
                q0Var3.u(17.0f, 17.0f);
                q0Var3.s(7.0f, 17.0f);
                q0Var3.z(-3.0f);
                q0Var3.t(-4.0f, 4.0f);
                q0Var3.t(4.0f, 4.0f);
                q0Var3.z(-3.0f);
                q0Var3.r(12.0f);
                q0Var3.z(-6.0f);
                q0Var3.r(-2.0f);
                q0Var3.z(4.0f);
                q0Var3.l();
                q0Var3.u(13.0f, 15.0f);
                q0Var3.s(13.0f, 9.0f);
                q0Var3.r(-1.0f);
                q0Var3.t(-2.0f, 1.0f);
                q0Var3.z(1.0f);
                q0Var3.r(1.5f);
                q0Var3.z(4.0f);
                q0Var3.s(13.0f, 15.0f);
                q0Var3.l();
                w1.e.a(eVar4, q0Var3.f8447b, 0, n0Var3);
                w1.f fVarB3 = eVar4.b();
                x0.f21354l = fVarB3;
                return fVarB3;
            case 4:
                int iIntValue2 = ((Number) h9.d.f8245e.getValue()).intValue();
                if (iIntValue2 == 0) {
                    i11 = 1;
                } else if (iIntValue2 != 1) {
                    if (iIntValue2 != 2) {
                        throw new IllegalStateException("never happen repeatMode else");
                    }
                    i11 = 0;
                }
                ((v) h9.d.c()).e2(i11);
                return objB;
            case 5:
                if (((androidx.lifecycle.q) h9.d.c()).j1()) {
                    ((androidx.lifecycle.q) h9.d.c()).v1();
                } else {
                    n.c(na.q.g(R.string.no_prev_media), 0L, null, null, 511);
                }
                return objB;
            case 6:
                h9.d.f(!((androidx.lifecycle.q) h9.d.c()).o1());
                return objB;
            case 7:
                if (((androidx.lifecycle.q) h9.d.c()).i1()) {
                    ((androidx.lifecycle.q) h9.d.c()).t1();
                } else {
                    n.c(na.q.g(R.string.no_next_media), 0L, null, null, 511);
                }
                return objB;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                fa.v vVar = fa.v.f7039a;
                fa.v.f7046h.setValue(Boolean.FALSE);
                return objB;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                j9.d.f10668a.getClass();
                if (j9.d.f10672e) {
                    j9.d.d(a9.i.a());
                } else if (j9.d.c(a9.i.a())) {
                    j9.d.b(a9.i.a());
                }
                return objB;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                fa.v vVar2 = fa.v.f7039a;
                fa.v.f7046h.setValue(Boolean.TRUE);
                return objB;
            case 11:
                fa.v vVar3 = fa.v.f7039a;
                fa.v.f7043e.setValue(Boolean.TRUE);
                return objB;
            case 12:
                mc.a aVar = mc.d.f15096a;
                return Integer.valueOf(mc.d.f15096a.d().nextInt(2147418112) + 65536);
            case 13:
                return new g1.e(new LinkedHashMap());
            case 14:
                o2 o2Var = g1.i.f7146a;
                return null;
            case 15:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 16:
                return lc.b.G("server", "https://api.asmr-300.com", gg.c.a(), false, jc.z.a(String.class));
            case 17:
                return lc.b.G("username", "", gg.c.a(), false, jc.z.a(String.class));
            case 18:
                String str = Build.MANUFACTURER;
                jc.l.d(str, "MANUFACTURER");
                return Boolean.valueOf(ef.n.n0(str, "huawei", true));
            case 19:
                return new androidx.lifecycle.q0();
            case 20:
                i4.d dVar = new i4.d(0);
                dVar.a(jc.z.f10839a.b(h7.b.class), new g1.d(4));
                return dVar.b();
            case 21:
                return new x();
            case 22:
                p pVar = i9.g.f9477a;
                m mVar = new m(a9.i.a(), (r4.b) i9.g.f9478b.getValue(), (y) i9.g.f9479c.getValue(), (i9.e) i9.g.f9477a.getValue(), Executors.newFixedThreadPool(6));
                try {
                    Field declaredField = m.class.getDeclaredField("listeners");
                    i9.b bVar = new i9.b();
                    declaredField.setAccessible(true);
                    declaredField.set(mVar, bVar);
                    break;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                return mVar;
            case 23:
                g1.d dVar2 = i9.n.f9487a;
                v4.j.a("bufferForPlaybackMs", 2500, 0, "0");
                v4.j.a("bufferForPlaybackAfterRebufferMs", 5000, 0, "0");
                v4.j.a("minBufferMs", 30000, 2500, "bufferForPlaybackMs");
                v4.j.a("minBufferMs", 30000, 5000, "bufferForPlaybackAfterRebufferMs");
                v4.j.a("maxBufferMs", BuglyStrategy.a.MAX_USERDATA_VALUE_LENGTH, 30000, "minBufferMs");
                v4.j jVar = new v4.j(new n5.f(), 30000, BuglyStrategy.a.MAX_USERDATA_VALUE_LENGTH, 2500, 5000, true);
                v4.n nVar = new v4.n(a9.i.a());
                MainApplication mainApplicationA = a9.i.a();
                jc.l.e(mainApplicationA, "context");
                i9.h hVar = new i9.h(mainApplicationA);
                p4.c.i(!nVar.f22598t);
                nVar.f22581c = new o(3, hVar);
                p pVar2 = i9.g.f9477a;
                File file = new File(a9.i.a().getCacheDir(), "media");
                if (((Number) f0.P(gg.c.a(), "mediaCacheSizeMB", 2000, jc.z.a(Integer.TYPE)).a()).intValue() == 0) {
                    eVar = (t4.e) i9.g.f9480d.getValue();
                } else {
                    p pVar3 = na.q.f15736a;
                    u uVar = new u(r3 * 1048576);
                    MainApplication mainApplicationA2 = a9.i.a();
                    jc.l.e(mainApplicationA2, "context");
                    y yVar = new y(file, uVar, new i9.i(mainApplicationA2, "exoplayer_music_cache.db", null, 1));
                    y1 y1Var = new y1(8, z10);
                    y1Var.f18634b = yVar;
                    t4.e eVar5 = new t4.e();
                    eVar5.f20418a = yVar;
                    eVar5.f20422e = (t4.e) i9.g.f9480d.getValue();
                    eVar5.f20420c = y1Var;
                    eVar5.f20421d = false;
                    eVar5.f20423f = 2;
                    eVar = eVar5;
                }
                j5.q qVar = new j5.q(a9.i.a());
                qVar.f10386b = eVar;
                d0.y yVar2 = qVar.f10385a;
                if (eVar != ((s4.g) yVar2.f5434e)) {
                    yVar2.f5434e = eVar;
                    ((HashMap) yVar2.f5432c).clear();
                    ((HashMap) yVar2.f5433d).clear();
                }
                p4.c.i(!nVar.f22598t);
                nVar.f22582d = new o(2, qVar);
                p4.c.i(!nVar.f22598t);
                nVar.f22584f = new o(1, jVar);
                p4.c.i(!nVar.f22598t);
                nVar.f22598t = true;
                int i15 = c0.f16548a;
                v vVar4 = new v(nVar);
                i9.l lVar = new i9.l(vVar4);
                p4.n nVar2 = vVar4.f22683m;
                nVar2.a(lVar);
                nVar2.a(new i9.m());
                if (h9.d.f8241a.getValue() == null) {
                    i9.o.f9489a.getClass();
                    if (i9.o.b().length() != 0) {
                        try {
                            i9.o.c(vVar4);
                        } catch (Throwable th2) {
                            objB = ub.a.b(th2);
                        }
                        if (ub.n.a(objB) != null) {
                            i9.o.f9489a.getClass();
                            hg.b bVar2 = i9.o.f9491c;
                            pc.u[] uVarArr = i9.o.f9490b;
                            bVar2.e("", uVarArr[0]);
                            i9.o.f9492d.e(0, uVarArr[1]);
                            i9.o.f9493e.e("", uVarArr[2]);
                        }
                    }
                    break;
                }
                return vVar4;
            case 24:
                o2 o2Var2 = i1.d.f8640a;
                return null;
            case 25:
                o2 o2Var3 = i1.f.f8642a;
                return null;
            case 26:
                return null;
            case 27:
                return new s4.o();
            case 28:
                return new i9.e();
            default:
                return new r4.b(a9.i.a().getApplicationContext(), "exoplayer_internal.db", null, 1);
        }
    }
}
