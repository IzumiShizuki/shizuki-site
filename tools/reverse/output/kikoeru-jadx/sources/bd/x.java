package bd;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2682a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2683b;

    public x(List list, td.p pVar) {
        this.f2683b = list;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f2682a) {
            case 0:
                return this.f2683b;
            default:
                List<ve.d> list = this.f2683b;
                ArrayList arrayList = new ArrayList();
                for (ve.d dVar : list) {
                    jc.l.e(dVar, "<this>");
                    se.w wVarH = se.c.h((se.w) dVar);
                    if (wVarH != null) {
                        arrayList.add(wVarH);
                    }
                }
                return arrayList;
        }
    }

    public x(List list) {
        this.f2683b = list;
    }
}
