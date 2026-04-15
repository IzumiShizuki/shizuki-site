package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class da implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f4956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f4958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f4959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4960e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f4961f;

    public da(Handler handler, String str, long j10) {
        this.f4956a = handler;
        this.f4957b = str;
        this.f4958c = j10;
        this.f4959d = j10;
    }

    public int a() {
        if (this.f4960e) {
            return 0;
        }
        return SystemClock.uptimeMillis() - this.f4961f < this.f4958c ? 1 : 3;
    }

    public Looper b() {
        return this.f4956a.getLooper();
    }

    public String c() {
        return this.f4957b;
    }

    public boolean d() {
        return !this.f4960e && SystemClock.uptimeMillis() > this.f4961f + this.f4958c;
    }

    public void e() {
        this.f4958c = this.f4959d;
    }

    public void f() {
        if (this.f4960e) {
            this.f4960e = false;
            this.f4961f = SystemClock.uptimeMillis();
            this.f4956a.post(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4960e = true;
        e();
    }

    public void a(long j10) {
        this.f4958c = j10;
    }
}
