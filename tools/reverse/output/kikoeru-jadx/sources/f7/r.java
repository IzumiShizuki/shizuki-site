package f7;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.PowerManager;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6790b;

    public /* synthetic */ r(Context context, int i10) {
        this.f6789a = i10;
        this.f6790b = context;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f6789a) {
            case 0:
                return gh.g.q(this.f6790b);
            default:
                Context context = this.f6790b;
                String packageName = context.getPackageName();
                PowerManager powerManager = (PowerManager) android.support.v4.media.session.b.I(context, PowerManager.class);
                if (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) {
                    Intent intent = new Intent();
                    intent.setAction("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                    intent.setData(Uri.parse("package:" + packageName));
                    context.startActivity(intent);
                }
                return a0.f21526a;
        }
    }
}
