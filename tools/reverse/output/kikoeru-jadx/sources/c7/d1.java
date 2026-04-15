package c7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements Parcelable {
    public static final Parcelable.Creator<d1> CREATOR = new android.support.v4.media.a(11);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f3608c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3606a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g8.d f3609d = null;

    public d1(Object obj, h hVar) {
        this.f3607b = obj;
        this.f3608c = hVar;
    }

    public final h a() {
        h hVar;
        synchronized (this.f3606a) {
            hVar = this.f3608c;
        }
        return hVar;
    }

    public final void b(h hVar) {
        synchronized (this.f3606a) {
            this.f3608c = hVar;
        }
    }

    public final void c(g8.d dVar) {
        synchronized (this.f3606a) {
            this.f3609d = dVar;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        Object obj2 = ((d1) obj).f3607b;
        Object obj3 = this.f3607b;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f3607b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable((Parcelable) this.f3607b, i10);
    }
}
