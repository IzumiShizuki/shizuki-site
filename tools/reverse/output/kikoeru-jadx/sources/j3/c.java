package j3;

import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends jc.m implements ic.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f10115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f10116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f10117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f10118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f10119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f10120h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10121b;

    static {
        int i10 = 1;
        f10115c = new c(i10, 0);
        f10116d = new c(i10, 1);
        f10117e = new c(i10, 2);
        f10118f = new c(i10, 3);
        f10119g = new c(i10, 4);
        f10120h = new c(i10, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, int i11) {
        super(i10);
        this.f10121b = i11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f10121b;
        a0 a0Var = a0.f21526a;
        switch (i10) {
            case 0:
                pc.u[] uVarArr = q2.v.f17698a;
                ((q2.k) obj).l(q2.t.f17692w, a0Var);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                pc.u[] uVarArr2 = q2.v.f17698a;
                ((q2.k) obj).l(q2.t.f17691v, a0Var);
                break;
            case 4:
                break;
            default:
                u uVar = (u) obj;
                if (uVar.isAttachedToWindow()) {
                    uVar.n();
                }
                break;
        }
        return a0Var;
    }
}
