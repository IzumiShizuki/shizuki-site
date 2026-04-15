package com.tencent.bugly.proguard;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4946d;

    public /* synthetic */ c0(int i10, String str, String str2, String str3) {
        this.f4943a = i10;
        this.f4944b = str;
        this.f4945c = str2;
        this.f4946d = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4943a) {
            case 0:
                ba.f(this.f4944b, this.f4945c, this.f4946d);
                break;
            default:
                ba.d(this.f4944b, this.f4945c, this.f4946d);
                break;
        }
    }
}
