package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class C0015x extends AbstractC0010m implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f5143a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f5146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f5148f;

    public C0015x() {
        this.f5144b = "";
        this.f5145c = "";
        this.f5146d = "";
        this.f5147e = 0L;
        this.f5148f = "";
    }

    public String a() {
        return this.f5145c;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f5143a) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C0015x c0015x = (C0015x) obj;
        return n.a(this.f5144b, c0015x.f5144b) && n.a(this.f5145c, c0015x.f5145c) && n.a(this.f5146d, c0015x.f5146d) && n.a(this.f5147e, c0015x.f5147e) && n.a(this.f5148f, c0015x.f5148f);
    }

    public int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0009l c0009l) {
        c0009l.a(this.f5144b, 0);
        c0009l.a(this.f5145c, 1);
        String str = this.f5146d;
        if (str != null) {
            c0009l.a(str, 2);
        }
        c0009l.a(this.f5147e, 3);
        String str2 = this.f5148f;
        if (str2 != null) {
            c0009l.a(str2, 4);
        }
    }

    public C0015x(String str, String str2, String str3, long j10, String str4) {
        this.f5144b = str;
        this.f5145c = str2;
        this.f5146d = str3;
        this.f5147e = j10;
        this.f5148f = str4;
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0008k c0008k) {
        this.f5144b = c0008k.a(0, true);
        this.f5145c = c0008k.a(1, true);
        this.f5146d = c0008k.a(2, false);
        this.f5147e = c0008k.a(this.f5147e, 3, true);
        this.f5148f = c0008k.a(4, false);
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(StringBuilder sb, int i10) {
        C0006i c0006i = new C0006i(sb, i10);
        c0006i.a(this.f5144b, "apkMd5");
        c0006i.a(this.f5145c, "apkUrl");
        c0006i.a(this.f5146d, "manifestMd5");
        c0006i.a(this.f5147e, "fileSize");
        c0006i.a(this.f5148f, "signatureMd5");
    }
}
