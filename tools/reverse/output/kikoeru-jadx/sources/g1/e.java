package g1;

import androidx.media3.exoplayer.offline.u;
import e7.y;
import java.util.Map;
import o.k0;
import o.s0;
import ub.a0;
import x0.n1;
import x0.o;
import x0.o2;
import x0.p1;
import x0.r0;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u f7138e = new u(16, new fa.a(15), new d(0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f7139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f7140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f7141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f7142d;

    public e(Map map) {
        this.f7139a = map;
        long[] jArr = s0.f16040a;
        this.f7140b = new k0();
        this.f7142d = new y(4, this);
    }

    @Override // g1.c
    public final void a(Object obj, f1.f fVar, o oVar, int i10) {
        int i11;
        oVar.Y(533563200);
        int i12 = 4;
        if ((i10 & 6) == 0) {
            i11 = (oVar.h(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.h(fVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.h(this) ? 256 : 128;
        }
        if (oVar.N(i11 & 1, (i11 & 147) != 146)) {
            oVar.Z(obj);
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                y yVar = this.f7142d;
                if (!((Boolean) yVar.a(obj)).booleanValue()) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                Map map = (Map) this.f7139a.get(obj);
                o2 o2Var = i.f7146a;
                j jVar = new j(new h(map, yVar));
                oVar.h0(jVar);
                objK = jVar;
            }
            j jVar2 = (j) objK;
            v.b(new n1[]{i.f7146a.a(jVar2), x7.a.f24831a.a(jVar2)}, fVar, oVar, (i11 & 112) | 8);
            boolean zH = oVar.h(this) | oVar.h(obj) | oVar.h(jVar2);
            Object objK2 = oVar.K();
            if (zH || objK2 == r0Var) {
                objK2 = new ba.i(this, obj, jVar2, i12);
                oVar.h0(objK2);
            }
            v.c(a0.f21526a, (ic.k) objK2, oVar);
            if (oVar.f24399y && oVar.G.f24537i == oVar.f24400z) {
                oVar.f24400z = -1;
                oVar.f24399y = false;
            }
            oVar.p(false);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new f1.c(this, obj, fVar, i10);
        }
    }

    @Override // g1.c
    public final void e(Object obj) {
        if (this.f7140b.k(obj) == null) {
            this.f7139a.remove(obj);
        }
    }
}
