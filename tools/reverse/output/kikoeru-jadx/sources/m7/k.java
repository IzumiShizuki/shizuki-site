package m7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new android.support.v4.media.a(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14905c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14903a);
        parcel.writeInt(this.f14904b);
        parcel.writeInt(this.f14905c ? 1 : 0);
    }
}
