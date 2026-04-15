package androidx.lifecycle;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements w7.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v2.e f790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ub.p f793d;

    public o0(v2.e eVar, x0 x0Var) {
        jc.l.e(eVar, "savedStateRegistry");
        this.f790a = eVar;
        this.f793d = ub.a.d(new n0(0, x0Var));
    }

    @Override // w7.d
    public final Bundle a() {
        Bundle bundleC = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
        Bundle bundle = this.f792c;
        if (bundle != null) {
            bundleC.putAll(bundle);
        }
        for (Map.Entry entry : ((p0) this.f793d.getValue()).f800b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((d.h) ((j0) entry.getValue()).f777b.f4205f).a();
            if (!bundleA.isEmpty()) {
                ua.j.t(bundleC, str, bundleA);
            }
        }
        this.f791b = false;
        return bundleC;
    }

    public final void b() {
        if (this.f791b) {
            return;
        }
        Bundle bundleP = this.f790a.p("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleC = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
        Bundle bundle = this.f792c;
        if (bundle != null) {
            bundleC.putAll(bundle);
        }
        if (bundleP != null) {
            bundleC.putAll(bundleP);
        }
        this.f792c = bundleC;
        this.f791b = true;
    }
}
