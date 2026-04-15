package m9;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import ub.a0;
import x0.o;
import x0.v;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f15009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.a f15010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15011d;

    public /* synthetic */ f(w0 w0Var, ic.a aVar, int i10, int i11) {
        this.f15008a = i11;
        this.f15009b = w0Var;
        this.f15010c = aVar;
        this.f15011d = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) throws XmlPullParserException, IOException {
        int i10 = this.f15008a;
        o oVar = (o) obj;
        ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                e.e(this.f15009b, this.f15010c, oVar, v.D(this.f15011d | 1));
                break;
            default:
                e.a(this.f15009b, this.f15010c, oVar, v.D(this.f15011d | 1));
                break;
        }
        return a0.f21526a;
    }
}
