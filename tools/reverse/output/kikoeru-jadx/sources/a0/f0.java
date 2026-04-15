package a0;

import android.content.res.Resources;
import android.os.CancellationSignal;
import android.view.MotionEvent;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import b0.v0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import d0.l0;
import g2.n1;
import h0.p1;
import i2.c2;
import i2.e2;
import i2.g1;
import i7.k2;
import i7.p2;
import j2.v1;
import j2.w1;
import j2.y1;
import java.util.Map;
import l0.k0;
import lf.o0;
import u.k1;
import x0.a1;
import x0.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i10, Object obj) {
        super(1);
        this.f36b = i10;
        this.f37c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v31, types: [g2.g1, i2.a] */
    @Override // ic.k
    public final Object a(Object obj) {
        t tVar;
        c0.o oVar;
        switch (this.f36b) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                g0 g0Var = (g0) this.f37c;
                float f10 = -fFloatValue;
                if ((f10 >= 0.0f || g0Var.d()) && (f10 <= 0.0f || g0Var.c())) {
                    if (Math.abs(g0Var.f48g) > 0.5f) {
                        x.a.c("entered drag with non-zero pending scroll");
                    }
                    float f11 = g0Var.f48g + f10;
                    g0Var.f48g = f11;
                    if (Math.abs(f11) > 0.5f) {
                        float f12 = g0Var.f48g;
                        int iRound = Math.round(f12);
                        t tVarA = ((t) g0Var.f46e.getValue()).a(iRound, !g0Var.f43b);
                        if (tVarA != null && (tVar = g0Var.f44c) != null) {
                            t tVarA2 = tVar.a(iRound, true);
                            if (tVarA2 != null) {
                                g0Var.f44c = tVarA2;
                            } else {
                                tVarA = null;
                            }
                        }
                        if (tVarA != null) {
                            g0Var.f(tVarA, g0Var.f43b, true);
                            g0Var.f62u.setValue(ub.a0.f21526a);
                            g0Var.h(f12 - g0Var.f48g, tVarA);
                        } else {
                            i2.j0 j0Var = g0Var.f51j;
                            if (j0Var != null) {
                                j0Var.k();
                            }
                            g0Var.h(f12 - g0Var.f48g, g0Var.g());
                        }
                    }
                    if (Math.abs(g0Var.f48g) > 0.5f) {
                        f10 -= g0Var.f48g;
                        g0Var.f48g = 0.0f;
                    }
                } else {
                    f10 = 0.0f;
                }
                return Float.valueOf(-f10);
            case 1:
                return new b0.h0(0, (b0.j0) this.f37c);
            case 2:
                return new b0.h0(2, (v0) this.f37c);
            case 3:
                g1.g gVar = (g1.g) this.f37c;
                return Boolean.valueOf(gVar != null ? gVar.b(obj) : true);
            case 4:
                ((Number) obj).intValue();
                return (c0.c0) this.f37c;
            case 5:
                float fFloatValue2 = ((Number) obj).floatValue();
                c0.z zVar = (c0.z) this.f37c;
                float f13 = -fFloatValue2;
                e1 e1Var = zVar.f3183d;
                if ((f13 >= 0.0f || zVar.d()) && (f13 <= 0.0f || zVar.c())) {
                    if (Math.abs(zVar.f3194o) > 0.5f) {
                        x.a.c("entered drag with non-zero pending scroll");
                    }
                    float f14 = zVar.f3194o + f13;
                    zVar.f3194o = f14;
                    if (Math.abs(f14) > 0.5f) {
                        float f15 = zVar.f3194o;
                        int iR = lc.b.R(f15);
                        c0.o oVarA = ((c0.o) e1Var.getValue()).a(iR, !zVar.f3180a);
                        if (oVarA != null && (oVar = zVar.f3181b) != null) {
                            c0.o oVarA2 = oVar.a(iR, true);
                            if (oVarA2 != null) {
                                zVar.f3181b = oVarA2;
                            } else {
                                oVarA = null;
                            }
                        }
                        if (oVarA != null) {
                            zVar.f(oVarA, zVar.f3180a, true);
                            zVar.f3200u.setValue(ub.a0.f21526a);
                            zVar.h(f15 - zVar.f3194o, oVarA);
                        } else {
                            i2.j0 j0Var2 = zVar.f3187h;
                            if (j0Var2 != null) {
                                j0Var2.k();
                            }
                            zVar.h(f15 - zVar.f3194o, (c0.o) e1Var.getValue());
                        }
                    }
                    if (Math.abs(zVar.f3194o) > 0.5f) {
                        f13 -= zVar.f3194o;
                        zVar.f3194o = 0.0f;
                    }
                } else {
                    f13 = 0.0f;
                }
                return Float.valueOf(-f13);
            case 6:
                ((c2.a0) ((c2.z) this.f37c).h()).a((MotionEvent) obj);
                return ub.a0.f21526a;
            case 7:
                Throwable th2 = (Throwable) obj;
                c2.i0 i0Var = (c2.i0) this.f37c;
                hf.k kVar = i0Var.f3284c;
                if (kVar != null) {
                    kVar.t(th2);
                }
                i0Var.f3284c = null;
                return ub.a0.f21526a;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                ((cg.b0) this.f37c).a(Float.valueOf(((Number) obj).floatValue()));
                return ub.a0.f21526a;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                float fFloatValue3 = ((Number) obj).floatValue();
                d0.d dVar = ((l0) this.f37c).f5369b;
                dVar.f5326s.f(dVar.i(dVar.j() + lc.b.R(dVar.n() != 0 ? fFloatValue3 / dVar.n() : 0.0f)));
                return ub.a0.f21526a;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                jc.l.e((x0.f0) obj, "$this$DisposableEffect");
                eg.e eVar = (eg.e) this.f37c;
                eVar.enable();
                return new b0.h0(7, eVar);
            case 11:
                ((q2.k) obj).l(k0.f11522c, new l0.j0(h0.h0.f7646a, ((l0.o) this.f37c).b(), l0.i0.f11501b, true));
                return ub.a0.f21526a;
            case 12:
                float[] fArr = ((q1.a0) obj).f17489a;
                g2.c0 c0Var = (g2.c0) this.f37c;
                if (c0Var.h()) {
                    n1.i(c0Var).f(c0Var, fArr);
                }
                return ub.a0.f21526a;
            case 13:
                float fFloatValue4 = ((Number) obj).floatValue();
                p1 p1Var = (p1) this.f37c;
                a1 a1Var = p1Var.f7802a;
                float fE = a1Var.e() + fFloatValue4;
                a1 a1Var2 = p1Var.f7803b;
                if (fE > a1Var2.e()) {
                    fFloatValue4 = a1Var2.e() - a1Var.e();
                } else if (fE < 0.0f) {
                    fFloatValue4 = -a1Var.e();
                }
                a1Var.f(a1Var.e() + fFloatValue4);
                return Float.valueOf(fFloatValue4);
            case 14:
                i2.a aVar = (i2.a) obj;
                i2.k0 k0Var = (i2.k0) this.f37c;
                if (aVar.F()) {
                    if (aVar.i().f8773b) {
                        aVar.D();
                    }
                    for (Map.Entry entry : aVar.i().f8780i.entrySet()) {
                        i2.k0.a(k0Var, (g2.t) entry.getKey(), ((Number) entry.getValue()).intValue(), aVar.d());
                    }
                    g1 g1Var = aVar.d().f8704s;
                    jc.l.b(g1Var);
                    while (!g1Var.equals(k0Var.f8772a.d())) {
                        for (g2.t tVar2 : k0Var.b(g1Var).keySet()) {
                            i2.k0.a(k0Var, tVar2, k0Var.c(g1Var, tVar2), g1Var);
                        }
                        g1Var = g1Var.f8704s;
                        jc.l.b(g1Var);
                    }
                }
                return ub.a0.f21526a;
            case 15:
                ((i2.j0) this.f37c).d0((f3.c) obj);
                return ub.a0.f21526a;
            case 16:
                ((o0) ((ch.l) this.f37c).f4202c).j(null);
                return ub.a0.f21526a;
            case 17:
                ((k2) this.f37c).f9183a.l(null, false);
                return ub.a0.f21526a;
            case 18:
                ((j0.r) this.f37c).a((y2.g) obj);
                return ub.a0.f21526a;
            case 19:
                return Boolean.valueOf(((o.m) this.f37c).a(((q2.o) obj).f17642g));
            case 20:
                return Boolean.valueOf(j2.l0.m((q2.o) obj, (Resources) this.f37c));
            case 21:
                return new b0.h0(9, (j2.p1) this.f37c);
            case 22:
                boolean zCompareAndSet = v1.f10065b.compareAndSet(false, true);
                ub.a0 a0Var = ub.a0.f21526a;
                if (zCompareAndSet) {
                    ((kf.f) this.f37c).e(a0Var);
                }
                return a0Var;
            case 23:
                s1.d dVar2 = (s1.d) obj;
                w1 w1Var = (w1) this.f37c;
                q1.o oVarZ = dVar2.S().z();
                ic.n nVar = w1Var.f10070d;
                if (nVar != null) {
                    nVar.q(oVarZ, (t1.b) dVar2.S().f3619c);
                }
                return ub.a0.f21526a;
            case 24:
                y2.l lVar = (y2.l) obj;
                j0.r rVar = lVar.f25418b;
                if (rVar != null) {
                    lVar.a(rVar);
                    lVar.f25418b = null;
                }
                y1 y1Var = (y1) this.f37c;
                z0.e eVar2 = y1Var.f10103d;
                Object[] objArr = eVar2.f26372a;
                int i10 = eVar2.f26374c;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        i11 = -1;
                    } else if (!jc.l.a((e2) objArr[i11], lVar)) {
                        i11++;
                    }
                }
                if (i11 >= 0) {
                    eVar2.k(i11);
                }
                if (eVar2.f26374c == 0) {
                    y1Var.f10101b.b();
                }
                return ub.a0.f21526a;
            case 25:
                m1.d dVar3 = (m1.d) obj;
                if (!dVar3.f9690a.f9703n) {
                    return c2.f8658b;
                }
                m1.d dVar4 = dVar3.f14024p;
                c2 c2Var = c2.f8657a;
                if (dVar4 != null) {
                    f0 f0Var = new f0(25, (p2) this.f37c);
                    if (f0Var.a(dVar4) == c2Var) {
                        i2.f.C(dVar4, f0Var);
                    }
                }
                dVar3.f14024p = null;
                dVar3.f14023o = null;
                return c2Var;
            case 26:
                q1.i0 i0Var2 = (q1.i0) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) this.f37c;
                i0Var2.h(i0Var2.a() * shadowGraphicsLayerElement.f682a);
                i0Var2.i(shadowGraphicsLayerElement.f683b);
                i0Var2.d(shadowGraphicsLayerElement.f684c);
                i0Var2.c(shadowGraphicsLayerElement.f685d);
                i0Var2.j(shadowGraphicsLayerElement.f686e);
                return ub.a0.f21526a;
            case 27:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) this.f37c).cancel();
                }
                return ub.a0.f21526a;
            case 28:
                return Boolean.valueOf(jc.l.a(obj, this.f37c));
            default:
                return ((q.x) this.f37c).f17475e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(l0 l0Var, k1 k1Var) {
        super(1);
        this.f36b = 9;
        this.f37c = l0Var;
    }
}
