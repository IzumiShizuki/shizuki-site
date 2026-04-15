package b3;

import android.text.TextPaint;
import com.tencent.bugly.beta.tinker.TinkerReport;
import e3.l;
import java.util.ArrayList;
import q1.k0;
import q1.m;
import q1.o;
import t2.n;
import t2.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f1499a = new j(false);

    public static final void a(n nVar, o oVar, m mVar, float f10, k0 k0Var, l lVar, s1.e eVar) {
        ArrayList arrayList = nVar.f20373h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) arrayList.get(i10);
            pVar.f20377a.g(oVar, mVar, f10, k0Var, lVar, eVar);
            oVar.p(0.0f, pVar.f20377a.b());
        }
    }

    public static final void b(TextPaint textPaint, float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f10 * TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK));
    }
}
