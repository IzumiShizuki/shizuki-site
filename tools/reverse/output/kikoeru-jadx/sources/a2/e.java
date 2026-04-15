package a2;

import android.view.KeyEvent;
import ic.k;
import j1.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends p implements d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k f192o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k f193p;

    @Override // a2.d
    public final boolean i(KeyEvent keyEvent) {
        k kVar = this.f193p;
        if (kVar != null) {
            return ((Boolean) kVar.a(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // a2.d
    public final boolean v(KeyEvent keyEvent) {
        k kVar = this.f192o;
        if (kVar != null) {
            return ((Boolean) kVar.a(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
