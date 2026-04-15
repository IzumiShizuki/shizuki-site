package g1;

import android.os.Bundle;
import androidx.lifecycle.n0;
import androidx.lifecycle.q;
import androidx.lifecycle.z;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements g, w7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f7147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v2.e f7148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f7149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v2.e f7150d;

    public j(h hVar) {
        this.f7147a = hVar;
        v2.e eVar = new v2.e(new m4.z(this, new t9.f(5, this)));
        this.f7148b = eVar;
        this.f7149c = new z(this, false);
        this.f7150d = (v2.e) eVar.f22365c;
        Object objD = hVar.d("androidx.savedstate.SavedStateRegistry");
        eVar.t(objD instanceof Bundle ? (Bundle) objD : null);
        hVar.g("androidx.savedstate.SavedStateRegistry", new n0(11, this));
    }

    @Override // g1.g
    public final boolean b(Object obj) {
        return this.f7147a.b(obj);
    }

    @Override // g1.g
    public final Map c() {
        return this.f7147a.c();
    }

    @Override // g1.g
    public final Object d(String str) {
        return this.f7147a.d(str);
    }

    @Override // w7.e
    public final v2.e e() {
        return this.f7150d;
    }

    @Override // androidx.lifecycle.x
    public final q f() {
        return this.f7149c;
    }

    @Override // g1.g
    public final f g(String str, ic.a aVar) {
        return this.f7147a.g(str, aVar);
    }
}
