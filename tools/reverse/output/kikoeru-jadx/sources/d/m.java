package d;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5228a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5229b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5230c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5231d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f5232e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f5233f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f5234g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n f5235h;

    public m(n nVar) {
        this.f5235h = nVar;
    }

    public final boolean a(int i10, int i11, Intent intent) {
        String str = (String) this.f5228a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        g.b bVar = (g.b) this.f5232e.get(str);
        if ((bVar != null ? bVar.f7106a : null) != null) {
            ArrayList arrayList = this.f5231d;
            if (arrayList.contains(str)) {
                ((ic.k) ((w0) bVar.f7106a.f903b).getValue()).a(bVar.f7107b.J(intent, i11));
                arrayList.remove(str);
                return true;
            }
        }
        this.f5233f.remove(str);
        this.f5234g.putParcelable(str, new g.a(intent, i11));
        return true;
    }

    public final void b(int i10, a.a aVar, Object obj) {
        Bundle bundleExtra;
        int i11;
        n nVar = this.f5235h;
        aVar.G(nVar, obj);
        Intent intentZ = aVar.z(nVar, obj);
        if (intentZ.getExtras() != null) {
            Bundle extras = intentZ.getExtras();
            jc.l.b(extras);
            if (extras.getClassLoader() == null) {
                intentZ.setExtrasClassLoader(nVar.getClassLoader());
            }
        }
        if (intentZ.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentZ.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentZ.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentZ.getAction())) {
            String[] stringArrayExtra = intentZ.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            android.support.v4.media.session.b.W(nVar, stringArrayExtra, i10);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentZ.getAction())) {
            nVar.startActivityForResult(intentZ, i10, bundle);
            return;
        }
        g.e eVar = (g.e) intentZ.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            jc.l.b(eVar);
            i11 = i10;
            try {
                nVar.startIntentSenderForResult(eVar.f7111a, i11, eVar.f7112b, eVar.f7113c, eVar.f7114d, 0, bundle);
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                new Handler(Looper.getMainLooper()).post(new b5.n(this, i11, e, 2));
            }
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
            i11 = i10;
        }
    }
}
