package q2;

import a0.f0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import o.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator[] f17702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f17703b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i10 = 0;
        while (i10 < 2) {
            comparatorArr[i10] = new j9.l(4, new j9.l(i10 == 0 ? f.f17594c : f.f17593b));
            i10++;
        }
        f17702a = comparatorArr;
        f17703b = s.f17668u;
    }

    public static final void a(o oVar, ArrayList arrayList, f0 f0Var, f0 f0Var2, y yVar) {
        k kVar = oVar.f17639d;
        Object objG = kVar.f17630a.g(t.f17682m);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) f0Var2.a(oVar)).booleanValue()) && ((Boolean) f0Var.a(oVar)).booleanValue()) {
            arrayList.add(oVar);
        }
        if (zBooleanValue) {
            yVar.h(oVar.f17642g, b(oVar, f0Var, f0Var2, o.j(7, oVar)));
            return;
        }
        List listJ = o.j(7, oVar);
        int size = listJ.size();
        for (int i10 = 0; i10 < size; i10++) {
            a((o) listJ.get(i10), arrayList, f0Var, f0Var2, yVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(q2.o r18, a0.f0 r19, a0.f0 r20, java.util.List r21) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.x.b(q2.o, a0.f0, a0.f0, java.util.List):java.util.ArrayList");
    }
}
