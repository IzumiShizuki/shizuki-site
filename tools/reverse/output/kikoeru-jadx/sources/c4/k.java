package c4;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import c7.e1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n7.b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f3373j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile k f3374k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f3375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o.f f3376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f3377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f3378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f3379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f3380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pe.d f3381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f3383i;

    public k(u uVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f3375a = reentrantReadWriteLock;
        this.f3377c = 3;
        j jVar = (j) uVar.f3368b;
        this.f3380f = jVar;
        int i10 = uVar.f3367a;
        this.f3382h = i10;
        this.f3383i = (d) uVar.f3369c;
        this.f3378d = new Handler(Looper.getMainLooper());
        this.f3376b = new o.f(0);
        this.f3381g = new pe.d(16);
        f fVar = new f(this);
        this.f3379e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f3377c = 0;
            } catch (Throwable th2) {
                this.f3375a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                jVar.a(new e(fVar));
            } catch (Throwable th3) {
                f(th3);
            }
        }
    }

    public static k a() {
        k kVar;
        synchronized (f3373j) {
            try {
                kVar = f3374k;
                if (!(kVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return kVar;
    }

    public static boolean d() {
        return f3374k != null;
    }

    public final int b(CharSequence charSequence, int i10) {
        if (!(c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        b0.g(charSequence, "charSequence cannot be null");
        e1 e1Var = this.f3379e.f3365b;
        e1Var.getClass();
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            x[] xVarArr = (x[]) spanned.getSpans(i10, i10 + 1, x.class);
            if (xVarArr.length > 0) {
                return spanned.getSpanStart(xVarArr[0]);
            }
        }
        return ((r) e1Var.O(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new r(i10))).f3391b;
    }

    public final int c() {
        this.f3375a.readLock().lock();
        try {
            return this.f3377c;
        } finally {
            this.f3375a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.f3382h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (c() == 1) {
            return;
        }
        this.f3375a.writeLock().lock();
        try {
            if (this.f3377c == 0) {
                return;
            }
            this.f3377c = 0;
            this.f3375a.writeLock().unlock();
            f fVar = this.f3379e;
            k kVar = fVar.f3364a;
            try {
                kVar.f3380f.a(new e(fVar));
            } catch (Throwable th2) {
                kVar.f(th2);
            }
        } finally {
            this.f3375a.writeLock().unlock();
        }
    }

    public final void f(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f3375a.writeLock().lock();
        try {
            this.f3377c = 2;
            arrayList.addAll(this.f3376b);
            this.f3376b.clear();
            this.f3375a.writeLock().unlock();
            this.f3378d.post(new i(arrayList, this.f3377c, th2));
        } catch (Throwable th3) {
            this.f3375a.writeLock().unlock();
            throw th3;
        }
    }

    public final void g(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        f fVar = this.f3379e;
        fVar.getClass();
        Bundle bundle = editorInfo.extras;
        d4.b bVar = (d4.b) fVar.f3366c.f1395c;
        int iA = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f5473d).getInt(iA + bVar.f5470a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
