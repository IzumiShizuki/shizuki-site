package b5;

import android.os.Looper;
import b7.b2;
import b7.c2;
import b7.h1;
import b7.i4;
import b7.o3;
import b7.p3;
import b7.s1;
import b7.t0;
import b7.t1;
import b7.z3;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.List;
import java.util.Objects;
import m4.d1;
import m4.v0;
import m4.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p4.g, s, p4.l, h1, b2, p3, o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1504a;

    public /* synthetic */ a(int i10) {
        this.f1504a = i10;
    }

    @Override // p4.g
    public void accept(Object obj) {
        switch (this.f1504a) {
            case 0:
                ((q) obj).a();
                break;
            case 16:
                ((z3) obj).X();
                break;
            case 17:
                ((z3) obj).f0();
                break;
            case 18:
                ((z3) obj).R();
                break;
            case 19:
                ((z3) obj).a0();
                break;
            case 21:
                ((z3) obj).g0();
                break;
            case 22:
                ((z3) obj).h0();
                break;
            case 24:
                ((z3) obj).b0();
                break;
            case 25:
                ((z3) obj).e0();
                break;
            default:
                ((z3) obj).h();
                break;
        }
    }

    @Override // b7.b2
    public void b(s1 s1Var, int i10) {
        switch (this.f1504a) {
            case 11:
                s1Var.getClass();
                break;
            case 12:
                s1Var.getClass();
                break;
            default:
                s1Var.b(i10);
                break;
        }
    }

    @Override // b7.h1
    public void c(t0 t0Var) {
        switch (this.f1504a) {
            case 6:
                b7.d0 d0Var = t0Var.f2069a;
                if (t0Var.T()) {
                    d0Var.getClass();
                    p4.c.i(Looper.myLooper() == d0Var.f1707d.getLooper());
                    d0Var.f1706c.getClass();
                    return;
                }
                return;
            case 7:
                t0Var.f2076h.e(26, new d1(21));
                return;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                b7.d0 d0Var2 = t0Var.f2069a;
                Objects.requireNonNull(d0Var2);
                d0Var2.e(new a9.m(5, d0Var2));
                return;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                throw new ClassCastException();
            default:
                b7.d0 d0Var3 = t0Var.f2069a;
                if (t0Var.T()) {
                    d0Var3.getClass();
                    p4.c.i(Looper.myLooper() == d0Var3.f1707d.getLooper());
                    d0Var3.f1706c.getClass();
                    return;
                }
                return;
        }
    }

    @Override // b7.o3
    public void d(z3 z3Var, t1 t1Var, List list) {
        switch (this.f1504a) {
            case 27:
                z3Var.b(list);
                break;
            default:
                z3Var.b(list);
                break;
        }
    }

    @Override // p4.l
    public void g(Object obj, m4.o oVar) {
        w0 w0Var = (w0) obj;
        switch (this.f1504a) {
            case 4:
                w0Var.M(new v0(oVar));
                break;
            default:
                w0Var.M(new v0(oVar));
                break;
        }
    }

    @Override // b7.p3
    public Object h(c2 c2Var, t1 t1Var, int i10) {
        switch (this.f1504a) {
            case 14:
                c2Var.getClass();
                throw new ClassCastException();
            case 15:
                c2Var.getClass();
                throw new ClassCastException();
            case 20:
                return c2Var.l(t1Var);
            case 23:
                c2Var.getClass();
                throw new ClassCastException();
            default:
                pe.d dVar = c2Var.f1678e;
                c2Var.r(t1Var);
                dVar.getClass();
                return g8.a.Q(new i4(-6));
        }
    }

    public /* synthetic */ a(int i10, int i11, Object obj) {
        this.f1504a = i11;
    }

    public /* synthetic */ a(int i10, Object obj) {
        this.f1504a = i10;
    }

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f1504a = i10;
    }

    @Override // b5.s
    public void a() {
    }
}
