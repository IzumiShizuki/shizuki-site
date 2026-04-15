package y2;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class m extends l {
    @Override // y2.l
    public final void a(j0.r rVar) {
        rVar.closeConnection();
    }

    @Override // y2.l, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.deleteSurroundingTextInCodePoints(i10, i11);
        }
        return false;
    }

    @Override // y2.l, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }
}
