package b0;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.Iterator;
import java.util.LinkedHashMap;
import m0.t4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements x0.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1259b;

    public /* synthetic */ h0(int i10, Object obj) {
        this.f1258a = i10;
        this.f1259b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, ub.h] */
    @Override // x0.e0
    public final void a() {
        Object parcelable;
        Integer num;
        switch (this.f1258a) {
            case 0:
                ((j0) this.f1259b).f1274d = null;
                return;
            case 1:
                ((z0) this.f1259b).f1417c = null;
                return;
            case 2:
                ((v0) this.f1259b).f1371f = true;
                return;
            case 3:
                h9.a.a().e((da.e0) this.f1259b);
                return;
            case 4:
                g.c cVar = ((e.a) this.f1259b).f6013a;
                if (cVar == null) {
                    throw new IllegalStateException("Launcher has not been initialized");
                }
                d.m mVar = cVar.f7108b;
                String str = cVar.f7109c;
                Bundle bundle = mVar.f5234g;
                LinkedHashMap linkedHashMap = mVar.f5233f;
                jc.l.e(str, "key");
                if (!mVar.f5231d.contains(str) && (num = (Integer) mVar.f5229b.remove(str)) != null) {
                    mVar.f5228a.remove(num);
                }
                mVar.f5232e.remove(str);
                if (linkedHashMap.containsKey(str)) {
                    StringBuilder sbK = a0.c.K("Dropping pending result for request ", str, ": ");
                    sbK.append(linkedHashMap.get(str));
                    Log.w("ActivityResultRegistry", sbK.toString());
                    linkedHashMap.remove(str);
                }
                if (bundle.containsKey(str)) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        parcelable = d.j.b(str, bundle);
                    } else {
                        parcelable = bundle.getParcelable(str);
                        if (!g.a.class.isInstance(parcelable)) {
                            parcelable = null;
                        }
                    }
                    Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((g.a) parcelable));
                    bundle.remove(str);
                }
                if (mVar.f5230c.get(str) != null) {
                    throw new ClassCastException();
                }
                return;
            case 5:
                Iterator it = ((e.c) this.f1259b).f5181b.iterator();
                while (it.hasNext()) {
                    ((d.d) it.next()).cancel();
                }
                return;
            case 6:
                Iterator it2 = ((e.k) this.f1259b).f5181b.iterator();
                while (it2.hasNext()) {
                    ((d.d) it2.next()).cancel();
                }
                return;
            case 7:
                ((eg.e) this.f1259b).disable();
                return;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                ((l0.l1) this.f1259b).l();
                return;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                ((j2.p1) this.f1259b).f9959b.b();
                return;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                j3.s sVar = (j3.s) this.f1259b;
                sVar.dismiss();
                sVar.f10168g.d();
                return;
            case 11:
                j3.u uVar = (j3.u) this.f1259b;
                uVar.d();
                androidx.lifecycle.m0.i(uVar, null);
                uVar.f10180n.removeViewImmediate(uVar);
                return;
            case 12:
                l0.s0 s0Var = (l0.s0) this.f1259b;
                s0Var.i();
                s0Var.f11619i.setValue(Boolean.FALSE);
                return;
            case 13:
                t4 t4Var = (t4) this.f1259b;
                View view = t4Var.f13653a;
                if (t4Var.f13655c) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(t4Var);
                    t4Var.f13655c = false;
                }
                view.removeOnAttachStateChangeListener(t4Var);
                return;
            case 14:
                q.q1 q1Var = (q.q1) this.f1259b;
                q1Var.getClass();
                ((h1.y) q.q1.f17412k.getValue()).b(q1Var);
                q1Var.f17415c = true;
                return;
            default:
                s0.i iVar = (s0.i) this.f1259b;
                iVar.d();
                androidx.lifecycle.m0.i(iVar, null);
                iVar.f19328j.getViewTreeObserver().removeOnGlobalLayoutListener(iVar);
                iVar.f19329k.removeViewImmediate(iVar);
                return;
        }
    }
}
