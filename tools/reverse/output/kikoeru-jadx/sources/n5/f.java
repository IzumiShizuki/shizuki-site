package n5;

import java.util.Arrays;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15330d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15327a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15328b = 65536;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15331e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a[] f15332f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10 = i10 < this.f15329c;
        this.f15329c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int iMax = Math.max(0, c0.f(this.f15329c, this.f15328b) - this.f15330d);
        int i10 = this.f15331e;
        if (iMax >= i10) {
            return;
        }
        Arrays.fill(this.f15332f, iMax, i10, (Object) null);
        this.f15331e = iMax;
    }
}
