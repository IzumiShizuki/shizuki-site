package c7;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.proguard.C0015x;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ca;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3713b;

    public /* synthetic */ r(int i10, Object obj) {
        this.f3712a = i10;
        this.f3713b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yg.a aVarB;
        long jNanoTime;
        switch (this.f3712a) {
            case 0:
                s sVar = (s) this.f3713b;
                o.e eVar = sVar.f3725g.f3626e;
                n nVar = sVar.f3723e;
                nVar.getClass();
                eVar.remove(nVar.f3672a.getBinder());
                return;
            case 1:
                ((com.tencent.bugly.crashreport.crash.k) this.f3713b).b();
                return;
            case 2:
                com.tencent.bugly.beta.global.e.f4381b.Y.onPatchReceived(((C0015x) this.f3713b).a());
                return;
            case 3:
                j.e eVar2 = (j.e) this.f3713b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            case 4:
                j2.v vVar = (j2.v) this.f3713b;
                vVar.removeCallbacks(this);
                MotionEvent motionEvent = vVar.K0;
                if (motionEvent != null) {
                    boolean z10 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z10) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i10 = (actionMasked == 7 || actionMasked == 9) ? 7 : 2;
                    j2.v vVar2 = (j2.v) this.f3713b;
                    vVar2.N(motionEvent, i10, vVar2.L0, false);
                    return;
                }
                return;
            case 5:
                m7.f fVar = (m7.f) this.f3713b;
                ValueAnimator valueAnimator = fVar.f14866u;
                int i11 = fVar.f14867v;
                if (i11 == 1) {
                    valueAnimator.cancel();
                } else if (i11 != 2) {
                    return;
                }
                fVar.f14867v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 6:
                m7.q qVar = ((RecyclerView) this.f3713b).E;
                if (qVar != null) {
                    m7.b bVar = (m7.b) qVar;
                    ArrayList arrayList = bVar.f14818e;
                    ArrayList arrayList2 = bVar.f14822i;
                    ArrayList arrayList3 = bVar.f14824k;
                    ArrayList arrayList4 = bVar.f14823j;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList5 = bVar.f14820g;
                    boolean zIsEmpty2 = arrayList5.isEmpty();
                    ArrayList arrayList6 = bVar.f14821h;
                    boolean zIsEmpty3 = arrayList6.isEmpty();
                    ArrayList arrayList7 = bVar.f14819f;
                    boolean zIsEmpty4 = arrayList7.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList.clear();
                    if (!zIsEmpty2) {
                        ArrayList arrayList8 = new ArrayList();
                        arrayList8.addAll(arrayList5);
                        arrayList4.add(arrayList8);
                        arrayList5.clear();
                        if (!zIsEmpty) {
                            a0.c.N(arrayList8.get(0));
                            throw null;
                        }
                        Iterator it2 = arrayList8.iterator();
                        if (it2.hasNext()) {
                            a0.c.N(it2.next());
                            throw null;
                        }
                        arrayList8.clear();
                        arrayList4.remove(arrayList8);
                    }
                    if (!zIsEmpty3) {
                        ArrayList arrayList9 = new ArrayList();
                        arrayList9.addAll(arrayList6);
                        arrayList3.add(arrayList9);
                        arrayList6.clear();
                        if (!zIsEmpty) {
                            a0.c.N(arrayList9.get(0));
                            throw null;
                        }
                        Iterator it3 = arrayList9.iterator();
                        if (it3.hasNext()) {
                            a0.c.N(it3.next());
                            throw null;
                        }
                        arrayList9.clear();
                        arrayList3.remove(arrayList9);
                    }
                    if (zIsEmpty4) {
                        return;
                    }
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.addAll(arrayList7);
                    arrayList2.add(arrayList10);
                    arrayList7.clear();
                    if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty3) {
                        Math.max(!zIsEmpty2 ? bVar.f14920c : 0L, zIsEmpty3 ? 0L : bVar.f14921d);
                        throw q.t0.A(0, arrayList10);
                    }
                    Iterator it4 = arrayList10.iterator();
                    if (it4.hasNext()) {
                        it4.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList10.clear();
                    arrayList2.remove(arrayList10);
                    return;
                }
                return;
            case 7:
                ((StaggeredGridLayoutManager) this.f3713b).K();
                return;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                ((n5.m) this.f3713b).c();
                return;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                NativeCrashHandler nativeCrashHandler = (NativeCrashHandler) this.f3713b;
                if (!ca.a(nativeCrashHandler.f4786f, "native_record_lock", 10000L)) {
                    X.c("[Native] Failed to lock file for handling native crash record.", new Object[0]);
                    return;
                }
                if (!NativeCrashHandler.f4785e) {
                    nativeCrashHandler.a(999, "false");
                }
                CrashDetailBean crashDetailBeanA = com.tencent.bugly.crashreport.crash.jni.c.a(nativeCrashHandler.f4786f, nativeCrashHandler.f4790j, nativeCrashHandler.f4789i);
                if (crashDetailBeanA != null) {
                    X.c("[Native] Get crash from native record.", new Object[0]);
                    if (!nativeCrashHandler.f4796p.c(crashDetailBeanA)) {
                        nativeCrashHandler.f4796p.a(crashDetailBeanA, 3000L, false);
                    }
                    com.tencent.bugly.crashreport.crash.jni.c.a(false, nativeCrashHandler.f4790j);
                }
                nativeCrashHandler.b();
                ca.b(nativeCrashHandler.f4786f, "native_record_lock");
                return;
            default:
                yg.c cVar = (yg.c) this.f3713b;
                synchronized (cVar) {
                    cVar.f26361g++;
                    aVarB = cVar.b();
                }
                if (aVarB == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                do {
                    yg.a aVar = aVarB;
                    try {
                        threadCurrentThread.setName(aVar.f26343a);
                        Logger logger = ((yg.c) this.f3713b).f26356b;
                        yg.b bVar2 = aVar.f26345c;
                        jc.l.b(bVar2);
                        boolean zIsLoggable = logger.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = System.nanoTime();
                            ua.l.H(logger, aVar, bVar2, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jA = aVar.a();
                            if (zIsLoggable) {
                                ua.l.H(logger, aVar, bVar2, "finished run in " + ua.l.P(System.nanoTime() - jNanoTime));
                            }
                            yg.c cVar2 = (yg.c) this.f3713b;
                            synchronized (cVar2) {
                                yg.c.a(cVar2, aVar, jA, true);
                                aVarB = cVar2.b();
                            }
                        } catch (Throwable th2) {
                            if (zIsLoggable) {
                                ua.l.H(logger, aVar, bVar2, "failed a run in " + ua.l.P(System.nanoTime() - jNanoTime));
                            }
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        try {
                            yg.c cVar3 = (yg.c) this.f3713b;
                            synchronized (cVar3) {
                                yg.c.a(cVar3, aVar, -1L, false);
                                if (!(th3 instanceof InterruptedException)) {
                                    throw th3;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th4) {
                            threadCurrentThread.setName(name);
                            throw th4;
                        }
                    }
                } while (aVarB != null);
                threadCurrentThread.setName(name);
                return;
        }
    }
}
