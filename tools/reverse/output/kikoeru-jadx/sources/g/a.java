package g;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f7105b;

    public a(Intent intent, int i10) {
        this.f7104a = i10;
        this.f7105b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i10 = this.f7104a;
        sb.append(i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f7105b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.e(parcel, "dest");
        parcel.writeInt(this.f7104a);
        Intent intent = this.f7105b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
