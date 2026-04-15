package a3;

import android.media.MediaCodec;
import android.os.Build;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import cb.a0;
import cb.d0;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern c(int i10, int i11) {
        return new MediaCodec.CryptoInfo.Pattern(i10, i11);
    }

    public static /* synthetic */ LocaleList e(Locale[] localeArr) {
        return new LocaleList(localeArr);
    }

    public static /* synthetic */ LocaleSpan f(LocaleList localeList) {
        return new LocaleSpan(localeList);
    }

    public static /* synthetic */ void m() {
    }

    public static /* bridge */ /* synthetic */ void u(b3.d dVar, LocaleList localeList) {
        dVar.setTextLocales(localeList);
    }

    public static void v(a0 a0Var) {
        boolean zIsTerminated;
        ExecutorService executorService = a0Var.f3836a;
        if ((Build.VERSION.SDK_INT <= 23 || a0Var != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            a0Var.shutdown();
            boolean z10 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        a0Var.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void w(d0 d0Var) {
        boolean zIsTerminated;
        ExecutorService executorService = d0Var.f3836a;
        if ((Build.VERSION.SDK_INT <= 23 || d0Var != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            d0Var.shutdown();
            boolean z10 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        d0Var.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
