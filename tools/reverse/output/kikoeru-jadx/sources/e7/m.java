package e7;

import androidx.lifecycle.s0;
import androidx.lifecycle.w0;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f6361b = new LinkedHashMap();

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int iIdentityHashCode = System.identityHashCode(this);
        gh.g.j(16);
        sb.append(ub.a.h(16, ((long) iIdentityHashCode) & 4294967295L));
        sb.append("} ViewModelStores (");
        Iterator it = this.f6361b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }

    @Override // androidx.lifecycle.s0
    public final void v() {
        LinkedHashMap linkedHashMap = this.f6361b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((w0) it.next()).a();
        }
        linkedHashMap.clear();
    }
}
