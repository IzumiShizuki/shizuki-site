package b7;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l {
    public static /* synthetic */ NotificationChannel a() {
        return new NotificationChannel("001", "bugly_upgrade", 2);
    }

    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel("default_channel_id", str, 2);
    }

    public static /* synthetic */ AudioFocusRequest.Builder g() {
        return new AudioFocusRequest.Builder(1);
    }

    public static /* bridge */ /* synthetic */ AutofillManager i(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue j(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return AutofillManager.class;
    }
}
