package e7;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import o.v0;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Le7/z;", "Le7/m0;", "Le7/w;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@l0("navigation")
public class z extends m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f6415c;

    public z(n0 n0Var) {
        jc.l.e(n0Var, "navigatorProvider");
        this.f6415c = n0Var;
    }

    @Override // e7.m0
    public final void d(List list, d0 d0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            u uVar = jVar.f6334b;
            jc.l.c(uVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            w wVar = (w) uVar;
            h7.i iVar = wVar.f6400b;
            jc.y yVar = new jc.y();
            yVar.f10838a = jVar.f6340h.a();
            h7.k kVar = wVar.f6409f;
            int i10 = kVar.f8197b;
            String str = (String) kVar.f8201f;
            if (i10 == 0 && str == null) {
                iVar.getClass();
                String strValueOf = String.valueOf(iVar.f8187a);
                jc.l.e(strValueOf, "superName");
                if (((w) kVar.f8198c).f6400b.f8187a == 0) {
                    strValueOf = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(strValueOf).toString());
            }
            u uVarS = str != null ? kVar.s(str, false) : (u) ((v0) kVar.f8199d).d(i10);
            if (uVarS == null) {
                if (((String) kVar.f8200e) == null) {
                    String strValueOf2 = (String) kVar.f8201f;
                    if (strValueOf2 == null) {
                        strValueOf2 = String.valueOf(kVar.f8197b);
                    }
                    kVar.f8200e = strValueOf2;
                }
                String str2 = (String) kVar.f8200e;
                jc.l.b(str2);
                throw new IllegalArgumentException(t0.D("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            h7.i iVar2 = uVarS.f6400b;
            if (str != null) {
                if (!str.equals((String) iVar2.f8191e)) {
                    t tVarC = iVar2.c(str);
                    Bundle bundle = tVarC != null ? tVarC.f6393b : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundleC = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
                        bundleC.putAll(bundle);
                        Bundle bundle2 = (Bundle) yVar.f10838a;
                        if (bundle2 != null) {
                            bundleC.putAll(bundle2);
                        }
                        yVar.f10838a = bundleC;
                    }
                }
                if (uVarS.j().isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListE = g.e(uVarS.j(), new y(0, yVar));
                    if (!arrayListE.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + uVarS + ". Missing required arguments [" + arrayListE + ']').toString());
                    }
                }
            }
            this.f6415c.b(uVarS.f6399a).d(ud.b.w(b().b(uVarS, uVarS.a((Bundle) yVar.f10838a))), d0Var);
        }
    }

    @Override // e7.m0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public w a() {
        return new w(this);
    }
}
