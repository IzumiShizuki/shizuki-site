package c7;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements Parcelable {
    public static final Parcelable.Creator<o1> CREATOR = new android.support.v4.media.a(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f3676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f3678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PlaybackState.CustomAction f3679e;

    public o1(String str, CharSequence charSequence, int i10, Bundle bundle) {
        this.f3675a = str;
        this.f3676b = charSequence;
        this.f3677c = i10;
        this.f3678d = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f3676b) + ", mIcon=" + this.f3677c + ", mExtras=" + this.f3678d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3675a);
        TextUtils.writeToParcel(this.f3676b, parcel, i10);
        parcel.writeInt(this.f3677c);
        parcel.writeBundle(this.f3678d);
    }

    public o1(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        this.f3675a = string;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f3676b = charSequence;
        this.f3677c = parcel.readInt();
        this.f3678d = parcel.readBundle(e1.class.getClassLoader());
    }
}
