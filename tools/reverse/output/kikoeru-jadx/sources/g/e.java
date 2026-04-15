package g;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new android.support.v4.media.a(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentSender f7111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f7112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7114d;

    public e(Parcel parcel) {
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        l.b(parcelable);
        Intent intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        int i10 = parcel.readInt();
        int i11 = parcel.readInt();
        this.f7111a = (IntentSender) parcelable;
        this.f7112b = intent;
        this.f7113c = i10;
        this.f7114d = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.e(parcel, "dest");
        parcel.writeParcelable(this.f7111a, i10);
        parcel.writeParcelable(this.f7112b, i10);
        parcel.writeInt(this.f7113c);
        parcel.writeInt(this.f7114d);
    }
}
