package ka;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import ub.a0;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.a f11238b;

    public /* synthetic */ a(ic.a aVar, int i10, int i11) {
        this.f11237a = i11;
        this.f11238b = aVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) throws XmlPullParserException, IOException {
        int i10 = this.f11237a;
        x0.o oVar = (x0.o) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                b.b(this.f11238b, oVar, v.D(1));
                break;
            case 1:
                a.a.h(this.f11238b, oVar, v.D(1));
                break;
            default:
                m9.e.c(this.f11238b, oVar, v.D(1));
                break;
        }
        return a0.f21526a;
    }
}
