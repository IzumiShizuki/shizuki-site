package va;

import android.os.Handler;
import android.os.Looper;
import jc.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f22805b = new b(0);

    @Override // ic.a
    public final Object b() {
        return new Handler(Looper.getMainLooper());
    }
}
