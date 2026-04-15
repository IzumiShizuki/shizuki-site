package p4;

import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import q.t0;
import ya.a1;
import ya.f0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f16547a = new Object();

    public static ArrayList A(Collection collection, xa.d dVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) dVar.apply(it.next()));
        }
        return arrayList;
    }

    public static void B(String str, String str2) {
        synchronized (f16547a) {
            Log.w(str, a(str2, null));
        }
    }

    public static void C(String str, String str2, Throwable th2) {
        synchronized (f16547a) {
            Log.w(str, a(str2, th2));
        }
    }

    public static String a(String str, Throwable th2) {
        String strReplace;
        if (th2 != null) {
            synchronized (f16547a) {
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void c(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void d() throws j {
        StringBuilder sb = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z10) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z10 = true;
        }
        if (z10) {
            throw new j(sb.toString());
        }
    }

    public static void e(String str, boolean z10) throws j {
        if (!z10) {
            throw new j(str);
        }
    }

    public static void f(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void h(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void i(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void j(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    public static void l(String str, String str2) {
        synchronized (f16547a) {
            Log.d(str, a(str2, null));
        }
    }

    public static void m(String str, String str2, Exception exc) {
        synchronized (f16547a) {
            Log.d(str, a(str2, exc));
        }
    }

    public static void n(String str, String str2) {
        synchronized (f16547a) {
            Log.e(str, a(str2, null));
        }
    }

    public static void o(String str, String str2, Throwable th2) {
        synchronized (f16547a) {
            Log.e(str, a(str2, th2));
        }
    }

    public static a1 p(List list, xa.d dVar) {
        f0 f0VarP = i0.p();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Bundle bundle = (Bundle) list.get(i10);
            bundle.getClass();
            f0VarP.a(dVar.apply(bundle));
        }
        return f0VarP.f();
    }

    public static String q(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static int[] r(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i10 = iIndexOf5 + 2;
        if (i10 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i10) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static void s(String str, String str2) {
        synchronized (f16547a) {
            Log.i(str, a(str2, null));
        }
    }

    public static boolean t(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean u(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static void v(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static String w(StringBuilder sb, int i10, int i11) {
        int i12;
        int iLastIndexOf;
        if (i10 >= i11) {
            return sb.toString();
        }
        if (sb.charAt(i10) == '/') {
            i10++;
        }
        int i13 = i10;
        int i14 = i13;
        while (i13 <= i11) {
            if (i13 == i11) {
                i12 = i13;
            } else if (sb.charAt(i13) == '/') {
                i12 = i13 + 1;
            } else {
                i13++;
            }
            int i15 = i14 + 1;
            if (i13 == i15 && sb.charAt(i14) == '.') {
                sb.delete(i14, i12);
                i11 -= i12 - i14;
            } else {
                if (i13 == i14 + 2 && sb.charAt(i14) == '.' && sb.charAt(i15) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i14 - 2) + 1;
                    int i16 = iLastIndexOf > i10 ? iLastIndexOf : i10;
                    sb.delete(i16, i12);
                    i11 -= i12 - i16;
                } else {
                    iLastIndexOf = i13 + 1;
                }
                i14 = iLastIndexOf;
            }
            i13 = i14;
        }
        return sb.toString();
    }

    public static String x(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrR = r(str2);
        if (iArrR[0] != -1) {
            sb.append(str2);
            w(sb, iArrR[1], iArrR[2]);
            return sb.toString();
        }
        int[] iArrR2 = r(str);
        if (iArrR[3] == 0) {
            sb.append((CharSequence) str, 0, iArrR2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrR[2] == 0) {
            sb.append((CharSequence) str, 0, iArrR2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i10 = iArrR[1];
        if (i10 != 0) {
            int i11 = iArrR2[0] + 1;
            sb.append((CharSequence) str, 0, i11);
            sb.append(str2);
            return w(sb, iArrR[1] + i11, i11 + iArrR[2]);
        }
        if (str2.charAt(i10) == '/') {
            sb.append((CharSequence) str, 0, iArrR2[1]);
            sb.append(str2);
            int i12 = iArrR2[1];
            return w(sb, i12, iArrR[2] + i12);
        }
        int i13 = iArrR2[0] + 2;
        int i14 = iArrR2[1];
        if (i13 >= i14 || i14 != iArrR2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrR2[2] - 1);
            int i15 = iLastIndexOf == -1 ? iArrR2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i15);
            sb.append(str2);
            return w(sb, iArrR2[1], i15 + iArrR[2]);
        }
        sb.append((CharSequence) str, 0, i14);
        sb.append('/');
        sb.append(str2);
        int i16 = iArrR2[1];
        return w(sb, i16, iArrR[2] + i16 + 1);
    }

    public static Uri y(String str, String str2) {
        return Uri.parse(x(str, str2));
    }

    public static void z(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(t0.B(i10, "csd-"), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }
}
