package ca;

import f1.f;
import ic.n;
import j1.q;
import java.io.IOException;
import m0.g1;
import m9.e;
import org.xmlpull.v1.XmlPullParserException;
import ub.a0;
import x0.o;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f3826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3827c;

    public /* synthetic */ a(q qVar, int i10) {
        this.f3825a = 2;
        f fVar = g1.f13013a;
        this.f3826b = qVar;
        this.f3827c = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) throws XmlPullParserException, IOException {
        int i10 = this.f3825a;
        a0 a0Var = a0.f21526a;
        int i11 = this.f3827c;
        q qVar = this.f3826b;
        switch (i10) {
            case 0:
                ((Integer) obj2).getClass();
                a2.c.k(qVar, (o) obj, v.D(1), i11);
                break;
            case 1:
                ((Integer) obj2).getClass();
                a2.c.k(qVar, (o) obj, v.D(1), i11);
                break;
            case 2:
                f fVar = g1.f13013a;
                ((Integer) obj2).getClass();
                a.a.e(qVar, (o) obj, v.D(i11 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                e.b(qVar, (o) obj, v.D(1), i11);
                break;
        }
        return a0Var;
    }

    public /* synthetic */ a(q qVar, int i10, int i11, int i12) {
        this.f3825a = i12;
        this.f3826b = qVar;
        this.f3827c = i11;
    }
}
