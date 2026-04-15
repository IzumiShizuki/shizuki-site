package c7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new android.support.v4.media.a(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f3666b;

    public m(Parcel parcel) {
        this.f3665a = parcel.readInt();
        this.f3666b = q0.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f3665a + ", mDescription=" + this.f3666b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3665a);
        this.f3666b.writeToParcel(parcel, i10);
    }
}
