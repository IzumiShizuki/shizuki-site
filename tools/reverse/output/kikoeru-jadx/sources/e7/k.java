package e7;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4.p f6342a;

    public k(j jVar) {
        this.f6342a = new p4.p(jVar, jVar.f6334b.f6400b.f8187a);
    }

    public k(Bundle bundle) {
        jc.l.e(bundle, "state");
        bundle.setClassLoader(k.class.getClassLoader());
        this.f6342a = new p4.p(bundle);
    }
}
