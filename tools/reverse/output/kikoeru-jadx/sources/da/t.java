package da;

import com.cnl.kikoeru.R;
import m0.z8;
import y.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg.f f5799b;

    public /* synthetic */ t(fg.f fVar, int i10) {
        this.f5798a = i10;
        this.f5799b = fVar;
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.util.Map] */
    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f5798a) {
            case 0:
                x0.o oVar = (x0.o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                jc.l.e((k1) obj, "$this$DropdownMenuItem");
                if (oVar.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    m0.z0.a(((Boolean) this.f5799b.getValue()).booleanValue(), null, androidx.compose.foundation.layout.a.n(j1.n.f9689a, 0.0f, 0.0f, 10, 0.0f, 11), false, null, oVar, 432, 56);
                    z8.b(na.q.g(R.string.hide_lrc_files), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar, 0, 0, 131070);
                } else {
                    oVar.Q();
                }
                break;
            default:
                x0.o oVar2 = (x0.o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                jc.l.e((y.w) obj, "$this$DropdownMenu");
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    for (String str : oa.f.f16296c.keySet()) {
                        boolean zF = oVar2.f(str);
                        Object objK = oVar2.K();
                        fg.f fVar = this.f5799b;
                        if (zF || objK == x0.k.f24334a) {
                            objK = new a9.d(19, fVar, str);
                            oVar2.h0(objK);
                        }
                        m0.b0.b((ic.a) objK, null, false, null, f1.g.f(-597540400, new ba.k(6, fVar, str), oVar2), oVar2, 196608, 30);
                    }
                } else {
                    oVar2.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
