package l0;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f3.c f11659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f11660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(f3.c cVar, x0.w0 w0Var, int i10) {
        super(1);
        this.f11658b = i10;
        this.f11659c = cVar;
        this.f11660d = w0Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f11658b) {
            case 0:
                long j10 = ((f3.h) obj).f6659a;
                float fB = f3.h.b(j10);
                f3.c cVar = this.f11659c;
                this.f11660d.setValue(new f3.l((((long) cVar.a0(fB)) << 32) | (((long) cVar.a0(f3.h.a(j10))) & 4294967295L)));
                return ub.a0.f21526a;
            case 1:
                w0 w0Var = new w0(0, (ic.a) obj);
                x0 x0Var = new x0(this.f11659c, this.f11660d, 0);
                if (s.u0.a()) {
                    return s.u0.b(w0Var, x0Var, Build.VERSION.SDK_INT == 28 ? s.g1.f19162b : s.g1.f19163c);
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            case 2:
                long j11 = ((f3.h) obj).f6659a;
                float fB2 = f3.h.b(j11);
                f3.c cVar2 = this.f11659c;
                this.f11660d.setValue(new f3.l((((long) cVar2.a0(fB2)) << 32) | (((long) cVar2.a0(f3.h.a(j11))) & 4294967295L)));
                return ub.a0.f21526a;
            default:
                w0 w0Var2 = new w0(1, (ic.a) obj);
                x0 x0Var2 = new x0(this.f11659c, this.f11660d, 2);
                if (s.u0.a()) {
                    return s.u0.b(w0Var2, x0Var2, Build.VERSION.SDK_INT == 28 ? s.g1.f19162b : s.g1.f19163c);
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }
}
