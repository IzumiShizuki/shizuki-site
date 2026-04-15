package q8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f17915b;

    public b(Map map, String str) {
        this.f17914a = str;
        this.f17915b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f17914a, bVar.f17914a) && l.a(this.f17915b, bVar.f17915b);
    }

    public final int hashCode() {
        return this.f17915b.hashCode() + (this.f17914a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f17914a + ", extras=" + this.f17915b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17914a);
        Map map = this.f17915b;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
