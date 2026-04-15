package j2;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.cnl.kikoeru.R;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f9882a = new LinkedHashMap();

    public static final lf.z0 a(Context context) {
        lf.z0 z0Var;
        LinkedHashMap linkedHashMap = f9882a;
        synchronized (linkedHashMap) {
            try {
                Object k0Var = linkedHashMap.get(context);
                if (k0Var == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    kf.f fVarC = g8.a.c(-1, 6, null);
                    i7.n nVar = new i7.n(new ea.f(contentResolver, uriFor, new k3(fVarC, n7.e.h(Looper.getMainLooper())), fVarC, context, null));
                    nf.d dVarD = hf.a0.d();
                    lf.y0 y0Var = new lf.y0(0L);
                    Float fValueOf = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                    k9.c cVarI = lf.p0.i(nVar);
                    lf.b1 b1VarC = lf.p0.c(fValueOf);
                    hf.a0.x(dVarD, (yb.h) cVarI.f11236e, y0Var.equals(lf.s0.f12491a) ? hf.z.f8616a : hf.z.f8619d, new e.j(y0Var, (lf.f) cVarI.f11235d, b1VarC, fValueOf, (yb.c) null));
                    k0Var = new lf.k0(b1VarC);
                    linkedHashMap.put(context, k0Var);
                }
                z0Var = (lf.z0) k0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z0Var;
    }

    public static final x0.r b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof x0.r) {
            return (x0.r) tag;
        }
        return null;
    }
}
