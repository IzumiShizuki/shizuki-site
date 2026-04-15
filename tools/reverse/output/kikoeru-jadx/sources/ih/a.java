package ih;

import b7.b1;
import ef.n;
import g5.w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import jc.l;
import lh.i;
import ud.b;
import vb.m;
import vb.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f9524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f9525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f9526d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f9527a;

    static {
        byte[] bArrCopyOf = Arrays.copyOf(new byte[]{42}, 1);
        l.d(bArrCopyOf, "copyOf(...)");
        f9524b = new i(bArrCopyOf);
        f9525c = b.w("*");
        f9526d = new a(new b1(3));
    }

    public a(b1 b1Var) {
        this.f9527a = b1Var;
    }

    public static List b(String str) {
        List listL0 = n.L0(str, new char[]{'.'});
        return l.a(m.h0(listL0), "") ? m.W(listL0) : listL0;
    }

    public final String a(String str) {
        String strM;
        String strM2;
        String strM3;
        List listL0;
        int size;
        int size2;
        l.e(str, "domain");
        String unicode = IDN.toUnicode(str);
        l.b(unicode);
        List listB = b(unicode);
        b1 b1Var = this.f9527a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) b1Var.f1650b;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) b1Var.f1651c).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z10 = false;
            while (true) {
                try {
                    try {
                        try {
                            b1Var.J();
                            break;
                        } finally {
                            if (z10) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    } catch (IOException e10) {
                        b1Var.f1654f = e10;
                        if (z10) {
                        }
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z10 = true;
                }
            }
        }
        if (((i) b1Var.f1652d) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(b1Var.f1655g);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) b1Var.f1654f);
            throw illegalStateException;
        }
        int size3 = listB.size();
        i[] iVarArr = new i[size3];
        for (int i10 = 0; i10 < size3; i10++) {
            i iVar = i.f12572d;
            iVarArr[i10] = w.t((String) listB.get(i10));
        }
        int i11 = 0;
        while (true) {
            if (i11 >= size3) {
                strM = null;
                break;
            }
            i iVar2 = (i) b1Var.f1652d;
            if (iVar2 == null) {
                l.k("bytes");
                throw null;
            }
            strM = w.m(iVar2, iVarArr, i11);
            if (strM != null) {
                break;
            }
            i11++;
        }
        if (size3 > 1) {
            i[] iVarArr2 = (i[]) iVarArr.clone();
            int length = iVarArr2.length - 1;
            for (int i12 = 0; i12 < length; i12++) {
                iVarArr2[i12] = f9524b;
                i iVar3 = (i) b1Var.f1652d;
                if (iVar3 == null) {
                    l.k("bytes");
                    throw null;
                }
                strM2 = w.m(iVar3, iVarArr2, i12);
                if (strM2 != null) {
                    break;
                }
            }
            strM2 = null;
        } else {
            strM2 = null;
        }
        if (strM2 != null) {
            int i13 = size3 - 1;
            for (int i14 = 0; i14 < i13; i14++) {
                i iVar4 = (i) b1Var.f1653e;
                if (iVar4 == null) {
                    l.k("exceptionBytes");
                    throw null;
                }
                strM3 = w.m(iVar4, iVarArr, i14);
                if (strM3 != null) {
                    break;
                }
            }
            strM3 = null;
        } else {
            strM3 = null;
        }
        if (strM3 != null) {
            listL0 = n.L0("!".concat(strM3), new char[]{'.'});
        } else if (strM == null && strM2 == null) {
            listL0 = f9525c;
        } else {
            List listL02 = r.f22819a;
            List listL03 = strM != null ? n.L0(strM, new char[]{'.'}) : listL02;
            if (strM2 != null) {
                listL02 = n.L0(strM2, new char[]{'.'});
            }
            listL0 = listL03.size() > listL02.size() ? listL03 : listL02;
        }
        if (listB.size() == listL0.size() && ((String) listL0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listL0.get(0)).charAt(0) == '!') {
            size = listB.size();
            size2 = listL0.size();
        } else {
            size = listB.size();
            size2 = listL0.size() + 1;
        }
        return df.m.c0(df.m.Y(m.R(b(str)), size - size2), ".");
    }
}
