package p5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f16690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f16691e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f16693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16694c;

    public k(j jVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f16693b = jVar;
        this.f16692a = z10;
    }

    public static synchronized boolean a(Context context) {
        String strEglQueryString;
        int i10;
        try {
            if (!f16691e) {
                int i11 = c0.f16548a;
                if (i11 >= 24 && ((i11 >= 26 || !("samsung".equals(c0.f16550c) || "XT1650".equals(c0.f16551d))) && ((i11 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i10 = strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i10 = 0;
                }
                f16690d = i10;
                f16691e = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f16690d != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f16693b) {
            try {
                if (!this.f16694c) {
                    j jVar = this.f16693b;
                    jVar.f16686b.getClass();
                    jVar.f16686b.sendEmptyMessage(2);
                    this.f16694c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
