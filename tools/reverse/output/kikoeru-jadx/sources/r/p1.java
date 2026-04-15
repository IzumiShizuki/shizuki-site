package r;

import android.view.View;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.lang.reflect.Field;
import java.util.List;
import u.q2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(int i10, Object obj, Object obj2) {
        super(1);
        this.f18516b = i10;
        this.f18518d = obj;
        this.f18517c = obj2;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f18516b;
        ub.a0 a0Var = ub.a0.f21526a;
        Object obj2 = this.f18517c;
        Object obj3 = this.f18518d;
        switch (i10) {
            case 0:
                hf.a0.y((hf.y) obj3, null, hf.z.f8619d, new f7.x((q1) obj2, null), 1);
                return new o1();
            case 1:
                q1 q1Var = (q1) obj2;
                q1 q1Var2 = (q1) obj3;
                q1Var.f18548j.add(q1Var2);
                return new b0.p1(8, q1Var, q1Var2);
            case 2:
                return new b0.p1(9, (q1) obj2, (j1) obj3);
            case 3:
                q1 q1Var3 = (q1) obj2;
                m1 m1Var = (m1) obj3;
                q1Var3.f18547i.add(m1Var);
                return new b0.p1(10, q1Var3, m1Var);
            case 4:
                i2.l0 l0Var = (i2.l0) obj;
                l0Var.b();
                q.t0.n(l0Var, ((q1.b0) obj3).f17493e, (q1.m) obj2, 0.0f, null, 60);
                return a0Var;
            case 5:
                i2.l0 l0Var2 = (i2.l0) obj;
                l0Var2.b();
                q.t0.n(l0Var2, (q1.h) obj3, (q1.m) obj2, 0.0f, null, 60);
                return a0Var;
            case 6:
                ((w.k) obj3).b((w.j) obj2);
                return a0Var;
            case 7:
                long j10 = ((p1.b) obj).f16481a;
                ((ic.a) obj3).b();
                ((t.l) obj2).f20087a.setValue(new t.j(j10));
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                ((b0.m) obj3).f1296a.j((u.f) obj2);
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                m0.v vVar = (m0.v) obj3;
                u.n0 n0Var = (u.n0) obj2;
                long j11 = p1.b.j(n0Var.D ? -1.0f : 1.0f, ((u.m) obj).f21002a);
                u.e1 e1Var = n0Var.f21014z;
                i7.k kVar = u.l0.f20995a;
                vVar.a(Float.intBitsToFloat((int) (e1Var == u.e1.f20882a ? j11 & 4294967295L : j11 >> 32)));
                return a0Var;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                u.a2 a2Var = (u.a2) obj3;
                long j12 = ((u.m) obj).f21002a;
                a2Var.a(1, ((u.c2) obj2).f20847d == u.e1.f20883b ? p1.b.a(j12, 0.0f, 1) : p1.b.a(j12, 0.0f, 2));
                return a0Var;
            case 11:
                ((Number) obj).longValue();
                q2 q2Var = (q2) obj3;
                float f10 = q2Var.f21056e;
                q2Var.f21056e = 0.0f;
                ((ic.k) obj2).a(Float.valueOf(f10));
                return a0Var;
            case 12:
                int iIntValue = ((Number) obj).intValue();
                return ((t2.x) obj3).q(Integer.valueOf(iIntValue), ((List) obj2).get(iIntValue));
            default:
                y.s1 s1Var = (y.s1) obj3;
                View view = (View) obj2;
                y.r0 r0Var = s1Var.f25256t;
                if (s1Var.f25255s == 0) {
                    Field field = u3.s.f21328a;
                    u3.l.c(view, r0Var);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(r0Var);
                    u3.s.c(view, r0Var);
                }
                s1Var.f25255s++;
                return new b0.p1(11, s1Var, view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(q1 q1Var, Object obj, int i10) {
        super(1);
        this.f18516b = i10;
        this.f18517c = q1Var;
        this.f18518d = obj;
    }
}
