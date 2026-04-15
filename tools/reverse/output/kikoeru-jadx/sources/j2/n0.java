package j2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f9919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o2.c f9920b;

    public n0(Configuration configuration, o2.c cVar) {
        this.f9919a = configuration;
        this.f9920b = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f9919a;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f9920b.f16146a.entrySet().iterator();
        while (it.hasNext()) {
            o2.a aVar = (o2.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.f16144b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f9920b.f16146a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        this.f9920b.f16146a.clear();
    }
}
