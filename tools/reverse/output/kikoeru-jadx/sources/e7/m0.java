package e7;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f6362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6363b;

    public abstract u a();

    public final l b() {
        l lVar = this.f6362a;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void d(List list, d0 d0Var) {
        df.e eVar = new df.e(new df.h(df.m.e0(vb.m.R(list), new y(1, this, d0Var)), false, new d9.i(10)));
        while (eVar.hasNext()) {
            b().f((j) eVar.next());
        }
    }

    public void e(j jVar, boolean z10) {
        List list = (List) b().f6357e.f12434a.getValue();
        if (!list.contains(jVar)) {
            throw new IllegalStateException(("popBackStack was called with " + jVar + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        j jVar2 = null;
        while (f()) {
            jVar2 = (j) listIterator.previous();
            if (jc.l.a(jVar2, jVar)) {
                break;
            }
        }
        if (jVar2 != null) {
            b().d(jVar2, z10);
        }
    }

    public boolean f() {
        return true;
    }

    public u c(u uVar) {
        return uVar;
    }
}
