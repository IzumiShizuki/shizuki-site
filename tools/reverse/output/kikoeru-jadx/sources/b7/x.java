package b7;

import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ya.m0 f2171a;

    static {
        int i10 = ya.m0.f26017c;
        Object[] objArr = new Object[32];
        objArr[0] = "android.media.metadata.TITLE";
        objArr[1] = "android.media.metadata.ARTIST";
        objArr[2] = "android.media.metadata.DURATION";
        objArr[3] = "android.media.metadata.ALBUM";
        objArr[4] = "android.media.metadata.AUTHOR";
        objArr[5] = "android.media.metadata.WRITER";
        System.arraycopy(new String[]{"android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"}, 0, objArr, 6, 26);
        f2171a = ya.m0.p(32, objArr);
    }

    public static long a(c7.p1 p1Var, c7.r0 r0Var, long j10) {
        long j11 = p1Var == null ? 0L : p1Var.f3689c;
        long jC = c(p1Var, r0Var, j10);
        long jD = d(r0Var);
        return jD == -9223372036854775807L ? Math.max(jC, j11) : p4.c0.j(j11, jC, jD);
    }

    public static byte[] b(Bitmap bitmap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static long c(c7.p1 p1Var, c7.r0 r0Var, long j10) {
        if (p1Var == null) {
            return 0L;
        }
        long jMax = p1Var.f3688b;
        if (p1Var.f3687a == 3) {
            jMax = Math.max(0L, jMax + ((long) (p1Var.f3690d * ((j10 == -9223372036854775807L ? null : Long.valueOf(j10)) != null ? r4.longValue() : SystemClock.elapsedRealtime() - p1Var.f3694h))));
        }
        long j11 = jMax;
        long jD = d(r0Var);
        return jD == -9223372036854775807L ? Math.max(0L, j11) : p4.c0.j(j11, 0L, jD);
    }

    public static long d(c7.r0 r0Var) {
        if (r0Var == null || !r0Var.f3716a.containsKey("android.media.metadata.DURATION")) {
            return -9223372036854775807L;
        }
        long jA = r0Var.a("android.media.metadata.DURATION");
        if (jA <= 0) {
            return -9223372036854775807L;
        }
        return jA;
    }

    public static long e(int i10) {
        switch (i10) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                throw new IllegalArgumentException(q.t0.B(i10, "Unrecognized FolderType: "));
        }
    }

    public static int f(long j10) {
        if (j10 == 0) {
            return 0;
        }
        if (j10 == 1) {
            return 1;
        }
        if (j10 == 2) {
            return 2;
        }
        if (j10 == 3) {
            return 3;
        }
        if (j10 == 4) {
            return 4;
        }
        if (j10 == 5) {
            return 5;
        }
        return j10 == 6 ? 6 : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c7.q0 g(m4.i0 r16, android.graphics.Bitmap r17) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.x.g(m4.i0, android.graphics.Bitmap):c7.q0");
    }

    public static m4.i0 h(c7.q0 q0Var) {
        q0Var.getClass();
        String str = q0Var.f3700a;
        m4.w wVar = new m4.w();
        ya.g0 g0Var = ya.i0.f25998b;
        ya.a1 a1Var = ya.a1.f25946e;
        List list = Collections.EMPTY_LIST;
        m4.b0 b0Var = new m4.b0();
        m4.e0 e0Var = m4.e0.f14187d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        c7.e1 e1Var = new c7.e1(23);
        e1Var.f3618b = q0Var.f3707h;
        m4.e0 e0Var2 = new m4.e0(e1Var);
        m4.l0 l0VarJ = j(q0Var, 0);
        m4.y yVar = new m4.y(wVar);
        m4.c0 c0Var = new m4.c0(b0Var);
        if (l0VarJ == null) {
            l0VarJ = m4.l0.K;
        }
        return new m4.i0(str2, yVar, null, c0Var, l0VarJ, e0Var2);
    }

    public static m4.i0 i(String str, c7.r0 r0Var, int i10) {
        m4.e0 e0Var;
        m4.w wVar = new m4.w();
        ya.g0 g0Var = ya.i0.f25998b;
        ya.a1 a1Var = ya.a1.f25946e;
        List list = Collections.EMPTY_LIST;
        ya.a1 a1Var2 = ya.a1.f25946e;
        m4.b0 b0Var = new m4.b0();
        m4.e0 e0Var2 = m4.e0.f14187d;
        if (str == null) {
            str = null;
        }
        CharSequence charSequence = r0Var.f3716a.getCharSequence("android.media.metadata.MEDIA_URI");
        String string = charSequence != null ? charSequence.toString() : null;
        if (string != null) {
            c7.e1 e1Var = new c7.e1(23);
            e1Var.f3618b = Uri.parse(string);
            e0Var = new m4.e0(e1Var);
        } else {
            e0Var = e0Var2;
        }
        m4.l0 l0VarK = k(r0Var, i10);
        if (str == null) {
            str = "";
        }
        String str2 = str;
        m4.y yVar = new m4.y(wVar);
        m4.c0 c0Var = new m4.c0(b0Var);
        if (l0VarK == null) {
            l0VarK = m4.l0.K;
        }
        return new m4.i0(str2, yVar, null, c0Var, l0VarK, e0Var);
    }

    public static m4.l0 j(c7.q0 q0Var, int i10) {
        c7.q1 q1Var;
        byte[] bArrB;
        if (q0Var == null) {
            return m4.l0.K;
        }
        CharSequence charSequence = q0Var.f3701b;
        m4.k0 k0Var = new m4.k0();
        k0Var.f14323f = q0Var.f3702c;
        k0Var.f14324g = q0Var.f3703d;
        k0Var.f14330m = q0Var.f3705f;
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                q1Var = new c7.q1(-1.0f, i10);
                break;
            default:
                q1Var = null;
                break;
        }
        k0Var.f14326i = o(q1Var);
        Bitmap bitmap = q0Var.f3704e;
        if (bitmap != null) {
            try {
                bArrB = b(bitmap);
            } catch (IOException e10) {
                p4.c.C("LegacyConversions", "Failed to convert iconBitmap to artworkData", e10);
                bArrB = null;
            }
            k0Var.b(bArrB, 3);
        }
        Bundle bundle = q0Var.f3706g;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : null;
        if (bundle2 != null && bundle2.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            k0Var.f14333p = Integer.valueOf(f(bundle2.getLong("android.media.extra.BT_FOLDER_TYPE")));
            bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        k0Var.f14334q = Boolean.FALSE;
        if (bundle2 != null && bundle2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            k0Var.G = Integer.valueOf((int) bundle2.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle2.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle2 != null && bundle2.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            k0Var.I = ya.i0.q(ya.i0.q(stringArrayList));
        }
        if (bundle2 == null || !bundle2.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            k0Var.f14318a = charSequence;
        } else {
            k0Var.f14318a = bundle2.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            k0Var.f14322e = charSequence;
            bundle2.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle2 != null && !bundle2.isEmpty()) {
            k0Var.H = bundle2;
        }
        k0Var.f14335r = Boolean.TRUE;
        return new m4.l0(k0Var);
    }

    public static m4.l0 k(c7.r0 r0Var, int i10) {
        c7.q1 q1VarA;
        c7.q1 q1VarA2;
        c7.q1 q1Var;
        String string;
        if (r0Var == null) {
            return m4.l0.K;
        }
        Bundle bundle = r0Var.f3716a;
        m4.k0 k0Var = new m4.k0();
        CharSequence charSequence = bundle.getCharSequence("android.media.metadata.TITLE");
        CharSequence charSequence2 = bundle.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        k0Var.f14318a = charSequence != null ? charSequence : charSequence2;
        Bitmap bitmap = null;
        if (charSequence == null) {
            charSequence2 = null;
        }
        k0Var.f14322e = charSequence2;
        k0Var.f14323f = bundle.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
        k0Var.f14324g = bundle.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        k0Var.f14319b = bundle.getCharSequence("android.media.metadata.ARTIST");
        k0Var.f14320c = bundle.getCharSequence("android.media.metadata.ALBUM");
        k0Var.f14321d = bundle.getCharSequence("android.media.metadata.ALBUM_ARTIST");
        try {
            q1VarA = c7.q1.a(bundle.getParcelable("android.media.metadata.RATING"));
        } catch (Exception e10) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e10);
            q1VarA = null;
        }
        k0Var.f14327j = o(q1VarA);
        if (bundle.containsKey("android.media.metadata.DURATION")) {
            long jA = r0Var.a("android.media.metadata.DURATION");
            if (jA >= 0) {
                k0Var.c(Long.valueOf(jA));
            }
        }
        try {
            q1VarA2 = c7.q1.a(bundle.getParcelable("android.media.metadata.USER_RATING"));
        } catch (Exception e11) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e11);
            q1VarA2 = null;
        }
        m4.z0 z0VarO = o(q1VarA2);
        if (z0VarO != null) {
            k0Var.f14326i = z0VarO;
        } else {
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    q1Var = new c7.q1(-1.0f, i10);
                    break;
                default:
                    q1Var = null;
                    break;
            }
            k0Var.f14326i = o(q1Var);
        }
        if (bundle.containsKey("android.media.metadata.YEAR")) {
            k0Var.f14336s = Integer.valueOf((int) r0Var.a("android.media.metadata.YEAR"));
        }
        String[] strArr = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.ART_URI"};
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 < 3) {
                String str = strArr[i12];
                if (bundle.containsKey(str)) {
                    CharSequence charSequence3 = bundle.getCharSequence(str);
                    if (charSequence3 != null) {
                        string = charSequence3.toString();
                    }
                } else {
                    i12++;
                }
            }
        }
        string = null;
        if (string != null) {
            k0Var.f14330m = Uri.parse(string);
        }
        String[] strArr2 = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ALBUM_ART", "android.media.metadata.ART"};
        while (true) {
            if (i11 < 3) {
                String str2 = strArr2[i11];
                if (bundle.containsKey(str2)) {
                    try {
                        bitmap = (Bitmap) bundle.getParcelable(str2);
                    } catch (Exception e12) {
                        Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e12);
                    }
                } else {
                    i11++;
                }
            }
        }
        if (bitmap != null) {
            try {
                k0Var.b(b(bitmap), 3);
            } catch (IOException e13) {
                p4.c.C("LegacyConversions", "Failed to convert artworkBitmap to artworkData", e13);
            }
        }
        boolean zContainsKey = bundle.containsKey("android.media.metadata.BT_FOLDER_TYPE");
        k0Var.f14334q = Boolean.valueOf(zContainsKey);
        if (zContainsKey) {
            k0Var.f14333p = Integer.valueOf(f(r0Var.a("android.media.metadata.BT_FOLDER_TYPE")));
        }
        if (bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            k0Var.G = Integer.valueOf((int) r0Var.a("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
        }
        k0Var.f14335r = Boolean.TRUE;
        Bundle bundle2 = new Bundle(bundle);
        ya.o1 it = f2171a.iterator();
        while (it.hasNext()) {
            bundle2.remove((String) it.next());
        }
        if (!bundle2.isEmpty()) {
            k0Var.H = bundle2;
        }
        return new m4.l0(k0Var);
    }

    public static c7.r0 l(m4.l0 l0Var, String str, Uri uri, long j10, Bitmap bitmap) {
        Long l10;
        c7.q qVar = new c7.q();
        qVar.d("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = l0Var.f14364a;
        Bundle bundle = l0Var.I;
        Integer num = l0Var.f14379p;
        Uri uri2 = l0Var.f14376m;
        if (charSequence != null) {
            qVar.e(charSequence, "android.media.metadata.TITLE");
        }
        CharSequence charSequence2 = l0Var.f14368e;
        if (charSequence2 != null) {
            qVar.e(charSequence2, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence3 = l0Var.f14369f;
        if (charSequence3 != null) {
            qVar.e(charSequence3, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence4 = l0Var.f14370g;
        if (charSequence4 != null) {
            qVar.e(charSequence4, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence5 = l0Var.f14365b;
        if (charSequence5 != null) {
            qVar.e(charSequence5, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence6 = l0Var.f14366c;
        if (charSequence6 != null) {
            qVar.e(charSequence6, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence7 = l0Var.f14367d;
        if (charSequence7 != null) {
            qVar.e(charSequence7, "android.media.metadata.ALBUM_ARTIST");
        }
        if (l0Var.f14383t != null) {
            qVar.b(r7.intValue(), "android.media.metadata.YEAR");
        }
        if (uri != null) {
            qVar.d("android.media.metadata.MEDIA_URI", uri.toString());
        }
        if (uri2 != null) {
            qVar.d("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            qVar.d("android.media.metadata.ALBUM_ART_URI", uri2.toString());
            qVar.d("android.media.metadata.ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            qVar.a("android.media.metadata.DISPLAY_ICON", bitmap);
            qVar.a("android.media.metadata.ALBUM_ART", bitmap);
        }
        if (num != null && num.intValue() != -1) {
            qVar.b(e(num.intValue()), "android.media.metadata.BT_FOLDER_TYPE");
        }
        if (j10 == -9223372036854775807L && (l10 = l0Var.f14371h) != null) {
            j10 = l10.longValue();
        }
        if (j10 != -9223372036854775807L) {
            qVar.b(j10, "android.media.metadata.DURATION");
        }
        c7.q1 q1VarP = p(l0Var.f14372i);
        if (q1VarP != null) {
            qVar.c("android.media.metadata.USER_RATING", q1VarP);
        }
        c7.q1 q1VarP2 = p(l0Var.f14373j);
        if (q1VarP2 != null) {
            qVar.c("android.media.metadata.RATING", q1VarP2);
        }
        if (l0Var.H != null) {
            qVar.b(r6.intValue(), "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    qVar.e((CharSequence) obj, str2);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    qVar.b(((Number) obj).longValue(), str2);
                }
            }
        }
        return new c7.r0(qVar.f3699a);
    }

    public static m4.r0 m(c7.p1 p1Var) {
        if (p1Var == null || p1Var.f3687a != 7) {
            return null;
        }
        CharSequence charSequence = p1Var.f3693g;
        Bundle bundle = p1Var.f3697k;
        String string = charSequence != null ? charSequence.toString() : null;
        int iR = r(p1Var.f3692f);
        int i10 = iR != -5 ? iR != -1 ? iR : 1000 : 2000;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new m4.r0(string, null, i10, bundle, SystemClock.elapsedRealtime());
    }

    public static int n(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                p4.c.B("LegacyConversions", "Unrecognized RepeatMode: " + i10 + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                return 0;
            }
        }
        return i11;
    }

    public static m4.z0 o(c7.q1 q1Var) {
        if (q1Var == null) {
            return null;
        }
        float f10 = q1Var.f3710b;
        int i10 = q1Var.f3709a;
        switch (i10) {
            case 1:
                if (q1Var.c()) {
                    return new m4.s(i10 == 1 && f10 == 1.0f);
                }
                return new m4.s();
            case 2:
                if (q1Var.c()) {
                    return new m4.c1(i10 == 2 && f10 == 1.0f);
                }
                return new m4.c1();
            case 3:
                return q1Var.c() ? new m4.a1(q1Var.b(), 3) : new m4.a1(3);
            case 4:
                return q1Var.c() ? new m4.a1(q1Var.b(), 4) : new m4.a1(4);
            case 5:
                return q1Var.c() ? new m4.a1(q1Var.b(), 5) : new m4.a1(5);
            case 6:
                if (!q1Var.c()) {
                    return new m4.q0();
                }
                if (i10 != 6 || !q1Var.c()) {
                    f10 = -1.0f;
                }
                return new m4.q0(f10);
            default:
                return null;
        }
    }

    public static c7.q1 p(m4.z0 z0Var) {
        if (z0Var != null) {
            int iU = u(z0Var);
            if (!z0Var.b()) {
                switch (iU) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new c7.q1(-1.0f, iU);
                    default:
                        return null;
                }
            }
            switch (iU) {
                case 1:
                    return new c7.q1(((m4.s) z0Var).f14577c ? 1.0f : 0.0f, 1);
                case 2:
                    return new c7.q1(((m4.c1) z0Var).f14157c ? 1.0f : 0.0f, 2);
                case 3:
                case 4:
                case 5:
                    return c7.q1.e(((m4.a1) z0Var).f14120c, iU);
                case 6:
                    return c7.q1.d(((m4.q0) z0Var).f14558b);
            }
        }
        return null;
    }

    public static int q(int i10) {
        if (i10 == -1 || i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 3) {
                p4.c.B("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i10 + " was converted to `Player.REPEAT_MODE_OFF`");
                return 0;
            }
        }
        return i11;
    }

    public static int r(int i10) {
        switch (i10) {
            case 1:
                return -2;
            case 2:
                return -6;
            case 3:
                return -102;
            case 4:
                return -103;
            case 5:
                return -104;
            case 6:
                return -105;
            case 7:
                return -106;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return -110;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return -107;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return 1;
            case 11:
                return -109;
            default:
                return -1;
        }
    }

    public static boolean s(int i10) {
        if (i10 == -1 || i10 == 0) {
            return false;
        }
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        throw new IllegalArgumentException(q.t0.B(i10, "Unrecognized ShuffleMode: "));
    }

    public static int t(m4.d dVar) {
        int i10 = c7.d.f3599b;
        b0.c1 bVar = Build.VERSION.SDK_INT >= 26 ? new c7.b(11) : new b0.c1(11);
        AudioAttributes.Builder builder = (AudioAttributes.Builder) bVar.f1208b;
        builder.setContentType(dVar.f14164a);
        builder.setFlags(dVar.f14165b);
        bVar.G(dVar.f14166c);
        c7.a aVarF = bVar.f();
        int i11 = aVarF.f3580b;
        if (i11 == -1) {
            int iA = aVarF.a();
            int iB = aVarF.b();
            int i12 = c7.d.f3599b;
            if ((iA & 1) != 1) {
                if ((iA & 4) != 4) {
                    switch (iB) {
                        case 2:
                            i11 = 0;
                            break;
                        case 3:
                            i11 = 8;
                            break;
                        case 4:
                            i11 = 4;
                            break;
                        case 5:
                        case 7:
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            i11 = 5;
                            break;
                        case 6:
                            i11 = 2;
                            break;
                        case 11:
                            i11 = 10;
                            break;
                        case 12:
                        default:
                            i11 = 3;
                            break;
                        case 13:
                            i11 = 1;
                            break;
                    }
                } else {
                    i11 = 6;
                }
            } else {
                i11 = 7;
            }
        }
        if (i11 == Integer.MIN_VALUE) {
            return 3;
        }
        return i11;
    }

    public static int u(m4.z0 z0Var) {
        if (z0Var instanceof m4.s) {
            return 1;
        }
        if (z0Var instanceof m4.c1) {
            return 2;
        }
        if (!(z0Var instanceof m4.a1)) {
            return z0Var instanceof m4.q0 ? 6 : 0;
        }
        int i10 = ((m4.a1) z0Var).f14119b;
        int i11 = 3;
        if (i10 != 3) {
            i11 = 4;
            if (i10 != 4) {
                i11 = 5;
                if (i10 != 5) {
                    return 0;
                }
            }
        }
        return i11;
    }

    public static boolean v(long j10, long j11) {
        return (j10 & j11) != 0;
    }
}
