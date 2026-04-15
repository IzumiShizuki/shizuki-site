package e7;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f6392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f6393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6397f;

    public t(u uVar, Bundle bundle, boolean z10, int i10, boolean z11, int i11) {
        this.f6392a = uVar;
        this.f6393b = bundle;
        this.f6394c = z10;
        this.f6395d = i10;
        this.f6396e = z11;
        this.f6397f = i11;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(t tVar) {
        jc.l.e(tVar, "other");
        boolean z10 = tVar.f6396e;
        boolean z11 = tVar.f6394c;
        Bundle bundle = tVar.f6393b;
        boolean z12 = this.f6394c;
        if (z12 && !z11) {
            return 1;
        }
        if (!z12 && z11) {
            return -1;
        }
        int i10 = this.f6395d - tVar.f6395d;
        if (i10 > 0) {
            return 1;
        }
        if (i10 < 0) {
            return -1;
        }
        Bundle bundle2 = this.f6393b;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            jc.l.e(bundle2, "source");
            int size = bundle2.size();
            jc.l.b(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z13 = this.f6396e;
        if (z13 && !z10) {
            return 1;
        }
        if (z13 || !z10) {
            return this.f6397f - tVar.f6397f;
        }
        return -1;
    }
}
