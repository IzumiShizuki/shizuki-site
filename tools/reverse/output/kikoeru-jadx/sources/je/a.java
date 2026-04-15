package je;

import b0.w1;
import bd.p0;
import java.util.ArrayList;
import jc.l;
import vb.m;
import vb.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e {
    public final void a(yc.e eVar, ArrayList arrayList, w1 w1Var) {
        l.e(eVar, "thisDescriptor");
        l.e(w1Var, "c");
        while (true) {
            q qVar = q.f22818a;
            if (!qVar.hasNext()) {
                return;
            } else {
                ((a) ((e) qVar.next())).a(eVar, arrayList, w1Var);
            }
        }
    }

    public final void b(yc.e eVar, be.e eVar2, ArrayList arrayList, w1 w1Var) {
        l.e(eVar, "thisDescriptor");
        l.e(eVar2, "name");
        l.e(w1Var, "c");
        while (true) {
            q qVar = q.f22818a;
            if (!qVar.hasNext()) {
                return;
            } else {
                ((a) ((e) qVar.next())).b(eVar, eVar2, arrayList, w1Var);
            }
        }
    }

    public final void c(yc.e eVar, be.e eVar2, wb.b bVar, w1 w1Var) {
        l.e(eVar, "thisDescriptor");
        l.e(eVar2, "name");
        l.e(w1Var, "c");
        while (true) {
            q qVar = q.f22818a;
            if (!qVar.hasNext()) {
                return;
            } else {
                ((a) ((e) qVar.next())).c(eVar, eVar2, bVar, w1Var);
            }
        }
    }

    public final void d(yc.e eVar, be.e eVar2, ArrayList arrayList, w1 w1Var) {
        l.e(eVar, "thisDescriptor");
        l.e(eVar2, "name");
        l.e(w1Var, "c");
        while (true) {
            q qVar = q.f22818a;
            if (!qVar.hasNext()) {
                return;
            } else {
                ((a) ((e) qVar.next())).d(eVar, eVar2, arrayList, w1Var);
            }
        }
    }

    public final ArrayList e(yc.e eVar, w1 w1Var) {
        l.e(eVar, "thisDescriptor");
        l.e(w1Var, "c");
        ArrayList arrayList = new ArrayList();
        while (true) {
            q qVar = q.f22818a;
            if (!qVar.hasNext()) {
                return arrayList;
            }
            m.P(arrayList, ((a) ((e) qVar.next())).e(eVar, w1Var));
        }
    }

    public final ArrayList f(yc.e eVar, w1 w1Var) {
        l.e(eVar, "thisDescriptor");
        l.e(w1Var, "c");
        ArrayList arrayList = new ArrayList();
        while (true) {
            q qVar = q.f22818a;
            if (!qVar.hasNext()) {
                return arrayList;
            }
            m.P(arrayList, ((a) ((e) qVar.next())).f(eVar, w1Var));
        }
    }

    public final ArrayList g(yc.e eVar, w1 w1Var) {
        l.e(eVar, "thisDescriptor");
        l.e(w1Var, "c");
        ArrayList arrayList = new ArrayList();
        while (true) {
            q qVar = q.f22818a;
            if (!qVar.hasNext()) {
                return arrayList;
            }
            m.P(arrayList, ((a) ((e) qVar.next())).g(eVar, w1Var));
        }
    }

    public final p0 h(yc.e eVar, p0 p0Var, w1 w1Var) {
        l.e(p0Var, "propertyDescriptor");
        l.e(w1Var, "c");
        while (true) {
            q qVar = q.f22818a;
            if (!qVar.hasNext()) {
                return p0Var;
            }
            p0Var = ((a) ((e) qVar.next())).h(eVar, p0Var, w1Var);
        }
    }
}
