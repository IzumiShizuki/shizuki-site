package t4;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p4.c0;
import q.t0;
import s4.a0;
import s4.e0;
import s4.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements s4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f20424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4.h f20425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f20426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s4.h f20427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f20428e = j.f20448a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f20431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Uri f20432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s4.m f20433j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s4.m f20434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s4.h f20435l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f20436m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f20437n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f20438o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public z f20439p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f20440q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f20441r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f20442s;

    public f(b bVar, s4.h hVar, s4.h hVar2, d dVar, int i10) {
        this.f20424a = bVar;
        this.f20425b = hVar2;
        this.f20429f = (i10 & 1) != 0;
        this.f20430g = (i10 & 2) != 0;
        this.f20431h = (i10 & 4) != 0;
        if (hVar != null) {
            this.f20427d = hVar;
            this.f20426c = dVar != null ? new e0(hVar, dVar) : null;
        } else {
            this.f20427d = a0.f19381a;
            this.f20426c = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        b bVar = this.f20424a;
        s4.h hVar = this.f20435l;
        if (hVar == null) {
            return;
        }
        try {
            hVar.close();
        } finally {
            this.f20434k = null;
            this.f20435l = null;
            z zVar = this.f20439p;
            if (zVar != null) {
                ((y) bVar).l(zVar);
                this.f20439p = null;
            }
        }
    }

    public final void b(s4.m mVar, boolean z10) throws InterruptedIOException {
        z zVarP;
        s4.m mVarA;
        s4.h hVar;
        String str = mVar.f19450h;
        int i10 = c0.f16548a;
        if (this.f20441r) {
            zVarP = null;
        } else if (this.f20429f) {
            try {
                b bVar = this.f20424a;
                long j10 = this.f20437n;
                long j11 = this.f20438o;
                y yVar = (y) bVar;
                synchronized (yVar) {
                    yVar.d();
                    while (true) {
                        zVarP = yVar.p(j10, j11, str);
                        if (zVarP != null) {
                            break;
                        } else {
                            yVar.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            zVarP = ((y) this.f20424a).p(this.f20437n, this.f20438o, str);
        }
        if (zVarP == null) {
            hVar = this.f20427d;
            s4.l lVarA = mVar.a();
            lVarA.f19438f = this.f20437n;
            lVarA.f19439g = this.f20438o;
            mVarA = lVarA.a();
        } else if (zVarP.f20452d) {
            Uri uriFromFile = Uri.fromFile(zVarP.f20453e);
            long j12 = zVarP.f20450b;
            long j13 = this.f20437n - j12;
            long jMin = zVarP.f20451c - j13;
            long j14 = this.f20438o;
            if (j14 != -1) {
                jMin = Math.min(jMin, j14);
            }
            s4.l lVarA2 = mVar.a();
            lVarA2.f19433a = uriFromFile;
            lVarA2.f19434b = j12;
            lVarA2.f19438f = j13;
            lVarA2.f19439g = jMin;
            mVarA = lVarA2.a();
            hVar = this.f20425b;
        } else {
            long jMin2 = zVarP.f20451c;
            if (jMin2 == -1) {
                jMin2 = this.f20438o;
            } else {
                long j15 = this.f20438o;
                if (j15 != -1) {
                    jMin2 = Math.min(jMin2, j15);
                }
            }
            s4.l lVarA3 = mVar.a();
            lVarA3.f19438f = this.f20437n;
            lVarA3.f19439g = jMin2;
            mVarA = lVarA3.a();
            hVar = this.f20426c;
            if (hVar == null) {
                hVar = this.f20427d;
                ((y) this.f20424a).l(zVarP);
                zVarP = null;
            }
        }
        this.f20442s = (this.f20441r || hVar != this.f20427d) ? Long.MAX_VALUE : this.f20437n + 102400;
        if (z10) {
            p4.c.i(this.f20435l == this.f20427d);
            if (hVar == this.f20427d) {
                return;
            }
            try {
                a();
            } catch (Throwable th2) {
                if (!zVarP.f20452d) {
                    ((y) this.f20424a).l(zVarP);
                }
                throw th2;
            }
        }
        if (zVarP != null && !zVarP.f20452d) {
            this.f20439p = zVarP;
        }
        this.f20435l = hVar;
        this.f20434k = mVarA;
        this.f20436m = 0L;
        long jF = hVar.f(mVarA);
        i iVar = new i();
        if (mVarA.f19449g == -1 && jF != -1) {
            this.f20438o = jF;
            iVar.a(Long.valueOf(this.f20437n + jF), "exo_len");
        }
        if (!(this.f20435l == this.f20425b)) {
            Uri uriW = hVar.w();
            this.f20432i = uriW;
            Uri uri = mVar.f19443a.equals(uriW) ? null : this.f20432i;
            if (uri == null) {
                ((ArrayList) iVar.f20447b).add("exo_redir");
                ((HashMap) iVar.f20446a).remove("exo_redir");
            } else {
                iVar.a(uri.toString(), "exo_redir");
            }
        }
        if (this.f20435l == this.f20426c) {
            ((y) this.f20424a).c(str, iVar);
        }
    }

    @Override // s4.h
    public final void close() {
        this.f20433j = null;
        this.f20432i = null;
        this.f20437n = 0L;
        try {
            a();
        } catch (Throwable th2) {
            if (this.f20435l == this.f20425b || (th2 instanceof a)) {
                this.f20440q = true;
            }
            throw th2;
        }
    }

    @Override // s4.h
    public final long f(s4.m mVar) {
        long j10;
        b bVar = this.f20424a;
        try {
            String strA = this.f20428e.a(mVar);
            long j11 = mVar.f19448f;
            long j12 = mVar.f19449g;
            s4.l lVarA = mVar.a();
            lVarA.f19440h = strA;
            s4.m mVarA = lVarA.a();
            this.f20433j = mVarA;
            Uri uri = mVarA.f19443a;
            byte[] bArr = (byte[]) ((y) bVar).j(strA).f20479b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.f20432i = uri;
            this.f20437n = j11;
            boolean z10 = (this.f20430g && this.f20440q) || (this.f20431h && j12 == -1);
            this.f20441r = z10;
            if (z10) {
                this.f20438o = -1L;
                j10 = -1;
            } else {
                j10 = -1;
                long jT = t0.t(((y) bVar).j(strA));
                this.f20438o = jT;
                if (jT != -1) {
                    long j13 = jT - j11;
                    this.f20438o = j13;
                    if (j13 < 0) {
                        throw new s4.j(2008);
                    }
                }
            }
            if (j12 != j10) {
                long j14 = this.f20438o;
                this.f20438o = j14 == j10 ? j12 : Math.min(j14, j12);
            }
            long j15 = this.f20438o;
            if (j15 > 0 || j15 == j10) {
                b(mVarA, false);
            }
            return j12 != j10 ? j12 : this.f20438o;
        } catch (Throwable th2) {
            if (this.f20435l == this.f20425b || (th2 instanceof a)) {
                this.f20440q = true;
            }
            throw th2;
        }
    }

    @Override // s4.h
    public final Map p() {
        return !(this.f20435l == this.f20425b) ? this.f20427d.p() : Collections.EMPTY_MAP;
    }

    @Override // m4.i
    public final int read(byte[] bArr, int i10, int i11) {
        int i12;
        long j10;
        s4.h hVar = this.f20425b;
        if (i11 == 0) {
            return 0;
        }
        if (this.f20438o == 0) {
            return -1;
        }
        s4.m mVar = this.f20433j;
        mVar.getClass();
        s4.m mVar2 = this.f20434k;
        mVar2.getClass();
        try {
            if (this.f20437n >= this.f20442s) {
                b(mVar, true);
            }
            s4.h hVar2 = this.f20435l;
            hVar2.getClass();
            int i13 = hVar2.read(bArr, i10, i11);
            if (i13 != -1) {
                long j11 = i13;
                this.f20437n += j11;
                this.f20436m += j11;
                long j12 = this.f20438o;
                if (j12 == -1) {
                    return i13;
                }
                this.f20438o = j12 - j11;
                return i13;
            }
            s4.h hVar3 = this.f20435l;
            if (!(hVar3 == hVar)) {
                j10 = -1;
                long j13 = mVar2.f19449g;
                if (j13 != -1) {
                    i12 = i13;
                    if (this.f20436m < j13) {
                    }
                } else {
                    i12 = i13;
                }
                String str = mVar.f19450h;
                int i14 = c0.f16548a;
                this.f20438o = 0L;
                if (!(hVar3 == this.f20426c)) {
                    return i12;
                }
                i iVar = new i();
                iVar.a(Long.valueOf(this.f20437n), "exo_len");
                ((y) this.f20424a).c(str, iVar);
                return i12;
            }
            i12 = i13;
            j10 = -1;
            long j14 = this.f20438o;
            if (j14 <= 0 && j14 != j10) {
                return i12;
            }
            a();
            b(mVar, false);
            return read(bArr, i10, i11);
        } catch (Throwable th2) {
            if (this.f20435l == hVar || (th2 instanceof a)) {
                this.f20440q = true;
            }
            throw th2;
        }
    }

    @Override // s4.h
    public final void t(f0 f0Var) {
        f0Var.getClass();
        this.f20425b.t(f0Var);
        this.f20427d.t(f0Var);
    }

    @Override // s4.h
    public final Uri w() {
        return this.f20432i;
    }
}
