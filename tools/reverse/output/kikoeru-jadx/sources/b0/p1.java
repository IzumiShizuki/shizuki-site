package b0;

import android.content.Context;
import android.view.View;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements x0.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1331c;

    public /* synthetic */ p1(int i10, Object obj, Object obj2) {
        this.f1329a = i10;
        this.f1330b = obj;
        this.f1331c = obj2;
    }

    @Override // x0.e0
    public final void a() {
        int i10 = this.f1329a;
        Object obj = this.f1331c;
        Object obj2 = this.f1330b;
        switch (i10) {
            case 0:
                ((q1) obj2).f1342c.j(obj);
                break;
            case 1:
                ((androidx.lifecycle.q) obj2).q1((eg.b) obj);
                break;
            case 2:
                ((e7.j) obj2).f6340h.f8143j.q1((f7.l) obj);
                break;
            case 3:
                Iterator it = ((List) ((n2) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((f7.i) obj).b().c((e7.j) it.next());
                }
                break;
            case 4:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((j2.n0) obj);
                break;
            case 5:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((j2.o0) obj);
                break;
            case 6:
                e7.a0 a0Var = (e7.a0) obj2;
                a0Var.getClass();
                h7.g gVar = a0Var.f6299b;
                gVar.getClass();
                gVar.f8174p.remove((na.k) obj);
                break;
            case 7:
                ((r.e0) obj2).f18375a.j((r.c0) obj);
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                ((r.q1) obj2).f18548j.remove((r.q1) obj);
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                r.q1 q1Var = (r.q1) obj2;
                q1Var.getClass();
                r.i1 i1Var = (r.i1) ((r.j1) obj).f18465b.getValue();
                if (i1Var != null) {
                    q1Var.f18547i.remove(i1Var.f18458a);
                }
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                ((r.q1) obj2).f18547i.remove((r.m1) obj);
                break;
            default:
                y.s1 s1Var = (y.s1) obj2;
                View view = (View) obj;
                int i11 = s1Var.f25255s - 1;
                s1Var.f25255s = i11;
                if (i11 == 0) {
                    Field field = u3.s.f21328a;
                    u3.l.c(view, null);
                    u3.s.c(view, null);
                    view.removeOnAttachStateChangeListener(s1Var.f25256t);
                }
                break;
        }
    }
}
