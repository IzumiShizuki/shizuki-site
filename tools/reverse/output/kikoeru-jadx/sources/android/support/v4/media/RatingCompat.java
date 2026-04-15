package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f406b;

    public RatingCompat(float f10, int i10) {
        this.f405a = i10;
        this.f406b = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f405a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f405a);
        sb.append(" rating=");
        float f10 = this.f406b;
        sb.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f405a);
        parcel.writeFloat(this.f406b);
    }
}
