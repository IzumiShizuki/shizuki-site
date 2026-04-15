package m7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Parcelable {
    public static final Parcelable.Creator<j0> CREATOR = new android.support.v4.media.a(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f14896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f14898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f14899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14901i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14902j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14893a);
        parcel.writeInt(this.f14894b);
        parcel.writeInt(this.f14895c);
        if (this.f14895c > 0) {
            parcel.writeIntArray(this.f14896d);
        }
        parcel.writeInt(this.f14897e);
        if (this.f14897e > 0) {
            parcel.writeIntArray(this.f14898f);
        }
        parcel.writeInt(this.f14900h ? 1 : 0);
        parcel.writeInt(this.f14901i ? 1 : 0);
        parcel.writeInt(this.f14902j ? 1 : 0);
        parcel.writeList(this.f14899g);
    }
}
