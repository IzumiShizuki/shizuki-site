package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import d8.b;
import g5.w;
import java.util.Collections;
import java.util.List;
import k7.e;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // d8.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // d8.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new w(23);
        }
        Choreographer.getInstance().postFrameCallback(new e(this, context.getApplicationContext()));
        return new w(23);
    }
}
