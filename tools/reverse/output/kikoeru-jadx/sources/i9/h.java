package i9;

import android.content.Context;
import android.os.Handler;
import g5.r;
import java.util.ArrayList;
import p4.c0;
import tc.b0;
import v4.s;
import x4.p;
import x4.v;
import x4.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends v4.l {
    @Override // v4.l
    public final void a(Context context, r rVar, v vVar, Handler handler, s sVar, ArrayList arrayList) {
        jc.l.e(context, "context");
        if (((Boolean) a9.i.f237h.c(a9.i.f230a[2])).booleanValue()) {
            rVar = r.f7423e0;
        }
        r rVar2 = rVar;
        p pVar = new p(context);
        m4.d dVar = m4.d.f14158g;
        int i10 = c0.f16548a;
        x4.b bVarC = x4.b.c(context, dVar, null);
        bVarC.getClass();
        pVar.f24664b = bVarC;
        pVar.f24665c = new b0(new l9.a[]{new l9.c(), new l9.b(), new l9.d()});
        arrayList.add(new x(context, new c4.n(context, false), rVar2, handler, sVar, pVar.a()));
        super.a(context, rVar2, vVar, handler, sVar, arrayList);
    }
}
