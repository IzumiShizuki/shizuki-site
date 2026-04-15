package com.tencent.bugly.proguard;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f5007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f5008b;

    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        byte[] bArr2 = new byte[256];
        byte[] bArr3 = new byte[256];
        for (int i10 = 0; i10 < 256; i10++) {
            bArr2[i10] = bArr[i10 >>> 4];
            bArr3[i10] = bArr[i10 & 15];
        }
        f5007a = bArr2;
        f5008b = bArr3;
    }

    public static boolean a(byte b10, byte b11) {
        return b10 == b11;
    }

    public static boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public static boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static boolean a(boolean z10, boolean z11) {
        return z10 == z11;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    public static byte[] a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        byte[] bArr = new byte[iPosition];
        System.arraycopy(byteBuffer.array(), 0, bArr, 0, iPosition);
        return bArr;
    }
}
