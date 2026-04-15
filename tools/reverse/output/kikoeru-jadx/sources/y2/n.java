package y2;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class n extends m {
    @Override // y2.l, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.commitContent(inputContentInfo, i10, bundle);
        }
        return false;
    }
}
