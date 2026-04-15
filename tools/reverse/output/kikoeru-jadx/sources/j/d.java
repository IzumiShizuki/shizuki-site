package j;

import android.animation.TimeInterpolator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f9558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9560c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        int i10 = (int) ((f10 * this.f9560c) + 0.5f);
        int i11 = this.f9559b;
        int[] iArr = this.f9558a;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = iArr[i12];
            if (i10 < i13) {
                break;
            }
            i10 -= i13;
            i12++;
        }
        return (i12 / i11) + (i12 < i11 ? i10 / this.f9560c : 0.0f);
    }
}
