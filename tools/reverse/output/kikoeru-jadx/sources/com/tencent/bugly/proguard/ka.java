package com.tencent.bugly.proguard;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class ka extends AbstractC0010m implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4993a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4994b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4995c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4996d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f4997e = "";

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(StringBuilder sb, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0009l c0009l) {
        c0009l.a(this.f4993a, 0);
        String str = this.f4994b;
        if (str != null) {
            c0009l.a(str, 1);
        }
        String str2 = this.f4995c;
        if (str2 != null) {
            c0009l.a(str2, 2);
        }
        String str3 = this.f4996d;
        if (str3 != null) {
            c0009l.a(str3, 3);
        }
        String str4 = this.f4997e;
        if (str4 != null) {
            c0009l.a(str4, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0008k c0008k) {
        this.f4993a = c0008k.a(0, true);
        this.f4994b = c0008k.a(1, false);
        this.f4995c = c0008k.a(2, false);
        this.f4996d = c0008k.a(3, false);
        this.f4997e = c0008k.a(4, false);
    }
}
