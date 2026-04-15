package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import m4.b1;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new android.support.v4.media.a(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f951g;

    public o(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2) {
        int iG = c0.G(uri, str2);
        if (iG == 0 || iG == 2 || iG == 1) {
            p4.c.b("customCacheKey must be null for type: " + iG, str3 == null);
        }
        this.f945a = str;
        this.f946b = uri;
        this.f947c = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f948d = Collections.unmodifiableList(arrayList);
        this.f949e = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f950f = str3;
        this.f951g = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : c0.f16553f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f945a.equals(oVar.f945a) && this.f946b.equals(oVar.f946b)) {
            String str = oVar.f947c;
            int i10 = c0.f16548a;
            if (Objects.equals(this.f947c, str) && this.f948d.equals(oVar.f948d) && Arrays.equals(this.f949e, oVar.f949e) && Objects.equals(this.f950f, oVar.f950f) && Arrays.equals(this.f951g, oVar.f951g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f946b.hashCode() + (this.f945a.hashCode() * 961)) * 31;
        String str = this.f947c;
        int iHashCode2 = (Arrays.hashCode(this.f949e) + ((this.f948d.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f950f;
        return Arrays.hashCode(this.f951g) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f947c + ":" + this.f945a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f945a);
        parcel.writeString(this.f946b.toString());
        parcel.writeString(this.f947c);
        List list = this.f948d;
        parcel.writeInt(list.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            parcel.writeParcelable((Parcelable) list.get(i11), 0);
        }
        parcel.writeByteArray(this.f949e);
        parcel.writeString(this.f950f);
        parcel.writeByteArray(this.f951g);
    }

    public o(Parcel parcel) {
        String string = parcel.readString();
        int i10 = c0.f16548a;
        this.f945a = string;
        this.f946b = Uri.parse(parcel.readString());
        this.f947c = parcel.readString();
        int i11 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add((b1) parcel.readParcelable(b1.class.getClassLoader()));
        }
        this.f948d = Collections.unmodifiableList(arrayList);
        this.f949e = parcel.createByteArray();
        this.f950f = parcel.readString();
        this.f951g = parcel.createByteArray();
    }
}
