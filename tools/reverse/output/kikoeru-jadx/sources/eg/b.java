package eg;

import androidx.lifecycle.o;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import e7.j;
import ic.n;
import m4.z;
import vb.m;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6583b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f6582a = i10;
        this.f6583b = obj;
    }

    @Override // androidx.lifecycle.v
    public final void i(x xVar, o oVar) {
        switch (this.f6582a) {
            case 0:
                ((n) ((w0) this.f6583b).getValue()).q(xVar, oVar);
                break;
            case 1:
                h7.g gVar = (h7.g) this.f6583b;
                gVar.f8175q = oVar.a();
                if (gVar.f8161c != null) {
                    for (j jVar : m.H0(gVar.f8164f)) {
                        jVar.getClass();
                        h7.c cVar = jVar.f6340h;
                        cVar.getClass();
                        cVar.f8134a.f6336d = oVar.a();
                        cVar.f8137d = oVar.a();
                        cVar.b();
                    }
                }
                break;
            default:
                z zVar = (z) this.f6583b;
                if (oVar == o.ON_START) {
                    zVar.f14643c = true;
                } else if (oVar == o.ON_STOP) {
                    zVar.f14643c = false;
                }
                break;
        }
    }
}
