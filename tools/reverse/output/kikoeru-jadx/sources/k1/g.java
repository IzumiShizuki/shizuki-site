package k1;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class g {
    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel("asmr", str, 3);
    }

    public static /* synthetic */ AudioFocusRequest.Builder d(int i10) {
        return new AudioFocusRequest.Builder(i10);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest i(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillId k(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillManager.AutofillCallback l(Object obj) {
        return (AutofillManager.AutofillCallback) obj;
    }
}
