package y9;

import com.cnl.kikoeru.R;
import f1.f;
import ic.k;
import jc.l;
import na.q;
import ub.a0;
import y8.i;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25940a;

    public /* synthetic */ c(int i10) {
        this.f25940a = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f25940a) {
            case 0:
                i iVar = (i) obj;
                l.e(iVar, "$this$prefsGroup");
                wb.b bVarL = ud.b.l();
                bVarL.add(new ub.k(0, q.g(R.string.disable)));
                bVarL.add(new ub.k(5, "5s"));
                bVarL.add(new ub.k(10, "10s"));
                bVarL.add(new ub.k(30, "30s"));
                iVar.b(new f(new ba.l(14, ud.b.g(bVarL)), -8733789, true));
                return a0.f21526a;
            case 1:
                l.e((String) obj, "it");
                return a0.f21526a;
            case 2:
                l.e((String) obj, "it");
                return a0.f21526a;
            case 3:
                return String.valueOf((int) ((Float) obj).floatValue());
            default:
                return String.valueOf(((Float) obj).floatValue());
        }
    }
}
