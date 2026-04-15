package b7;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w0 implements p4.k, n2, cb.q, p4.g, m5.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2163d;

    public /* synthetic */ w0(o2 o2Var, e4 e4Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.f2160a = 1;
        this.f2161b = o2Var;
        this.f2162c = bundle;
        this.f2163d = resultReceiver;
    }

    @Override // p4.k
    public void a(Object obj) {
        ((m4.w0) obj).g(((v3) ((b1) this.f2161b).f1650b).f2136c.f1831a, ((v3) ((b1) this.f2162c).f1650b).f2136c.f1831a, ((Integer) this.f2163d).intValue());
    }

    @Override // p4.g
    public void accept(Object obj) {
        ah.j jVar = (ah.j) this.f2161b;
        ((j5.j0) obj).T(jVar.f390b, (j5.d0) this.f2162c, (j5.z) this.f2163d);
    }

    @Override // cb.q
    public cb.y apply(Object obj) {
        int i10 = this.f2160a;
        int i11 = 8;
        Object obj2 = this.f2163d;
        Object obj3 = this.f2162c;
        Object obj4 = this.f2161b;
        switch (i10) {
            case 2:
                c2 c2Var = (c2) obj4;
                Handler handler = c2Var.f1685l;
                b5.h hVar = new b5.h(c2Var, (t1) obj3, new b5.m(c2Var, (c3) obj2, (u1) obj, 5));
                i4 i4Var = new i4(0);
                int i12 = p4.c0.f16548a;
                cb.e0 e0Var = new cb.e0();
                p4.c0.R(handler, new b5.m(e0Var, hVar, i4Var, i11));
                return e0Var;
            default:
                c2 c2Var2 = (c2) obj4;
                t1 t1Var = (t1) obj3;
                List list = (List) obj;
                Handler handler2 = c2Var2.f1685l;
                b5.h hVar2 = new b5.h(c2Var2, t1Var, new f(c2Var2, (o3) obj2, t1Var, list, 6));
                i4 i4Var2 = new i4(0);
                int i13 = p4.c0.f16548a;
                cb.e0 e0Var2 = new cb.e0();
                p4.c0.R(handler2, new b5.m(e0Var2, hVar2, i4Var2, i11));
                return e0Var2;
        }
    }

    @Override // b7.n2
    public void b(t1 t1Var) {
        o2 o2Var = (o2) this.f2161b;
        Bundle bundle = (Bundle) this.f2162c;
        ResultReceiver resultReceiver = (ResultReceiver) this.f2163d;
        c2 c2Var = o2Var.f2008g;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        cb.v vVarL = c2Var.l(t1Var);
        if (resultReceiver != null) {
            vVarL.a(new b5.h(6, vVarL, resultReceiver), cb.r.f3875a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    @Override // m5.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ya.a1 e(int r17, m4.j1 r18, int[] r19) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.w0.e(int, m4.j1, int[]):ya.a1");
    }

    public /* synthetic */ w0(Object obj, Object obj2, Object obj3, int i10) {
        this.f2160a = i10;
        this.f2161b = obj;
        this.f2162c = obj2;
        this.f2163d = obj3;
    }
}
