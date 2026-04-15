package g5;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Trace;
import android.util.Log;
import b0.c1;
import b7.b1;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocket;
import pc.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w implements v, j, gb.o, gh.l, yb.g, k5.m, k7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7429a;

    public /* synthetic */ w(int i10) {
        this.f7429a = i10;
    }

    public static final String m(lh.i iVar, lh.i[] iVarArr, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        lh.i iVar2 = ih.a.f9524b;
        int iD = iVar.d();
        int i14 = 0;
        while (i14 < iD) {
            int i15 = (i14 + iD) / 2;
            while (i15 > -1 && iVar.i(i15) != 10) {
                i15--;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i11 = i16 + i17;
                if (iVar.i(i11) == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i11 - i16;
            int i19 = i10;
            boolean z11 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z11) {
                    i12 = 46;
                    z10 = false;
                } else {
                    byte bI = iVarArr[i19].i(i20);
                    byte[] bArr = wg.e.f24227a;
                    int i22 = bI & 255;
                    z10 = z11;
                    i12 = i22;
                }
                byte bI2 = iVar.i(i16 + i21);
                byte[] bArr2 = wg.e.f24227a;
                i13 = i12 - (bI2 & 255);
                if (i13 != 0) {
                    break;
                }
                i21++;
                i20++;
                if (i21 == i18) {
                    break;
                }
                if (iVarArr[i19].d() != i20) {
                    z11 = z10;
                } else {
                    if (i19 == iVarArr.length - 1) {
                        break;
                    }
                    i19++;
                    z11 = true;
                    i20 = -1;
                }
            }
            if (i13 >= 0) {
                if (i13 <= 0) {
                    int i23 = i18 - i21;
                    int iD2 = iVarArr[i19].d() - i20;
                    int length = iVarArr.length;
                    for (int i24 = i19 + 1; i24 < length; i24++) {
                        iD2 += iVarArr[i24].d();
                    }
                    if (iD2 >= i23) {
                        if (iD2 <= i23) {
                            return iVar.o(i16, i18 + i16).n(ef.a.f6541a);
                        }
                    }
                }
                i14 = i11 + 1;
            }
            iD = i15;
        }
        return null;
    }

    public static final void n(lh.c cVar, long j10, boolean z10) {
        b7.m mVar = lh.c.f12547h;
        if (lh.c.f12548i == null) {
            lh.c.f12548i = new lh.c();
            lh.b bVar = new lh.b("Okio Watchdog");
            bVar.setDaemon(true);
            bVar.start();
        }
        long jNanoTime = System.nanoTime();
        if (j10 != 0 && z10) {
            cVar.f12555g = Math.min(j10, cVar.c() - jNanoTime) + jNanoTime;
        } else if (j10 != 0) {
            cVar.f12555g = jNanoTime + j10;
        } else {
            if (!z10) {
                throw new AssertionError();
            }
            cVar.f12555g = cVar.c();
        }
        b7.m mVar2 = lh.c.f12547h;
        int i10 = mVar2.f1958b + 1;
        mVar2.f1958b = i10;
        lh.c[] cVarArr = (lh.c[]) mVar2.f1959c;
        if (i10 == cVarArr.length) {
            lh.c[] cVarArr2 = new lh.c[i10 * 2];
            vb.l.m0(0, 0, 14, cVarArr, cVarArr2);
            mVar2.f1959c = cVarArr2;
        }
        mVar2.o(i10, cVar);
        if (cVar.f12554f == 1) {
            lh.c.f12550k.signal();
        }
    }

    public static lh.c o() throws InterruptedException {
        b7.m mVar = lh.c.f12547h;
        lh.c cVar = ((lh.c[]) mVar.f1959c)[1];
        if (cVar == null) {
            long jNanoTime = System.nanoTime();
            lh.c.f12550k.await(lh.c.f12551l, TimeUnit.MILLISECONDS);
            if (((lh.c[]) mVar.f1959c)[1] != null || System.nanoTime() - jNanoTime < lh.c.f12552m) {
                return null;
            }
            return lh.c.f12548i;
        }
        long jNanoTime2 = cVar.f12555g - System.nanoTime();
        if (jNanoTime2 > 0) {
            lh.c.f12550k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        mVar.v(cVar);
        cVar.f12553e = 2;
        return cVar;
    }

    public static String p(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static MediaCodec q(b1 b1Var) throws IOException {
        String str = ((n) b1Var.f1650b).f7385a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    public static lh.i r(String str) {
        int i10;
        char cCharAt;
        jc.l.e(str, "<this>");
        byte[] bArr = lh.a.f12539a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i11 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i11];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i12 < length) {
                char cCharAt2 = str.charAt(i12);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    i10 = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    i10 = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                    i10 = cCharAt2 + 4;
                } else if (cCharAt2 != '+' && cCharAt2 != '-') {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                            break;
                        }
                        i12++;
                    } else {
                        i10 = 63;
                    }
                } else {
                    i10 = 62;
                }
                i14 = (i14 << 6) | i10;
                i13++;
                if (i13 % 4 == 0) {
                    bArrCopyOf[i15] = (byte) (i14 >> 16);
                    int i16 = i15 + 2;
                    bArrCopyOf[i15 + 1] = (byte) (i14 >> 8);
                    i15 += 3;
                    bArrCopyOf[i16] = (byte) i14;
                }
                i12++;
            } else {
                int i17 = i13 % 4;
                if (i17 != 1) {
                    if (i17 == 2) {
                        bArrCopyOf[i15] = (byte) ((i14 << 12) >> 16);
                        i15++;
                    } else if (i17 == 3) {
                        int i18 = i14 << 6;
                        int i19 = i15 + 1;
                        bArrCopyOf[i15] = (byte) (i18 >> 16);
                        i15 += 2;
                        bArrCopyOf[i19] = (byte) (i18 >> 8);
                    }
                    if (i15 != i11) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i15);
                        jc.l.d(bArrCopyOf, "copyOf(...)");
                    }
                }
            }
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new lh.i(bArrCopyOf);
        }
        return null;
    }

    public static lh.i s(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (mh.b.a(str.charAt(i11 + 1)) + (mh.b.a(str.charAt(i11)) << 4));
        }
        return new lh.i(bArr);
    }

    public static lh.i t(String str) {
        jc.l.e(str, "<this>");
        byte[] bytes = str.getBytes(ef.a.f6541a);
        jc.l.d(bytes, "getBytes(...)");
        lh.i iVar = new lh.i(bytes);
        iVar.f12575c = str;
        return iVar;
    }

    public static lh.y v(String str) {
        jc.l.e(str, "<this>");
        lh.i iVar = mh.c.f15167a;
        lh.f fVar = new lh.f();
        fVar.k0(str);
        return mh.c.d(fVar, false);
    }

    public static lh.y w(File file) {
        String str = lh.y.f12619b;
        String string = file.toString();
        jc.l.d(string, "toString(...)");
        return v(string);
    }

    public static lh.i x(byte[] bArr) {
        lh.i iVar = lh.i.f12572d;
        int length = bArr.length;
        android.support.v4.media.session.b.y(bArr.length, 0, length);
        return new lh.i(vb.l.n0(bArr, 0, length));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // g5.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g5.k P0(b7.b1 r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 0
            android.media.MediaCodec r0 = q(r6)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r1 = "configureCodec"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r1 = r6.f1653e     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.view.Surface r1 = (android.view.Surface) r1     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r1 != 0) goto L25
            java.lang.Object r2 = r6.f1650b     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            g5.n r2 = (g5.n) r2     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            boolean r2 = r2.f7394j     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r2 == 0) goto L25
            int r2 = p4.c0.f16548a     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r3 = 35
            if (r2 < r3) goto L25
            r2 = 8
            goto L26
        L21:
            r6 = move-exception
            goto L49
        L23:
            r6 = move-exception
            goto L49
        L25:
            r2 = 0
        L26:
            java.lang.Object r3 = r6.f1651c     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaFormat r3 = (android.media.MediaFormat) r3     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r4 = r6.f1654f     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaCrypto r4 = (android.media.MediaCrypto) r4     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r0.configure(r3, r1, r4, r2)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r1 = "startCodec"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r0.start()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            androidx.media3.exoplayer.offline.u r1 = new androidx.media3.exoplayer.offline.u     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r6 = r6.f1655g     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            c7.e1 r6 = (c7.e1) r6     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r1.<init>(r0, r6)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            return r1
        L49:
            if (r0 == 0) goto L4e
            r0.release()
        L4e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.w.P0(b7.b1):g5.k");
    }

    @Override // gh.l
    public boolean a(SSLSocket sSLSocket) {
        return ef.u.k0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // k5.m
    public long b() {
        throw new NoSuchElementException();
    }

    @Override // k5.m
    public long c() {
        throw new NoSuchElementException();
    }

    @Override // g5.v
    public MediaCodecInfo d(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // k7.c
    public void e() {
        switch (this.f7429a) {
            case 21:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // k7.c
    public void f(int i10, Object obj) {
        String str;
        switch (this.f7429a) {
            case 21:
                break;
            default:
                switch (i10) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                    default:
                        str = "";
                        break;
                    case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i10 == 6 || i10 == 7 || i10 == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                } else {
                    Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    @Override // g5.v
    public boolean g(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // gh.l
    public gh.n h(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new gh.e(superclass);
    }

    @Override // g5.v
    public boolean i(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // g5.v
    public int j() {
        return MediaCodecList.getCodecCount();
    }

    @Override // gb.o
    public Object k() {
        switch (this.f7429a) {
            case 2:
                return new TreeSet();
            case 3:
                return new LinkedHashSet();
            case 4:
                return new ArrayDeque();
            case 5:
                return new ArrayList();
            case 6:
                return new ConcurrentSkipListMap();
            case 7:
                return new ConcurrentHashMap();
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return new TreeMap();
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return new LinkedHashMap();
            default:
                return new gb.n(true);
        }
    }

    @Override // g5.v
    public boolean l() {
        return false;
    }

    @Override // k5.m
    public boolean next() {
        return false;
    }

    public String toString() {
        switch (this.f7429a) {
            case 11:
                return Collections.EMPTY_MAP.toString();
            case 17:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public gb.o u(lb.a aVar) {
        String str;
        gb.o rVar;
        Type type = aVar.f12166b;
        Class cls = aVar.f12165a;
        Map map = Collections.EMPTY_MAP;
        if (map.get(type) != null) {
            throw new ClassCastException();
        }
        if (map.get(cls) != null) {
            throw new ClassCastException();
        }
        w wVar = null;
        gb.e eVar = EnumSet.class.isAssignableFrom(cls) ? new gb.e(type, 0) : cls == EnumMap.class ? new gb.e(type, 1) : null;
        if (eVar != null) {
            return eVar;
        }
        List list = Collections.EMPTY_LIST;
        gb.d.f();
        int i10 = 6;
        if (Modifier.isAbstract(cls.getModifiers())) {
            rVar = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                f0 f0Var = jb.c.f10806a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e10) {
                    str = "Failed making constructor '" + jb.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e10.getMessage() + jb.c.e(e10);
                }
                rVar = str != null ? new app.nekogram.translator.r(i10, str) : new c1(24, declaredConstructor);
            } catch (NoSuchMethodException unused) {
                rVar = null;
            }
        }
        if (rVar != null) {
            return rVar;
        }
        int i11 = 5;
        if (Collection.class.isAssignableFrom(cls)) {
            wVar = SortedSet.class.isAssignableFrom(cls) ? new w(2) : Set.class.isAssignableFrom(cls) ? new w(3) : Queue.class.isAssignableFrom(cls) ? new w(4) : new w(i11);
        } else if (Map.class.isAssignableFrom(cls)) {
            wVar = ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new w(i10) : ConcurrentMap.class.isAssignableFrom(cls) ? new w(7) : SortedMap.class.isAssignableFrom(cls) ? new w(8) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new lb.a(((ParameterizedType) type).getActualTypeArguments()[0]).f12165a)) ? new w(10) : new w(9);
        }
        if (wVar != null) {
            return wVar;
        }
        String strP = p(cls);
        return strP != null ? new app.nekogram.translator.r(i11, strP) : new c1(23, cls);
    }

    public w(re.l lVar) {
        this.f7429a = 25;
        String str = re.l.f19009d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    private final void y() {
    }

    private final void z(int i10, Object obj) {
    }
}
