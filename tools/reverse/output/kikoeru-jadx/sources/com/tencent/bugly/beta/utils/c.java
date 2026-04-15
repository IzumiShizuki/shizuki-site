package com.tencent.bugly.beta.utils;

import android.util.Log;
import com.tencent.bugly.proguard.X;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Vector;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<Long, String> f4476a = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f4478c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.tencent.bugly.beta.utils.a f4477b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f4479d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f4480e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HashMap<String, b> f4481f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f4482g = new byte[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f4483h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f4484i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f4485j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f4486k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f4487l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f4488m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f4489n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f4490o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f4491p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f4492q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f4493r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f4494s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f4495t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f4496u = 0;

    /* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f4497a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f4498b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f4499c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f4500d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f4501e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f4502f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f4503g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f4504h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f4505i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f4506j = 0;

        public long a() {
            return this.f4500d;
        }

        public long b() {
            return this.f4506j;
        }

        public long c() {
            return this.f4497a;
        }

        public long d() {
            return this.f4501e;
        }

        public long e() {
            return this.f4502f;
        }

        public synchronized void f(long j10) {
            this.f4503g = j10;
        }

        public synchronized void g(long j10) {
            this.f4497a = j10;
        }

        public synchronized void h(long j10) {
            this.f4501e = j10;
        }

        public synchronized void i(long j10) {
            this.f4502f = j10;
        }

        public synchronized void j(long j10) {
            this.f4498b = j10;
        }

        public synchronized void a(long j10) {
            this.f4500d = j10;
        }

        public synchronized void b(long j10) {
            this.f4505i = j10;
        }

        public synchronized void c(long j10) {
            this.f4506j = j10;
        }

        public synchronized void d(long j10) {
            this.f4499c = j10;
        }

        public synchronized void e(long j10) {
            this.f4504h = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f4507a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f4508b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f4509c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f4510d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f4511e = 0;

        public long a() {
            return this.f4509c;
        }

        public synchronized void b(long j10) {
            this.f4511e = j10;
        }

        public synchronized void c(long j10) {
            this.f4509c = j10;
        }

        public synchronized void d(long j10) {
            this.f4510d = j10;
        }

        public synchronized void a(String str) {
            this.f4507a = str;
        }

        public synchronized void a(long j10) {
            this.f4508b = j10;
        }
    }

    public c(String str) {
        this.f4478c = str;
        f4476a.put(3L, "x86");
        f4476a.put(7L, "x86");
        f4476a.put(8L, "mips");
        f4476a.put(10L, "mips");
        f4476a.put(40L, "armeabi");
        f4476a.put(62L, "x86_64");
        f4476a.put(183L, "arm64-v8a");
    }

    private long b(byte b10) {
        if (1 == b10) {
            return 32L;
        }
        return 2 == b10 ? 64L : 0L;
    }

    private String c() {
        return this.f4485j;
    }

    private long d() {
        return this.f4489n;
    }

    private long e() {
        return this.f4495t;
    }

    private long f() {
        return this.f4496u;
    }

    private synchronized boolean g() {
        if (this.f4477b != null) {
            b();
        }
        try {
            this.f4477b = new com.tencent.bugly.beta.utils.a(this.f4478c, this.f4480e);
        } catch (Exception e10) {
            Log.e("ElfParser", e10.getMessage());
            return false;
        }
        return true;
    }

    private synchronized boolean h() {
        if (this.f4477b != null) {
            b();
        }
        try {
            this.f4477b = new com.tencent.bugly.beta.utils.a(this.f4478c);
        } catch (Exception e10) {
            Log.e("ElfParser", e10.getMessage());
            return false;
        }
        return true;
    }

    private boolean i() {
        if (!h()) {
            return false;
        }
        if (j()) {
            b();
            return true;
        }
        b();
        return false;
    }

    private synchronized boolean j() {
        if (!k()) {
            Log.e("ElfParser", "Faile to parseElfHeader header indent of elf");
            return false;
        }
        try {
            this.f4483h = this.f4477b.i();
            long jI = this.f4477b.i();
            this.f4484i = jI;
            this.f4485j = a(jI, this.f4479d);
            this.f4486k = this.f4477b.g();
            long j10 = this.f4479d;
            if (32 == j10) {
                long jG = this.f4477b.g();
                this.f4486k = jG;
                this.f4487l = jG;
                this.f4488m = this.f4477b.g();
                this.f4489n = this.f4477b.g();
            } else {
                if (64 != j10) {
                    Log.e("ElfParser", "File format error");
                    return false;
                }
                long jH = this.f4477b.h();
                this.f4486k = jH;
                this.f4487l = jH;
                this.f4488m = this.f4477b.h();
                this.f4489n = this.f4477b.h();
            }
            this.f4490o = this.f4477b.g();
            this.f4491p = this.f4477b.i();
            this.f4492q = this.f4477b.i();
            this.f4493r = this.f4477b.i();
            this.f4494s = this.f4477b.i();
            this.f4495t = this.f4477b.i();
            this.f4496u = this.f4477b.i();
            return true;
        } catch (IOException e10) {
            Log.e("ElfParser", e10.getMessage());
            return false;
        }
    }

    private synchronized boolean k() {
        if (!this.f4477b.a(this.f4482g)) {
            Log.e("ElfParser", "Fail to parseElfHeader elf indentification");
            return false;
        }
        if (!a(this.f4482g)) {
            Log.e("ElfParser", "Not a elf file: " + this.f4478c);
            return false;
        }
        long jB = b(this.f4482g[4]);
        this.f4479d = jB;
        if (0 == jB) {
            Log.e("ElfParser", "File format error: " + ((int) this.f4482g[4]));
            return false;
        }
        long jA = a(this.f4482g[5]);
        this.f4480e = jA;
        if (com.tencent.bugly.beta.utils.a.f4459a != jA) {
            this.f4477b.a(jA);
            return true;
        }
        Log.e("ElfParser", "Endian error: " + ((int) this.f4482g[5]));
        return false;
    }

    private synchronized a l() {
        try {
            a aVar = new a();
            try {
                aVar.g(this.f4477b.g());
                aVar.j(this.f4477b.g());
                long j10 = this.f4479d;
                if (32 == j10) {
                    aVar.d(this.f4477b.g());
                    aVar.a(this.f4477b.g());
                    aVar.h(this.f4477b.g());
                    aVar.i(this.f4477b.g());
                } else {
                    if (64 != j10) {
                        Log.e("ElfParser", "File format error");
                        return null;
                    }
                    aVar.d(this.f4477b.h());
                    aVar.a(this.f4477b.h());
                    aVar.h(this.f4477b.h());
                    aVar.i(this.f4477b.h());
                }
                aVar.f(this.f4477b.g());
                aVar.e(this.f4477b.g());
                long j11 = this.f4479d;
                if (32 == j11) {
                    aVar.b(this.f4477b.g());
                    aVar.c(this.f4477b.g());
                } else {
                    if (64 != j11) {
                        Log.e("ElfParser", "File format error");
                        return null;
                    }
                    aVar.b(this.f4477b.h());
                    aVar.c(this.f4477b.h());
                }
                return aVar;
            } catch (IOException e10) {
                Log.e("ElfParser", e10.getMessage());
                return null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized boolean m() throws Throwable {
        try {
            try {
                HashMap<String, b> mapA = a(d(), e(), f());
                this.f4481f = mapA;
                return mapA != null;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public synchronized String a() {
        if (!i()) {
            Log.e("ElfParser", "Failed to parseElfHeader elf header");
            return null;
        }
        String strC = c();
        if (!strC.equals("armeabi")) {
            return strC;
        }
        if (!m()) {
            Log.e("ElfParser", "Failed to parseElfHeader section table");
            return strC;
        }
        b bVar = this.f4481f.get(".ARM.attributes");
        if (bVar == null) {
            Log.e("ElfParser", "No .ARM.attributes section in the elf file");
            return strC;
        }
        return com.tencent.bugly.beta.utils.b.a(this.f4478c, this.f4480e, bVar.a());
    }

    private synchronized void b() {
        com.tencent.bugly.beta.utils.a aVar = this.f4477b;
        if (aVar == null) {
            return;
        }
        if (aVar.a()) {
            this.f4477b = null;
        }
    }

    private synchronized HashMap<String, b> b(long j10, long j11) {
        try {
            if (j10 > 0 && j11 > 0) {
                Vector<a> vector = new Vector();
                for (int i10 = 0; i10 < j10; i10++) {
                    vector.add(l());
                }
                a aVar = (a) vector.get((int) j11);
                long length = new File(this.f4478c).length();
                X.a("File length = %d", Long.valueOf(length));
                if (aVar.d() >= length) {
                    X.e("The SO file is invalid or has a shell.", new Object[0]);
                    return null;
                }
                d dVar = new d(this.f4478c, aVar.d(), aVar.e());
                HashMap<String, b> map = new HashMap<>();
                for (a aVar2 : vector) {
                    String strA = dVar.a(aVar2.c());
                    b bVar = new b();
                    bVar.a(strA);
                    bVar.a(aVar2.a());
                    bVar.c(aVar2.d());
                    bVar.d(aVar2.e());
                    bVar.b(aVar2.b());
                    map.put(strA, bVar);
                }
                dVar.a();
                return map;
            }
            X.e("The SO file is invalid or has a shell.", new Object[0]);
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static String a(long j10, long j11) {
        String str = f4476a.get(Long.valueOf(j10));
        return (64 == j11 && str.equals("mips")) ? "mips64" : str;
    }

    private static boolean a(byte[] bArr) {
        return bArr.length >= 3 && 127 == bArr[0] && 69 == bArr[1] && 76 == bArr[2] && 70 == bArr[3];
    }

    private long a(byte b10) {
        if (1 == b10) {
            return com.tencent.bugly.beta.utils.a.f4461c;
        }
        if (2 == b10) {
            return com.tencent.bugly.beta.utils.a.f4460b;
        }
        return com.tencent.bugly.beta.utils.a.f4459a;
    }

    private synchronized HashMap<String, b> a(long j10, long j11, long j12) {
        if (!g()) {
            b();
            return null;
        }
        if (!this.f4477b.b(j10)) {
            b();
            return null;
        }
        HashMap<String, b> mapB = b(j11, j12);
        b();
        return mapB;
    }
}
