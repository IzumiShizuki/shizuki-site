package a9;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import b0.w1;
import java.nio.MappedByteBuffer;
import u3.x0;
import v4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f247b;

    public /* synthetic */ m(int i10, Object obj) {
        this.f246a = i10;
        this.f247b = obj;
    }

    private final void a() {
        c4.t tVar = (c4.t) this.f247b;
        synchronized (tVar.f3402d) {
            try {
                if (tVar.f3406h == null) {
                    return;
                }
                try {
                    s3.f fVarD = tVar.d();
                    int i10 = fVarD.f19380f;
                    if (i10 == 2) {
                        synchronized (tVar.f3402d) {
                        }
                    }
                    if (i10 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                    }
                    try {
                        int i11 = r3.a.f18745a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        pe.d dVar = tVar.f3401c;
                        Context context = tVar.f3399a;
                        dVar.getClass();
                        s3.f[] fVarArr = {fVarD};
                        n7.e eVar = p3.e.f16532a;
                        a.a.t("TypefaceCompat.createFromFontInfo");
                        try {
                            Typeface typefaceI = p3.e.f16532a.i(context, fVarArr);
                            Trace.endSection();
                            MappedByteBuffer mappedByteBufferX = x0.x(tVar.f3399a, fVarD.f19375a);
                            if (mappedByteBufferX == null || typefaceI == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                w1 w1Var = new w1(typefaceI, gh.g.L(mappedByteBufferX));
                                Trace.endSection();
                                synchronized (tVar.f3402d) {
                                    try {
                                        android.support.v4.media.session.b bVar = tVar.f3406h;
                                        if (bVar != null) {
                                            bVar.O(w1Var);
                                        }
                                    } finally {
                                    }
                                }
                                tVar.b();
                            } finally {
                                int i12 = r3.a.f18745a;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Throwable th3) {
                    synchronized (tVar.f3402d) {
                        try {
                            android.support.v4.media.session.b bVar2 = tVar.f3406h;
                            if (bVar2 != null) {
                                bVar2.N(th3);
                            }
                            tVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    private final void b() {
        g5.f fVar = (g5.f) this.f247b;
        synchronized (fVar.f7363a) {
            try {
                if (fVar.f7375m) {
                    return;
                }
                long j10 = fVar.f7374l - 1;
                fVar.f7374l = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 < 0) {
                    fVar.b(new IllegalStateException());
                } else {
                    fVar.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void c() {
        v4.x0 x0Var = (v4.x0) this.f247b;
        try {
            synchronized (x0Var) {
            }
            try {
                x0Var.f22706a.d(x0Var.f22708c, x0Var.f22709d);
            } finally {
                x0Var.a(true);
            }
        } catch (v4.m e10) {
            p4.c.o("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x019d  */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, ub.h] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, ub.h] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.m.run():void");
    }

    public /* synthetic */ m(c0 c0Var, v4.x0 x0Var) {
        this.f246a = 22;
        this.f247b = x0Var;
    }
}
