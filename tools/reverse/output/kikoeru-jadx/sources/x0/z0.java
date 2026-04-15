package x0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24528a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f24528a) {
            case 0:
                return new a1(parcel.readFloat());
            case 1:
                return new b1(parcel.readInt());
            default:
                return new c1(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f24528a) {
            case 0:
                return new a1[i10];
            case 1:
                return new b1[i10];
            default:
                return new c1[i10];
        }
    }
}
