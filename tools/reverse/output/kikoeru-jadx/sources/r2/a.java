package r2;

import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.f;
import jc.m;
import kf.j;
import kf.l;
import s.b0;
import s.c1;
import s.d;
import s.g;
import s.p1;
import s.w;
import u.u1;
import u.z0;
import ub.a0;
import v0.l0;
import w1.i0;
import x0.b1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18729c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, Object obj) {
        super(0);
        this.f18728b = i10;
        this.f18729c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [ic.a, jc.m] */
    @Override // ic.a
    public final Object b() {
        ic.a aVar;
        switch (this.f18728b) {
            case 0:
                b bVar = (b) this.f18729c;
                bVar.f18736g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    bVar.b();
                    Trace.endSection();
                    return a0.f21526a;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 1:
                ((d) this.f18729c).f19124v.b();
                return Boolean.TRUE;
            case 2:
                ic.a aVar2 = ((w) this.f18729c).H;
                if (aVar2 != null) {
                    aVar2.b();
                }
                return Boolean.TRUE;
            case 3:
                return Boolean.valueOf(((b0) this.f18729c).f19111v.F0(7));
            case 4:
                p1 p1Var = (p1) this.f18729c;
                g gVar = (g) f.i(p1Var, c1.f19118a);
                p1Var.A = gVar;
                p1Var.B = gVar != null ? new s.f(gVar.f19153a, gVar.f19154b, gVar.f19155c, gVar.f19156d) : null;
                return a0.f21526a;
            case 5:
                ((m) this.f18729c).b();
                return a0.f21526a;
            case 6:
                Object objC = ((j) this.f18729c).c();
                if (objC instanceof l) {
                    objC = null;
                }
                return (z0) objC;
            case 7:
                return Boolean.valueOf(((u1) this.f18729c).f9703n);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                ((u0.a) this.f18729c).f21166h.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return a0.f21526a;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                f.m((u0.b) this.f18729c);
                return a0.f21526a;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                l0 l0Var = (l0) this.f18729c;
                if (!((Boolean) l0Var.f22264i.getValue()).booleanValue() && (aVar = l0Var.f22256a) != null) {
                    aVar.b();
                }
                return a0.f21526a;
            case 11:
                return new f8.b(2, (va.a) this.f18729c);
            case 12:
                i0 i0Var = (i0) this.f18729c;
                int i10 = i0Var.f23241l;
                b1 b1Var = i0Var.f23238i;
                if (i10 == b1Var.e()) {
                    b1Var.f(b1Var.e() + 1);
                }
                return a0.f21526a;
            case 13:
                Object systemService = ((View) ((tc.b0) this.f18729c).f20618b).getContext().getSystemService("input_method");
                jc.l.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            default:
                return new BaseInputConnection(((y2.b0) this.f18729c).f25367a, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(ic.a aVar) {
        super(0);
        this.f18728b = 5;
        this.f18729c = (m) aVar;
    }
}
