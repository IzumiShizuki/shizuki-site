package h7;

import android.os.Bundle;
import androidx.lifecycle.m0;
import androidx.lifecycle.p;
import androidx.lifecycle.q0;
import androidx.lifecycle.z;
import e7.m;
import e7.u;
import java.util.Arrays;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e7.j f8134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f8135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f8136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f8137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f8138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f8139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f8140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v2.e f8141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8142i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z f8143j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p f8144k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q0 f8145l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ub.p f8146m;

    public c(e7.j jVar) {
        this.f8134a = jVar;
        this.f8135b = jVar.f6334b;
        this.f8136c = jVar.f6335c;
        this.f8137d = jVar.f6336d;
        this.f8138e = jVar.f6337e;
        this.f8139f = jVar.f6338f;
        this.f8140g = jVar.f6339g;
        this.f8141h = new v2.e(new m4.z(jVar, new t9.f(5, jVar)));
        ub.p pVarD = ub.a.d(new e.e(19));
        this.f8143j = new z(jVar, true);
        this.f8144k = p.f795b;
        this.f8145l = (q0) pVarD.getValue();
        this.f8146m = ub.a.d(new e.e(20));
    }

    public final Bundle a() {
        Bundle bundle = this.f8136c;
        if (bundle == null) {
            return null;
        }
        Bundle bundleC = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
        bundleC.putAll(bundle);
        return bundleC;
    }

    public final void b() {
        if (!this.f8142i) {
            v2.e eVar = this.f8141h;
            ((m4.z) eVar.f22364b).a();
            this.f8142i = true;
            if (this.f8138e != null) {
                m0.c(this.f8134a);
            }
            eVar.t(this.f8140g);
        }
        int iOrdinal = this.f8137d.ordinal();
        int iOrdinal2 = this.f8144k.ordinal();
        z zVar = this.f8143j;
        if (iOrdinal < iOrdinal2) {
            zVar.F1(this.f8137d);
        } else {
            zVar.F1(this.f8144k);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(jc.z.f10839a.b(e7.j.class).y());
        sb.append("(" + this.f8139f + ')');
        sb.append(" destination=");
        sb.append(this.f8135b);
        String string = sb.toString();
        l.d(string, "toString(...)");
        return string;
    }
}
