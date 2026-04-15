package c7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements Parcelable {
    public static final Parcelable.Creator<m1> CREATOR = new android.support.v4.media.a(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3671e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3667a);
        parcel.writeInt(this.f3669c);
        parcel.writeInt(this.f3670d);
        parcel.writeInt(this.f3671e);
        parcel.writeInt(this.f3668b);
    }
}
