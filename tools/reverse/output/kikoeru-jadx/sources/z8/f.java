package z8;

import e7.a0;
import x0.w0;
import z9.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26540c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.f26538a = i10;
        this.f26539b = obj;
        this.f26540c = obj2;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f26538a) {
            case 0:
                w0 w0Var = (w0) this.f26539b;
                ((hg.b) this.f26540c).e(Integer.valueOf((int) ((Number) w0Var.getValue()).floatValue()), h.f26553a[0]);
                break;
            case 1:
                a0.b((a0) this.f26539b, "MusicScreen/" + ((r) this.f26540c).x());
                break;
            default:
                ((r) this.f26539b).f26660h.setValue((String) this.f26540c);
                break;
        }
        return ub.a0.f21526a;
    }
}
