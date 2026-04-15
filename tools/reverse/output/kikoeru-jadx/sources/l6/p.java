package l6;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import m4.m0;
import m4.n0;
import m4.o0;
import q.t0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f11830a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static q4.a b(n0 n0Var, String str) {
        int i10 = 0;
        while (true) {
            m0[] m0VarArr = n0Var.f14409a;
            if (i10 >= m0VarArr.length) {
                return null;
            }
            m0 m0Var = m0VarArr[i10];
            if (m0Var instanceof q4.a) {
                q4.a aVar = (q4.a) m0Var;
                if (aVar.f17704a.equals(str)) {
                    return aVar;
                }
            }
            i10++;
        }
    }

    public static String c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((t) it.next()).f11865a.f11837g.f14544n;
            if (o0.o(str2)) {
                return "video/mp4";
            }
            if (o0.k(str2)) {
                z10 = true;
            } else if (o0.m(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z10 ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    public static boolean d(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 = 0; i11 < 29; i11++) {
            if (f11830a[i11] == i10) {
                return true;
            }
        }
        return false;
    }

    public static f6.e e(int i10, p4.s sVar) {
        int iG = sVar.g();
        if (sVar.g() == 1684108385) {
            sVar.H(8);
            String strQ = sVar.q(iG - 16);
            return new f6.e("und", strQ, strQ);
        }
        p4.c.B("MetadataUtil", "Failed to parse comment attribute: " + q4.d.c(i10));
        return null;
    }

    public static f6.a f(p4.s sVar) {
        int iG = sVar.g();
        if (sVar.g() != 1684108385) {
            p4.c.B("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iG2 = sVar.g();
        byte[] bArr = e.f11741a;
        int i10 = iG2 & 16777215;
        String str = i10 == 13 ? "image/jpeg" : i10 == 14 ? "image/png" : null;
        if (str == null) {
            t0.J(i10, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        sVar.H(4);
        int i11 = iG - 16;
        byte[] bArr2 = new byte[i11];
        sVar.e(bArr2, 0, i11);
        return new f6.a(str, null, 3, bArr2);
    }

    public static f6.n g(int i10, String str, p4.s sVar) {
        int iG = sVar.g();
        if (sVar.g() == 1684108385 && iG >= 22) {
            sVar.H(10);
            int iA = sVar.A();
            if (iA > 0) {
                String strB = t0.B(iA, "");
                int iA2 = sVar.A();
                if (iA2 > 0) {
                    strB = strB + "/" + iA2;
                }
                return new f6.n(str, null, i0.u(strB));
            }
        }
        p4.c.B("MetadataUtil", "Failed to parse index/count attribute: " + q4.d.c(i10));
        return null;
    }

    public static int h(p4.s sVar) {
        int iG = sVar.g();
        if (sVar.g() == 1684108385) {
            sVar.H(8);
            int i10 = iG - 16;
            if (i10 == 1) {
                return sVar.u();
            }
            if (i10 == 2) {
                return sVar.A();
            }
            if (i10 == 3) {
                return sVar.x();
            }
            if (i10 == 4 && (sVar.f16611a[sVar.f16612b] & 128) == 0) {
                return sVar.y();
            }
        }
        p4.c.B("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static f6.i i(int i10, String str, p4.s sVar, boolean z10, boolean z11) {
        int iH = h(sVar);
        if (z11) {
            iH = Math.min(1, iH);
        }
        if (iH >= 0) {
            return z10 ? new f6.n(str, null, i0.u(Integer.toString(iH))) : new f6.e("und", str, Integer.toString(iH));
        }
        p4.c.B("MetadataUtil", "Failed to parse uint8 attribute: " + q4.d.c(i10));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    public static ah.j j(byte[] bArr) {
        p4.s sVar = new p4.s(bArr);
        if (sVar.f16613c < 32) {
            return null;
        }
        sVar.G(0);
        int iA = sVar.a();
        int iG = sVar.g();
        if (iG != iA) {
            p4.c.B("PsshAtomUtil", "Advertised atom size (" + iG + ") does not match buffer size: " + iA);
            return null;
        }
        int iG2 = sVar.g();
        if (iG2 != 1886614376) {
            t0.J(iG2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int iC = e.c(sVar.g());
        if (iC > 1) {
            t0.J(iC, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(sVar.o(), sVar.o());
        if (iC == 1) {
            int iY = sVar.y();
            UUID[] uuidArr = new UUID[iY];
            for (int i10 = 0; i10 < iY; i10++) {
                uuidArr[i10] = new UUID(sVar.o(), sVar.o());
            }
        }
        int iY2 = sVar.y();
        int iA2 = sVar.a();
        if (iY2 == iA2) {
            ?? r22 = new byte[iY2];
            sVar.e(r22, 0, iY2);
            return new ah.j(uuid, iC, r22, 10);
        }
        p4.c.B("PsshAtomUtil", "Atom data size (" + iY2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] k(UUID uuid, byte[] bArr) {
        ah.j jVarJ = j(bArr);
        if (jVarJ == null) {
            return null;
        }
        UUID uuid2 = (UUID) jVarJ.f391c;
        if (uuid.equals(uuid2)) {
            return (byte[]) jVarJ.f392d;
        }
        p4.c.B("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public static f6.n l(int i10, String str, p4.s sVar) {
        int iG = sVar.g();
        if (sVar.g() == 1684108385) {
            sVar.H(8);
            return new f6.n(str, null, i0.u(sVar.q(iG - 16)));
        }
        p4.c.B("MetadataUtil", "Failed to parse text attribute: " + q4.d.c(i10));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r5.f0 m(r5.o r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.p.m(r5.o, boolean, boolean):r5.f0");
    }
}
