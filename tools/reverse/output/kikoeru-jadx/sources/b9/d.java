package b9;

import a9.g;
import b7.b1;
import bg.a2;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import jc.l;
import na.w;
import ub.n;
import ub.p;
import ug.d0;
import ug.e0;
import ug.f0;
import ug.i0;
import ug.r;
import ug.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f2273a = ub.a.d(new g(18));

    public static File a() {
        return (File) f2273a.getValue();
    }

    public static d0 b(long j10, b1 b1Var) throws IOException {
        l.e(b1Var, "request");
        File file = new File(a(), "RJ" + j10 + ".cover");
        if (!file.exists()) {
            return null;
        }
        e0 e0Var = f0.f21778a;
        ArrayList arrayList = new ArrayList(20);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i10 = (int) length;
            byte[] bArrCopyOf = new byte[i10];
            int i11 = i10;
            int i12 = 0;
            while (i11 > 0) {
                int i13 = fileInputStream.read(bArrCopyOf, i12, i11);
                if (i13 < 0) {
                    break;
                }
                i11 -= i13;
                i12 += i13;
            }
            if (i11 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i12);
                l.d(bArrCopyOf, "copyOf(...)");
            } else {
                int i14 = fileInputStream.read();
                if (i14 != -1) {
                    fc.a aVar = new fc.a(8193);
                    aVar.write(i14);
                    pc.f0.u(fileInputStream, aVar);
                    int size = aVar.size() + i10;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrB = aVar.b();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    l.d(bArrCopyOf, "copyOf(...)");
                    vb.l.g0(i10, 0, aVar.size(), bArrB, bArrCopyOf);
                }
            }
            fileInputStream.close();
            lh.f fVar = new lh.f();
            fVar.Y(bArrCopyOf, bArrCopyOf.length);
            return new d0(b1Var, y.f21935d, "OK", TinkerReport.KEY_APPLIED_SUCC_COST_5S_LESS, null, new r((String[]) arrayList.toArray(new String[0])), new e0(fVar, bArrCopyOf.length), null, null, null, null, 0L, 0L, null, i0.f21805b);
        } finally {
        }
    }

    public static n c(long j10) {
        Object objB;
        if (((Boolean) a0.c.F(Boolean.TYPE, gg.c.a(), "disableLocalDownloadMetadata", Boolean.FALSE)).booleanValue()) {
            return null;
        }
        File file = new File(a(), "RJ" + j10 + ".work");
        if (!file.exists()) {
            return null;
        }
        try {
            String strH0 = fc.b.h0(file);
            xf.r rVar = w.f15765a;
            rVar.getClass();
            objB = (a2) rVar.a(strH0, a2.Companion.serializer());
        } catch (Throwable th2) {
            objB = ub.a.b(th2);
        }
        return new n(objB);
    }
}
