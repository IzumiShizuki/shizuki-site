package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import g8.b;
import g8.c;
import g8.d;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVarH = remoteActionCompat.f732a;
        boolean z10 = true;
        if (bVar.e(1)) {
            dVarH = bVar.h();
        }
        remoteActionCompat.f732a = (IconCompat) dVarH;
        CharSequence charSequence = remoteActionCompat.f733b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f7447e);
        }
        remoteActionCompat.f733b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f734c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f7447e);
        }
        remoteActionCompat.f734c = charSequence2;
        remoteActionCompat.f735d = (PendingIntent) bVar.g(remoteActionCompat.f735d, 4);
        boolean z11 = remoteActionCompat.f736e;
        if (bVar.e(5)) {
            z11 = ((c) bVar).f7447e.readInt() != 0;
        }
        remoteActionCompat.f736e = z11;
        boolean z12 = remoteActionCompat.f737f;
        if (!bVar.e(6)) {
            z10 = z12;
        } else if (((c) bVar).f7447e.readInt() == 0) {
            z10 = false;
        }
        remoteActionCompat.f737f = z10;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f732a;
        bVar.i(1);
        bVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f733b;
        bVar.i(2);
        Parcel parcel = ((c) bVar).f7447e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f734c;
        bVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        bVar.k(remoteActionCompat.f735d, 4);
        boolean z10 = remoteActionCompat.f736e;
        bVar.i(5);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = remoteActionCompat.f737f;
        bVar.i(6);
        parcel.writeInt(z11 ? 1 : 0);
    }
}
