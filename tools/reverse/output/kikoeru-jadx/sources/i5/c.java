package i5;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new android.support.v4.media.a(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9011a;

    public c(int i10) {
        this.f9011a = (i10 & 2) != 0 ? i10 | 1 : i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(android.content.Context r10) {
        /*
            r9 = this;
            int r0 = r9.f9011a
            r1 = r0 & 1
            r2 = 2
            r3 = 16
            r4 = 0
            if (r1 == 0) goto L49
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r10.getSystemService(r1)
            r1.getClass()
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r5 = r1.getActiveNetworkInfo()
            if (r5 == 0) goto L4b
            boolean r5 = r5.isConnected()
            if (r5 == 0) goto L4b
            int r5 = p4.c0.f16548a
            r6 = 24
            if (r5 >= r6) goto L28
            goto L3d
        L28:
            android.net.Network r5 = android.support.v4.media.c.d(r1)
            if (r5 != 0) goto L2f
            goto L4b
        L2f:
            android.net.NetworkCapabilities r5 = r1.getNetworkCapabilities(r5)     // Catch: java.lang.SecurityException -> L3c
            if (r5 == 0) goto L4b
            boolean r5 = r5.hasCapability(r3)     // Catch: java.lang.SecurityException -> L3c
            if (r5 == 0) goto L4b
            goto L3d
        L3c:
        L3d:
            r5 = r0 & 2
            if (r5 == 0) goto L49
            boolean r1 = r1.isActiveNetworkMetered()
            if (r1 == 0) goto L49
            r1 = 2
            goto L4d
        L49:
            r1 = 0
            goto L4d
        L4b:
            r1 = r0 & 3
        L4d:
            r5 = r0 & 8
            r6 = 0
            if (r5 == 0) goto L6f
            android.content.IntentFilter r5 = new android.content.IntentFilter
            java.lang.String r7 = "android.intent.action.BATTERY_CHANGED"
            r5.<init>(r7)
            android.content.Intent r5 = r10.registerReceiver(r6, r5)
            if (r5 != 0) goto L60
            goto L6d
        L60:
            java.lang.String r7 = "status"
            r8 = -1
            int r5 = r5.getIntExtra(r7, r8)
            if (r5 == r2) goto L6f
            r2 = 5
            if (r5 != r2) goto L6d
            goto L6f
        L6d:
            r1 = r1 | 8
        L6f:
            r2 = r0 & 4
            r5 = 1
            if (r2 == 0) goto L97
            java.lang.String r2 = "power"
            java.lang.Object r2 = r10.getSystemService(r2)
            r2.getClass()
            android.os.PowerManager r2 = (android.os.PowerManager) r2
            int r7 = p4.c0.f16548a
            r8 = 23
            if (r7 < r8) goto L8a
            boolean r2 = android.support.v4.media.c.w(r2)
            goto L93
        L8a:
            boolean r2 = r2.isInteractive()
            if (r2 != 0) goto L92
            r2 = 1
            goto L93
        L92:
            r2 = 0
        L93:
            if (r2 != 0) goto L97
            r1 = r1 | 4
        L97:
            r0 = r0 & r3
            if (r0 == 0) goto L9c
            r0 = 1
            goto L9d
        L9c:
            r0 = 0
        L9d:
            if (r0 == 0) goto Lb1
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r2 = "android.intent.action.DEVICE_STORAGE_LOW"
            r0.<init>(r2)
            android.content.Intent r10 = r10.registerReceiver(r6, r0)
            if (r10 != 0) goto Lad
            r4 = 1
        Lad:
            if (r4 != 0) goto Lb1
            r1 = r1 | 16
        Lb1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.c.a(android.content.Context):int");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            if (this.f9011a == ((c) obj).f9011a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9011a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f9011a);
    }
}
