package okhttp3.internal.platform;

import android.content.Context;
import d8.b;
import fh.d;
import fh.e;
import java.util.List;
import jc.l;
import kotlin.Metadata;
import vb.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Ld8/b;", "Lfh/e;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlatformInitializer implements b {
    @Override // d8.b
    public final List a() {
        return r.f22819a;
    }

    @Override // d8.b
    public final Object b(Context context) {
        l.e(context, "context");
        e eVar = e.f7102a;
        Object obj = e.f7102a;
        d dVar = obj != null ? (d) obj : null;
        if (dVar != null) {
            dVar.a(context);
        }
        return e.f7102a;
    }
}
