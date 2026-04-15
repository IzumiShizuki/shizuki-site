package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f428k;

    /* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bundle f432d;

        public CustomAction(Parcel parcel) {
            this.f429a = parcel.readString();
            this.f430b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f431c = parcel.readInt();
            this.f432d = parcel.readBundle(b.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f430b) + ", mIcon=" + this.f431c + ", mExtras=" + this.f432d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f429a);
            TextUtils.writeToParcel(this.f430b, parcel, i10);
            parcel.writeInt(this.f431c);
            parcel.writeBundle(this.f432d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f418a = parcel.readInt();
        this.f419b = parcel.readLong();
        this.f421d = parcel.readFloat();
        this.f425h = parcel.readLong();
        this.f420c = parcel.readLong();
        this.f422e = parcel.readLong();
        this.f424g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f426i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f427j = parcel.readLong();
        this.f428k = parcel.readBundle(b.class.getClassLoader());
        this.f423f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f418a);
        sb.append(", position=");
        sb.append(this.f419b);
        sb.append(", buffered position=");
        sb.append(this.f420c);
        sb.append(", speed=");
        sb.append(this.f421d);
        sb.append(", updated=");
        sb.append(this.f425h);
        sb.append(", actions=");
        sb.append(this.f422e);
        sb.append(", error code=");
        sb.append(this.f423f);
        sb.append(", error message=");
        sb.append(this.f424g);
        sb.append(", custom actions=");
        sb.append(this.f426i);
        sb.append(", active item id=");
        return a0.c.H(this.f427j, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f418a);
        parcel.writeLong(this.f419b);
        parcel.writeFloat(this.f421d);
        parcel.writeLong(this.f425h);
        parcel.writeLong(this.f420c);
        parcel.writeLong(this.f422e);
        TextUtils.writeToParcel(this.f424g, parcel, i10);
        parcel.writeTypedList(this.f426i);
        parcel.writeLong(this.f427j);
        parcel.writeBundle(this.f428k);
        parcel.writeInt(this.f423f);
    }
}
