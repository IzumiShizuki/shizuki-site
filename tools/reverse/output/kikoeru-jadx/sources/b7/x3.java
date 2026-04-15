package b7;

import android.media.VolumeProvider;
import android.os.Build;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public VolumeProvider f2184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Handler f2185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z3 f2186g;

    public x3(z3 z3Var, int i10, int i11, int i12, String str, Handler handler) {
        this.f2186g = z3Var;
        this.f2185f = handler;
        this.f2180a = i10;
        this.f2181b = i11;
        this.f2183d = i12;
        this.f2182c = str;
    }

    public final VolumeProvider a() {
        x3 x3Var;
        if (this.f2184e != null) {
            x3Var = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            x3Var = this;
            x3Var.f2184e = new c7.r1(x3Var, this.f2180a, this.f2181b, this.f2183d, this.f2182c);
        } else {
            x3Var = this;
            x3Var.f2184e = new c7.s1(this, x3Var.f2180a, x3Var.f2181b, x3Var.f2183d);
        }
        return x3Var.f2184e;
    }
}
