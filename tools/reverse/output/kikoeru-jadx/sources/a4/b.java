package a4;

import android.os.Parcel;
import android.os.Parcelable;
import h1.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f199b = new a();
    public static final Parcelable.Creator<b> CREATOR = new r(1);

    public b() {
        this.f200a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f200a, i10);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f200a = parcelable == f199b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f200a = parcelable == null ? f199b : parcelable;
    }
}
