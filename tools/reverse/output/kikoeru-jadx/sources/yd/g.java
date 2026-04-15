package yd;

import ce.j0;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import jc.l;
import ub.q;
import vb.m;
import wd.l0;
import wd.m0;
import wd.n0;
import wd.o0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f26200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f26201b;

    public g(o0 o0Var, n0 n0Var) {
        l.e(o0Var, "strings");
        l.e(n0Var, "qualifiedNames");
        this.f26200a = o0Var;
        this.f26201b = n0Var;
    }

    @Override // yd.f
    public final String a(int i10) throws IOException {
        q qVarC = c(i10);
        List list = (List) qVarC.f21553a;
        String strF0 = m.f0((List) qVarC.f21554b, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strF0;
        }
        return m.f0(list, "/", null, null, null, 62) + '/' + strF0;
    }

    @Override // yd.f
    public final boolean b(int i10) {
        return ((Boolean) c(i10).f21555c).booleanValue();
    }

    public final q c(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            m0 m0Var = (m0) this.f26201b.f23873b.get(i10);
            String str = (String) this.f26200a.f23882b.get(m0Var.f23855d);
            l0 l0Var = m0Var.f23856e;
            l.b(l0Var);
            int iOrdinal = l0Var.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else {
                if (iOrdinal != 2) {
                    throw new j0();
                }
                linkedList2.addFirst(str);
                z10 = true;
            }
            i10 = m0Var.f23854c;
        }
        return new q(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    @Override // yd.f
    public final String getString(int i10) {
        String str = (String) this.f26200a.f23882b.get(i10);
        l.d(str, "getString(...)");
        return str;
    }
}
