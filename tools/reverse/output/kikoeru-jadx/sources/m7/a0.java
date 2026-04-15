package m7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends a4.b {
    public static final Parcelable.Creator<a0> CREATOR = new h1.r(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Parcelable f14817c;

    public a0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f14817c = parcel.readParcelable(classLoader == null ? s.class.getClassLoader() : classLoader);
    }

    @Override // a4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f14817c, 0);
    }
}
