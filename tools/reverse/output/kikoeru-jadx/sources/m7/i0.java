package m7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new android.support.v4.media.a(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f14886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14887d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f14884a + ", mGapDir=" + this.f14885b + ", mHasUnwantedGapAfter=" + this.f14887d + ", mGapPerSpan=" + Arrays.toString(this.f14886c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14884a);
        parcel.writeInt(this.f14885b);
        parcel.writeInt(this.f14887d ? 1 : 0);
        int[] iArr = this.f14886c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f14886c);
        }
    }
}
