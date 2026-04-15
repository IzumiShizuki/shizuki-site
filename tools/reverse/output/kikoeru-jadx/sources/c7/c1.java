package c7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements Parcelable {
    public static final Parcelable.Creator<c1> CREATOR = new android.support.v4.media.a(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ResultReceiver f3598a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        this.f3598a.writeToParcel(parcel, i10);
    }
}
