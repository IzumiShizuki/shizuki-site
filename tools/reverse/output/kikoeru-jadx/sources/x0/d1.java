package x0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements Parcelable.ClassLoaderCreator {
    public static e1 a(Parcel parcel, ClassLoader classLoader) {
        r0 r0Var;
        if (classLoader == null) {
            classLoader = d1.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i10 = parcel.readInt();
        if (i10 == 0) {
            r0Var = r0.f24436c;
        } else if (i10 == 1) {
            r0Var = r0.f24439f;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException(q.t0.C(i10, "Unsupported MutableState policy ", " was restored"));
            }
            r0Var = r0.f24437d;
        }
        return new e1(value, r0Var);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new e1[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
