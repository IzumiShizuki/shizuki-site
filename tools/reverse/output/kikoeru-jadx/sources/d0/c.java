package d0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends jc.m implements ic.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f5279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f5280d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5281b;

    static {
        int i10 = 1;
        f5279c = new c(i10, 0);
        f5280d = new c(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, int i11) {
        super(i10);
        this.f5281b = i11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f5281b) {
            case 0:
                List list = (List) obj;
                Object obj2 = list.get(0);
                jc.l.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                jc.l.c(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new d(iIntValue, ((Float) obj3).floatValue(), new b0.d0(4, list));
            default:
                return ub.a0.f21526a;
        }
    }
}
