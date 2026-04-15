package m3;

import android.app.Notification;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f14058c;

    public g(String str, int i10, Notification notification) {
        this.f14056a = str;
        this.f14057b = i10;
        this.f14058c = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f14056a;
        int i10 = this.f14057b;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(b.c.f1168a);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i10);
            parcelObtain.writeString(null);
            Notification notification = this.f14058c;
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            aVar.f1166e.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        return "NotifyTask[packageName:" + this.f14056a + ", id:" + this.f14057b + ", tag:null]";
    }
}
