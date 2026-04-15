package com.tencent.bugly.proguard;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class ma extends AbstractC0010m implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static byte[] f5003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f5004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f5006d;

    public ma() {
        this.f5004b = (byte) 0;
        this.f5005c = "";
        this.f5006d = null;
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(StringBuilder sb, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0009l c0009l) {
        c0009l.a(this.f5004b, 0);
        c0009l.a(this.f5005c, 1);
        byte[] bArr = this.f5006d;
        if (bArr != null) {
            c0009l.a(bArr, 2);
        }
    }

    public ma(byte b10, String str, byte[] bArr) {
        this.f5004b = b10;
        this.f5005c = str;
        this.f5006d = bArr;
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0008k c0008k) {
        this.f5004b = c0008k.a(this.f5004b, 0, true);
        this.f5005c = c0008k.a(1, true);
        if (f5003a == null) {
            f5003a = new byte[]{0};
        }
        this.f5006d = c0008k.a(f5003a, 2, false);
    }
}
