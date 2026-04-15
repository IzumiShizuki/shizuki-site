package h1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8065a;

    public /* synthetic */ r(int i10) {
        this.f8065a = i10;
    }

    public static s a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = r.class.getClassLoader();
        }
        int i10 = parcel.readInt();
        if (i10 == 0) {
            return new s();
        }
        b1.g gVarL = b1.j.f1444b.l();
        for (int i11 = 0; i11 < i10; i11++) {
            gVarL.add(parcel.readValue(classLoader));
        }
        return new s(gVarL.j());
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f8065a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return a4.b.f199b;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return new m7.a0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f8065a) {
            case 0:
                return new s[i10];
            case 1:
                return new a4.b[i10];
            default:
                return new m7.a0[i10];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f8065a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return a4.b.f199b;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return new m7.a0(parcel, null);
        }
    }
}
