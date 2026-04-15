package i9;

import android.net.Uri;
import java.io.OutputStream;
import java.util.Collections;
import na.q;
import ub.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f9477a = ub.a.d(new e.e(28));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f9478b = ub.a.d(new e.e(29));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f9479c = ub.a.d(new f(0));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f9480d = ub.a.d(new f(1));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f9481e = ub.a.d(new f(2));

    public static void a(Uri uri, OutputStream outputStream) {
        Object objB;
        jc.l.e(uri, "uri");
        t4.f fVar = (t4.f) f9481e.getValue();
        jc.l.e(fVar, "<this>");
        try {
            objB = Long.valueOf(fVar.f(new s4.m(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0)));
        } catch (Throwable th2) {
            objB = ub.a.b(th2);
        }
        if (!(objB instanceof ub.m)) {
            ((Number) objB).longValue();
            try {
                p pVar = q.f15736a;
                byte[] bArr = new byte[1048576];
                while (true) {
                    int i10 = fVar.read(bArr, 0, 1048576);
                    if (i10 == -1) {
                        break;
                    } else {
                        outputStream.write(bArr, 0, i10);
                    }
                }
                outputStream.close();
            } finally {
            }
        }
        fVar.close();
    }
}
