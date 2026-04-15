package j2;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static c f9754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static c f9755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static c f9756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e3.j f9757h = e3.j.f6079b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e3.j f9758i = e3.j.f6078a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9760d;

    @Override // j2.b
    public final int[] a(int i10) {
        int iD;
        switch (this.f9759c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i10 >= length) {
                    return null;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f9760d;
                    if (breakIterator == null) {
                        jc.l.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i10)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f9760d;
                        if (breakIterator2 == null) {
                            jc.l.k("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i10);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return b(i10, iFollowing);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f9760d;
                    if (breakIterator3 == null) {
                        jc.l.k("impl");
                        throw null;
                    }
                    i10 = breakIterator3.following(i10);
                } while (i10 != -1);
                return null;
            case 1:
                if (c().length() <= 0 || i10 >= c().length()) {
                    return null;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                while (!i(i10) && (!i(i10) || (i10 != 0 && i(i10 - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f9760d;
                    if (breakIterator4 == null) {
                        jc.l.k("impl");
                        throw null;
                    }
                    i10 = breakIterator4.following(i10);
                    if (i10 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f9760d;
                if (breakIterator5 == null) {
                    jc.l.k("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i10);
                if (iFollowing2 == -1 || !h(iFollowing2)) {
                    return null;
                }
                return b(i10, iFollowing2);
            default:
                if (c().length() <= 0 || i10 >= c().length()) {
                    return null;
                }
                e3.j jVar = f9757h;
                if (i10 < 0) {
                    t2.i0 i0Var = (t2.i0) this.f9760d;
                    if (i0Var == null) {
                        jc.l.k("layoutResult");
                        throw null;
                    }
                    iD = i0Var.f20345b.d(0);
                } else {
                    t2.i0 i0Var2 = (t2.i0) this.f9760d;
                    if (i0Var2 == null) {
                        jc.l.k("layoutResult");
                        throw null;
                    }
                    int iD2 = i0Var2.f20345b.d(i10);
                    iD = f(iD2, jVar) == i10 ? iD2 : iD2 + 1;
                }
                t2.i0 i0Var3 = (t2.i0) this.f9760d;
                if (i0Var3 == null) {
                    jc.l.k("layoutResult");
                    throw null;
                }
                if (iD >= i0Var3.f20345b.f20371f) {
                    return null;
                }
                return b(f(iD, jVar), f(iD, f9758i) + 1);
        }
    }

    @Override // j2.b
    public final int[] d(int i10) {
        int iD;
        switch (this.f9759c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i10 <= 0) {
                    return null;
                }
                if (i10 > length) {
                    i10 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f9760d;
                    if (breakIterator == null) {
                        jc.l.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i10)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f9760d;
                        if (breakIterator2 == null) {
                            jc.l.k("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i10);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return b(iPreceding, i10);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f9760d;
                    if (breakIterator3 == null) {
                        jc.l.k("impl");
                        throw null;
                    }
                    i10 = breakIterator3.preceding(i10);
                } while (i10 != -1);
                return null;
            case 1:
                int length2 = c().length();
                if (length2 <= 0 || i10 <= 0) {
                    return null;
                }
                if (i10 > length2) {
                    i10 = length2;
                }
                while (i10 > 0 && !i(i10 - 1) && !h(i10)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f9760d;
                    if (breakIterator4 == null) {
                        jc.l.k("impl");
                        throw null;
                    }
                    i10 = breakIterator4.preceding(i10);
                    if (i10 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f9760d;
                if (breakIterator5 == null) {
                    jc.l.k("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i10);
                if (iPreceding2 == -1 || !i(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !i(iPreceding2 - 1)) {
                    return b(iPreceding2, i10);
                }
                return null;
            default:
                if (c().length() <= 0 || i10 <= 0) {
                    return null;
                }
                int length3 = c().length();
                e3.j jVar = f9758i;
                if (i10 > length3) {
                    t2.i0 i0Var = (t2.i0) this.f9760d;
                    if (i0Var == null) {
                        jc.l.k("layoutResult");
                        throw null;
                    }
                    iD = i0Var.f20345b.d(c().length());
                } else {
                    t2.i0 i0Var2 = (t2.i0) this.f9760d;
                    if (i0Var2 == null) {
                        jc.l.k("layoutResult");
                        throw null;
                    }
                    int iD2 = i0Var2.f20345b.d(i10);
                    iD = f(iD2, jVar) + 1 == i10 ? iD2 : iD2 - 1;
                }
                if (iD < 0) {
                    return null;
                }
                return b(f(iD, f9757h), f(iD, jVar) + 1);
        }
    }

    public int f(int i10, e3.j jVar) {
        t2.i0 i0Var = (t2.i0) this.f9760d;
        if (i0Var == null) {
            jc.l.k("layoutResult");
            throw null;
        }
        int iG = i0Var.g(i10);
        t2.i0 i0Var2 = (t2.i0) this.f9760d;
        if (i0Var2 == null) {
            jc.l.k("layoutResult");
            throw null;
        }
        if (jVar != i0Var2.h(iG)) {
            t2.i0 i0Var3 = (t2.i0) this.f9760d;
            if (i0Var3 != null) {
                return i0Var3.g(i10);
            }
            jc.l.k("layoutResult");
            throw null;
        }
        if (((t2.i0) this.f9760d) != null) {
            return r6.f20345b.c(i10, false) - 1;
        }
        jc.l.k("layoutResult");
        throw null;
    }

    public void g(String str) {
        switch (this.f9759c) {
            case 0:
                this.f9723a = str;
                BreakIterator breakIterator = (BreakIterator) this.f9760d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    jc.l.k("impl");
                    throw null;
                }
            default:
                this.f9723a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f9760d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    jc.l.k("impl");
                    throw null;
                }
        }
    }

    public boolean h(int i10) {
        if (i10 <= 0 || !i(i10 - 1)) {
            return false;
        }
        return i10 == c().length() || !i(i10);
    }

    public boolean i(int i10) {
        if (i10 < 0 || i10 >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i10));
    }
}
