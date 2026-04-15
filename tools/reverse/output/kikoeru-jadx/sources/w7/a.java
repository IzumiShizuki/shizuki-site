package w7;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;
import ua.j;
import ub.k;
import vb.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f23431a = new LinkedHashSet();

    public a(v2.e eVar) {
        eVar.y("androidx.savedstate.Restarter", this);
    }

    @Override // w7.d
    public final Bundle a() {
        Bundle bundleC = n7.d.c((k[]) Arrays.copyOf(new k[0], 0));
        j.v(bundleC, "classes_to_restore", m.G0(this.f23431a));
        return bundleC;
    }
}
