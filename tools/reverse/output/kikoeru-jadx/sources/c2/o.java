package c2;

import android.os.Build;
import j2.l1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends g {
    @Override // c2.g
    public final void C0(q qVar) {
        r rVar = (r) i2.f.i(this, l1.f9879u);
        if (rVar != null) {
            j2.s sVar = (j2.s) rVar;
            if (qVar == null) {
                q.f3319a.getClass();
                qVar = s.f3320a;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                j2.j0.f9835a.a(sVar.f9978b, qVar);
            }
        }
    }

    @Override // c2.g
    public final boolean E0(int i10) {
        return (i10 == 3 || i10 == 4) ? false : true;
    }

    @Override // i2.d2
    public final /* bridge */ /* synthetic */ Object k() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }
}
