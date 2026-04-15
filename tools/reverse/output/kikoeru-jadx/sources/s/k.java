package s;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import x0.o2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends jc.m implements ic.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f19193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f19194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f19195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f19196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f19197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f19198h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19199b;

    static {
        int i10 = 1;
        f19193c = new k(i10, 0);
        f19194d = new k(i10, 1);
        f19195e = new k(i10, 2);
        f19196f = new k(i10, 3);
        f19197g = new k(i10, 4);
        f19198h = new k(i10, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, int i11) {
        super(i10);
        this.f19199b = i11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f19199b;
        ub.a0 a0Var = ub.a0.f21526a;
        switch (i10) {
            case 0:
                ((i2.l0) obj).b();
                return a0Var;
            case 1:
                return a0Var;
            case 2:
                ((Number) obj).longValue();
                return a0Var;
            case 3:
                int i11 = h.f19165a;
                o2 o2Var = AndroidCompositionLocals_androidKt.f721b;
                f1.k kVar = (f1.k) ((x0.j1) obj);
                kVar.getClass();
                Context context = (Context) x0.v.w(kVar, o2Var);
                f3.c cVar = (f3.c) x0.v.w(kVar, j2.l1.f9866h);
                a1 a1Var = (a1) x0.v.w(kVar, b1.f19113a);
                if (a1Var == null) {
                    return null;
                }
                return new g(context, cVar, a1Var.f19099a, a1Var.f19100b);
            case 4:
                q2.g gVar = q2.g.f17597d;
                pc.u[] uVarArr = q2.v.f17698a;
                q2.w wVar = q2.t.f17672c;
                pc.u uVar = q2.v.f17698a[1];
                wVar.a((q2.k) obj, gVar);
                return a0Var;
            default:
                return new o1(((Number) obj).intValue());
        }
    }
}
