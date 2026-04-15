package u3;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {
    public static int a(int i10) {
        int iStatusBars;
        int i11 = 0;
        for (int i12 = 1; i12 <= 512; i12 <<= 1) {
            if ((i10 & i12) != 0) {
                if (i12 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i12 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i12 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i12 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i12 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i12 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i12 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i12 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                } else if (i12 == 512) {
                    iStatusBars = WindowInsets.Type.systemOverlays();
                }
                i11 |= iStatusBars;
            }
        }
        return i11;
    }
}
