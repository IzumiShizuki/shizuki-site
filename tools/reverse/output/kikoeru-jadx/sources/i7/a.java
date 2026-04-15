package i7;

import android.os.Build;
import android.util.Log;
import android.widget.Toast;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f9028f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, yb.c cVar, int i11) {
        super(i10, cVar);
        this.f9027e = i11;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f9027e) {
            case 0:
                a aVar = new a(2, cVar, 0);
                aVar.f9028f = obj;
                return aVar;
            case 1:
                a aVar2 = new a(2, cVar, 1);
                aVar2.f9028f = obj;
                return aVar2;
            case 2:
                a aVar3 = new a(2, cVar, 2);
                aVar3.f9028f = obj;
                return aVar3;
            case 3:
                a aVar4 = new a(2, cVar, 3);
                aVar4.f9028f = obj;
                return aVar4;
            case 4:
                a aVar5 = new a(2, cVar, 4);
                aVar5.f9028f = obj;
                return aVar5;
            case 5:
                return new a(this.f9028f, cVar);
            case 6:
                a aVar6 = new a(2, cVar, 6);
                aVar6.f9028f = obj;
                return aVar6;
            case 7:
                a aVar7 = new a(2, cVar, 7);
                aVar7.f9028f = obj;
                return aVar7;
            default:
                a aVar8 = new a(2, cVar, 8);
                aVar8.f9028f = obj;
                return aVar8;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f9027e) {
            case 0:
                return ((a) o((vb.u) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 1:
                a aVar = (a) o((k0) obj, (yb.c) obj2);
                ub.a0 a0Var = ub.a0.f21526a;
                aVar.u(a0Var);
                return a0Var;
            case 2:
                return ((a) o((lf.r0) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 3:
                a aVar2 = (a) o((m0.v) obj, (yb.c) obj2);
                ub.a0 a0Var2 = ub.a0.f21526a;
                aVar2.u(a0Var2);
                return a0Var2;
            case 4:
                return ((a) o((c9.c) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 5:
                a aVar3 = (a) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var3 = ub.a0.f21526a;
                aVar3.u(a0Var3);
                return a0Var3;
            case 6:
                return ((a) o((c9.d) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 7:
                a aVar4 = (a) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var4 = ub.a0.f21526a;
                aVar4.u(a0Var4);
                return a0Var4;
            default:
                return ((a) o((x0.q1) obj, (yb.c) obj2)).u(ub.a0.f21526a);
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f9027e;
        int i11 = 2;
        yb.c cVar = null;
        ub.a0 a0Var = ub.a0.f21526a;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                return Boolean.valueOf(((vb.u) this.f9028f) != null);
            case 1:
                ub.a.f(obj);
                k0 k0Var = (k0) this.f9028f;
                if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                    String str = "Sent " + k0Var;
                    jc.l.e(str, "message");
                    Log.v("Paging", str, null);
                }
                return a0Var;
            case 2:
                ub.a.f(obj);
                return Boolean.valueOf(((lf.r0) this.f9028f) != lf.r0.f12484a);
            case 3:
                ub.a.f(obj);
                ((m0.v) this.f9028f).a(0.0f);
                return a0Var;
            case 4:
                c9.c cVar2 = (c9.c) this.f9028f;
                ub.a.f(obj);
                String str2 = cVar2.f3787m;
                if (!ef.n.y0(str2)) {
                    xf.r rVar = na.w.f15765a;
                    rVar.getClass();
                    return (bg.a2) rVar.a(str2, bg.a2.Companion.serializer());
                }
                String str3 = cVar2.f3782h;
                xf.r rVar2 = na.w.f15765a;
                rVar2.getClass();
                bg.c cVar3 = (bg.c) rVar2.a(str3, bg.c.Companion.serializer());
                boolean z10 = cVar2.f3784j;
                long j10 = cVar2.f3777c;
                String str4 = cVar2.f3785k;
                return new bg.a2(cVar3, z10, j10, str4, str4, cVar2.f3785k, cVar2.f3783i, cVar2.f3779e, (List) rVar2.a(cVar2.f3780f, new wf.d(bg.e1.Companion.serializer(), 0)), cVar2.f3786l, (List) rVar2.a(cVar2.f3781g, new wf.d(bg.o1.Companion.serializer(), 0)));
            case 5:
                ub.a.f(obj);
                Toast.makeText(a9.i.a(), String.valueOf(this.f9028f), 0).show();
                return a0Var;
            case 6:
                c9.d dVar = (c9.d) this.f9028f;
                ub.a.f(obj);
                String str5 = dVar.f3800m;
                if (!ef.n.y0(str5)) {
                    xf.r rVar3 = na.w.f15765a;
                    rVar3.getClass();
                    return (bg.a2) rVar3.a(str5, bg.a2.Companion.serializer());
                }
                String str6 = dVar.f3795h;
                xf.r rVar4 = na.w.f15765a;
                rVar4.getClass();
                bg.c cVar4 = (bg.c) rVar4.a(str6, bg.c.Companion.serializer());
                boolean z11 = dVar.f3797j;
                long j11 = dVar.f3790c;
                String str7 = dVar.f3798k;
                return new bg.a2(cVar4, z11, j11, str7, str7, dVar.f3798k, dVar.f3796i, dVar.f3792e, (List) rVar4.a(dVar.f3793f, new wf.d(bg.e1.Companion.serializer(), 0)), dVar.f3799l, (List) rVar4.a(dVar.f3794g, new wf.d(bg.o1.Companion.serializer(), 0)));
            case 7:
                hf.y yVar = (hf.y) this.f9028f;
                ub.a.f(obj);
                hf.a0.y(yVar, null, null, new ba.t(i11, cVar, 14), 3);
                return a0Var;
            default:
                ub.a.f(obj);
                return Boolean.valueOf(((x0.q1) this.f9028f) == x0.q1.f24427a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Object obj, yb.c cVar) {
        super(2, cVar);
        this.f9027e = 5;
        this.f9028f = obj;
    }
}
