package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import g8.c;
import g8.d;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f1071a;

    public ParcelImpl(d dVar) {
        this.f1071a = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        new c(parcel).l(this.f1071a);
    }

    public ParcelImpl(Parcel parcel) {
        this.f1071a = new c(parcel).h();
    }
}
