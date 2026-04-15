package eg;

import b0.i0;
import ic.n;
import j1.q;
import jc.m;
import ub.a0;
import x0.o;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends m implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6590e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i10, int i11, i0 i0Var, int i12) {
        super(2);
        this.f6587b = 0;
        this.f6588c = i10;
        this.f6589d = i11;
        this.f6590e = i0Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f6587b;
        o oVar = (o) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                android.support.v4.media.session.b.j(this.f6588c, this.f6589d, (i0) this.f6590e, oVar, v.D(1));
                break;
            case 1:
                h0.e.b((q) this.f6590e, oVar, v.D(this.f6588c | 1), this.f6589d);
                break;
            default:
                nh.a.a((ta.c) this.f6590e, this.f6588c, oVar, this.f6589d | 1);
                break;
        }
        return a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, int i10, int i11, int i12) {
        super(2);
        this.f6587b = i12;
        this.f6590e = obj;
        this.f6588c = i10;
        this.f6589d = i11;
    }
}
