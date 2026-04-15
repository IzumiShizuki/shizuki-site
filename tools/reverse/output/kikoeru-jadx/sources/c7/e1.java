package c7;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b0.w1;
import com.cnl.kikoeru.MainService;
import i2.z1;
import i7.p2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import r.y1;
import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements a3.d, g1.f, x0.c, p4.b, r8.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f3616e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3620d;

    public /* synthetic */ e1(Object obj, Object obj2, Object obj3, int i10) {
        this.f3617a = i10;
        this.f3618b = obj;
        this.f3619c = obj2;
        this.f3620d = obj3;
    }

    public static void P(rg.b bVar, tc.b0 b0Var) throws og.a {
        List list = bVar.D;
        if (list == null || list.size() <= 0) {
            return;
        }
        List list2 = bVar.D;
        rg.a aVar = null;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                rg.d dVar = (rg.d) it.next();
                if (dVar != null && dVar.f19053o == 39169) {
                    byte[] bArr = dVar.f19055q;
                    if (bArr == null || bArr.length != 7) {
                        throw new og.a("corrupt AES extra data records");
                    }
                    aVar = new rg.a();
                    aVar.f19034o = 2;
                    aVar.f19035p = 3;
                    aVar.f19036q = 2;
                    int i10 = 0;
                    int iO = tc.b0.o(bArr, 0);
                    for (int i11 : w0.c.c(2)) {
                        int i12 = 1;
                        if (i11 != 1) {
                            i12 = 2;
                            if (i11 != 2) {
                                throw null;
                            }
                        }
                        if (i12 == iO) {
                            aVar.f19034o = i11;
                            byte[] bArr2 = new byte[2];
                            System.arraycopy(bArr, 2, bArr2, 0, 2);
                            new String(bArr2);
                            int i13 = bArr[4] & 255;
                            int[] iArrC = w0.c.c(3);
                            int length = iArrC.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length) {
                                    break;
                                }
                                int i15 = iArrC[i14];
                                int i16 = 1;
                                if (i15 != 1) {
                                    i16 = 2;
                                    if (i15 != 2) {
                                        i16 = 3;
                                        if (i15 != 3) {
                                            throw null;
                                        }
                                    }
                                }
                                if (i16 == i13) {
                                    i10 = i15;
                                    break;
                                }
                                i14++;
                            }
                            aVar.f19035p = i10;
                            aVar.f19036q = q.t0.e(tc.b0.o(bArr, 5));
                        }
                    }
                    throw new og.a("Unsupported Aes version");
                }
            }
        }
        if (aVar != null) {
            bVar.B = aVar;
            bVar.f19047y = 4;
        }
    }

    public static rg.i S(List list, tc.b0 b0Var, long j10, long j11, long j12, int i10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rg.d dVar = (rg.d) it.next();
            if (dVar != null && 1 == dVar.f19053o) {
                rg.i iVar = new rg.i();
                iVar.f19059o = -1L;
                iVar.f19060p = -1L;
                iVar.f19061q = -1L;
                iVar.f19062r = -1;
                byte[] bArr = dVar.f19055q;
                int i11 = dVar.f19054p;
                if (i11 <= 0) {
                    return null;
                }
                int i12 = 0;
                if (i11 > 0 && j10 == 4294967295L) {
                    iVar.f19060p = b0Var.n(bArr, 0);
                    i12 = 8;
                }
                if (i12 < dVar.f19054p && j11 == 4294967295L) {
                    iVar.f19059o = b0Var.n(bArr, i12);
                    i12 += 8;
                }
                if (i12 < dVar.f19054p && j12 == 4294967295L) {
                    iVar.f19061q = b0Var.n(bArr, i12);
                    i12 += 8;
                }
                if (i12 < dVar.f19054p && i10 == 65535) {
                    iVar.f19062r = tc.b0.l(bArr, i12);
                }
                return iVar;
            }
        }
        return null;
    }

    public static void V(RandomAccessFile randomAccessFile, long j10) throws IOException {
        if (randomAccessFile instanceof qg.g) {
            ((qg.g) randomAccessFile).f18282c.seek(j10);
        } else {
            randomAccessFile.seek(j10);
        }
    }

    public static final i7.l a(e1 e1Var, i7.l lVar, i7.c0 c0Var, i7.c0 c0Var2) {
        i7.b0 b0Var;
        i7.b0 b0Var2;
        i7.b0 b0Var3;
        e1Var.getClass();
        i7.b0 b0Var4 = i7.a0.f9030c;
        if (lVar == null || (b0Var = lVar.f9185a) == null) {
            b0Var = b0Var4;
        }
        i7.b0 b0Var5 = c0Var.f9056a;
        i7.b0 b0VarN = n(b0Var, b0Var5, b0Var5, c0Var2 != null ? c0Var2.f9056a : null);
        if (lVar == null || (b0Var2 = lVar.f9186b) == null) {
            b0Var2 = b0Var4;
        }
        i7.b0 b0VarN2 = n(b0Var2, b0Var5, c0Var.f9057b, c0Var2 != null ? c0Var2.f9057b : null);
        if (lVar != null && (b0Var3 = lVar.f9187c) != null) {
            b0Var4 = b0Var3;
        }
        return new i7.l(b0VarN, b0VarN2, n(b0Var4, b0Var5, c0Var.f9058c, c0Var2 != null ? c0Var2.f9058c : null), c0Var, c0Var2);
    }

    public static final void h(e1 e1Var, Network network, boolean z10) {
        boolean z11;
        Network[] allNetworks = ((ConnectivityManager) e1Var.f3618b).getAllNetworks();
        int length = allNetworks.length;
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Network network2 = allNetworks[i10];
            if (jc.l.a(network2, network)) {
                z11 = z10;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) e1Var.f3618b).getNetworkCapabilities(network2);
                z11 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z11) {
                z12 = true;
                break;
            }
            i10++;
        }
        x8.i iVar = (x8.i) e1Var.f3619c;
        synchronized (iVar) {
            try {
                if (((h8.h) iVar.f24853a.get()) != null) {
                    iVar.f24857e = z12;
                } else {
                    iVar.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static i7.b0 n(i7.b0 b0Var, i7.b0 b0Var2, i7.b0 b0Var3, i7.b0 b0Var4) {
        return b0Var4 == null ? b0Var3 : b0Var instanceof i7.z ? (((b0Var2 instanceof i7.a0) && (b0Var4 instanceof i7.a0)) || (b0Var4 instanceof i7.y)) ? b0Var4 : b0Var : b0Var4;
    }

    public static b5.j s(m4.a0 a0Var) {
        s4.o oVar = new s4.o();
        Uri uri = a0Var.f14110b;
        b5.d0 d0Var = new b5.d0(uri == null ? null : uri.toString(), a0Var.f14114f, oVar);
        ya.k0 k0Var = a0Var.f14111c;
        ya.m0 m0VarB = k0Var.f26008a;
        if (m0VarB == null) {
            m0VarB = k0Var.b();
            k0Var.f26008a = m0VarB;
        }
        ya.o1 o1VarN = m0VarB.iterator();
        while (o1VarN.hasNext()) {
            Map.Entry entry = (Map.Entry) o1VarN.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) d0Var.f1523d)) {
                ((HashMap) d0Var.f1523d).put(str, str2);
            }
        }
        HashMap map = new HashMap();
        UUID uuid = m4.g.f14208a;
        m3.l lVar = new m3.l(11);
        UUID uuid2 = a0Var.f14109a;
        uuid2.getClass();
        boolean z10 = a0Var.f14112d;
        boolean z11 = a0Var.f14113e;
        int[] iArrA0 = g8.a.a0(a0Var.f14115g);
        for (int i10 : iArrA0) {
            boolean z12 = true;
            if (i10 != 2 && i10 != 1) {
                z12 = false;
            }
            p4.c.c(z12);
        }
        b5.j jVar = new b5.j(uuid2, d0Var, map, z10, (int[]) iArrA0.clone(), z11, lVar);
        byte[] bArr = a0Var.f14116h;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        p4.c.i(jVar.f1567l.isEmpty());
        jVar.f1576u = bArrCopyOf;
        return jVar;
    }

    public static void t(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = e1.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public long A() {
        r5.k kVar = (r5.k) this.f3620d;
        if (kVar != null) {
            return kVar.f18846d;
        }
        return -1L;
    }

    public f3.c B() {
        return ((s1.b) this.f3620d).f19345a.f19341a;
    }

    @Override // p4.b
    public cb.y B0(byte[] bArr) {
        jc.l.e(bArr, "data");
        cb.y yVarB = ((cb.a0) ((cb.z) this.f3618b)).b(new k9.a(bArr, this, 0));
        jc.l.d(yVarB, "submit(...)");
        return yVarB;
    }

    public f3.m C() {
        return ((s1.b) this.f3620d).f19345a.f19342b;
    }

    public long D() {
        return ((s1.b) this.f3620d).f19345a.f19344d;
    }

    public View E(int i10) {
        return ((RecyclerView) ((p2) this.f3618b).f9258a).getChildAt(i10);
    }

    public int F() {
        return ((RecyclerView) ((p2) this.f3618b).f9258a).getChildCount();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean G(java.lang.CharSequence r10, int r11, int r12, c4.w r13) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.e1.G(java.lang.CharSequence, int, int, c4.w):boolean");
    }

    public boolean H() throws IOException {
        String strTrim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f3619c;
        if (((String) this.f3620d) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f3620d = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.f3618b).readLine();
                this.f3620d = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f3620d = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I(s4.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, j5.t0 r15) throws j5.p1 {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.e1.I(s4.h, android.net.Uri, java.util.Map, long, long, j5.t0):void");
    }

    public boolean J() {
        return !(((z1) ((b0.c1) this.f3618b).f1208b).isEmpty() && ((z1) ((b0.c1) this.f3620d).f1208b).isEmpty() && ((z1) ((b0.c1) this.f3619c).f1208b).isEmpty());
    }

    public boolean K() {
        if (((n2) this.f3618b).getValue() != this.f3620d) {
            return true;
        }
        e1 e1Var = (e1) this.f3619c;
        return e1Var != null && e1Var.K();
    }

    public cb.y L(m4.l0 l0Var) {
        byte[] bArr = l0Var.f14374k;
        if (bArr != null) {
            return B0(bArr);
        }
        Uri uri = l0Var.f14376m;
        if (uri == null) {
            return null;
        }
        jc.l.e(uri, "uri");
        cb.y yVarB = ((cb.a0) ((cb.z) this.f3618b)).b(new k9.a(uri, this, 1));
        jc.l.d(yVarB, "submit(...)");
        return yVarB;
    }

    public String M() {
        if (!H()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f3620d;
        this.f3620d = null;
        return str;
    }

    public ArrayList N(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < i10) {
            rg.d dVar = new rg.d();
            dVar.f19053o = tc.b0.o(bArr, i11);
            int iO = tc.b0.o(bArr, i11 + 2);
            dVar.f19054p = iO;
            int i12 = i11 + 4;
            if (iO > 0) {
                byte[] bArr2 = new byte[iO];
                System.arraycopy(bArr, i12, bArr2, 0, iO);
                dVar.f19055q = bArr2;
            }
            i11 = i12 + iO;
            arrayList.add(dVar);
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    public Object O(CharSequence charSequence, int i10, int i11, int i12, boolean z10, c4.q qVar) {
        char c3;
        c4.s sVar = new c4.s((c4.v) ((w1) this.f3619c).f1397e);
        int i13 = i10;
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        int i14 = 0;
        boolean zQ0 = true;
        int iCharCount = i13;
        while (iCharCount < i11 && i14 < i12 && zQ0) {
            SparseArray sparseArray = sVar.f3395c.f3408a;
            c4.v vVar = sparseArray == null ? null : (c4.v) sparseArray.get(iCodePointAt);
            if (sVar.f3393a == 2) {
                if (vVar != null) {
                    sVar.f3395c = vVar;
                    sVar.f3398f++;
                } else {
                    if (iCodePointAt == 65038) {
                        sVar.a();
                    } else if (iCodePointAt != 65039) {
                        c4.v vVar2 = sVar.f3395c;
                        if (vVar2.f3409b != null) {
                            if (sVar.f3398f != 1) {
                                sVar.f3396d = vVar2;
                                sVar.a();
                            } else if (sVar.b()) {
                                sVar.f3396d = sVar.f3395c;
                                sVar.a();
                            } else {
                                sVar.a();
                            }
                            c3 = 3;
                        } else {
                            sVar.a();
                        }
                    }
                    c3 = 1;
                }
                c3 = 2;
            } else if (vVar == null) {
                sVar.a();
                c3 = 1;
            } else {
                sVar.f3393a = 2;
                sVar.f3395c = vVar;
                sVar.f3398f = 1;
                c3 = 2;
            }
            sVar.f3397e = iCodePointAt;
            if (c3 == 1) {
                iCharCount = Character.charCount(Character.codePointAt(charSequence, i13)) + i13;
                if (iCharCount < i11) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                }
            } else if (c3 == 2) {
                int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                if (iCharCount2 < i11) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                }
                iCharCount = iCharCount2;
            } else if (c3 == 3) {
                if (z10 || !G(charSequence, i13, iCharCount, sVar.f3396d.f3409b)) {
                    zQ0 = qVar.Q0(charSequence, i13, iCharCount, sVar.f3396d.f3409b);
                    i14++;
                }
            }
            i13 = iCharCount;
        }
        if (sVar.f3393a == 2 && sVar.f3395c.f3409b != null && ((sVar.f3398f > 1 || sVar.b()) && i14 < i12 && zQ0 && (z10 || !G(charSequence, i13, iCharCount, sVar.f3395c.f3409b)))) {
            qVar.Q0(charSequence, i13, iCharCount, sVar.f3395c.f3409b);
        }
        return qVar.getResult();
    }

    public rg.j Q(RandomAccessFile randomAccessFile, rg.g gVar) throws IOException {
        byte b10;
        List listN;
        byte[] bArr;
        hd.q0 q0Var;
        byte[] bArr2;
        int i10;
        rg.e eVar;
        int i11;
        byte[] bArr3;
        ArrayList arrayList;
        int i12;
        rg.j jVar;
        e1 e1Var = this;
        tc.b0 b0Var = (tc.b0) e1Var.f3619c;
        byte[] bArr4 = (byte[]) b0Var.f20618b;
        byte[] bArr5 = (byte[]) b0Var.f20620d;
        byte[] bArr6 = (byte[]) b0Var.f20619c;
        if (randomAccessFile.length() == 0) {
            return new rg.j();
        }
        if (randomAccessFile.length() < 22) {
            throw new og.a("Zip file size less than minimum expected zip file size. Probably not a zip file or a corrupted zip file");
        }
        rg.j jVar2 = new rg.j();
        e1Var.f3618b = jVar2;
        try {
            jVar2.f19064b = e1Var.R(randomAccessFile, b0Var, gVar);
            rg.j jVar3 = (rg.j) e1Var.f3618b;
            rg.c cVar = jVar3.f19064b;
            if (cVar.f19050p == 0) {
                return jVar3;
            }
            long j10 = cVar.f19052r;
            rg.h hVar = new rg.h();
            V(randomAccessFile, j10 - 20);
            randomAccessFile.readFully(bArr6);
            byte b11 = 0;
            char c3 = 1;
            if (tc.b0.l(bArr6, 0) == 117853008) {
                ((rg.j) e1Var.f3618b).f19069g = true;
                randomAccessFile.readFully(bArr6);
                tc.b0.l(bArr6, 0);
                randomAccessFile.readFully(bArr5);
                hVar.f19058o = b0Var.n(bArr5, 0);
                randomAccessFile.readFully(bArr6);
                tc.b0.l(bArr6, 0);
            } else {
                ((rg.j) e1Var.f3618b).f19069g = false;
                hVar = null;
            }
            jVar3.f19065c = hVar;
            rg.j jVar4 = (rg.j) e1Var.f3618b;
            if (jVar4.f19069g) {
                rg.h hVar2 = jVar4.f19065c;
                if (hVar2 == null) {
                    throw new og.a("invalid zip64 end of central directory locator");
                }
                long j11 = hVar2.f19058o;
                if (j11 < 0) {
                    throw new og.a("invalid offset for start of end of central directory record");
                }
                randomAccessFile.seek(j11);
                rg.i iVar = new rg.i();
                randomAccessFile.readFully(bArr6);
                if (tc.b0.l(bArr6, 0) != 101075792) {
                    throw new og.a("invalid signature for zip64 end of central directory record");
                }
                randomAccessFile.readFully(bArr5);
                iVar.f19059o = b0Var.n(bArr5, 0);
                randomAccessFile.readFully(bArr4);
                tc.b0.o(bArr4, 0);
                randomAccessFile.readFully(bArr4);
                tc.b0.o(bArr4, 0);
                randomAccessFile.readFully(bArr6);
                iVar.f19062r = tc.b0.l(bArr6, 0);
                randomAccessFile.readFully(bArr6);
                tc.b0.l(bArr6, 0);
                randomAccessFile.readFully(bArr5);
                b0Var.n(bArr5, 0);
                randomAccessFile.readFully(bArr5);
                iVar.f19060p = b0Var.n(bArr5, 0);
                randomAccessFile.readFully(bArr5);
                b0Var.n(bArr5, 0);
                randomAccessFile.readFully(bArr5);
                iVar.f19061q = b0Var.n(bArr5, 0);
                long j12 = iVar.f19059o - 44;
                if (j12 > 0) {
                    randomAccessFile.readFully(new byte[(int) j12]);
                }
                jVar4.f19066d = iVar;
                rg.j jVar5 = (rg.j) e1Var.f3618b;
                rg.i iVar2 = jVar5.f19066d;
                if (iVar2 == null || iVar2.f19062r <= 0) {
                    jVar5.f19067e = false;
                } else {
                    jVar5.f19067e = true;
                }
            }
            rg.j jVar6 = (rg.j) e1Var.f3618b;
            hd.q0 q0Var2 = new hd.q0((byte) 0, 4);
            ArrayList arrayList2 = new ArrayList();
            rg.j jVar7 = (rg.j) e1Var.f3618b;
            boolean z10 = jVar7.f19069g;
            long j13 = z10 ? jVar7.f19066d.f19061q : jVar7.f19064b.f19051q;
            long j14 = z10 ? jVar7.f19066d.f19060p : jVar7.f19064b.f19050p;
            randomAccessFile.seek(j13);
            byte[] bArr7 = new byte[2];
            byte[] bArr8 = new byte[4];
            int i13 = 0;
            while (i13 < j14) {
                rg.e eVar2 = new rg.e();
                randomAccessFile.readFully(bArr6);
                byte[] bArr9 = bArr7;
                if (tc.b0.l(bArr6, b11) != 33639248) {
                    throw new og.a("Expected central directory entry not found (#" + (i13 + 1) + ")");
                }
                randomAccessFile.readFully(bArr4);
                tc.b0.o(bArr4, b11);
                randomAccessFile.readFully(bArr4);
                tc.b0.o(bArr4, b11);
                byte[] bArr10 = new byte[2];
                randomAccessFile.readFully(bArr10);
                eVar2.f19046x = nd.h.p(bArr10[b11], b11);
                eVar2.f19048z = nd.h.p(bArr10[b11], 3);
                eVar2.C = nd.h.p(bArr10[c3], 3);
                eVar2.f19037o = (byte[]) bArr10.clone();
                randomAccessFile.readFully(bArr4);
                eVar2.f19038p = q.t0.e(tc.b0.o(bArr4, b11));
                randomAccessFile.readFully(bArr6);
                eVar2.f19039q = tc.b0.l(bArr6, b11);
                byte[] bArr11 = bArr8;
                randomAccessFile.readFully(bArr11);
                int i14 = i13;
                eVar2.f19040r = b0Var.n(bArr11, b11);
                Arrays.fill(bArr5, b11);
                randomAccessFile.readFully(bArr5, b11, 4);
                eVar2.f19041s = b0Var.n(bArr5, b11);
                Arrays.fill(bArr5, b11);
                randomAccessFile.readFully(bArr5, b11, 4);
                eVar2.f19042t = b0Var.n(bArr5, b11);
                randomAccessFile.readFully(bArr4);
                int iO = tc.b0.o(bArr4, b11);
                randomAccessFile.readFully(bArr4);
                eVar2.f19043u = tc.b0.o(bArr4, b11);
                randomAccessFile.readFully(bArr4);
                int iO2 = tc.b0.o(bArr4, b11);
                randomAccessFile.readFully(bArr4);
                eVar2.F = tc.b0.o(bArr4, b11);
                randomAccessFile.readFully(bArr9);
                randomAccessFile.readFully(bArr11);
                eVar2.G = (byte[]) bArr11.clone();
                randomAccessFile.readFully(bArr11);
                hd.q0 q0Var3 = q0Var2;
                ArrayList arrayList3 = arrayList2;
                eVar2.H = b0Var.n(bArr11, 0);
                if (iO <= 0) {
                    throw new og.a("Invalid entry name in file header");
                }
                byte[] bArr12 = new byte[iO];
                randomAccessFile.readFully(bArr12);
                String strJ = u3.x0.j(bArr12, eVar2.C, null);
                eVar2.f19044v = strJ;
                eVar2.f19045w = bArr12;
                byte[] bArr13 = eVar2.G;
                byte b12 = bArr13[0];
                eVar2.E = (b12 != 0 && nd.h.p(b12, 4)) || ((b10 = bArr13[3]) != 0 && nd.h.p(b10, 6)) || strJ.endsWith("/") || strJ.endsWith("\\");
                int i15 = eVar2.f19043u;
                if (i15 > 0) {
                    if (i15 < 4) {
                        if (i15 > 0) {
                            randomAccessFile.skipBytes(i15);
                        }
                        listN = null;
                    } else {
                        byte[] bArr14 = new byte[i15];
                        randomAccessFile.read(bArr14);
                        try {
                            listN = e1Var.N(bArr14, i15);
                        } catch (Exception unused) {
                            listN = Collections.EMPTY_LIST;
                        }
                    }
                    eVar2.D = listN;
                }
                List list = eVar2.D;
                if (list == null || list.size() <= 0) {
                    bArr = bArr9;
                    q0Var = q0Var3;
                    bArr2 = bArr4;
                    bArr8 = bArr11;
                    i10 = i14;
                    eVar = eVar2;
                    i11 = iO2;
                    bArr3 = bArr5;
                    arrayList = arrayList3;
                    i12 = 4;
                    jVar = jVar6;
                } else {
                    bArr8 = bArr11;
                    bArr = bArr9;
                    q0Var = q0Var3;
                    eVar = eVar2;
                    i10 = i14;
                    bArr3 = bArr5;
                    arrayList = arrayList3;
                    jVar = jVar6;
                    i11 = iO2;
                    bArr2 = bArr4;
                    i12 = 4;
                    rg.i iVarS = S(eVar2.D, b0Var, eVar2.f19042t, eVar2.f19041s, eVar2.H, eVar2.F);
                    if (iVarS != null) {
                        eVar.A = iVarS;
                        long j15 = iVarS.f19060p;
                        if (j15 != -1) {
                            eVar.f19042t = j15;
                        }
                        long j16 = iVarS.f19059o;
                        if (j16 != -1) {
                            eVar.f19041s = j16;
                        }
                        long j17 = iVarS.f19061q;
                        if (j17 != -1) {
                            eVar.H = j17;
                        }
                        int i16 = iVarS.f19062r;
                        if (i16 != -1) {
                            eVar.F = i16;
                        }
                    }
                }
                P(eVar, b0Var);
                if (i11 > 0) {
                    byte[] bArr15 = new byte[i11];
                    randomAccessFile.readFully(bArr15);
                    u3.x0.j(bArr15, eVar.C, null);
                }
                if (eVar.f19046x) {
                    if (eVar.B != null) {
                        eVar.f19047y = i12;
                    } else {
                        eVar.f19047y = 2;
                    }
                }
                arrayList.add(eVar);
                i13 = i10 + 1;
                e1Var = this;
                arrayList2 = arrayList;
                q0Var2 = q0Var;
                bArr5 = bArr3;
                bArr7 = bArr;
                jVar6 = jVar;
                bArr4 = bArr2;
                b11 = 0;
                c3 = 1;
            }
            byte[] bArr16 = bArr4;
            rg.j jVar8 = jVar6;
            hd.q0 q0Var4 = q0Var2;
            q0Var4.f8447b = arrayList2;
            randomAccessFile.readFully(bArr6);
            if (tc.b0.l(bArr6, 0) == 84233040) {
                randomAccessFile.readFully(bArr16);
                int iO3 = tc.b0.o(bArr16, 0);
                if (iO3 > 0) {
                    byte[] bArr17 = new byte[iO3];
                    randomAccessFile.readFully(bArr17);
                    new String(bArr17);
                }
            }
            jVar8.f19063a = q0Var4;
            return (rg.j) this.f3618b;
        } catch (og.a e10) {
            throw e10;
        } catch (IOException e11) {
            e11.printStackTrace();
            throw new og.a("Zip headers not found. Probably not a zip file or a corrupted zip file", e11);
        }
    }

    public rg.c R(RandomAccessFile randomAccessFile, tc.b0 b0Var, rg.g gVar) throws IOException {
        byte[] bArr = (byte[]) this.f3620d;
        byte[] bArr2 = (byte[]) ((tc.b0) this.f3619c).f20619c;
        long length = randomAccessFile.length();
        if (length < 22) {
            throw new og.a("Zip file size less than size of zip headers. Probably not a zip file.");
        }
        long length2 = length - 22;
        V(randomAccessFile, length2);
        randomAccessFile.readFully(bArr2);
        if (tc.b0.l(bArr2, 0) != 101010256) {
            length2 = randomAccessFile.length() - 22;
            for (long length3 = randomAccessFile.length() < 65536 ? randomAccessFile.length() : 65536L; length3 > 0 && length2 > 0; length3--) {
                length2--;
                V(randomAccessFile, length2);
                randomAccessFile.readFully(bArr2);
                if (tc.b0.l(bArr2, 0) != 101010256) {
                }
            }
            throw new og.a("Zip headers not found. Probably not a zip file");
        }
        V(randomAccessFile, 4 + length2);
        rg.c cVar = new rg.c();
        byte[] bArr3 = (byte[]) b0Var.f20618b;
        randomAccessFile.readFully(bArr3);
        cVar.f19049o = tc.b0.o(bArr3, 0);
        randomAccessFile.readFully(bArr3);
        tc.b0.o(bArr3, 0);
        randomAccessFile.readFully(bArr3);
        tc.b0.o(bArr3, 0);
        randomAccessFile.readFully(bArr3);
        cVar.f19050p = tc.b0.o(bArr3, 0);
        byte[] bArr4 = (byte[]) b0Var.f20619c;
        randomAccessFile.readFully(bArr4);
        tc.b0.l(bArr4, 0);
        cVar.f19052r = length2;
        randomAccessFile.readFully(bArr);
        cVar.f19051q = b0Var.n(bArr, 0);
        randomAccessFile.readFully(bArr3);
        int iO = tc.b0.o(bArr3, 0);
        if (iO > 0) {
            try {
                byte[] bArr5 = new byte[iO];
                randomAccessFile.readFully(bArr5);
                u3.x0.j(bArr5, false, tg.b.f20755b);
            } catch (IOException unused) {
            }
        }
        ((rg.j) this.f3618b).f19067e = cVar.f19049o > 0;
        return cVar;
    }

    public void T(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m7.a aVar = (m7.a) arrayList.get(i10);
            aVar.getClass();
            b7.m mVar = (b7.m) this.f3618b;
            Object[] objArr = (Object[]) mVar.f1959c;
            jc.l.e(aVar, "instance");
            int i11 = mVar.f1958b;
            for (int i12 = 0; i12 < i11; i12++) {
                if (objArr[i12] == aVar) {
                    throw new IllegalStateException("Already in the pool!");
                }
            }
            int i13 = mVar.f1958b;
            if (i13 < objArr.length) {
                objArr[i13] = aVar;
                mVar.f1958b = i13 + 1;
            }
        }
        arrayList.clear();
    }

    public void U(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.f3618b).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.f3620d) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void W(i7.c0 c0Var) {
        jc.l.e(c0Var, "states");
        this.f3618b = c0Var.f9056a;
        this.f3620d = c0Var.f9058c;
        this.f3619c = c0Var.f9057b;
    }

    public void X(i7.c0 c0Var, i7.c0 c0Var2) {
        Object value;
        i7.l lVarA;
        jc.l.e(c0Var, "sourceLoadStates");
        lf.b1 b1Var = (lf.b1) this.f3619c;
        do {
            value = b1Var.getValue();
            i7.l lVar = (i7.l) value;
            lVarA = a(this, lVar, c0Var, c0Var2);
            if (jc.l.a(lVar, lVarA)) {
                return;
            }
        } while (!b1Var.k(value, lVarA));
        Iterator it = ((CopyOnWriteArrayList) this.f3618b).iterator();
        while (it.hasNext()) {
            ((ic.k) it.next()).a(lVarA);
        }
    }

    public void Y(i7.d0 d0Var, i7.b0 b0Var) {
        jc.l.e(d0Var, "type");
        int iOrdinal = d0Var.ordinal();
        if (iOrdinal == 0) {
            this.f3618b = b0Var;
        } else if (iOrdinal == 1) {
            this.f3619c = b0Var;
        } else {
            if (iOrdinal != 2) {
                throw new ce.j0();
            }
            this.f3620d = b0Var;
        }
    }

    public void Z(Object obj) {
        long jC = f1.g.c();
        if (jC == f1.o.f6649a) {
            this.f3620d = obj;
            return;
        }
        synchronized (this.f3619c) {
            f1.n nVar = (f1.n) ((AtomicReference) this.f3618b).get();
            int iA = nVar.a(jC);
            if (iA < 0) {
                ((AtomicReference) this.f3618b).set(nVar.b(jC, obj));
            } else {
                nVar.f6648c[iA] = obj;
            }
        }
    }

    public void a0(q1.o oVar) {
        ((s1.b) this.f3620d).f19345a.f19343c = oVar;
    }

    @Override // x0.c
    public void b(int i10, Object obj) {
        ((i2.j0) this.f3619c).B(i10, (i2.j0) obj);
    }

    public void b0(f3.c cVar) {
        ((s1.b) this.f3620d).f19345a.f19341a = cVar;
    }

    @Override // x0.c
    public void c(Object obj) {
        ((ArrayList) this.f3620d).add(this.f3619c);
        this.f3619c = obj;
    }

    public void c0(f3.m mVar) {
        ((s1.b) this.f3620d).f19345a.f19342b = mVar;
    }

    @Override // x0.c
    public void d() {
        k1.b bVar;
        i2.j0 j0Var = (i2.j0) this.f3619c;
        i2.d1 d1Var = j0Var.F;
        if (!j0Var.I()) {
            f2.a.a("onReuse is only expected on attached node");
        }
        i3.q qVar = j0Var.f8756o;
        if (qVar != null) {
            View view = qVar.f8951b;
            if (view.getParent() != qVar) {
                qVar.addView(view);
            } else {
                qVar.f8955f.b();
            }
        }
        g2.p0 p0Var = j0Var.H;
        if (p0Var != null) {
            p0Var.e(false);
        }
        j0Var.f8761t = false;
        if (j0Var.Q) {
            j0Var.Q = false;
        } else {
            j1.p pVar = j0Var.F.f8666e;
            for (j1.p pVar2 = pVar; pVar2 != null; pVar2 = pVar2.f9694e) {
                if (pVar2.f9703n) {
                    pVar2.w0();
                }
            }
            for (j1.p pVar3 = pVar; pVar3 != null; pVar3 = pVar3.f9694e) {
                if (pVar3.f9703n) {
                    pVar3.y0();
                }
            }
            while (pVar != null) {
                if (pVar.f9703n) {
                    pVar.q0();
                }
                pVar = pVar.f9694e;
            }
        }
        int i10 = j0Var.f8743b;
        j0Var.f8743b = q2.m.f17634a.addAndGet(1);
        i2.p1 p1Var = j0Var.f8755n;
        if (p1Var != null) {
            j2.v vVar = (j2.v) p1Var;
            vVar.getLayoutNodes().g(i10);
            vVar.getLayoutNodes().h(j0Var.f8743b, j0Var);
        }
        for (j1.p pVar4 = d1Var.f8667f; pVar4 != null; pVar4 = pVar4.f9695f) {
            pVar4.p0();
        }
        d1Var.e();
        if (d1Var.d(8)) {
            j0Var.G();
        }
        i2.j0.Z(j0Var);
        i2.p1 p1Var2 = j0Var.f8755n;
        if (p1Var2 != null) {
            j2.v vVar2 = (j2.v) p1Var2;
            if (j2.v.e() && (bVar = vVar2.F) != null) {
                j2.v vVar3 = bVar.f10985c;
                p2 p2Var = bVar.f10983a;
                o.z zVar = bVar.f10990h;
                if (zVar.e(i10)) {
                    p2Var.C(vVar3, i10, false);
                }
                q2.k kVarX = j0Var.x();
                if (kVarX != null && kVarX.f17630a.b(q2.t.f17686q)) {
                    zVar.a(j0Var.f8743b);
                    p2Var.C(vVar3, j0Var.f8743b, true);
                }
            }
            vVar2.getRectManager().g(j0Var, true);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.AbstractCollection, java.util.List] */
    public void d0(p1 p1Var) {
        w0 w0Var = (w0) this.f3618b;
        w0Var.f3745g = p1Var;
        synchronized (w0Var.f3742d) {
            for (int iBeginBroadcast = w0Var.f3744f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((f) w0Var.f3744f.getBroadcastItem(iBeginBroadcast)).j(p1Var);
                } catch (RemoteException unused) {
                }
            }
            w0Var.f3744f.finishBroadcast();
        }
        MediaSession mediaSession = w0Var.f3739a;
        if (p1Var.f3698l == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(p1Var.f3687a, p1Var.f3688b, p1Var.f3690d, p1Var.f3694h);
            builder.setBufferedPosition(p1Var.f3689c);
            builder.setActions(p1Var.f3691e);
            builder.setErrorMessage(p1Var.f3693g);
            for (o1 o1Var : p1Var.f3695i) {
                PlaybackState.CustomAction customActionBuild = o1Var.f3679e;
                if (customActionBuild == null) {
                    PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(o1Var.f3675a, o1Var.f3676b, o1Var.f3677c);
                    builder2.setExtras(o1Var.f3678d);
                    customActionBuild = builder2.build();
                }
                if (customActionBuild != null) {
                    builder.addCustomAction(customActionBuild);
                }
            }
            builder.setActiveQueueItemId(p1Var.f3696j);
            if (Build.VERSION.SDK_INT >= 22) {
                n1.b(builder, p1Var.f3697k);
            }
            p1Var.f3698l = builder.build();
        }
        mediaSession.setPlaybackState(p1Var.f3698l);
    }

    @Override // x0.c
    public void e(int i10, int i11, int i12) {
        ((i2.j0) this.f3619c).M(i10, i11, i12);
    }

    public void e0(long j10) {
        ((s1.b) this.f3620d).f19345a.f19344d = j10;
    }

    @Override // x0.c
    public void f(int i10, int i11) {
        ((i2.j0) this.f3619c).T(i10, i11);
    }

    public i7.c0 f0() {
        return new i7.c0((i7.b0) this.f3618b, (i7.b0) this.f3619c, (i7.b0) this.f3620d);
    }

    @Override // r8.e
    public boolean g() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f3618b;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public se.w0 g0(ed.i r8, qd.a r9, boolean r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f3618b
            b0.w1 r0 = (b0.w1) r0
            java.lang.Object r1 = r0.f1395c
            od.a r1 = (od.a) r1
            java.lang.String r2 = "arrayType"
            jc.l.e(r8, r2)
            boolean r9 = r9.f18141d
            ed.b0 r2 = r8.f6501b
            boolean r3 = r2 instanceof ed.z
            r4 = 0
            if (r3 == 0) goto L1a
            r3 = r2
            ed.z r3 = (ed.z) r3
            goto L1b
        L1a:
            r3 = r4
        L1b:
            if (r3 == 0) goto L35
            java.lang.Class r3 = r3.f6518a
            java.lang.Class r5 = java.lang.Void.TYPE
            boolean r5 = jc.l.a(r3, r5)
            if (r5 == 0) goto L28
            goto L35
        L28:
            java.lang.String r3 = r3.getName()
            je.c r3 = je.c.b(r3)
            vc.k r3 = r3.d()
            goto L36
        L35:
            r3 = r4
        L36:
            od.c r5 = new od.c
            r6 = 1
            r5.<init>(r0, r8, r6)
            if (r3 == 0) goto L70
            yc.y r8 = r1.f16329o
            vc.i r8 = r8.g()
            se.a0 r8 = r8.q(r3)
            zc.i r10 = new zc.i
            zc.h r0 = r8.getAnnotations()
            r1 = 2
            zc.h[] r1 = new zc.h[r1]
            r2 = 0
            r1[r2] = r0
            r1[r6] = r5
            r10.<init>(r1)
            se.w r8 = ud.e.S(r8, r10)
            java.lang.String r10 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"
            jc.l.c(r8, r10)
            se.a0 r8 = (se.a0) r8
            if (r9 == 0) goto L67
            return r8
        L67:
            se.a0 r9 = r8.z(r6)
            se.w0 r8 = se.c.g(r8, r9)
            return r8
        L70:
            se.s0 r8 = se.s0.f19985b
            r0 = 6
            qd.a r8 = n7.e.F(r8, r9, r4, r0)
            se.w r8 = r7.h0(r2, r8)
            se.x0 r0 = se.x0.INVARIANT
            se.x0 r2 = se.x0.OUT_VARIANCE
            if (r9 == 0) goto L8f
            if (r10 == 0) goto L84
            r0 = r2
        L84:
            yc.y r9 = r1.f16329o
            vc.i r9 = r9.g()
            se.a0 r8 = r9.i(r0, r8, r5)
            return r8
        L8f:
            yc.y r9 = r1.f16329o
            vc.i r9 = r9.g()
            se.a0 r9 = r9.i(r0, r8, r5)
            yc.y r10 = r1.f16329o
            vc.i r10 = r10.g()
            se.a0 r8 = r10.i(r2, r8, r5)
            se.a0 r8 = r8.z(r6)
            se.w0 r8 = se.c.g(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.e1.g0(ed.i, qd.a, boolean):se.w0");
    }

    public se.w h0(sd.d dVar, qd.a aVar) {
        od.a aVar2 = (od.a) ((w1) this.f3618b).f1395c;
        if (dVar instanceof ed.z) {
            Class cls = ((ed.z) dVar).f6518a;
            vc.k kVarD = jc.l.a(cls, Void.TYPE) ? null : je.c.b(cls.getName()).d();
            return kVarD != null ? aVar2.f16329o.g().s(kVarD) : aVar2.f16329o.g().w();
        }
        boolean z10 = false;
        if (!(dVar instanceof ed.q)) {
            if (dVar instanceof ed.i) {
                return g0((ed.i) dVar, aVar, false);
            }
            if (dVar instanceof ed.e0) {
                ed.b0 b0VarC = ((ed.e0) dVar).c();
                return b0VarC != null ? h0(b0VarC, aVar) : aVar2.f16329o.g().o();
            }
            if (dVar == null) {
                return aVar2.f16329o.g().o();
            }
            throw new UnsupportedOperationException("Unsupported type: " + dVar);
        }
        ed.q qVar = (ed.q) dVar;
        if (!aVar.f18141d && aVar.f18138a != se.s0.f19984a) {
            z10 = true;
        }
        Type type = qVar.f6510a;
        boolean zD = qVar.d();
        ue.k kVar = ue.k.UNRESOLVED_JAVA_CLASS;
        if (!zD && !z10) {
            se.a0 a0VarO = o(qVar, aVar, null);
            return a0VarO != null ? a0VarO : ue.l.c(kVar, type.toString());
        }
        se.a0 a0VarO2 = o(qVar, qd.a.a(aVar, qd.b.f18146c, false, null, null, 61), null);
        if (a0VarO2 == null) {
            return ue.l.c(kVar, type.toString());
        }
        se.a0 a0VarO3 = o(qVar, qd.a.a(aVar, qd.b.f18145b, false, null, null, 61), a0VarO2);
        return a0VarO3 == null ? ue.l.c(kVar, type.toString()) : zD ? new qd.h(a0VarO2, a0VarO3) : se.c.g(a0VarO2, a0VarO3);
    }

    public void i(i2.j0 j0Var, i2.w wVar) {
        b0.c1 c1Var = (b0.c1) this.f3618b;
        b0.c1 c1Var2 = (b0.c1) this.f3619c;
        b0.c1 c1Var3 = (b0.c1) this.f3620d;
        int iOrdinal = wVar.ordinal();
        if (iOrdinal == 0) {
            c1Var.e(j0Var);
            c1Var3.e(j0Var);
            return;
        }
        if (iOrdinal == 1) {
            c1Var2.e(j0Var);
            c1Var3.e(j0Var);
            return;
        }
        if (iOrdinal == 2) {
            if (j0Var.f8749h != null) {
                c1Var3.e(j0Var);
                return;
            } else {
                c1Var.e(j0Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            throw new ce.j0();
        }
        if (j0Var.f8749h != null) {
            c1Var3.e(j0Var);
        } else {
            c1Var2.e(j0Var);
        }
    }

    public void i0() {
        o.k0 k0Var = (o.k0) this.f3618b;
        String str = (String) this.f3619c;
        List list = (List) k0Var.k(str);
        if (list != null) {
            list.remove((ic.a) this.f3620d);
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        k0Var.m(str, list);
    }

    @Override // x0.c
    public void j() {
        this.f3619c = ((ArrayList) this.f3620d).remove(r0.size() - 1);
    }

    @Override // x0.c
    public /* bridge */ /* synthetic */ void k(int i10, Object obj) {
    }

    @Override // x0.c
    public void l() {
        i2.p1 p1Var = ((i2.j0) this.f3618b).f8755n;
        if (p1Var != null) {
            ((j2.v) p1Var).B();
        }
    }

    public void m() {
        ((ArrayList) this.f3620d).clear();
        this.f3619c = this.f3618b;
        ((i2.j0) this.f3618b).S();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0204  */
    /* JADX WARN: Type inference failed for: r10v9, types: [se.k0] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, ub.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public se.a0 o(ed.q r25, qd.a r26, se.a0 r27) {
        /*
            Method dump skipped, instruction units count: 1063
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.e1.o(ed.q, qd.a, se.a0):se.a0");
    }

    public boolean p(i2.j0 j0Var) {
        return !(j0Var.f8749h == null) && (((z1) ((b0.c1) this.f3618b).f1208b).contains(j0Var) || ((z1) ((b0.c1) this.f3619c).f1208b).contains(j0Var));
    }

    @Override // x0.c
    public void q(ic.n nVar, Object obj) {
        nVar.q(this.f3619c, obj);
    }

    @Override // a3.d
    public a3.c r() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((pe.d) this.f3620d)) {
            try {
                a3.c cVar = (a3.c) this.f3619c;
                if (cVar != null && localeList == ((LocaleList) this.f3618b)) {
                    return cVar;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(new a3.b(localeList.get(i10)));
                }
                a3.c cVar2 = new a3.c(arrayList);
                this.f3618b = localeList;
                this.f3619c = cVar2;
                return cVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // r8.e
    public void shutdown() {
        ((ConnectivityManager) this.f3618b).unregisterNetworkCallback((r8.f) this.f3620d);
    }

    public String toString() {
        switch (this.f3617a) {
            case 11:
                String str = (String) this.f3620d;
                String str2 = (String) this.f3619c;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f3618b;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                String string = sb.toString();
                jc.l.d(string, "toString(...)");
                return string;
            case 25:
                return ((bh.a) this.f3619c).toString() + ", hidden list:" + ((ArrayList) this.f3620d).size();
            default:
                return super.toString();
        }
    }

    public int u(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.f3619c;
        int size = arrayList.size();
        while (i11 < size) {
            ((m7.a) arrayList.get(i11)).getClass();
            i11++;
        }
        return i10;
    }

    public b5.t v(m4.i0 i0Var) {
        b5.j jVar;
        i0Var.f14286b.getClass();
        m4.a0 a0Var = i0Var.f14286b.f14180c;
        if (a0Var == null) {
            return b5.t.f1597b0;
        }
        synchronized (this.f3618b) {
            try {
                if (!a0Var.equals((m4.a0) this.f3619c)) {
                    this.f3619c = a0Var;
                    this.f3620d = s(a0Var);
                }
                jVar = (b5.j) this.f3620d;
                jVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }

    public i7.b0 w(i7.d0 d0Var) {
        jc.l.e(d0Var, "loadType");
        int iOrdinal = d0Var.ordinal();
        if (iOrdinal == 0) {
            return (i7.b0) this.f3618b;
        }
        if (iOrdinal == 1) {
            return (i7.b0) this.f3619c;
        }
        if (iOrdinal == 2) {
            return (i7.b0) this.f3620d;
        }
        throw new ce.j0();
    }

    @Override // a3.d
    public Locale x(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (jc.l.a(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }

    public Object y() {
        long jC = f1.g.c();
        if (jC == f1.o.f6649a) {
            return this.f3620d;
        }
        f1.n nVar = (f1.n) ((AtomicReference) this.f3618b).get();
        int iA = nVar.a(jC);
        if (iA >= 0) {
            return nVar.f6648c[iA];
        }
        return null;
    }

    public q1.o z() {
        return ((s1.b) this.f3620d).f19345a.f19343c;
    }

    public e1(jc.o oVar, y0.i0 i0Var, bc.a aVar, ArrayList arrayList) {
        this.f3617a = 19;
        jc.l.e(i0Var, "protoSet");
        jc.l.e(aVar, "entries");
        this.f3618b = oVar;
        this.f3619c = i0Var;
        this.f3620d = aVar;
    }

    public e1(ud.g gVar, dd.b bVar) {
        this.f3617a = 9;
        this.f3618b = gVar;
        this.f3619c = bVar;
        this.f3620d = new ConcurrentHashMap();
    }

    public e1(w1 w1Var, od.e eVar) {
        this.f3617a = 27;
        jc.l.e(eVar, "typeParameterResolver");
        this.f3618b = w1Var;
        this.f3619c = eVar;
        this.f3620d = new m0.w(new qd.e());
    }

    public e1(int i10) {
        cb.z a0Var;
        cb.z zVar;
        this.f3617a = i10;
        switch (i10) {
            case 5:
                this.f3618b = new WeakHashMap();
                this.f3619c = new WeakHashMap();
                this.f3620d = new WeakHashMap();
                break;
            case 6:
                this.f3618b = new Object();
                break;
            case 12:
                this.f3618b = new AtomicReference(f1.g.f6630c);
                this.f3619c = new Object();
                break;
            case 14:
                this.f3618b = new HashSet();
                this.f3619c = g5.i.f7382b;
                break;
            case 15:
                this.f3618b = new b0.c1(27);
                this.f3619c = new b0.c1(27);
                this.f3620d = new b0.c1(27);
                break;
            case 17:
                this.f3618b = new CopyOnWriteArrayList();
                lf.b1 b1VarC = lf.p0.c(null);
                this.f3619c = b1VarC;
                this.f3620d = new lf.k0(b1VarC);
                break;
            case 18:
                i7.a0 a0Var2 = i7.a0.f9030c;
                this.f3618b = a0Var2;
                this.f3619c = a0Var2;
                this.f3620d = a0Var2;
                break;
            case 21:
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
                if (executorServiceNewFixedThreadPool instanceof cb.z) {
                    zVar = (cb.z) executorServiceNewFixedThreadPool;
                } else {
                    if (executorServiceNewFixedThreadPool instanceof ScheduledExecutorService) {
                        a0Var = new cb.d0((ScheduledExecutorService) executorServiceNewFixedThreadPool);
                    } else {
                        a0Var = new cb.a0(executorServiceNewFixedThreadPool);
                    }
                    zVar = a0Var;
                }
                this.f3618b = zVar;
                this.f3619c = "";
                break;
            case 23:
                break;
            case 26:
                this.f3619c = new tc.b0();
                this.f3620d = new byte[4];
                break;
            default:
                this.f3620d = new pe.d(9);
                break;
        }
    }

    public e1(p2 p2Var) {
        this.f3617a = 25;
        this.f3618b = p2Var;
        this.f3619c = new bh.a();
        this.f3620d = new ArrayList();
    }

    public e1(r5.r rVar) {
        this.f3617a = 20;
        this.f3618b = rVar;
    }

    public e1(s1.b bVar) {
        this.f3617a = 29;
        this.f3620d = bVar;
        this.f3618b = new y1(5, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e1(m3.c r19) {
        /*
            Method dump skipped, instruction units count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.e1.<init>(m3.c):void");
    }

    public e1(ConnectivityManager connectivityManager, x8.i iVar) {
        this.f3617a = 28;
        this.f3618b = connectivityManager;
        this.f3619c = iVar;
        r8.f fVar = new r8.f(this);
        this.f3620d = fVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), fVar);
    }

    public e1(m3.l lVar) {
        this.f3617a = 24;
        this.f3618b = new b7.m(30, 9);
        this.f3620d = new ArrayList();
        this.f3619c = new ArrayList();
        new m3.l(4, this);
    }

    public e1(w1 w1Var, pe.d dVar, c4.d dVar2, Set set) {
        this.f3617a = 8;
        this.f3618b = dVar;
        this.f3619c = w1Var;
        this.f3620d = dVar2;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            O(str, 0, str.length(), 1, true, new app.nekogram.translator.r(2, str));
        }
    }

    public e1(x2.p pVar, e1 e1Var) {
        this.f3617a = 4;
        this.f3618b = pVar;
        this.f3619c = e1Var;
        this.f3620d = pVar.f24575a;
    }

    public e1(i2.j0 j0Var) {
        this.f3617a = 16;
        this.f3618b = j0Var;
        this.f3620d = new ArrayList();
        this.f3619c = j0Var;
    }

    public e1(MainService mainService, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f3617a = 0;
        this.f3620d = new ArrayList();
        if (mainService != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null) {
                    int i10 = g0.f3631a;
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setPackage(mainService.getPackageName());
                    List<ResolveInfo> listQueryBroadcastReceivers = mainService.getPackageManager().queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers.size() == 1) {
                        ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
                        componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                    } else {
                        if (listQueryBroadcastReceivers.size() > 1) {
                            Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                        }
                        componentName = null;
                    }
                    if (componentName == null) {
                        Log.i("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                    }
                }
                if (componentName != null && pendingIntent == null) {
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent2.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(mainService, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 29) {
                    this.f3618b = new a1(mainService, str, bundle);
                } else if (i11 >= 28) {
                    this.f3618b = new z0(mainService, str, bundle);
                } else if (i11 >= 22) {
                    this.f3618b = new y0(mainService, str, bundle);
                } else {
                    this.f3618b = new w0(mainService, str, bundle);
                }
                Looper looperMyLooper = Looper.myLooper();
                ((w0) this.f3618b).e(new s0(), new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper));
                ((w0) this.f3618b).f3739a.setMediaButtonReceiver(pendingIntent);
                this.f3619c = new androidx.media3.exoplayer.offline.u(mainService, ((w0) this.f3618b).f3741c);
                if (f3616e == 0) {
                    f3616e = (int) (TypedValue.applyDimension(1, 320.0f, mainService.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public e1(b7.d1 d1Var) {
        this.f3617a = 7;
        this.f3620d = d1Var;
        this.f3618b = new i(this);
    }

    public e1(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f3617a = 10;
        this.f3619c = arrayDeque;
        this.f3618b = bufferedReader;
    }
}
