package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaDescription f403i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f395a = str;
        this.f396b = charSequence;
        this.f397c = charSequence2;
        this.f398d = charSequence3;
        this.f399e = bitmap;
        this.f400f = uri;
        this.f401g = bundle;
        this.f402h = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f396b) + ", " + ((Object) this.f397c) + ", " + ((Object) this.f398d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle;
        int i11 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescriptionA = this.f403i;
        if (mediaDescriptionA == null) {
            MediaDescription.Builder builderB = b.b();
            b.n(builderB, this.f395a);
            b.p(builderB, this.f396b);
            b.o(builderB, this.f397c);
            b.j(builderB, this.f398d);
            b.l(builderB, this.f399e);
            b.m(builderB, this.f400f);
            Bundle bundle2 = this.f401g;
            Uri uri = this.f402h;
            if (i11 >= 23 || uri == null) {
                b.k(builderB, bundle2);
            } else {
                if (bundle2 == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                } else {
                    bundle = new Bundle(bundle2);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
                b.k(builderB, bundle);
            }
            if (i11 >= 23) {
                d.b(builderB, uri);
            }
            mediaDescriptionA = b.a(builderB);
            this.f403i = mediaDescriptionA;
        }
        mediaDescriptionA.writeToParcel(parcel, i10);
    }
}
