package c7;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements Parcelable {
    public static final Parcelable.Creator<q0> CREATOR = new android.support.v4.media.a(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f3701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f3702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f3703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f3704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f3705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f3706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f3707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaDescription f3708i;

    public q0(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f3700a = str;
        this.f3701b = charSequence;
        this.f3702c = charSequence2;
        this.f3703d = charSequence3;
        this.f3704e = bitmap;
        this.f3705f = uri;
        this.f3706g = bundle;
        this.f3707h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c7.q0 a(java.lang.Object r13) {
        /*
            r0 = 0
            if (r13 == 0) goto L79
            android.media.MediaDescription r13 = (android.media.MediaDescription) r13
            java.lang.String r2 = r13.getMediaId()
            java.lang.CharSequence r3 = r13.getTitle()
            java.lang.CharSequence r4 = r13.getSubtitle()
            java.lang.CharSequence r5 = r13.getDescription()
            android.graphics.Bitmap r6 = r13.getIconBitmap()
            android.net.Uri r7 = r13.getIconUri()
            android.os.Bundle r1 = r13.getExtras()
            if (r1 != 0) goto L25
        L23:
            r1 = r0
            goto L34
        L25:
            c7.e1.t(r1)
            r1.isEmpty()     // Catch: android.os.BadParcelableException -> L2c
            goto L34
        L2c:
            java.lang.String r1 = "MediaSessionCompat"
            java.lang.String r8 = "Could not unparcel the data."
            android.util.Log.e(r1, r8)
            goto L23
        L34:
            if (r1 == 0) goto L3c
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r1)
            r1 = r8
        L3c:
            if (r1 == 0) goto L61
            java.lang.String r8 = "android.support.v4.media.description.MEDIA_URI"
            android.os.Parcelable r9 = r1.getParcelable(r8)
            android.net.Uri r9 = (android.net.Uri) r9
            if (r9 == 0) goto L5f
            java.lang.String r10 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r11 = r1.containsKey(r10)
            if (r11 == 0) goto L59
            int r11 = r1.size()
            r12 = 2
            if (r11 != r12) goto L59
            r8 = r0
            goto L63
        L59:
            r1.remove(r8)
            r1.remove(r10)
        L5f:
            r8 = r1
            goto L63
        L61:
            r9 = r0
            goto L5f
        L63:
            if (r9 == 0) goto L66
            goto L71
        L66:
            int r1 = android.os.Build.VERSION.SDK_INT
            r9 = 23
            if (r1 < r9) goto L70
            android.net.Uri r0 = c7.p0.d(r13)
        L70:
            r9 = r0
        L71:
            c7.q0 r1 = new c7.q0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1.f3708i = r13
            return r1
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.q0.a(java.lang.Object):c7.q0");
    }

    public final MediaDescription b() {
        Bundle bundle;
        MediaDescription mediaDescription = this.f3708i;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f3700a);
        builder.setTitle(this.f3701b);
        builder.setSubtitle(this.f3702c);
        builder.setDescription(this.f3703d);
        builder.setIconBitmap(this.f3704e);
        builder.setIconUri(this.f3705f);
        int i10 = Build.VERSION.SDK_INT;
        Bundle bundle2 = this.f3706g;
        Uri uri = this.f3707h;
        if (i10 >= 23 || uri == null) {
            builder.setExtras(bundle2);
        } else {
            if (bundle2 == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            } else {
                bundle = new Bundle(bundle2);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
            builder.setExtras(bundle);
        }
        if (i10 >= 23) {
            p0.o(builder, uri);
        }
        MediaDescription mediaDescriptionBuild = builder.build();
        this.f3708i = mediaDescriptionBuild;
        return mediaDescriptionBuild;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f3701b) + ", " + ((Object) this.f3702c) + ", " + ((Object) this.f3703d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        b().writeToParcel(parcel, i10);
    }
}
