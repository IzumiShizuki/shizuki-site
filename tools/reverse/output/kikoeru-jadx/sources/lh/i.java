package lh;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class i implements Serializable, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f12572d = new i(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f12573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f12574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient String f12575c;

    public i(byte[] bArr) {
        jc.l.e(bArr, "data");
        this.f12573a = bArr;
    }

    public static int g(i iVar, i iVar2) {
        iVar.getClass();
        jc.l.e(iVar2, "other");
        return iVar.f(iVar2.h(), 0);
    }

    public static int k(i iVar, i iVar2) {
        iVar.getClass();
        jc.l.e(iVar2, "other");
        return iVar.j(iVar2.h());
    }

    public static /* synthetic */ i p(i iVar, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = -1234567890;
        }
        return iVar.o(i10, i11);
    }

    public String a() {
        return a.a(this.f12573a, a.f12540b);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i iVar) {
        jc.l.e(iVar, "other");
        int iD = d();
        int iD2 = iVar.d();
        int iMin = Math.min(iD, iD2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = i(i10) & 255;
            int i12 = iVar.i(i10) & 255;
            if (i11 != i12) {
                return i11 < i12 ? -1 : 1;
            }
        }
        if (iD == iD2) {
            return 0;
        }
        return iD < iD2 ? -1 : 1;
    }

    public i c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f12573a, 0, d());
        byte[] bArrDigest = messageDigest.digest();
        jc.l.b(bArrDigest);
        return new i(bArrDigest);
    }

    public int d() {
        return this.f12573a.length;
    }

    public String e() {
        byte[] bArr = this.f12573a;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = mh.b.f15166a;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int iD = iVar.d();
            byte[] bArr = this.f12573a;
            if (iD == bArr.length && iVar.l(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int f(byte[] bArr, int i10) {
        jc.l.e(bArr, "other");
        byte[] bArr2 = this.f12573a;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!android.support.v4.media.session.b.t(iMax, 0, bArr.length, bArr2, bArr)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public byte[] h() {
        return this.f12573a;
    }

    public int hashCode() {
        int i10 = this.f12574b;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f12573a);
        this.f12574b = iHashCode;
        return iHashCode;
    }

    public byte i(int i10) {
        return this.f12573a[i10];
    }

    public int j(byte[] bArr) {
        jc.l.e(bArr, "other");
        int iD = d();
        byte[] bArr2 = this.f12573a;
        for (int iMin = Math.min(iD, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (android.support.v4.media.session.b.t(iMin, 0, bArr.length, bArr2, bArr)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean l(int i10, int i11, int i12, byte[] bArr) {
        jc.l.e(bArr, "other");
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.f12573a;
        return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && android.support.v4.media.session.b.t(i10, i11, i12, bArr2, bArr);
    }

    public boolean m(int i10, i iVar, int i11) {
        jc.l.e(iVar, "other");
        return iVar.l(0, i10, i11, this.f12573a);
    }

    public String n(Charset charset) {
        jc.l.e(charset, "charset");
        return new String(this.f12573a, charset);
    }

    public i o(int i10, int i11) {
        if (i11 == -1234567890) {
            i11 = d();
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f12573a;
        if (i11 > bArr.length) {
            throw new IllegalArgumentException(j2.h0.m(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i11 - i10 >= 0) {
            return (i10 == 0 && i11 == bArr.length) ? this : new i(vb.l.n0(bArr, i10, i11));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public i q() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f12573a;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                jc.l.d(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new i(bArrCopyOf);
            }
            i10++;
        }
    }

    public byte[] r() {
        byte[] bArr = this.f12573a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        jc.l.d(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public final String s() {
        String str = this.f12575c;
        if (str != null) {
            return str;
        }
        byte[] bArrH = h();
        jc.l.e(bArrH, "<this>");
        String str2 = new String(bArrH, ef.a.f6541a);
        this.f12575c = str2;
        return str2;
    }

    public void t(f fVar, int i10) {
        fVar.Y(this.f12573a, i10);
    }

    public String toString() {
        byte b10;
        int i10;
        byte[] bArr = this.f12573a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        loop0: while (true) {
            if (i11 >= length) {
                break;
            }
            byte b11 = bArr[i11];
            if (b11 >= 0) {
                int i14 = i13 + 1;
                if (i13 == 64) {
                    break;
                }
                if ((b11 != 10 && b11 != 13 && ((b11 >= 0 && b11 < 32) || (127 <= b11 && b11 < 160))) || b11 == 65533) {
                    break;
                }
                i12 += b11 < 65536 ? 1 : 2;
                i11++;
                while (true) {
                    i13 = i14;
                    if (i11 < length && (b10 = bArr[i11]) >= 0) {
                        i11++;
                        i14 = i13 + 1;
                        if (i13 == 64) {
                            break loop0;
                        }
                        if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (127 <= b10 && b10 < 160))) || b10 == 65533) {
                            break loop0;
                        }
                        i12 += b10 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b11 >> 5) == -2) {
                int i15 = i11 + 1;
                if (length > i15) {
                    byte b12 = bArr[i15];
                    if ((b12 & 192) == 128) {
                        int i16 = (b12 ^ 3968) ^ (b11 << 6);
                        if (i16 >= 128) {
                            i10 = i13 + 1;
                            if (i13 == 64) {
                                break;
                            }
                            if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && i16 < 32) || (127 <= i16 && i16 < 160))) || i16 == 65533) {
                                break;
                            }
                            i12 += i16 < 65536 ? 1 : 2;
                            i11 += 2;
                            i13 = i10;
                        } else if (i13 != 64) {
                            break;
                        }
                    } else if (i13 != 64) {
                        break;
                    }
                } else if (i13 != 64) {
                    break;
                }
            } else if ((b11 >> 4) == -2) {
                int i17 = i11 + 2;
                if (length > i17) {
                    byte b13 = bArr[i11 + 1];
                    if ((b13 & 192) == 128) {
                        byte b14 = bArr[i17];
                        if ((b14 & 192) == 128) {
                            int i18 = ((b14 ^ (-123008)) ^ (b13 << 6)) ^ (b11 << 12);
                            if (i18 < 2048) {
                                if (i13 != 64) {
                                    break;
                                }
                            } else if (55296 > i18 || i18 >= 57344) {
                                i10 = i13 + 1;
                                if (i13 == 64) {
                                    break;
                                }
                                if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && i18 < 32) || (127 <= i18 && i18 < 160))) || i18 == 65533) {
                                    break;
                                }
                                i12 += i18 < 65536 ? 1 : 2;
                                i11 += 3;
                                i13 = i10;
                            } else if (i13 != 64) {
                                break;
                            }
                        } else if (i13 != 64) {
                            break;
                        }
                    } else if (i13 != 64) {
                        break;
                    }
                } else if (i13 != 64) {
                    break;
                }
            } else if ((b11 >> 3) == -2) {
                int i19 = i11 + 3;
                if (length > i19) {
                    byte b15 = bArr[i11 + 1];
                    if ((b15 & 192) == 128) {
                        byte b16 = bArr[i11 + 2];
                        if ((b16 & 192) == 128) {
                            byte b17 = bArr[i19];
                            if ((b17 & 192) == 128) {
                                int i20 = (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12)) ^ (b11 << 18);
                                if (i20 > 1114111) {
                                    if (i13 != 64) {
                                        break;
                                    }
                                } else if (55296 > i20 || i20 >= 57344) {
                                    if (i20 >= 65536) {
                                        i10 = i13 + 1;
                                        if (i13 == 64) {
                                            break;
                                        }
                                        if ((i20 != 10 && i20 != 13 && ((i20 >= 0 && i20 < 32) || (127 <= i20 && i20 < 160))) || i20 == 65533) {
                                            break;
                                        }
                                        i12 += i20 < 65536 ? 1 : 2;
                                        i11 += 4;
                                        i13 = i10;
                                    } else if (i13 != 64) {
                                        break;
                                    }
                                } else if (i13 != 64) {
                                    break;
                                }
                            } else if (i13 != 64) {
                                break;
                            }
                        } else if (i13 != 64) {
                            break;
                        }
                    } else if (i13 != 64) {
                        break;
                    }
                } else if (i13 != 64) {
                    break;
                }
            } else if (i13 != 64) {
                break;
            }
        }
        i12 = -1;
        if (i12 != -1) {
            String strS = s();
            String strSubstring = strS.substring(0, i12);
            jc.l.d(strSubstring, "substring(...)");
            String strH0 = ef.u.h0(ef.u.h0(ef.u.h0(strSubstring, "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
            if (i12 >= strS.length()) {
                return a0.c.G(']', "[text=", strH0);
            }
            return "[size=" + bArr.length + " text=" + strH0 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + e() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(j2.h0.m(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        sb.append((64 == bArr.length ? this : new i(vb.l.n0(bArr, 0, 64))).e());
        sb.append("…]");
        return sb.toString();
    }
}
