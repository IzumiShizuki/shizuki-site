package m4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new l(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f14394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f14397e;

    public m(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f14394b = uuid;
        this.f14395c = str;
        str2.getClass();
        this.f14396d = o0.p(str2);
        this.f14397e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = g.f14208a;
        UUID uuid3 = this.f14394b;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        m mVar = (m) obj;
        String str = mVar.f14395c;
        int i10 = p4.c0.f16548a;
        return Objects.equals(this.f14395c, str) && Objects.equals(this.f14396d, mVar.f14396d) && Objects.equals(this.f14394b, mVar.f14394b) && Arrays.equals(this.f14397e, mVar.f14397e);
    }

    public final int hashCode() {
        if (this.f14393a == 0) {
            int iHashCode = this.f14394b.hashCode() * 31;
            String str = this.f14395c;
            this.f14393a = Arrays.hashCode(this.f14397e) + j2.h0.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f14396d);
        }
        return this.f14393a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f14394b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f14395c);
        parcel.writeString(this.f14396d);
        parcel.writeByteArray(this.f14397e);
    }

    public m(Parcel parcel) {
        this.f14394b = new UUID(parcel.readLong(), parcel.readLong());
        this.f14395c = parcel.readString();
        String string = parcel.readString();
        int i10 = p4.c0.f16548a;
        this.f14396d = string;
        this.f14397e = parcel.createByteArray();
    }
}
