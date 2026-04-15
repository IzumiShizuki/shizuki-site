package u3;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i10) {
        view.setImportantForAutofill(i10);
    }
}
