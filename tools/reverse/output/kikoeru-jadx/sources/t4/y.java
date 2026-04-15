package t4;

import android.database.SQLException;
import android.os.ConditionVariable;
import b7.b1;
import j2.h0;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;
import ya.m0;
import ya.o1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y implements b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashSet f20486j = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f20487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f20488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1 f20489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f20490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f20491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Random f20492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f20494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f20495i;

    public y(File file, g gVar, r4.a aVar) {
        boolean zAdd;
        b1 b1Var = new b1(aVar, file);
        i iVar = aVar != null ? new i(aVar) : null;
        synchronized (y.class) {
            zAdd = f20486j.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f20487a = file;
        this.f20488b = gVar;
        this.f20489c = b1Var;
        this.f20490d = iVar;
        this.f20491e = new HashMap();
        this.f20492f = new Random();
        this.f20493g = gVar.d();
        this.f20494h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new x(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void a(y yVar) {
        long j10;
        i iVar = yVar.f20490d;
        b1 b1Var = yVar.f20489c;
        File file = yVar.f20487a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (a e10) {
                yVar.f20495i = e10;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            p4.c.n("SimpleCache", str);
            yVar.f20495i = new a(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                j10 = -1;
                break;
            }
            File file2 = fileArrListFiles[i10];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j10 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    p4.c.n("SimpleCache", "Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i10++;
        }
        yVar.f20494h = j10;
        if (j10 == -1) {
            try {
                yVar.f20494h = f(file);
            } catch (IOException e11) {
                String str2 = "Failed to create cache UID: " + file;
                p4.c.o("SimpleCache", str2, e11);
                yVar.f20495i = new a(str2, e11);
                return;
            }
        }
        try {
            b1Var.y(yVar.f20494h);
            if (iVar != null) {
                iVar.c(yVar.f20494h);
                HashMap mapB = iVar.b();
                yVar.k(file, true, fileArrListFiles, mapB);
                iVar.d(mapB.keySet());
            } else {
                yVar.k(file, true, fileArrListFiles, null);
            }
            o1 it = m0.q(((HashMap) b1Var.f1650b).keySet()).iterator();
            while (it.hasNext()) {
                b1Var.H((String) it.next());
            }
            try {
                b1Var.K();
            } catch (IOException e12) {
                p4.c.o("SimpleCache", "Storing index file failed", e12);
            }
        } catch (IOException e13) {
            String str3 = "Failed to initialize cache indices: " + file;
            p4.c.o("SimpleCache", str3, e13);
            yVar.f20495i = new a(str3, e13);
        }
    }

    public static void e(File file) throws a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        p4.c.n("SimpleCache", str);
        throw new a(str);
    }

    public static long f(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, h0.j(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public final void b(z zVar) {
        String str = zVar.f20449a;
        this.f20489c.x(str).f20469c.add(zVar);
        ArrayList arrayList = (ArrayList) this.f20491e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((g) arrayList.get(size)).b(this, zVar);
            }
        }
        this.f20488b.b(this, zVar);
    }

    public final synchronized void c(String str, i iVar) {
        d();
        b1 b1Var = this.f20489c;
        o oVarX = b1Var.x(str);
        s sVar = oVarX.f20471e;
        s sVarA = sVar.a(iVar);
        oVarX.f20471e = sVarA;
        if (!sVarA.equals(sVar)) {
            ((q) b1Var.f1654f).g(oVarX);
        }
        try {
            this.f20489c.K();
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    public final synchronized void d() {
        a aVar = this.f20495i;
        if (aVar != null) {
            throw aVar;
        }
    }

    public final synchronized long g(long j10, long j11, String str) {
        long j12;
        long j13 = j11 == -1 ? Long.MAX_VALUE : j11 + j10;
        long j14 = j13 >= 0 ? j13 : Long.MAX_VALUE;
        long j15 = j10;
        j12 = 0;
        while (j15 < j14) {
            String str2 = str;
            long jH = h(j15, j14 - j15, str2);
            if (jH > 0) {
                j12 += jH;
            } else {
                jH = -jH;
            }
            j15 += jH;
            str = str2;
        }
        return j12;
    }

    public final synchronized long h(long j10, long j11, String str) {
        o oVarV;
        if (j11 == -1) {
            j11 = Long.MAX_VALUE;
        }
        oVarV = this.f20489c.v(str);
        return oVarV != null ? oVarV.a(j10, j11) : -j11;
    }

    public final synchronized TreeSet i(String str) {
        o oVarV;
        try {
            oVarV = this.f20489c.v(str);
        } catch (Throwable th2) {
            throw th2;
        }
        return (oVarV == null || oVarV.f20469c.isEmpty()) ? new TreeSet() : new TreeSet((Collection) oVarV.f20469c);
    }

    public final synchronized s j(String str) {
        o oVarV;
        oVarV = this.f20489c.v(str);
        return oVarV != null ? oVarV.f20471e : s.f20477c;
    }

    public final void k(File file, boolean z10, File[] fileArr, Map map) {
        long j10;
        long j11;
        if (fileArr == null || fileArr.length == 0) {
            if (z10) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z10 && name.indexOf(46) == -1) {
                k(file2, false, file2.listFiles(), map);
            } else if (!z10 || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                h hVar = map != null ? (h) map.remove(name) : null;
                if (hVar != null) {
                    j10 = hVar.f20443a;
                    j11 = hVar.f20444b;
                } else {
                    j10 = -1;
                    j11 = -9223372036854775807L;
                }
                z zVarB = z.b(file2, j10, j11, this.f20489c);
                if (zVarB != null) {
                    b(zVarB);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void l(z zVar) {
        o oVarV = this.f20489c.v(zVar.f20449a);
        oVarV.getClass();
        long j10 = zVar.f20450b;
        ArrayList arrayList = oVarV.f20470d;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((n) arrayList.get(i10)).f20465a == j10) {
                arrayList.remove(i10);
                this.f20489c.H(oVarV.f20468b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    public final synchronized void m(String str) {
        Iterator it = i(str).iterator();
        while (it.hasNext()) {
            n((k) it.next());
        }
    }

    public final void n(k kVar) {
        String str = kVar.f20449a;
        File file = kVar.f20453e;
        b1 b1Var = this.f20489c;
        o oVarV = b1Var.v(str);
        if (oVarV == null || !oVarV.f20469c.remove(kVar)) {
            return;
        }
        if (file != null) {
            file.delete();
        }
        i iVar = this.f20490d;
        if (iVar != null) {
            file.getClass();
            String name = file.getName();
            try {
                ((String) iVar.f20447b).getClass();
                try {
                    ((r4.a) iVar.f20446a).getWritableDatabase().delete((String) iVar.f20447b, "name = ?", new String[]{name});
                } catch (SQLException e10) {
                    throw new androidx.media3.exoplayer.offline.e(e10);
                }
            } catch (IOException unused) {
                h0.v("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        b1Var.H(oVarV.f20468b);
        ArrayList arrayList = (ArrayList) this.f20491e.get(kVar.f20449a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((g) arrayList.get(size)).a(kVar);
            }
        }
        this.f20488b.a(kVar);
    }

    public final void o() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.f20489c.f1650b).values()).iterator();
        while (it.hasNext()) {
            for (k kVar : ((o) it.next()).f20469c) {
                File file = kVar.f20453e;
                file.getClass();
                if (file.length() != kVar.f20451c) {
                    arrayList.add(kVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            n((k) arrayList.get(i10));
        }
    }

    public final synchronized z p(long j10, long j11, String str) {
        long j12;
        z zVarB;
        z zVar;
        d();
        o oVarV = this.f20489c.v(str);
        if (oVarV == null) {
            j12 = j10;
            zVar = new z(str, j12, j11, -9223372036854775807L, null);
        } else {
            j12 = j10;
            while (true) {
                zVarB = oVarV.b(j12, j11);
                if (!zVarB.f20452d) {
                    break;
                }
                File file = zVarB.f20453e;
                file.getClass();
                if (file.length() == zVarB.f20451c) {
                    break;
                }
                o();
            }
            zVar = zVarB;
        }
        if (zVar.f20452d) {
            return q(str, zVar);
        }
        o oVarX = this.f20489c.x(str);
        long j13 = zVar.f20451c;
        ArrayList arrayList = oVarX.f20470d;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            n nVar = (n) arrayList.get(i10);
            long j14 = nVar.f20465a;
            if (j14 <= j12) {
                long j15 = nVar.f20466b;
                if (j15 == -1 || j14 + j15 > j12) {
                    return null;
                }
            } else {
                if (j13 == -1 || j12 + j13 > j14) {
                    return null;
                }
            }
        }
        arrayList.add(new n(j12, j13));
        return zVar;
    }

    public final z q(String str, z zVar) {
        boolean z10;
        File file;
        File file2 = zVar.f20453e;
        if (!this.f20493g) {
            return zVar;
        }
        file2.getClass();
        String name = file2.getName();
        long j10 = zVar.f20451c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        i iVar = this.f20490d;
        if (iVar != null) {
            try {
                iVar.e(j10, jCurrentTimeMillis, name);
            } catch (IOException unused) {
                jCurrentTimeMillis = jCurrentTimeMillis;
                p4.c.B("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z10 = false;
        } else {
            z10 = true;
        }
        o oVarV = this.f20489c.v(str);
        oVarV.getClass();
        TreeSet treeSet = oVarV.f20469c;
        p4.c.i(treeSet.remove(zVar));
        file2.getClass();
        if (z10) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileC = z.c(parentFile, oVarV.f20467a, zVar.f20450b, jCurrentTimeMillis);
            if (file2.renameTo(fileC)) {
                file = fileC;
            } else {
                p4.c.B("CachedContent", "Failed to rename " + file2 + " to " + fileC);
                file = file2;
            }
        } else {
            file = file2;
        }
        p4.c.i(zVar.f20452d);
        z zVar2 = new z(zVar.f20449a, zVar.f20450b, zVar.f20451c, jCurrentTimeMillis, file);
        treeSet.add(zVar2);
        ArrayList arrayList = (ArrayList) this.f20491e.get(zVar.f20449a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((g) arrayList.get(size)).e(this, zVar, zVar2);
            }
        }
        this.f20488b.e(this, zVar, zVar2);
        return zVar2;
    }
}
