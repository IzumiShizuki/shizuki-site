package e7;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f6370b;

    public /* synthetic */ p(int i10, Bundle bundle) {
        this.f6369a = i10;
        this.f6370b = bundle;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        boolean zContainsKey;
        String str = (String) obj;
        switch (this.f6369a) {
            case 0:
                jc.l.e(str, "argName");
                Bundle bundle = this.f6370b;
                jc.l.e(bundle, "source");
                zContainsKey = bundle.containsKey(str);
                break;
            default:
                jc.l.e(str, "key");
                Bundle bundle2 = this.f6370b;
                jc.l.e(bundle2, "source");
                zContainsKey = bundle2.containsKey(str);
                break;
        }
        return Boolean.valueOf(!zContainsKey);
    }
}
