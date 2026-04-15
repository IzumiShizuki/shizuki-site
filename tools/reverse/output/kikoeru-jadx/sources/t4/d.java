package t4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p4.c0;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f20408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s4.m f20411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f20412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public File f20413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OutputStream f20414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f20415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f20416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w f20417j;

    public d(b bVar) {
        bVar.getClass();
        this.f20408a = bVar;
        this.f20409b = 5242880L;
        this.f20410c = 20480;
    }

    public final void a() {
        OutputStream outputStream = this.f20414g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            c0.g(this.f20414g);
            this.f20414g = null;
            File file = this.f20413f;
            this.f20413f = null;
            b bVar = this.f20408a;
            long j10 = this.f20415h;
            y yVar = (y) bVar;
            synchronized (yVar) {
                if (file.exists()) {
                    if (j10 == 0) {
                        file.delete();
                        return;
                    }
                    z zVarB = z.b(file, j10, -9223372036854775807L, yVar.f20489c);
                    zVarB.getClass();
                    o oVarV = yVar.f20489c.v(zVarB.f20449a);
                    oVarV.getClass();
                    p4.c.i(oVarV.c(zVarB.f20450b, zVarB.f20451c));
                    long jT = t0.t(oVarV.f20471e);
                    if (jT != -1) {
                        p4.c.i(zVarB.f20450b + zVarB.f20451c <= jT);
                    }
                    if (yVar.f20490d == null) {
                        yVar.b(zVarB);
                        yVar.f20489c.K();
                        yVar.notifyAll();
                        return;
                    }
                    try {
                        yVar.f20490d.e(zVarB.f20451c, zVarB.f20454f, file.getName());
                        yVar.b(zVarB);
                        try {
                            yVar.f20489c.K();
                            yVar.notifyAll();
                            return;
                        } catch (IOException e10) {
                            throw new a(e10);
                        }
                    } catch (IOException e11) {
                        throw new a(e11);
                    }
                }
            }
        } catch (Throwable th2) {
            c0.g(this.f20414g);
            this.f20414g = null;
            File file2 = this.f20413f;
            this.f20413f = null;
            file2.delete();
            throw th2;
        }
    }

    public final void b(s4.m mVar) {
        File fileC;
        long j10 = mVar.f19449g;
        long jMin = j10 != -1 ? Math.min(j10 - this.f20416i, this.f20412e) : -1L;
        b bVar = this.f20408a;
        String str = mVar.f19450h;
        int i10 = c0.f16548a;
        long j11 = mVar.f19448f + this.f20416i;
        y yVar = (y) bVar;
        synchronized (yVar) {
            try {
                yVar.d();
                o oVarV = yVar.f20489c.v(str);
                oVarV.getClass();
                p4.c.i(oVarV.c(j11, jMin));
                if (!yVar.f20487a.exists()) {
                    y.e(yVar.f20487a);
                    yVar.o();
                }
                yVar.f20488b.c(yVar, jMin);
                File file = new File(yVar.f20487a, Integer.toString(yVar.f20492f.nextInt(10)));
                if (!file.exists()) {
                    y.e(file);
                }
                fileC = z.c(file, oVarV.f20467a, j11, System.currentTimeMillis());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f20413f = fileC;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f20413f);
        if (this.f20410c > 0) {
            w wVar = this.f20417j;
            if (wVar == null) {
                this.f20417j = new w(fileOutputStream, this.f20410c);
            } else {
                wVar.b(fileOutputStream);
            }
            this.f20414g = this.f20417j;
        } else {
            this.f20414g = fileOutputStream;
        }
        this.f20415h = 0L;
    }
}
