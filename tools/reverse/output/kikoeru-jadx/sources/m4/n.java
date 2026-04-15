package m4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Comparator, Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new l(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m[] f14405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14408d;

    public n(String str, ArrayList arrayList) {
        this(str, false, (m[]) arrayList.toArray(new m[0]));
    }

    public final n a(String str) {
        int i10 = p4.c0.f16548a;
        return Objects.equals(this.f14407c, str) ? this : new n(str, false, this.f14405a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        m mVar = (m) obj;
        m mVar2 = (m) obj2;
        UUID uuid = g.f14208a;
        return uuid.equals(mVar.f14394b) ? uuid.equals(mVar2.f14394b) ? 0 : 1 : mVar.f14394b.compareTo(mVar2.f14394b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            String str = nVar.f14407c;
            int i10 = p4.c0.f16548a;
            if (Objects.equals(this.f14407c, str) && Arrays.equals(this.f14405a, nVar.f14405a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f14406b == 0) {
            String str = this.f14407c;
            this.f14406b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f14405a);
        }
        return this.f14406b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14407c);
        parcel.writeTypedArray(this.f14405a, 0);
    }

    public n(String str, boolean z10, m... mVarArr) {
        this.f14407c = str;
        mVarArr = z10 ? (m[]) mVarArr.clone() : mVarArr;
        this.f14405a = mVarArr;
        this.f14408d = mVarArr.length;
        Arrays.sort(mVarArr, this);
    }

    public n(Parcel parcel) {
        this.f14407c = parcel.readString();
        m[] mVarArr = (m[]) parcel.createTypedArray(m.CREATOR);
        int i10 = p4.c0.f16548a;
        this.f14405a = mVarArr;
        this.f14408d = mVarArr.length;
    }
}
