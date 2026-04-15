package e7;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Le7/b;", "Le7/m0;", "Le7/a;", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@l0("activity")
public class b extends m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f6305c;

    public b(Context context) {
        Object next;
        jc.l.e(context, "context");
        Iterator it = df.m.b0(context, new d9.i(11)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f6305c = (Activity) next;
    }

    @Override // e7.m0
    public final u a() {
        return new a(this);
    }

    @Override // e7.m0
    public final u c(u uVar) {
        throw new IllegalStateException(("Destination " + ((a) uVar).f6400b.f8187a + " does not have an Intent set.").toString());
    }

    @Override // e7.m0
    public final boolean f() {
        Activity activity = this.f6305c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
