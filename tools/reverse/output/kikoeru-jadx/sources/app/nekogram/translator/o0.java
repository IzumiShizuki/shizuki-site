package app.nekogram.translator;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1129a;

    static {
        String[] strArr = j0.f1116a;
        f1129a = nh.a.u(-23862293080790L, strArr);
        nh.a.u(-23952487394006L, strArr);
    }

    public static String a() {
        String[] strArr = j0.f1116a;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(nh.a.u(-23681904454358L, strArr), Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(nh.a.u(-23793573604054L, strArr)));
        return simpleDateFormat.format(new Date(Calendar.getInstance(TimeZone.getTimeZone(nh.a.u(-23810753473238L, strArr))).getTimeInMillis())).toLowerCase() + nh.a.u(-23827933342422L, strArr);
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance(nh.a.u(-23845113211606L, j0.f1116a)).digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static boolean c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}
