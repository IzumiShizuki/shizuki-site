package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class C0016y extends AbstractC0010m implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f5149a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f5151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f5153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f5155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f5157i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f5158j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f5159k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f5160l;

    public C0016y() {
        this.f5150b = "";
        this.f5151c = (byte) 0;
        this.f5152d = 0;
        this.f5153e = "";
        this.f5154f = 0;
        this.f5155g = "";
        this.f5156h = 0L;
        this.f5157i = "";
        this.f5158j = "";
        this.f5159k = "";
        this.f5160l = "";
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0009l c0009l) {
        c0009l.a(this.f5150b, 0);
        c0009l.a(this.f5151c, 1);
        c0009l.a(this.f5152d, 2);
        String str = this.f5153e;
        if (str != null) {
            c0009l.a(str, 3);
        }
        c0009l.a(this.f5154f, 4);
        String str2 = this.f5155g;
        if (str2 != null) {
            c0009l.a(str2, 5);
        }
        c0009l.a(this.f5156h, 6);
        String str3 = this.f5157i;
        if (str3 != null) {
            c0009l.a(str3, 7);
        }
        String str4 = this.f5158j;
        if (str4 != null) {
            c0009l.a(str4, 8);
        }
        String str5 = this.f5159k;
        if (str5 != null) {
            c0009l.a(str5, 9);
        }
        String str6 = this.f5160l;
        if (str6 != null) {
            c0009l.a(str6, 10);
        }
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f5149a) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C0016y c0016y = (C0016y) obj;
        return n.a(this.f5150b, c0016y.f5150b) && n.a(this.f5151c, c0016y.f5151c) && n.a(this.f5152d, c0016y.f5152d) && n.a(this.f5153e, c0016y.f5153e) && n.a(this.f5154f, c0016y.f5154f) && n.a(this.f5155g, c0016y.f5155g) && n.a(this.f5156h, c0016y.f5156h) && n.a(this.f5157i, c0016y.f5157i) && n.a(this.f5158j, c0016y.f5158j) && n.a(this.f5159k, c0016y.f5159k) && n.a(this.f5160l, c0016y.f5160l);
    }

    public int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public C0016y(String str, byte b10, int i10, String str2, int i11, String str3, long j10, String str4, String str5, String str6, String str7) {
        this.f5150b = str;
        this.f5151c = b10;
        this.f5152d = i10;
        this.f5153e = str2;
        this.f5154f = i11;
        this.f5155g = str3;
        this.f5156h = j10;
        this.f5157i = str4;
        this.f5158j = str5;
        this.f5159k = str6;
        this.f5160l = str7;
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0008k c0008k) {
        this.f5150b = c0008k.a(0, true);
        this.f5151c = c0008k.a(this.f5151c, 1, true);
        this.f5152d = c0008k.a(this.f5152d, 2, true);
        this.f5153e = c0008k.a(3, false);
        this.f5154f = c0008k.a(this.f5154f, 4, false);
        this.f5155g = c0008k.a(5, false);
        this.f5156h = c0008k.a(this.f5156h, 6, false);
        this.f5157i = c0008k.a(7, false);
        this.f5158j = c0008k.a(8, false);
        this.f5159k = c0008k.a(9, false);
        this.f5160l = c0008k.a(10, false);
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(StringBuilder sb, int i10) {
        C0006i c0006i = new C0006i(sb, i10);
        c0006i.a(this.f5150b, "appId");
        c0006i.a(this.f5151c, "platformId");
        c0006i.a(this.f5152d, "versionCode");
        c0006i.a(this.f5153e, "versionName");
        c0006i.a(this.f5154f, "buildNo");
        c0006i.a(this.f5155g, "iconUrl");
        c0006i.a(this.f5156h, "apkId");
        c0006i.a(this.f5157i, "channelId");
        c0006i.a(this.f5158j, "md5");
        c0006i.a(this.f5159k, "sdkVer");
        c0006i.a(this.f5160l, "bundleId");
    }
}
