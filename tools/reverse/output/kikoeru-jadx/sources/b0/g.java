package b0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1250a;

    public g(int i10) {
        this.f1250a = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f1250a == ((g) obj).f1250a;
    }

    public final int hashCode() {
        return this.f1250a;
    }

    public final String toString() {
        return j2.h0.m(new StringBuilder("DefaultLazyKey(index="), this.f1250a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1250a);
    }
}
