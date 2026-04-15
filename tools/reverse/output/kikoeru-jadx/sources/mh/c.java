package mh;

import g5.w;
import j2.h0;
import lh.y;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lh.i f15167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final lh.i f15168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final lh.i f15169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final lh.i f15170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final lh.i f15171e;

    static {
        lh.i iVar = lh.i.f12572d;
        f15167a = w.t("/");
        f15168b = w.t("\\");
        f15169c = w.t("/\\");
        f15170d = w.t(".");
        f15171e = w.t("..");
    }

    public static final int a(y yVar) {
        lh.i iVar = yVar.f12620a;
        if (iVar.d() != 0) {
            if (iVar.i(0) != 47) {
                if (iVar.i(0) == 92) {
                    if (iVar.d() > 2 && iVar.i(1) == 92) {
                        lh.i iVar2 = f15168b;
                        jc.l.e(iVar2, "other");
                        int iF = iVar.f(iVar2.h(), 2);
                        return iF == -1 ? iVar.d() : iF;
                    }
                } else if (iVar.d() > 2 && iVar.i(1) == 58 && iVar.i(2) == 92) {
                    char cI = (char) iVar.i(0);
                    if ('a' <= cI && cI < '{') {
                        return 3;
                    }
                    if ('A' <= cI && cI < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final y b(y yVar, y yVar2, boolean z10) {
        jc.l.e(yVar2, "child");
        if (a(yVar2) != -1 || yVar2.f() != null) {
            return yVar2;
        }
        lh.i iVarC = c(yVar);
        if (iVarC == null && (iVarC = c(yVar2)) == null) {
            iVarC = f(y.f12619b);
        }
        lh.f fVar = new lh.f();
        fVar.X(yVar.f12620a);
        if (fVar.f12571b > 0) {
            fVar.X(iVarC);
        }
        fVar.X(yVar2.f12620a);
        return d(fVar, z10);
    }

    public static final lh.i c(y yVar) {
        lh.i iVar = yVar.f12620a;
        lh.i iVar2 = f15167a;
        if (lh.i.g(iVar, iVar2) != -1) {
            return iVar2;
        }
        lh.i iVar3 = yVar.f12620a;
        lh.i iVar4 = f15168b;
        if (lh.i.g(iVar3, iVar4) != -1) {
            return iVar4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b A[EDGE_INSN: B:101:0x011b->B:84:0x011b BREAK  A[LOOP:1: B:53:0x00ab->B:116:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final lh.y d(lh.f r17, boolean r18) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.c.d(lh.f, boolean):lh.y");
    }

    public static final lh.i e(byte b10) {
        if (b10 == 47) {
            return f15167a;
        }
        if (b10 == 92) {
            return f15168b;
        }
        throw new IllegalArgumentException(t0.B(b10, "not a directory separator: "));
    }

    public static final lh.i f(String str) {
        if (jc.l.a(str, "/")) {
            return f15167a;
        }
        if (jc.l.a(str, "\\")) {
            return f15168b;
        }
        throw new IllegalArgumentException(h0.x("not a directory separator: ", str));
    }
}
