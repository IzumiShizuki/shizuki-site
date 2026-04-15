package s3;

import android.net.Uri;
import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f19375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19380f;

    public f(Uri uri, int i10, int i11, boolean z10, int i12) {
        uri.getClass();
        this.f19375a = uri;
        this.f19376b = i10;
        this.f19377c = i11;
        this.f19378d = z10;
        this.f19379e = null;
        this.f19380f = i12;
    }

    public f(String str, String str2) {
        this.f19375a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f19376b = 0;
        this.f19377c = TinkerReport.KEY_LOADED_SUCC_COST_500_LESS;
        this.f19378d = false;
        this.f19379e = str2;
        this.f19380f = 0;
    }
}
