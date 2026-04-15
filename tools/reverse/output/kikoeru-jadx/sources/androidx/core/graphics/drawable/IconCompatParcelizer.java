package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import g8.b;
import g8.c;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f740a = bVar.f(iconCompat.f740a, 1);
        byte[] bArr = iconCompat.f742c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f7447e;
            int i10 = parcel.readInt();
            if (i10 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i10];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f742c = bArr;
        iconCompat.f743d = bVar.g(iconCompat.f743d, 3);
        iconCompat.f744e = bVar.f(iconCompat.f744e, 4);
        iconCompat.f745f = bVar.f(iconCompat.f745f, 5);
        iconCompat.f746g = (ColorStateList) bVar.g(iconCompat.f746g, 6);
        String string = iconCompat.f748i;
        if (bVar.e(7)) {
            string = ((c) bVar).f7447e.readString();
        }
        iconCompat.f748i = string;
        String string2 = iconCompat.f749j;
        if (bVar.e(8)) {
            string2 = ((c) bVar).f7447e.readString();
        }
        iconCompat.f749j = string2;
        iconCompat.f747h = PorterDuff.Mode.valueOf(iconCompat.f748i);
        switch (iconCompat.f740a) {
            case -1:
                Parcelable parcelable = iconCompat.f743d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f741b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f743d;
                if (parcelable2 != null) {
                    iconCompat.f741b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f742c;
                iconCompat.f741b = bArr3;
                iconCompat.f740a = 3;
                iconCompat.f744e = 0;
                iconCompat.f745f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f742c, Charset.forName("UTF-16"));
                iconCompat.f741b = str;
                if (iconCompat.f740a == 2 && iconCompat.f749j == null) {
                    iconCompat.f749j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f741b = iconCompat.f742c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f748i = iconCompat.f747h.name();
        switch (iconCompat.f740a) {
            case -1:
                iconCompat.f743d = (Parcelable) iconCompat.f741b;
                break;
            case 1:
            case 5:
                iconCompat.f743d = (Parcelable) iconCompat.f741b;
                break;
            case 2:
                iconCompat.f742c = ((String) iconCompat.f741b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f742c = (byte[]) iconCompat.f741b;
                break;
            case 4:
            case 6:
                iconCompat.f742c = iconCompat.f741b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f740a;
        if (-1 != i10) {
            bVar.j(i10, 1);
        }
        byte[] bArr = iconCompat.f742c;
        if (bArr != null) {
            bVar.i(2);
            Parcel parcel = ((c) bVar).f7447e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f743d;
        if (parcelable != null) {
            bVar.k(parcelable, 3);
        }
        int i11 = iconCompat.f744e;
        if (i11 != 0) {
            bVar.j(i11, 4);
        }
        int i12 = iconCompat.f745f;
        if (i12 != 0) {
            bVar.j(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f746g;
        if (colorStateList != null) {
            bVar.k(colorStateList, 6);
        }
        String str = iconCompat.f748i;
        if (str != null) {
            bVar.i(7);
            ((c) bVar).f7447e.writeString(str);
        }
        String str2 = iconCompat.f749j;
        if (str2 != null) {
            bVar.i(8);
            ((c) bVar).f7447e.writeString(str2);
        }
    }
}
