package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f417e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f413a);
        parcel.writeInt(this.f415c);
        parcel.writeInt(this.f416d);
        parcel.writeInt(this.f417e);
        parcel.writeInt(this.f414b);
    }
}
