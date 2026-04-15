package x8;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import ce.j0;
import ef.n;
import java.io.Closeable;
import java.util.ArrayList;
import jc.l;
import ug.r;
import vb.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config[] f24838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Bitmap.Config f24839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f24840c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f24838a = i10 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f24839b = i10 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        f24840c = new r((String[]) new ArrayList(20).toArray(new String[0]));
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || n.y0(str)) {
            return null;
        }
        String strU0 = n.U0('#', str, str);
        String strU02 = n.U0('?', strU0, strU0);
        return mimeTypeMap.getMimeTypeFromExtension(n.Q0('.', n.Q0('/', strU02, strU02), ""));
    }

    public static final boolean c(Uri uri) {
        return l.a(uri.getScheme(), "file") && l.a((String) m.a0(uri.getPathSegments()), "android_asset");
    }

    public static final int d(nh.a aVar, t8.g gVar) {
        if (aVar instanceof t8.a) {
            return ((t8.a) aVar).f20552q;
        }
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new j0();
    }
}
