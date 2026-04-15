package t9;

import androidx.lifecycle.m0;
import androidx.lifecycle.s0;
import i7.i1;
import i7.j1;
import i7.o0;
import i7.u;
import java.util.ArrayList;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wb.e f20584b;

    public g() {
        wb.e eVar = new wb.e();
        a[] aVarArrValues = a.values();
        ArrayList arrayList = new ArrayList(aVarArrValues.length);
        for (a aVar : aVarArrValues) {
            eVar.put(aVar, u.a(new o0(new i1(0, new f(0, aVar), null), 0, new j1(25)).f9240f, m0.h(this)));
            arrayList.add(a0.f21526a);
        }
        this.f20584b = eVar.b();
    }
}
