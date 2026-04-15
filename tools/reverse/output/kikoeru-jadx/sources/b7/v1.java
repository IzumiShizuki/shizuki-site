package b7;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.media3.exoplayer.ExoPlayer;
import com.cnl.kikoeru.MainService;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class v1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f2116b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f2117c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f2118a;

    public v1(MainService mainService, ExoPlayer exoPlayer, PendingIntent pendingIntent, ya.i0 i0Var, ya.i0 i0Var2, ya.i0 i0Var3, pe.d dVar, Bundle bundle, Bundle bundle2, c7.e1 e1Var) {
        synchronized (f2116b) {
            HashMap map = f2117c;
            if (map.containsKey("")) {
                throw new IllegalStateException("Session ID must be unique. ID=");
            }
            map.put("", this);
        }
        this.f2118a = new c2(this, mainService, exoPlayer, pendingIntent, i0Var, i0Var2, i0Var3, dVar, bundle, bundle2, e1Var);
    }

    public final m4.y0 a() {
        return this.f2118a.f1693t.f2227a;
    }
}
