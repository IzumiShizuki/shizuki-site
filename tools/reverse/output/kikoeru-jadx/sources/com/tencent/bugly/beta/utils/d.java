package com.tencent.bugly.beta.utils;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f4512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f4513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f4514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    a f4515d = null;

    public d(String str, long j10, long j11) {
        this.f4512a = str;
        this.f4513b = j10;
        this.f4514c = j11;
    }

    private boolean b() {
        return (this.f4513b == 0 || this.f4514c == 0) ? false : true;
    }

    private synchronized boolean c() {
        if (!b()) {
            return false;
        }
        if (this.f4515d == null) {
            try {
                this.f4515d = new a(this.f4512a);
            } catch (Exception e10) {
                e10.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public synchronized void a() {
        a aVar = this.f4515d;
        if (aVar == null) {
            return;
        }
        aVar.a();
        this.f4515d = null;
    }

    private synchronized String b(long j10) {
        try {
            if (this.f4515d == null) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            try {
                this.f4515d.b(this.f4513b);
                this.f4515d.b(j10);
            } catch (Exception e10) {
                this.f4515d = null;
                e10.printStackTrace();
            }
            while (true) {
                byte b10 = this.f4515d.b();
                if (b10 == 0) {
                    break;
                }
                stringBuffer.append((char) b10);
                return stringBuffer.toString();
            }
            this.f4515d.a();
            this.f4515d = new a(this.f4512a);
            return stringBuffer.toString();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized String a(long j10) {
        if (j10 >= 0) {
            if (j10 < this.f4514c) {
                if (this.f4515d == null && !c()) {
                    return null;
                }
                return b(j10);
            }
        }
        return null;
    }
}
