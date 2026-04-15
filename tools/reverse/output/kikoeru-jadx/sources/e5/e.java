package e5;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Objects;
import ya.a1;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f6175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f6176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f6180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f6181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f6183j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f6184k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i0 f6185l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i0 f6186m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i0 f6187n;

    public e(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, a1 a1Var) {
        p4.c.c((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f6174a = str;
        this.f6175b = uri;
        this.f6176c = uri2;
        this.f6177d = j10;
        this.f6178e = j11;
        this.f6179f = j12;
        this.f6180g = j13;
        this.f6181h = arrayList;
        this.f6182i = z10;
        this.f6183j = j14;
        this.f6184k = j15;
        this.f6185l = i0.q(arrayList2);
        this.f6186m = i0.q(arrayList3);
        this.f6187n = i0.q(a1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f6177d == eVar.f6177d && this.f6178e == eVar.f6178e && this.f6179f == eVar.f6179f && this.f6180g == eVar.f6180g && this.f6182i == eVar.f6182i && this.f6183j == eVar.f6183j && this.f6184k == eVar.f6184k && Objects.equals(this.f6174a, eVar.f6174a) && Objects.equals(this.f6175b, eVar.f6175b) && Objects.equals(this.f6176c, eVar.f6176c) && Objects.equals(this.f6181h, eVar.f6181h) && Objects.equals(this.f6185l, eVar.f6185l) && Objects.equals(this.f6186m, eVar.f6186m) && Objects.equals(this.f6187n, eVar.f6187n);
    }

    public final int hashCode() {
        return Objects.hash(this.f6174a, this.f6175b, this.f6176c, Long.valueOf(this.f6177d), Long.valueOf(this.f6178e), Long.valueOf(this.f6179f), Long.valueOf(this.f6180g), this.f6181h, Boolean.valueOf(this.f6182i), Long.valueOf(this.f6183j), Long.valueOf(this.f6184k), this.f6185l, this.f6186m, this.f6187n);
    }
}
