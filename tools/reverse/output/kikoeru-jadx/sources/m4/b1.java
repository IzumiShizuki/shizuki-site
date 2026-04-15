package m4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<b1> CREATOR = new l(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f14137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f14138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f14139f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14142c;

    static {
        int i10 = p4.c0.f16548a;
        f14137d = Integer.toString(0, 36);
        f14138e = Integer.toString(1, 36);
        f14139f = Integer.toString(2, 36);
    }

    public b1(int i10, int i11, int i12) {
        this.f14140a = i10;
        this.f14141b = i11;
        this.f14142c = i12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b1 b1Var = (b1) obj;
        int i10 = this.f14140a - b1Var.f14140a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f14141b - b1Var.f14141b;
        return i11 == 0 ? this.f14142c - b1Var.f14142c : i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (this.f14140a == b1Var.f14140a && this.f14141b == b1Var.f14141b && this.f14142c == b1Var.f14142c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f14140a * 31) + this.f14141b) * 31) + this.f14142c;
    }

    public final String toString() {
        return this.f14140a + "." + this.f14141b + "." + this.f14142c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14140a);
        parcel.writeInt(this.f14141b);
        parcel.writeInt(this.f14142c);
    }

    public b1(Parcel parcel) {
        this.f14140a = parcel.readInt();
        this.f14141b = parcel.readInt();
        this.f14142c = parcel.readInt();
    }
}
